<?php

require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');

class WP_Insights_Event_Data {
	
	protected $pid = null;
	
	protected $dataType = null;
	
	protected $fromDate = null;
	
	protected $tillDate = null;
	
	protected $fromRecordNumber = null;
	
	protected $recordsPerPage = null;
	
	protected $wp_insights_db_utils = null;
	
	protected $recordsTable = null;
	
	protected $pagesTable = null;
	
	protected $records = null;
	
	protected $eventJsonResponse = null;
	
	public function __construct($pid, $dataType, $fromDate=null, $tillDate=null, $currentPageNumber = 1, $recordsPerPage = 100) {
		global $wpdb;
		$this->pid = $pid;
		$this->dataType = $dataType;
		if($fromDate!=null) {
			$this->fromDate = $fromDate." 00:00:00";
		}
		
		if($tillDate!=null) {
			$this->tillDate = $tillDate." 23:59:59";
		}

		$this->fromRecordNumber = ($currentPageNumber-1) * $recordsPerPage;
		$this->recordsPerPage = $recordsPerPage;
		
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
		$this->wp_insights_db_utils->setWpdb($wpdb);
		$this->recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$this->pagesTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_PAGES;
	}
	
	public function getMouseEventData() {
		$this->loadMouseEventData();
		if(!empty($this->records)) {
			//$this->constructHeatmapString();
			$this->constructOptimizedHeatmapString();
		} else {
			$this->eventJsonResponse = 0;
		}
		error_log($this->eventJsonResponse);			
		return $this->eventJsonResponse;
	}
	
	protected function loadMouseEventData() {
		$sql = "select
		R.id as id,
		R.is_exit as is_exit,
		R.is_session_exit as is_session_exit, ";

		if($this->dataType == 'mvh' || $this->dataType == 'exith' || $this->dataType == 'mph') {
			$sql = $sql."R.hovered as mousepositions";
		} else if($this->dataType == 'clickh') {
			$sql = $sql."R.clicked as mousepositions";
		} else if($this->dataType == 'lfh') {
			$sql = $sql."R.lost_focus as mousepositions";
		}
				
		$sql = $sql." from $this->recordsTable as R
		INNER JOIN $this->pagesTable as pages
		ON R.page_id = pages.id
		where pages.id = $this->pid";
		
		if($this->fromDate != null & $this->tillDate !=null) {
			$sql = $sql." AND R.sess_date >= '$this->fromDate'
			AND R.sess_date <= '$this->tillDate'";
		}
		
		if($this->dataType == 'exith') {
			$sql = $sql." AND R.is_session_exit = 1";
		}
		$fromRecordNumber = $this->fromRecordNumber;
		$recordsPerPage = $this->recordsPerPage;
		error_log($fromRecordNumber);
		error_log($recordsPerPage);
		$sql = $sql." ORDER BY R.id";
		$sql = $sql." LIMIT $fromRecordNumber , $recordsPerPage";
		
		/*if($this->fromRecordNumber != null & $this->tillRecordNumber !=null) {
			$noOfRequestedRecords = ($this->tillRecordNumber - $this->fromRecordNumber) + 1;
			$sql = $sql." LIMIT $this->fromRecordNumber , $noOfRequestedRecords";
		}*/
		
		error_log($sql);
		
		$this->records = $this->wp_insights_db_utils->db_query($sql);
	}
	
	protected function constructOptimizedHeatmapString() {
		
		//csspath - index 0 - 'cp'
		//time - index 1 - 't'
		//pageX - index 2 - 'pX'
		//pageY - index 3 - 'pY'
		//rX - index 4
		//rY - index 5
		//w - index 6
		//h - index 7
		$heatmapPositions = array();
		if($this->recordsPerPage > count($this->records)) {
			$heatmapPositions['containsMoreRecords'] = false;
		} else {
			$heatmapPositions['containsMoreRecords'] = true;
		}
	
		if($this->dataType == 'mvh' || $this->dataType == 'clickh' || $this->dataType == 'lfh') {
			
			foreach ($this->records as $i => $record)
			{
				$singleRecordingMousePositionKeys = array();
				error_log($record['id'] . "=>" . $record['mousepositions']);
				foreach(explode("|~|",$record['mousepositions']) as $j => $jsonArrayString){
					error_log("   " . $j . " => " . $jsonArrayString);
					if($jsonArrayString != "") {
						/*$jsonArrayString = ltrim($jsonArrayString, "[");
						$this->eventJsonResponse = rtrim($this->eventJsonResponse, "]");
						if(strlen($this->eventJsonResponse)>1){
							$this->eventJsonResponse = $this->eventJsonResponse.",";
						}
						$this->eventJsonResponse = $this->eventJsonResponse.$jsonArrayString;*/
						$mousePositions  = json_decode($jsonArrayString, true);
						error_log(print_r($mousePositions,true));
						foreach($mousePositions as $mousePosition){
							$mousePositionKey = $mousePosition[0]."-".$mousePosition[6]."-".$mousePosition[7]."-".$mousePosition[4]."-".$mousePosition[5];
							if(!isset($singleRecordingMousePositionKeys[$mousePositionKey])) {
								$singleRecordingMousePositionKeys[$mousePositionKey] = 1;
								if(!isset($heatmapPositions[$mousePosition[0]])) {
									$heatmapPositions[$mousePosition[0]] = array(
											"rX" => array(),
											"rY" => array(),
											"w" => array(),
											"h" => array()											
									);
								}
								$heatmapPositions[$mousePosition[0]]['rX'][] = $mousePosition[4];
								$heatmapPositions[$mousePosition[0]]['rY'][] = $mousePosition[5];
								$heatmapPositions[$mousePosition[0]]['w'][] = $mousePosition[6];
								$heatmapPositions[$mousePosition[0]]['h'][] = $mousePosition[7];								
							}
						}
					}
	
				}
			}
			$this->eventJsonResponse = json_encode($heatmapPositions);
			error_log($this->eventJsonResponse);
			
		} else if($this->dataType == 'exith') {
			foreach ($this->records as $i => $record)
			{
				if($record['mousepositions'] != ""){
					$JsonArrayStrings = explode("|~|",$record['mousepositions']);
					$lastJsonArrayString = end($JsonArrayStrings);
					//error_log(print_r($lastJsonArrayString, true));
					if($lastJsonArrayString != "") {
						$mousePositions  = json_decode($lastJsonArrayString, true);
						$exitPoint = end($mousePositions);
						if(!isset($heatmapPositions[$exitPoint[0]])) {
							$heatmapPositions[$exitPoint[0]] = array(
									"rX" => array(),
									"rY" => array(),
									"w" => array(),
									"h" => array()									
							);
						}
						$heatmapPositions[$exitPoint[0]]['rX'][] = $exitPoint[4];
						$heatmapPositions[$exitPoint[0]]['rY'][] = $exitPoint[5];
						$heatmapPositions[$exitPoint[0]]['w'][] = $exitPoint[6];
						$heatmapPositions[$exitPoint[0]]['h'][] = $exitPoint[7];						
					}
				}
	
			}
			$this->eventJsonResponse = json_encode($heatmapPositions);
			error_log($this->eventJsonResponse);
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
					$JsonArrayStrings = explode("|~|",$record['mousepositions']);
					$lastJsonArrayString = end($JsonArrayStrings);
					//error_log(print_r($lastJsonArrayString, true));
					if($lastJsonArrayString != "") {					
						if(strpos($lastJsonArrayString, "},{") !== false){
							$pointsJson = explode("},{",$lastJsonArrayString);
							$exitPointJson = end($pointsJson);
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