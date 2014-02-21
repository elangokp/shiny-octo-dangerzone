<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'utils/class-point.php');
require_once(plugin_dir_path(dirname(__FILE__)).'utils/class-domutil.php');
require_once(plugin_dir_path(dirname(__FILE__)).'views/class-wp-insights-filters.php');

class WP_Insights_Heatmap {
	
	protected $lrid = null;
	
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
	
	protected $WP_Insights_Filters_Instance = null;
	
	public function __construct($lrid, $hmtype, $scrx, $scry, $version) {
		global $wpdb;
		$this->WP_Insights_Filters_Instance = new WP_Insights_Filters();
		$this->lrid = $lrid;
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
		
		if($hmtype == 'mph') {
			$this->createMousePathScriptElements();
		} else {
			$this->createHeatmapScriptElements();
		}
		/* if($hmtype == 'mv') {
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
		} */
		
	}
	
	protected function loadCacheFile() {
		$sql = "SELECT r2.file FROM $this->recordsTable r1
				inner join $this->recordsTable r2 on r1.cleansed_url = r2.cleansed_url and r2.file != '0'
				where r1.id=$this->lrid
				order by r2.id desc
				LIMIT 0,1";
		$relativeCacheFilePath = $this->wp_insights_db_utils->db_query($sql);
		$this->cachedFile = $this->cache_dir.$relativeCacheFilePath[0]['file'];
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
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.hovered as mousepositions",
				"R.id = ".$this->lrid);
	
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
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.hovered as mousepositions",
				"R.id = ".$this->lrid);
	
		$this->constructHeatmapString($records);
	
	}
	
	public function getClickDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.clicked as mousepositions",
				"R.id = ".$this->lrid);
		
		$this->constructHeatmapString($records);
	
	}
	
	public function getLostFocusDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.lost_focus as mousepositions",
				"R.id = ".$this->lrid);
		
		$this->constructHeatmapString($records);
	
	}
	
	public function getExitDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.hovered as mousepositions",
				"R.id = ".$this->lrid);
		
		$this->hoverClickData = "[";
		foreach ($records as $i => $record)
		{
			if($record['mousepositions'] != ""){
				$lastJsonArrayString = end(explode("|~|",$record['mousepositions']));
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
		
		//error_log($this->hoverClickData);
		$wp_admin_url = admin_url( 'admin-ajax.php' );
		
		$cdata = 'var heatmapOptions = {
						dataURI: "'.$wp_admin_url.'",
						action: "wpimouseeventdata",
						lrid: '.$this->lrid.',
						dt: "'.$this->hmtype.'",
						fd: "'.$this->WP_Insights_Filters_Instance->fromDate.'",
						td: "'.$this->WP_Insights_Filters_Instance->tillDate.'",
						recordsPerPage: 100,
						heatmapCompleted: false
						};
							
					var currentPageNo = 1;
					var heatmap = null;					
					
					function loadIntoHeatmap(data) {
						console.log("Into loadIntoHeatmap");
						jQuery.each(data, function (index, value) {
																try {
																	//index is the css path here
																	//console.log(index + " " + value);
																	var element = jQuery( document ).find(index);
																	//console.log(jQuery(element));
																	//console.log(element.length > 0);
																	//console.log(jQuery(element).length > 0);
																	if(element.length > 0) {
																		var eX = jQuery(element).first().offset().left;
																		var eY = jQuery(element).first().offset().top
																		var eW = jQuery(element).first().width();
																		var eH = jQuery(element).first().height();
																		for (var i = 0; i < value.rX.length; i++) {
																			
																		    var xdiscrepancy = eW/value.w[i];
																			//console.log(eW + " " + value.w[i] + " " + xdiscrepancy);
																			var ydiscrepancy = eH/value.h[i];
																			//console.log(eH + " " + value.h[i] + " " + ydiscrepancy);
																			var x = eX + (value.rX[i] * xdiscrepancy);
																			var y = eY + (value.rY[i] * ydiscrepancy);
																			heatmap.store.addDataPoint(Math.round(x), Math.round(y), 1);
																		}
																		
																	}
																	
																} catch (err) {
																	console.log(err.message);	
																	//console.log(value.cp);					
																}
														});
														if(data.length > 0) {
															console.log("Into data length greater than 0");
															currentPageNo = currentPageNo+1;
															setTimeout(getData(),0);
														} else {
															console.log("Into data length less than or equal to 0");
															heatmapOptions.heatmapCompleted = true;	
															console.log(heatmap.store.exportDataSet());
															
														}
					}
					
					function getData() {
						jQuery.getJSON(heatmapOptions.dataURI, {
												action: heatmapOptions.action,
												lrid: heatmapOptions.lrid,
												dt: heatmapOptions.dt,
												fd: heatmapOptions.fd,
												td: heatmapOptions.td,
												cpn: currentPageNo,
												rpp: heatmapOptions.recordsPerPage
												}).done(function(data) {
															setTimeout(loadIntoHeatmap(data),0);
													});	
					}
					
					jQuery(document).ready(function(){
										heatmap = h337.create({"element":document.getElementsByTagName("body")[0], "radius":10, "visible":true});
										setTimeout(getData(),0);				
		});';
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

		$wp_admin_url = admin_url( 'admin-ajax.php' );
	
	
		$cdata = 'var heatmapOptions = {
						dataURI: "'.$wp_admin_url.'",
						action: "wpimouseeventdata",
						lrid: '.$this->lrid.',
						dt: "'.$this->hmtype.'",
						fd: "'.$this->WP_Insights_Filters_Instance->fromDate.'",
						td: "'.$this->WP_Insights_Filters_Instance->tillDate.'",
						recordsPerPage: 100,
						heatmapCompleted: false
						};
						
					
					
					var currentPageNo = 1;
					var stage = null;		
					var layer = null;
					
					function loadIntoHeatmap(data) {
						jQuery.each(data, function (recordIndex, singleRecordHoverClickObjects) {
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
														if(data.length > 0) {
															currentPageNo = currentPageNo+1;
															setTimeout(getData(),0);
														} else {
															heatmapOptions.heatmapCompleted = true;	
														}
					}
					
					function getData() {
						jQuery.getJSON(heatmapOptions.dataURI, {
												action: heatmapOptions.action,
												lrid: heatmapOptions.lrid,
												dt: heatmapOptions.dt,
												fd: heatmapOptions.fd,
												td: heatmapOptions.td,
												cpn: currentPageNo,
												rpp: heatmapOptions.recordsPerPage
												}).done(function(data) {
															setTimeout(loadIntoHeatmap(data),0);
													});	
					}
					
					jQuery(document).ready(function(){
										stage = new Kinetic.Stage({
												container: "kineticContainer",
												width: jQuery( document ).width(),
												height: jQuery( document ).height(),
												opacity: 0.5,
												visible: true
											  });
										layer = new Kinetic.Layer();
										setTimeout(getData(),0);				
		});';
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