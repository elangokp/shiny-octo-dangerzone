<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'utils/class-domutil.php');

class WP_Insights_Replayer_Beta {
	
	protected $recording_id = null;
	
	protected $record = null;
	
	protected $hovered = null;
	
	protected $clicked = null;
	
	protected $lostFocus = null;
	
	protected $scrolls = null;
	
	protected $cache_dir = null;
	
	protected $viewPortWidth = null;
	
	protected $viewPortHeight = null;
	
	protected $viewports = null;
	
	protected $cachedFilePath = null;
	
	protected $doc = null;
	
	protected $js_user_data = null;
	
	protected $js_replayer_path = null;
	
	protected $js_create_path = null;
	
	protected $image_cursor_path = null;
	
	protected $image_click_path = null;
	
	protected $wp_insights_db_utils = null;
	
	public function __construct($recording_id) {
		global $wpdb;
		$this->recording_id = $recording_id;
		$WP_Insights_instance = WP_Insights::get_instance();
		$this->cache_dir = $WP_Insights_instance->get_cache_dir();
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->js_replayer_path = plugins_url('js/dev/replayer.js?v='.WP_Insights::VERSION, dirname(__FILE__));
		$this->js_create_path = "http://code.createjs.com/createjs-2013.12.12.min.js";
		$this->image_cursor_path = plugins_url('assets/cursor.png?v='.WP_Insights::VERSION, dirname(__FILE__));
		$this->image_click_path = plugins_url('assets/click.png?v='.WP_Insights::VERSION, dirname(__FILE__));
		//$this->getDetailsByRecordingId();
		//$this->loadCacheFile();
	}
	
	protected function getDetailsByRecordingId(){
		$recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$cacheTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
		$this->record = $this->wp_insights_db_utils->db_select(
				$recordsTable,
				$recordsTable.".*",
				$recordsTable.".id = '".$this->recording_id."'");
	
		//$this->record = $record;
			
		$clientId       = $this->record['client_id'];
		$timestamp      = WP_Insights_Utils::mask_client($clientId).'\n'.date("h:i A", strtotime($this->record['sess_date']));
		$this->cachedFilePath = $this->record['file'];
		$url            = $this->record['raw_url'];
		$this->viewPortWidth  = (int) $this->record['vp_width'];
		$this->viewPortHeight = (int) $this->record['vp_height'];
		$hovered        = $this->record['hovered'];
		$clicked        = $this->record['clicked'];
	
		// build JavaScript object
		//$this->JSON[] = '{"xcoords": ['.$coordsX.'], "ycoords": ['.$coordsY.'], "clicks": ['.$clicks.'], "timestamp": "'.$timestamp.'", "wprev": '.$record['vp_width'].', "hprev": '.$record['vp_height'].'}';
	}
	
