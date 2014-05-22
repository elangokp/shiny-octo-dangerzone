(function ($) {
	"use strict";
	$(function () {
		var wpi_selector_url = "";
		console.log(window.location.href);
		console.log(window.location.search);
		console.log(window.location.search.length);
		if(window.location.search.length > 0) {
			wpi_selector_url = window.location.href + "&wpimode=selector";
		} else {
			wpi_selector_url = window.location.href + "?wpimode=selector";
		}		
		
		$("li#wp-admin-bar-wpi_toolbar_define_pagesections > a").click(function() {
			event.preventDefault();
			var win = window.open(wpi_selector_url, '_blank');
			win.focus();
		});
		
	});
}(jQuery));