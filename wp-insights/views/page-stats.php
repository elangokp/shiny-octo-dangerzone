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
	$views_url = plugins_url('/../views/', __FILE__);
	require_once(plugin_dir_path(__FILE__).'class-wp-insights-detailed-page-stats.php');
	$WP_Insights_Detailed_Page_Stats_Instance = new WP_Insights_Detailed_Page_Stats($pid);
	//$WP_Insights_Detailed_Page_Stats_Instance->process_stats();
	?>
<div class="wrap">

	<div id="wp-insights-icon32-eye32" class="icon32">
		<img
			src="<?php echo plugin_dir_url(dirname(__FILE__)).'assets/eye-32.png'?>" />
	</div>
	<h2>
		<?php echo esc_html( $WP_Insights_Detailed_Page_Stats_Instance->getUrl()); ?>
		<a
			href="<?php echo esc_html( $WP_Insights_Detailed_Page_Stats_Instance->getUrl()); ?>"
			target="_blank">Open</a>
	</h2>
	<a href="admin.php?page=<?php echo $_REQUEST['page']?>">&lt;- Back to
		Pages List</a>
	
	<form id="wpi-detailed-page-stats" method="get" style="margin-top: 10px">
		<div id="pageViews" >
			<label>Page Views: </label>
			<label><?php echo $WP_Insights_Detailed_Page_Stats_Instance->getPageViews();?></label>
		</div>
		<div id="timeOnPage" >
			<label>Avg. Time on Page: </label>
			<label><?php echo $WP_Insights_Detailed_Page_Stats_Instance->getAvgBrowsingTime();?></label>
		</div>
		<div id="focusedTimeOnPage" >
			<label>Avg. Focused Time on Page: </label>
			<label><?php echo $WP_Insights_Detailed_Page_Stats_Instance->getAvgFocusTime();?></label>
		</div>
		<div id="attention" >
			<label>Attention %: </label>
			<label><?php echo $WP_Insights_Detailed_Page_Stats_Instance->getAttention();?></label>
		</div>
		<div id="interest" >
			<label>Interest %: </label>
			<label><?php echo $WP_Insights_Detailed_Page_Stats_Instance->getInterest();?></label>
		</div>
		<div id="desire" >
			<label>Desire %: </label>
			<label><?php echo $WP_Insights_Detailed_Page_Stats_Instance->getDesire();?></label>
		</div>
		<div id="passion" >
			<label>Passion %: </label>
			<label><?php echo $WP_Insights_Detailed_Page_Stats_Instance->getPassion();?></label>
		</div>
		<div id="movementMap">
			<a id="mvmap" href="javascript:void(0)" data-url="<?php echo $views_url;?>showheat.php?pid=<?php echo $pid;?>&hmtype=mv" class="button" target="_blank" title="Movement Heatmap">Movement Heatmap</a>
		</div>
		<div id="clickmap">
			<a id="clickmap" href="javascript:void(0)" data-url="<?php echo $views_url;?>showheat.php?pid=<?php echo $pid;?>&hmtype=click" class="button" target="_blank" title="Click Heatmap">Click Heatmap</a>
		</div>
		<div id="exitmap">
			<a id="exitmap" href="javascript:void(0)" data-url="<?php echo $views_url;?>showheat.php?pid=<?php echo $pid;?>&hmtype=exit" class="button" target="_blank" title="Exit Heatmap">Exit Heatmap</a>
		</div>
		<div id="mousepaths">
			<a id="mousepaths" href="javascript:void(0)" data-url="<?php echo $views_url;?>showheat.php?pid=<?php echo $pid;?>&hmtype=mp" class="button" target="_blank" title="Mouse Paths">Mouse Paths</a>
		</div>
		<div id="lostfocusmap">
			<a id="lostfocusmap" href="javascript:void(0)" data-url="<?php echo $views_url;?>showheat.php?pid=<?php echo $pid;?>&hmtype=lf" class="button" target="_blank" title="Lost Focus Heatmap">Lost Focus Heatmap</a>
		</div>
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
		<img
			src="<?php echo plugin_dir_url(dirname(__FILE__)).'assets/eye-32.png'?>" />
	</div>
	<h2>
		<?php echo esc_html( get_admin_page_title()).' '.$recording_status_display; ?>
	</h2>

	<form id="page-stats" method="get">
		<!-- For plugins, we also need to ensure that the form posts back to our current page -->
		<input type="hidden" name="page"
			value="<?php echo $_REQUEST['page'] ?>" />
		<!-- Now we can render the completed list table -->
		<?php 
		$WP_Insights_Page_Stats_List_Table_Instance->display();
		?>
	</form>

</div>
<?php
}
?>

