<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'utils/class-domutil.php');

class WP_Insights_Replayer {
	
	protected $api = null;
	
	protected $cache_dir = null;
	
	protected $swfpath = null;
	
	protected $swfobjectpath = null;
	
	protected $auxjspath = null;
	
	protected $smtreplayjspath = null;
	
	protected $selectorjspath = null;
	
	protected $json2jspath = null;
	
	protected $wzjsgraphicsjspath = null;
	
	protected $wp_insights_db_utils = null;
	
	protected $cachedFile = null;
	
	protected $doc = null;
	
	protected $js_user_data = null;
	
	protected $js_swfobject = null;
	
	protected $js_swf = null;
	
	protected $css_swf = null;
	
	protected $js_graphics = null;
	
	protected $js_json = null;
	
	protected $js_options = null;
	
	protected $js_replay = null;
	
	protected $replayPage = null;
	
	protected $recordId = null;
	
	protected $record = null;
	
	protected $trailRecords = null;
	
	/** User click path data: Associative Array with keys "id", "udate", "sess_time" and "url" */
	protected $visits = null;
	
	protected $JSON = null;
	
	protected $realTime = null;
	
	protected $dirVect = null;
	
	protected $version = null;
	
	public function __construct($id, $api, $realTime, $dirVect, $version) {
		global $wpdb;
		$this->version = $version;
		$this->api = $api;
		$this->realTime = $realTime;
		$this->dirVect = $dirVect;
		$this->cache_dir = dirname(dirname(plugin_dir_path(dirname(__FILE__))))."/wpicache/";
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->swfpath = plugins_url('swf/', dirname(__FILE__));
		$this->swfobjectpath = plugins_url('js/swfobject.js?v='.$this->version, dirname(__FILE__));
		$this->auxjspath = plugins_url('js/dev/smt-aux.js?v='.$this->version, dirname(__FILE__));
		$this->smtreplayjspath = plugins_url('js/dev/smt-replay.js?v='.$this->version, dirname(__FILE__));
		$this->selectorjspath = plugins_url('js/dev/selector.js?v='.$this->version, dirname(__FILE__));
		$this->json2jspath = plugins_url('js/dev/json2.js?v='.$this->version, dirname(__FILE__));
		$this->wzjsgraphicsjspath = plugins_url('js/dev/wz_jsgraphics.js?v='.$this->version, dirname(__FILE__));
		$this->getDetailsByRecordingId($id);
		$this->loadCacheFile();
		$this->getUserTrailsByClientID();
		$this->createUserDataScript();
		if($api == "swf") {
			$this->createSWFScripts();
		}
		if($api == "js") {
			$this->createJSAPIScripts();
		}
		$this->insertScriptElements();
	}
	
	protected function getDetailsByRecordingId($id){
		$this->recordId = $id;
		$recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$cacheTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
		$record = $this->wp_insights_db_utils->db_select(
				$recordsTable,
				$recordsTable.".*",
				$recordsTable.".id = '".$this->recordId."'");
		
		$this->record = $record;
			
		$clientId       = $record['client_id'];
		$timestamp      = WP_Insights_Utils::mask_client($clientId).'\n'.date("h:i A", strtotime($record['sess_date']));
		$htmlFile       = $record['file'];
		$url            = $record['raw_url'];
		$viewportWidth  = (int) $record['vp_width'];
		$viewportHeight = (int) $record['vp_height'];
		$fps            = (int) $record['fps'];
		$clicks         = $record['clicks'];
		$coordsX        = $record['coords_x'];
		$coordsY        = $record['coords_y'];
		$hovered        = $record['hovered'];
		$clicked        = $record['clicked'];
		
		$clicks = ltrim($clicks, ',');
		$coordsX = ltrim($coordsX, ',');
		$coordsY = ltrim($coordsY, ',');
		
		// build JavaScript object
		$this->JSON[] = '{"xcoords": ['.$coordsX.'], "ycoords": ['.$coordsY.'], "clicks": ['.$clicks.'], "timestamp": "'.$timestamp.'", "wprev": '.$record['vp_width'].', "hprev": '.$record['vp_height'].'}';
	}
	
