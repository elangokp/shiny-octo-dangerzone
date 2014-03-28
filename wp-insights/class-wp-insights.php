<?php
/**
 * Plugin Name.
 *
 * @package   WP_Insights
 * @author    Elango KP <elango@cybermint.com>
 * @license   GPL-2.0+
 * @link      http://www.cybermint.com
 * @copyright 2013 CyberMint
 */

/**
 * Plugin class.
 *
 * TODO: Rename this class to a proper name for your plugin.
 *
 * @package WP_Insights
 * @author  Elango KP <elango@cybermint.com>
 */

require_once('class-wp-insights-db-utils.php');
require_once('class-wp-insights-utils.php');
require_once('class-wp-insights-recorder.php');
require_once(plugin_dir_path(__FILE__).'replay/class-wp-insights-event-data.php');
require_once(plugin_dir_path(__FILE__).'views/class-wp-insights-recording-ps-stats-list-table.php');
class WP_Insights {

	/**
	 * Plugin version, used for cache-busting of style and script file references.
	 *
	 * @since   1.0.0
	 *
	 * @const   string
	 */
	const VERSION = '0.9.2Beta';

	/**
	 * Unique identifier for your plugin.
	 *
	 * Use this value (not the variable name) as the text domain when internationalizing strings of text. It should
	 * match the Text Domain file header in the main plugin file.
	 *
	 * @since    1.0.0
	 *
	 * @var      string
	 */
	protected $plugin_slug = 'wp-insights';

	/**
	 * Instance of this class.
	 *
	 * @since    1.0.0
	 *
	 * @var      object
	 */
	protected static $instance;

	/**
	 * Slug of the plugin screen.
	 *
	 * @since    1.0.0
	 *
	 * @var      string
	 */
	protected $wp_insights_admin_main_menu_hook_suffix = null;
	
	protected $wp_insights_recordings_sub_menu_hook_suffix = null;
	
	protected $wp_insights_page_stats_sub_menu_hook_suffix = null;
	
	protected $wp_insights_settings_sub_menu_hook_suffix = null;
	
	protected $wp_insights_wpdb = null;
	
	protected $WP_Insights_Recorder_Instance = null;
	
	protected static $WP_Insights_DB_Utils_Instance = null;
	
	protected static $cache_dir = null;
	
	protected static $browscap_cache_dir = null;
	
	protected static $recording_option_name = "wpi_recording_status";
	
	protected static $default_recording_option_value = "ON";
	
	protected static $max_concurrent_recordings_option_name = "wpi_max_concurrent_recordings";
	
	protected static $default_max_concurrent_recordings_option_value = 5;
	
	protected static $default_recording_interval = 7; //in seconds

	/**
	 * Initialize the plugin by setting localization, filters, and administration functions.
	 *
	 * @since     1.0.0
	 */
	private function __construct() {

		//error_log(print_r($_REQUEST, true));
		//error_log("Inside wp-insights class construct");
		// Load plugin text domain
		add_action( 'init', array( $this, 'load_plugin_textdomain' ) );
		add_action( 'init', array( $this, 'register_session' ) );

		// Add the options page and menu item.
		add_action( 'admin_menu', array( $this, 'add_plugin_admin_menu' ) );

		// Add an action link pointing to the options page. TODO: Rename "plugin-name.php" to the name your plugin
		// $plugin_basename = plugin_basename( plugin_dir_path( __FILE__ ) . 'plugin-name.php' );
		// add_filter( 'plugin_action_links_' . $plugin_basename, array( $this, 'add_action_links' ) );

		// Load admin style sheet and JavaScript.
		add_action( 'admin_enqueue_scripts', array( $this, 'enqueue_admin_styles' ) );
		add_action( 'admin_enqueue_scripts', array( $this, 'enqueue_admin_scripts' ) );

		// Load public-facing style sheet and JavaScript.
		//add_action( 'wp_enqueue_scripts', array( $this, 'enqueue_styles' ) );
		//add_action( 'wp_enqueue_scripts', array( $this, 'enqueue_scripts' ) );


		// Define custom functionality. Read more about actions and filters: http://codex.wordpress.org/Plugin_API#Hooks.2C_Actions_and_Filters
		//add_action('wp_footer', array( $this, 'add_wpinsights_scripts' ) );
		add_action('wp_ajax_nopriv_wpistore', array( $this, 'store_user_data' ) );
		add_action('wp_ajax_nopriv_wpicachepage', array( $this, 'cache_user_page' ) );
		add_action('wp_ajax_nopriv_wpiappend', array( $this, 'append_user_data' ) );
		add_action('wp_ajax_nopriv_wpiexit', array( $this, 'exit_user_data' ) );
		add_action('wp_ajax_nopriv_wpimouseeventdata', array( $this, 'get_mouse_event_data' ) );
		
		add_action('wp_ajax_wpistore', array( $this, 'store_user_data' ) );
		add_action('wp_ajax_wpicachepage', array( $this, 'cache_user_page' ) );
		add_action('wp_ajax_wpiappend', array( $this, 'append_user_data' ) );
		add_action('wp_ajax_wpiexit', array( $this, 'exit_user_data' ) );
		add_action('wp_ajax_wpimouseeventdata', array( $this, 'get_mouse_event_data' ) );
		add_action('wp_ajax_wpipagesections', array( $this, 'get_wpi_page_sections' ) );
		add_action('wp_ajax_wpipsrecordingstats', array( $this, 'get_wpi_page_section_recording_stats' ) );
		
		
		add_action('wp_head', array($this, 'add_IE9_Compatibility_Meta_Tag'));
		add_action('plugins_loaded', array($this, 'setRecorderStatus'));
		//add_action('admin_notices', array($this, 'wp_insights_admin_notices'));
		//add_filter( 'TODO', array( $this, 'filter_method_name' ) );
		
		add_shortcode( 'wpi_page_section', array($this, 'add_page_section') );
		add_action( 'add_meta_boxes', array( $this, 'add_wpi_meta_box' ) );
		add_action( 'save_post', array( $this, 'save_wpi_meta' ) );
		
		//add_action( 'init', array( $this, 'add_wpi_tiny_mce_plugin' ) );
		add_action( 'media_buttons', array( $this, 'add_wpi_shortcode_button' ) );
		
		self::$cache_dir = dirname(dirname(plugin_dir_path(__FILE__)))."/wpicache/";
		self::$cache_dir = str_replace('\\', '/', self::$cache_dir);
		self::$browscap_cache_dir = self::$cache_dir."browscapcache/";

	}
	
