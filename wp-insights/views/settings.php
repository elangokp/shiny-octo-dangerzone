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
            	<li>
			        <label for="server_recording_interval">Server Recording Interval: </label>
			        <select name="server_recording_interval">
            			<option value="10" <?php echo $server_recording_interval === "10" ?"selected":""?> >10 Seconds</option>
            			<option value="15" <?php echo $server_recording_interval === "15" ?"selected":""?> >15 Seconds</option>
            			<option value="20" <?php echo $server_recording_interval === "20" ?"selected":""?> >20 Seconds</option>
            			<option value="25" <?php echo $server_recording_interval === "25" ?"selected":""?> >25 Seconds</option>
            			<option value="30" <?php echo $server_recording_interval === "30" ?"selected":""?> >30 Seconds</option>
            		</select>
            	</li>
            	<li>
            		<label for="max_concurrent_recordings">Max Concurrent Recordings: </label>
            		<select name="max_concurrent_recordings">
            			<option value="0" <?php echo $max_concurrent_recordings === "0" ?"selected":""?> >0</option>
            			<option value="1" <?php echo $max_concurrent_recordings === "1" ?"selected":""?> >1</option>
            			<option value="2" <?php echo $max_concurrent_recordings === "2" ?"selected":""?> >2</option>
            			<option value="3" <?php echo $max_concurrent_recordings === "3" ?"selected":""?> >3</option>
            			<option value="4" <?php echo $max_concurrent_recordings === "4" ?"selected":""?> >4</option>
            			<option value="5" <?php echo $max_concurrent_recordings === "5" ?"selected":""?> >5</option>
            			<option value="6" <?php echo $max_concurrent_recordings === "6" ?"selected":""?> >6</option>
            			<option value="7" <?php echo $max_concurrent_recordings === "7" ?"selected":""?> >7</option>
            			<option value="8" <?php echo $max_concurrent_recordings === "8" ?"selected":""?> >8</option>
            			<option value="9" <?php echo $max_concurrent_recordings === "9" ?"selected":""?> >9</option>
            			<option value="10" <?php echo $max_concurrent_recordings === "10" ?"selected":""?> >10</option>
            			<option value="11" <?php echo $max_concurrent_recordings === "11" ?"selected":""?> >11</option>
            			<option value="12" <?php echo $max_concurrent_recordings === "12" ?"selected":""?> >12</option>
            			<option value="13" <?php echo $max_concurrent_recordings === "13" ?"selected":""?> >13</option>
            			<option value="14" <?php echo $max_concurrent_recordings === "14" ?"selected":""?> >14</option>
            			<option value="15" <?php echo $max_concurrent_recordings === "15" ?"selected":""?> >15</option>
            			<option value="16" <?php echo $max_concurrent_recordings === "16" ?"selected":""?> >16</option>
            			<option value="17" <?php echo $max_concurrent_recordings === "17" ?"selected":""?> >17</option>
            			<option value="18" <?php echo $max_concurrent_recordings === "18" ?"selected":""?> >18</option>
            			<option value="19" <?php echo $max_concurrent_recordings === "19" ?"selected":""?> >19</option>
            			<option value="20" <?php echo $max_concurrent_recordings === "20" ?"selected":""?> >20</option>
            			<option value="21" <?php echo $max_concurrent_recordings === "21" ?"selected":""?> >21</option>
            			<option value="22" <?php echo $max_concurrent_recordings === "22" ?"selected":""?> >22</option>
            			<option value="23" <?php echo $max_concurrent_recordings === "23" ?"selected":""?> >23</option>
            			<option value="24" <?php echo $max_concurrent_recordings === "24" ?"selected":""?> >24</option>
            			<option value="25" <?php echo $max_concurrent_recordings === "25" ?"selected":""?> >25</option>
            			<option value="26" <?php echo $max_concurrent_recordings === "26" ?"selected":""?> >26</option>
            			<option value="27" <?php echo $max_concurrent_recordings === "27" ?"selected":""?> >27</option>
            			<option value="28" <?php echo $max_concurrent_recordings === "28" ?"selected":""?> >28</option>
            			<option value="29" <?php echo $max_concurrent_recordings === "29" ?"selected":""?> >29</option>
            			<option value="30" <?php echo $max_concurrent_recordings === "30" ?"selected":""?> >30</option>
            		</select>
            	</li>
            	
            	<li><?php submit_button("Save Options", "primary", "submit")?></li>
		    </ul>
	</form>

</div>
