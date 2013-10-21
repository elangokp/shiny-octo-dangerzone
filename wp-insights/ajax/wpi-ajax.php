<?php
/**
 * WordPress AJAX Process Execution - Edited for some modifications required by the plugin.
 * Mainly had to add some code for compatibility with XDomainRequest of IE10.
 *
 * @package WordPress
 * @subpackage Administration
 *
 * @link http://codex.wordpress.org/AJAX_in_Plugins
 */

/**
 * Executing AJAX process.
 *
 * @since 2.1.0
 */
define( 'DOING_AJAX', true );
//define( 'WP_ADMIN', true );

/** Load WordPress Bootstrap */
//require_once( dirname( dirname( __FILE__ ) ) . '/wp-load.php' );
$parse_uri = explode( 'wp-content', $_SERVER['SCRIPT_FILENAME'] );
require_once( $parse_uri[0] . 'wp-load.php' );

/** Allow for cross-domain requests (from the frontend). */
send_origin_headers();

//XDomainRequest in IE10 sends post data as text. hence we have manually populate the $_REQUEST variable
if(count($_REQUEST) == 0) {
	error_log("Inside empty request variable");
	parse_str(file_get_contents('php://input'), $_REQUEST);
	$_POST = $_REQUEST;
	error_log(print_r($_REQUEST,true));
}

// Require an action parameter
if ( empty( $_REQUEST['action'] ) )
	die( '0' );


@header( 'Content-Type: text/html; charset=' . get_option( 'blog_charset' ) );
@header( 'X-Robots-Tag: noindex' );

send_nosniff_header();
nocache_headers();

/** Load WordPress Administration APIs */
require_once( ABSPATH . 'wp-admin/includes/admin.php' );

/** Load Ajax Handlers for WordPress Core */
require_once( ABSPATH . 'wp-admin/includes/ajax-actions.php' );

if ( is_user_logged_in() ) {
	error_log("before do_action logged in wp_ajax_" . $_REQUEST['action']);
	do_action( 'wp_ajax_' . $_REQUEST['action'] ); // Authenticated actions
} else {
	error_log("before do_action not logged in wp_ajax_nopriv_" . $_REQUEST['action']);
	do_action( 'wp_ajax_nopriv_' . $_REQUEST['action'] ); // Non-admin actions
}
	

// Default status
die( '0' );
?>