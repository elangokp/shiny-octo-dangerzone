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
		
		if (empty($_POST)) {
			exit;
		}
		
		/* create database entry ---------------------------------------------------- */
		$recorddetails = array(
				"client_id" => WP_Insights_Utils::get_client_id(),
				"cache_id" => 0,
				"os_id" => 0,
				"browser_id" => 0,
				"browser_ver" => 0,
				"user_agent" => 0,
				"ftu" => (int) $_POST['ftu'],
				"ip" => WP_Insights_Utils::get_client_ip() ,
				"scr_width" => (int) $_POST['screenw'],
				"scr_height" => (int) $_POST['screenh'],
				"vp_width" => (int) $_POST['pagew'],
				"vp_height" => (int) $_POST['pageh'],
				"sess_date" => current_time('mysql'),
				//"sess_date" => 'NOW()',
				"sess_time" => (float) $_POST['time'],
				"fps" => (int)   $_POST['fps'],
				"coords_x" => $_POST['xcoords'],
				"coords_y" => $_POST['ycoords'],
				"clicks" => $_POST['clicks'],
				"focus_time" => $_POST['focusedTime'],
				"lost_focus_count" => $_POST['lostFocusCount']
		);
		$recorddetailsformat = array(
				'%s',
				'%d',
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
				'%s',
				'%f',
				'%d',
				'%s',
				'%s',
				'%s',
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
		$hovered_json = urldecode(stripslashes($_POST['elhovered']));
		$clicked_json = urldecode(stripslashes($_POST['elclicked']));
		$lostFocus_json = urldecode(stripslashes($_POST['ellostfocus']));
		/* $hovered = json_decode($hovered_json, true);
		$clicked = json_decode($clicked_json, true);
		error_log("Store");
		error_log($_POST['elhovered']);
		error_log($hovered_json);
		error_log(print_r($hovered,true));
		error_log($_POST['elclicked']);
		error_log($clicked_json);
		error_log(print_r($clicked,true)); */
		
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
		}
		
		//error_log(print_r($recorddetails, true));
		//error_log(print_r($recorddetailsformat, true));

		$uid = $this->wp_insights_db_utils->db_insert($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS, $recorddetails, $recorddetailsformat);

		// send user ID back to the record script
		return $uid;
	}
	
	protected function getBrowserAndOSDetails() {
		/* client browser stats ----------------------------------------------------- */
		
		//$browser = new Browser();
		$bc = new Browscap($this->cache_dir."browscapcache/");
		$current_browser = $bc->getBrowser();
		
		// save browser id
		$bname = $this->wp_insights_db_utils->db_select($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_BROWSERS, "id", "name='".$current_browser->Parent."'");
		if (!$bname) {
			
			$browserName = $current_browser->Parent;
			$isBot = 0;
			if (strpos($browserName, 'GoogleBot') !== FALSE) {
				$isBot = 1;
			} elseif (strpos($browserName, 'Yahoo! Slurp') !== FALSE) {
				$isBot = 1;
			} else {
				$isBot = 0;
			}
			
			$browserdetails = array(
					"name" => $current_browser->Parent,
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
		$osname = $this->wp_insights_db_utils->db_select($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_OS, "id", "name='".$current_browser->Platform_Description."'");
		if (!$osname) {
			$osdetails = array(
					"name" => $current_browser->Platform_Description
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
				'browser_ver' => (float) $current_browser->Version,
				'user_agent' => $current_browser->browser_name
		);
		
		return $browserAndOSId;
		
	}
	
	protected function hasDOMChanged($liveDom, $cachedDom) {
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
	} 
	
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
		return $dom;
	}
	
	protected function getCachedDOM($cachelog) {
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
	}
	
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

		$URL = $_POST['url'];
		$recordingId = $_POST['uid'];
		$html  = rawurldecode(stripslashes($_POST['html']));
		$liveDom = $this->parseContent($html);
		//error_log("URL is : ".$URL);
		
		$browserAndOSId = $this->getBrowserAndOSDetails();
		
		$ymddate = date("Ymd");
		$hisdate = date("His");
		$ext = ".html";
		$dirPath = $this->cache_dir.$ymddate."/";
		WP_Insights_Utils::createDirectory($dirPath);
		// "March 10th 2006 @ 15h 16m 08s" should create the log file "20060310-151608.html"
		$htmlfile  = (!is_file($dirPath.$hisdate.$ext)) ?
		$hisdate.$ext :
		$hisdate.'-'.mt_rand().$ext; // random seed to avoid duplicated files
		file_put_contents(utf8_encode($dirPath.$htmlfile), $liveDom->saveHTML());
		// insert new row on TBL_CACHE and look for inserted id
		$cachelogdetails = array(
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
		
		/**
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
		
		$recordsValues  = "cache_id = ".$cacheLogid.",";
		$recordsValues .= "os_id = ".$browserAndOSId['os_id'].",";
		$recordsValues .= "browser_id = ".$browserAndOSId['browser_id'].",";
		$recordsValues .= "browser_ver = '".$browserAndOSId['browser_ver']."',";
		$recordsValues .= "user_agent = '".$browserAndOSId['user_agent']."'";
		$this->wp_insights_db_utils->db_update($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS, $recordsValues, "id='".$recordingId."'");
		
	}

	public function append() {
		
		if(array_key_exists('isXDR',$_REQUEST) && $_REQUEST['isXDR'] == true) {
			parse_str(file_get_contents('php://input'), $_POST);
		}
		
		if (empty($_POST)) {
			exit;
		}
		$values  = "sess_time = '".                         (float) $_POST['time']    ."',";
		$values .= "vp_width  = '".                         (int)   $_POST['pagew']   ."',";
		$values .= "vp_height = '".                         (int)   $_POST['pageh']   ."',";
		$values .= "focus_time = '".                        (int)   $_POST['focusedTime']   ."',";
		$values .= "lost_focus_count = '".                  (int)   $_POST['lostFocusCount']   ."',";
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

		$this->wp_insights_db_utils->db_update($this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS, $values, "id='".$_POST['uid']."'");
	}
}