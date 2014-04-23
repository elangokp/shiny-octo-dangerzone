(function() {
	
	 var wpiOpt = {
		    /**
		     * URL to local wpi website, i.e., the site URL to track
		     * @type string
		     */
		    trackingUrl: ""
		  };
	 
	var wpiSelector = {
	                      
		/**
	     * Overrides (wpi) tracking options object with custom-provided options object
	     * @return void
	     * @param {object} wpiOptionsObj
	     * @param {object} customOptionsObj
	     */
	    overrideTrackingOptions: function(wpiOptionsObj, customOptionsObj)
	    {
	      for (var prop in wpiOptionsObj)
	      {
	        if (customOptionsObj.hasOwnProperty(prop) && customOptionsObj[prop] !== null) {
	          wpiOptionsObj[prop] = customOptionsObj[prop];
	        }
	      }
	    },
	    
	    resizeSelectorHeight: function() {
	    	console.log("resize called");
	    	wpi_jquery('#helloDiv').height(wpi_jquery(window).height());
	    	//wpi_jquery('#helloDiv').stickyfloat('destroy');
	    	//wpi_jquery('#helloDiv').stickyfloat({ duration: 0,startOffset: 0,offsetY: 0});
	    },

	    
	    init: function() {
	    	wpi_jquery(document.body).append('<div id="helloDiv"></div>');
	    	wpi_jquery('#helloDiv').html('hello');
	    	wpi_jquery('#helloDiv').css('position','absolute');
	    	wpi_jquery('#helloDiv').css('z-index','9999999');
	    	wpi_jquery('#helloDiv').css('float','left');
	    	wpi_jquery('#helloDiv').css('top','0');
	    	wpi_jquery('#helloDiv').css('background-color','#ffffff');	    	
	    	wpi_jquery('#helloDiv').width(100).height(wpi_jquery(window).height());
	    	wpi_jquery('#helloDiv').css({"border-color": "#C1E0FF", 
							            "border-width":"4px", 
							            "border-style":"solid"});
			wpi_jquery(window).on("resize", wpiSelector.resizeSelectorHeight);
			wpi_jquery(window).scroll(function() {
					wpi_jquery('#helloDiv').offset({ top: wpi_jquery(window).scrollTop() });
		  		});
	    	//wpi_jquery('#helloDiv').stickyfloat({ duration: 0,startOffset: 0,offsetY: 0});
	    }


	
	}
	
	 // do not overwrite the wpi namespace
	 if (typeof window.wpi !== 'undefined') { throw("wpi namespace conflict"); }
	  // else expose record method
	  window.wpi = {
	    // to begin recording, the tracking script must be called explicitly
		select: function(opts) {
		  // load custom recording options, if any
		  if (typeof opts !== 'undefined') { wpiSelector.overrideTrackingOptions(wpiOpt, opts); }
		  wpiSelector.init();
		} // end record
	  }; // end expose
	
})();
