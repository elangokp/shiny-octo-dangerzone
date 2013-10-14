<?php
/**
 * Represents the view for the administration dashboard.
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
?>
<div class="wrap">

	<div id="wp-insights-icon32-eye32" class="icon32">
	<img src="<?php echo plugin_dir_url(dirname(__FILE__)).'assets/eye-32.png'?>"/>
	</div>
	<h2><?php echo esc_html( get_admin_page_title()).' '.$recording_status_display; ?></h2>

	<form id="wpi-settings" method="post" action="<?php echo $_SERVER['REQUEST_URI'] ?>">
            <!-- Now we can render the completed list table -->
            <ul>       
		        <li>
			        <label for="change_recorder_status">Change Recorder Status: </label>
			        <select name="change_recorder_status">
		            	<option value="start" <?php echo $is_recording?"selected":""?> >Start Recording</option>	
		            	<option value="stop" <?php echo $is_recording?"":"selected"?> >Stop Recording</option>
	            	</select>
            	</li>
            	
            	<li><?php submit_button("Save Options", "primary", "submit")?></li>
		    </ul>
	</form>

</div>
