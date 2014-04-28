(function() {
	
	 var wpiOpt = {
		    /**
		     * URL to local wpi website, i.e., the site URL to track
		     * @type string
		     */
		    trackingUrl: ""
		  };
	 
	var wpiSelector = {
	                      
		elementPositions: [],
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
	    
	    getDOMPositions: function() {
	    	wpi_jquery(document.body.getElementsByTagName("*")).each(function () {
			     var elementPosition = {
			    		 cp: wpi_jquery(this).getcssPath(),
			    		 eX: Math.round(wpi_jquery(this).offset().left),
			    		 eY: Math.round(wpi_jquery(this).offset().top)
			     }
			     wpiSelector.elementPositions.push(elementPosition);
			});
	    },

	    
	    resizeSelectorHeight: function() {
	    	console.log("resize called");
	    	//wpi_jquery('#helloDiv').height(wpi_jquery(window).height());
	    	wpi_jquery('#pageSection01').width(wpi_jquery(window).width());
	    	setTimeout(function() {
	    		wpi_jquery('#pageSection01-name').position({
		    		my: "right top",
		    		at: "right-30 top+30",
		    		of: "#pageSection01",
		    		collision: "fit fit",
		    		within: "#pageSection01"
		    	});
	    	},300);
	    	//wpi_jquery('#helloDiv').stickyfloat('destroy');
	    	//wpi_jquery('#helloDiv').stickyfloat({ duration: 0,startOffset: 0,offsetY: 0});
	    },

	    
	    init: function() {
			var canvas = document.createElement("canvas");
			canvas.setAttribute("id","replayerCanvas");
			var body = document.getElementsByTagName("body")[0];
			canvas.width = jQuery(document).width();
			canvas.height = jQuery(document).height();
			canvas.style.cssText = "position:absolute;top:0;left:0;z-index:9999998;";
			wpi_jquery("body").append(canvas);
			var ctx=canvas.getContext("2d");
			ctx.globalAlpha=0.2;
			ctx.fillStyle="black";
			ctx.fillRect(0,0,jQuery(document).width(),jQuery(document).height());
	    	wpi_jquery(document.body).append('<div id="pageSection01"></div>');
	    	wpi_jquery(document.body).append('<div id="pageSection01-name"><button>Page Section 01 - Page Start</button></div>');
	    	/*wpi_jquery('#helloDiv').html('hello');
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
		  		});*/
	    	//wpi_jquery('#helloDiv').stickyfloat({ duration: 0,startOffset: 0,offsetY: 0});
	    	wpi_jquery('#pageSection01').css('position','absolute');
	    	wpi_jquery('#pageSection01').css('z-index','9999999');
	    	wpi_jquery('#pageSection01').css('float','left');
	    	wpi_jquery('#pageSection01').css('top','0');
	    	wpi_jquery('#pageSection01').css({"border-color": "red", 
							            "border-width":"4px", 
							            "border-style":"solid"});
	    	wpi_jquery('#pageSection01').width(wpi_jquery(window).width());
	    	wpi_jquery('#pageSection01').height(200);
	    	wpi_jquery('#pageSection01').resizable({
	    		resize: function(e, ui) {
	    			wpi_jquery('#pageSection01-name').position({
	    	    		my: "right top",
	    	    		at: "right-30 top+30",
	    	    		of: "#pageSection01",
	    	    		collision: "fit fit",
	    	    		within: "#pageSection01"
	    	    	});
            	}
	    	});
	    	wpi_jquery('#pageSection01-name').css('z-index','9999999');
	    	wpi_jquery('#pageSection01-name').css('display','inline-block');
	    	wpi_jquery('#pageSection01-name').position({
	    		my: "right top",
	    		at: "right-30 top+30",
	    		of: "#pageSection01",
	    		collision: "fit fit",
	    		within: "#pageSection01"
	    	})
	    	wpi_jquery(window).on("resize", wpiSelector.resizeSelectorHeight);
	    	wpiSelector.getDOMPositions();
	    	console.log(wpiSelector.elementPositions);
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
