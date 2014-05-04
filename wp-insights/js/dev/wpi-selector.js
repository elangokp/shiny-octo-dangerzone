(function() {
	
	 var wpiOpt = {
		    /**
		     * URL to local wpi website, i.e., the site URL to track
		     * @type string
		     */
		    trackingUrl: ""
		  };
	 
	var wpiSelector = {
	                      
		elementsWithPositions: {},
		elementPositions: [],
		pageSections: [],
		canvas: null,
		context: null,
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
	    	var DOMElements = wpi_jquery(document.body.getElementsByTagName("*")).filter(":visible").not(".wpipagesection")
	    						.not(".wpipagesection *");
	    	DOMElements.each(function () {
			     /*var elementPosition = {
			    		 cp: wpi_jquery(this).getcssPath(),
			    		 eX: Math.round(wpi_jquery(this).offset().left),
			    		 eY: Math.round(wpi_jquery(this).offset().top)
			     }*/
	    		 var eY = Math.round(wpi_jquery(this).offset().top);
	    		 wpiSelector.elementsWithPositions[eY] = wpi_jquery(this).getcssPath();
	    		 wpiSelector.elementPositions.push(eY);
			     //wpiSelector.elementPositions.push(elementPosition);
			});
	    	wpiSelector.elementPositions.sort(function(a, b){return a-b;});
	    },
	    
	    getNearestElementPath: function(positionTop) {
	    	var nearestElementPosition = wpiSelector.getClosestValue(wpiSelector.elementPositions,positionTop);
	    	return wpiSelector.elementsWithPositions[nearestElementPosition];
	    },
	    
	    getClosestValue: function(a, x) {
	        var lo = -1, hi = a.length;
	        while (hi - lo > 1) {
	            var mid = Math.round((lo + hi)/2);
	            if (a[mid] <= x) {
	                lo = mid;
	            } else {
	                hi = mid;
	            }
	        }
	        if (a[lo] == x)  {
	        	return a[lo];
	        } else if(a[hi] == x) {
	        	return a[hi];
	        } else {
	        	if(Math.abs(a[hi] - x) < Math.abs(a[lo] - x)) {
	        		return a[hi];
	        	} else {
	        		return a[lo];
	        	}
	        }
	    },

	    
	    resizeSelectorHeight: function() {
	    	
	    	console.log("resize called");
	    	//wpi_jquery('#helloDiv').height(wpi_jquery(window).height());
	    	console.log(wpiSelector.pageSections);
	    	wpiSelector.canvas.width = wpi_jquery(document).width();
			wpiSelector.canvas.height = wpi_jquery(document).height();
			wpiSelector.context.globalAlpha=0.2;
			wpiSelector.context.fillStyle="black";
			wpiSelector.context.fillRect(0,0,wpi_jquery(document).width(),wpi_jquery(document).height());
	    	wpi_jquery(wpiSelector.pageSections).each(function(index,object) {
	    		var thispageSectionId = '#pageSection'+object.id;
	    		var thispageSectionNameId = '#pageSection'+object.id+'-name';
	    		wpi_jquery(thispageSectionId).width(wpi_jquery(window).width()-10);
	    		if(object.startElement === "body") {
	    			var top = 0;
	    		} else {
	    			var top = wpi_jquery(object.startElement).offset().top;
	    		}
	    		
	    		if(wpiSelector.pageSections[index+1] !== undefined){
	    			var height = wpi_jquery(wpiSelector.pageSections[index+1].startElement).offset().top - top - 8;
	    		} else {
	    			var height = wpi_jquery(document).height() - top - 8;
	    		}
	    		
	    		wpi_jquery(thispageSectionId).css({
	    			"top": top
	    		})
	    		wpi_jquery(thispageSectionId).height(height);
	    		
		    	setTimeout(function() {
		    		wpi_jquery(thispageSectionNameId).position({
			    		my: "right top",
			    		at: "right-30 top+30",
			    		of: thispageSectionId,
			    		collision: "fit fit",
			    		within: thispageSectionId
			    	});
		    	},300);
	    	})
	    	
	    	//wpi_jquery('#helloDiv').stickyfloat('destroy');
	    	//wpi_jquery('#helloDiv').stickyfloat({ duration: 0,startOffset: 0,offsetY: 0});
	    },
	    
	    getRandomColor: function() {
	        var letters = '0123456789ABCDEF'.split('');
	        var color = '#';
	        for (var i = 0; i < 6; i++ ) {
	            color += letters[Math.floor(Math.random() * 16)];
	        }
	        return color;
	    },
	    
	    savePageSections: function() {
	    	
	    },
	    
	    addpageSection: function(sectionname) {
	    	var pageSection = {
	    			id : wpiSelector.pageSections.length + 1,
	    			name: sectionname
	    	};
	    	var top;
	    	if(pageSection.id == 1){
	    		top=0;
	    		pageSection.startElement = "body";
	    	} else {
	    		var lastPageSection = wpi_jquery(wpiSelector.pageSections).get(-1);
	    		var lastPageSectionElement = wpi_jquery('#pageSection'+lastPageSection.id);	
	    		if(lastPageSectionElement.height()>500) {
	    			lastPageSectionElement.height(500);
	    		} else {
	    			alert("Could not add more page sections");
	    			return;
	    		}	    		
	    		console.log(lastPageSectionElement.offset().top);
	    		console.log(lastPageSectionElement.outerHeight(true));
	    		var lastPageSectionEnd = lastPageSectionElement.offset().top + lastPageSectionElement.outerHeight(true);
	    		var nearestElementPath = wpiSelector.getNearestElementPath(lastPageSectionEnd);
        		console.log(nearestElementPath);
        		var nearestElementPathTop = wpi_jquery(nearestElementPath).offset().top;
        		var heightDiffForThisPS = lastPageSectionEnd - nearestElementPathTop;
        		lastPageSectionElement.height(lastPageSectionElement.height() - heightDiffForThisPS);
        		lastPageSectionEnd = lastPageSectionElement.offset().top + lastPageSectionElement.outerHeight(true);
	    		top = lastPageSectionEnd;
	    		pageSection.startElement = nearestElementPath;
	    		console.log(top);
	    	}
	    	wpi_jquery(document.body).append('<div id="pageSection'+pageSection.id+'" class="wpipagesection"></div>');
	    	wpi_jquery(document.body).append('<div id="pageSection'+pageSection.id+'-name" class="wpipagesection">'
	    			+'<button id="pageSection'+pageSection.id+'-name-button" class="wpipagesection">'+pageSection.name+'</button></div>');
	    	var thispageSectionElement = wpi_jquery('#pageSection'+pageSection.id);
	    	thispageSectionElement.data("pageSectionId",pageSection.id);
	    	var thispageSectionNameElement = wpi_jquery('#pageSection'+pageSection.id+'-name');
	    	var thispageSectionNameButtonElement = wpi_jquery('#pageSection'+pageSection.id+'-name-button');
	    	thispageSectionNameButtonElement
	    		.button()
	    		.click(function(event) {
	    			event.preventDefault();
	    		});
	    	
	    	thispageSectionElement.css({
							    		'position': 'absolute',
							    		'z-index': '9999999',
							    		'float': 'left',
							    		'top': top,
	    								"border-color": wpiSelector.getRandomColor(), 
							            "border-width":"4px", 
							            "border-style":"solid"});
	    	thispageSectionElement.width(wpi_jquery(window).width()-10);
	    	thispageSectionElement.height(wpi_jquery(document).height() - top);
	    	
	    	thispageSectionNameElement.css({
	    									'z-index': '9999999',
	    									'display': 'inline-block'});
	    	thispageSectionNameElement.position({
	    		my: "right top",
	    		at: "right-30 top+30",
	    		of: "#pageSection"+pageSection.id,
	    		collision: "fit fit",
	    		within: "#pageSection"+pageSection.id
	    	});
	    	
	    	if(wpiSelector.pageSections.length>0){
	    		var lastPageSection = wpi_jquery(wpiSelector.pageSections).get(-1);
	    		var lastPageSectionElement = wpi_jquery('#pageSection'+lastPageSection.id);
	    		lastPageSectionElement.resizable({
		    		handles: "s",
		    		resize: function(e, ui) {
		    			thispageSectionNameElement.position({
		    	    		my: "right top",
		    	    		at: "right-30 top+30",
		    	    		of: "#pageSection"+pageSection.id,
		    	    		collision: "fit fit",
		    	    		within: "#pageSection"+pageSection.id
		    	    	});
	            	},
	            	stop: function(e, ui) {
	            		var nextPageSectionIdWouldBe = wpi_jquery(this).data('pageSectionId')+1;
	    	    		var nextPageSectionElementWouldBe = wpi_jquery('#pageSection'+nextPageSectionIdWouldBe);
	    	    		var nextPageSectionElementWouldBeTop = nextPageSectionElementWouldBe.offset().top;
	            		var thisSectionEnd = ui.element.offset().top + ui.element.outerHeight(true);
	            		var nearestElementPath = wpiSelector.getNearestElementPath(thisSectionEnd);
	            		console.log(nearestElementPath);
	            		var nearestElementPathTop = wpi_jquery(nearestElementPath).offset().top;
	            		var heightDiffForThisPS = thisSectionEnd - nearestElementPathTop;
	            		ui.element.height(ui.element.height() - heightDiffForThisPS);
	            		thisSectionEnd = ui.element.offset().top + ui.element.outerHeight(true);
	            		nextPageSectionElementWouldBe.css({
	            			'top': thisSectionEnd
	            		});
	            		var heightDiffForNextPS =  thisSectionEnd - nextPageSectionElementWouldBeTop;
	            		nextPageSectionElementWouldBe.height(nextPageSectionElementWouldBe.height() - heightDiffForNextPS);
	            		wpiSelector.pageSections[nextPageSectionIdWouldBe-1].startElement = nearestElementPath;
	            		wpi_jquery(nearestElementPath).delay(100).fadeIn(500).fadeOut(500).fadeIn(500).fadeOut(500).fadeIn(500);
	            	}
		    	});
	    	}
	    	
	    	wpiSelector.pageSections.push(pageSection);
	    },

	    
	    init: function() {
			wpiSelector.canvas = document.createElement("canvas");
			wpiSelector.canvas.setAttribute("id","replayerCanvas");
			var body = document.getElementsByTagName("body")[0];
			wpiSelector.canvas.width = wpi_jquery(document).width();
			wpiSelector.canvas.height = wpi_jquery(document).height();
			wpiSelector.canvas.style.cssText = "position:absolute;top:0;left:0;z-index:9999998;";
			wpi_jquery("body").append(wpiSelector.canvas);
			wpiSelector.context=wpiSelector.canvas.getContext("2d");
			wpiSelector.context.globalAlpha=0.2;
			wpiSelector.context.fillStyle="black";
			wpiSelector.context.fillRect(0,0,wpi_jquery(document).width(),wpi_jquery(document).height());
			
			wpi_jquery(document.body).append('<div id="pageSectionControls" class="wpipagesection" style="z-index:10000000;display:inline-block">'
					+'<button id="addPageSection" class="wpipagesection">Add Page Section</button>'
					+'<button id="savePageSections" class="wpipagesection">Save</button></div>');
			
			setTimeout(function() {
				wpi_jquery('#pageSectionControls').position({
					my: "right bottom",
		    		at: "right-30 bottom-30",
		    		of: window,
		    		collision: "fit fit",
		    		within: window
				});
			},300);
			
			wpi_jquery(window).scroll(function() {
				wpi_jquery('#pageSectionControls').position({
		    		my: "right bottom",
		    		at: "right-30 bottom-30",
		    		of: window,
		    		collision: "fit fit",
		    		within: window
		    	});
			});
			
			wpi_jquery(document.body).append('<div id="page-section-dialog-form" title="Add Page Section">'
					  +'<p class="validateTips">Please give a name for the page section.</p>'
					  +'<form>'
					  +'<fieldset>'
					    +'<label for="name">Name</label>'
					    +'<input type="text" name="name" id="name" class="text ui-widget-content ui-corner-all">'
					  +'</fieldset>'
					  +'</form>'
					+'</div>');
			var pageSectionNameElement = wpi_jquery("#page-section-dialog-form input#name");
			var pageSectionNameTipsElement = wpi_jquery("#page-section-dialog-form p.validateTips");
			wpi_jquery( "#page-section-dialog-form" ).dialog({
							      autoOpen: false,
							      height: 400,
							      width: 550,
							      modal: true,
							      buttons: {
							        "Add Page Section": function() {							         
							          if(pageSectionNameElement.val().length > 1) {
							        	  wpiSelector.addpageSection(pageSectionNameElement.val());
							        	  wpi_jquery( this ).dialog( "close" );
							          } else {
							        	  pageSectionNameElement.val( "" ).addClass( "ui-state-error" );
							        	  pageSectionNameTipsElement.text("Page Section name cannot be empty");
							          }
							        },
							        Cancel: function() {
							        	wpi_jquery( this ).dialog( "close" );
							        }
							      },
							      close: function() {
							    	 pageSectionNameElement.val( "" ).removeClass( "ui-state-error" );
							      }
							    });
							 
			wpi_jquery('#addPageSection')
				.button()
				.click(function(event) {
					event.preventDefault();
					wpi_jquery( "#page-section-dialog-form" ).dialog( "open" );
				});
			wpi_jquery('#savePageSections')
			.button()
			.click(function(event) {
				event.preventDefault();
			});
	    	wpi_jquery(window).on("resize", function(e) {
	    		if(e.target == window) {
	    			setTimeout(wpiSelector.resizeSelectorHeight(),300);
	    		}	    		
	    	});
	    	wpiSelector.getDOMPositions();
	    	wpiSelector.addpageSection("Page Start");
	    	console.log(wpiSelector.elementsWithPositions);
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
