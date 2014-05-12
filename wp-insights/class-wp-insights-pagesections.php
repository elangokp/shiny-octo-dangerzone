<?php

require_once('class-wp-insights-utils.php');
require_once('class-wp-insights-db-utils.php');

class WP_Insights_Pagesections {
	
	protected $wp_insights_db_utils = null;
	
	protected static $instance = null;
	
	private function __construct() {
		$this->wp_insights_db_utils = WP_Insights_DB_Utils::get_instance();
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
	
	public function save_pagesections() {
		
		if (empty($_POST)) {
			echo 0;
			die();
		}
		$elements_meta_table = $this->wp_insights_db_utils->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_ELEMENTS_META;
		
		$record_details = array (
				"url" => urldecode(stripslashes($_POST['url'])),
				"page_section_elements" => stripslashes($_POST['pagesections'])
		);
		
		$record_details_format = array(
				"%s",
				"%s"
		);
		
		$selectorId = $this->wp_insights_db_utils->db_insert($elements_meta_table, $record_details, $record_details_format);
		
		return $selectorId;
		
	}
	
	
}