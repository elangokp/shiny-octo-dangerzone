<?php
/*  Copyright 2011  Matthew Van Andel  (email : matt@mattvanandel.com)

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License, version 2, as
    published by the Free Software Foundation.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/



/* == NOTICE ===================================================================
 * Please do not alter this file. Instead: make a copy of the entire plugin, 
 * rename it, and work inside the copy. If you modify this plugin directly and 
 * an update is released, your changes will be lost!
 * ========================================================================== */



/*************************** LOAD THE BASE CLASS *******************************
 *******************************************************************************
 * The WP_List_Table class isn't automatically available to plugins, so we need
 * to check if it's available and load it if necessary.
 */
/* if(!class_exists('WP_List_Table')){
    require_once( ABSPATH . 'wp-admin/includes/class-wp-list-table.php' );
} */
require_once(plugin_dir_path(__FILE__).'class-wpi-wp-list-table.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-db-utils.php');
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights-utils.php');


/************************** CREATE A PACKAGE CLASS *****************************
 *******************************************************************************
 * Create a new list table package that extends the core WP_List_Table class.
 * WP_List_Table contains most of the framework for generating the table, but we
 * need to define and override some methods so that our data can be displayed
 * exactly the way we need it to be.
 * 
 * To display this example on a page, you will first need to instantiate the class,
 * then call $yourInstance->prepare_items() to handle any data manipulation, then
 * finally call $yourInstance->display() to render the table to the page.
 * 
 * Our theme for this list table is going to be movies.
 */
class WP_Insights_Page_PS_Stats_List_Table extends WPI_WP_List_Table {
    
    protected $recording_id = null;
    
    /** ************************************************************************
     * REQUIRED. Set up a constructor that references the parent constructor. We 
     * use the parent reference to set some default configs.
     ***************************************************************************/
    function __construct($recording_id){
                
        //Set parent defaults
        parent::__construct( array(
            'singular'  => 'Page Section',     //singular name of the listed records
            'plural'    => 'Page Sections',    //plural name of the listed records
            'ajax'      => false,              //does this table support ajax
            'screen'    => 'admin'             //Just to avoid a php notice
            ) );
        
        $this->recording_id = $recording_id;
        
    }
    
    function display_tablenav( $which ) {
    	?>
        	<br class="clear"/>
        	<?php
     }
     
    /* function column_section_order($item){
     	 
     	return sprintf('%1$s',
     			$item['section_order'] +1
     	);
     }*/
    
     function column_section_name($item){
     
     	return sprintf('%1$s',
     			$item['section_name']
     	);
     }
     
    function column_viewed($item){

    	$viewed = round((($item['seen_by']/$item['loaded_by'])*100),2)."%";
    	
    	return sprintf('%1$s',
    			$viewed
    	);
    }
    
    function column_exited($item){
    
    	$exited = round((($item['exited_by']/$item['loaded_by'])*100),2)."%";
    	 
    	return sprintf('%1$s',
    			$exited
    	);
    }
    
    
    
    function column_avg_browser_open_time($item){
    
    	return sprintf('%1$s',
    			$item['avg_sess_time']
    	);
    }
    
    function column_avg_focused_browsing_time($item){
    
    	return sprintf('%1$s',
    			$item['avg_focus_time']
    	);
    }
    
    function column_lost_focus_count($item){
    
    	return sprintf('%1$s',
    			$item['lost_focus_count']
    	);
    }
    
    
    
