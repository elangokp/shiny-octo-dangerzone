<?php
/**
 * Represents the view for the heatmap.
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
require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights.php');
require_once(plugin_dir_path(dirname(__FILE__)).'replay/class-wp-insights-heatmap.php');
$pid = $_GET['pid'];
$hmtype = $_GET['hmtype'];
$scrx = $_GET['scrx'];
$scry = $_GET['scry'];

//For No Cache
header('Cache-Control: no-cache, no-store, must-revalidate'); // HTTP 1.1.
header('Pragma: no-cache'); // HTTP 1.0.
header('Expires: 0'); // Proxies.

$WP_Insights_Heatmap_Instance = new WP_Insights_Heatmap($pid,$hmtype,$scrx,$scry,WP_Insights::VERSION);
echo $WP_Insights_Heatmap_Instance->getHeatmapPage()
?>
