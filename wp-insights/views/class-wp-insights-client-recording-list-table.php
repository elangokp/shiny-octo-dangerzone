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
class WP_Insights_Client_Recording_List_Table extends WPI_WP_List_Table {
    
    protected $assets_url = null;
    protected $view_url = null;
    protected $visitor_id = null;
    
    /** ************************************************************************
     * REQUIRED. Set up a constructor that references the parent constructor. We 
     * use the parent reference to set some default configs.
     ***************************************************************************/
    function __construct($visitor_id){
        global $status, $page;
                
        //Set parent defaults
        parent::__construct( array(
            'singular'  => 'Recording',     //singular name of the listed records
            'plural'    => 'Recordings',    //plural name of the listed records
            'ajax'      => false        //does this table support ajax?
        ) );
        
        $this->visitor_id = $visitor_id;
        $this->assets_url = plugins_url('/../assets/', __FILE__);
        $this->views_url = plugins_url('/../views/', __FILE__);
        
    }
    
    function display_tablenav( $which ) {
    	?>
        	<br class="clear"/>
        	<?php
     }
    
    
    /** ************************************************************************
     * Recommended. This method is called when the parent class can't find a method
     * specifically build for a given column. Generally, it's recommended to include
     * one method for each column you want to render, keeping your package class
     * neat and organized. For example, if the class needs to process a column
     * named 'title', it would first see if a method named $this->column_title() 
     * exists - if it does, that method will be used. If it doesn't, this one will
     * be used. Generally, you should try to use custom column methods as much as 
     * possible. 
     * 
     * Since we have defined a column_title() method later on, this method doesn't
     * need to concern itself with any column with a name of 'title'. Instead, it
     * needs to handle everything else.
     * 
     * For more detailed insight into how columns are handled, take a look at 
     * WP_List_Table::single_row_columns()
     * 
     * @param array $item A singular item (one full row's worth of data)
     * @param array $column_name The name/slug of the column to be processed
     * @return string Text or HTML to be placed inside the column <td>
     **************************************************************************/
   /*  function column_default($item, $column_name){
        switch($column_name){
            case 'rating':
            case 'director':
                return $item[$column_name];
            default:
                return print_r($item,true); //Show the whole array for troubleshooting purposes
        }
    } */
    
        
    /** ************************************************************************
     * Recommended. This is a custom column method and is responsible for what
     * is rendered in any column with a name/slug of 'title'. Every time the class
     * needs to render a column, it first looks for a method named 
     * column_{$column_title} - if it exists, that method is run. If it doesn't
     * exist, column_default() is called instead.
     * 
     * This example also illustrates how to implement rollover actions. Actions
     * should be an associative array formatted as 'slug'=>'link html' - and you
     * will need to generate the URLs yourself. You could even ensure the links
     * 
     * 
     * @see WP_List_Table::::single_row_columns()
     * @param array $item A singular item (one full row's worth of data)
     * @return string Text to be placed inside the column <td> (movie title only)
     **************************************************************************/
    /* function column_title($item){
        
        //Build row actions
        $actions = array(
            'edit'      => sprintf('<a href="?page=%s&action=%s&movie=%s">Edit</a>',$_REQUEST['page'],'edit',$item['ID']),
            'delete'    => sprintf('<a href="?page=%s&action=%s&movie=%s">Delete</a>',$_REQUEST['page'],'delete',$item['ID']),
        );
        
        //Return the title contents
        return sprintf('%1$s <span style="color:silver">(id:%2$s)</span>%3$s',
            $item['title'],
            $item['ID'],
            $this->row_actions($actions)
        );
    }
     */
    /** ************************************************************************
     * REQUIRED if displaying checkboxes or using bulk actions! The 'cb' column
     * is given special treatment when columns are processed. It ALWAYS needs to
     * have it's own method.
     * 
     * @see WP_List_Table::::single_row_columns()
     * @param array $item A singular item (one full row's worth of data)
     * @return string Text to be placed inside the column <td> (movie title only)
     **************************************************************************/
    function column_cb($item){
        return sprintf(
            '<input type="checkbox" name="%1$s[]" value="%2$s" />',
            /*$1%s*/ $this->_args['singular'],  //Let's simply repurpose the table's singular label ("movie")
            /*$2%s*/ $item['id']                //The value of the checkbox should be the record's id
        );
    }
    
