(function() {
	
	if (typeof window.wpiReplayer !== 'undefined') { throw("wpiReplayer namespace conflict"); }
	window.wpiReplayer = {
			stage: null,
			queue: null,
			cursor: null,
			cursorTween: null,
			initialMoveWait: 0,
			movementArray: [],
			initialScrollWait: 0,
			scrollArray: [],
			clickArray: [],
			viewportArray: [],
			initialClickWait: 0,
			pointIndex: 0,
			scrollIndex: 0,
			clickIndex: 0,
			viewportIndex: 0,
			allEventsArray: [],
			allEventsIndex: 0,
			initialWait: 0,

			cursorImage: null,
			clickImage: null,
			cursor: null,
			clicks: [],

			drawingCanvas: null,
			oldPt: null,
			oldMidPt: null,

			lastMovementCP: "",

			paused: false,

			initializePlayer: function() {
				var canvas = document.createElement("canvas");
				canvas.setAttribute("id","replayerCanvas");
				var body = document.getElementsByTagName("body")[0];
				//console.log($(document).width());
				//console.log($(document).height());
				canvas.width = jQuery(document).width();
				canvas.height = jQuery(document).height();
				canvas.style.cssText = "position:absolute;top:0;left:0;z-index:10000000;";
				jQuery("body").append(canvas);
				wpiReplayer.stage = new createjs.Stage("replayerCanvas");
				wpiReplayer.queue = new createjs.LoadQueue();
				wpiReplayer.queue.loadManifest([
				                    {id: "cursorImage", src:cursorImageUrl, type:createjs.LoadQueue.IMAGE},
				                    {id: "clickImage", src:clickImageUrl, type:createjs.LoadQueue.IMAGE}
				                ]);
				wpiReplayer.queue.on("complete",wpiReplayer.queueCompleteListener);	 
			},

			queueCompleteListener: function() {
				wpiReplayer.cursorImage = wpiReplayer.queue.getResult("cursorImage");
				console.log(wpiReplayer.cursorImage);
				wpiReplayer.clickImage = wpiReplayer.queue.getResult("clickImage");
				console.log(wpiReplayer.clickImage);
				wpiReplayer.cursor = new createjs.Bitmap(wpiReplayer.cursorImage);
				wpiReplayer.cursor.x=0;
				wpiReplayer.cursor.y=0;
				wpiReplayer.stage.addChild(wpiReplayer.cursor);
				new createjs.Ticker.addEventListener("tick", wpiReplayer.handleTick);	
				wpiReplayer.drawingCanvas = new createjs.Shape();
				wpiReplayer.stage.addChild(wpiReplayer.drawingCanvas);
				wpiReplayer.oldPt = new createjs.Point(0, 0);
				wpiReplayer.oldMidPt = wpiReplayer.oldPt;
				console.log("Image Loaded : " + new Date().getTime());
				wpiReplayer.constructMovementArray();
				wpiReplayer.constructScrollArray();
				wpiReplayer.constructClickArray();
				wpiReplayer.constructViewportsArray();
				wpiReplayer.normalizeEvents();
				window.parent.playerLoaded();
			},


			constructMovementArray: function() {
				//console.log(recordingData.hovered);
				var hoveredData = recordingData.hovered;
				wpiReplayer.movementArray = [];
				wpiReplayer.pointIndex = 0;
				if(hoveredData.length>0) {
					wpiReplayer.initialMoveWait = hoveredData[0].t*1000;
				}		
				for (var i=0; i<hoveredData.length; i++) {
					try {		
						var point = {
										type : "movement",
										cp : hoveredData[i][0],
										startTime : hoveredData[i][1]*1000,
										pX : hoveredData[i][2],
										pY : hoveredData[i][3],
										rX : hoveredData[i][4],
										rY : hoveredData[i][5],
										w : hoveredData[i][6],
										h : hoveredData[i][7]
								};
						if(i<(hoveredData.length-1)) {
							point.d = (hoveredData[i+1][1] - hoveredData[i][1])*1000;
						} else {
							point.d = 0;
						}
						wpiReplayer.movementArray.push(point);
						
					} catch (err) {
						console.log(err.message);
					}
					
				}			
				
				//console.log(wpiReplayer.movementArray);
			},


			constructScrollArray: function() {
				//console.log(recordingData.scrolls);
				var scrollData = recordingData.scrolls;
				wpiReplayer.scrollArray = [];
				wpiReplayer.scrollIndex = 0;
				if(scrollData.length>0) {
					wpiReplayer.initialScrollWait = scrollData[0].startTime*1000;
				}	
				for (var i=0; i<scrollData.length; i++) {
					try {
							var scroll = {
							        type : "scroll",
									top : scrollData[i][3],
									left : scrollData[i][4],
									duration : (scrollData[i][5] - scrollData[i][2])*1000,
							        startTime : scrollData[i][2]*1000
							};
							if(i<(scrollData.length-1)) {
								scroll.wait = (scrollData[i+1][2] - scrollData[i][5])*1000;
							} else {
								scroll.wait = 0;
							}
							scroll.duration = scroll.duration + 100;
							if(scroll.wait > 0) {
								scroll.wait = scroll.wait - 100;
							}
							
							wpiReplayer.scrollArray.push(scroll);			
					} catch (err) {
						console.log(err.message);	
						//console.log(value.cp);					
					}
				}
				//console.log(wpiReplayer.scrollArray);
			},

			constructClickArray: function() {
				//console.log(recordingData.clicked);
				var clickedData = recordingData.clicked;
				wpiReplayer.clickArray = [];
				wpiReplayer.clickIndex = 0;
				if(clickedData.length>0) {
					wpiReplayer.initialClickWait = clickedData[0].t*1000;
				}	
				for (var i=0; i<clickedData.length; i++) {
					try {
						var point = {
										type : "click",
										cp : clickedData[i][0],
										startTime : clickedData[i][1]*1000,
										pX : clickedData[i][2],
										pY : clickedData[i][3],
										rX : clickedData[i][4],
										rY : clickedData[i][5],
										w : clickedData[i][6],
										h : clickedData[i][7]
								};
						if(i<(clickedData.length-1)) {
							point.d = (clickedData[i+1][1] - clickedData[i][1])*1000;
						} else {
							point.d = 0;
						}
						wpiReplayer.clickArray.push(point);
						
					} catch (err) {
						console.log(err.message);	
						//console.log(value.cp);					
					}
				}
				//console.log(wpiReplayer.clickArray);
			},

			constructViewportsArray: function() {
				//console.log(recordingData.viewports);
				var viewportData = recordingData.viewports;
				wpiReplayer.viewportArray = [];
				wpiReplayer.viewportIndex = 0;
				
				for (var i=0; i<viewportData.length; i++) {
					try {
							var viewport = {
							        type : "viewport",
									w : viewportData[i][0],
									h : viewportData[i][1],
							        startTime : viewportData[i][2]*1000
							};
							
							wpiReplayer.viewportArray.push(viewport);			
					} catch (err) {
						console.log(err.message);	
						//console.log(value.cp);					
					}
				}
				//console.log(wpiReplayer.viewportArray);
			},

			normalizeEvents: function() {
				wpiReplayer.allEventsIndex = 0;
				wpiReplayer.allEventsArray = [];
				wpiReplayer.allEventsArray = wpiReplayer.allEventsArray.concat(wpiReplayer.movementArray);
				wpiReplayer.allEventsArray = wpiReplayer.allEventsArray.concat(wpiReplayer.scrollArray);
				wpiReplayer.allEventsArray = wpiReplayer.allEventsArray.concat(wpiReplayer.clickArray);
				wpiReplayer.allEventsArray = wpiReplayer.allEventsArray.concat(wpiReplayer.viewportArray);
				wpiReplayer.allEventsArray.sort(wpiReplayer.compare);
				if(wpiReplayer.allEventsArray.length>0) {
					wpiReplayer.initialWait = wpiReplayer.allEventsArray[0].startTime;
				}
				for (var i=0; i<wpiReplayer.allEventsArray.length; i++) {
					if(i<(wpiReplayer.allEventsArray.length-1)) {
						wpiReplayer.allEventsArray[i].d = wpiReplayer.allEventsArray[i+1].startTime - wpiReplayer.allEventsArray[i].startTime;
					} else {
						wpiReplayer.allEventsArray[i].d = 0;
					}	
				}	
				//console.log(wpiReplayer.allEventsArray);
			},

			animate: function() {
				if(wpiReplayer.allEventsIndex<wpiReplayer.allEventsArray.length && !wpiReplayer.paused) {
					var event = wpiReplayer.allEventsArray[wpiReplayer.allEventsIndex];
					if(event.type === "movement") {
						var movementTime,waitTime = 0;
						if(event.d>500) {
							movementTime = 500 + 10;
							waitTime = event.d - 500;
						} else {
							movementTime = 10;
							waitTime = event.d;
						}
						var element = jQuery( document ).find(event.cp);
						var x = event.pX;
						var y = event.pY;
						if(element.length > 0) {
							var xdiscrepancy = 1;
							var ydiscrepancy = 1;
							
							if(event.w > 0) {
								xdiscrepancy = jQuery(element).width()/event.w;
							}
							
							if(event.h > 0) {
								ydiscrepancy = jQuery(element).height()/event.h;
							}

							x = jQuery(element).first().offset().left + (event.rX * xdiscrepancy);
							y = jQuery(element).first().offset().top + (event.rY * ydiscrepancy);	
						}
						
						if(x>4) {
							x = x-4;				
						}
						if(y>8) {
							y = y-4;				
						}
						
						var midPt = new createjs.Point(wpiReplayer.oldPt.x + x>>1, wpiReplayer.oldPt.y+y>>1);
						wpiReplayer.drawingCanvas.graphics.setStrokeStyle(5, 'round', 'round').beginStroke("#828b20").moveTo(midPt.x, midPt.y).curveTo(wpiReplayer.oldPt.x, wpiReplayer.oldPt.y, wpiReplayer.oldMidPt.x, wpiReplayer.oldMidPt.y);
						wpiReplayer.oldPt.x = x;
						wpiReplayer.oldPt.y = y;
						wpiReplayer.oldMidPt.x = midPt.x;
						wpiReplayer.oldMidPt.y = midPt.y;
						createjs.Tween.get(wpiReplayer.cursor).to({x:x,y:y}, movementTime).wait(waitTime).call(wpiReplayer.animate);
						//wpiReplayer.lastMovementCP = event.cp;
						var event = jQuery.Event("hover");
						event.pageX = x;
						event.pageY = y;
						jQuery(element).trigger(event);
						
					} else if(event.type === "scroll") {
						var duration = event.duration;
						var delay = event.d;
						if(duration < delay) {
							delay = delay - duration;
						} else {
							duration = delay;
							delay = 0;
						}			
						jQuery('body').animate({
							scrollTop: event.top,
							scrollLeft: event.left
						},duration,function() {
							setTimeout(wpiReplayer.animate,delay);
						});
					} else if(event.type === "viewport") {
						var delay = event.d;
						window.parent.resizeFrame(event.h,event.w);
						setTimeout(wpiReplayer.animate,delay);
					} else if(event.type === "click") {
						var click = new createjs.Bitmap(wpiReplayer.clickImage);
						var clickElementCP = event.cp;
						if(wpiReplayer.lastMovementCP !== "") {
							clickElementCP = wpiReplayer.lastMovementCP;
						}
						var element = jQuery( document ).find(clickElementCP);
						var x = event.pX;
						var y = event.pY;
						if(element.length > 0) {
							var xdiscrepancy = 1;
							var ydiscrepancy = 1;
							
							if(event.w > 0) {
								xdiscrepancy = jQuery(element).width()/event.w;
							}
							
							if(event.h > 0) {
								ydiscrepancy = jQuery(element).height()/event.h;
							}

							x = jQuery(element).first().offset().left + (event.rX * xdiscrepancy);
							y = jQuery(element).first().offset().top + (event.rY * ydiscrepancy);	
						}
						click.x = x - 16; //to adjust with click image size
						click.y = y - 10; //to adjust with click image size
						wpiReplayer.clicks.push(click);
						wpiReplayer.stage.addChild(click);
						jQuery(element).trigger("click");
						setTimeout(wpiReplayer.animate,event.d);
					}
					
					wpiReplayer.allEventsIndex++;	

				} else if (wpiReplayer.allEventsIndex >= wpiReplayer.allEventsArray.length) {
					window.parent.replayCompleted();
				}
				
			},


			compare: function(a,b) {
			  if (a.startTime < b.startTime)
			     return -1;
			  if (a.startTime > b.startTime)
			    return 1;
			  return 0;
			},

			handleTick: function(event) {
				wpiReplayer.stage.update();
			},


			play: function() {
				wpiReplayer.paused = false;
				if(wpiReplayer.allEventsIndex === 0) {
					setTimeout(wpiReplayer.animate,wpiReplayer.initialWait);
				} else if(wpiReplayer.allEventsIndex >= wpiReplayer.allEventsArray.length){ //If the replay completed without user stopping the replay.
					wpiReplayer.stop();
					wpiReplayer.play();
				} else {
					setTimeout(wpiReplayer.animate,0);
				}
				
			},

			pause: function() {
				wpiReplayer.paused = true;
			},

			stop: function() {
				wpiReplayer.paused = true;
				wpiReplayer.drawingCanvas.graphics.clear();
				for (var i=0; i<wpiReplayer.clicks.length; i++) {
					wpiReplayer.stage.removeChild(wpiReplayer.clicks[i]);
				}
				wpiReplayer.clicks = [];
				wpiReplayer.allEventsIndex = 0;
				window.parent.resizeFrame(recordingData.vp_height,recordingData.vp_width);
				jQuery('body').animate({
					scrollTop: 0,
					scrollLeft: 0
				},500,function() {});
				createjs.Tween.get(wpiReplayer.cursor).to({x:0,y:0}, 500);
				wpiReplayer.oldPt = new createjs.Point(0, 0);
				wpiReplayer.oldMidPt = wpiReplayer.oldPt;
				
			}
	};
	
})();

