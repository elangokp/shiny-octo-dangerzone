/*! 
 * (smt)2 simple mouse tracking v2.1.0
 * Copyleft (cc) 2006-2012 Luis Leiva
 * http://smt2.googlecode.com & http://smt.speedzinemedia.com
 */
/** 
 * (smt)2 simple mouse tracking - record script (smt-record.js)
 * Copyleft (cc) 2006-2012 Luis Leiva
 * Release date: March 23 2012
 * http://smt2.googlecode.com & http://smt.speedzinemedia.com
 * @class smt2-record
 * @requires smt2-aux Auxiliary (smt)2 functions  
 * @version 2.1.0
 * @author Luis Leiva 
 * @license Dual licensed under the MIT (MIT-LICENSE.txt) and GPL (GPL-LICENSE.txt) licenses. 
 * @see smt2fn
 */
(function(){
  /** 
   * (smt)2 default recording options.
   * This Object can be overriden when calling the smt2.record method.
   */
  var smtOpt = {
    /**
     * Tracking frequency, in frames per second.
     * @type number           
     */
    fps: 24,
    /**
     * Maximum recording time (aka tracking timeout), in seconds. 
     * If timeout is reached, mouse activity is not recorded.
     * @type number     
     */
    recTime: 120,
    /**
     * Interval to send data, in seconds
     * If timeout is reached, mouse activity is not recorded.
     * @type number     
     */
    postInterval: 2,
    /**
     * URL to local (smt)2 website, i.e., the site URL to track (with the smt*.js files).
     * The record script will try to find automatically the URL, but if you used other name (i.e: http://my.server/test) 
     * you must type it explicitly here.      
     * Valid path names that will be recognized automatically are those having the string "smt2",
     * e.g: "http://domain.name/smt2/", "/my/smt2dir/", "/server/t/tracksmt2/" ... and so on.
     * @type string
     */
    //trackingServer: "/smt2/",
    trackingUrl: "",
    /**
     * URL to remote (smt)2 server, i.e., the site URL where the logs will be stored, and (of course) the CMS is installed.
     * If this value is empty, data will be posted to trackingServer URL.
     * @type string
     */
    storageServer: "",
    /**
     * You may choose to advice users (or not) that their mouse activity is going to be logged.
     * @type boolean      
     */
    warn: false,
    /**
     * Text to display when advising users (if warn: true).
     * You can split lines in the confirm dialog by typing the char \n.
     * @type string
     */
    warnText: "We'd like to study your mouse activity." +"\n"+ "Do you agree?",
    /**
     * Cookies lifetime (in days) to reset both first time users and agreed-to-track visitors.
     * @type int     
     */
    cookieDays: 365,
    /** 
     * Main layout content diagramation; a.k.a 'how page content flows'. 
     * Values: "left" (fixed), "center" (fixed and centered), or "liquid" (adaptable, default behavior).
     * In "left" and "center" layouts the content is not adapted on resizing the browser.
     * An example of left diagramation is http://smt.speedzinemedia.com
     * @type string
     */
    layoutType: "liquid",
    /**
     * Recording can stop/resume on blur/focus to save space in your DB. 
     * Depending on your goals/experiment/etc., you may want to tweak this behavior.
     * @type boolean
     */
    contRecording: true,
    /** 
     * Random user selection: if true, (smt)2 is not initialized.
     * Setting it to false (or 0) means that all the population will be tracked.
     * You should use random sampling for better statistical analysis,
     * or your own sampling strategy; e.g. this would track users only on Mondays:
     * disabled: (function(){ return (new Date().getDay() == 1); })()
     * @type int
     */
    disabled: 0 //Math.round(Math.random()) // <-- random sampling
  };
  
  
  /* do not edit below this line -------------------------------------------- */
  
  // get auxiliar functions
  var aux = window.smt2fn;
  if (typeof aux === "undefined") { throw("auxiliar (smt)2 functions not found"); }
    
  /** 
   * (smt)2 recording object.
   * This Object is private. Methods are cited but not documented.
   */
  var smtRec = {
    i: 0,                                  // step counter
    mouse:     { x:0, y:0 },               // mouse position
    page:      { width:0, height:0 },      // data normalization
    coords:    { x:[], y:[], p:[] },       // position coords and mouse click state (~ pressure)
    elem:      { hovered:[], clicked:[], lostFocus:[] }, // clicked, hovered and lostfocus elements
    scrolls:   [],
    url:       null,                       // document URL
    rec:       null,                       // recording identifier
    userId:    null,                       // user identifier
    append:    null,                       // append data identifier
    paused:    false,                      // check active window
    clicked:   false,                      // no mouse click yet
    timestamp: null,                       // current date's timestamp
    timeout:   null,                       // tracking timeout
    xmlhttp:   aux.createXMLHTTPObject(),  // common XHR object
    ftu:       1,                          // assume a first time user initially
    ip:		   null,					   // IP of the visitor
    scrollPercentage: 0,                   // Percentage of page seen by visitor
    lostFocusCount:   0,                   // Number of times a visitor got distracted from the page
    blurTime:      0,                      // Blur time on the page
    lastBlurTimeStamp: null,               // Timestamp when the window lost focus last time
    lastFocusTimeStamp: null,              // Timestamp when the window gained focus last time
    pageSections: [],                      // Array of page sections with data
    currentPageSection: "",                // Page section in view port now. Initialised to page start default page section.
    lastPageSection: "",                   // Page section that was in viewport before the current page section.
    scrollStopped: true,
    currentScrollTop: 0,
    currentScrollLeft: 0,
    viewPorts:         [],
    
    find_in_array: function(arr, name, value) {
        for (var i = 0, len = arr.length; i<len; i++) {
            if (name in arr[i] && arr[i][name] == value) return i;
        };
        return false;
    },
    
    captureViewPorts: function()
    {
    	var viewPort = {
    			w: jQuery_1_10_2(window).width(),
    			h: jQuery_1_10_2(window).height(),
    			t: smtRec.getTime()
    	}
    	smtRec.viewPorts.push(viewPort);
    },
    
    recordScrolls: function(eventType,scrollStopDelay)
    {
    	var scrollTop = jQuery_1_10_2(window).scrollTop();	
    	
    	var scrollLeft = jQuery_1_10_2(window).scrollLeft();
    	
    	if(eventType === "scrollStart" && smtRec.scrollStopped){
    		smt2fn.log("scrollStart");
    		smtRec.scrollStopped = false;
    		smt2fn.log("scrollTop : " + smtRec.currentScrollTop);
    		smt2fn.log("scrollLeft : " + smtRec.currentScrollLeft);
    		var scroll = {
 	                     startTop: smtRec.currentScrollTop,
 	                     startLeft: smtRec.currentScrollLeft,
 	                     startTime: smtRec.getTime(),
 	                     endTop: null,
 	                     endLeft: null,
					     endTime: null,
 	                 };
    		smtRec.scrolls.push(scroll);
    		smt2fn.log(smtRec.scrolls);
    	} else if(eventType === "scrollStop" && !smtRec.scrollStopped) {
    		smt2fn.log("scrollStop");
    		scrollStopDelay = (scrollStopDelay === undefined) ? 0 : scrollStopDelay;
    		smtRec.currentScrollTop = jQuery_1_10_2(window).scrollTop();
    		smtRec.currentScrollLeft = jQuery_1_10_2(window).scrollLeft();
    		smt2fn.log("scrollTop : " + smtRec.currentScrollTop);
    		smt2fn.log("scrollLeft : " + smtRec.currentScrollLeft);
    		if(smtRec.scrolls.length > 0){
    			smt2fn.log("scrolls length greater than 0");
    			smtRec.scrolls[smtRec.scrolls.length-1].endTop = smtRec.currentScrollTop;
        		smtRec.scrolls[smtRec.scrolls.length-1].endLeft = smtRec.currentScrollLeft;
        		smtRec.scrolls[smtRec.scrolls.length-1].endTime = smtRec.getTime()-scrollStopDelay;
    		} 
    		smt2fn.log(smtRec.scrolls);
    		smtRec.scrollStopped = true;
    		
    	}    	
    },
    
    
    updatePageSections: function()
    {
    	var scrollTop = jQuery_1_10_2(window).scrollTop();
		var center = scrollTop + ((jQuery_1_10_2(window).height())/2);
		smt2fn.log("updatePageSections");
		jQuery_1_10_2.each(smtRec.pageSections, function(index){
			var sectionTop = smtRec.pageSections[index].top;
			var sectionBottom = smtRec.pageSections[index].bottom;
			if(sectionTop<center && sectionBottom>center) {
				var pageSectionDetected = smtRec.pageSections[index].sectionName;
				if(pageSectionDetected != smtRec.currentPageSection) {
					smtRec.lastPageSection = smtRec.currentPageSection;
					smtRec.currentPageSection = pageSectionDetected;
					smtRec.pageSections[index].currentPageSection = 1;
					smtRec.pageSections[index].viewed = "true";
					smtRec.pageSections[index].entryTimes.push(smtRec.getTime());
					smtRec.pageSections[index].focusedEntryTimes.push(smtRec.getFocusTime());
					if(smtRec.lastPageSection !== "") {
						var lastPageSectionIndex = smtRec.find_in_array(smtRec.pageSections,"sectionName",smtRec.lastPageSection);
						
						smtRec.pageSections[lastPageSectionIndex].exitTimes.push(smtRec.getTime());
						smtRec.pageSections[lastPageSectionIndex].focusedExitTimes.push(smtRec.getFocusTime());
						smtRec.pageSections[lastPageSectionIndex].currentPageSection = 0;
						var LPSEntryTimesLastIndex = smtRec.pageSections[lastPageSectionIndex].entryTimes.length - 1;
						var LPSExitTimesLastIndex = smtRec.pageSections[lastPageSectionIndex].exitTimes.length - 1;
						
						var LPSLastEntryTime = smtRec.pageSections[lastPageSectionIndex].entryTimes[LPSEntryTimesLastIndex];
						var LPSLastExitTime = smtRec.pageSections[lastPageSectionIndex].exitTimes[LPSExitTimesLastIndex];
						
						smtRec.pageSections[lastPageSectionIndex].totalTime = smtRec.pageSections[lastPageSectionIndex].totalTime + (LPSLastExitTime - LPSLastEntryTime);
						
						var LPSFocusedEntryTimesLastIndex = smtRec.pageSections[lastPageSectionIndex].focusedEntryTimes.length - 1;
						var LPSFocusedExitTimesLastIndex = smtRec.pageSections[lastPageSectionIndex].focusedExitTimes.length - 1;
						
						var LPSLastFocusedEntryTime = smtRec.pageSections[lastPageSectionIndex].focusedEntryTimes[LPSFocusedEntryTimesLastIndex];
						var LPSLastFocusedExitTime = smtRec.pageSections[lastPageSectionIndex].focusedExitTimes[LPSFocusedExitTimesLastIndex];
						
						smtRec.pageSections[lastPageSectionIndex].totalFocusedTime = smtRec.pageSections[lastPageSectionIndex].totalFocusedTime + (LPSLastFocusedExitTime - LPSLastFocusedEntryTime);
					}
					
				}
				return false;
			}
		});
		//alert("currentPageSection is " +smtRec.currentPageSection+ " lastPageSection is " + smtRec.lastPageSection);
    },
    
    /** 
     * Pauses recording. 
     * The mouse activity is tracked only when the current window has focus. 
     */
    pauseRecording: function() 
    {
      smtRec.paused = true;
    },
    /** 
     * Resumes recording. The current window gain focus.
     */
    resumeRecording: function() 
    {
      smtRec.paused = false;
    },
    /** 
     * Cross-browser way to register the mouse position.
     * @autor Peter-Paul Koch (quirksmode.org)
     */
    getMousePos: function(e) 
    {
      if (!e) var e = window.event;
      
      var x = 0, y = 0;
    	if (e.pageX || e.pageY) {
    		x = e.pageX;
    		y = e.pageY;
    	}	else if (e.clientX || e.clientY) {
    		x = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
    		y = e.clientY + document.body.scrollTop  + document.documentElement.scrollTop;
    	}
      // in certain situations the mouse coordinates could be negative values (e.g. Opera)
    	if (x < 0 || !x) x = 0;
    	if (y < 0 || !y) y = 0;
    	
      smtRec.mouse.x = x;
      smtRec.mouse.y = y;
    },
    /** 
     * Cross-browser way to register the mouse position inside an iframe.
     */
    getMousePosIFrame: function(e, frame) 
    {
      // we don't want to stop tracking when interacting on an iframe (a blur event is triggered)
      smtRec.pause = false;
      
    	var x = e.pageX || e.clientX;
    	var y = e.pageY || e.clientY;
    	var d = frame.contentDocument || frame.contentWindow;
      if (d.body) {
        x -= d.body.scrollLeft;
        y -= d.body.scrollTop;
      }
      if (d.documentElement) {
        x -= d.documentElement.scrollLeft;
        y -= d.documentElement.scrollTop;
      }
      var c = smtRec.getFrameOffsets(frame);
      x += c.left;
      y += c.top;
      
      smtRec.mouse.x = x;
      smtRec.mouse.y = y;
    },
    /** 
     * Computes iframe offsets.
     */
    getFrameOffsets: function(frame)
    {
      var frm = (frame && frame.frameElement) ? frame.frameElement : frame;
      var l = 0, t = 0;
      if (frm && frm.offsetParent) {
        do {
          l += frm.offsetLeft;
          t += frm.offsetTop;
        } while (frm = frm.offsetParent);
      }
      return { left:l , top:t }
    },
    /** 
     * This method allows to register single clicks and drag and drop operations.
     */
    setClick: function() 
    {
      smtRec.clicked = true;
    },
    /** 
     * User releases the mouse.
     */
    releaseClick: function() 
    {
      smtRec.clicked = false; 
    },
    /** 
     * (smt)2 recording loop.
     * Tracks mouse coords when they're inside the client window, 
     * so zero and null values are not taken into account.     
     */
    recMouse: function() 
    {
      // track mouse only if window is active (has focus)
      if (smtRec.paused) { return; }
      // get mouse coords until timeout is reached 
      if (smtRec.i < smtRec.timeout) {
        // store using the UNIPEN format
        smtRec.coords.x.push(Math.round(smtRec.mouse.x));
        smtRec.coords.y.push(Math.round(smtRec.mouse.y));
        smtRec.coords.p.push(+smtRec.clicked);
    	} else {
    	  // timeout reached
    	  clearInterval(smtRec.rec);
    	  clearInterval(smtRec.append);
    	}
    	// next step
    	++smtRec.i;
    },
    /** 
     * Sends data in background via an XHR object (asynchronous request).
     * This function starts the tracking session.
     */   
    initMouseData: function() 
    {
      smtRec.computeAvailableSpace();
      smt2fn.log("Inside init mouse data");
      smt2fn.log("Window Height : " + jQuery_1_10_2(window).height());
      smt2fn.log("Window Width : " + jQuery_1_10_2(window).width());
      smt2fn.log("Doc Height : " + jQuery_1_10_2(document).height());
      smt2fn.log("Doc Width : " + jQuery_1_10_2(document).width());
      
      // prepare data
      var requestData  = "url="        + smtRec.url;
      requestData += "&urltitle="  + document.title;
      requestData += "&cookies="   + document.cookie;
      requestData += "&screenw="   + screen.width;
      requestData += "&screenh="   + screen.height;
      requestData += "&pagew="     + smtRec.page.width;
      requestData += "&pageh="     + smtRec.page.height;
      requestData += "&vp="        + encodeURIComponent(JSON.stringify(smtRec.viewPorts));
      requestData += "&time="      + smtRec.getTime();
      requestData += "&fps="       + smtOpt.fps;
      requestData += "&ftu="       + smtRec.ftu;
      //requestData += "&xcoords="   + smtRec.coords.x;
      //requestData += "&ycoords="   + smtRec.coords.y;
      //requestData += "&clicks="    + smtRec.coords.p;
      //requestData += "&elhovered=" + encodeURIComponent(JSON.stringify(smtRec.elem.hovered));
      //requestData += "&elclicked=" + encodeURIComponent(JSON.stringify(smtRec.elem.clicked));
      //requestData += "&ellostfocus=" + encodeURIComponent(JSON.stringify(smtRec.elem.lostFocus));
      requestData += "&lostFocusCount=" + smtRec.lostFocusCount;
      requestData += "&focusedTime=" + smtRec.getFocusTime();
      requestData += "&scrollPercentage=" + smtRec.scrollPercentage;
      requestData += "&action="    + "wpistore";
      requestData += "&remote="    + smtOpt.storageServer;
      
      var gatewayUrl = smtOpt.trackingUrl;
      /*if ('XDomainRequest' in window && window.XDomainRequest !== null) {
    	    // Use Microsoft XDR
    	    var xdr = new XDomainRequest();
    	    xdr.open("post", gatewayUrl+"?action=wpistore&isXDR=true");
    	    xdr.onload = function () {
    	    var responseData = xdr.responseText;
    	    if (responseData == null || typeof (responseData) == 'undefined')
    	    {
    	    	responseData = data.firstChild.textContent;
    	    }
    	    smtRec.setUserId(responseData);
    	    };
    	    xdr.onprogress = function(){};
    	    xdr.ontimeout = function(){};
    	    xdr.onerror = function(){};
    	    setTimeout(function(){
    	        xdr.send(requestData);
    	    }, 0);
    	} else {
    		jQuery_1_10_2.ajax({
      		  type: "POST",
      		  url:  gatewayUrl,
      		  data: requestData,
      		  success: function(data) {
      			  smtRec.setUserId(data);
      		  }
    		});
    	}*/
      
      jQuery_1_10_2.ajax({
  		  type: "GET",
  		  url:  gatewayUrl,
  		  data: requestData,
  		  success: function(data) {
  			  smtRec.setUserId(data);
  		  }
		});
      
      // clean
      //smtRec.clearMouseData();
    },
    /**
     * Sets the user ID.
     * @return void
     * @param {string} response  XHR response text
     */
    setUserId: function(response) 
    {
      smtRec.userId = parseInt(response);
      if (smtRec.userId > 0) {
    	  setTimeout(smtRec.cacheUserPage, 10);
    	  setTimeout(smtRec.appendMouseData, 100);
        // once the session started, append mouse data
        smtRec.append = setInterval(smtRec.appendMouseData, smtOpt.postInterval*1000);
      }      
    },
    
    /** Send a request to server to cache the page. */
    cacheUserPage: function()
	{
    	var requestData  = "uid="    + smtRec.userId;
		requestData += "&action="    + "wpicachepage";
		requestData += "&url="       + smtRec.url;
		requestData += "&urltitle="  + document.title;
		requestData += "&cookies="   + document.cookie;
		requestData += "&html="      + smtRec.getDocumentHtml();
		requestData += "&remote="    + smtOpt.storageServer;
		
	    // send request
	    var gatewayUrl = smtOpt.trackingUrl;
	    
	    if ('XDomainRequest' in window && window.XDomainRequest !== null) {
    	    // Use Microsoft XDR
    	    var xdr = new XDomainRequest();
    	    xdr.open("post", gatewayUrl+"?action=wpicachepage&isXDR=true");
    	    xdr.onload = function () {};
    	    xdr.onprogress = function(){};
    	    xdr.ontimeout = function(){};
    	    xdr.onerror = function(){};
    	    setTimeout(function(){
    	        xdr.send(requestData);
    	    }, 0);
    	} else {
    		jQuery_1_10_2.ajax({
      		  type: "POST",
      		  url:  gatewayUrl,
      		  data: requestData
    		});
    	}
	},
	
	getDocumentHtml: function() {
        for (var dt = window.document.doctype, de = window.document.documentElement, dt = (dt && null != dt ? "<!DOCTYPE " + dt.name + ("" != dt.publicId ? ' PUBLIC "' + dt.publicId + '" "' + dt.systemId + '"' : "") + ">\n" : "<!DOCTYPE html>\n") + "<html", attrId = 0; attrId < de.attributes.length; attrId++) 
        	var h = de.attributes[attrId],  dt = dt + ("null" != h.value && "" != h.value ? " " + h.name + '="' + h.value + '"' : "");
        return encodeURIComponent(dt += ">" + jQuery_1_10_2(de).html() + "</html>");
    },
	
    /** Gets current time (in seconds). */
    getTime: function()
    {
      var ms = (new Date()).getTime() - smtRec.timestamp;
      
      return ms/1000; // use seconds
    },
    
    /** Gets current focused time (in seconds). */
    getFocusTime: function()
    {
      var ms = 0;
      if(document.hasFocus()) {
    	  ms = ((new Date()).getTime() - smtRec.timestamp) - smtRec.blurTime; 
    	  smt2fn.log("Document Has Focus : " + ms/1000);
      } else {
    	  smt2fn.log("Document Doesnt have Focus : lastBlurTimeStamp : " + smtRec.lastBlurTimeStamp);
    	  smt2fn.log("Document Doesnt have Focus : blurTime : " + smtRec.blurTime);
    	  smt2fn.log("Document Doesnt have Focus : time till last blur : " + (smtRec.lastBlurTimeStamp - smtRec.timestamp));
    	  ms = (smtRec.lastBlurTimeStamp - smtRec.timestamp) - smtRec.blurTime;
    	  smt2fn.log("Document Doesnt have Focus : " + ms/1000);
      }
      return ms/1000; // use seconds
    },
    
    getScrollPercentage: function()
    {
    	var win = jQuery_1_10_2(window);
        
        var viewport = {
            top : win.scrollTop(),
            left : win.scrollLeft()
        };
        viewport.right = viewport.left + win.width();
        viewport.bottom = viewport.top + win.height();
        
    },
    
    /** 
     * Sends data (POST) in asynchronously mode via an XHR object.
     * This appends the mouse data to the current tracking session.
     * If user Id is not set, mouse data are queued.     
     */   
    appendMouseData: function() 
    {
      if (!smtRec.rec || smtRec.paused) { return false; }
      // prepare data
      var requestData  = "uid="        + smtRec.userId;
	      requestData += "&time="      + smtRec.getTime();
	      //requestData += "&pagew="     + smtRec.page.width;
	      //requestData += "&pageh="     + smtRec.page.height;
	      requestData += "&xcoords="   + smtRec.coords.x;
	      requestData += "&ycoords="   + smtRec.coords.y;
	      requestData += "&clicks="    + smtRec.coords.p;
	      requestData += "&elhovered=" + encodeURIComponent(JSON.stringify(smtRec.elem.hovered));
	      requestData += "&elclicked=" + encodeURIComponent(JSON.stringify(smtRec.elem.clicked));
	      requestData += "&ellostfocus=" + encodeURIComponent(JSON.stringify(smtRec.elem.lostFocus));
	      requestData += "&scrolls=" + encodeURIComponent(JSON.stringify(smtRec.scrolls));
	      requestData += "&vp="        + encodeURIComponent(JSON.stringify(smtRec.viewPorts));
	      requestData += "&lostFocusCount=" + smtRec.lostFocusCount;
	      requestData += "&focusedTime=" + smtRec.getFocusTime();
	      requestData += "&scrollPercentage=" + smtRec.scrollPercentage;
	      requestData += "&pageSections=" + encodeURIComponent(JSON.stringify(smtRec.pageSections));
	      requestData += "&currentPageSection=" + smtRec.currentPageSection;
          requestData += "&action="    + "wpiappend";
          requestData += "&remote="    + smtOpt.storageServer;
          
      smt2fn.log("Inside append mouse data");
      // send request
      var gatewayUrl = smtOpt.trackingUrl;
      if ('XDomainRequest' in window && window.XDomainRequest !== null) {
  	    // Use Microsoft XDR
    	smt2fn.log('XDomainRequest');
  	    var xdr = new XDomainRequest();
  	    xdr.open("post", gatewayUrl+"?action=wpiappend&isXDR=true");
  	    xdr.onload = function () {};
  	    xdr.onprogress = function(){};
  	    xdr.ontimeout = function(){};
  	    xdr.onerror = function(){};
  	    setTimeout(function(){
  	        xdr.send(requestData);
  	    }, 0);
	} else {
		jQuery_1_10_2.ajax({
			  type: "POST",
			  url:  gatewayUrl,
			  data: requestData
		});
	}
      /*
      jQuery_1_10_2.ajax({
		  type: "POST",
		  url:  gatewayUrl,
		  data: requestData
	});*/
      // clean
      smtRec.clearMouseData();
    },
    
    /** 
     * Sends data (POST) in asynchronously mode via an XHR object.
     * This appends the mouse data to the current tracking session.
     * If user Id is not set, mouse data are queued.     
     */   
    appendExitMouseData: function() 
    {
      if (!smtRec.rec || smtRec.paused) { return false; }
      // prepare data
      var requestData  = "uid="        + smtRec.userId;
	      requestData += "&time="      + smtRec.getTime();
	      //requestData += "&pagew="     + smtRec.page.width;
	      //requestData += "&pageh="     + smtRec.page.height;
	      requestData += "&xcoords="   + smtRec.coords.x;
	      requestData += "&ycoords="   + smtRec.coords.y;
	      requestData += "&clicks="    + smtRec.coords.p;
	      requestData += "&elhovered=" + encodeURIComponent(JSON.stringify(smtRec.elem.hovered));
	      requestData += "&elclicked=" + encodeURIComponent(JSON.stringify(smtRec.elem.clicked));
	      requestData += "&ellostfocus=" + encodeURIComponent(JSON.stringify(smtRec.elem.lostFocus));
	      requestData += "&scrolls=" + encodeURIComponent(JSON.stringify(smtRec.scrolls));
	      requestData += "&vp="        + encodeURIComponent(JSON.stringify(smtRec.viewPorts));
	      requestData += "&lostFocusCount=" + smtRec.lostFocusCount;
	      requestData += "&focusedTime=" + smtRec.getFocusTime();
	      requestData += "&scrollPercentage=" + smtRec.scrollPercentage;
	      requestData += "&pageSections=" + encodeURIComponent(JSON.stringify(smtRec.pageSections));
	      requestData += "&currentPageSection=" + smtRec.currentPageSection;
	      requestData += "&action="    + "wpiexit";
	      requestData += "&remote="    + smtOpt.storageServer;
	      
      //alert("Inside append mouse data");
      // send request
      var gatewayUrl = smtOpt.trackingUrl;
      if ('XDomainRequest' in window && window.XDomainRequest !== null) {
  	    // Use Microsoft XDR
  	    var xdr = new XDomainRequest();
  	    xdr.open("post", gatewayUrl+"?action=wpiexit&isXDR=true");
  	    xdr.onload = function () {};
  	    xdr.onprogress = function(){};
  	    xdr.ontimeout = function(){};
  	    xdr.onerror = function(){};
  	    setTimeout(function(){
  	        xdr.send(requestData);
  	    }, 0);
	} else {
		jQuery_1_10_2.ajax({
			  type: "POST",
			  url:  gatewayUrl,
			  data: requestData
		});
	}
      /*
      jQuery_1_10_2.ajax({
		  type: "POST",
		  url:  gatewayUrl,
		  data: requestData
	});*/
      // clean
      smtRec.clearMouseData();
    },
    
    /** 
     * Clears mouse data from queue.        
     */
    clearMouseData: function()
    {
      smtRec.coords.x = [];
      smtRec.coords.y = [];
      smtRec.coords.p = [];
      smtRec.elem.hovered = [];
      smtRec.elem.clicked = [];
      smtRec.elem.lostFocus = [];
    },
    /** 
     * Finds hovered or clicked DOM element.     
     */
    findElement: function(e)
    {
      if (!e) { e = window.event; }
      // bind function to widget tracking object
      smtRec.findDOMElement(e, function(name){
        if (e.type == "mousedown" || e.type == "touchstart") {
          smtRec.elem.clicked.push(name);
          //smt2fn.log(JSON.stringify(smtRec.elem.clicked));
        } else if (e.type == "mousemove" || e.type == "touchmove") {
          smtRec.elem.hovered.push(name);
          //smt2fn.log(JSON.stringify(smtRec.elem.hovered));
        }
      });
    },
    /** 
     * Computes page size.
     */
    computeAvailableSpace: function()
    {
      var doc = aux.getPageSize();
      smtRec.page.width  = doc.width;
      smtRec.page.height = doc.height;
    },
    /**
     * Tracks mouse activity inside iframes.
     * This function will fail silently on iframes outside the domain of the caller HTML.
     * @param {Object}  d   document object   
     * @return void
     */     
    trackIFrames: function(d)
    {
      var iframes = d.getElementsByTagName('iframe'), doc, newdoc, frame;
      // set a common function for mobile clients
      var onFrameLoaded = function(d) {
        aux.addEvent(d, "mousedown", smtRec.setClick);
        aux.addEvent(d, "mouseup",   smtRec.releaseClick);
        aux.addEvent(d, "touchstart", smtRec.setClick);
        aux.addEvent(d, "touchend",   smtRec.releaseClick); 
      };
      // grab iframes
      for (var i = 0, f = iframes.length; i < f; ++i) {
        doc = (window.opera) ? iframes[i] : iframes[i].contentWindow || iframes[i].contentDocument;
        //try { var localAccess = doc.domain; } catch(err) { continue; }
        // we can access only the iframes on the same domain than the caller HTML
        if (doc.attachEvent && !window.opera) {
          // get mouse position for IE on iframe :'(
          var cloned = iframes[i].cloneNode(true);
          iframes[i].parentNode.replaceChild(cloned, iframes[i]);
          // now add dynamically the load event
          iframes[i].onreadystatechange = function(e) {
            if (this.readyState === "complete") {
              frame = this.contentWindow;
              newdoc = frame.document;
              aux.addEvent(newdoc, "mousemove", function(e){
                smtRec.getMousePosIFrame(this.parentWindow.event, this.frames.frameElement);
              });
              aux.addEvent(newdoc, "touchmove", function(e){
                smtRec.getMousePosIFrame(this.parentWindow.event, this.frames.frameElement);
              });              
              onFrameLoaded(newdoc);
            }
          };
        } else {
          // get mouse position for all other browsers :'(
          if (doc.frameElement) doc = doc.frameElement;
          aux.addEvent(doc, "load", function(e){
            frame = e.target || e.srcElement;
            newdoc = frame.contentDocument;
            aux.addEvent(newdoc, "mousemove", function(e){
              smtRec.getMousePosIFrame(e, frame);
            });
            aux.addEvent(newdoc, "touchmove", function(e){
              smtRec.getMousePosIFrame(e, frame);
            });              
            onFrameLoaded(newdoc);
          });
        }
        /*
        // recursive traversal?
        smtRec.trackIFrames(doc.document);
        aux.allowTrackingOnFlashObjects(doc.document);
        */
      }
    },
    /** 
     * Not implemented, as it's not really needed (too much intrusion into user's privacy).
     */
    keyHandler: function(e) {
    },
    
    adjustPageSections: function()
    {
    	jQuery_1_10_2.each(smtRec.pageSections, function(index){
    		var sectionId = smtRec.pageSections[index].sectionId;
    		var nextSectionId = smtRec.pageSections[index].nextSectionId;
    		if("wpi_page_section_00" == sectionId){
        		var nextSelector = "img#wpipagesection-"+nextSectionId;
        		smtRec.pageSections[index].top = 0;
        		smtRec.pageSections[index].bottom = Math.round(jQuery_1_10_2(nextSelector).offset().top);
    		}else if("wpi_page_section_999" == nextSectionId) {
    			var selector = "img#wpipagesection-"+sectionId;
        		smtRec.pageSections[index].top = Math.round(jQuery_1_10_2(selector).offset().top);
        		smtRec.pageSections[index].bottom = (jQuery_1_10_2(document).height() < jQuery_1_10_2(window).height()) ? Math.round(jQuery_1_10_2(window).height()) : Math.round(jQuery_1_10_2(document).height());
    		}else {
    			var selector = "img#wpipagesection-"+sectionId;
        		var nextSelector = "img#wpipagesection-"+nextSectionId;
        		smtRec.pageSections[index].top = Math.round(jQuery_1_10_2(selector).offset().top);
        		smtRec.pageSections[index].bottom = Math.round(jQuery_1_10_2(nextSelector).offset().top);
    		}
    		
    	});
    },
    
    initPageSections: function()
    {
    	var pageSectionSeparators = jQuery_1_10_2("img.wpipagesection");
    	if(pageSectionSeparators.length > 0) {
    		var pageSection = {
    		   	 			sectionId : "wpi_page_section_00",
    		   				sectionName : "Page Start",
    		   				order : 0,
    		   				top : 0,
    		   				bottom : Math.round(jQuery_1_10_2(pageSectionSeparators.get(0)).offset().top),
    		   				prevSectionId: "",
    		   				prevSectionName: "",
    		   				nextSectionId: jQuery_1_10_2(pageSectionSeparators.get(0)).data("psid"),
    		   				nextSectionName: jQuery_1_10_2(pageSectionSeparators.get(0)).data("psname"),
    		   				viewed: false,
    		   				entryTimes: [],
    		   				exitTimes: [],
    		   				focusedEntryTimes: [],
    		   				focusedExitTimes: [],
    		   				totalTime: 0,
    		   				totalFocusedTime: 0,
    		   				lostFocusCount: 0,
    		   				currentPageSection: 0
    		   	 	};

    		   		smtRec.pageSections.push(pageSection);
    		   	
    		   		pageSectionSeparators.each(function(index) {
    		   			pageSection = {
    		   			 		sectionId : jQuery_1_10_2(pageSectionSeparators.get(index)).data("psid"),
    		   					sectionName : jQuery_1_10_2(pageSectionSeparators.get(index)).data("psname"),
    		   					order : index+1,
    		   					top : Math.round(jQuery_1_10_2(pageSectionSeparators.get(index)).offset().top),
    		   					bottom : "",
    		   					prevSectionId: "",
    		   					prevSectionName: "",
    		   					nextSectionId: "",
    		   					nextSectionName: "",
    		   					viewed: false,
    		   					entryTimes: [],
    		   					exitTimes: [],
    		   					focusedEntryTimes: [],
    		   					focusedExitTimes: [],
    		   					totalTime: 0,
    		   					totalFocusedTime: 0,
    		   					lostFocusCount: 0,
    		   					currentPageSection: 0
    		   			 	};				  							
    		   	
    		   			if(index>0) {
    		   				pageSection.prevSectionId = jQuery_1_10_2(pageSectionSeparators.get(index - 1)).data("psid");
    		   				pageSection.prevSectionName = jQuery_1_10_2(pageSectionSeparators.get(index - 1)).data("psname");
    		   			} else {
    		   				pageSection.prevSectionId = "wpi_page_section_00";
    		   				pageSection.prevSectionName = "Page Start";
    		   			}
    		   			
    		   			if (index < pageSectionSeparators.size() - 1) {
    		   				pageSection.bottom = Math.round(jQuery_1_10_2(pageSectionSeparators.get(index+1)).offset().top);
    		   				pageSection.nextSectionId = jQuery_1_10_2(pageSectionSeparators.get(index + 1)).data("psid");
    		   				pageSection.nextSectionName = jQuery_1_10_2(pageSectionSeparators.get(index + 1)).data("psname");
    		   		 	} else {
    		   		 		pageSection.bottom = (jQuery_1_10_2(document).height() < jQuery_1_10_2(window).height()) ? Math.round(jQuery_1_10_2(window).height()) : Math.round(jQuery_1_10_2(document).height());
    		   		 		pageSection.nextSectionId = "wpi_page_section_999";
    		   				pageSection.nextSectionName = "Page End";
    		   		 	}
    		   	
    		   			smtRec.pageSections.push(pageSection);			  								
    		   	            
    		   		});
    		   		smt2fn.log(smtRec.pageSections);
    		   		smtRec.updatePageSections();
    	
    	}
    	
		
    },
    
    /**
     * Finds the first available element with an ID.
     * Traversing count starts from current element to node parents.
     * This function should be registered on mouse move/down events.
     * @return {object}            DOM node element
     * @param {object}   e         DOM event
     * @param {function} callback  response function
     */
    findDOMElement: function(e,callback)
    {
      if (!e) { e = window.event; }
      // find the element
      //var t = e.target || e.srcElement;
      // defeat Safari bug
      //if (t.nodeType == 3) { t = t.parentNode; }
      // if the element has no ID, travese the DOM in reverse (find its parents)
      /*var check = (t.id) ? this.getID(t) : this.getParents(t);
      if (check) {
        callback(check);
      }*/
      callback(this.getMousePositionDetails(e));
    },
    
    getMousePositionDetails: function(event) {
    	var pageX = 0, pageY = 0;
    	if (event.pageX || event.pageY) {
    		pageX = event.pageX;
    		pageY = event.pageY;
    	}	else if (event.clientX || event.clientY) {
    		pageX = event.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
    		pageY = event.clientY + document.body.scrollTop  + document.documentElement.scrollTop;
    	}
    	// in certain situations the mouse coordinates could be negative values (e.g. Opera)
    	if (pageX < 0 || !pageX) pageX = 0;
    	if (pageY < 0 || !pageY) pageY = 0;
    	pageX = Math.round(pageX);
    	//smt2fn.log(pageX);
    	pageY = Math.round(pageY);
    	//smt2fn.log(pageY);
    	var target = event.target || event.srcElement;
    	if (target.nodeType == 3) { target = target.parentNode; }
    	//smt2fn.log(target);
    	var elementX = Math.round(jQuery_1_10_2(target).offset().left);
    	//smt2fn.log(elementX);
    	var elementY = Math.round(jQuery_1_10_2(target).offset().top);
    	//smt2fn.log(elementY);
        var mousePosition = {
            cp: jQuery_1_10_2(target).getcssPath(),//csspath
            t: smtRec.getTime(),
            ft: smtRec.getFocusTime(),
            pX: pageX,//pageX
            pY: pageY,//pageY
            eX: elementX,//eX
            eY: elementY,//eY
            rX: pageX - elementX,//rX
            rY: pageY - elementY,//rY
            w: jQuery_1_10_2(target).width(),//w
            h: jQuery_1_10_2(target).height()//h
        };
        
        //smt2fn.log(jQuery_1_10_2(target).getcssPath());
        //smt2fn.log(jQuery_1_10_2(target).width());
        //smt2fn.log(jQuery_1_10_2(target).height());
        return mousePosition;
    },
    
    /** 
     * System initialization.
     * Assigns events and performs other initialization routines.
     */
    init: function() 
    {
    	//alert("Inside init function");
    	
		// this is the best cross-browser method to store tracking data successfully
	    setTimeout(smtRec.initMouseData, 1000);
	    // compute log session time by date instead of dividing coords length by frame rate
	    smtRec.timestamp = (new Date()).getTime();
	    smtRec.lastBlurTimeStamp = (new Date()).getTime();
	    smtRec.lastFocusTimeStamp = (new Date()).getTime();
      smtRec.computeAvailableSpace();
      smtRec.captureViewPorts();
      // get this location BEFORE making the AJAX request
      smtRec.url = escape(window.location.href);
      // get user-defined recording timeout (if any)
      smtRec.timeout = smtOpt.fps * smtOpt.recTime;
      // set main function: the (smt)2 recording interval
      var interval = Math.round(1000/smtOpt.fps);
      smtRec.rec   = setInterval(smtRec.recMouse, interval);
      var enableHandler = true;
      setInterval(function(){
    	    enableHandler = true;
    	}, 50);
      
      // allow mouse tracking over Flash animations
      aux.allowTrackingOnFlashObjects(document);
      // get mouse coords also on iframes
      //smtRec.trackIFrames(document);
      // reuse these functions for mobile clients
      var onMove = function(e) {
        if (e.touches) { e = e.touches[0] || e.targetTouches[0]; }
        smtRec.getMousePos(e);
        if(enableHandler) {
        	smtRec.findElement(e); // elements hovered
        	enableHandler = false;
        }        
      };
      var onPress = function(e) {
        if (e.touches) { e = e.touches[0] || e.targetTouches[0]; }      
        smtRec.setClick();
        if(enableHandler) {
        	smtRec.findElement(e); // elements clicked
        	enableHandler = false;
        }
      };
      aux.addEvent(document, "mousedown",  onPress);
      aux.addEvent(document, "mousemove",  onMove);
      aux.addEvent(document, "mouseup",    smtRec.releaseClick);      
      aux.addEvent(document, "touchstart", onPress);
      aux.addEvent(document, "touchmove",  onMove);
      aux.addEvent(document, "touchend",   smtRec.releaseClick);
      aux.addEvent(window,   "resize",     smtRec.captureViewPorts);
      //aux.addEvent(document, "keydown",    smtRec.keyHandler);
      //aux.addEvent(document, "keyup",      smtRec.keyHandler);
      // check if recording should persist when current tab/window is not active
      /*if (!smtOpt.contRecording) {
        if (document.attachEvent && !window.opera) {
          // see http://todepoint.com/blog/2008/02/18/windowonblur-strange-behavior-on-browsers/
          aux.addEvent(document.body, "focusout", smtRec.pauseRecording);
          aux.addEvent(document.body, "focusin",  smtRec.resumeRecording);
        } else {
          aux.addEvent(window, "blur",  smtRec.pauseRecording);
          aux.addEvent(window, "focus", smtRec.resumeRecording);
        }
      }*/
      smtRec.initPageSections();
      smtRec.currentScrollTop = jQuery_1_10_2(window).scrollTop();
	  smtRec.currentScrollLeft = jQuery_1_10_2(window).scrollLeft();
      jQuery_1_10_2(window).load(function() {
    	  smtRec.adjustPageSections();
      });
      
      jQuery_1_10_2(window).focus(function() {
    		var thisFocusTimeStamp = new Date();
    		smtRec.inFocus = true;
    		smt2fn.log("On Focus Timestamp: " + +thisFocusTimeStamp);
    		smt2fn.log("Previous Blur Time: " + smtRec.blurTime);
    		//To avoid the effect of double fires on focus event in chrome
    		var thisFocusDifference = thisFocusTimeStamp - smtRec.lastFocusTimeStamp;
    		smt2fn.log("thisFocusDifference: " + thisFocusDifference);
    		if(thisFocusDifference > 100) {
    			smt2fn.log("Will Add to blur time");
    			smt2fn.log("This time window was blurred for: " + (new Date() - smtRec.lastBlurTimeStamp));
    			smtRec.blurTime += (new Date() - smtRec.lastBlurTimeStamp);
    		}    
    		smt2fn.log("After Blur Time: " + smtRec.blurTime);
    	    smtRec.lastFocusTimeStamp = new Date();
    	});

      jQuery_1_10_2(window).blur(function() {    		
    		smtRec.lastBlurTimeStamp = +new Date();
    		smtRec.inFocus = false;
    		smtRec.lostFocusCount += 1;
    		smtRec.elem.lostFocus.push(smtRec.elem.hovered[smtRec.elem.hovered.length - 1]);
    		var currentPageSectionIndex = smtRec.find_in_array(smtRec.pageSections,"sectionName",smtRec.currentPageSection);
    		if(currentPageSectionIndex != false) {
    			smtRec.pageSections[currentPageSectionIndex].lostFocusCount += 1;
    		}	
    		
    		smt2fn.log("On Blur Timestamp: " + smtRec.lastBlurTimeStamp);
    	});
      
      
	  jQuery_1_10_2(window).scroll(function() {
		  smtRec.recordScrolls("scrollStart");		
		});
	  
	  jQuery_1_10_2(window).scrollStopped(500,function(){
		  smtRec.recordScrolls("scrollStop",500/1000);
		  if(smtRec.pageSections.length>0) {
			  smtRec.updatePageSections();
		  } 
		});
      
      
    	
      
      /*
      // flush mouse data when tracking ends
      if (typeof window.onbeforeunload == 'function') {
        // user closes the browser window
    	  alert("onbeforeunload function is available");
        aux.addEvent(window, "onbeforeunload", smtRec.appendMouseData);
      } else if (typeof window.beforeunload == 'function') {
        // page is unloaded (for old browsers)
    	  alert("beforeunload function is available");
        aux.addEvent(window, "beforeunload", smtRec.appendMouseData);
      } else if (typeof window.unload == 'function'){
        // page is unloaded (for old browsers)
    	  alert("unload function is available");
        aux.addEvent(window, "unload", smtRec.appendMouseData);
      }
      */
      jQuery_1_10_2(window).bind("beforeunload", smtRec.appendExitMouseData);
      //window.onbeforeunload = smtRec.appendExitMouseData;
      //window.onbeforeunload = smtRec.appendMouseData;
      //window.unload = smtRec.appendMouseData;
      
      //alert("After init");
    }
  };
  
  // do not overwrite the smt2 namespace
  if (typeof window.smt2 !== 'undefined') { throw("smt2 namespace conflict"); }
  // else expose record method
  window.smt2 = {
    // to begin recording, the tracking script must be called explicitly
    record: function(opts) {
    	//alert("inside smt2 record function");
      // load custom recording options, if any
      if (typeof opts !== 'undefined') { aux.overrideTrackingOptions(smtOpt, opts); }
      // does user browse for the first time?
      var previousUser = aux.cookies.checkCookie('smt-ftu');
      // do not skip first time users when current visit is not sampled
      if (smtOpt.disabled && previousUser) { return; }
      // store int numbers, not booleans (since it's casted to string for cookie storage)
      smtRec.ftu = (!previousUser | 0); // yes, it's a bitwise operation
      aux.cookies.setCookie('smt-ftu', smtRec.ftu, smtOpt.cookieDays);
      // check if warning is enabled
      if (smtOpt.warn) {
        // did she agree for tracking before?
        var prevAgreed = aux.cookies.checkCookie('smt-agreed');
        // if user is adviced, she must agree
        var agree = (prevAgreed) ? aux.cookies.getCookie('smt-agreed') : window.confirm(smtOpt.warnText);
        if (agree) {
          aux.cookies.setCookie('smt-agreed', 1, smtOpt.cookieDays);
        } else {
          // will ask next day (instead of smtOpt.cookieDays value)
          aux.cookies.setCookie('smt-agreed', 0, 1);
          return false;
        }
      }
      // try to auto-detect smt2 path to tracking scripts                   
      /*var scripts = document.getElementsByTagName('script');
      for (var i = 0, s = scripts.length; i < s; ++i) {
        var filename = scripts[i].src;
        if (/smt-record/i.test(filename)) {
          var paths = filename.split("/");
          var pos = aux.array.indexOf(paths, "smt2");
          if (pos && smtOpt.trackingServer === null) {
            smtOpt.trackingServer = paths.slice(0, pos + 1).join("/");
          }
        }
      }*/
      //alert("Before smt2 init");
      // start recording when DOM is loaded
      //aux.onDOMload(smtRec.init);
      smtRec.init();
    } // end record
  }; // end expose
  
})();
