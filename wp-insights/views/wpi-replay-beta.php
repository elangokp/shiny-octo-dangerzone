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

//$parse_uri = explode( 'wp-content', $_SERVER['SCRIPT_FILENAME'] );
//require_once( $parse_uri[0] . 'wp-load.php' );
//require_once( $_SERVER['DOCUMENT_ROOT'] . '/wordpress/wp-load.php' );
//require_once(plugin_dir_path(dirname(__FILE__)).'class-wp-insights.php');
//require_once(plugin_dir_path(dirname(__FILE__)).'replay/class-wp-insights-replayer-beta.php');
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

	var replayer = null;
	
    function resizeFrame(frameHeight, frameWidth) {
    	//var frameHeight = window.frames[0].window.heatmapOptions['heatmapCompleted'];
    	//var frameWidth = window.frames[0].window.heatmapOptions['heatmapCompleted'];
    	document.getElementById('iframePlayer').height = frameHeight;
    	document.getElementById('iframePlayer').width = frameWidth;
    }

    function playerLoaded() {
    	$("#playButton").removeAttr('disabled');
    	//$("#pauseButton").removeAttr('disabled');
    	//$("#stopButton").removeAttr('disabled');
    }
    

    $(function(){
    	$("#iframePlayer").load(function() {
    		replayer = window.frames[0].window;
        	replayer.initializePlayer();
        	$("#playButton").click(function() {
        		$("#playButton").attr('disabled',true);
        		$("#pauseButton").removeAttr('disabled');
            	$("#stopButton").removeAttr('disabled');
            	replayer.play();
        	});

        	$("#pauseButton").click(function() {
        		$("#pauseButton").attr('disabled',true);
        		$("#playButton").removeAttr('disabled');
        		$("#stopButton").removeAttr('disabled');
            	replayer.pause();
        	});

        	$("#stopButton").click(function() {
        		$("#stopButton").attr('disabled',true);
        		$("#pauseButton").attr('disabled',true);
        		$("#playButton").removeAttr('disabled');
            	replayer.stop();
        	});
        	//intervalH = setInterval(isHeatmapCompleted(), 3000);
        });    	
    });
    
</script>
<h1 style="margin: 0 auto;float:left;width:50%">Session Player</h1>
<div id="controls" style="margin: 0 auto;float:left;width:50%">
<button id="playButton" disabled>Play</button>
<button id="pauseButton" disabled>Pause</button>
<button id="stopButton" disabled>Stop</button>
</div>
<!--<form id="wpi-heat" method="get" style="margin: 0 auto;float:right;width:50%">
<input type="hidden" name="rid" value="<?php echo $rid ?>" />
</form>
 <div id="heatmap-status" style="margin: 0 auto;float:right;width:30%">Please be patient. Heatmap is being generated</div>-->
<div style="float:left;width:100%">
<iframe id="iframePlayer" style="border:1px solid black" src="recorded-session.php?rid=<?php echo $rid ?>" seamless >

</iframe>
</div>
</body>
</html>
