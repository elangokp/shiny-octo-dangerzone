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
class WP_Insights {

	/**
	 * Plugin version, used for cache-busting of style and script file references.
	 *
	 * @since   1.0.0
	 *
	 * @const   string
	 */
	const VERSION = '0.7.0Beta';

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
		
		add_action('wp_head', array($this, 'add_IE9_Compatibility_Meta_Tag'));
		add_action('plugins_loaded', array($this, 'setRecorderStatus'));
		//add_action('admin_notices', array($this, 'wp_insights_admin_notices'));
		//add_filter( 'TODO', array( $this, 'filter_method_name' ) );
		self::$cache_dir = dirname(dirname(plugin_dir_path(__FILE__)))."/wpicache/";
		self::$cache_dir = str_replace('\\', '/', self::$cache_dir);
		self::$browscap_cache_dir = self::$cache_dir."browscapcache/";

	}

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
		$recording_status = @ self::$WP_Insights_DB_Utils_Instance->db_option("recording_status");
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
		
		$screen_id = get_current_screen()->id;
		
		//if ( stripos($screen_id, 'wp-insights') !== FALSE ) {
			wp_enqueue_style( $this->plugin_slug .'-admin-styles', plugins_url( 'css/admin.css', __FILE__ ), array(), self::VERSION );
			
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
			'WP Insights Recordings',
			'WP Insights',
			'manage_options',
			$this->plugin_slug.'-admin-main-menu',
			array( $this, 'display_wp_insights_recordings_page' ),
			plugin_dir_url( __FILE__ ).'assets/eye-20.png',
			"25.11"
		);

		
		$this->wp_insights_recordings_sub_menu_hook_suffix = add_submenu_page(
				$this->plugin_slug.'-admin-main-menu',
				'WP Insights Recordings',
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
				self::$WP_Insights_DB_Utils_Instance->db_set_option("recording_status","ON");
			} else if($_POST['change_recorder_status'] == 'stop') {
				self::$WP_Insights_DB_Utils_Instance->db_set_option("recording_status","OFF");
			}
			$this->setRecorderStatus();
		}
		$recording_status_display = $this->getRecordingStatusDisplay();
		if(has_action( 'wp_footer', array( $this, 'add_wpinsights_scripts' ) )) {
			$is_recording = true;
		} else {
			$is_recording = false;
		}
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
		$fromRecordNumber = isset($_GET['frn'])?$_GET['frn']:null;
		$tillRecordNumber = isset($_GET['trn'])?$_GET['trn']:null;
		$WP_Insights_Event_Data_Instance = new WP_Insights_Event_Data($lrid,$datatype,$fromDate,$tillDate,$fromRecordNumber,$tillRecordNumber);
		echo $WP_Insights_Event_Data_Instance->getMouseEventData();
		die();
	}
	
	public function add_wpinsights_scripts() {
		//error_log("Inside add_wpinsights_scripts");
		$json3_js_url = plugins_url('js/dev/json3.min.js', __FILE__);
		$smt_aux_js_url = plugins_url('js/dev/smt-aux.js', __FILE__);
		$smt_record_js_url = plugins_url('js/dev/smt-record.js', __FILE__);
		$smt_tracking_url = admin_url( 'admin-ajax.php' );
		//wp_register_script('smt-aux', $smt_aux_js_url);
		//wp_register_script('smt-record', $smt_record_js_url);
		//wp_enqueue_script('smt-aux');
		//wp_enqueue_script('smt-record');
		?>
		<!-- Powered by WP Insights version <?php echo self::VERSION?>-->
	  <script id='wpi-trigger-script' type="text/javascript">
				//<![CDATA[
				var addressBarURL = top.location.href;
				if(addressBarURL.toLowerCase().indexOf("plugins/wp-insights/views/wpi-replay.php") < 0 
					&& addressBarURL.toLowerCase().indexOf("plugins/wp-insights/views/wpi-heat.php") < 0) {
		  			var jQuery_1_10_2_url = "//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js";

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
			  			jQuery.getScript( "<?php echo $smt_aux_js_url.'?v='.self::VERSION?>", function() 
			  			  {
			  				jQuery.getScript( "<?php echo $smt_record_js_url.'?v='.self::VERSION?>", function() 
			  		  			  {
				  					smt2.record({
									      recTime: 300,
									      trackingUrl: "<?php echo $smt_tracking_url?>",
									      postInterval: 10
									    });

			  			  			}
			  		  			);

				  			}
			  			);
		  			});

				}	  			
				//]]>
		</script>
	  
		<?php
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
