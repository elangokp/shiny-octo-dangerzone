<?php

require_once('class-wp-insights-utils.php');
require_once('utils/LZString.php');
require_once('class-wp-insights-db-utils.php');
require_once('class-browser.php');
require_once('utils/Browscap.php');
class WP_Insights_Recorder {

	protected $cache_dir = null;
	
	protected $browscap_cache_dir = null;

	protected $wp_insights_db_utils = null;
	
	protected $visitor_id = 0;

	protected $recording_id = 0;
	
	protected $page_id = 0;	
	
	protected static $instance = null;
	
	private function __construct() {
		//$this->cache_dir = dirname(__FILE__)."/cache/";
	}

	/**
	 * Return an instance of this class.
	 *
	 * @since     1.0.0
	 *
	 * @return    object    A single instance of this class.
	 */
	public static function get_instance() {

		// If the single instance hasn't been set, set it now.
		if ( null == self::$instance ) {
			self::$instance = new self;
		}

		return self::$instance;
	}
	
	public function setCacheDir($dirPath) {
		$this->cache_dir = $dirPath;
	}
	
	public function setBrowscapCacheDir($dirPath) {
		$this->browscap_cache_dir = $dirPath;
	}

	public function set_wp_insights_db_utils($given_wp_insights_db_utils) {
		$this->wp_insights_db_utils = $given_wp_insights_db_utils;
	}
	
	public function get_visitor_id() {
		return $this->visitor_id;
	}
	
	public function get_recording_id() {
		return $this->recording_id;
	}
	
	public function get_page_id() {
		return $this->page_id;
	}
	
	protected function insert_visitor() {
		$visitors_table = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_VISITORS;
		$recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		//error_log("VID is : ".$_POST['vid']);
		$this->visitor_id = $_POST['vid'];
		//error_log("ftu is : ".$_POST['ftu']);
		if (isset($_POST['ftu']) && $_POST['ftu'] == "true") {		
			$browserAndOSId = $this->getBrowserAndOSDetails();
			$visitor_details = array(
					"id" => $this->visitor_id,
					"os_id" => $browserAndOSId['os_id'],
					"browser_id" => $browserAndOSId['browser_id'],
					"browser_ver" => $browserAndOSId['browser_ver'],
					"user_agent" => $browserAndOSId['user_agent'],
					"ip" => WP_Insights_Utils::get_client_ip()
			);
			$visitor_details_format = array(
					'%s',
					'%d',
					'%d',
					'%f',
					'%s',
					'%s'
			);
			$this->wp_insights_db_utils->db_insert($visitors_table, $visitor_details, $visitor_details_format);
		} else {
			$exitUpdateQuery = "UPDATE $recordsTable
			SET $recordsTable.is_exit = 0,
			$recordsTable.is_session_exit = CASE UNIX_TIMESTAMP(current_timestamp()) < (UNIX_TIMESTAMP(sess_date) + sess_time + 86400)
			WHEN true THEN 0
			WHEN false THEN 1 END
			WHERE $recordsTable.visitor_id =".$this->visitor_id."
			ORDER BY $recordsTable.id DESC
			LIMIT 1";
				
			$updateVisitorQuery = "UPDATE $visitors_table
			SET $visitors_table.last_visit_time = CURRENT_TIMESTAMP()
			WHERE $visitors_table.id =".$this->visitor_id;
				
			$this->wp_insights_db_utils->db_query($exitUpdateQuery);
			$this->wp_insights_db_utils->db_query($updateVisitorQuery);			
		}
	}
	
	protected function insert_page() {
		//$current_url = WP_Insights_Utils::getCurrentPageURL();
		$current_url = urldecode(stripslashes($_POST['url']));
		$pages_table = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_PAGES;
		$page_check_query = "SELECT id as page_id from $pages_table WHERE url = '".$current_url."' LIMIT 1";
		$page_id_resultset = $this->wp_insights_db_utils->db_query($page_check_query);
		if(!isset($page_id_resultset[0]['page_id'])) {
			$page_details = array(
					"url" => $current_url
			);
			$page_details_format = array(
					'%s'
			);
			$this->page_id = $this->wp_insights_db_utils->db_insert($pages_table, $page_details, $page_details_format);
		} else {
			$this->page_id = $page_id_resultset[0]['page_id'];
		}
	}
	
