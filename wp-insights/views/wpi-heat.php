<?php
/**
 * Represents the view to embed the heatmap.
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
//$parse_uri = explode( 'wp-content', $_SERVER['SCRIPT_FILENAME'] );
//require_once( $parse_uri[0] . 'wp-load.php' );
require_once('class-wp-insights-filters.php');
require_once('class-wp-insights.php' );
$WP_Insights_Filters_Instance = new WP_Insights_Filters();
$WP_Insights_instance = WP_Insights::get_instance();
$lrid = $_GET['lrid'];
$hmtype = $_GET['hmtype'];
$scrx = $_GET['scrx'];
$scry = $_GET['scry'];
//plugins_url( 'js/admin.js', __FILE__ )
?>
<html>
<head>
<title>Heatmap Viewer</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="../js/dev/jquery.blockUI.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<script src="<?php echo '../js/admin.js?ver=7.5'?>"></script>
<link rel="stylesheet" href="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/themes/smoothness/jquery-ui.css" />
</head>
<body>
<script type="text/javascript">
    jQuery( window ).bind("resize",function(e) {
    	document.getElementById('top-frame').height = jQuery( window ).height() - (jQuery( window ).height()*0.9);
        document.getElementById('iframeHeatmap').height = jQuery( window ).height() - (jQuery( window ).height()*0.1);
        });
    jQuery( window ).ready(function(e) {
    	jQuery.blockUI({ message: jQuery('#heatmapLoadingMessage') });
    	document.getElementById('top-frame').height = jQuery( window ).height() - (jQuery( window ).height()*0.9);
        document.getElementById('iframeHeatmap').height = jQuery( window ).height() - (jQuery( window ).height()*0.1);
        });

    function watch(obj, prop, handler) { // make this a framework/global function
        var currval = obj[prop];
        function callback() {
            if (obj[prop] != currval) {
                var temp = currval;
                currval = obj[prop];
                handler(temp, currval);
            }
        }
        return callback;
    }

    var myhandler = function (oldval, newval) {
        if(newval == true){
            //jQuery("#heatmap-status").html("Generation of Heatmap is complete");
            jQuery.unblockUI();
            clearInterval(intervalH);
        }
    };

    var intervalH = null;

    jQuery(function(){
    	jQuery("#iframeHeatmap").load(function() {
            //console.log("iframeHeatmap loaded");
        	intervalH = setInterval(watch(window.frames[0].window.heatmapOptions, "heatmapCompleted", myhandler), 3000);
        });    	
    });

    
</script>
<div id="top-frame">
<h1 style="margin: 0 auto;float:left;width:50%">
<?php 
if($hmtype == 'mvh') {
	echo "Mouse Movement Heatmap";
} else if($hmtype == 'clickh') {
	echo "Click Heatmap";
} else if($hmtype == 'exith') {
	echo "Exit Heatmap";
}else if($hmtype == 'mph') {
	echo "Mouse Paths";
}else if($hmtype == 'lfh') {
	echo "Lost Focus Heatmap";
}
?>
</h1>
<form id="wpi-heat" method="get" style="margin: 0 auto;float:right;width:50%">
<input type="hidden" name="lrid" value="<?php echo $lrid ?>" />
<input type="hidden" name="hmtype" value="<?php echo $hmtype ?>" />
<input type="hidden" name="scrx" value="<?php echo $scrx ?>" />
<input type="hidden" name="scry" value="<?php echo $scry ?>" />
<?php $WP_Insights_Filters_Instance->display(); ?>
</form>
<!-- <div id="heatmap-status" style="margin: 0 auto;float:right;width:30%">Please be patient. Heatmap is being generated</div>-->
</div>
<iframe id="iframeHeatmap" style="border:1px solid black" src="wpi-heatmap.php?lrid=<?php echo $lrid ?>&hmtype=<?php echo $hmtype?>&scrx=<?php echo $scrx?>&scry=<?php echo $scry?>" seamless width="100%"></iframe>
<div id="heatmapLoadingMessage" style="display:none;"> 
    <p>Hey there Smarty... Heatmap is being generated... Please be patient for a moment.</p> 
    <p><img src="../assets/progressBar.gif"/></p>
</div> 
</body>
</html>
