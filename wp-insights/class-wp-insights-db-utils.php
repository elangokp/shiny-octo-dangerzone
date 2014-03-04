<?php
require_once( ABSPATH . 'wp-admin/includes/upgrade.php' );
class WP_Insights_DB_Utils {
	
	/** Table prefix of wordpress tables. */
	//private $tbl_wpdb_prefix;
	//const TBL_WPDB_PREFIX = 
	
	/** Table prefix for all wp insights tables. */
	const TBL_PLUGIN_PREFIX = 'wp_ins_';
	
	/** Table for storing wp insights records. */
	const TBL_RECORDS = 'records';
	
	/** Table for storing wp insights page section data. */
	const TBL_PAGE_SECTIONS = 'pagesections';
	
	/** Table for caching HTML logs. */
	const TBL_CACHE = 'cache';
	
	/** Table for storing browser names. */
	const TBL_BROWSERS = 'browsers';
	
	/** Table for storing operating system names. */
	const TBL_OS = 'os';
	
	/** Table for registered users. */
	const TBL_USERS = 'users';
	
	/** Table for managing user roles. */
	const TBL_ROLES = 'roles';
	
	/** Table for registering extension modules. */
	const TBL_EXTS = 'exts';
	
	/** Table for customizing CMS options. */
	const TBL_OPTIONS = 'options';
	
	/** Table for customizing JS replay options. */
	const TBL_JSOPT = 'jsopt';
	
	private $look_up_tables = array(self::TBL_RECORDS,self::TBL_CACHE,self::TBL_BROWSERS,self::TBL_OS,self::TBL_USERS,self::TBL_ROLES,self::TBL_EXTS,self::TBL_OPTIONS,self::TBL_JSOPT);
	
	protected static $instance = null;
	
	protected $wp_insights_wpdb = null;
	