	public function init_recording() {
		
		$this->insert_visitor();
		$this->insert_page();
		$recordsTable = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
		$relativefilepath = $this->cache();
		//error_log("RID is : ".$_POST['rid']);
		/* create database entry ---------------------------------------------------- */
		$recorddetails = array(
				"id" => $_POST['rid'],
				"visitor_id" => $this->visitor_id,
				"page_id" => $this->page_id,
				"file" => $relativefilepath,
				"sess_time" => $_POST['time'],
				"focus_time" => $_POST['focusedTime'],
				"lost_focus_count" => $_POST['lostFocusCount'],
				"exit_page_section" => urldecode(stripslashes($_POST['currentPageSection'])),
				"is_exit" => 1,
				"is_session_exit" => 1
		);
		$recorddetailsformat = array(
				'%s',
				'%s',
				'%d',
				'%s',
				'%d',
				'%d',
				'%d',
				'%s',
				'%d',
				'%d'
		);	
		
		if(isset($_POST['elhovered']) && strlen($_POST['elhovered'])>2) {
			//error_log("Append Inside not empty hovered");
			$hovered_json = urldecode(stripslashes($_POST['elhovered']));
			$recorddetails["hovered"] = esc_sql($hovered_json);
			$recorddetailsformat[] = '%s';
		}
		
		if(isset($_POST['elclicked']) && strlen($_POST['elclicked'])>2) {
			//error_log("Append Inside not empty clicked");
			$clicked_json = urldecode(stripslashes($_POST['elclicked']));
			$recorddetails["hovered"] = esc_sql($clicked_json);
			$recorddetailsformat[] = '%s';
			
		}
		
		if(isset($_POST['ellostfocus']) && strlen($_POST['ellostfocus'])>2) {
			//error_log("Append Inside not empty lost focus");
			$lostFocus_json = urldecode(stripslashes($_POST['ellostfocus']));
			$recorddetails["lost_focus"] = esc_sql($lostFocus_json);
			$recorddetailsformat[] = '%s';
		}
		
		if(isset($_POST['scrolls']) && strlen($_POST['scrolls'])>2) {
			//error_log("Append Inside not empty scrolls");
			$scrolls_json = urldecode(stripslashes($_POST['scrolls']));
			$recorddetails["scrolls"] = esc_sql($scrolls_json);
			$recorddetailsformat[] = '%s';
		}
		
		if(isset($_POST['vp']) && strlen($_POST['vp'])>2) {
			//error_log("Append Inside not empty view ports");
			$viewPorts_json = urldecode(stripslashes($_POST['vp']));
			$recorddetails["viewports"] = esc_sql($viewPorts_json);
			$recorddetailsformat[] = '%s';
		}
		
		$this->wp_insights_db_utils->db_insert($recordsTable, $recorddetails, $recorddetailsformat);
		
		if(isset($_POST['pageSections']) && strlen($_POST['pageSections'])>2) {
			$pageSections_json = urldecode(stripslashes($_POST['pageSections']));
			$currentPageSection = urldecode(stripslashes($_POST['currentPageSection']));
			$pageSections  = json_decode($pageSections_json, true);
			if(sizeof($pageSections) > 0) {
				$pagesections_table = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_PAGE_SECTIONS;
				//error_log("Inside insert");
				$pageSectionInsertQuery = "INSERT into $pagesections_table (record_id, page_id, section_order, section_id, section_name, sess_time, focus_time, current_page_section, lost_focus_count, entryTimes, exitTimes, focusedEntryTimes, focusedExitTimes) VALUES ";
				$pageSectionValues = " ";
				foreach($pageSections as $pageSection){
					$pageSectionValues .= "(".$this->recording_id.",";
					$pageSectionValues .= $this->page_id.",";
					$pageSectionValues .= $pageSection['order'].",";
					$pageSectionValues .= "'".$pageSection['sectionId']."',";
					$pageSectionValues .= "'".$pageSection['sectionName']."',";
					$pageSectionValues .= $pageSection['totalTime'].",";
					$pageSectionValues .= $pageSection['totalFocusedTime'].",";
					$pageSectionValues .= $pageSection['currentPageSection'].",";
					$pageSectionValues .= $pageSection['lostFocusCount'].",";
					$pageSectionValues .= "'".implode(",", $pageSection['entryTimes'])."',";
					$pageSectionValues .= "'".implode(",", $pageSection['exitTimes'])."',";
					$pageSectionValues .= "'".implode(",", $pageSection['focusedEntryTimes'])."',";
					$pageSectionValues .= "'".implode(",", $pageSection['focusedExitTimes'])."'),";
				}
				$pageSectionValues = rtrim($pageSectionValues, ",");
				$pageSectionInsertQuery .= $pageSectionValues;
				$this->wp_insights_db_utils->db_query($pageSectionInsertQuery);
			}
		}
		
	}
	