    function column_recording_id($item){
    	
    	return sprintf('%1$s',
    			$item['id']
    	);
    }
    
    function column_ip($item){
    
    	return sprintf('%1$s',
    			$item['ip']
    	);
    }
    
    function column_url($item){

    	return sprintf('<a href="%1$s" target="_blank">%1$s</a>',
    			$item['url']
   		);
    	 
    }
    
    function column_browser($item){
    
    	return sprintf('%1$s',
    			$item['browser_name']
    	);
    }
    
    function column_os($item){
    
    	return sprintf('%1$s',
    			$item['os_name']
    	);
    }
    
    function column_last_visit($item){
    	 
    	return sprintf('%1$s',
    			WP_Insights_Utils::timeago($item['unix_sess_date'])
    	);
    }
    
    function column_display_date($item){
    	
    	return sprintf('%1$s',
    			$item['sess_date']
    	);
    }
    
    function column_browsing_time($item){
    
    	return sprintf('%1$s',
    			$item['browser_open_time']
    	);
    }
    
    function column_interaction_time($item){
    
    	return sprintf('%1$s',
    			round(count(explode(",", $item['coords_x']))/$item['fps'], 2)
    	);
    }
    
    function column_lost_focus_count($item){
    
    	return sprintf('%1$s',
    			$item['lost_focus_count']
    	);
    }
    
    function column_focused_time($item){
    
    	return sprintf('%1$s',
    			$item['focused_browsing_time']
    	);
    }
    
    function column_no_of_clicks($item){
    
    	return sprintf('%1$s',
    			WP_Insights_Utils::count_clicks($item['clicks'])
    	);
    }
    
     /*function full_row_actions($item) {
    	$displayId = 'id='.$item['id'];
    	// wait for very recent visits
    	$timeDiff = time() - (strtotime($item['sess_date']) + $item['sess_time']);
    	//error_log($timeDiff);
    	$receivingData = ($timeDiff > -10 && $timeDiff < 30);
    	//error_log($receivingData);
    	$rowActions = "<div>";
    	if (!$receivingData)
    	{
    		if($item['file'] != "0") {
    			$rowActions .= '<a href="'.$this->views_url.'wpi-replay.php?'.$displayId.'&api=js" class="button" target="_blank" title="Play">Realtime Replay</a>'.PHP_EOL;
    			$rowActions .= '<a href="'.$this->views_url.'wpi-replay.php?'.$displayId.'&api=js&realTime=0" class="button" target="_blank" title="Show">Show Mouse Path</a>'.PHP_EOL;
    			$rowActions .= '<a href="'.$this->views_url.'wpi-replay-beta.php?'.$displayId.'&api=js&realTime=0" class="button" target="_blank" title="Show">Replay Beta</a>'.PHP_EOL;
    			//$rowActions .= '<a href="'.$this->views_url.'wpi-replay.php?'.$displayId.'&api=swf" class="button" target="_blank" title="Play (Experimental)">Replay in Flash</a>'.PHP_EOL;
    			$rowActions .= '<a id="wpi_ps_rec_stats_button_'.$item['id'].'" href="javascript:void(0)" data-rid="'.$item['id'].'" class="button" target="_blank" title="Page Section Stats">Page Section Stats</a>'.PHP_EOL;
    		} else {
    			$rowActions .= '<em>Couldnt record this session.</em>';
    		}

    	}
    	else
    	{
    		$rowActions .= '<em>Recording in Progress... Play buttons will be available shortly after the visitor closes his/her browser</em>';
    	}
    	$rowActions.='</div>';
    	return $rowActions;
    } */
    