	public function get_cache_dir() {
		return self::$cache_dir;
	}
	
	public function register_session() {
		if(!session_id()) {
			session_start();
		}
	}
	
	public function add_wpi_shortcode_button() {
		
		if (!is_admin()) 
			return;
		global $pagenow;
		$is_post_edit_page = in_array($pagenow, array('post.php', 'page.php', 'page-new.php', 'post-new.php'));
        
        if(!$is_post_edit_page)
            return;

        // do a version check for the new 3.5 UI
        $version    = get_bloginfo('version');

        if ($version < 3.5) {
            // show button for v 3.4 and below
            $image_btn = plugins_url('assets/eye-20.png', __FILE__);
            echo '<a id="insert_wpi_page_section_shortcode" href="javascript:void(0)" title="Insert Page Section"><img src="'.$image_btn.'" alt="Insert WP Insights Page Sections Start" /></a>';
        } else {
            // display button matching new UI
            echo '<style>.wpi_media_icon{
                    background:url(' . plugins_url('assets/eye-20.png', __FILE__) . ') no-repeat top left;
                    display: inline-block;
                    height: 20px;
                    margin: 0 2px 0 0;
                    vertical-align: text-top;
                    width: 20px;
                    }
                    .wp-core-ui a.wpi_media_link{
                     padding-left: 0.4em;
                    }
                 </style>
                  <a id="insert_wpi_page_section_shortcode" href="javascript:void(0)" class="button wpi_media_link" title="Insert Page Section"><span class="wpi_media_icon "></span> Insert Page Section</a>';
        }
	}
	
	/*public function add_wpi_tiny_mce_plugin() {
		add_filter( "mce_external_plugins", array( $this, 'add_wpi_tiny_mce_buttons' ) );
		add_filter( 'mce_buttons', array( $this, 'register_wpi_tiny_mce_buttons' ) );
	}
	public function add_wpi_tiny_mce_buttons( $plugin_array ) {
		$plugin_array['WpInsights'] = plugins_url('js/dev/wpi-tiny-mce-plugin.js', __FILE__);;
		return $plugin_array;
	}
	public function register_wpi_tiny_mce_buttons( $buttons ) {
		array_push( $buttons, 'addWPIPageSection' ); // dropcap', 'recentposts
		return $buttons;
	}*/
	

	/**
	 * Return an instance of this class.
	 *
	 * @since     1.0.0
	 *
	 * @return    object    A single instance of this class.
	 */
	public static function get_instance() {

		// If the single instance hasn't been set, set it now.
		if ( !isset(self::$instance) ) {
			//error_log("calling constructor");
			self::$instance = new self;
		}

		return self::$instance;
	}

	/**
	 * Fired when the plugin is activated.
	 *
	 * @since    1.0.0
	 *
	 * @param    boolean    $network_wide    True if WPMU superadmin uses "Network Activate" action, false if WPMU is disabled or plugin is activated on an individual blog.
	 */
	public static function activate( $network_wide ) {
		//$WP_Insights_DB_Utils_Instance = WP_Insights_DB_Utils::get_instance();
		//$WP_Insights_DB_Utils_Instance->setWpdb(self::get_instance()->wp_insights_wpdb);
		self::$WP_Insights_DB_Utils_Instance->wpinsights_db_install();
		if(get_option(self::$recording_option_name) === false){
			update_option(self::$recording_option_name, self::$default_recording_option_value );
		}
		
		if(get_option(self::$max_concurrent_recordings_option_name) === false){
			update_option(self::$max_concurrent_recordings_option_name, self::$default_max_concurrent_recordings_option_value );
		}
		
		WP_Insights_Utils::createDirectory(self::$cache_dir);
		WP_Insights_Utils::createDirectory(self::$browscap_cache_dir);
	}

	/**
	 * Fired when the plugin is deactivated.
	 *
	 * @since    1.0.0
	 *
	 * @param    boolean    $network_wide    True if WPMU superadmin uses "Network Deactivate" action, false if WPMU is disabled or plugin is deactivated on an individual blog.
	 */
	public static function deactivate( $network_wide ) {
		// TODO: Define deactivation functionality here
	}
	
	public static function uninstall(){
		//error_log("Inside Uninstall");
		//$WP_Insights_DB_Utils_Instance = WP_Insights_DB_Utils::get_instance();
		//$WP_Insights_DB_Utils_Instance->setWpdb(self::get_instance()->wp_insights_wpdb);
		self::$WP_Insights_DB_Utils_Instance->wpinsights_db_uninstall();
		WP_Insights_Utils::deleteDirectory(self::$cache_dir);
	}
	
	/* public function setWpdb($given_wpdb) {
		error_log("Inside wp-insights class - given wpdb: ".$given_wpdb->prefix);
		$this->wp_insights_wpdb = $given_wpdb;
		error_log("Inside wp-insights class - wp_insights_wpdb: ".$this->wp_insights_wpdb->prefix);
	} */
	
	public static function setWpInsightsDBUtils($given_wp_insights_db_utils_instance) {
		//error_log("Inside wp-insights class - given wpdb: ".$given_wpdb->prefix);
		self::$WP_Insights_DB_Utils_Instance = $given_wp_insights_db_utils_instance;
		//error_log("Inside wp-insights class - wp_insights_wpdb: ".$this->wp_insights_wpdb->prefix);
	}
	
	public function setRecorderStatus() {
		//$recording_status = @ self::$WP_Insights_DB_Utils_Instance->db_option("recording_status");
		$recording_status = get_option(self::$recording_option_name, self::$default_recording_option_value);
		//error_log("recording_status is ".$recording_status);
		if(strcasecmp(trim($recording_status), 'ON') == 0) {
			//error_log("Inside matches ON");
			if(!has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) )) {
				//error_log("Inside matches ON and has NO Action");
				add_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) );
				//error_log(has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) ));
			}
		} else {
			//error_log("Inside doesnt match ON");
			if(has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) )) {
				//error_log("Inside matches ON and has Action");
				$priority = has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) );
				remove_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ), $priority);
				//error_log(has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) ));
			}
		}
	}
	
	protected function getRecordingStatusDisplay() {
		//error_log("Inside matches getRecordingStatusDisplay");
		$recording_status_display = null;
		if(has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) )) {
			//error_log("Inside has Action");
			$recording_status_display = "<span class='recording-on'>Recording</span>";
		} else {
			//error_log("Inside doesnt have Action");
			$recording_status_display = "<span class='recording-off'>Not Recording</span>";
		}
		$recording_status_display .= '<a href="admin.php?page=wp-insights-settings-sub-menu" class="add-new-h2">Change Status</a>';
		return $recording_status_display;
	}

	/**
	 * Load the plugin text domain for translation.
	 *
	 * @since    1.0.0
	 */
	public function load_plugin_textdomain() {

		$domain = $this->plugin_slug;
		$locale = apply_filters( 'plugin_locale', get_locale(), $domain );

		load_textdomain( $domain, WP_LANG_DIR . '/' . $domain . '/' . $domain . '-' . $locale . '.mo' );
		load_plugin_textdomain( $domain, FALSE, basename( dirname( __FILE__ ) ) . '/lang/' );
	}

	/**
	 * Register and enqueue admin-specific style sheet.
	 *
	 * @since     1.0.0
	 *
	 * @return    null    Return early if no settings page is registered.
	 */
	public function enqueue_admin_styles() {
		
		//$screen_id = get_current_screen()->id;
		
		//if ( stripos($screen_id, 'wp-insights') !== FALSE ) {
			wp_enqueue_style( $this->plugin_slug .'-admin-styles', plugins_url( 'css/admin.css', __FILE__ ), array(), self::VERSION );
			wp_enqueue_style('thickbox');
			wp_enqueue_style('jquery-style', 'http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.2/themes/smoothness/jquery-ui.css');
		//}

	}

	/**
	 * Register and enqueue admin-specific JavaScript.
	 *
	 * @since     1.0.0
	 *
	 * @return    null    Return early if no settings page is registered.
	 */
	public function enqueue_admin_scripts() {

		/* if ( ! isset( $this->plugin_screen_hook_suffix ) ) {
			return;
		}

		$screen = get_current_screen();
		if ( $screen->id == $this->plugin_screen_hook_suffix ) { */
			wp_enqueue_script( $this->plugin_slug . '-admin-script', plugins_url( 'js/admin.js', __FILE__ ), array( 'jquery' ), self::VERSION );
			wp_enqueue_script('thickbox');
			wp_enqueue_script('jquery-ui-datepicker');
		//}

	}

	/**
	 * Register and enqueue public-facing style sheet.
	 *
	 * @since    1.0.0
	 */
	public function enqueue_styles() {
		wp_enqueue_style( $this->plugin_slug . '-plugin-styles', plugins_url( 'css/public.css', __FILE__ ), array(), self::VERSION );
	}

	/**
	 * Register and enqueues public-facing JavaScript files.
	 *
	 * @since    1.0.0
	 */
	public function enqueue_scripts() {
		wp_enqueue_script( $this->plugin_slug . '-plugin-script', plugins_url( 'js/public.js', __FILE__ ), array( 'jquery' ), self::VERSION );
	}
	
	/**
	 * Adds the meta box container.
	 */
	public function add_wpi_meta_box( $post_type ) {
		$post_types = array('post', 'page');     //limit meta box to certain post types
		if ( in_array( $post_type, $post_types )) {
			add_meta_box(
					'wpi_page_section_meta_box'
					,'WP-Insights Page Sections'
					,array( $this, 'render_wpi_page_section_meta_box' )
					,$post_type
					,'advanced'
					,'high'
					);
		}
	}
	
	/**
	 * Save the meta when the post is saved.
	 *
	 * @param int $post_id The ID of the post being saved.
	 */
	public function save_wpi_meta( $post_id ) {
	
		/*
		 * We need to verify this came from the our screen and with proper authorization,
		* because save_post can be triggered at other times.
		*/
	
		// Check if our nonce is set.
		if ( ! isset( $_POST['wpi_page_section_meta_box_nonce'] ) )
			return $post_id;
	
		$nonce = $_POST['wpi_page_section_meta_box_nonce'];
	
		// Verify that the nonce is valid.
		if ( ! wp_verify_nonce( $nonce, 'wpi_page_section_meta_box' ) )
			return $post_id;
	
		// If this is an autosave, our form has not been submitted,
		//     so we don't want to do anything.
		if ( defined( 'DOING_AUTOSAVE' ) && DOING_AUTOSAVE )
			return $post_id;
	
		// Check the user's permissions.
		if ( 'page' == $_POST['post_type'] ) {
	
			if ( ! current_user_can( 'edit_page', $post_id ) )
				return $post_id;
	
		} else {
	
			if ( ! current_user_can( 'edit_post', $post_id ) )
				return $post_id;
		}
	
		/* OK, its safe for us to save the data now. */
	
		// Sanitize the user input.
		//$pageSection0 = sanitize_text_field( $_POST['wpi_page_section_0'] );
	
		// Update the meta field.
		update_post_meta( $post_id, 'wpi_page_section_00', sanitize_text_field( $_POST['wpi_page_section_00'] ) );
		update_post_meta( $post_id, 'wpi_page_section_01', sanitize_text_field( $_POST['wpi_page_section_01'] ) );
		update_post_meta( $post_id, 'wpi_page_section_02', sanitize_text_field( $_POST['wpi_page_section_02'] ) );
		update_post_meta( $post_id, 'wpi_page_section_03', sanitize_text_field( $_POST['wpi_page_section_03'] ) );
		update_post_meta( $post_id, 'wpi_page_section_04', sanitize_text_field( $_POST['wpi_page_section_04'] ) );
		update_post_meta( $post_id, 'wpi_page_section_05', sanitize_text_field( $_POST['wpi_page_section_05'] ) );
		update_post_meta( $post_id, 'wpi_page_section_06', sanitize_text_field( $_POST['wpi_page_section_06'] ) );
		update_post_meta( $post_id, 'wpi_page_section_07', sanitize_text_field( $_POST['wpi_page_section_07'] ) );
		update_post_meta( $post_id, 'wpi_page_section_08', sanitize_text_field( $_POST['wpi_page_section_08'] ) );
		update_post_meta( $post_id, 'wpi_page_section_09', sanitize_text_field( $_POST['wpi_page_section_09'] ) );
		update_post_meta( $post_id, 'wpi_page_section_10', sanitize_text_field( $_POST['wpi_page_section_10'] ) );
	}
	
	
	/**
	 * Render Meta Box content.
	 *
	 * @param WP_Post $post The post object.
	 */
	public function render_wpi_page_section_meta_box( $post ) {
	
		// Add an nonce field so we can check for it later.
		wp_nonce_field( 'wpi_page_section_meta_box', 'wpi_page_section_meta_box_nonce' );
	
		// Use get_post_meta to retrieve an existing value from the database.
		$wpi_page_section_00_value = get_post_meta( $post->ID, 'wpi_page_section_00', true );
		$wpi_page_section_01_value = get_post_meta( $post->ID, 'wpi_page_section_01', true );
		$wpi_page_section_02_value = get_post_meta( $post->ID, 'wpi_page_section_02', true );
		$wpi_page_section_03_value = get_post_meta( $post->ID, 'wpi_page_section_03', true );
		$wpi_page_section_04_value = get_post_meta( $post->ID, 'wpi_page_section_04', true );
		$wpi_page_section_05_value = get_post_meta( $post->ID, 'wpi_page_section_05', true );
		$wpi_page_section_06_value = get_post_meta( $post->ID, 'wpi_page_section_06', true );
		$wpi_page_section_07_value = get_post_meta( $post->ID, 'wpi_page_section_07', true );
		$wpi_page_section_08_value = get_post_meta( $post->ID, 'wpi_page_section_08', true );
		$wpi_page_section_09_value = get_post_meta( $post->ID, 'wpi_page_section_09', true );
		$wpi_page_section_10_value = get_post_meta( $post->ID, 'wpi_page_section_10', true );
	
		// Display the form, using the current value.
		echo '<input type="hidden" id="wpipostid" value="'.$post->ID.'"/>';
		echo '<div>';
		echo '<label for="wpi_page_section_00">Page Section 00:</label>';
		echo '<input type="text" id="wpi_page_section_00" name="wpi_page_section_00" value="Page Start" size="25" readonly/>';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_01">Page Section 01:</label>';
		echo '<input type="text" id="wpi_page_section_01" name="wpi_page_section_01" value="'.$wpi_page_section_01_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_02">Page Section 02:</label>';
		echo '<input type="text" id="wpi_page_section_02" name="wpi_page_section_02" value="'.$wpi_page_section_02_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_03">Page Section 03:</label>';
		echo '<input type="text" id="wpi_page_section_03" name="wpi_page_section_03" value="'.$wpi_page_section_03_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_04">Page Section 04:</label>';
		echo '<input type="text" id="wpi_page_section_04" name="wpi_page_section_04" value="'.$wpi_page_section_04_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_05">Page Section 05:</label>';
		echo '<input type="text" id="wpi_page_section_05" name="wpi_page_section_05" value="'.$wpi_page_section_05_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_06">Page Section 06:</label>';
		echo '<input type="text" id="wpi_page_section_06" name="wpi_page_section_06" value="'.$wpi_page_section_06_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_07">Page Section 07:</label>';
		echo '<input type="text" id="wpi_page_section_07" name="wpi_page_section_07" value="'.$wpi_page_section_07_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_08">Page Section 08:</label>';
		echo '<input type="text" id="wpi_page_section_08" name="wpi_page_section_08" value="'.$wpi_page_section_08_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_09">Page Section 09:</label>';
		echo '<input type="text" id="wpi_page_section_09" name="wpi_page_section_09" value="'.$wpi_page_section_09_value.'" size="25" />';
		echo '</div>';
		
		echo '<div>';
		echo '<label for="wpi_page_section_10">Page Section 10:</label>';
		echo '<input type="text" id="wpi_page_section_10" name="wpi_page_section_10" value="'.$wpi_page_section_10_value.'" size="25" />';
		echo '</div>';
	}
	

	/**
	 * Register the administration menu for this plugin into the WordPress Dashboard menu.
	 *
	 * @since    1.0.0
	 */
	public function add_plugin_admin_menu() {

		/*
		 * TODO:
		 *
		 * Change 'Page Title' to the title of your plugin admin page
		 * Change 'Menu Text' to the text for menu item for the plugin settings page
		 * Change 'plugin-name' to the name of your plugin
		 */
		$this->wp_insights_admin_main_menu_hook_suffix = add_menu_page(
			'WP Insights Visitor Recordings',
			'WP Insights',
			'manage_options',
			$this->plugin_slug.'-admin-main-menu',
			array( $this, 'display_wp_insights_recordings_page' ),
			plugin_dir_url( __FILE__ ).'assets/eye-20.png',
			"25.11"
		);

		
		$this->wp_insights_recordings_sub_menu_hook_suffix = add_submenu_page(
				$this->plugin_slug.'-admin-main-menu',
				'WP Insights Visitor Recordings',
				'Recordings',
				'manage_options',
				$this->plugin_slug.'-admin-main-menu',
				array( $this, 'display_wp_insights_recordings_page' )
		); 
		
		$this->wp_insights_page_stats_sub_menu_hook_suffix = add_submenu_page(
				$this->plugin_slug.'-admin-main-menu',
				'WP Insights Page Stats',
				'Page Stats',
				'manage_options',
				$this->plugin_slug.'-page-stats-sub-menu',
				array( $this, 'display_wp_insights_page_stats_page' )
		);
		
		$this->wp_insights_settings_sub_menu_hook_suffix = add_submenu_page(
				$this->plugin_slug.'-admin-main-menu',
				'WP Insights Settings',
				'Settings',
				'manage_options',
				$this->plugin_slug.'-settings-sub-menu',
				array( $this, 'display_wp_insights_settings_page' )
		);
		
		add_action( 'admin_footer-'. $this->wp_insights_recordings_sub_menu_hook_suffix, array( $this, 'add_wpinsights_admin_scripts' ) );
		add_action( 'admin_footer-'. $this->wp_insights_page_stats_sub_menu_hook_suffix, array( $this, 'add_wpinsights_admin_scripts' ) );
		add_action( 'admin_footer-'. $this->wp_insights_settings_sub_menu_hook_suffix, array( $this, 'add_wpinsights_admin_scripts' ) );
	}

	/**
	 * Render the settings page for this plugin.
	 *
	 * @since    1.0.0
	 */
	public function display_wp_insights_recordings_page() {
		$recording_status_display = $this->getRecordingStatusDisplay();
		include_once( 'views/recordings.php' );
	}
	
	public function display_wp_insights_page_stats_page() {
		$recording_status_display = $this->getRecordingStatusDisplay();
		include_once( 'views/page-stats.php' );
	}
	
	public function display_wp_insights_settings_page() {
		if(isset($_POST['change_recorder_status'])){
			if($_POST['change_recorder_status'] == 'start') {
				update_option(self::$recording_option_name, "ON" );
				//self::$WP_Insights_DB_Utils_Instance->db_set_option("recording_status","ON");
			} else if($_POST['change_recorder_status'] == 'stop') {
				update_option(self::$recording_option_name, "OFF" );
				//self::$WP_Insights_DB_Utils_Instance->db_set_option("recording_status","OFF");
			}
			$this->setRecorderStatus();
		}
		
		if(isset($_POST['max_concurrent_recordings'])){
			update_option(self::$max_concurrent_recordings_option_name, $_POST['max_concurrent_recordings']);
		}
		$recording_status_display = $this->getRecordingStatusDisplay();
		
		if(has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) )) {
			$is_recording = true;
		} else {
			$is_recording = false;
		}
		
		$max_concurrent_recordings = get_option(self::$max_concurrent_recordings_option_name, self::$default_max_concurrent_recordings_option_value);
		
		error_log($max_concurrent_recordings);
		
		include_once( 'views/settings.php' );
	}
	
	/* public function wp_insights_admin_notices() {
	
		// Display notice if user has '_wptuts_display_notice' stored and on screen with id 'portfolio'
		$screen_id = get_current_screen()->id;
		//$display_notice = get_user_meta( get_current_user_id(), '_wptuts_display_notice', true );
	
		if ( stripos($screen_id, 'wp-insights') !== FALSE ) {
			if(has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) )) {
				printf( '<div class="wp_insights_green_notice"> <p> %s </p> </div>', 'Wp Insights is recording' );
			} else {
				printf( '<div class="error"> <p> %s </p> </div>', 'Wp Insights is not recording' );			
			}
			
		}
	
	} */

	/**
	 * Add settings action link to the plugins page.
	 *
	 * @since    1.0.0
	 */
	public function add_action_links( $links ) {

		return array_merge(
			array(
				'settings' => '<a href="' . admin_url( 'plugins.php?page=plugin-name' ) . '">' . __( 'Settings', $this->plugin_slug ) . '</a>'
			),
			$links
		);

	}

	/**
	 * NOTE:  Actions are points in the execution of a page or process
	 *        lifecycle that WordPress fires.
	 *
	 *        WordPress Actions: http://codex.wordpress.org/Plugin_API#Actions
	 *        Action Reference:  http://codex.wordpress.org/Plugin_API/Action_Reference
	 *
	 * @since    1.0.0
	 */
	public function action_method_name() {
		// TODO: Define your action hook callback here
	}

	/**
	 * NOTE:  Filters are points of execution in which WordPress modifies data
	 *        before saving it or sending it to the browser.
	 *
	 *        WordPress Filters: http://codex.wordpress.org/Plugin_API#Filters
	 *        Filter Reference:  http://codex.wordpress.org/Plugin_API/Filter_Reference
	 *
	 * @since    1.0.0
	 */
	public function filter_method_name() {
		// TODO: Define your filter hook callback here
	}
	
	public function add_page_section($atts) {
		// TODO: use this http://www.benknowscode.com/2013/07/detect-dom-element-scrolled-with-jquery.html
		extract( shortcode_atts( array(
		'id' => 'no-id',
		'name' => 'unnamed-section'
		), $atts ) );
		return '<img id="wpipagesection-'.$id.'" data-psid="'.$id.'" data-psname="'.$name.'" class="wpipagesection" width=1px height=1px src="'.plugins_url("/assets/spacer.gif",  __FILE__).'"/>';
	}
	
	public function store_user_data() {
		error_log("Inside store_user_data");
		$this->WP_Insights_Recorder_Instance = WP_Insights_Recorder::get_instance();
		$this->WP_Insights_Recorder_Instance->set_wp_insights_db_utils(self::$WP_Insights_DB_Utils_Instance);
		$this->WP_Insights_Recorder_Instance->setCacheDir(self::$cache_dir);
		$this->WP_Insights_Recorder_Instance->setBrowscapCacheDir(self::$browscap_cache_dir);
		echo $this->WP_Insights_Recorder_Instance->store();
		die();
	}
	
	public function cache_user_page() {
		error_log("Inside cache_user_page");
		$this->WP_Insights_Recorder_Instance = WP_Insights_Recorder::get_instance();
		$this->WP_Insights_Recorder_Instance->set_wp_insights_db_utils(self::$WP_Insights_DB_Utils_Instance);
		$this->WP_Insights_Recorder_Instance->setCacheDir(self::$cache_dir);
		$this->WP_Insights_Recorder_Instance->setBrowscapCacheDir(self::$browscap_cache_dir);
		$this->WP_Insights_Recorder_Instance->cache();
		die();
	}
	
	public function append_user_data() {
		error_log("Inside append_user_data");
		$this->WP_Insights_Recorder_Instance = WP_Insights_Recorder::get_instance();
		$this->WP_Insights_Recorder_Instance->set_wp_insights_db_utils(self::$WP_Insights_DB_Utils_Instance);
		$this->WP_Insights_Recorder_Instance->setCacheDir(self::$cache_dir);
		$this->WP_Insights_Recorder_Instance->setBrowscapCacheDir(self::$browscap_cache_dir);
		$this->WP_Insights_Recorder_Instance->append();
		die();
	}
	
	public function exit_user_data() {
		//error_log("Exit call triggered");
		$this->append_user_data();
	}
	
	public function get_mouse_event_data() {
		error_log("Inside get_mouse_event_data");
		$lrid = isset($_GET['lrid'])?$_GET['lrid']:null;
		$datatype = isset($_GET['dt'])?$_GET['dt']:null;
		$fromDate = isset($_GET['fd'])?$_GET['fd']:null;
		$tillDate = isset($_GET['td'])?$_GET['td']:null;
		$currentPageNumber = isset($_GET['cpn'])?$_GET['cpn']:null;
		$recordsPerPage = isset($_GET['rpp'])?$_GET['rpp']:null;
		$WP_Insights_Event_Data_Instance = new WP_Insights_Event_Data($lrid,$datatype,$fromDate,$tillDate,$currentPageNumber,$recordsPerPage);
		echo $WP_Insights_Event_Data_Instance->getMouseEventData();
		die();
	}
	
	public function get_wpi_page_sections() {
		?>
		<html>
			<head>
			    <script type="text/javascript">
			        jQuery("input[id^='tb_button_wpi_page_section']").click(function(){
			                    tinyMCE.activeEditor.execCommand('mceInsertContent', 0, '[wpi_page_section id="'+jQuery(this).data('psid')+'" name="'+jQuery(this).data('psname')+'"/]');
			                    tb_remove();
			        })
			    </script>			
			</head>
			<body>
				<?php 
					$postId = $_GET['postid'];
					$pageSections = get_post_meta($postId);
					foreach($pageSections as $meta_key => $meta_value)
					{
						error_log(print_r($meta_key, true));
						error_log(print_r($meta_value, true));
						if(stripos($meta_key, "wpi_page_section") !== FALSE 
								&& $meta_value !== null && !empty($meta_value) 
								&& $meta_value[0] !== null && $meta_value[0] !== ""
								&& $meta_value[0] !== "Page Start") {
							?>
							<div>
								<label for="<?php echo "tb_".$meta_key?>">Page Section <?php echo trim($meta_key,'wpi_page_section_');?>:</label>
								<input type="text" id="<?php echo "tb_text_".$meta_key?>" name="<?php echo "tb_".$meta_key?>" value="<?php echo $meta_value[0]?>" size="25" readonly/>
								<input type="button" id="<?php echo "tb_button_".$meta_key?>" data-psid="<?php echo $meta_key?>" data-psname="<?php echo $meta_value[0]?>" value="Insert"/>
							</div>
						<?php }
					}
				?>
			</body>
		</html>

		    <?php
		    die();
	}
	
	public function get_wpi_page_section_recording_stats() {
?>
		<html>
			<head/>
			<body>
				<?php 
					$WP_Insights_Recording_PS_Stats_List_Table_Instance = new WP_Insights_Recording_PS_Stats_List_Table($_GET['rid']);
	    			$WP_Insights_Recording_PS_Stats_List_Table_Instance->prepare_items();
	    			$WP_Insights_Recording_PS_Stats_List_Table_Instance->display();
				?>
			</body>
		</html>

		    <?php
		    die();		
	}
	
	
	public function add_wpinsights_scripts() {
		//error_log("Inside add_wpinsights_scripts");
		$wpi_js_url = plugins_url('js/wpi-js.min.js', __FILE__);
		$json3_js_url = plugins_url('js/dev/json3.min.js', __FILE__);
		$smt_aux_js_url = plugins_url('js/dev/smt-aux.js', __FILE__);
		$smt_record_js_url = plugins_url('js/dev/smt-record.js', __FILE__);
		$smt_tracking_url = admin_url( 'admin-ajax.php' );
		$jquery_ui_scrollable_js = plugins_url('js/dev/jquery-ui-scrollable.js', __FILE__);
		//wp_register_script('smt-aux', $smt_aux_js_url);
		//wp_register_script('smt-record', $smt_record_js_url);
		//wp_enqueue_script('smt-aux');
		//wp_enqueue_script('smt-record');
		error_log(print_r($_GET,true));
		
		if(!empty($_GET['wpidev']) && $_GET['wpidev'] === "true") {?>

		<!-- Powered by WP Insights version <?php echo self::VERSION?>-->
		  <script id='wpi-trigger-script' type="text/javascript">
					//<![CDATA[
					var addressBarURL = top.location.href;
					var isFullyLoaded = false;
					
					if(addressBarURL.toLowerCase().indexOf("plugins/wp-insights/views/wpi-replay") < 0 
						&& addressBarURL.toLowerCase().indexOf("plugins/wp-insights/views/wpi-heat.php") < 0) {
			  			var jQuery_1_10_2_url = "//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js";
			  			var jQuery_UI_1_10_3_url = "//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js";
	
			  			jQuery.getScript( "<?php echo $json3_js_url?>");
	
			  			jQuery.getScript(jQuery_1_10_2_url, function() { 
			  				jQuery_1_10_2 = $.noConflict(true);
							jQuery_1_10_2.fn.getcssPath = function () {
							    if (this.length != 1) throw 'Requires one element.';
	
							    var path, node = this;
							    while (node.length) {
							        var realNode = node[0], name = realNode.localName || realNode.nodeName;
							        if (!name) break;
	
							        name = name.toLowerCase();
							        if (realNode.id) {
							            // As soon as an id is found, there's no need to specify more.
							            return name + '#' + realNode.id + (path ? '>' + path : '');
							        } else if (realNode.className) {
							            name += '.' + realNode.className.split(/\s+/).join('.');
							            name = name.replace(/\.+$/,"");
							        }
	
							        var parent = node.parent(), siblings = parent.children(name);
							        if (siblings.length > 1) name += ':eq(' + siblings.index(node) + ')';
							        path = name + (path ? '>' + path : '');
	
							        node = parent;
							    }
	
							    return path;
							};
	
							jQuery_1_10_2.fn.scrollStopped = function(delay,callback) {           
								jQuery_1_10_2(this).scroll(function(){
						            var self = this, $this = jQuery_1_10_2(self);
						            if ($this.data('scrollTimeout')) {
						              clearTimeout($this.data('scrollTimeout'));
						            }
						            $this.data('scrollTimeout', setTimeout(callback,delay,self));
						        });
						    };
						    
	
						    /*jQuery_1_10_2(window).scroll(function(event){
								   var st = jQuery(this).scrollTop();
								   if (st > lastScrollTop){
									   scrollDirection = "down";
								   } else {
									   scrollDirection = "up";
								   }
								   lastScrollTop = st;
								   console.log("From Direction Detection : " + scrollDirection);
								});*/
				  			
				  			jQuery.getScript( "<?php echo $smt_aux_js_url.'?v='.self::VERSION?>", function() 
				  			  {
				  				jQuery.getScript( "<?php echo $smt_record_js_url.'?v='.self::VERSION?>", function() 
				  		  			  {
					  					smt2.record({
										      recTime: 3000,
										      trackingUrl: "<?php echo $smt_tracking_url?>",
										      postInterval: <?php echo self::$default_recording_interval;?>
										    });
	
				  			  			}
				  		  			);
	
					  			}
				  			);
			  			});
	
					}	  			
					//]]>
			</script>
		<?php }else { 
						if(!isset($_COOKIE['smt-id'])) {
							$recordsTable = self::$WP_Insights_DB_Utils_Instance->getWpdb()->prefix.WP_Insights_DB_Utils::TBL_PLUGIN_PREFIX.WP_Insights_DB_Utils::TBL_RECORDS;
							$concurrent_recording_query = "SELECT COUNT( * ) AS clients, SUM( client_connections ) AS total_connections
															FROM (
															SELECT COUNT( * ) AS client_connections
															FROM $recordsTable
															WHERE UNIX_TIMESTAMP( CURRENT_TIMESTAMP( ) ) < ( UNIX_TIMESTAMP( sess_date ) + sess_time + ".(self::$default_recording_interval * 3)." )
															GROUP BY client_id	) AS c";
							$concurrent_recording_details = self::$WP_Insights_DB_Utils_Instance->db_query($concurrent_recording_query);
							$concurrent_recordings = $concurrent_recording_details[0]['clients'];
							error_log($concurrent_recordings);
							error_log(get_option(self::$max_concurrent_recordings_option_name,self::$default_max_concurrent_recordings_option_value));
							error_log("Concurrent : " . ($concurrent_recordings < get_option(self::$max_concurrent_recordings_option_name,self::$default_max_concurrent_recordings_option_value)));
						}
						
						//error_log(WP_Insights_Utils::askapache_get_process_count());
						
						$max_concurrent_recordings = get_option(self::$max_concurrent_recordings_option_name,self::$default_max_concurrent_recordings_option_value);
												
						if(isset($_COOKIE['smt-id']) || $max_concurrent_recordings === 0 || ($concurrent_recordings < $max_concurrent_recordings)) 
						{?>
						<!-- Powered by WP Insights version <?php echo self::VERSION?>-->
						  <script id='wpi-trigger-script' type="text/javascript">
									//<![CDATA[
									var addressBarURL = top.location.href;
									var isFullyLoaded = false;
									
									if(addressBarURL.toLowerCase().indexOf("plugins/wp-insights/views/wpi-replay") < 0 
										&& addressBarURL.toLowerCase().indexOf("plugins/wp-insights/views/wpi-heat.php") < 0) {
				
										        jQuery.ajax({
													  url: "<?php echo $wpi_js_url.'?v='.self::VERSION?>",
													  dataType: "script",
													  cache: true,
													  success: function() 
								  		  			  {
										  					jQuery_1_10_2 = $.noConflict(true);
															jQuery_1_10_2.fn.getcssPath = function () {
															    if (this.length != 1) throw 'Requires one element.';
									
															    var path, node = this;
															    while (node.length) {
															        var realNode = node[0], name = realNode.localName || realNode.nodeName;
															        if (!name) break;
									
															        name = name.toLowerCase();
															        if (realNode.id) {
															            // As soon as an id is found, there's no need to specify more.
															            return name + '#' + realNode.id + (path ? '>' + path : '');
															        } else if (realNode.className) {
															            name += '.' + realNode.className.split(/\s+/).join('.');
															            name = name.replace(/\.+$/,"");
															        }
									
															        var parent = node.parent(), siblings = parent.children(name);
															        if (siblings.length > 1) name += ':eq(' + siblings.index(node) + ')';
															        path = name + (path ? '>' + path : '');
									
															        node = parent;
															    }
									
															    return path;
															};
									
															jQuery_1_10_2.fn.scrollStopped = function(delay,callback) {           
																jQuery_1_10_2(this).scroll(function(){
														            var self = this, $this = jQuery_1_10_2(self);
														            if ($this.data('scrollTimeout')) {
														              clearTimeout($this.data('scrollTimeout'));
														            }
														            $this.data('scrollTimeout', setTimeout(callback,delay,self));
														        });
														    };
										  					smt2.record({
															      recTime: 3000,
															      trackingUrl: "<?php echo $smt_tracking_url;?>",
															      postInterval: <?php echo self::$default_recording_interval;?>
															    });
						
									  			  			}
													});
					
									}	  			
									//]]>
							</script>
		<?php }
		}
	}
	
	public function add_wpinsights_admin_scripts(){
		?>
		<script id='wpi-admin-footer-script' type="text/javascript">
		(function(){
			var uv=document.createElement('script');
			uv.type='text/javascript';
			uv.async=true;
			uv.src='//widget.uservoice.com/SzVb2HUAq5LB2V8FqHVNOw.js';
			var s=document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(uv,s);
		})();
		
		UserVoice = window.UserVoice || [];
		UserVoice.push(['showTab', 'classic_widget', {
			mode: 'full',
			primary_color: '#cc6d00',
			link_color: '#007dbf',
			default_mode: 'support',
			forum_id: 221801,
			tab_label: 'WP Insights - Feedback & Support',
			tab_color: '#cc6d00',
			tab_position: 'bottom-right',
			tab_inverted: false
		}]);
		</script>
<?php 
	}
	
	public function add_IE9_Compatibility_Meta_Tag() {
		echo '<meta http-equiv="X-UA-Compatible" content="IE=9">';
	}

}