    /** ************************************************************************
     * REQUIRED! This method dictates the table's columns and titles. This should
     * return an array where the key is the column slug (and class) and the value 
     * is the column's title text. If you need a checkbox for bulk actions, refer
     * to the $columns array below.
     * 
     * The 'cb' column is treated differently than the rest. If including a checkbox
     * column in your table you must create a column_cb() method. If you don't need
     * bulk actions or checkboxes, simply leave the 'cb' entry out of your array.
     * 
     * @see WP_List_Table::::single_row_columns()
     * @return array An associative array containing column information: 'slugs'=>'Visible Titles'
     **************************************************************************/
    function get_columns(){
        $columns = array(
        	//'section_order' => 'order',
        	'section_name'  => 'Page Section',
        	'viewed'        => 'Viewed',
        	'exited'          => 'Exited',
        	'avg_browser_open_time' => 'Avg Browser Open Time',
        	'avg_focused_browsing_time' => 'Avg Focused Browsing Time',
        	'lost_focus_count' => 'Lost Focus Count'
        );
        return $columns;
    }
    
    
    /** ************************************************************************
     * REQUIRED! This is where you prepare your data for display. This method will
     * usually be used to query the database, sort and filter the data, and generally
     * get it ready to be displayed. At a minimum, we should set $this->items and
     * $this->set_pagination_args(), although the following properties and methods
     * are frequently interacted with here...
     * 
     * @global WPDB $wpdb
     * @uses $this->_column_headers
     * @uses $this->items
     * @uses $this->get_columns()
     * @uses $this->get_sortable_columns()
     * @uses $this->get_pagenum()
     * @uses $this->set_pagination_args()
     **************************************************************************/
    function prepare_items() {
        global $wpdb; //This is used only if making any database queries

        /**
         * First, lets decide how many records per page to show
         */
        $per_page = 200;
        
        
        /**
         * REQUIRED. Now we need to define our column headers. This includes a complete
         * array of columns to be displayed (slugs & titles), a list of columns
         * to keep hidden, and a list of columns that are sortable. Each of these
         * can be defined in another method (as we've done here) before being
         * used to build the value for our _column_headers property.
         */
        $columns = $this->get_columns();
        $hidden = array();
        $sortable = $this->get_sortable_columns();
        
        
        /**
         * REQUIRED. Finally, we build an array to be used by the class for column 
         * headers. The $this->_column_headers property takes an array which contains
         * 3 other arrays. One for all columns, one for hidden columns, and one
         * for sortable columns.
         */
        $this->_column_headers = array($columns, $hidden, $sortable);
        
        
        /**
         * Optional. You can handle your bulk actions however you see fit. In this
         * case, we'll handle them within our package just to keep things clean.
         */
        //$this->process_bulk_action();
        
        /**
         * REQUIRED for pagination. Let's figure out what page the user is currently
         * looking at. We'll need this later, so you should always include it in
         * your own package classes.
         */
        //$current_page = $this->get_pagenum();
        $current_page = 1;
        
        /**
         * REQUIRED for pagination. Let's check how many items are in our data array.
         * In real-world use, this would be the total number of items in your database,
         * without filtering. We'll need this later, so you should always include it
         * in your own package classes.
        */
        $WP_Insights_DB_Utils_Instance = WP_Insights_DB_Utils::get_instance();
        
        $WP_Insights_DB_Utils_Instance->setWpdb($wpdb);
        
        $pageSectionsTable = $WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_PAGE_SECTIONS;
        
        $recordingsTable = $WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;

        $total_items = $wpdb->get_var("select count(*) from $pageSectionsTable as ps where record_id='$this->recording_id' group by ps.section_id ");
        
        /**
         * Instead of querying a database, we're going to fetch the example data
         * property we created for use in this plugin. This makes this example 
         * package slightly different than one you might build on your own. In 
         * this example, we'll be using array manipulation to sort and paginate 
         * our data. In a real-world implementation, you will probably want to 
         * use sort and pagination data to build a custom query instead, as you'll
         * be able to use your precisely-queried data immediately.
         */
        
        $sql = "select 
		ps.section_name as section_name, 
		count(ps.section_id) as loaded_by,
		count(CASE WHEN ps.sess_time>0 THEN 1 ELSE NULL END) as seen_by,
		count(CASE WHEN ps.current_page_section>0 AND r.is_session_exit=1 THEN 1 ELSE NULL END) as exited_by,
		SEC_TO_TIME(ROUND(AVG(ps.sess_time))) as avg_sess_time, 
		SEC_TO_TIME(ROUND(AVG(ps.focus_time))) avg_focus_time,
		SUM(ps.lost_focus_count) as lost_focus_count
		from $pageSectionsTable as ps 
		inner join $recordingsTable as r on r.id = ps.record_id
		inner join $recordingsTable as r1 on r1.cleansed_url = r.cleansed_url
		where r1.id = '$this->recording_id'
		group by ps.section_id
		ORDER BY ps.section_order asc
		LIMIT ".($current_page-1)*$per_page.",".$per_page;
                
        
        $data = $WP_Insights_DB_Utils_Instance->db_query($sql);
        
        
        /**
         * REQUIRED. Now we can add our *sorted* data to the items property, where 
         * it can be used by the rest of the class.
         */
        $this->items = $data;
        
        
        /**
         * REQUIRED. We also have to register our pagination options & calculations.
         */
        $this->set_pagination_args( array(
            'total_items' => $total_items,                  //WE have to calculate the total number of items
            'per_page'    => $per_page,                     //WE have to determine how many items to show on a page
            'total_pages' => ceil($total_items/$per_page)   //WE have to calculate the total number of pages
        ) );
    }
    
}