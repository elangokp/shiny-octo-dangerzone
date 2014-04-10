var stage = null;
var queue = null;
var cursor = null;
var cursorTween = null;
var initialMoveWait = 0;
var movementArray = [];
var initialScrollWait = 0;
var scrollArray = [];
var clickArray = [];
var viewportArray = [];
var initialClickWait = 0;
var pointIndex = 0;
var scrollIndex = 0;
var clickIndex = 0;
var viewportIndex = 0;
var allEventsArray = [];
var allEventsIndex = 0;
var initialWait = 0;

var cursorImage = null;
var clickImage = null;
var cursor = null;
var clicks = [];

var drawingCanvas;
var oldPt;
var oldMidPt;

var lastMovementCP = "";

var paused = false;

function initializePlayer() {
	var canvas = document.createElement("canvas");
	canvas.setAttribute("id","replayerCanvas");
	var body = document.getElementsByTagName("body")[0];
	//console.log($(document).width());
	//console.log($(document).height());
	canvas.width = jQuery(document).width();
	canvas.height = jQuery(document).height();
	canvas.style.cssText = "position:absolute;top:0;left:0;z-index:10000000;";
	jQuery("body").append(canvas);
	stage = new createjs.Stage("replayerCanvas");
	queue = new createjs.LoadQueue();
	queue.loadManifest([
	                    {id: "cursorImage", src:cursorImageUrl, type:createjs.LoadQueue.IMAGE},
	                    {id: "clickImage", src:clickImageUrl, type:createjs.LoadQueue.IMAGE}
	                ]);
	//queue.load();
	queue.on("complete",queueCompleteListener);
	/*setTimeout(function() {
		cursorImage = queue.getResult("cursorImage");
		console.log(cursorImage);
		clickImage = queue.getResult("clickImage");
		console.log(clickImage);
		cursor = new createjs.Bitmap(cursorImage);
		cursor.x=0;
		cursor.y=0;
		stage.addChild(cursor);
		new createjs.Ticker.addEventListener("tick", handleTick);	
		drawingCanvas = new createjs.Shape();
		stage.addChild(drawingCanvas);
		oldPt = new createjs.Point(0, 0);
		oldMidPt = oldPt;
		console.log("Image Loaded : " + new Date().getTime());
		window.parent.playerLoaded();
	}, 5000);
	constructMovementArray();
	constructScrollArray();
	constructClickArray();
	constructViewportsArray();
	normalizeEvents();*/
	 
}

function queueCompleteListener() {
	cursorImage = queue.getResult("cursorImage");
	console.log(cursorImage);
	clickImage = queue.getResult("clickImage");
	console.log(clickImage);
	cursor = new createjs.Bitmap(cursorImage);
	cursor.x=0;
	cursor.y=0;
	stage.addChild(cursor);
	new createjs.Ticker.addEventListener("tick", handleTick);	
	drawingCanvas = new createjs.Shape();
	stage.addChild(drawingCanvas);
	oldPt = new createjs.Point(0, 0);
	oldMidPt = oldPt;
	console.log("Image Loaded : " + new Date().getTime());
	constructMovementArray();
	constructScrollArray();
	constructClickArray();
	constructViewportsArray();
	normalizeEvents();
	window.parent.playerLoaded();
}


