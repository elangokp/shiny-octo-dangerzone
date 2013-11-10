<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');

class WP_Insights_Detailed_Page_Stats {
	
	protected $url = null;
	
	protected $pid = null;
	
	protected $pageViews = null;
	
	protected $avgBrowsingTime = null;
	
	protected $avgFocusTime = null;
	
	protected $attention = null;
	
	protected $interest = null;
	
	protected $desire = null;
	
	protected $passion = null;
	
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
		
		$this->process_stats();
	}
	
	public function getPageRecords() {
		/* $this->records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"." INNER JOIN ".$this->cacheTable." AS C1"." ON R.cache_id = C1.id"
				." INNER JOIN ".$this->cacheTable." AS C2"." ON C2.url = C1.url",
				"C1.url,R.sess_time,AVG(R.sess_time) as avg_sess_time,R.coords_x,R.coords_y,R.vp_width,R.vp_height,R.scr_width,R.scr_height",
				"C2.id = ".$this->pid); */
		
		$sql = "SELECT cache.url as url, 
    			max(cache.id) as cache_id,
    			COUNT(records.id ) AS visits, 
    			ROUND((COUNT(records1.id)/COUNT(records.id)*100),2) AS attention,
				ROUND((COUNT(records2.id)/COUNT(records.id)*100),2) AS interest,
				ROUND((COUNT(records3.id)/COUNT(records.id)*100),2) AS desire,
				ROUND((COUNT(records4.id)/COUNT(records.id)*100),2) AS passion,
    			SEC_TO_TIME(AVG( records.sess_time )) AS browsing_time,
    			SEC_TO_TIME( STD( records.sess_time ) ) AS std_browsing_time, 
			    SEC_TO_TIME( MIN( records.sess_time ) ) AS min_browsing_time, 
			    SEC_TO_TIME( MAX( records.sess_time ) ) AS max_browsing_time,
			    SEC_TO_TIME(AVG( records.focus_time )) AS focus_time,
    			SEC_TO_TIME( STD( records.focus_time ) ) AS std_focus_time, 
			    SEC_TO_TIME( MIN( records.focus_time ) ) AS min_focus_time, 
			    SEC_TO_TIME( MAX( records.focus_time ) ) AS max_focus_time
				FROM $this->recordsTable AS records
				INNER JOIN $this->cacheTable AS cache ON records.cache_id = cache.id
				INNER JOIN $this->cacheTable AS cache2 ON cache2.url = cache.url
				LEFT OUTER JOIN $this->recordsTable AS records1 ON records.id = records1.id and records1.focus_time>60
				LEFT OUTER JOIN $this->recordsTable AS records2 ON records.id = records2.id and records2.focus_time>120
				LEFT OUTER JOIN $this->recordsTable AS records3 ON records.id = records3.id and records3.focus_time>300
				LEFT OUTER JOIN $this->recordsTable AS records4 ON records.id = records4.id and records4.focus_time>600
				where cache2.id=$this->pid";
				
		$this->records = $this->wp_insights_db_utils->db_query($sql);
				
	}
	
	public function process_stats() {
		$this->getPageRecords();
		$this->calculateUrl();
		$this->calculatePageViews();
		$this->calculateAvgBrowsingTime();
		$this->calculateAvgFocusTime();
		$this->calculateAttention();
		$this->calculateInterest();
		$this->calculateDesire();
		$this->calculatePassion();
	}
	
	protected function calculateUrl() {
		$this->url = $this->records[0]['url'];
	}
	
	protected function calculatePageViews() {
		$this->pageViews = $this->records[0]['visits'];
	}
	
	protected function calculateAvgBrowsingTime() {
		$this->avgBrowsingTime = $this->records[0]['browsing_time'];
	}
	
	protected function calculateAvgFocusTime() {
		$this->avgFocusTime = $this->records[0]['focus_time'];
	}
	
	protected function calculateAttention() {
		$this->attention = $this->records[0]['attention'];
	}
	
	protected function calculateInterest() {
		$this->interest = $this->records[0]['interest'];
	}
	
	protected function calculateDesire() {
		$this->desire = $this->records[0]['desire'];
	}
	
	protected function calculatePassion() {
		$this->passion = $this->records[0]['passion'];
	}
	
	public function getUrl() {
		return $this->url;
	}
	
	public function getPageViews() {
		return $this->pageViews;
	}
	
	public function getAvgBrowsingTime() {
		return $this->avgBrowsingTime;
	}
	
	public function getAvgFocusTime() {
		return $this->avgFocusTime;
	}
	
	public function getAttention() {
		return $this->attention;
	}
	
	public function getInterest() {
		return $this->interest;
	}
	
	public function getDesire() {
		return $this->desire;
	}
	
	public function getPassion() {
		return $this->passion;
	}
}