	protected function getBrowserAndOSDetails() {
		/* client browser stats ----------------------------------------------------- */
		
		//$browser = new Browser();
		$browserName = null;
		$browserVersion = null;
		$os = null;
		$userAgent = null;
		try {
			$bc = new Browscap($this->cache_dir."browscapcache/",plugin_dir_path(__FILE__)."utils/full_php_browscap.ini");
			//$bc = new Browscap($this->cache_dir."browscapcache/");
			$current_browser = $bc->getBrowser();
		} catch (Exception $e) {
			$current_browser = array(
					"Parent" => "unknown",
					"Platform_Description" => "unknown"
			);
		}
		
		if(isset($current_browser->Parent) && !empty($current_browser->Parent)) {
			$browserName = $current_browser->Parent;
		} else {
			$browserName = "unknown";
		}
		
		if(isset($current_browser->Platform_Description) && !empty($current_browser->Platform_Description)) {
			$os = $current_browser->Platform_Description;
		} else {
			$os = "unknown";
		}
		
		if(isset($current_browser->Version) && !empty($current_browser->Version)) {
			$browserVersion = (float)$current_browser->Version;
		} else {
			$browserVersion = (float)"0.0";
		}
		
		if(isset($current_browser->browser_name) && !empty($current_browser->browser_name)) {
			$userAgent = $current_browser->browser_name;
		} else {
			$userAgent = "unknown";
		}

		////error_log(print_r($current_browser, true));
		// save browser id
		$bname = $this->wp_insights_db_utils->db_select($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_BROWSERS, "id", "name='".$browserName."'");
		if (!$bname) {
			$isBot = 0;
			if (strpos($browserName, 'GoogleBot') !== FALSE) {
				$isBot = 1;
			} elseif (strpos($browserName, 'Yahoo! Slurp') !== FALSE) {
				$isBot = 1;
			} else {
				$isBot = 0;
			}
			
			$browserdetails = array(
					"name" => $browserName,
					"isBot" => $isBot
			);
			$browserdetailsformat = array(
					'%s',
					'%d'
			);
			$browserid = $this->wp_insights_db_utils->db_insert($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_BROWSERS, $browserdetails, $browserdetailsformat);
		} else {
			$browserid = $bname['id'];
		}
		
		
		// save OS id
		$osname = $this->wp_insights_db_utils->db_select($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_OS, "id", "name='".$os."'");
		if (!$osname) {
			$osdetails = array(
					"name" => $os
			);
			$osdetailsformat = array(
					'%s'
			);
			$osid = $this->wp_insights_db_utils->db_insert($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_OS, $osdetails, $osdetailsformat);
		} else {
			$osid = $osname['id'];
		}
		
		$browserAndOSId = array(
				'browser_id' => $browserid,
				'os_id' => $osid,
				'browser_ver' => $browserVersion,
				'user_agent' => $userAgent
		);
		
		return $browserAndOSId;
		
	}

	public function cache() {
		
		$year = date("Y");
		$month = date("M");
		$day = date("d");
		$hisdate = date("H-i-s");
		$ext = ".html";
		$relativeDirpath = $year."/".$month."/".$day."/";
		$absoluteDirPath = $this->cache_dir.$relativeDirpath;
		
		WP_Insights_Utils::createDirectory($absoluteDirPath);
		// "March 10th 2006 @ 15h 16m 08s" should create the log file "20060310-151608.html"
		$htmlfile = $_POST['rid']."-".$hisdate.$ext;
		
		$absolutefilepath = $absoluteDirPath.$htmlfile;
		$relativefilepath = $relativeDirpath.$htmlfile;
		file_put_contents($absolutefilepath, $_POST['html']);
		return $relativefilepath;
		
	}

