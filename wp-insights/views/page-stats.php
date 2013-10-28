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
if(isset($_GET['pid'])) {
	$pid = $_GET['pid'];
	require_once(plugin_dir_path(__FILE__).'class-wp-insights-detailed-page-stats.php');
	$WP_Insights_Detailed_Page_Stats_Instance = new WP_Insights_Detailed_Page_Stats($pid);
	$WP_Insights_Detailed_Page_Stats_Instance->process_stats();
	?>
	<div class="wrap">
	
		<div id="wp-insights-icon32-eye32" class="icon32">
		<img src="<?php echo plugin_dir_url(dirname(__FILE__)).'assets/eye-32.png'?>"/>
		</div>
		<h2>
		<?php echo esc_html( $WP_Insights_Detailed_Page_Stats_Instance->url); ?>
		<a href="<?php echo esc_html( $WP_Insights_Detailed_Page_Stats_Instance->url); ?>" target="_blank">Open</a>
		</h2>
		<a href="admin.php?page=<?php echo $_REQUEST['page']?>">&lt;- Back to Pages List</a>
		<form id="wpi-detailed-page-stats" method="get">
			<ul>       
		        <li>
			        <label for="change_recorder_status">Change Recorder Status: </label>
            	</li>
            	
            	<li><?php submit_button("Save Options", "primary", "submit")?></li>
		    </ul>
		</form>
	
	</div>	
	<?php
	
} else {
	require_once(plugin_dir_path(__FILE__).'class-wp-insights-page-stats-list-table.php');
	$WP_Insights_Page_Stats_List_Table_Instance = new WP_Insights_Page_Stats_List_Table();
	$WP_Insights_Page_Stats_List_Table_Instance->prepare_items();
	?>
	<div class="wrap">
	
		<div id="wp-insights-icon32-eye32" class="icon32">
		<img src="<?php echo plugin_dir_url(dirname(__FILE__)).'assets/eye-32.png'?>"/>
		</div>
		<h2><?php echo esc_html( get_admin_page_title()).' '.$recording_status_display; ?></h2>
		
		<form id="page-stats" method="get">
	            <!-- For plugins, we also need to ensure that the form posts back to our current page -->
	            <input type="hidden" name="page" value="<?php echo $_REQUEST['page'] ?>" />
	            <!-- Now we can render the completed list table -->
				<?php 
					$WP_Insights_Page_Stats_List_Table_Instance->display();
				?>
		</form>
	
	</div>
<?php
}
?>

