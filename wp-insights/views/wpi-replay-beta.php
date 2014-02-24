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
require_once(plugin_dir_path(dirname(__FILE__)).'replay/class-wp-insights-replayer-beta.php');
$rid = $_GET['id'];
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

$WP_Insights_Replayer_Instance = new WP_Insights_Replayer_Beta($rid);
$screenWidth = $WP_Insights_Replayer_Instance->getScreenWidth();
$screenHeight = $WP_Insights_Replayer_Instance->getScreenHeight();
?>
<html>
<head>
<title>Session Player</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<link rel="stylesheet" href="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/themes/smoothness/jquery-ui.css" />
</head>
<body>
<script type="text/javascript">

    
</script>
<div id="top-frame">
<h1 style="margin: 0 auto;float:left;width:50%">Session Player</h1>
<form id="wpi-heat" method="get" style="margin: 0 auto;float:right;width:50%">
<input type="hidden" name="lrid" value="<?php echo $lrid ?>" />
</form>
<!-- <div id="heatmap-status" style="margin: 0 auto;float:right;width:30%">Please be patient. Heatmap is being generated</div>-->
</div>
<iframe id="iframeHeatmap" style="border:1px solid black" seamless width="<?php echo $screenWidth?>px" height="<?php echo $screenHeight?>px" srcdoc="<?php echo $WP_Insights_Replayer_Instance->getReplayPage(); ?>">

</iframe>
<div id="heatmapLoadingMessage" style="display:none;"> 
    <p>Hey there Smarty... Heatmap is being generated... Please be patient for a moment.</p> 
    <p><img src="../assets/progressBar.gif"/></p>
</div> 
</body>
</html>
