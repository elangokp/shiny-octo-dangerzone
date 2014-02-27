<?php

$parse_uri = explode( 'wp-content', $_SERVER['SCRIPT_FILENAME'] );
require_once( $parse_uri[0] . 'wp-load.php' );
require_once(plugin_dir_path(dirname(__FILE__)).'replay/class-wp-insights-replayer-beta.php');

$rid = isset($_GET['rid'])?$_GET['rid']:null;
$WP_Insights_Replayer_Beta_Instance = new WP_Insights_Replayer_Beta($rid);
echo $WP_Insights_Replayer_Beta_Instance->getReplayPage();
?>