    function column_replay($item){
    	
    	$displayId = 'id='.$item['id'];  
    	// wait for very recent visits
    	$timeDiff = time() - (strtotime($item['sess_date']) + $item['sess_time']);
    	//$tableColumn = time().','.$timeDiff.','.strtotime($item['sess_date']);
    	$receivingData = ($timeDiff > -10 && $timeDiff < 30);
    	$assets_url = plugins_url('/../assets/', __FILE__);
    	$views_url = plugins_url('/../views/', __FILE__);
    	$tableColumn = '<span style="color:silver">';
    	if (!$receivingData)
    	{
    		if($item['file'] != "0") {
    			$tableColumn .= '<a href="'.$this->views_url.'wpi-replay-beta.php?'.$displayId.'&api=js&realTime=0" class="button" target="_blank" title="Show">Replay</a>'.PHP_EOL;
    			$tableColumn .= '<a id="wpi_ps_rec_stats_button_'.$item['id'].'" href="javascript:void(0)" data-rid="'.$item['id'].'" class="button" target="_blank" title="Page Section Stats">Page Section Stats</a>'.PHP_EOL;
    		} else {
    			$tableColumn .= '<em>Couldnt record this session.</em>';
    		}
    	}
    	else
    	{
    		$tableColumn .= '<em>Recording in Progress...</em>';
    	}
    	$tableColumn.='</span>';
    	return $tableColumn;
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
            //'cb'        => '<input type="checkbox" />', //Render a checkbox instead of text
            //'recording_id'     => 'ID',
            //'ip'    => 'IP',
        	'url' => 'url',
        	//'browser' => 'Browser',
        	//'os' => 'OS',
        	'last_visit'  => 'Last Visit',
            'display_date'  => 'Display Date',
        	'browsing_time' => 'Browser Open Time',
        	//'interaction_time' => 'Interaction Time',
        	//'no_of_clicks' => '# Clicks',
        	'lost_focus_count' => 'Lost Focus Count',
        	'focused_time' => 'Focused Browsing Time',
        	'replay' => 'Replay'
        );
        return $columns;
    }
    
    /** ************************************************************************
     * Optional. If you want one or more columns to be sortable (ASC/DESC toggle), 
     * you will need to register it here. This should return an array where the 
     * key is the column that needs to be sortable, and the value is db column to 
     * sort by. Often, the key and value will be the same, but this is not always
     * the case (as the value is a column name from the database, not the list table).
     * 
     * This method merely defines which columns should be sortable and makes them
     * clickable - it does not handle the actual sorting. You still need to detect
     * the ORDERBY and ORDER querystring variables within prepare_items() and sort
     * your data accordingly (usually by modifying your query).
     * 
     * @return array An associative array containing all the columns that should be sortable: 'slugs'=>array('data_values',bool)
     **************************************************************************/
    /* function get_sortable_columns() {
        $sortable_columns = array(
            'title'     => array('title',false),     //true means it's already sorted
            'rating'    => array('rating',false),
            'director'  => array('director',false)
        );
        return $sortable_columns;
    }
     */
    
    /** ************************************************************************
     * Optional. If you need to include bulk actions in your list table, this is
     * the place to define them. Bulk actions are an associative array in the format
     * 'slug'=>'Visible Title'
     * 
     * If this method returns an empty value, no bulk action will be rendered. If
     * you specify any bulk actions, the bulk actions box will be rendered with
     * the table automatically on display().
     * 
     * Also note that list tables are not automatically wrapped in <form> elements,
     * so you will need to create those manually in order for bulk actions to function.
     * 
     * @return array An associative array containing all the bulk actions: 'slugs'=>'Visible Titles'
     **************************************************************************/
    /* function get_bulk_actions() {
        $actions = array(
            'delete'    => 'Delete'
        );
        return $actions;
    } */
    
    
    /** ************************************************************************
     * Optional. You can handle your bulk actions anywhere or anyhow you prefer.
     * For this example package, we will handle it in the class to keep things
     * clean and organized.
     * 
     * @see $this->prepare_items()
     **************************************************************************/
    /* function process_bulk_action() {
        
        //Detect when a bulk action is being triggered...
        if( 'delete'===$this->current_action() ) {
            wp_die('Items deleted (or they would be if we had items to delete)!');
        }
        
    } */
    
    
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
        
        $pagesTable = $WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_PAGES;
        
        $recordsTable = $WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
        
        $browsersTable = $WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_BROWSERS;
        
        $osTable = $WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_OS;
        
        $cacheTable = $WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_CACHE;
        
        $total_items = $wpdb->get_var("select count(1) from $recordsTable where visitor_id='$this->visitor_id' ");
        
        /**
         * Instead of querying a database, we're going to fetch the example data
         * property we created for use in this plugin. This makes this example 
         * package slightly different than one you might build on your own. In 
         * this example, we'll be using array manipulation to sort and paginate 
         * our data. In a real-world implementation, you will probably want to 
         * use sort and pagination data to build a custom query instead, as you'll
         * be able to use your precisely-queried data immediately.
         */
        
        
        //$where = (!empty($_SESSION['filterquery'])) ? $_SESSION['filterquery'] : "1"; // will group by log id
        
        //$where = $recordsTable.".cache_id != 0";
        
        /* $data = $WP_Insights_DB_Utils_Instance->db_select_all(
        		$recordsTable
        		." LEFT JOIN ".$browsersTable." ON ".$recordsTable.".browser_id = ".$browsersTable.".id"
        		." LEFT JOIN ".$osTable." ON ".$recordsTable.".os_id = ".$osTable.".id"
        		." LEFT JOIN ".$cacheTable." ON ".$recordsTable.".cache_id = ".$cacheTable.".id",
        		//"id,client_id,cache_id,os_id,browser_id,ftu,ip,sess_date,sess_time,fps,coords_x,coords_y,clicks",
        		$recordsTable.".*, ".$browsersTable.".name as browser_name, ".$osTable.".name as os_name, ".$cacheTable.".url as url",
        		$where." ORDER BY ".$recordsTable.".id DESC, ".$recordsTable.".client_id LIMIT ".($current_page-1)*$per_page.",".$per_page
        ); */
        
        $sql = "SELECT 
        records.id,
        records.file,
        pages.url,
        records.sess_date,
        UNIX_TIMESTAMP(records.sess_date) as unix_sess_date,
        records.sess_time,
        SEC_TO_TIME(ROUND(records.sess_time)) as browser_open_time,
        records.lost_focus_count,
        SEC_TO_TIME(ROUND(records.focus_time)) as focused_browsing_time
        FROM $recordsTable as records
        INNER JOIN $pagesTable as pages ON records.page_id = pages.id
        where records.visitor_id = '$this->visitor_id'
        ORDER BY records.id desc
        LIMIT ".($current_page-1)*$per_page.",".$per_page;
                
        
        $data = $WP_Insights_DB_Utils_Instance->db_query($sql);
        /**
         * This checks for sorting input and sorts the data in our array accordingly.
         * 
         * In a real-world situation involving a database, you would probably want 
         * to handle sorting by passing the 'orderby' and 'order' values directly 
         * to a custom query. The returned data will be pre-sorted, and this array
         * sorting technique would be unnecessary.
         */
        /* function usort_reorder($a,$b){
            $orderby = (!empty($_REQUEST['orderby'])) ? $_REQUEST['orderby'] : 'title'; //If no sort, default to title
            $order = (!empty($_REQUEST['order'])) ? $_REQUEST['order'] : 'asc'; //If no order, default to asc
            $result = strcmp($a[$orderby], $b[$orderby]); //Determine sort order
            return ($order==='asc') ? $result : -$result; //Send final sort direction to usort
        }
        usort($data, 'usort_reorder'); */
        
        
        /***********************************************************************
         * ---------------------------------------------------------------------
         * vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
         * 
         * In a real-world situation, this is where you would place your query.
         * 
         * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
         * ---------------------------------------------------------------------
         **********************************************************************/
        
        
        /**
         * The WP_List_Table class does not handle pagination for us, so we need
         * to ensure that the data is trimmed to only the current page. We can use
         * array_slice() to 
         */
        //$data = array_slice($data,(($current_page-1)*$per_page),$per_page);
        
        
        
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