	private function __construct() {
	
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
	
	public function setWpdb($given_wpdb) {
		$this->wp_insights_wpdb = $given_wpdb;
	}
	
	public function getWpdb() {
		return $this->wp_insights_wpdb;
	}
	
	/**
	 * Performs a generic query to database.
	 * @param   string    $sql  SQL query
	 * @return  resource        Resource query identifier
	 */
	public function db_query($sql)
	{
		//$cnx = db_connect();
		//$res = mysql_query($sql, $cnx) or trigger_error( mysql_error() );
		//error_log($sql);
		$res = $this->wp_insights_wpdb->get_results($sql,ARRAY_A); //or die(mysql_error());
		return $res;
	}
	
	/**
	 * Gets column(s) value(s) of a single row from a table.
	 * This function can be used also to check if a row field exists.
	 * @param   string    $column     column(s) name(s)
	 * @param   string    $table      table name
	 * @param   string    $condition  WHERE condition. To allow row ordering without WHERE clause, you can use "1 ORDER BY ..."
	 * @return  mixed                 Associative array with column(s) name(s) as keys on success or FALSE on failure
	 */
	public function db_select($table, $column, $condition)
	{
		$sql = "SELECT $column FROM $table WHERE $condition";
		//error_log($sql);
		$res = $this->db_query($sql);
		//error_log($res);
		if (count($res) > 0) {
			return $res[0];
		}
	
		return false;
	}
	
	/**
	 * Selects ALL rows from table that match the given condition.
	 * @param   string  $table      table name
	 * @param   string  $column     column name
	 * @param   string  $condition  WHERE condition. To allow row ordering without WHERE clause, you can use "1 ORDER BY ..."
	 * @return  array               Array with all queried rows.
	 */
	public function db_select_all($table, $column, $condition)
	{
		$sql = "SELECT $column FROM $table WHERE $condition";
	
		$res = $this->db_query($sql);
		// get ALL rows
		/* $opt = array();
		 while ($row = mysql_fetch_assoc($res)) {
		$opt[] = $row;
		}
	
		return $opt; */
		return $res;
	}
	
	/**
	 * Deletes a row from table.
	 * @param   string  $table      able name
	 * @param   string  $condition  WHERE clause (i.e: id='#' LIMIT 1)
	 * @return  boolean             TRUE on success, or FALSE on failure
	 */
	public function db_delete($table, $condition)
	{
		$sql = "DELETE FROM $table WHERE $condition";
		//error_log($sql);
		$res = $this->db_query($sql);
	
		return $res;
	}
	
	/**
	 * Inserts a new row on table.
	 * @param   string    $table      table name
	 * @param   string    $data       column(s) name(s) and value(s)
	 * @param   string    $format     value(s) format
	 * @return  int                   last instered row id, or FALSE on failure
	 */
	public function db_insert($table, $data, $format)
	{
		//$sql = "INSERT INTO $table ($fields) VALUES ($values)";
		//$res = db_query($sql);
		$this->wp_insights_wpdb->insert($table, $data, $format);
		//error_log($this->wp_insights_wpdb->queries);
		//return mysql_insert_id();
		return $this->wp_insights_wpdb->insert_id;
	}
	
	/**
	 * Updates a row on table.
	 * @param   string  $table      table name
	 * @param   string  $tuples     column(s) name(s) and value(s) in the form column=value (i.e: col='val',foo='val',...)
	 * @param   string  $condition  WHERE clause (i.e: id='#' LIMIT 1)
	 * @return  boolean             TRUE on success, or FALSE on failure
	 */
	public function db_update($table, $tuples, $condition)
	{
		//global $wpdb;
		//$wpdb->db_connect();
		$sql = "UPDATE $table SET $tuples WHERE $condition";
		//error_log($sql);
		$res = $this->db_query($sql);
	
		return $res;
	}
	
	/**
	 * Checks that both database connection and tables are OK.
	 * @return  boolean   TRUE on sucess, or FALSE on failure
	 */
	public function db_check()
	{
		global $_lookupTables;
	
		foreach ($_lookupTables as $table) {
			$res = $this->db_query("SHOW TABLES LIKE '".TBL_PREFIX.$table."'", $cnx);
			if (!mysql_num_rows($res)) {
				return false;
			}
		}
	
		return true;
	}
	
	/**
	 * Shortcut for getting the total number of (smt) records in database, or alternatively the column names.
	 * @param   boolean  $getColNames	return column names instead of number of records
	 * @return  mixed   						Number of total DB entries (int) or column names (array)
	 */
	public function db_records($getColNames = false)
	{
		$n = ($getColNames) ? "*" : "id";
		$res = $this->db_query("SELECT $n FROM ".TBL_PREFIX.TBL_RECORDS);
	
		if ($getColNames) {
			$i = 0;
			while ($i < mysql_num_fields($res)) {
				$meta = mysql_fetch_field($res, $i);
				$headers[] = $meta->name;
				++$i;
			}
			return $headers;
		} else {
			return mysql_num_rows($res);
		}
	}
	
	/**
	 * Selects one (and only one) row from an "options" table (CMS or JSOPT).
	 * This function is a wrapper for 'db_select()'.
	 * Instead of having to deal with an associative array of one key alone,
	 * this function speeds the process and returns the array member value.
	 * @param   string  $table        table name
	 * @param   string  $optionName   option name stored on "name" column
	 * @return  string                Option value
	 */
	public function db_option($optionName)
	{
		//error_log($table." ".$optionName);
		$row = $this->db_select($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OPTIONS, "value", "name='".$optionName."'");
	
		return $row['value'];
	}
	
	public function db_set_option($optionName, $optionValue)
	{
		$res = $this->db_update($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OPTIONS, "value='".$optionValue."'", "name='".$optionName."'");
	
		return $res;
	}
	
	public function db_drop($table) {
		//error_log("db_drop $table");
		$this->getWpdb()->query("DROP TABLE IF EXISTS ".$table);
	}
	
	public function wpinsights_db_install() {
	
		/* create records table ----------------------------------------------------- */
	
		$records_table = $this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_RECORDS;
        $records_table_sql  = "CREATE TABLE $records_table (
        id           BIGINT        unsigned  NOT NULL auto_increment,
        client_id    VARCHAR(20)             NOT NULL,
        file     	 VARCHAR(255)            NOT NULL,
        raw_url      VARCHAR(255)            NOT NULL,
        cleansed_url VARCHAR(255)            NOT NULL,
        os_id        TINYINT       unsigned  NOT NULL,
        browser_id   TINYINT       unsigned  NOT NULL,
        browser_ver  FLOAT(2,1)    unsigned  NOT NULL,
        user_agent   VARCHAR(255)            NOT NULL,
        ftu          TINYINT(1)              NOT NULL,
        ip           VARCHAR(15)             NOT NULL,
        scr_width    SMALLINT      unsigned  NOT NULL,
        scr_height   SMALLINT      unsigned  NOT NULL,
        vp_width     SMALLINT      unsigned  NOT NULL,
        vp_height    SMALLINT      unsigned  NOT NULL,
        doc_width    SMALLINT      unsigned  NOT NULL,
        doc_height   SMALLINT      unsigned  NOT NULL,
        sess_date    TIMESTAMP     default   CURRENT_TIMESTAMP,
        sess_time    FLOAT(7,2)    unsigned  NOT NULL,
        focus_time   FLOAT(7,2)    unsigned  NULL,
        lost_focus_count  TINYINT  unsigned  NULL,
        exit_page_section VARCHAR(255)       NULL,
        fps          TINYINT       unsigned  NOT NULL,
        coords_x     MEDIUMTEXT              NOT NULL,
        coords_y     MEDIUMTEXT              NOT NULL,
        clicks       MEDIUMTEXT              NOT NULL,
        hovered      LONGTEXT                NOT NULL,
        clicked      LONGTEXT                NOT NULL,
        lost_focus   LONGTEXT                NULL,
        scrolls      LONGTEXT                NULL,
        PRIMARY KEY  (id) ) DEFAULT CHARSET utf8";
              
		dbDelta( $records_table_sql );
		
		$pagesections_table = $this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_PAGE_SECTIONS;
		
		$pagesections_table_sql="CREATE TABLE $pagesections_table (
		id           BIGINT        unsigned  NOT NULL auto_increment,
		record_id    BIGINT        unsigned  NOT NULL,
		section_order TINYINT       unsigned  NOT NULL,
		section_id   VARCHAR(50)             NOT NULL,
		section_name VARCHAR(50)             NOT NULL,
		current_page_section TINYINT unsigned NOT NULL,
		sess_time    FLOAT(7,2)    unsigned  NOT NULL,
        focus_time   FLOAT(7,2)    unsigned  NOT NULL,
        lost_focus_count  TINYINT  unsigned  NOT NULL,
		entryTimes   VARCHAR(255)  NOT NULL,
		exitTimes   VARCHAR(255)  NOT NULL,
		focusedEntryTimes   VARCHAR(255)  NOT NULL,
		focusedExitTimes   VARCHAR(255)  NOT NULL,
		PRIMARY KEY  (id) ) DEFAULT CHARSET utf8";
		
