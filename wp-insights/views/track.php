<?php
/**
 * Represents the view for the replayer.
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
//define( 'SHORTINIT', true );

$parse_uri = explode( 'wp-content', $_SERVER['SCRIPT_FILENAME'] );
require_once( $parse_uri[0] . 'wp-load.php' );
//require_once( $_SERVER['DOCUMENT_ROOT'] . '/wordpress/wp-load.php' );
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights.php');
require_once(plugin_dir_path(dirname(__FILE__)).'replay/class-wp-insights-replayer.php');
$id = $_GET['id'];
$api = $_GET['api'];
$realTime = 1;
$dirVect = 0;
if(isset($_GET['realTime'])) {
	$realTime = $_GET['realTime'];
	$dirVect = 1;
}

//For No Cache
header('Cache-Control: no-cache, no-store, must-revalidate'); // HTTP 1.1.
header('Pragma: no-cache'); // HTTP 1.0.
header('Expires: 0'); // Proxies.

$WP_Insights_Replayer_Instance = new WP_Insights_Replayer($id,$api,$realTime,$dirVect, WP_Insights::VERSION);
echo $WP_Insights_Replayer_Instance->getReplayPage();
?>
