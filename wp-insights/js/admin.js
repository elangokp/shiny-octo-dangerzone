(function ($) {
	"use strict";
	$(function () {
		$(".wpi-client-recordings-link").click(function() {
			//alert($(this).data('val'));
			//$("div.wpi-cache-stats-details").show();
			if($(this).data('status') == 'show') {
				$("#wpi-client-id-"+$(this).data('val')+"-recordings").show();
				$(this).text('Hide Recordings');
				$(this).data('status','hide');
			} else if($(this).data('status') == 'hide') {
				$("#wpi-client-id-"+$(this).data('val')+"-recordings").hide();
				$(this).text('Show Recordings');
				$(this).data('status','show');
			}
		});
		
		$("div.wpi-client-recordings").hide();
		
		$("a#mvmap").click(function() {
			var url = $(this).data('url') + "&scrx=" + screen.width + "&scry=" + screen.height;
			window.open(url,'_blank');
		});
		
		$("a#clickmap").click(function() {
			var url = $(this).data('url') + "&scrx=" + screen.width + "&scry=" + screen.height;
			window.open(url,'_blank');
		});
		
		$("a#exitmap").click(function() {
			var url = $(this).data('url') + "&scrx=" + screen.width + "&scry=" + screen.height;
			window.open(url,'_blank');
		});
		
		$("a#mousepaths").click(function() {
			var url = $(this).data('url') + "&scrx=" + screen.width + "&scry=" + screen.height;
			window.open(url,'_blank');
		});
		
		$("a#lostfocusmap").click(function() {
			var url = $(this).data('url') + "&scrx=" + screen.width + "&scry=" + screen.height;
			window.open(url,'_blank');
		});
	});
}(jQuery));