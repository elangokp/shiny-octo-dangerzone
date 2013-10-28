<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');

class WP_Insights_Detailed_Page_Stats {
	
	public $url = null;
	
	protected $pid = null;
	
	protected $pageViews = null;
	
	protected $avgBrowsingTime = null;
	
	protected $avgFocusTime = null;
	
	//protected $avgInteractionTime = null;
	
	protected $scrollReach = null;
	
	protected $wp_insights_db_utils = null;
	
	protected $records = null;
	
	protected $recordsTable = null;
	
	protected $browsersTable = null;
	
	protected $cacheTable = null;
	
	public function __construct($pid) {
		global $wpdb;
		$this->pid = $pid;
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		
		$this->browsersTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_BROWSERS;
		
		$this->osTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_OS;
		
		$this->cacheTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
	}
	
	public function getPageRecords() {
		$this->records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"C1.url,R.sess_time,R.coords_x,R.coords_y,R.vp_width,R.vp_height,R.scr_width,R.scr_height",
				"C2.id = ".$this->pid);
	}
	
	public function process_stats() {
		$this->getPageRecords();
		$this->url = $this->records[0]['url'];
		/* foreach ($this->records as $i => $record) {
				
		} */
	}
}