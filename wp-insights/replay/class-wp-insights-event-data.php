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
	
	protected $records = null;
	
	protected $eventJsonResponse = null;
	
	public function __construct($lrid, $dataType, $fromDate=null, $tillDate=null, $fromRecordNumber = null, $tillRecordNumber = null) {
		global $wpdb;
		$this->lrid = $lrid;
		$this->dataType = $dataType;
		if($fromDate!=null) {
			$this->fromDate = $fromDate." 00:00:00";
		}
		
		if($tillDate!=null) {
			$this->tillDate = $tillDate." 23:59:59";
		}

		$this->fromRecordNumber = $fromRecordNumber;
		$this->tillRecordNumber = $tillRecordNumber;
		
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$this->cacheTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
	}
	
	public function getMouseEventData() {
		$this->loadMouseEventData();
		if(!empty($this->records)) {
			$this->constructHeatmapString();
		} else {
			$this->eventJsonResponse = 0;
		}				
		return $this->eventJsonResponse;
	}
	
	protected function loadMouseEventData() {
		$sql = "select
		R1.id as id,";

		if($this->dataType == 'mvh' || $this->dataType == 'exith' || $this->dataType == 'mph') {
			$sql = $sql."R1.hovered as mousepositions";
		} else if($this->dataType == 'clickh') {
			$sql = $sql."R1.clicked as mousepositions";
		} else if($this->dataType == 'lfh') {
			$sql = $sql."R1.lost_focus as mousepositions";
		}
				
		$sql = $sql." from $this->recordsTable as R
		RIGHT OUTER JOIN $this->recordsTable as R1
		ON R.cleansed_url = R1.cleansed_url
		where R.id = $this->lrid";
		
		if($this->fromDate != null & $this->tillDate !=null) {
			$sql = $sql." AND R1.sess_date >= '$this->fromDate'
			AND R1.sess_date <= '$this->tillDate'";
		}
		
		$sql = $sql." ORDER BY R1.id";
		
		if($this->fromRecordNumber != null & $this->tillRecordNumber !=null) {
			$noOfRequestedRecords = ($this->tillRecordNumber - $this->fromRecordNumber) + 1;
			$sql = $sql." LIMIT $this->fromRecordNumber , $noOfRequestedRecords";
		}
		
		error_log($sql);
		
		$this->records = $this->wp_insights_db_utils->db_query($sql);
	}
	
	protected function constructHeatmapString() {
		
		if($this->dataType == 'mvh' || $this->dataType == 'clickh' || $this->dataType == 'lfh') {
			$this->eventJsonResponse="[";
			foreach ($this->records as $i => $record)
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
		} else if($this->dataType == 'exith') {
			$this->eventJsonResponse = "[";
			foreach ($this->records as $i => $record)
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
							$this->eventJsonResponse = $this->eventJsonResponse.$exitPointJson;
							$this->eventJsonResponse = $this->eventJsonResponse.",";
						} else {
							$exitPointJson = rtrim(ltrim($lastJsonArrayString, "["), "]");
							//error_log(print_r($exitPointJson, true));
							$this->eventJsonResponse = $this->eventJsonResponse.$exitPointJson;
							$this->eventJsonResponse = $this->eventJsonResponse.",";
						}
					}
				}
				
			}
			$this->eventJsonResponse = rtrim($this->eventJsonResponse, ",");
			$this->eventJsonResponse = $this->eventJsonResponse."]";
		} else if($this->dataType == 'mph') {
			$this->eventJsonResponse = "[";
			foreach ($this->records as $i => $record)
			{
				$eachUserhoverClickData = "";			
				foreach(explode("|~|",$record['mousepositions']) as $j => $jsonArrayString){
					if($eachUserhoverClickData != "" && $jsonArrayString != "") {
						$jsonArrayString = ltrim($jsonArrayString, "[");
						$eachUserhoverClickData = rtrim($eachUserhoverClickData, "]");
						$eachUserhoverClickData = $eachUserhoverClickData.",";
					}
					$eachUserhoverClickData = $eachUserhoverClickData.$jsonArrayString;
				}
				if($eachUserhoverClickData != "") {
					$this->eventJsonResponse = $this->eventJsonResponse.$eachUserhoverClickData;
					$this->eventJsonResponse = $this->eventJsonResponse.",";
				}			
			}
			$this->eventJsonResponse = rtrim($this->eventJsonResponse, ",");
			$this->eventJsonResponse = $this->eventJsonResponse."]";
		}
		
		if(strlen($this->eventJsonResponse)<3) {
			$this->eventJsonResponse = "[]";
		}
		
	}
	
	
}