	public function save() {
		
		error_log("save execution start : ".microtime());
		ignore_user_abort(true);

		//tell the browser not to expect any more content and close the connection
		header("Content-Length: 1");
		header("Connection: close");
		
		//process what needs to be returned to browser
		echo "1";
		
		ob_flush();
		flush();
		
		error_log("Flushed now : ".microtime());
		
		if(array_key_exists('isXDR',$_REQUEST) && $_REQUEST['isXDR'] == true) {
			parse_str(file_get_contents('php://input'), $_POST);
		}
		
		if (empty($_POST)) {
			parse_str(file_get_contents('php://input'), $_POST);
			if (empty($_POST)) {
				return;
			}			
		}
		
		if(isset($_POST['type'])) {
			$type = $_POST['type'];
		} else {
			return;
		}
		
		error_log($type);
		
		if($type == "init") {
			$this->init_recording();
			return;
		}
		
		
		$this->recording_id = $_POST['rid'];
		//error_log($this->recording_id);
		
		$values = "sess_time = '".                         (float) $_POST['time']    ."',";
		$values .= "focus_time = '".                        (float) $_POST['focusedTime']   ."',";
		$values .= "lost_focus_count = '".                  (int)   $_POST['lostFocusCount']   ."',";
		$values .= "exit_page_section = '".                         $_POST['currentPageSection']   ."'";
		
		$comp_hovered_json = $_POST['elhoveredcomp'];
		error_log($comp_hovered_json);		
		$decomp_hovered_json = LZString::decompressFromBase64($comp_hovered_json);
		error_log($decomp_hovered_json);
		
		if(isset($_POST['elhovered']) && strlen($_POST['elhovered'])>2) {
			//error_log("Append Inside not empty hovered");
			$hovered_json = urldecode(stripslashes($_POST['elhovered']));
			$values .= ",hovered   = CONCAT(COALESCE(hovered,  ''), '|~|". esc_sql($hovered_json) ."')";
		}
		
		if(isset($_POST['elclicked']) && strlen($_POST['elclicked'])>2) {
			//error_log("Append Inside not empty clicked");
			$clicked_json = urldecode(stripslashes($_POST['elclicked']));
			$values .= ",clicked   = CONCAT(COALESCE(clicked,  ''), '|~|". esc_sql($clicked_json) ."')";
		}
		
		if(isset($_POST['ellostfocus']) && strlen($_POST['ellostfocus'])>2) {
			//error_log("Append Inside not empty lost focus");
			$lostFocus_json = urldecode(stripslashes($_POST['ellostfocus']));
			$values .= ",lost_focus   = CONCAT(COALESCE(lost_focus,  ''), '|~|". esc_sql($lostFocus_json) ."')";
		}
		
		if(isset($_POST['scrolls']) && strlen($_POST['scrolls'])>2) {
			//error_log("Append Inside not empty scrolls");
			$scrolls_json = urldecode(stripslashes($_POST['scrolls']));
			$values .= ",scrolls = '".$scrolls_json."'";
		}
		
		if(isset($_POST['vp']) && strlen($_POST['vp'])>2) {
			//error_log("Append Inside not empty view ports");
			$viewPorts_json = urldecode(stripslashes($_POST['vp']));
			$values .= ",viewports = '".$viewPorts_json."'";
		}

		$this->wp_insights_db_utils->db_update($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS, $values, "id='".$this->recording_id."'");
		
		if(isset($_POST['pageSections']) && strlen($_POST['pageSections'])>2) {
			$pageSections_json = urldecode(stripslashes($_POST['pageSections']));
			$currentPageSection = urldecode(stripslashes($_POST['currentPageSection']));
			$pageSections  = json_decode($pageSections_json, true);
			if(sizeof($pageSections) > 0) {
				$pagesections_table = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_PAGE_SECTIONS;
				//error_log("Inside update");
				$pageSectionUpdateQuery = "UPDATE $pagesections_table SET ";
				$currentPageSectionCaseStmt = "current_page_section = CASE section_id ";
				$sessTimeCaseStmt = "sess_time = CASE section_id ";
				$focusTimeCaseStmt = "focus_time = CASE section_id ";
				$lostFocusCountCaseStmt = "lost_focus_count = CASE section_id ";
				$entryTimesCaseStmt = "entryTimes = CASE section_id ";
				$exitTimesCaseStmt = "exitTimes = CASE section_id ";
				$focusedEntryTimesCaseStmt = "focusedEntryTimes = CASE section_id ";
				$focusedExitTimesCaseStmt = "focusedExitTimes = CASE section_id ";
				foreach($pageSections as $pageSection){
					if($currentPageSection == $pageSection['sectionName']){
						if(sizeof($pageSection['exitTimes']) < sizeof($pageSection['entryTimes'])){
							array_push($pageSection['exitTimes'],$_POST['time']);
							$entryTimesLastIndex = sizeof($pageSection['entryTimes']) - 1;
							$exitTimesLastIndex = sizeof($pageSection['exitTimes']) - 1;
							$pageSection['totalTime'] = $pageSection['totalTime'] + ($pageSection['exitTimes'][$exitTimesLastIndex] - $pageSection['entryTimes'][$entryTimesLastIndex]);
						}
						if(sizeof($pageSection['focusedExitTimes']) < sizeof($pageSection['focusedEntryTimes'])){
							array_push($pageSection['focusedExitTimes'],$_POST['focusedTime']);
							$focusedEntryTimesLastIndex = sizeof($pageSection['focusedEntryTimes']) - 1;
							$focusedExitTimesLastIndex = sizeof($pageSection['focusedExitTimes']) - 1;
							$pageSection['totalFocusedTime'] = $pageSection['totalFocusedTime'] + ($pageSection['focusedExitTimes'][$focusedExitTimesLastIndex] - $pageSection['focusedEntryTimes'][$focusedEntryTimesLastIndex]);
						}
					}
					$currentPageSectionCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN " . $pageSection['currentPageSection'] . " ";
					$sessTimeCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN " . $pageSection['totalTime'] . " ";
					$focusTimeCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN " . $pageSection['totalFocusedTime'] . " ";
					$lostFocusCountCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN " . $pageSection['lostFocusCount'] . " ";
					$entryTimesCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN '" . implode(",", $pageSection['entryTimes']) . "' ";
					$exitTimesCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN '" . implode(",", $pageSection['exitTimes']) . "' ";
					$focusedEntryTimesCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN '" . implode(",", $pageSection['focusedEntryTimes']) . "' ";
					$focusedExitTimesCaseStmt .= "WHEN '" . $pageSection['sectionId'] . "' THEN '" . implode(",", $pageSection['focusedExitTimes']) . "' ";
				}
				$currentPageSectionCaseStmt .= "ELSE current_page_section END, ";
				$sessTimeCaseStmt .= "ELSE sess_time END, ";
				$focusTimeCaseStmt .= "ELSE focus_time END, ";
				$lostFocusCountCaseStmt .= "ELSE lost_focus_count END, ";
				$entryTimesCaseStmt .= "ELSE entryTimes END, ";
				$exitTimesCaseStmt .= "ELSE exitTimes END, ";
				$focusedEntryTimesCaseStmt .= "ELSE focusedEntryTimes END, ";
				$focusedExitTimesCaseStmt .= "ELSE focusedExitTimes END ";
				$pageSectionUpdateQuery = $pageSectionUpdateQuery
				.$currentPageSectionCaseStmt
				.$sessTimeCaseStmt
				.$focusTimeCaseStmt
				.$lostFocusCountCaseStmt
				.$entryTimesCaseStmt
				.$exitTimesCaseStmt
				.$focusedEntryTimesCaseStmt
				.$focusedExitTimesCaseStmt;
				$pageSectionUpdateQuery .= "WHERE record_id = ".$this->recording_id;
				$this->wp_insights_db_utils->db_query($pageSectionUpdateQuery);
			}
		}
				
		
		////error_log(print_r($pageSections, true));
		
		
		////error_log(print_r($pageSectionUpdateQuery, true));
	}
}