function constructMovementArray() {
	console.log(recordingData.hovered);
	var hoveredData = recordingData.hovered;
	movementArray = [];
	pointIndex = 0;
	if(hoveredData.length>0) {
		initialMoveWait = hoveredData[0].t*1000;
	}		
	for (var i=0; i<hoveredData.length; i++) {
		try {
			/*var element = jQuery( document ).find(hoveredData[i].cp);
			var x = hoveredData[i].pX;
			var y = hoveredData[i].pY;
			if(element.length > 0) {
				var xdiscrepancy = 1;
				var ydiscrepancy = 1;
				
				if(hoveredData[i].w > 0) {
					xdiscrepancy = jQuery(element).width()/hoveredData[i].w;
				}
				
				if(hoveredData[i].h > 0) {
					ydiscrepancy = jQuery(element).height()/hoveredData[i].h;
				}

				x = jQuery(element).first().offset().left + (hoveredData[i].rX * xdiscrepancy);
				y = jQuery(element).first().offset().top + (hoveredData[i].rY * ydiscrepancy);	
			}*/			
			var point = {
							type : "movement",
							pX : hoveredData[i].pX,
							pY : hoveredData[i].pY,
							w : hoveredData[i].w,
							h : hoveredData[i].h,
							rX : hoveredData[i].rX,
							rY : hoveredData[i].rY,
							startTime : hoveredData[i].t*1000,
							cp : hoveredData[i].cp
					};
			if(i<(hoveredData.length-1)) {
				point.d = (hoveredData[i+1].t - hoveredData[i].t)*1000;
			} else {
				point.d = 0;
			}
			movementArray.push(point);
			
		} catch (err) {
			console.log(err.message);
		}
		
	}			
	
	console.log(movementArray);
}


function constructScrollArray() {
	console.log(recordingData.scrolls);
	var scrollData = recordingData.scrolls;
	scrollArray = [];
	scrollIndex = 0;
	if(scrollData.length>0) {
		initialScrollWait = scrollData[0].startTime*1000;
	}	
	for (var i=0; i<scrollData.length; i++) {
		try {
				var scroll = {
				        type : "scroll",
						top : scrollData[i].endTop,
						left : scrollData[i].endLeft,
						duration : (scrollData[i].endTime - scrollData[i].startTime)*1000,
				        startTime : scrollData[i].startTime*1000
				};
				if(i<(scrollData.length-1)) {
					scroll.wait = (scrollData[i+1].startTime - scrollData[i].endTime)*1000;
				} else {
					scroll.wait = 0;
				}
				scroll.duration = scroll.duration + 100;
				if(scroll.wait > 0) {
					scroll.wait = scroll.wait - 100;
				}
				
				scrollArray.push(scroll);			
		} catch (err) {
			console.log(err.message);	
			//console.log(value.cp);					
		}
	}
	console.log(scrollArray);
}

function constructClickArray() {
	console.log(recordingData.clicked);
	var clickedData = recordingData.clicked;
	clickArray = [];
	clickIndex = 0;
	if(clickedData.length>0) {
		initialClickWait = clickedData[0].t*1000;
	}	
	for (var i=0; i<clickedData.length; i++) {
		try {
			/*var element = jQuery( document ).find(clickedData[i].cp);
			var x = clickedData[i].pX;
			var y = clickedData[i].pY;
			if(element.length > 0) {
				console.log(element);
				var xdiscrepancy = 1;
				var ydiscrepancy = 1;
				
				if(clickedData[i].w > 0) {
					xdiscrepancy = jQuery(element).width()/clickedData[i].w;
				}
				
				if(clickedData[i].h > 0) {
					ydiscrepancy = jQuery(element).height()/clickedData[i].h;
				}

				x = jQuery(element).first().offset().left + (clickedData[i].rX * xdiscrepancy);
				y = jQuery(element).first().offset().top + (clickedData[i].rY * ydiscrepancy);	
			}	*/		
			var point = {
							type : "click",
							pX : clickedData[i].pX,
							pY : clickedData[i].pY,
							w : clickedData[i].w,
							h : clickedData[i].h,
							rX : clickedData[i].rX,
							rY : clickedData[i].rY,
							startTime : clickedData[i].t*1000,
							cp : clickedData[i].cp
					};
			if(i<(clickedData.length-1)) {
				point.d = (clickedData[i+1].t - clickedData[i].t)*1000;
			} else {
				point.d = 0;
			}
			clickArray.push(point);
			
		} catch (err) {
			console.log(err.message);	
			//console.log(value.cp);					
		}
	}
	console.log(clickArray);
}

