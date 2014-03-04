var stage = null;
var cursor = null;
var cursorTween = null;
var initialMoveWait = 0;
var movementArray = [];
var initialScrollWait = 0;
var scrollArray = [];
var pointIndex = 0;
var scrollIndex = 0;

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
	var queue = new createjs.LoadQueue();
	queue.loadManifest([
	                    {id: "cursorImage", src:cursorImageUrl, type:createjs.LoadQueue.IMAGE}
	                ]);
	queue.load();
	setTimeout(function() {
		var crImage = queue.getResult("cursorImage");
		console.log(crImage);
		cursor = new createjs.Bitmap(crImage);
		cursor.x=0;
		cursor.y=0;
		stage.addChild(cursor);
		new createjs.Ticker.addEventListener("tick", handleTick);		
		//cursorTween = new createjs.Tween.get(cursor);
		console.log("Image Loaded : " + new Date().getTime());
		setTimeout(scrollAnimate,initialScrollWait);
		setTimeout(cursorAnimate,initialMoveWait);
		//setTimeout(cursorAnimate(),0);		
		//setTimeout(animate1(),0);		
		/*cursorTween.to({x:50,y:50}, 800)
		.wait(1000)
		.to({x:100,y:100}, 1000)
		.to({x:50,y:150}, 1200)
		.to({x:100,y:200}, 400)
		.to({x:50,y:250}, 1500);
		stage.update();*/
	}, 5000);
	 
}

function constructMovementArray() {
	console.log(recordingData.hovered);
	var hoveredData = recordingData.hovered;
	movementArray = [];
	initialMoveWait = hoveredData[0].t;
	for (var i=0; i<hoveredData.length; i++) {
		try {
			var element = jQuery( document ).find(hoveredData[i].cp);
			if(element.length > 0) {
				var xdiscrepancy = jQuery(element).width()/hoveredData[i].w;
				var ydiscrepancy = jQuery(element).height()/hoveredData[i].h;
				//var x = jQuery(element).first().offset().left + (hoveredData[i].rX * xdiscrepancy);
				//var y = jQuery(element).first().offset().top + (hoveredData[i].rY * ydiscrepancy);
				var point = {
						x : jQuery(element).first().offset().left + (hoveredData[i].rX * xdiscrepancy),
						y : jQuery(element).first().offset().top + (hoveredData[i].rY * ydiscrepancy)
				};
				if(i<(hoveredData.length-1)) {
					point.d = (hoveredData[i+1].t - hoveredData[i].t)*1000;
				} else {
					point.d = 0;
				}
				movementArray.push(point);
			}			
			
		} catch (err) {
			console.log(err.message);	
			//console.log(value.cp);					
		}
	}
	console.log(movementArray);
}

function cursorAnimate() {
	console.log("Calling cursorAnimate : " + pointIndex + " - " + new Date().getTime());
	//console.log(cursorTween);
	//alert("Calling animate : " + pointIndex);
	if(pointIndex<movementArray.length) {
		//alert("Inside animate : " + pointIndex);
		var point = movementArray[pointIndex];
		var movementTime,waitTime = 0;
		if(point.d>500) {
			movementTime = 500 + 10;
			waitTime = point.d - 500;
		} else {
			movementTime = 10;
			waitTime = point.d;
		}
		pointIndex++;
		createjs.Tween.get(cursor).to({x:point.x,y:point.y}, movementTime).wait(waitTime).call(cursorAnimate);

	}
}

function constructScrollArray() {
	console.log(recordingData.scrolls);
	var scrollData = recordingData.scrolls;
	scrollArray = [];
	initialScrollWait = scrollData[0].startTime*1000;
	for (var i=0; i<scrollData.length; i++) {
		try {
				var scroll = {
						top : scrollData[i].endTop,
						left : scrollData[i].endLeft,
						duration : (scrollData[i].endTime - scrollData[i].startTime)*1000
				};
				if(i<(scrollData.length-1)) {
					scroll.wait = (scrollData[i+1].startTime - scrollData[i].endTime)*1000;
				} else {
					scroll.wait = 0;
				}
				scrollArray.push(scroll);			
		} catch (err) {
			console.log(err.message);	
			//console.log(value.cp);					
		}
	}
	console.log(scrollArray);
}

function scrollAnimate() {
	console.log("Calling scrollAnimate : " + scrollIndex + " - " + new Date().getTime());
	if(scrollIndex<scrollArray.length) {
		//alert("Inside animate : " + pointIndex);
		var scroll = scrollArray[scrollIndex];
		scrollIndex++;	
		jQuery('body').animate({
			scrollTop: scroll.top,
			scrollLeft: scroll.left
		},scroll.duration,function() {
			setTimeout(scrollAnimate,scroll.wait);
		});

	}
}

function handleTick(event) {
    stage.update();
}


function play() {
	constructMovementArray();
	constructScrollArray();
	initializePlayer();	
	//setTimeout(animate(),6000);
}