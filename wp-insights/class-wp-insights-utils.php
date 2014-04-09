<?php

class WP_Insights_Utils {
	
	const NOT_RECORDABLE_BACKEND_URL = 'not_recordable_backend_url';
	
	const EXCEEDS_MAX_CONCURRENT_RECORDINGS = 'exceeds_max_concurrent_recordings';
	
	const CAN_RECORD = 'can_record';
	
	public static function should_wpi_record() {
		$current_url = WP_Insights_Utils::getCurrentPageURL();
		if(is_admin() || strpos($current_url,"plugins/wp-insights/views") !== false || strpos($current_url,"wp-cron.php") !== false || strpos($current_url,"wp-login.php") !== false) {
			return self::NOT_RECORDABLE_BACKEND_URL;
		} else {
			return false;
		}
	}
	
	/** askapache_get_process_count()
	 * Returns the number of running processes
	 *
	 * @version 1.4
	 *
	 * @return int
	 */
	public static function askapache_get_process_count() {
		static $ver, $runs = 0;
	
		// check if php version supports clearstatcache params, but only check once
		if ( is_null( $ver ) )
			$ver = version_compare( PHP_VERSION, '5.3.0', '>=' );
	
		// Only call clearstatcache() if function called more than once */
		if ( $runs++ > 0 ) { // checks if $runs > 0, then increments $runs by one.
	
			// if php version is >= 5.3.0
			if ( $ver ) {
				clearstatcache( true, '/proc' );
			} else {
				// if php version is < 5.3.0
				clearstatcache();
			}
		}
	
		$stat = stat( '/proc' );
	
		// if stat succeeds and nlink value is present return it, otherwise return 0
		return ( ( false !== $stat && isset( $stat[3] ) ) ? $stat[3] : 0 );
	}

	/**
	 * Gets URL contents within the HTTP server response header fields.
	 * This public static function uses cURL to fetch remote pages.
	 * @param  string   $URL   web page URL
	 * @param  array    $opts  custom cURL options
	 * @return array           Transfer information (the web page content is in the "content" array key)
	 * @link  http://es2.php.net/manual/en/curl.constants.php
	 * @link  http://es2.php.net/manual/en/function.curl-setopt.php
	 */
	public static function get_remote_webpage($URL, $opts = array())
	{
		// basic options (regular GET requests)
		$options = array(
				CURLOPT_URL            => $URL,
				CURLOPT_USERAGENT      => $_SERVER['HTTP_USER_AGENT'],
				CURLOPT_RETURNTRANSFER => true,   // return transfer as a string
				CURLOPT_HEADER         => false,  // don't return headers
				CURLOPT_ENCODING       => "",     // handle all encodings
				CURLOPT_CONNECTTIMEOUT => 10,     // timeout on connect
				CURLOPT_TIMEOUT        => 60,     // timeout on response
				CURLOPT_SSL_VERIFYPEER => false,  // try to fetch SSL pages too
				CURLOPT_SSL_VERIFYHOST => false
		);

		/* cURL should follow redirections!
		 * But safe mode (deprecated) and open_basedir (useless) are incompatible
		* with CURLOPT_FOLLOWLOCATION.
		* Also see this solution: http://www.php.net/manual/en/function.curl-setopt.php#71313
		*/
		if (!ini_get('safe_mode') && !ini_get('open_basedir')) {
			$options[ CURLOPT_FOLLOWLOCATION ] = true;  // follow redirects
			$options[ CURLOPT_AUTOREFERER ]    = true;  // automatically set the Referer: field
			$options[ CURLOPT_MAXREDIRS ]      = 5;     // limit redirect loops

		}

		// add custom cURL options (e.g. POST requests, cookies, etc.)
		if (count($opts) > 0)
		{
			foreach ($opts as $key => $value) {
				$options[$key] = $value;
			}
		}

		$ch = curl_init();

		curl_setopt_array($ch, $options);

		$content  = curl_exec($ch);     // the Web page
		$transfer = curl_getinfo($ch);  // transfer information (http://www.php.net/manual/en/function.curl-getinfo.php)
		$errnum   = curl_errno($ch);    // codes: http://curl.haxx.se/libcurl/c/libcurl-errors.html
		$errmsg   = curl_error($ch);    // empty string on success

		curl_close($ch);

		// extend transfer info
		$transfer['errnum']  = $errnum;
		$transfer['errmsg']  = $errmsg;
		$transfer['content'] = $content;
		// $transfer['url'] is the final URL after redirections, if CURLOPT_FOLLOWLOCATION is set to true

		return $transfer;
	}
	
