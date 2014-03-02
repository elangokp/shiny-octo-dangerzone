<?php

$parse_uri = explode( 'wp-content', $_SERVER['SCRIPT_FILENAME'] );
require_once( $parse_uri[0] . 'wp-load.php' );



$rid = isset($_GET['rid'])?$_GET['rid']:null;
$realTime = 1;
$dirVect = 0;
if(isset($_GET['realTime'])) {
	$realTime = $_GET['realTime'];
	$dirVect = 1;
}
$api = "js";


require_once(plugin_dir_path(dirname(__FILE__)).'replay/class-wp-insights-replayer-beta.php');
$WP_Insights_Replayer_Beta_Instance = new WP_Insights_Replayer_Beta($rid);
echo $WP_Insights_Replayer_Beta_Instance->getReplayPage();


/*
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights.php');
require_once(plugin_dir_path(dirname(__FILE__)).'replay/class-wp-insights-replayer.php');
$WP_Insights_Replayer_Instance = new WP_Insights_Replayer($rid,$api,$realTime,$dirVect, WP_Insights::VERSION);
echo $WP_Insights_Replayer_Instance->getReplayPage();
*/
?>
