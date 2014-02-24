<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'utils/class-domutil.php');

class WP_Insights_Replayer_Beta {
	
	protected $recording_id = null;
	
	protected $cache_dir = null;
	
	protected $screenWidth = null;
	
	protected $screenHeight = null;
	
	protected $cachedFilePath = null;
	
	protected $wp_insights_db_utils = null;
	
	public function __construct($recording_id) {
		global $wpdb;
		$this->recording_id = $recording_id;
		$WP_Insights_instance = WP_Insights::get_instance();
		$this->cache_dir = $WP_Insights_instance->get_cache_dir();
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->getDetailsByRecordingId();
		$this->loadCacheFile();
	}
	
	protected function getDetailsByRecordingId(){
		$recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$cacheTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
		$record = $this->wp_insights_db_utils->db_select(
				$recordsTable,
				$recordsTable.".*",
				$recordsTable.".id = '".$this->recording_id."'");
	
		//$this->record = $record;
			
		$clientId       = $record['client_id'];
		$timestamp      = WP_Insights_Utils::mask_client($clientId).'\n'.date("h:i A", strtotime($record['sess_date']));
		$this->cachedFilePath = $record['file'];
		$url            = $record['raw_url'];
		$this->screenWidth  = (int) $record['scr_width'];
		$this->screenHeight = (int) $record['scr_height'];
		$hovered        = $record['hovered'];
		$clicked        = $record['clicked'];
	
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
	
	public function getReplayPage() {
		return $this->doc->saveHTML();
	}

	public function getScreenWidth(){
		return $this->screenWidth;
	}
	
	public function getScreenHeight(){
		return $this->screenHeight;
	}
}