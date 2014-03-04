<?php

require_once('class-wp-insights-utils.php');
require_once('class-wp-insights-db-utils.php');
require_once('class-browser.php');
require_once('utils/Browscap.php');
class WP_Insights_Recorder {

	protected $cache_dir = null;
	
	protected $browscap_cache_dir = null;

	protected $wp_insights_db_utils = null;

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

	public function store() {	

		if(array_key_exists('isXDR',$_REQUEST) && $_REQUEST['isXDR'] == true) {
			parse_str(file_get_contents('php://input'), $_POST);
		}
		
		if (empty($_REQUEST)) {
			exit;
		}
		$browserAndOSId = $this->getBrowserAndOSDetails();
		
		error_log("vpw : ". $_REQUEST['vpw']);
		error_log("vph : ". $_REQUEST['vph']);

		/* create database entry ---------------------------------------------------- */
		$recorddetails = array(
				"client_id" => WP_Insights_Utils::get_client_id(),
				"file" => "0",
				"raw_url" => $_REQUEST['url'],
				"cleansed_url" => $_REQUEST['url'],
				"os_id" => $browserAndOSId['os_id'],
				"browser_id" => $browserAndOSId['browser_id'],
				"browser_ver" => $browserAndOSId['browser_ver'],
				"user_agent" => $browserAndOSId['user_agent'],
				"ftu" => (int) $_REQUEST['ftu'],
				"ip" => WP_Insights_Utils::get_client_ip() ,
				"scr_width" => (int) $_REQUEST['screenw'],
				"scr_height" => (int) $_REQUEST['screenh'],
				"vp_width" => (int) $_REQUEST['vpw'],
				"vp_height" => (int) $_REQUEST['vph'],
				"doc_width" => (int) $_REQUEST['pagew'],
				"doc_height" => (int) $_REQUEST['pageh'],
				//"sess_date" => current_time('mysql'),
				//"sess_date" => 'NOW()',
				"sess_time" => (float) $_REQUEST['time'],
				"fps" => (int)   $_REQUEST['fps'],
				//"coords_x" => $_REQUEST['xcoords'],
				//"coords_y" => $_REQUEST['ycoords'],
				//"clicks" => $_REQUEST['clicks'],
				"focus_time" => $_REQUEST['focusedTime'],
				"lost_focus_count" => $_REQUEST['lostFocusCount']
		);
		$recorddetailsformat = array(
				'%s',
				'%s',
				'%s',
				'%s',
				'%d',
				'%d',
				'%f',
				'%s',
				'%d',
				'%s',
				'%d',
				'%d',
				'%d',
				'%d',
				'%d',
				'%d',
				'%f',
				'%d',
				'%f',
				'%d'
		);
		
		/* if (get_magic_quotes_gpc()) {
			error_log("Magic Quotes is enabled");
			$hovered_json = urldecode(stripslashes($_POST['elhovered']));
			$clicked_json = urldecode(stripslashes($_POST['elclicked']));
		} else {
			$hovered_json = urldecode($_POST['elhovered']);
			$clicked_json = urldecode($_POST['elclicked']);
		} */

		/* $hovered = json_decode($hovered_json, true);
		$clicked = json_decode($clicked_json, true);
		error_log("Store");
		error_log($_POST['elhovered']);
		error_log($hovered_json);
		error_log(print_r($hovered,true));
		error_log($_POST['elclicked']);
		error_log($clicked_json);
		error_log(print_r($clicked,true)); */
		
		/* $hovered_json = urldecode(stripslashes($_REQUEST['elhovered']));
		$clicked_json = urldecode(stripslashes($_REQUEST['elclicked']));
		$lostFocus_json = urldecode(stripslashes($_REQUEST['ellostfocus']));
		
		if(!empty($hovered_json) && strlen($hovered_json)>2) {
			error_log("Store Inside not empty hovered");
			$recorddetails = array_merge($recorddetails,array(
				"hovered" => $hovered_json
			));
			array_push($recorddetailsformat,"%s");
		}
		
		if(!empty($clicked_json) && strlen($clicked_json)>2) {
			error_log("Store Inside not empty clicked");
			$recorddetails = array_merge($recorddetails,array(
				"clicked" => $clicked_json
			));
			array_push($recorddetailsformat,"%s");
		}
		
		if(!empty($lostFocus_json) && strlen($lostFocus_json)>2) {
			error_log("Store Inside not empty lost Focus");
			$recorddetails = array_merge($recorddetails,array(
					"lost_focus" => $lostFocus_json
			));
			array_push($recorddetailsformat,"%s");
		} */
		
		//error_log(print_r($recorddetails, true));
		//error_log(print_r($recorddetailsformat, true));

		$uid = $this->wp_insights_db_utils->db_insert($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS, $recorddetails, $recorddetailsformat);

		// send user ID back to the record script
		return $uid;
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

		//error_log(print_r($current_browser, true));
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
	
	/* protected function hasDOMChanged($liveDom, $cachedDom) {
		//$liveDom->encoding = 'utf-8';
		//$liveHTMLString = $liveDom->C14N(false, true);
		//$cachedHTMLString = $cachedDom->C14N(false, true);
		//$liveHTML = $liveDom->saveHTML();
		//$liveHTML = html_entity_decode($liveHTML,ENT_QUOTES,'UTF-8');
		//$cachedHTML = $cachedDom->saveHTML();
		$liveDomXpath = new DOMXPath($liveDom);
		foreach ($liveDomXpath->query('//comment()') as $comment) {
			$comment->parentNode->removeChild($comment);
		}
		$cachedDomXpath = new DOMXPath($cachedDom);
		foreach ($cachedDomXpath->query('//comment()') as $comment) {
			$comment->parentNode->removeChild($comment);
		}
		$liveHTML = $liveDom->saveHTML();
		$cachedHTML = $cachedDom->saveHTML();
		//error_log($liveHTML);
		//error_log($cachedHTML);
		if($liveHTML == $cachedHTML) {
			error_log("DOM files are equal");
			return false;
		} else {
			error_log("DOM files are not equal");
			return true;
		}
	}  */
	
	protected function parseContent($webpage) {
		// use the DOM to parse webpage contents
		$dom = new DOMDocument();
		$dom->formatOutput = true;
		$dom->preserveWhiteSpace = false;
		// hide warnings when parsing non valid (X)HTML pages
		@$dom->loadHTML($webpage);
		$wpiScriptElement = $dom->getElementById('wpi-trigger-script');
		//error_log($wpiScriptElement->nodeValue);
		if(!is_null($wpiScriptElement)){
			$wpiScriptElement->parentNode->removeChild($wpiScriptElement);
		}	

		$this->removejscssfile($dom, "smt-record.js", "js");
		$this->removejscssfile($dom, "smt-aux.js", "js");
		$this->removejscssfile($dom, "wpi-js.min.js", "js");
		return $dom;
	}
	
	/* protected function getCachedDOM($cachelog) {
		$cachedWebpageFilePath = $this->cache_dir.$cachelog['file'];
		//error_log($cachedWebpageFilePath);
		if(is_file($cachedWebpageFilePath)) {
			//error_log("Cached html is a file");
			$cachedWebpage = file_get_contents($this->cache_dir.$cachelog['file']);
			$cachedDom = $this->parseContent($cachedWebpage);
			return $cachedDom;
		} else {
			//error_log("Cached html is not a file");
			return false;
		}		
	} */
	
	protected function removejscssfile($dom, $filename, $filetype){
		if($filetype === "js"){
			$targetelement = "script";
		}elseif ($filetype === "css") {
			$targetelement = "link";
		}else {
			$targetelement = "none";
		}
		
		if($filetype === "js"){
			$targetattr = "src";
		}elseif ($filetype === "css") {
			$targetattr = "href";
		}else {
			$targetattr = "none";
		}

		$allsuspects = $dom->getElementsByTagName($targetelement);
		
		foreach($allsuspects as $anSuspect) {
			if(!is_null($anSuspect->getAttribute($targetattr)) && strpos($anSuspect->getAttribute($targetattr), $filename) !== FALSE) {
				$anSuspect->parentNode->removeChild($anSuspect);
			}
		}

	}

	public function cache() {
		
		if(array_key_exists('isXDR',$_REQUEST) && $_REQUEST['isXDR'] == true) {
			parse_str(file_get_contents('php://input'), $_POST);
		}

		if (empty($_POST)) {
			exit;
		}

		$recordingId = $_POST['uid'];
		$html  = rawurldecode(stripslashes($_POST['html']));
		$liveDom = $this->parseContent($html);
		
		
		$year = date("Y");
		$month = date("M");
		$day = date("d");
		$hisdate = date("H-i-s");
		$ext = ".html";
		$relativeDirpath = $year."/".$month."/".$day."/";
		$absoluteDirPath = $this->cache_dir.$relativeDirpath;
		
		WP_Insights_Utils::createDirectory($absoluteDirPath);
		// "March 10th 2006 @ 15h 16m 08s" should create the log file "20060310-151608.html"
		$htmlfile  = (!is_file($hisdate.$ext)) ?
		$hisdate.$ext :
		$hisdate.'-'.mt_rand().$ext; // random seed to avoid duplicated files
		$absolutefilepath = $absoluteDirPath.$htmlfile;
		$relativefilepath = $relativeDirpath.$htmlfile;
		file_put_contents(utf8_encode($absolutefilepath), $liveDom->saveHTML());
				
		$recordsValues  = "file = '".$relativefilepath."'";

		$this->wp_insights_db_utils->db_update($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS, $recordsValues, "id='".$recordingId."'");
		
		// insert new row on TBL_CACHE and look for inserted id
		/*$cachelogdetails = array(
				"file" => $ymddate."/".$htmlfile,
				"url" => $URL,
				"title" => $_POST['urltitle'],
				"saved" => current_time('mysql')
		);
		$cachelogdetailsformat = array(
				'%s',
				'%s',
				'%s',
				'%s'
		);
		$cacheLogid = $this->wp_insights_db_utils->db_insert($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE, $cachelogdetails, $cachelogdetailsformat);
		
		
		// check proxy requests
		$pattern = "proxy/index.php?url=";
		if (strpos($URL, $pattern)) {
			list($remove, $URL) = explode($pattern, $URL);
			$URL = base64_decode($URL);
		}
		
		$cacheSeconds = $this->wp_insights_db_utils->db_option("cache_seconds");
		// get the most recent version saved of this page
		$cachelog = $this->wp_insights_db_utils->db_select($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE, "id,file,UNIX_TIMESTAMP(saved) as savetime", "url='".$URL."' ORDER BY id DESC");
				
		// check if url exists on cache and caching is enabled
		if ($cachelog && $cacheSeconds > 0)
		{
			// check if url exists on cache, and if it should be stored (again) on cache
			if (time() - $cachelog['savetime'] < $cacheSeconds) {
				//cached webpage is still valid.				
				$cacheExpired = false;
			} else {
				// cache expired
				$cacheExpired = true;
			}
		} else {
			// cache is disabled
			$cacheExpired = true;
		}
		
		if($cacheExpired) {
			//error_log("Cache didnt expire");
			// get remote webpage
			$request = WP_Insights_Utils::get_remote_webpage(
					$URL,
					array( CURLOPT_COOKIE => $_POST['cookies'] )
			);
			
			$webpage = $request['content'];
			
			if ($request['errnum'] != CURLE_OK || $request['http_code'] != 200)
			{
				//error_log("Inside remote webpage not ok");
				$webpage = error_webpage('<h1>Could not fetch page</h1><pre>'.print_r($request, true).'</pre>');
			} 
			
			$liveDom = $this->parseContent($webpage);			
			$cachedDom = $this->getCachedDOM($cachelog);
			
			if($cachedDom != false){
				//error_log("Cached webpage file is available");
				if($this->hasDOMChanged($liveDom, $cachedDom)){
					//error_log("DOM has changed");
					$shouldSaveLiveDom = true;
				} else {
					//error_log("DOM has not changed");
					$shouldSaveLiveDom = false;
				}
			} else {
				//error_log("Cached webpage file is not available");
				$shouldSaveLiveDom = true;
			}
			
			if($shouldSaveLiveDom){
				//error_log("Should save live DOM");
				// set HTML log name
				$date = date("Ymd-His");
				$ext = ".html";
				// "March 10th 2006 @ 15h 16m 08s" should create the log file "20060310-151608.html"
				$htmlfile  = (!is_file($this->cache_dir.$date.$ext)) ?
				$date.$ext :
				$date.'-'.mt_rand().$ext; // random seed to avoid duplicated files
				// store (UTF-8 encoded) log
				//$liveDom->saveHTMLFile( utf8_encode($this->cache_dir.$htmlfile) );
				//$liveDom->saveHTMLFile( $this->cache_dir.$htmlfile );
				file_put_contents(utf8_encode($this->cache_dir.$htmlfile), $liveDom->saveHTML());
				// insert new row on TBL_CACHE and look for inserted id
				$cachelogdetails = array(
						"file" => $htmlfile,
						"url" => $URL,
						"title" => $_POST['urltitle'],
						"saved" => current_time('mysql')
				);
				$cachelogdetailsformat = array(
						'%s',
						'%s',
						'%s',
						'%s'
				);
				$cacheLogid = $this->wp_insights_db_utils->db_insert($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE, $cachelogdetails, $cachelogdetailsformat);
			} else {
				//error_log("Can use the cached DOM");
				// get HTML log id
				$cacheLogid = $cachelog['id'];
				$cacheValues =  "saved = '".current_time('mysql')."'";
				$this->wp_insights_db_utils->db_update($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE, $cacheValues, "id='".$cacheLogid."'");
			}
			
		} else {
			//error_log("Cache expired");
			// get HTML log id
			$cacheLogid = $cachelog['id'];
		}*/		
		
		
	}

	public function append() {
		
		if(array_key_exists('isXDR',$_REQUEST) && $_REQUEST['isXDR'] == true) {
			parse_str(file_get_contents('php://input'), $_POST);
		}
		
		if (empty($_POST)) {
			exit;
		}
		$values  = "sess_time = '".                         (float) $_POST['time']    ."',";
		//$values .= "vp_width  = '".                         (int)   $_POST['vpw']   ."',";
		//$values .= "vp_height = '".                         (int)   $_POST['vph']   ."',";
		$values .= "focus_time = '".                        (float) $_POST['focusedTime']   ."',";
		$values .= "lost_focus_count = '".                  (int)   $_POST['lostFocusCount']   ."',";
		$values .= "exit_page_section = '".                         $_POST['currentPageSection']   ."',";
		$values .= "coords_x  = CONCAT(COALESCE(coords_x, ''), ',". $_POST['xcoords'] ."'),";
		$values .= "coords_y  = CONCAT(COALESCE(coords_y, ''), ',". $_POST['ycoords'] ."'),";
		$values .= "clicks    = CONCAT(COALESCE(clicks,   ''), ',". $_POST['clicks']  ."')";

		/* if (get_magic_quotes_gpc()) {
			error_log("Magic Quotes is enabled");
			$hovered_json = urldecode(stripslashes($_POST['elhovered']));
			$clicked_json = urldecode(stripslashes($_POST['elclicked']));
		} else {
			$hovered_json = urldecode($_POST['elhovered']);
			$clicked_json = urldecode($_POST['elclicked']);
		} */
		$hovered_json = urldecode(stripslashes($_POST['elhovered']));
		$clicked_json = urldecode(stripslashes($_POST['elclicked']));
		$lostFocus_json = urldecode(stripslashes($_POST['ellostfocus']));
		$scrolls_json = urldecode(stripslashes($_POST['scrolls']));
		
		/* $hovered = json_decode($hovered_json, true);
		$clicked = json_decode($clicked_json, true);
		error_log("Append");
		error_log($_POST['elhovered']);
		error_log($hovered_json);
		error_log(print_r($hovered,true));
		error_log($_POST['elclicked']);
		error_log($clicked_json);
		error_log(print_r($clicked,true)); */
		
		if(!empty($hovered_json) && strlen($hovered_json)>2) {
			error_log("Append Inside not empty hovered");
			$values .= ",hovered   = CONCAT(COALESCE(hovered,  ''), '|~|". esc_sql($hovered_json) ."')";
		}
		
		if(!empty($clicked_json) && strlen($clicked_json)>2) {
			error_log("Append Inside not empty clicked");
			$values .= ",clicked   = CONCAT(COALESCE(clicked,  ''), '|~|". esc_sql($clicked_json) ."')";
		}
		
		if(!empty($lostFocus_json) && strlen($lostFocus_json)>2) {
			error_log("Append Inside not empty lost focus");
			$values .= ",lost_focus   = CONCAT(COALESCE(lost_focus,  ''), '|~|". esc_sql($lostFocus_json) ."')";
		}
		
		if(!empty($lostFocus_json) && strlen($lostFocus_json)>2) {
			error_log("Append Inside not empty scrolls");
			$values .= ",scrolls = '".$scrolls_json."'";
		}

		$this->wp_insights_db_utils->db_update($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS, $values, "id='".$_POST['uid']."'");
		
		$pageSections_json = urldecode(stripslashes($_POST['pageSections']));
		$currentPageSection = urldecode(stripslashes($_POST['currentPageSection']));
		$pageSections  = json_decode($pageSections_json, true);
		
		if(sizeof($pageSections) > 0) {
			$pagesections_table = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_PAGE_SECTIONS;
			$psInsertCheckQuery = "SELECT count(id) as count from $pagesections_table WHERE record_id = '".$_POST['uid']."'";
			error_log("psInsertCheckQuery : $psInsertCheckQuery");
			$psRecordCount = $this->wp_insights_db_utils->db_query($psInsertCheckQuery);
			error_log("psRecordCount : ".print_r($psRecordCount,true));
			if(null != $psRecordCount[0]['count'] && $psRecordCount[0]['count']>0) {
				error_log("Inside update");
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
				$pageSectionUpdateQuery .= "WHERE record_id = ".$_POST['uid'];
				$this->wp_insights_db_utils->db_query($pageSectionUpdateQuery);
			} else {
				error_log("Inside insert");
				$pageSectionInsertQuery = "INSERT into $pagesections_table (record_id, section_order, section_id, section_name, sess_time, focus_time, current_page_section, lost_focus_count, entryTimes, exitTimes, focusedEntryTimes, focusedExitTimes) VALUES ";
				$pageSectionValues = " ";
				foreach($pageSections as $pageSection){
					$pageSectionValues .= "(".$_POST['uid'].",";
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

		
		
		//error_log(print_r($pageSections, true));
		
		
		//error_log(print_r($pageSectionUpdateQuery, true));
	}
}
