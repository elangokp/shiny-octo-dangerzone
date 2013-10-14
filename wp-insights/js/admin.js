(function ($) {
	"use strict";
	$(function () {
		$(".wpi-cache-stats-link").click(function() {
			//alert($(this).data('val'));
			//$("div.wpi-cache-stats-details").show();
			if($(this).data('status') == 'show') {
				$("#wpi-cache-id-"+$(this).data('val')+"-stats-details").show();
				$(this).text('Hide Versions');
				$(this).data('status','hide');
			} else if($(this).data('status') == 'hide') {
				$("#wpi-cache-id-"+$(this).data('val')+"-stats-details").hide();
				$(this).text('Show Versions');
				$(this).data('status','show');
			}
		});
		
		$("div.wpi-cache-stats-details").hide();
		
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
	});
}(jQuery));