	public static function removejscssfile(&$dom, $filename, $filetype){
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
	
	public static function parseContent($webpage) {
		// use the DOM to parse webpage contents
		$dom = new DOMDocument();
		$dom->formatOutput = true;
		$dom->preserveWhiteSpace = false;
		$decoded_webpage  = rawurldecode(stripslashes($webpage));
		// hide warnings when parsing non valid (X)HTML pages
		@$dom->loadHTML('<?xml encoding="utf-8" ?>' . $decoded_webpage);
		$wpiScriptElement = $dom->getElementById('wpi-trigger-script');
		//error_log($wpiScriptElement->nodeValue);
		if(!is_null($wpiScriptElement)){
			$wpiScriptElement->parentNode->removeChild($wpiScriptElement);
		}
	
		WP_Insights_Utils::removejscssfile($dom, "smt-record.js", "js");
		WP_Insights_Utils::removejscssfile($dom, "smt-aux.js", "js");
		WP_Insights_Utils::removejscssfile($dom, "wpi-js.min.js", "js");
	
		return $dom;
	}

	/**
	 * Assigns an unique identifier for each client machine.
	 * @return  string
	 */
	public static function get_visitor_id()
	{
		if (isset($_COOKIE['wpi-visitor-id'])) {
			$id = $_COOKIE['wpi-visitor-id'];
		} else {
			$id = 0;
		}
		return $id;
	}
	
	public static function getCurrentPageURL() {
		$pageURL = 'http';
		if (isset($_SERVER["HTTPS"]) && $_SERVER["HTTPS"] == "on") {$pageURL .= "s";}
		$pageURL .= "://";
		if ($_SERVER["SERVER_PORT"] != "80") {
			$pageURL .= $_SERVER["SERVER_NAME"].":".$_SERVER["SERVER_PORT"].$_SERVER["REQUEST_URI"];
		} else {
			$pageURL .= $_SERVER["SERVER_NAME"].$_SERVER["REQUEST_URI"];
		}
		return $pageURL;
	}

	/**
		* Gets the client IP.
		* @return  string
	 */
	public static function get_client_ip()
	{
	 if( !empty($_SERVER['HTTP_X_FORWARDED_FOR']) ) {
	 	$final_ip =
	 	( !empty($_SERVER['REMOTE_ADDR']) ) ?
	 	$_SERVER['REMOTE_ADDR'] :
	 	( ( !empty($_ENV['REMOTE_ADDR']) ) ?
	 			$_ENV['REMOTE_ADDR'] :
	 			"unknown" );
	 	$entries = split('[, ]', $_SERVER['HTTP_X_FORWARDED_FOR']);
	 	reset($entries);
			while (list(, $entry) = each($entries)) {
				$entry = trim($entry);
				if ( preg_match("/^([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)/", $entry, $ip_list) ) {
					// see http://www.faqs.org/rfcs/rfc1918.html
					$private_ip = array(
							'/^0\./',
							'/^127\.0\.0\.1/',
							'/^192\.168\..*/',
							'/^172\.((1[6-9])|(2[0-9])|(3[0-1]))\..*/',
							'/^10\..*/'
					);

					$found_ip = preg_replace($private_ip, $final_ip, $ip_list[1]);

					if ($final_ip != $found_ip) {
						$final_ip = $found_ip;
						break;
					}
				}
			}
	 } else {
	 	$final_ip =
	 	( !empty($_SERVER['REMOTE_ADDR']) ) ?
	 	$_SERVER['REMOTE_ADDR'] :
	 	( ( !empty($_ENV['REMOTE_ADDR']) ) ?
	 			$_ENV['REMOTE_ADDR'] :
	 			"unknown" );
	 }

	 return $final_ip;
	}
	
	/**
	 * Computes the frequency of each $input array member.
	 * @param   mixed  $input        input string or array of strings to parse ($_POST vars are sent as strings)
	 * @param   int    $threshold    frequencies (in percentage) under this $threshold will not be stored (default: 1%)
	 * @return  array                A sorted associative array in the form '[mostFrequentItem]=>frequency,...,[lessFrequentItem]=>frequency'
	 */
	public static function array_frequency($input, $threshold = 1)
	{
		// convert $input in a real PHP array
		$input = (!is_array($input)) ? explode(",", $input) : $input;
		// count occurrences (array keys must be strings or integers)
		$unique = array_count_values($input); // returns an associative array of values from $input as keys and their count as value.
		// $input is an associative array(string => int)
		$unique = array_sanitize($unique);
	
		// exit if there are no data
		if (!$unique) return false;
	
		// compute sum
		$sum  = array_sum($unique);
		$data = array();
		// now calculate the frequency of each input element (in percentage)
		foreach ($unique as $k => $value) {
			$frequency = round(100*$value/$sum, 2);
			// store frecuencies above given threshold
			if ($frequency > $threshold) {
				$data[$k] = $frequency;
			}
		}
		// order by frecuency
		arsort($data);
	
		return $data;
	}
	
	/**
	 * Removes empty items (both key and value) from an associative numeric array.
	 * @param   mixed  $input   array or string to sanitize
	 * @return  mixed           Sanitized array or string (used for widget tracking)
	 */
	public static function array_sanitize($input)
	{
		$isString = false;
	
		if (!is_array($input)) {
			$input = explode(",", $input);
			$isString = true;
		}
	
		$temp = array();
		foreach ($input as $key => $value) {
			// avoid buggy values
			$key = trim($key);
			$value = trim($value);
			// store valid data
			if (!empty($key) && !empty($value)) {
				$temp[$key] = $value;
			}
		}
	
		return ($isString) ? implode(",", $temp) : $temp;
	}
	
	/**
	 * Convert null values to empty strings. Used to generate valid JSON arrays.
	 * @param   array  $input   array
	 * @return  array           Parsed array
	 */
	public static function array_null($input)
	{
		if (!is_array($input)) {
			$input = explode(",", $input);
		}
	
		$temp = array();
		foreach ($input as $key => $value) {
			// store valid data
			$temp[$key] = (!empty($value)) ? $value : 0;
		}
	
		return $temp;
	}
	
	/**
	 * Does a weighted sum for a given multidimensional numeric array and computed weights.
	 * @param   array  $input     multidimensional array (matrix)
	 * @param   array  $weights   weights
	 * @return  array             Weighted sum
	 * @link    http://www.compapp.dcu.ie/~humphrys/PhD/e.html
	 */
	public static function array_avg_weighted($input, $weights)
	{
		$sumArray = array();
	
		foreach ($input as $arrItem) {
			$sumArray[] = array_avg($arrItem) * count($arrItem) / max($weights);
		}
	
		return $sumArray;
	}
	
	/**
	 * Computes the average sum of a numeric array.
	 * @param   array  $input   array or set of arrays (matrix)
	 * @return  float           Array average
	 */
	public static function array_avg($input)
	{
		return round( array_sum($input) / count($input), 2);
	}
	
	/**
	 * Computes the average sum of a matrix, assuming that each row is a numeric array.
	 * @param   array $matrix a set of arrays (matrix)
	 * @return  float         matrix average value
	 */
	public static function matrix_avg($matrix)
	{
		$sum = 0;
		$count = 0;
	
		foreach ($matrix as $arrItem)
		{
			if (!is_array($arrItem)) { $arrItem = explode(",", $arrItem); }
	
			$sum += array_avg($arrItem);
			// note that this is an accumulative sum
			++$count;
		}
	
		return round( $sum/$count, 2 );
	}
	
	/**
	 * Computes the variance of a numeric array.
	 * @param   array  $input   array
	 * @return  int             Array index
	 */
	public static function array_sd($input)
	{
		$variance = 0;
		$mean = array_avg($input);
		foreach ($input as $elem) {
			$variance += ($elem - $mean) * ($elem - $mean);
		}
	
		return round( sqrt($variance/count($input)), 2 );
	}
	
	/**
	 * Computes the standard deviation of a matrix, assuming that each row is a numeric array.
	 * @param   array $matrix a set of arrays (matrix)
	 * @return  float         matrix average value
	 */
	public static function matrix_sd($matrix)
	{
		$sd = 0;
		$count = 0;
	
		foreach ($matrix as $arrItem)
		{
			if (!is_array($arrItem)) { $arrItem = explode(",", $arrItem); }
	
			$sd += array_sd($arrItem);
			// note that we can have more than one input array
			++$count;
		}
	
		return round( $sd/$count, 2 );
	}
	
	/**
	 * Gets the array index that has the maximum value.
	 * @param   array  $input   array
	 * @return  int             Array index
	 */
	public static function array_argmax($input)
	{
		$max = max($input);
		foreach ($input as $key => $value)
		{
			if ($value == $max) {
				$maxIndex = $key;
				break;
			}
		}
	
		return $maxIndex;
	}
	
	/**
	 * Gets the array index that has the minimum value.
	 * @param   array  $input   array
	 * @return  int             Array index
	 */
	public static function array_argmin($input)
	{
		$min = min($input);
		foreach ($input as $key => $value)
		{
			if ($value == $min) {
				$minIndex = $key;
				break;
			}
		}
	
		return $minIndex;
	}
	
	/**
	 * De-nests nested arrays within the given array.
	 * @autor DZone Snippets
	 * @link  http://snippets.dzone.com/posts/show/4660
	 */
	public static function array_flatten($input)
	{
		$i = 0;
		while ($i < count($input))
		{
			if (is_array($input[$i])) {
				array_splice($input, $i, 1, $input[$i]);
			} else {
				++$i;
			}
		}
	
		return $input;
	}
	
	/**
	 * Masks a given client ID string, just for pretty reading.
	 * @param  string   $hash   client ID
	 * @return string           Pretty-formatted client ID
	 */
	public static function mask_client($hash)
	{
		$half = strlen($hash) / 2;
	
		return substr($hash, -$half, $half);
	}
	
	/**
	 * Displays a default error page.
	 * Used when a cached page is deleted, as well as when cURL cannot fetch a remote page.
	 * @param  string   $bodyText additional info to display on page body
	 * @return string             The error page
	 */
	
	public static function error_webpage($bodyText = "")
	{
		$webpage = '<html><head><title>Error</title></head><body>'.$bodyText.'</body></html>';
	
		return $webpage;
	}
	
	/**
	 * Makes an HTTP 1.1 compliant redirect.
	 * Absolute URLs are required, though all modern browsers support relative URLs.
	 * @param   string    $path  where to go to, starting at server root (default: none)
	 */
	public static function url_redirect($path = "")
	{
		$url = url_get_server();
	
		if (empty($path)) { $path = $url; }
		// check that server url is on the $path argument
		if (strpos($path, $url) === false) { $path = $url.$path; }
	
		header("Location: ".$path);
		exit;
	}
	
	/**
	 * Gets the URL of current server (protocol + domain).
	 * @return  string             Full URL
	 */
	public static function url_get_server()
	{
		//$protocol = "http://";
		$protocol = "http" . ((!empty($_SERVER['HTTPS']) && $_SERVER['HTTPS'] != "off") ? "s" : null) . "://";
	
		$host = $_SERVER['HTTP_HOST']; // reliable in virtual hosts
		if (empty($host)) {
			$host = $_SERVER['SERVER_NAME'];
		}
	
		return $protocol.$host;
	}
	
	/**
	 * Gets the full path to the current PHP file (protocol + domain + paths/to/file).
	 * @param   boolean  $fullURI  append the query string, if any (default: false)
	 * @return  string             Full URL
	 */
	public static function url_get_current($fullURI = false)
	{
		// quick check:
		$url  = self::url_get_server();
		$url .= $_SERVER['SCRIPT_NAME'];
		if ($fullURI && $_SERVER['QUERY_STRING']) { $url .= '?'.$_SERVER['QUERY_STRING']; }
	
		return $url;
	}
	
	/**
	 * Gets the base path of a URL.
	 * @param   string  $url  input URL
	 * @return  string        Base URL
	 */
	public static function url_get_base($url)
	{
		// split url in dirs
		$paths = explode("/", $url);
		// short URLs like http://server.com should be fixed
		if (count($paths) > 3) {
			// remove last element, so we do not have to worry about the query string (?var1=value1&var2=value2#anchor...)
			array_pop($paths);
		}
		// and we have the BASE href
		$base = implode("/", $paths) . "/";
	
		return $base;
	}
	
	public static function startsWith($haystack, $needle)
	{
		return $needle === "" || strpos($haystack, $needle) === 0;
	}
	
	public static function endsWith($haystack, $needle)
	{
		return $needle === "" || substr($haystack, -strlen($needle)) === $needle;
	}
	
	public static function createDirectory($dirPath) {
		
			if (substr($dirPath, strlen($dirPath) - 1, 1) != '/') {
				$dirPath .= '/';
			}
			
			if (! is_dir($dirPath)) {
				mkdir($dirPath, 0755, true);
			}
	}
	
	public static function deleteDirectory($dirPath) {
		if (! is_dir($dirPath)) {
			throw new InvalidArgumentException("$dirPath must be a directory");
		}
		if (substr($dirPath, strlen($dirPath) - 1, 1) != '/') {
			$dirPath .= '/';
		}
		$files = glob($dirPath . '*', GLOB_MARK);
		foreach ($files as $file) {
			if (is_dir($file)) {
				self::deleteDirectory($file);
			} else {
				unlink($file);
			}
		}
		rmdir($dirPath);
	}
	
	/**
	 * Merges vertical and horizontal coordinates in a bidimensional point array.
	 * Stops coordinates (hesitations) are removed.
	 * @param   array  $xcoords        horizontal coordinates
	 * @param   array  $ycoords        vertical coordinates
	 * @param   array  $getDistances   if TRUE, the result array contains euclidean distances
	 * @return  array                  2D points or euclidean distances array
	 */
	public static function convert_points($xcoords, $ycoords, $getDistances = false, $round = false)
	{
		// initialize points array
		$pointArray = array();
		// check for illegal offsets on $coords
		$maxCount = count($xcoords) - 1;
		// transform arrays in a single points array
		foreach ($xcoords as $i => $value)
		{
			if($round){
				$p = new Point(round($value,-1), round($ycoords[$i], -1));
			} else {
				$p = new Point($value, $ycoords[$i]);
			}			
			// check if next point exists
			if ($i >= $maxCount) { break; }
			// ok
			$q = new Point($xcoords[$i + 1], $ycoords[$i + 1]);
			$distance = $p->getDistance($q);
			// check
			if ($getDistances) {
				$pointArray[] = $distance;
			} else {
				// append point to the points array, discarding null distances
				if ($distance > 0) { $pointArray[] = $p->toString(); }
			}
		}
	
		return $pointArray;
	}
	
	/**
	 * Counts the number of mouse clicks.
	 * Drag and drop traces are removed.
	 * @param   array  $clicks   array of click types (from Motorola protocol)
	 * @return  int              number of clicks
	 */
	public static function get_click_coordinates($coords_x, $coords_y, $clicks)
	{
		// check
		if (!is_array($coords_x)) { $coords_x = explode(",", $coords_x); }
		if (!is_array($coords_y)) { $coords_y = explode(",", $coords_y); }
		if (!is_array($clicks)) { $clicks = explode(",", $clicks); }
	
		$clickCoords = array(
				"x" => array(),
				"y" => array()
		);
		foreach ($clicks as $i => $value)
		{
			$currClickX = $value > 0 ? $coords_x[$i] : 0;
			$currClickY = $value > 0 ? $coords_y[$i] : 0;
			if($currClickX != 0 && $currClickY != 0) {
				$clickCoords['x'][] = $currClickX;
				$clickCoords['y'][] = $currClickY;
			}			
		}
	
		return $clickCoords;
	}
	
	/**
	 * Counts the number of mouse clicks.
	 * Drag and drop traces are removed.
	 * @param   array  $clicks   array of click types (from Motorola protocol)
	 * @return  int              number of clicks
	 */
	public static function count_clicks($clicks)
	{
		$numClicks = 0;
	
		if (!is_array($clicks)) { $clicks = explode(",", $clicks); }
	
		$maxCount = count($clicks) - 1;
		foreach ($clicks as $i => $value)
		{
			// check if next point exists
			if ($i >= $maxCount) { break; }
	
			$next = $clicks[$i + 1];
			if ($value > 0 && $value != $next) {
				$numClicks++;
			}
		}
	
		return $numClicks;
	}
	
	public static function timeago($time)
	{
		$periods = array("second", "minute", "hour", "day", "week", "month", "year", "decade");
		$lengths = array("60","60","24","7","4.35","12","10");

		$now = time();

		$difference     = $now - $time;
		$tense         = "ago";

		for($j = 0; $difference >= $lengths[$j] && $j < count($lengths)-1; $j++)
		{
			$difference = $difference / $lengths[$j];
		}

		$difference = round($difference);

		if($difference != 1)
		{
			$periods[$j].= "s";
		}

		return "$difference $periods[$j] $tense";
	}
}