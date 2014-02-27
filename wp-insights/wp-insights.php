<?php
/**
 * The WordPress Plugin Boilerplate.
 *
 * A foundation off of which to build well-documented WordPress plugins that also follow
 * WordPress coding standards and PHP best practices.
 *
 * @package   WP_Insights
 * @author    Elango KP <elango@cybermint.com>
 * @link      http://www.cybermint.com
 * @copyright 2013 CyberMint
 *
 * @wordpress-plugin
 * Plugin Name: WP Insights
 * Plugin URI:  http://www.cybermint.com/wpinsights
 * Description: Records and playsback all the visitor sessions on the wordpress pages.
 * Version:     0.8.3 Beta
 * Author:      Elango
 * Author URI:  http://www.cybermint.com
 * Text Domain: plugin-name-locale
 * Domain Path: /lang
 */

// If this file is called directly, abort.
if ( ! defined( 'WPINC' ) ) {
	die;
}

require_once('wp-updates-plugin.php');
new WPUpdatesPluginUpdater( 'http://wp-updates.com/api/1/plugin', 219, plugin_basename(__FILE__) );

// TODO: replace `class-plugin-name.php` with the name of the actual plugin's class file
require_once( plugin_dir_path( __FILE__ ) . 'class-wp-insights.php' );
require_once( plugin_dir_path( __FILE__ ) . 'class-wp-insights-db-utils.php' );

// Register hooks that are fired when the plugin is activated, deactivated, and uninstalled, respectively.
// TODO: replace WP_Insights with the name of the plugin defined in `class-plugin-name.php`
register_activation_hook( __FILE__, array( 'WP_Insights', 'activate' ) );
register_deactivation_hook( __FILE__, array( 'WP_Insights', 'deactivate' ) );
if ( function_exists('register_uninstall_hook') ) {
	register_uninstall_hook(__FILE__, array( 'WP_Insights', 'uninstall' ));
}	

// TODO: replace WP_Insights with the name of the plugin defined in `class-plugin-name.php`
global $wpdb;
$WP_Insights_DB_Utils_Instance = WP_Insights_DB_Utils::get_instance();
$WP_Insights_DB_Utils_Instance->setWpdb($wpdb);
$WP_Insights_instance = WP_Insights::get_instance();
WP_Insights::setWpInsightsDBUtils($WP_Insights_DB_Utils_Instance);
//if (is_plugin_active(__FILE__)) {
	//$WP_Insights_instance->setRecorderStatus();
//}
//error_log("Inside main file: ".$wpdb->prefix);
?>