		dbDelta( $pagesections_table_sql );
		
		$cache_table = $this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_CACHE;
	
		$cache_table_sql  = "CREATE TABLE $cache_table (
		id           BIGINT        unsigned  NOT NULL auto_increment,
		file         VARCHAR(255)            NOT NULL,
		url          TEXT                    NOT NULL,
		title        VARCHAR(255)            NOT NULL,
		saved        DATETIME                NOT NULL,
		PRIMARY KEY  (id) ) DEFAULT CHARSET utf8";
	
		dbDelta( $cache_table_sql );
		
		$os_table = $this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OS;
	
		$os_table_sql  = "CREATE TABLE $os_table (
		id           TINYINT        unsigned  NOT NULL auto_increment,
		name         VARCHAR(20)              NOT NULL,
		PRIMARY KEY  (id) ) DEFAULT CHARSET utf8";
	
		dbDelta( $os_table_sql );
		
		$browsers_table = $this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_BROWSERS;
		
		$browsers_table_sql = "CREATE TABLE $browsers_table (
		id           TINYINT        unsigned  NOT NULL auto_increment,
		name         VARCHAR(128)             NOT NULL,
		isBot        TINYINT        DEFAULT   0,
		PRIMARY KEY  (id) ) DEFAULT CHARSET utf8";
		
		dbDelta( $browsers_table_sql );
	
		/** $sql  = 'CREATE TABLE IF NOT EXISTS '.$this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_BROWSERS.' (';
		$sql .= 'id           TINYINT        unsigned  NOT NULL auto_increment, ';    // browser id
		$sql .= 'name         VARCHAR(128)             NOT NULL, ';                   // browser name
		$sql .= 'PRIMARY KEY  (id) ) DEFAULT CHARSET utf8';
	
		dbDelta( $sql ); */
	/**
		$sql  = 'CREATE TABLE IF NOT EXISTS '.$this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_USERS.' (';
		$sql .= 'id           TINYINT       unsigned  NOT NULL auto_increment, ';     // user id
		$sql .= 'role_id      TINYINT       unsigned  NOT NULL, ';                    // role id
		$sql .= 'login        VARCHAR(60)             NOT NULL, ';                    // user login
		$sql .= 'pass         VARCHAR(60)             NOT NULL, ';                    // user pass
		$sql .= 'name         VARCHAR(000)            NOT NULL, ';                    // user name
		$sql .= 'email        VARCHAR(100)            NOT NULL, ';                    // email
		$sql .= 'website      VARCHAR(100)            NULL,     ';                    // url
		$sql .= 'registered   DATETIME                NOT NULL, ';                    // registered date
		$sql .= 'last_access  TIMESTAMP     default   CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, '; // last login
		$sql .= 'PRIMARY KEY  (id) ) DEFAULT CHARSET utf8';
	
		dbDelta( $sql );
	
		$sql  = 'CREATE TABLE IF NOT EXISTS '.$this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_ROLES.' (';
		$sql .= 'id           TINYINT       unsigned  NOT NULL auto_increment, ';     // role id (max. 055 roles)
		$sql .= 'name         VARCHAR(100)            NOT NULL, ';                    // role title
		$sql .= 'description  VARCHAR(055)            NOT NULL, ';                    // role description
		$sql .= 'ext_allowed  VARCHAR(055)            NOT NULL, ';                    // allowed extensions for this role
		$sql .= 'PRIMARY KEY  (id) ) DEFAULT CHARSET utf8';
	
		dbDelta( $sql );
	
		$sql  = 'CREATE TABLE IF NOT EXISTS '.$this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_EXTS.' (';
		$sql .= 'id         TINYINT       unsigned   NOT NULL auto_increment, ';      // ext (max. 055 modules)
		$sql .= 'dir        VARCHAR(00)              NOT NULL, ';                     // ext dir
		$sql .= 'priority   TINYINT       unsigned   NOT NULL, ';                     // stack order (0 means no order -> alphabetical sorting)
		$sql .= 'PRIMARY KEY  (id) ) DEFAULT CHARSET utf8';
	
		dbDelta( $sql );
		*/
		
		$options_table = $this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OPTIONS;
		$options_table_sql  = "CREATE TABLE $options_table (
		id           TINYINT       unsigned  NOT NULL auto_increment,
		type         VARCHAR(100)            NOT NULL,
		name         VARCHAR(100)            NOT NULL,
		value        VARCHAR(255)            NOT NULL,
		description  TEXT                    NOT NULL,
		PRIMARY KEY  (id) ) DEFAULT CHARSET utf8";
	
		dbDelta( $options_table_sql );
		
		//$this->db_delete($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OPTIONS, 'name = "recording_status"');
		
		$initOptions = array(
				array(
						"type" => "general",
						"name" => "recording_status",
						"value" => "ON",
						"description" => "Should wp insights record visitor sessions"
				),
				array(
						"type" => "general",
						"name" => "cache_seconds",
						"value" => "0",
						"description" => "Days for caching the webpage."
				),
				array(
						"type" => "js_color",
						"name" => "entryPt",
						"value" => "99FF66",
						"description" => "Color for the mouse entry coordinate."
				),
				array(
						"type" => "js_color",
						"name" => "exitPt",
						"value" => "FF6666",
						"description" => "Color for the mouse exit coordinate."
				),
				array(
						"type" => "js_color",
						"name" => "regPt",
						"value" => "FF00FF",
						"description" => "Registration points color. Each registration point can give you a visual idea of the tracking accuracy."
				),
				array(
						"type" => "js_color",
						"name" => "regLn",
						"value" => "00CCCC",
						"description" => "Registration lines color. Used to draw the mouse path."
				),
				array(
						"type" => "js_color",
						"name" => "click",
						"value" => "FF0000",
						"description" => "Mouse clicks color. One of the most relevant features to measure the implicit user interest in a page."
				),
				array(
						"type" => "js_color",
						"name" => "dDrop",
						"value" => "AABBCC",
						"description" => "Drag and drop color. Mouse clicks should be distinguished from drag and drop operations (such as selecting some text, for example)."
				),
				array(
						"type" => "js_color",
						"name" => "varCir",
						"value" => "FF9999",
						"description" => "Time-depending circles color. Each circle represents the amount of time that there is no mouse movement (the user is not using the mouse)."
				),
				array(
						"type" => "js_color",
						"name" => "cenPt",
						"value" => "DDDDDD",
						"description" => "Centroid color. The centroid is the geometric center of the mouse path."
				),
				array(
						"type" => "js_color",
						"name" => "clust",
						"value" => "0000FF",
						"description" => "Clusters color. The k-means algorithm assigns each registration point to the cluster whose center is nearest."
				),
				array(
						"type" => "js_color",
						"name" => "bgColor",
						"value" => "000000",
						"description" => "Background layer color. Self explanatory ;)"
				),
				array(
						"type" => "js_prop",
						"name" => "bgLayer",
						"value" => "1",
						"description" => "Draw a semi-transparent background layer on bottom."
				),
				/* array(
						"type" => "js",
						"name" => "realTime",
						"value" => "1",
						"description" => "You can replay the mouse path in real time or as a static overlayed image."
				),
				array(
						"type" => "js",
						"name" => "dirVect",
						"value" => "0",
						"description" => "When replaying in <em>static</em> mode, it could be useful to display the path direction vector."
				), */
				array(
						"type" => "js_prop",
						"name" => "loadNextTrail",
						"value" => "0",
						"description" => "Load more trails automatically (if available) for the current tracked user."
				)
				
		);
		
		$initiOptionsformat = array(
									'%s',
									'%s',
									'%s',
									'%s'
								);
		
		foreach ($initOptions as $initOption)
		{
			if (!$this->db_select($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OPTIONS, "id", "name = '".$initOption['name']."'")) {
				$this->db_insert($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OPTIONS, $initOption, $initiOptionsformat);
			}
		}
		
	/*
		$sql  = 'CREATE TABLE IF NOT EXISTS '.$this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_JSOPT.' (';
		$sql .= 'id           TINYINT       unsigned  NOT NULL auto_increment, ';     // option id
		$sql .= 'type         TINYINT                 NOT NULL, ';                    // option type (0:input,1:checkbox,etc.)
		$sql .= 'name         VARCHAR(100)            NOT NULL, ';                    // option name
		$sql .= 'value        VARCHAR(255)            NOT NULL, ';                    // option value
		$sql .= 'description  TEXT                    NOT NULL, ';                    // option description
		$sql .= 'PRIMARY KEY  (id) ) DEFAULT CHARSET utf8';
	
		dbDelta( $sql );*/
	}
	
	public function wpinsights_db_uninstall() {
		error_log("Inside wpinsights_db_uninstall");
		$this->db_drop($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_RECORDS);
		$this->db_drop($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_CACHE);
		$this->db_drop($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OS);
		$this->db_drop($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_BROWSERS);
		$this->db_drop($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_OPTIONS);
		$this->db_drop($this->wp_insights_wpdb->prefix.self::TBL_PLUGIN_PREFIX.self::TBL_PAGE_SECTIONS);
		error_log("After dropping all tables");
	}
	
}

?>