function constructViewportsArray() {
	console.log(recordingData.viewports);
	var viewportData = recordingData.viewports;
	viewportArray = [];
	viewportIndex = 0;
	
	for (var i=0; i<viewportData.length; i++) {
		try {
				var viewport = {
				        type : "viewport",
						w : viewportData[i].w,
						h : viewportData[i].h,
				        startTime : viewportData[i].t*1000
				};
				
				viewportArray.push(viewport);			
		} catch (err) {
			console.log(err.message);	
			//console.log(value.cp);					
		}
	}
	console.log(viewportArray);
}

function normalizeEvents() {
	allEventsIndex = 0;
	allEventsArray = [];
	allEventsArray = allEventsArray.concat(movementArray);
	allEventsArray = allEventsArray.concat(scrollArray);
	allEventsArray = allEventsArray.concat(clickArray);
	allEventsArray = allEventsArray.concat(viewportArray);
	allEventsArray.sort(compare);
	if(allEventsArray.length>0) {
		initialWait = allEventsArray[0].startTime;
	}
	for (var i=0; i<allEventsArray.length; i++) {
		if(i<(allEventsArray.length-1)) {
			allEventsArray[i].d = allEventsArray[i+1].startTime - allEventsArray[i].startTime;
		} else {
			allEventsArray[i].d = 0;
		}	
	}	
	console.log(allEventsArray);
}

function animate() {
	//console.log("Calling animate : " + allEventsIndex + " - " + new Date().getTime());
	//console.log(cursorTween);
	//alert("Calling animate : " + pointIndex);
	if(allEventsIndex<allEventsArray.length && !paused) {
		//alert("Inside animate : " + pointIndex);
		var event = allEventsArray[allEventsIndex];
		//console.log(event.type);
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
			
			var midPt = new createjs.Point(oldPt.x + x>>1, oldPt.y+y>>1);
			drawingCanvas.graphics.setStrokeStyle(5, 'round', 'round').beginStroke("#828b20").moveTo(midPt.x, midPt.y).curveTo(oldPt.x, oldPt.y, oldMidPt.x, oldMidPt.y);
			oldPt.x = x;
			oldPt.y = y;
			oldMidPt.x = midPt.x;
			oldMidPt.y = midPt.y;
			createjs.Tween.get(cursor).to({x:x,y:y}, movementTime).wait(waitTime).call(animate);
			lastMovementCP = event.cp;
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
				setTimeout(animate,delay);
			});
		} else if(event.type === "viewport") {
			var delay = event.d;
			window.parent.resizeFrame(event.h,event.w);
			setTimeout(animate,delay);
		} else if(event.type === "click") {
			var click = new createjs.Bitmap(clickImage);
			var clickElementCP = event.cp;
			if(lastMovementCP !== "") {
				clickElementCP = lastMovementCP;
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
			clicks.push(click);
			stage.addChild(click);
			jQuery(element).trigger("click");
			setTimeout(animate,event.d);
		}
		
		allEventsIndex++;	

	} else if (allEventsIndex >= allEventsArray.length) {
		window.parent.replayCompleted();
	}
	
}


function compare(a,b) {
  if (a.startTime < b.startTime)
     return -1;
  if (a.startTime > b.startTime)
    return 1;
  return 0;
}

function handleTick(event) {
    stage.update();
}


function play() {
	paused = false;
	if(allEventsIndex === 0) {
		setTimeout(animate,initialWait);
	} else if(allEventsIndex >= allEventsArray.length){ //If the replay completed without user stopping the replay.
		stop();
		play();
	} else {
		setTimeout(animate,0);
	}
	
}

function pause() {
	paused = true;
}

function stop() {
	paused = true;
	drawingCanvas.graphics.clear();
	for (var i=0; i<clicks.length; i++) {
		stage.removeChild(clicks[i]);
	}
	clicks = [];
	allEventsIndex = 0;
	window.parent.resizeFrame(recordingData.vp_height,recordingData.vp_width);
	jQuery('body').animate({
		scrollTop: 0,
		scrollLeft: 0
	},500,function() {});
	createjs.Tween.get(cursor).to({x:0,y:0}, 500);
	oldPt = new createjs.Point(0, 0);
	oldMidPt = oldPt;
	
}