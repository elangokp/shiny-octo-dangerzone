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

$lrid = $_GET['lrid'];
$hmtype = $_GET['hmtype'];
$scrx = $_GET['scrx'];
$scry = $_GET['scry'];

?>
<html>
<head>
<title>Heatmap Viewer</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<script type="text/javascript">
    jQuery( window ).bind("resize",function(e) {document.getElementById('iframeHeatmap').height = jQuery( window ).height() - 90;});
    jQuery( window ).load(function(e) {document.getElementById('iframeHeatmap').height = jQuery( window ).height() - 90;});
</script>
<div id="top-frame">
<h1>
<?php 
if($hmtype == 'mv') {
	echo "Mouse Movement Heatmap";
} else if($hmtype == 'click') {
	echo "Click Heatmap";
} else if($hmtype == 'exit') {
	echo "Exit Heatmap";
}else if($hmtype == 'mp') {
	echo "Mouse Paths";
}else if($hmtype == 'lf') {
	echo "Lost Focus Heatmap";
}
?>
</h1>
</div>
<iframe id="iframeHeatmap" style="border:1px solid black" src="heatmap.php?lrid=<?php echo $lrid ?>&hmtype=<?php echo $hmtype?>&scrx=<?php echo $scrx?>&scry=<?php echo $scry?>" seamless width="100%"></iframe>

</body>
</html>
