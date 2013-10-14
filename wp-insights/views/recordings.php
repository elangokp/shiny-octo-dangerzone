<?php
/**
 * Represents the view for the recordings.
 *
 * This includes the header, options, and other information that should provide
 * The User Interface to the end user.
 *
 * @package   WP_Insights
 * @author    Elango KP <elango@cybermint.com>
 * @license   GPL-2.0+
 * @link      http://www.cybermint.com
 * @copyright 2013 CyberMint
 */

require_once(plugin_dir_path(__FILE__).'class-wp-insights-recordings-list-table.php');
$WP_Insights_Recordings_List_Table_Instance = new WP_Insights_Recordings_List_Table();
$WP_Insights_Recordings_List_Table_Instance->prepare_items();
?>
<div class="wrap">

	<div id="wp-insights-icon32-eye32" class="icon32">
	<img src="<?php echo plugin_dir_url(dirname(__FILE__)).'assets/eye-32.png'?>"/>
	</div>
	<h2><?php echo esc_html( get_admin_page_title()).' '.$recording_status_display; ?></h2>
	
	<form id="recordings-filter" method="get">
            <!-- For plugins, we also need to ensure that the form posts back to our current page -->
            <input type="hidden" name="page" value="<?php echo $_REQUEST['page'] ?>" />
            <!-- Now we can render the completed list table -->
			<?php 
				$WP_Insights_Recordings_List_Table_Instance->display();
			?>
	</form>

</div>