	protected function loadCacheFile() {
		$this->cachedFile = $this->cache_dir.$this->record["file"];
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
	
	protected function getUserTrailsByClientID()
	{
		$this->trailRecords = $this->wp_insights_db_utils->db_select_all(
				$this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS,
				"id,raw_url,sess_date,DATE_FORMAT(sess_date,'%W %D %M %Y (%H:%i:%s)') as udate,sess_time",
				"client_id = '".$this->record['client_id']."' ORDER BY id ASC");
	
		$count = 0;
		$prevtrailRecord = null;
		foreach ($this->trailRecords as $trailRecord)
		{
			// split browsing sessions by access date
			if ($prevtrailRecord && strtotime($trailRecord['sess_date']) - strtotime($prevtrailRecord['sess_date']) > 1200) {
				$count++;
			}
			// this $cache query is really needed only on the 'analyze' module
			/* $cache = $this->wp_insights_db_utils->db_select(
					$this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE, 
					"url", 
					"id = '".$trailRecord['cache_id']."'"); */
			// to track the REAL clickpath we need both the id AND the trail group of each record
			$this->visits[] = array(
					"id"    => $trailRecord['id'],
					"date"  => $trailRecord['udate'],
					"time"  => $trailRecord['sess_time'],
					"url"   => $trailRecord['raw_url'],
					"trail" => $count
			);
			// update
			$prevtrailRecord = $trailRecord;
		}
	}
	
	protected function createUserDataScript() {
		// there might be issues with IE and SWF here ($json must be escaped via JS)
		$json = json_encode('['.implode(",", $this->JSON).']');
		$trails = array();
		foreach ($this->visits as $visit) {
			$trails[] = $visit["id"];
		}
		// make it FlashVar friendly
		$trails = implode(",", $trails);
		// user object for tracking data
		$cdata_user = '
			//<![CDATA[
			// (smt) user data object
			var smt2data = {
			  fps: '.(int) $this->record['fps'].',
			  users: escape('.$json.'),
			  trails: ['.$trails.'],
			  currtrail: '.$this->recordId.',
			  trailurl: "'.WP_Insights_Utils::url_get_current().'"
			};
			//]]>
			';
		// create user data script
		$this->js_user_data = $this->doc->createInlineScript($cdata_user);
	}
	
	protected function  createSWFScripts() {
		// create SWFObject script
		$this->js_swfobject = $this->doc->createExternalScript($this->swfobjectpath);
		// (WP Insights) tracking layer identifier
		$wpiID = "WPInsightsCanvas";
		// write Flash object in (smt) tracking layer
		$cdata_swf = '
			//<![CDATA[
			(function(){
					
			    var att = { scaleMode: "noscale" },                         // SWF attributes
			        par = { allowFullScreen: true, wmode: "transparent" },  // SWF parameters
			        aux = window.smt2fn,                                    // (smt) aux functions
			        dat = window.smt2data;                                  // (smt) user data
					
			    aux.onDOMload(function(){
			      // replay mouse track over Flash objects
			      aux.allowTrackingOnFlashObjects(document);
			    });
			    aux.addEvent(window, "load", function(){
			      // compute the page size
			      var doc = aux.getPageSize();
			      dat.hpage = doc.height;
			      dat.wpage = doc.width;
			      // compute viewport size
			      var win = aux.getWindowSize();
			      dat.wcurr = win.width;
			      dat.hcurr = win.height;
			      // avoid IE bug (ActiveX player): use computed page size instead of the ones reported by SWF stage
			      swfobject.embedSWF("'.$this->swfpath.'tracking.swf?'.time().'", "'.$wpiID.'", doc.width, doc.height, "10.0.0", "'.$this->swfpath.'expressInstall.swf", dat, par, att);
			      // render Tracking layer on top
			      var smtId = document.getElementById("'.$wpiID.'");
			      smtId.style.zIndex = aux.getNextHighestDepth() + 1;
			      //smtId.style.zIndex = 999;
			    });
			';
		$cdata_swf .= 'aux.addEvent(window, "resize", aux.reloadPage);';
					
		$cdata_swf .= '
			})();
			//]]>
			';
		
		// create user data script
		$this->js_swf = $this->doc->createInlineScript($cdata_swf);
		// apply styles to (smt) tracking layer (huge font size to warn non-javascript browsers)
		$this->css_swf = $this->doc->createInlineStyleSheet("#".$wpiID." { margin:0; padding:0; position:absolute; top:0; left:0; overflow:hidden; outline:none; font-size:200%; color:#AAAAAA; font-style:italic; }");
		
		// create (wpi) layer
		$wpiDiv = $this->doc->createDiv($wpiID, "Loading WP Insights Canvas...");
		$body = $this->doc->getElementsByTagName('body');
		foreach ($body as $b) {
			$b->appendChild($wpiDiv);
		}
	}
	
	protected function createJSAPIScripts() {
		// create jsGraphics script
		$this->js_graphics = $this->doc->createExternalScript($this->wzjsgraphicsjspath);
		// load JSON parser
		$this->js_json = $this->doc->createExternalScript($this->json2jspath);
		
		// retrieve JS info from DB
		$optionsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_OPTIONS;
		$jsOptions = $this->wp_insights_db_utils->db_select_all($optionsTable, "*", "type='js_color' OR type='js_prop'");
		
		// loop
		foreach ($jsOptions as $o)
		{
				$prop = $o['name'];
				$val = $o['value'];

				if (!isset($val)) { continue; }

				if ($o['type'] == "js_color") {
					// check 6 digits for colors
					while (strlen($val) < 6) {
						$val .= "0";
					}
					// finally add the hex flag
					$val = '"#'.$val.'"';
				}
				// display JS object properties
				$customprop[] = "\t" . $prop . ': ' . $val;				
			
		}
		
		if(isset($this->realTime)) {
			$customprop[] = "\t" ."realTime" . ': ' . $this->realTime;
		}
		
		if(isset($this->dirVect)) {
			$customprop[] = "\t" . "dirVect" . ': ' . $this->dirVect;
		}
		$cdata_options = '
			//<![CDATA[
			smt2.replay({
			  '.implode(",".PHP_EOL, $customprop).'
			});
			';
					
		//if (db_option(TBL_PREFIX.TBL_CMS, "refreshOnResize")) {
			$cdata_options .= '
			    (function(){
			      smt2fn.addEvent(window, "resize", smt2fn.reloadPage);
			    })();
			  ';
		//}
					
		$cdata_options .= '
						//]]>
						';
		// create user data script
		$this->js_options = $this->doc->createInlineScript($cdata_options);
		// create replay script (and insert it before $js_options)
		$this->js_replay = $this->doc->createExternalScript($this->smtreplayjspath);
	}
	
	
	protected function insertScriptElements() {
		// a BASE element is needed to link correctly CSS, scripts, etc.
		$base = $this->doc->createElement('base');
		$base->setAttribute('href', WP_Insights_Utils::url_get_base($this->record['raw_url']));
		$ini_comm = $this->doc->createComment(" begin wpi tracking code ");
		$end_comm = $this->doc->createComment(" end wpi tracking code ");
		$api_comm = $this->doc->createComment(" load wpi drawing API ");
		// point to (smt) aux functions
		$js_aux = $this->doc->createExternalScript($this->auxjspath);
		// and peppy selector library
		$js_selector = $this->doc->createExternalScript($this->selectorjspath);
		// rebuild parsed page
		$head = $this->doc->getElementsByTagName('head');
		foreach ($head as $h) {
			// loading order is crucial!
			$h->insertBefore($base, $h->firstChild);
			$h->appendChild($ini_comm);
			$h->appendChild($js_aux);
			$h->appendChild($this->js_user_data);
			$h->appendChild($js_selector);
			//if (isset($js_widget)) $h->appendChild($js_widget);
			$h->appendChild($api_comm);
		
			 if ($this->api == "js") {
				$h->appendChild($this->js_graphics);
				$h->appendChild($this->js_json);
			} else if ($this->api == "swf") {
				$h->appendChild($this->js_swfobject);
				$h->appendChild($this->css_swf);
			}
			$h->appendChild($end_comm);
		}
		// append tracking script at the end of the page body
		$body = $this->doc->getElementsByTagName('body');
		foreach ($body as $b) {
			if ($this->api == "js") {
				$b->appendChild($this->js_replay);
				$b->appendChild($this->js_options);
			} else if ($this->api == "swf") { 
				$b->appendChild($this->js_swf);
			}
		}
	}

	public function getReplayPage() {
		// save the parsed page
		$this->replayPage = $this->doc->saveHTML();
		// and return it
		return $this->replayPage;
	}

}