	protected function loadCacheFile() {
		$this->cachedFile = $this->cache_dir.$this->cachedFilePath;
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
	
	protected function normalizeRecordedJson() {
		$this->hovered="[";
		foreach(explode("|~|",$this->record['hovered']) as $j => $jsonArrayString){
			error_log("   " . $j . " => " . $jsonArrayString);
			if($this->hovered != "" && $jsonArrayString != "") {
				$jsonArrayString = ltrim($jsonArrayString, "[");
				$this->hovered = rtrim($this->hovered, "]");
				if(strlen($this->hovered)>1){
					$this->hovered = $this->hovered.",";
				}
				$this->hovered = $this->hovered.$jsonArrayString;
			}
		}
		
		if($this->hovered === "[") {
			$this->hovered = "[]";
		}
		
		$this->clicked="[";
		foreach(explode("|~|",$this->record['clicked']) as $j => $jsonArrayString){
			error_log("   " . $j . " => " . $jsonArrayString);
			if($this->clicked != "" && $jsonArrayString != "") {
				$jsonArrayString = ltrim($jsonArrayString, "[");
				$this->clicked = rtrim($this->clicked, "]");
				if(strlen($this->clicked)>1){
					$this->clicked = $this->clicked.",";
				}
				$this->clicked = $this->clicked.$jsonArrayString;
			}
		}
		
		if($this->clicked === "[") {
			$this->clicked = "[]";
		}
		
		$this->lostFocus="[";
		foreach(explode("|~|",$this->record['lost_focus']) as $j => $jsonArrayString){
			error_log("   " . $j . " => " . $jsonArrayString);
			if($this->lostFocus != "" && $jsonArrayString != "") {
				$jsonArrayString = ltrim($jsonArrayString, "[");
				$this->lostFocus = rtrim($this->lostFocus, "]");
				if(strlen($this->lostFocus)>1){
					$this->lostFocus = $this->lostFocus.",";
				}
				$this->lostFocus = $this->lostFocus.$jsonArrayString;
			}
		}
		
		if($this->lostFocus === "[") {
			$this->lostFocus = "[]";
		}
		
		if($this->record['scrolls'] == null || $this->record['scrolls'] === "") {
			$this->scrolls = "[]";
		} else {
			$this->scrolls = $this->record['scrolls'];
		}
		
		if($this->record['viewports'] == null || $this->record['viewports'] === "") {
			$this->viewports = "[]";
		} else {
			$this->viewports = $this->record['viewports'];
		}
		
		$viewports_array = json_decode($this->viewports);
		error_log(print_r($viewports_array,true));
		if(sizeof($viewports_array)>0) {
			$this->viewPortHeight = $viewports_array[0]->h;
			$this->viewPortWidth = $viewports_array[0]->w;
		}
		
	}
	
	protected function createUserDataScript() {
		// user object for tracking data
		$cdata_user = '
			//<![CDATA[
			  var cursorImageUrl = "'.$this->image_cursor_path.'";
			  var clickImageUrl = "'.$this->image_click_path.'";
			  var recordingData = {
			  	vp_height: '.$this->viewPortHeight.',
				vp_width:  '.$this->viewPortWidth.',
				hovered:  '.$this->hovered.',
				clicked:  '.$this->clicked.',
				lost_focus:  '.$this->lostFocus.',
				scrolls:  '.$this->scrolls.',
				viewports: '.$this->viewports.'
				};
			  window.parent.resizeFrame(recordingData.vp_height,recordingData.vp_width);
			//]]>
			';
		// create user data script
		$this->js_user_data = $this->doc->createInlineScript($cdata_user);
	}
	
	protected function insertScriptElements() {
		// a BASE element is needed to link correctly CSS, scripts, etc.
		$base = $this->doc->createElement('base');
		$base->setAttribute('href', WP_Insights_Utils::url_get_base($this->record['raw_url']));
		$ini_comm = $this->doc->createComment(" begin wpi tracking code ");
		$end_comm = $this->doc->createComment(" end wpi tracking code ");
		$api_comm = $this->doc->createComment(" load wpi drawing API ");
		// point to (smt) aux functions
		//$js_aux = $this->doc->createExternalScript($this->auxjspath);
		$js_replayer = $this->doc->createExternalScript($this->js_replayer_path);
		$js_create = $this->doc->createExternalScript($this->js_create_path);
		// and peppy selector library
		//$js_selector = $this->doc->createExternalScript($this->selectorjspath);
		// rebuild parsed page
		$head = $this->doc->getElementsByTagName('head');
		foreach ($head as $h) {
			// loading order is crucial!
			$h->insertBefore($base, $h->firstChild);
			$h->appendChild($ini_comm);
			$h->appendChild($js_create);
			$h->appendChild($js_replayer);
			$h->appendChild($this->js_user_data);
			/*$h->appendChild($js_selector);
			if (isset($js_widget)) $h->appendChild($js_widget);
			$h->appendChild($api_comm);
	
			if ($this->api == "js") {
				$h->appendChild($this->js_graphics);
				$h->appendChild($this->js_json);
			} else if ($this->api == "swf") {
				$h->appendChild($this->js_swfobject);
				$h->appendChild($this->css_swf);
			}*/
			$h->appendChild($end_comm);
		}
		// append tracking script at the end of the page body
		/*$body = $this->doc->getElementsByTagName('body');
		foreach ($body as $b) {
			if ($this->api == "js") {
				$b->appendChild($this->js_replay);
				$b->appendChild($this->js_options);
			} else if ($this->api == "swf") {
				$b->appendChild($this->js_swf);
			}
		}*/
	}
	
	public function getReplayPage() {
		if($this->cachedFilePath == null) {
			$this->getDetailsByRecordingId();
			$this->normalizeRecordedJson();
		}
		if($this->doc == null) {
			$this->loadCacheFile();
			$this->createUserDataScript();
			$this->insertScriptElements();
		}		
		return $this->doc->saveHTML();
	}

	public function getScreenWidth(){
		if($this->screenWidth == null) {
			$this->getDetailsByRecordingId();
		}
		return $this->screenWidth;
	}
	
	public function getScreenHeight(){
		if($this->screenHeight == null) {
			$this->getDetailsByRecordingId();
		}
		return $this->screenHeight;
	}
}