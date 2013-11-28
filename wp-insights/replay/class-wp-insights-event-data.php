<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');

class WP_Insights_Event_Data {
	
	protected $lrid = null;
	
	protected $dataType = null;
	
	protected $fromDate = null;
	
	protected $tillDate = null;
	
	protected $fromRecordNumber = null;
	
	protected $tillRecordNumber = null;
	
	protected $wp_insights_db_utils = null;
	
	protected $recordsTable = null;
	
	protected $cacheTable = null;
	
	protected $eventJsonResponse = null;
	
	public function __construct($lrid, $dataType, $fromDate=null, $tillDate=null, $fromRecordNumber = null, $tillRecordNumber = null) {
		global $wpdb;
		$this->lrid = $lrid;
		$this->dataType = $dataType;
		$this->fromDate = $fromDate;
		$this->tillDate = $tillDate;
		$this->fromRecordNumber = $fromRecordNumber;
		$this->tillRecordNumber = $tillRecordNumber;
		
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$this->cacheTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
	}
	
	public function getMouseMovementDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.hovered as mousepositions",
				"R.id = ".$this->lrid);
	
		$this->constructHeatmapString($records);
		
		return $eventJsonResponse;
	
	}
	
	public function getClickDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.clicked as mousepositions",
				"R.id = ".$this->lrid);
	
		$this->constructHeatmapString($records);
		
		return $eventJsonResponse;
	
	}
	
	public function getLostFocusDataByPage(){
		$records = $this->wp_insights_db_utils->db_select_all(
				$this->recordsTable." AS R"
				." RIGHT OUTER JOIN ".$this->recordsTable." AS R1"." ON R.cleansed_url = R1.cleansed_url",
				"R1.id as id,R1.lost_focus as mousepositions",
				"R.id = ".$this->lrid);
	
		$this->constructHeatmapString($records);
		
		return $eventJsonResponse;
	
	}
	
	protected function constructHeatmapString($records) {
		$this->eventJsonResponse="[";
		foreach ($records as $i => $record)
		{
			error_log($record['id'] . "=>" . $record['mousepositions']);
			foreach(explode("|~|",$record['mousepositions']) as $j => $jsonArrayString){
				error_log("   " . $j . " => " . $jsonArrayString);
				if($this->eventJsonResponse != "" && $jsonArrayString != "") {
					$jsonArrayString = ltrim($jsonArrayString, "[");
					$this->eventJsonResponse = rtrim($this->eventJsonResponse, "]");
					if(strlen($this->eventJsonResponse)>1){
						$this->eventJsonResponse = $this->eventJsonResponse.",";
					}
					$this->eventJsonResponse = $this->eventJsonResponse.$jsonArrayString;
				}
	
			}
		}
	}
	
	
}