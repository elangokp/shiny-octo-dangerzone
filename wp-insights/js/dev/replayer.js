var stage = null;
var cursorTween = null;
var movementArray = [];
var pointIndex = 0;
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
		var cursor123 = new createjs.Bitmap(crImage);
		cursor123.x=0;
		cursor123.y=0;
		stage.addChild(cursor123);
		new createjs.Ticker.addEventListener("tick", handleTick);		
		cursorTween = new createjs.Tween.get(cursor123);
		animate();
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
	var hoveredData = recordingData.hovered;
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
					point.d = hoveredData[i+1].t - hoveredData[i].t;
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

function animate() {
	alert("Calling animate : " + pointIndex);
	if(pointIndex<movementArray.length) {
		alert("Inside animate : " + pointIndex);
		var point = movementArray[pointIndex];
		var movementTime,waitTime = 0;
		if(point.d>500) {
			movementTime = 500;
			waitTime = point.d - 500;
		} else {
			movementTime = 0;
			waitTime = point.d;
		}
		pointIndex++;
		cursorTween.to({x:point.x,y:point.y}, movementTime).wait(waitTime).call(animate);
	}
	
	/*for (var i=0; i<movementArray.length; i++) {
		var point = movementArray[i];
		var movementTime,waitTime = 0;
		if(point.d>500) {
			movementTime = 500;
			waitTime = point.d - 500;
		} else {
			movementTime = 0;
			waitTime = point.d;
		}
		cursorTween.to({x:point.x,y:point.y}, movementTime).wait(waitTime);
	}*/
}

function handleTick(event) {
    stage.update();
}


function play() {
	constructMovementArray();
	initializePlayer();	
	//setTimeout(animate(),6000);
}