(function() {
	
	 var wpiOpt = {
		    /**
		     * URL to local wpi website, i.e., the site URL to track
		     * @type string
		     */
		    trackingUrl: "",
		    selectorId: 0,
		    pageSections: ""
		  };
	 
	var wpiSelector = {
	                      
		elementsWithPositions: {},
		elementPositions: [],
		givenPageSections: [],
		pageSections: [],
		canvas: null,
		context: null,
		url: null,
		pageSectionClass: 1,
		
		lookup: function(array, prop, value) {
		    for (var i = 0, len = array.length; i < len; i++)
		        if (array[i][prop] === value) return i;
		},
		
		getNextActivePageSectionIndex: function(currentIndex) {
			var nextIndex = currentIndex+1
			if(nextIndex >= wpiSelector.pageSections.length) {
				return false;
			}
			
			for (var i = nextIndex, len = wpiSelector.pageSections.length; i < len; i++) {
				if (wpiSelector.pageSections[i].isActive === true) return i;
			}		
				
			return false;
		},
		
		getLasttActivePageSectionIndex: function() {
			
			for (var i = wpiSelector.pageSections.length-1; i >= 0; i--) {
				if (wpiSelector.pageSections[i].isActive === true) return i;
			}		
				
			return false;
		},
		
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
	    	wpiSelector.adjustAndDisplayPageSections();
	    	
	    	//wpi_jquery('#helloDiv').stickyfloat('destroy');
	    	//wpi_jquery('#helloDiv').stickyfloat({ duration: 0,startOffset: 0,offsetY: 0});
	    },
	    
	    adjustAndDisplayPageSections: function(shouldInitialize) {
	    	if (typeof shouldInitialize === "undefined" || shouldInitialize === null) { 
	    		shouldInitialize = false; 
	    	}
	    	
			if(shouldInitialize) {
				wpi_jquery(wpiSelector.givenPageSections).each(function(index,object) {
					if(object.isActive === true) {
						wpiSelector.addPageSection(object.name,object.id);
					}
				});		
				
				wpiSelector.pageSections = wpiSelector.givenPageSections;
			}
			wpi_jquery(wpiSelector.pageSections).each(function(index,object) {
				if(object.isActive === true) {
					var thispageSectionId = '#pageSection'+object.id;
					var thispageSectionNameId = '#pageSection'+object.id+'-name';
					wpi_jquery(thispageSectionId).width(wpi_jquery(window).width()-10);
					
					if(wpiSelector.pageSectionClass === 1){
						wpi_jquery(thispageSectionId).addClass("wpipagesection1");
						wpiSelector.pageSectionClass = 2;
					}else if(wpiSelector.pageSectionClass === 2){
						wpi_jquery(thispageSectionId).addClass("wpipagesection2");
						wpiSelector.pageSectionClass = 1;
					}
					
					if(object.startElement === "body") {
						var top = 0;
					} else {
						var top = wpi_jquery(object.startElement).offset().top;
					}
					
					var nextActiveIndex = wpiSelector.getNextActivePageSectionIndex(index);
					if(nextActiveIndex === false){
						var height = wpi_jquery(document).height() - top - 8;
					} else {
						var height = wpi_jquery(wpiSelector.pageSections[nextActiveIndex].startElement).offset().top - top - 8;
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
				}	
				
			});
	    },
	    
		ColorLuminance: function(hex, lum) {
			  // validate hex string
			  hex = String(hex).replace(/[^0-9a-f]/gi, '');
			  if (hex.length < 6) {
			    hex = hex[0]+hex[0]+hex[1]+hex[1]+hex[2]+hex[2];
			  }
			  lum = lum || 0;
		
			  // convert to decimal and change luminosity
			  var rgb = "#", c, i;
			  for (i = 0; i < 3; i++) {
			    c = parseInt(hex.substr(i*2,2), 16);
			    c = Math.round(Math.min(Math.max(0, c + (c * lum)), 255)).toString(16);
			    rgb += ("00"+c).substr(c.length);
			  }
		
			  return rgb;
		},
	    
	    getRandomColor: function() {
			if(wpiSelector.borderColor !== "blue") {
				wpiSelector.borderColor = "blue";
			} else {
				wpiSelector.borderColor = "green";
			}
			return wpiSelector.borderColor;
			
	        /*var letters = '0123456789ABCDEF'.split('');
	        var color = '#';
	        for (var i = 0; i < 6; i++ ) {
	            color += letters[Math.floor(Math.random() * 16)];
	        }
	        return wpiSelector.ColorLuminance(color,-0.4);*/
	    },  
	    
	    savePageSections: function() {
	    	console.log("savePageSections");
	    	var requestData  = "url="        + encodeURIComponent(wpiSelector.url);
	    	requestData += "&pagesections="      + encodeURIComponent(JSON.stringify(wpiSelector.pageSections));
	    	console.log(wpiOpt.selectorId);
	    	if(wpiOpt.selectorId > 0) {
	    		requestData  += "&selectorId="        + wpiOpt.selectorId;
	    	}
	    	
	    	var action = "wpisavepagesections";
	    	
	    	wpi_jquery.ajax({
				  type: "POST",
				  url:  wpiOpt.trackingUrl+"?action="+action+"&_="+(new Date()).getTime(),
				  cache: false,
				  async: true,
				  data: requestData,
				  success: function(data) {
	    						var selectorId = parseInt(data);
	    						if(isNaN(selectorId) || selectorId < 1) {
	    							alert("Error occured while saving the page sections");
	    						} else {
	    							wpiOpt.selectorId = selectorId;
	    							alert("Successfully saved page sections");
	    						}
	    						
	    					}
	    	
			});	
	    },
	    
	    editPageSection: function(section_name, section_id) {
			var pageSectionIndex = wpiSelector.lookup(wpiSelector.pageSections,"id",section_id);
			wpiSelector.pageSections[pageSectionIndex].name = section_name;
			var thispageSectionNameButtonElement = wpi_jquery('#pageSection'+section_id+'-name-button');
			thispageSectionNameButtonElement.button( "option", "label", section_name );
	    },
	    
	    addPageSection: function(sectionname,sectionid) {
	    	var createdDate = "";
			if (typeof sectionid === "undefined" || sectionid === null) { 
				sectionid = wpiSelector.pageSections.length + 1;
				createdDate = new Date();
			}
	    	var pageSection = {
	    			id : sectionid,
	    			name: sectionname,
	    			isActive: true,
	    			createdDate: createdDate,
	    			deletedDate: ""
	    	};
	    	var top;
	    	if(pageSection.id == 1){
	    		top=0;
	    		pageSection.startElement = "body";
	    	} else {
	    		var lastActivePageSectionIndex = wpiSelector.getLasttActivePageSectionIndex();
	    		var lastActivePageSection = wpiSelector.pageSections[lastActivePageSectionIndex];
	    		var lastPageSectionElement = wpi_jquery('#pageSection'+lastActivePageSection.id);	
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
	    			+'<div id="pageSection'+pageSection.id+'-name-button" style="float:left;" class="wpipagesection">'+pageSection.name+'</div></div>');
	    	var thispageSectionElement = wpi_jquery('#pageSection'+pageSection.id);
	    	thispageSectionElement.data("pageSectionId",pageSection.id);
	    	
			var thispageSectionNameElement = wpi_jquery('#pageSection'+pageSection.id+'-name');
			thispageSectionNameElement.css({
				'z-index': '9999999',
				'display': 'inline-block'});
			
	    	var thispageSectionNameButtonElement = wpi_jquery('#pageSection'+pageSection.id+'-name-button');
	    	thispageSectionNameButtonElement.data("pageSectionId",pageSection.id);
	    	thispageSectionNameButtonElement
	    		.button()
	    		.click(function(event) {
	    			event.preventDefault();
	    		});
	    	
	    	if(pageSection.id !== 1){
	    		
	    		thispageSectionNameElement.append('<div id="pageSection'+pageSection.id+'-delete-button" style="float:left;" class="wpipagesection">Delete</div>');
				var thispageSectionDeleteButtonElement = wpi_jquery('#pageSection'+pageSection.id+'-delete-button');
				thispageSectionDeleteButtonElement.data("pageSectionId",pageSection.id);
				thispageSectionDeleteButtonElement
					.button()
					.click(function(event) {
						event.preventDefault();
						var pageSectionId = wpi_jquery(this).data("pageSectionId");
						wpi_jquery('#pageSection'+pageSectionId).remove();
						wpi_jquery('#pageSection'+pageSectionId+'-name').remove();
						var pageSectionIndex = wpiSelector.lookup(wpiSelector.pageSections,"id",pageSectionId);
						wpiSelector.pageSections[pageSectionIndex].isActive = false;
						wpiSelector.pageSections[pageSectionIndex].deletedDate = new Date();
						wpiSelector.adjustAndDisplayPageSections();
					});
			}
				
			thispageSectionNameElement.append('<div id="pageSection'+pageSection.id+'-edit-button" style="float:left;" class="wpipagesection">Edit</div>');
			var thispageSectionEditButtonElement = wpi_jquery('#pageSection'+pageSection.id+'-edit-button');
			thispageSectionEditButtonElement.data("pageSectionId",pageSection.id);
			thispageSectionEditButtonElement
				.button()
				.click(function(event) {
					event.preventDefault();
					var pageSectionId = wpi_jquery(this).data("pageSectionId");
					console.log(pageSectionId);
					var pageSectionIndex = wpiSelector.lookup(wpiSelector.pageSections,"id",pageSectionId);
					console.log(pageSectionIndex);
					var pageSectionName = wpiSelector.pageSections[pageSectionIndex].name;
					wpi_jquery( "#edit-page-section-dialog-form" ).data( "pageSectionId",pageSectionId);
					wpi_jquery( "#edit-page-section-dialog-form" ).data( "pageSectionName",pageSectionName);
					wpi_jquery( "#edit-page-section-dialog-form" ).dialog( "open" );
				});	
				
			if(wpiSelector.pageSectionClass === 1){
				thispageSectionElement.addClass("wpipagesection1");
				wpiSelector.pageSectionClass = 2;
			}else if(wpiSelector.pageSectionClass === 2){
				thispageSectionElement.addClass("wpipagesection2");
				wpiSelector.pageSectionClass = 1;
			}			

	    	thispageSectionElement.width(wpi_jquery(window).width()-10);
	    	thispageSectionElement.height(wpi_jquery(document).height() - top);
	    	
			thispageSectionElement.css({
				'top': top
				});
			
			thispageSectionNameElement.position({
												my: "right top",
												at: "right-30 top+30",
												of: "#pageSection"+pageSection.id,
												collision: "fit fit",
												within: "#pageSection"+pageSection.id
												});
	    	
	    	if(wpiSelector.pageSections.length>0){
	    		var lastActivePageSectionIndex = wpiSelector.getLasttActivePageSectionIndex();
	    		var lastActivePageSection = wpiSelector.pageSections[lastActivePageSectionIndex];
	    		var lastPageSectionElement = wpi_jquery('#pageSection'+lastActivePageSection.id);
	    		lastPageSectionElement.resizable({
		    		handles: "s",
	            	stop: function(e, ui) {
	            		
	            		var thisPageSectionId = wpi_jquery(this).data('pageSectionId');
	            		console.log(thisPageSectionId);
	    				var thispageSectionNameElement = wpi_jquery('#pageSection'+thisPageSectionId+'-name');
		    			thispageSectionNameElement.position({
		    	    		my: "right top",
		    	    		at: "right-30 top+30",
		    	    		of: "#pageSection"+thisPageSectionId,
		    	    		collision: "fit fit",
		    	    		within: "#pageSection"+thisPageSectionId
		    	    	});
		    			
		    			var thisPageSectionIndex = wpiSelector.lookup(wpiSelector.pageSections,"id",thisPageSectionId);
		    			var nextActiveIndex = wpiSelector.getNextActivePageSectionIndex(thisPageSectionIndex);
	            		var nextPageSectionIdWouldBe = wpiSelector.pageSections[nextActiveIndex].id;
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
	            		
	            		var nextPageSectionNameElementWouldBe = wpi_jquery('#pageSection'+nextPageSectionIdWouldBe+'-name');
	            		nextPageSectionNameElementWouldBe.position({
		    	    		my: "right top",
		    	    		at: "right-30 top+30",
		    	    		of: "#pageSection"+nextPageSectionIdWouldBe,
		    	    		collision: "fit fit",
		    	    		within: "#pageSection"+nextPageSectionIdWouldBe
		    	    	});
		    			
	            		wpiSelector.pageSections[nextPageSectionIdWouldBe-1].startElement = nearestElementPath;
	            		wpi_jquery(nearestElementPath).delay(100).fadeIn(100).fadeOut(100).fadeIn(100).fadeOut(100).fadeIn(100)
	            		.fadeOut(100).fadeIn(100)
	            		.fadeOut(100).fadeIn(100)
	            		.fadeOut(100).fadeIn(100)
	            		.fadeOut(100).fadeIn(100)
	            		.fadeOut(100).fadeIn(100)
	            		.fadeOut(100).fadeIn(100);
	            	}
		    	});
	    	}
	    	
	    	wpiSelector.pageSections.push(pageSection);
	    },

	    
	    init: function() {   	
	    	wpiSelector.url = window.location.href.replace(/&?(wpimode|wpidev)=([^&]$|[^&]*)/i, "").replace(/\?$/i, ""); //remove wpidev and wpimode parameters from url
			wpiSelector.canvas = document.createElement("canvas");
			wpiSelector.canvas.setAttribute("id","replayerCanvas");
			var body = document.getElementsByTagName("body")[0];
			wpiSelector.canvas.width = wpi_jquery(document).width();
			wpiSelector.canvas.height = wpi_jquery(document).height();
			wpiSelector.canvas.style.cssText = "position:absolute;top:0;left:0;z-index:9999998;";
			wpi_jquery("body").append(wpiSelector.canvas);
			wpiSelector.context=wpiSelector.canvas.getContext("2d");
			wpiSelector.context.globalAlpha=0;
			wpiSelector.context.fillStyle="black";
			wpiSelector.context.fillRect(0,0,wpi_jquery(document).width(),wpi_jquery(document).height());
			
			wpi_jquery(document.body).append('<div id="pageSectionControls" class="wpipagesection" style="z-index:10000000;display:inline-block">'
					+'<p id="addPageSection" class="wpipagesection">Add Page Section</p>'
					+'<p id="savePageSections" class="wpipagesection">Save</p></div>');
			
			setTimeout(function() {
				wpi_jquery('#pageSectionControls').position({
					my: "left top",
					at: "left+30 top+30",
		    		of: window,
		    		collision: "fit fit",
		    		within: window
				});
			},300);
			
			wpi_jquery(window).scroll(function() {
				wpi_jquery('#pageSectionControls').position({
		    		my: "left top",
		    		at: "left+30 top+30",
		    		of: window,
		    		collision: "fit fit",
		    		within: window
		    	});
			});
			
			wpi_jquery(document.body).append('<div id="add-page-section-dialog-form" title="Add Page Section">'
					  +'<p class="validateTips">Please give a name for the page section.</p>'
					  +'<form>'
					  +'<fieldset>'
					    +'<label for="name">Name  </label>'
					    +'<input type="text" name="name" id="name" class="text ui-widget-content ui-corner-all">'
					  +'</fieldset>'
					  +'</form>'
					+'</div>');
			var addPageSectionNameElement = wpi_jquery("#add-page-section-dialog-form input#name");
			var addPageSectionNameTipsElement = wpi_jquery("#add-page-section-dialog-form p.validateTips");
			wpi_jquery( "#add-page-section-dialog-form" ).dialog({
							      autoOpen: false,
							      height: 300,
							      width: 400,
							      modal: true,
							      buttons: {
							        "Add Page Section": function() {							         
							          if(addPageSectionNameElement.val().length > 1) {
							        	  wpiSelector.addPageSection(addPageSectionNameElement.val());
							        	  wpi_jquery( this ).dialog( "close" );
							          } else {
							        	  addPageSectionNameElement.val( "" ).addClass( "ui-state-error" );
							        	  addPageSectionNameTipsElement.text("Page Section name cannot be empty.");
							          }
							        },
							        Cancel: function() {
							        	addPageSectionNameElement.val( "" ).removeClass( "ui-state-error" );
							        	addPageSectionNameTipsElement.text("Please give a name for the page section.");
							        	wpi_jquery( this ).dialog( "close" );
							        }
							      },
							      close: function() {
							    	  addPageSectionNameElement.val( "" ).removeClass( "ui-state-error" );
							    	  addPageSectionNameTipsElement.text("Please give a name for the page section.");
							      }
							    });
			
			wpi_jquery(document.body).append('<div id="edit-page-section-dialog-form" title="Edit Page Section">'
						+'<p class="validateTips">You can change the page section name below.</p>'
						+'<form>'
						+'<fieldset>'
						  +'<label for="name">Name  </label>'
						  +'<input type="text" name="name" id="name" class="text ui-widget-content ui-corner-all">'
						+'</fieldset>'
						+'</form>'
						+'</div>');
			var editPageSectionNameElement = wpi_jquery("#edit-page-section-dialog-form input#name");
			var editPageSectionNameTipsElement = wpi_jquery("#edit-page-section-dialog-form p.validateTips");
			wpi_jquery( "#edit-page-section-dialog-form" ).dialog({
					      autoOpen: false,
					      height: 300,
					      width: 400,
					      modal: true,
					      open: function() {
									editPageSectionNameElement.val(wpi_jquery( this ).data("pageSectionName"));
								},			
					      buttons: {
					        "Apply": function() {							         
					          if(editPageSectionNameElement.val().length > 1) {
					        	  wpiSelector.editPageSection(editPageSectionNameElement.val(),wpi_jquery( this ).data("pageSectionId"));
					        	  wpi_jquery( this ).dialog( "close" );
					          } else {
					        	  editPageSectionNameElement.val( "" ).addClass( "ui-state-error" );
					        	  editPageSectionNameTipsElement.text("Page Section name cannot be empty.");
					          }
					        },
					        Cancel: function() {
					        	editPageSectionNameElement.val( "" ).removeClass( "ui-state-error" );
					        	editPageSectionNameTipsElement.text("You can change the page section name below.");
					        	wpi_jquery( this ).dialog( "close" );
					        }
					      },
					      close: function() {
					    	  editPageSectionNameElement.val( "" ).removeClass( "ui-state-error" );
					    	  editPageSectionNameTipsElement.text("You can change the page section name below.");
					      }
					    });
							 
			wpi_jquery('#addPageSection')
				.button()
				.click(function(event) {
					event.preventDefault();
					wpi_jquery( "#add-page-section-dialog-form" ).dialog( "open" );
				});
			
			wpi_jquery('#savePageSections')
			.button()
			.click(function(event) {
				event.preventDefault();
				wpiSelector.savePageSections();
			});
	    	
			wpi_jquery(window).on("resize", function(e) {
	    		if(e.target == window) {
	    			setTimeout(wpiSelector.resizeSelectorHeight(),300);
	    		}	    		
	    	});
	    	
			wpiSelector.getDOMPositions();
	    	
			if(wpiOpt.pageSections !== "") {
	    		wpiSelector.givenPageSections = JSON.parse(wpiOpt.pageSections);
	    		wpiSelector.adjustAndDisplayPageSections(true);
	    	} else {
	    		wpiSelector.addPageSection("Page Start");
	    		wpiSelector.addPageSection("Next Section 01");
	    	}
			
			wpi_jquery(window).on("load", function(e) {
				console.log("Load event called");
				wpiSelector.getDOMPositions();
				wpiSelector.adjustAndDisplayPageSections();
			});
	    	
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
