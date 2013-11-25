<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'utils/class-point.php');
require_once(plugin_dir_path(dirname(__FILE__)).'utils/class-domutil.php');

class WP_Insights_Heatmap {
	
	protected $pid = null;
	
	protected $hmtype = null;
	
	protected $scrx = null;
	
	protected $scry = null;
	
	protected $version = null;
	
	protected $doc = null;
	
	protected $wp_insights_db_utils = null;
	
	protected $recordsTable = null;
	
	protected $cacheTable = null;
	
	protected $heatmapJsPath = null;
	
	protected $heatmapJsElement = null;
	
	protected $heatMapDataString = null;
	
	protected $pointsFrequencyArray = null;
	
	protected $cache_dir = null;
	
	protected $cachedFile = null;
	
	protected $hoverClickData = "";
	
	public function __construct($pid, $hmtype, $scrx, $scry, $version) {
		global $wpdb;
		$this->pid = $pid;
		$this->hmtype = $hmtype;
		$this->scrx = $scrx;
		$this->scry = $scry;
		$this->cache_dir = dirname(dirname(plugin_dir_path(dirname(__FILE__))))."/wpicache/";
		$this->version = $version;
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$this->cacheTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
		$this->heatmapJsPath = plugins_url('js/dev/heatmap.js?v='.$this->version, dirname(__FILE__));
		$this->loadCacheFile();
		if($hmtype == 'mv') {
			$this->getMouseMovementDataByPage();
			$this->createHeatmapScriptElements();
		} else if($hmtype == 'click') {
			$this->getClickDataByPage();
			$this->createHeatmapScriptElements();
		} else if($hmtype == 'exit') {
			$this->getExitDataByPage();
			$this->createHeatmapScriptElements();
		} else if($hmtype == 'mp') {
			$this->getMouseMovementDataByUserByPage();
			$this->createMousePathScriptElements();
		} else if($hmtype == 'lf') {
			$this->getLostFocusDataByPage();
			$this->createHeatmapScriptElements();
		}
		
	}
	
	protected function loadCacheFile() {
		$cacheRecord = $this->wp_insights_db_utils->db_select($this->cacheTable, "file", "id=".$this->pid);
		$this->cachedFile = $this->cache_dir.$cacheRecord['file'];
		error_log($this->cachedFile);
		$this->doc = new DOMUtil();
		if (!is_file($this->cachedFile)) {
			$this->cachedFile = WP_Insights_Utils::error_webpage('<h1>Page not found on cache!</h1><p>That\'s because either it was deleted from cache or the request could not be processed.</p>');
			// hide warnings when parsing non valid (X)HTML pages
			@$this->doc->loadHTML($this->cachedFile);
		} else {
			// load (UTF-8 encoded) log
			@$this->doc->loadHTMLFile( utf8_decode($this->cachedFile) );
		}
	}
	
	public function getMouseMovementDataByUserByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.hovered",
				"C2.id = ".$this->pid);
	
		$this->hoverClickData = "[";
		foreach ($records as $i => $record)
		{
			$eachUserhoverClickData = "";			
			foreach(explode("|~|",$record['hovered']) as $j => $jsonArrayString){
				if($eachUserhoverClickData != "" && $jsonArrayString != "") {
					$jsonArrayString = ltrim($jsonArrayString, "[");
					$eachUserhoverClickData = rtrim($eachUserhoverClickData, "]");
					$eachUserhoverClickData = $eachUserhoverClickData.",";
				}
				$eachUserhoverClickData = $eachUserhoverClickData.$jsonArrayString;
			}
			if($eachUserhoverClickData != "") {
				$this->hoverClickData = $this->hoverClickData.$eachUserhoverClickData;
				$this->hoverClickData = $this->hoverClickData.",";
			}			
		}
		$this->hoverClickData = rtrim($this->hoverClickData, ",");
		$this->hoverClickData = $this->hoverClickData."]";
	}
	
	public function getMouseMovementDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.id as id,R.hovered as mousepositions",
				"C2.id = ".$this->pid);
	
		$this->constructHeatmapString($records);
	
	}
	
	public function getClickDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.id as id,R.clicked as mousepositions",
				"C2.id = ".$this->pid);
		
		$this->constructHeatmapString($records);
	
	}
	
	public function getLostFocusDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.id as id, R.lost_focus as mousepositions",
				"C2.id = ".$this->pid);
		
		$this->constructHeatmapString($records);
	
	}
	
	public function getExitDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.hovered",
				"C2.id = ".$this->pid);
		$this->hoverClickData = "[";
		foreach ($records as $i => $record)
		{
			if($record['hovered'] != ""){
				$lastJsonArrayString = end(explode("|~|",$record['hovered']));
				//error_log(print_r($lastJsonArrayString, true));
				if($lastJsonArrayString != "") {					
					if(strpos($lastJsonArrayString, "},{") !== false){
						$exitPointJson = end(explode("},{",$lastJsonArrayString));
						//error_log(print_r($exitPointJson, true));
						$exitPointJson = "{".rtrim($exitPointJson, "]");
						//error_log(print_r($exitPointJson, true));
						$this->hoverClickData = $this->hoverClickData.$exitPointJson;
						$this->hoverClickData = $this->hoverClickData.",";
					} else {
						$exitPointJson = rtrim(ltrim($lastJsonArrayString, "["), "]");
						//error_log(print_r($exitPointJson, true));
						$this->hoverClickData = $this->hoverClickData.$exitPointJson;
						$this->hoverClickData = $this->hoverClickData.",";
					}
				}
			}
			
		}
		$this->hoverClickData = rtrim($this->hoverClickData, ",");
		$this->hoverClickData = $this->hoverClickData."]";
	}
	
	protected function constructHeatmapString($records) {
		$this->hoverClickData="[";
		foreach ($records as $i => $record)
		{
			error_log($record['id'] . "=>" . $record['mousepositions']);
			foreach(explode("|~|",$record['mousepositions']) as $j => $jsonArrayString){
				error_log("   " . $j . " => " . $jsonArrayString);
				if($this->hoverClickData != "" && $jsonArrayString != "") {
					$jsonArrayString = ltrim($jsonArrayString, "[");
					$this->hoverClickData = rtrim($this->hoverClickData, "]");
					if(strlen($this->hoverClickData)>1){
						$this->hoverClickData = $this->hoverClickData.",";
					}
					$this->hoverClickData = $this->hoverClickData.$jsonArrayString;
				}
		
			}
		}
	}
	
	/* public function getMouseMovementDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.coords_x,R.coords_y,R.vp_width,R.vp_height,R.scr_width,R.scr_height,R.hovered",
				"C2.id = ".$this->pid);
		
		$arrayOfPointsArray = array();
		
		foreach ($records as $i => $record)
		{
			foreach(explode("|~|",$record['hovered']) as $j => $jsonArrayString){
				if($this->hoveredData != "") {
					$jsonArrayString = ltrim($jsonArrayString, "[");
					$this->hoveredData = rtrim($this->hoveredData, "]");
					$this->hoveredData .= ",";
				}
				$this->hoveredData .= $jsonArrayString;
			}
			
			$Xdiscrepancy = $this->scrx/$record['scr_width'];
			$Ydiscrepancy = $this->scry/$record['scr_height'];
			$cX = explode(",", $record['coords_x']);
			$cY = explode(",", $record['coords_y']);
			$correctedX = array();
			$correctedY = array();
			foreach ($cX as $acXValue) {
				$correctedX[] = $acXValue * $Xdiscrepancy;
			}
			foreach ($cY as $acYValue) {
				$correctedY[] = $acYValue * $Ydiscrepancy;
			}
			unset($cX);
			unset($cY);
			$arrayOfPointsArray[] = array_unique(WP_Insights_Utils::convert_points($correctedX,$correctedY,false,true));
			//$arrayOfPointsArray = array_unique($arrayOfPointsArray);
		}
		
		$allPointsArray = WP_Insights_Utils::array_flatten($arrayOfPointsArray);
		$this->pointsFrequencyArray = array_count_values($allPointsArray);
		unset($this->pointsFrequencyArray['0,0']);
		//echo print_r($pointsFrequencyArray,true);
		//echo max($pointsFrequencyArray);
	
		// build JavaScript object
		//$this->JSON[] = '{"xcoords": ['.$coordsX.'], "ycoords": ['.$coordsY.'], "clicks": ['.$clicks.'], "timestamp": "'.$timestamp.'", "wprev": '.$record['vp_width'].', "hprev": '.$record['vp_height'].'}';
	} */
	
	/* public function getExitDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.coords_x,R.coords_y,R.vp_width,R.vp_height,R.scr_width,R.scr_height",
				"C2.id = ".$this->pid);
	
		$arrayOfExitPoints = array();
	
	
		foreach ($records as $i => $record)
		{
			$Xdiscrepancy = $this->scrx/$record['scr_width'];
			$Ydiscrepancy = $this->scry/$record['scr_height'];
			$cX = explode(",", $record['coords_x']);
			$cY = explode(",", $record['coords_y']);
			$no_of_coords_cx = count($cX);
			$no_of_coords_cy = count($cY);
			//error_log("X(".$no_of_coords_cx."):".$cX[$no_of_coords_cx-1].", Y(".$no_of_coords_cy."):".$cY[$no_of_coords_cy-1]);
			//$exitX = !empty($cX[$no_of_coords_cx-1]) ? $cX[ $no_of_coords_cx - 1 ] : $cX[ $no_of_coords_cx - 2 ];
			//$exitY = !empty($cY[$no_of_coords_cy-1]) ? $cY[ $no_of_coords_cy - 1 ] : $cX[ $no_of_coords_cy - 2 ];
			$exitX = $cX[ $no_of_coords_cx - 1 ];
			$exitY = $cY[ $no_of_coords_cy - 1 ];
			$exitX = $exitX * $Xdiscrepancy;
			$exitY = $exitY * $Ydiscrepancy;
			$arrayOfExitPoints[] = round($exitX,-1).','.round($exitY,-1);
			//$arrayOfPointsArray = array_unique($arrayOfPointsArray);
		}
	
		//$allPointsArray = WP_Insights_Utils::array_flatten($arrayOfPointsArray);
		$this->pointsFrequencyArray = array_count_values($arrayOfExitPoints);
		unset($this->pointsFrequencyArray['0,0']);
		//echo print_r($pointsFrequencyArray,true);
		//echo max($pointsFrequencyArray);
	
		// build JavaScript object
		//$this->JSON[] = '{"xcoords": ['.$coordsX.'], "ycoords": ['.$coordsY.'], "clicks": ['.$clicks.'], "timestamp": "'.$timestamp.'", "wprev": '.$record['vp_width'].', "hprev": '.$record['vp_height'].'}';
	} */
	
	/* public function getClickDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"R.coords_x,R.coords_y,R.clicks,R.vp_width,R.vp_height,R.scr_width,R.scr_height",
				"C2.id = ".$this->pid);
	
		$arrayOfPointsArray = array();
	
	
		foreach ($records as $i => $record)
		{
			$Xdiscrepancy = $this->scrx/$record['scr_width'];
			$Ydiscrepancy = $this->scry/$record['scr_height'];
			$clickCoords = WP_Insights_Utils::get_click_coordinates($record['coords_x'], $record['coords_y'], $record['clicks']);
			$correctedX = array();
			$correctedY = array();
			foreach ($clickCoords['x'] as $acXValue) {
				$correctedX[] = $acXValue * $Xdiscrepancy;
			}
			foreach ($clickCoords['y'] as $acYValue) {
				$correctedY[] = $acYValue * $Ydiscrepancy;
			}
			$arrayOfPointsArray[] = array_unique(WP_Insights_Utils::convert_points($correctedX,$correctedY,false,true));
			//$arrayOfPointsArray = array_unique($arrayOfPointsArray);
		}
	
		$allPointsArray = WP_Insights_Utils::array_flatten($arrayOfPointsArray);
		$this->pointsFrequencyArray = array_count_values($allPointsArray);
		unset($this->pointsFrequencyArray['0,0']);
		//echo print_r($pointsFrequencyArray,true);
		//echo max($pointsFrequencyArray);
	
		// build JavaScript object
		//$this->JSON[] = '{"xcoords": ['.$coordsX.'], "ycoords": ['.$coordsY.'], "clicks": ['.$clicks.'], "timestamp": "'.$timestamp.'", "wprev": '.$record['vp_width'].', "hprev": '.$record['vp_height'].'}';
	} */
	
	/* protected function constructHeatmapData() {
		$no_of_points = count($this->pointsFrequencyArray);
		$i = 1;
		$this->heatMapDataString = '{"max":'.max($this->pointsFrequencyArray).",";
		$this->heatMapDataString .= '"data":[';
		foreach ($this->pointsFrequencyArray as $pointString => $count) {
			$aPointAsArray = explode(",", $pointString);
			$this->heatMapDataString .= '{"x":'.$aPointAsArray[0].',"y":'.$aPointAsArray[1].',"count":'.$count.'}';
			if($i<$no_of_points) {
				$this->heatMapDataString .= ',';
			}
			$i = $i + 1;
		}
		$this->heatMapDataString .= ']}';
	} */
	
	protected function createHeatmapScriptElements() {
		$this->heatmapJsElement = $this->doc->createExternalScript($this->heatmapJsPath);
		$this->jqjselement = $this->doc->createExternalScript("//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js");
		/*$cdata = 'window.onload = function(){
			var xx = h337.create({"element":document.getElementsByTagName("body")[0], "radius":10, "visible":true});
			xx.store.setDataSet('.$this->heatMapDataString.');	
		};';*/
		
		error_log($this->hoverClickData);
		
		
		$cdata = 'window.onload = function(){
			var heatmap = h337.create({"element":document.getElementsByTagName("body")[0], "radius":10, "visible":true});
			
			var hoverClickObjects = '.$this->hoverClickData.';
			jQuery.each(hoverClickObjects, function (index, value) {
					try {
						//console.log(value.cp + " " + value.w + " " + value.h);
						var element = jQuery( document ).find(value.cp);
						if(typeof element != undefined) {
							var xdiscrepancy = jQuery(element).width()/value.w;
							//console.log(jQuery(element).width() + " " + value.w + " " + xdiscrepancy);
							var ydiscrepancy = jQuery(element).height()/value.h;
							//console.log(jQuery(element).height() + " " + value.h + " " + ydiscrepancy);
							//xdiscrepancy = 1;
							//ydiscrepancy = 1;
							var x = jQuery(element).offset().left + (value.rX * xdiscrepancy);
							var y = jQuery(element).offset().top + (value.rY * ydiscrepancy);
						} else {
							var x = value.pX;
							var y = value.pY;
						}
						
						heatmap.store.addDataPoint(Math.round(x), Math.round(y), 1);
					} catch (err) {
						console.log(err.message);	
						//console.log(value.csspath);					
					}
		    });
		};';
		$this->invokeheatmapJsElement = $this->doc->createInlineScript($cdata);
		$heads = $this->doc->getElementsByTagName("head");
		foreach($heads as $head) {
			$head->appendChild($this->heatmapJsElement);
			//$head->appendChild($this->jqjselement);
		}		
		$bodies = $this->doc->getElementsByTagName("body");
		foreach($bodies as $body) {
			$body->appendChild($this->invokeheatmapJsElement);
		}
	}
	
	protected function createMousePathScriptElements() {
		$this->heatmapJsElement = $this->doc->createExternalScript($this->heatmapJsPath);
		//$jqjselement = $this->doc->createExternalScript("//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js");
		$kineticjselement = $this->doc->createExternalScript("//d3lp1msu2r81bx.cloudfront.net/kjs/js/lib/kinetic-v4.7.2.min.js");
		$containerDiv = $this->doc->createElement("div");
		$containerDiv->setAttribute("id", "kineticContainer");
		$style = "width:100%; height:100%;z-index:10000;top:0;left:0;position:absolute;";
		$containerDiv->setAttribute("style", $style);
		/*$cdata = 'window.onload = function(){
		 var xx = h337.create({"element":document.getElementsByTagName("body")[0], "radius":10, "visible":true});
		xx.store.setDataSet('.$this->heatMapDataString.');
		};';*/
	
	
		$cdata = 'window.onload = function(){
			
			var stage = new Kinetic.Stage({
					        container: "kineticContainer",
					        width: jQuery( document ).width(),
					        height: jQuery( document ).height(),
							opacity: 0.5,
				visible: true
					      });
			var layer = new Kinetic.Layer();
			var hoverClickObjects = '.$this->hoverClickData.';
			jQuery.each(hoverClickObjects, function (recordIndex, singleRecordHoverClickObjects) {
					try {
						var singleRecordMousepathPoints = new Array();
						jQuery.each(singleRecordHoverClickObjects, function (index, value) {
							try {
								//console.log(value.cp + " " + value.w + " " + value.h);
								var element = jQuery( document ).find(value.cp);
								var xdiscrepancy = jQuery(element).width()/value.w;
								//console.log(jQuery(element).width() + " " + value.w + " " + xdiscrepancy);
								var ydiscrepancy = jQuery(element).height()/value.h;
								//console.log(jQuery(element).height() + " " + value.h + " " + ydiscrepancy);
								//xdiscrepancy = 1;
								//ydiscrepancy = 1;
								var x = jQuery(element).offset().left + (value.rX * xdiscrepancy);
								var y = jQuery(element).offset().top + (value.rY * ydiscrepancy);
								singleRecordMousepathPoints.push(Math.round(x));
								singleRecordMousepathPoints.push(Math.round(y));
								var mousePathLine = new Kinetic.Line({
										        points: singleRecordMousepathPoints,
										        strokeWidth: 2,
												lineJoin: "round",
												lineCap: "round"
										      });
								//var randColorR = Math.random() * 255;
								mousePathLine.setStrokeRGB({
											r: Math.random() * 255,
											g: Math.random() * 255,
											b: Math.random() * 255
											});
								layer.add(mousePathLine);
							} catch(err1) {
								console.log(err1.message);
							}
						});
					} catch (err2) {
						console.log(err2.message);
					}
		    });
			stage.add(layer);
		};';
		$drawMousePathsJsElement = $this->doc->createInlineScript($cdata);
		$heads = $this->doc->getElementsByTagName("head");
		foreach($heads as $head) {
			//$head->appendChild($this->heatmapJsElement);
			$head->appendChild($kineticjselement);
		}
		$bodies = $this->doc->getElementsByTagName("body");
		foreach($bodies as $body) {
			$body->appendChild($drawMousePathsJsElement);
			$body->appendChild($containerDiv);
		}
	}
	
	public function getHeatmapPage() {
		// save the parsed page
		$this->heatmapPage = $this->doc->saveHTML();
		// and return it
		return $this->heatmapPage;
	}
	
	
}