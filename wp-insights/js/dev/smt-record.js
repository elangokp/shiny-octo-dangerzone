(function(){
  /** 
   * WP Insights default recording options.
   * This Object can be overriden when calling the smt2.record method.
   */
  var wpiOpt = {
    /**
     * URL to local (smt)2 website, i.e., the site URL to track (with the smt*.js files).
     * The record script will try to find automatically the URL, but if you used other name (i.e: http://my.server/test) 
     * you must type it explicitly here.      
     * Valid path names that will be recognized automatically are those having the string "smt2",
     * e.g: "http://domain.name/smt2/", "/my/smt2dir/", "/server/t/tracksmt2/" ... and so on.
     * @type string
     */
    trackingUrl: "",
    /**
     * URL to remote (smt)2 server, i.e., the site URL where the logs will be stored, and (of course) the CMS is installed.
     * If this value is empty, data will be posted to trackingServer URL.
     * @type string
     */
    storageServer: "",
    /**
     * Cookies lifetime (in days) to reset both first time users and agreed-to-track visitors.
     * @type int     
     */
    cookieDays: 365,
    postInterval: 10,
    recordingId: 0
  };
    
  /** 
   * Wp Insights recording object.
   * This Object is private. Methods are cited but not documented.
   */
  var wpiRec = {
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
    lastScrollsLength: 0,
    lastViewPortsLenght: 0,
    
    /**
     * Cookies management object.
     * This cookies object allows you to store and retrieve cookies easily.
     * Cookies can be picked up by any other web pages in the correct domain.
     * Cookies are set to expire after a certain length of time.
     */
    cookies: {
      /**
       * Stores a cookie variable.
       * @return void
       * @param {string} name
       * @param {mixed}  value
       * @param {string} expiredays (optional) default: no expire
       * @param {string} domainpath (optional) default: root domain
       */
      setCookie: function(name,value,expiredays,domainpath)
      {
        var path = domainpath || "/";
        var expires = "";
        if (expiredays) {
          var date = new Date();
          date.setTime(date.getTime() + (expiredays*24*60*60*1000)); // ms
          expires = "; expires=" + date.toGMTString();
        }
        document.cookie = name +"="+ escape(value) + expires +"; path=" + path;
      },
      /**
       * Retrieves a cookie variable.
       * @return {string}       cookie value, or false on failure
       * @param {string} name   cookie name
       */
      getCookie: function(name)
      {
        var cStart,cEnd;
        if (document.cookie.length > 0) {
          cStart = document.cookie.indexOf(name+"=");
          if (cStart != -1) {
            cStart = cStart + name.length + 1;
            cEnd   = document.cookie.indexOf(";", cStart);
            if (cEnd == -1) {
              cEnd = document.cookie.length;
            }

            return unescape(document.cookie.substring(cStart, cEnd));
          }
        }
        return false;
      },
      /**
       * Checks if a cookie exists.
       * @return {boolean}       true on success, or false on failure
       * @param {string}  name   cookie name
       */
      checkCookie: function(name)
      {
        var c = this.getCookie(name);
        return (c);
      },
      /**
       * Deletes a cookie.
       * @param {string}  name   cookie name
       */
      deleteCookie: function(name)
      {
        if (this.checkCookie(name)) {
          this.setCookie(name, null, -1);
        }
      }
    },
    
    /**
     * Overrides (smt) tracking options object with custom-provided options object
     * @return void
     * @param {object} smtOptionsObj
     * @param {object} customOptionsObj
     * @see <code>smtOpt</code> object either in <code>smtRecord</code> or <code>smtReplay</code> classes
     */
    overrideTrackingOptions: function(smtOptionsObj, customOptionsObj)
    {
      for (var prop in smtOptionsObj)
      {
        if (customOptionsObj.hasOwnProperty(prop) && customOptionsObj[prop] !== null) {
          smtOptionsObj[prop] = customOptionsObj[prop];
        }
      }
    },
    
    /**
     * Traces any kind of objects in the debug console (if available).
     * @return void
     */
    log: function()
    {
      // check if console is available
      if (window.console && window.console.log) { 
      	console.log(arguments);
      } else {
      	return false;
      }
      
      // display messages in the console
      
    },
    
    find_in_array: function(arr, name, value) {
        for (var i = 0, len = arr.length; i<len; i++) {
            if (name in arr[i] && arr[i][name] == value) return i;
        };
        return false;
    },
    
    captureViewPorts: function()
    {
    	var viewPort = {
    			w: wpi_jquery(window).width(),
    			h: wpi_jquery(window).height(),
    			t: wpiRec.getTime()
    	}
    	wpiRec.viewPorts.push(viewPort);
    },
    
    recordScrolls: function(eventType,scrollStopDelay)
    {
    	var scrollTop = wpi_jquery(window).scrollTop();	
    	
    	var scrollLeft = wpi_jquery(window).scrollLeft();
    	
    	if(eventType === "scrollStart" && wpiRec.scrollStopped){
    		wpiRec.log("scrollStart");
    		wpiRec.scrollStopped = false;
    		wpiRec.log("scrollTop : " + wpiRec.currentScrollTop);
    		wpiRec.log("scrollLeft : " + wpiRec.currentScrollLeft);
    		var scroll = {
 	                     startTop: wpiRec.currentScrollTop,
 	                     startLeft: wpiRec.currentScrollLeft,
 	                     startTime: wpiRec.getTime(),
 	                     endTop: null,
 	                     endLeft: null,
					     endTime: null,
 	                 };
    		wpiRec.scrolls.push(scroll);
    		wpiRec.log(wpiRec.scrolls);
    	} else if(eventType === "scrollStop" && !wpiRec.scrollStopped) {
    		wpiRec.log("scrollStop");
    		scrollStopDelay = (scrollStopDelay === undefined) ? 0 : scrollStopDelay;
    		wpiRec.currentScrollTop = wpi_jquery(window).scrollTop();
    		wpiRec.currentScrollLeft = wpi_jquery(window).scrollLeft();
    		wpiRec.log("scrollTop : " + wpiRec.currentScrollTop);
    		wpiRec.log("scrollLeft : " + wpiRec.currentScrollLeft);
    		if(wpiRec.scrolls.length > 0){
    			wpiRec.log("scrolls length greater than 0");
    			wpiRec.scrolls[wpiRec.scrolls.length-1].endTop = wpiRec.currentScrollTop;
        		wpiRec.scrolls[wpiRec.scrolls.length-1].endLeft = wpiRec.currentScrollLeft;
        		wpiRec.scrolls[wpiRec.scrolls.length-1].endTime = wpiRec.getTime()-scrollStopDelay;
    		} 
    		wpiRec.log(wpiRec.scrolls);
    		wpiRec.scrollStopped = true;
    		
    	}    	
    },
    
    
    updatePageSections: function()
    {
    	var scrollTop = wpi_jquery(window).scrollTop();
		var center = scrollTop + ((wpi_jquery(window).height())/2);
		wpiRec.log("updatePageSections");
		wpi_jquery.each(wpiRec.pageSections, function(index){
			var sectionTop = wpiRec.pageSections[index].top;
			var sectionBottom = wpiRec.pageSections[index].bottom;
			if(sectionTop<center && sectionBottom>center) {
				var pageSectionDetected = wpiRec.pageSections[index].sectionName;
				if(pageSectionDetected != wpiRec.currentPageSection) {
					wpiRec.lastPageSection = wpiRec.currentPageSection;
					wpiRec.currentPageSection = pageSectionDetected;
					wpiRec.pageSections[index].currentPageSection = 1;
					wpiRec.pageSections[index].viewed = "true";
					wpiRec.pageSections[index].entryTimes.push(wpiRec.getTime());
					wpiRec.pageSections[index].focusedEntryTimes.push(wpiRec.getFocusTime());
					if(wpiRec.lastPageSection !== "") {
						var lastPageSectionIndex = wpiRec.find_in_array(wpiRec.pageSections,"sectionName",wpiRec.lastPageSection);
						
						wpiRec.pageSections[lastPageSectionIndex].exitTimes.push(wpiRec.getTime());
						wpiRec.pageSections[lastPageSectionIndex].focusedExitTimes.push(wpiRec.getFocusTime());
						wpiRec.pageSections[lastPageSectionIndex].currentPageSection = 0;
						var LPSEntryTimesLastIndex = wpiRec.pageSections[lastPageSectionIndex].entryTimes.length - 1;
						var LPSExitTimesLastIndex = wpiRec.pageSections[lastPageSectionIndex].exitTimes.length - 1;
						
						var LPSLastEntryTime = wpiRec.pageSections[lastPageSectionIndex].entryTimes[LPSEntryTimesLastIndex];
						var LPSLastExitTime = wpiRec.pageSections[lastPageSectionIndex].exitTimes[LPSExitTimesLastIndex];
						
						wpiRec.pageSections[lastPageSectionIndex].totalTime = wpiRec.pageSections[lastPageSectionIndex].totalTime + (LPSLastExitTime - LPSLastEntryTime);
						
						var LPSFocusedEntryTimesLastIndex = wpiRec.pageSections[lastPageSectionIndex].focusedEntryTimes.length - 1;
						var LPSFocusedExitTimesLastIndex = wpiRec.pageSections[lastPageSectionIndex].focusedExitTimes.length - 1;
						
						var LPSLastFocusedEntryTime = wpiRec.pageSections[lastPageSectionIndex].focusedEntryTimes[LPSFocusedEntryTimesLastIndex];
						var LPSLastFocusedExitTime = wpiRec.pageSections[lastPageSectionIndex].focusedExitTimes[LPSFocusedExitTimesLastIndex];
						
						wpiRec.pageSections[lastPageSectionIndex].totalFocusedTime = wpiRec.pageSections[lastPageSectionIndex].totalFocusedTime + (LPSLastFocusedExitTime - LPSLastFocusedEntryTime);
					}
					
				}
				return false;
			}
		});
		//alert("currentPageSection is " +wpiRec.currentPageSection+ " lastPageSection is " + wpiRec.lastPageSection);
    },
    
    
    /** 
     * Sends data in background via an XHR object (asynchronous request).
     * This function starts the tracking session.
     */   
    /*initMouseData: function() 
    {
      wpiRec.computeAvailableSpace();
      wpiRec.log("Inside init mouse data");
      wpiRec.log("Window Height : " + wpi_jquery(window).height());
      wpiRec.log("Window Width : " + wpi_jquery(window).width());
      wpiRec.log("Doc Height : " + wpi_jquery(document).height());
      wpiRec.log("Doc Width : " + wpi_jquery(document).width());
      
      // prepare data
      var requestData  = "url="        + wpiRec.url;
      requestData += "&urltitle="  + document.title;
      requestData += "&cookies="   + document.cookie;
      requestData += "&screenw="   + screen.width;
      requestData += "&screenh="   + screen.height;
      requestData += "&pagew="     + wpiRec.page.width;
      requestData += "&pageh="     + wpiRec.page.height;
      requestData += "&vp="        + encodeURIComponent(JSON.stringify(wpiRec.viewPorts));
      requestData += "&time="      + wpiRec.getTime();
      requestData += "&fps="       + wpiOpt.fps;
      //requestData += "&xcoords="   + wpiRec.coords.x;
      //requestData += "&ycoords="   + wpiRec.coords.y;
      //requestData += "&clicks="    + wpiRec.coords.p;
      //requestData += "&elhovered=" + encodeURIComponent(JSON.stringify(wpiRec.elem.hovered));
      //requestData += "&elclicked=" + encodeURIComponent(JSON.stringify(wpiRec.elem.clicked));
      //requestData += "&ellostfocus=" + encodeURIComponent(JSON.stringify(wpiRec.elem.lostFocus));
      requestData += "&lostFocusCount=" + wpiRec.lostFocusCount;
      requestData += "&focusedTime=" + wpiRec.getFocusTime();
      requestData += "&scrollPercentage=" + wpiRec.scrollPercentage;
      requestData += "&action="    + "wpistore";
      requestData += "&remote="    + wpiOpt.storageServer;
      
      var gatewayUrl = wpiOpt.trackingUrl;
      
      wpi_jquery.ajax({
  		  type: "GET",
  		  url:  gatewayUrl,
  		  data: requestData,
  		  success: function(data) {
  			  wpiRec.setUserId(data);
  		  }
		});
      
      // clean
      //wpiRec.clearMouseData();
    },*/
    /**
     * Sets the user ID.
     * @return void
     * @param {string} response  XHR response text
     */
    /*setUserId: function(response) 
    {
      wpiRec.userId = parseInt(response);
      if (wpiRec.userId > 0) {
    	  //setTimeout(wpiRec.cacheUserPage, 10);
    	  setTimeout(function() { wpiRec.appendMouseData('cache'); }, 10);
          // once the session started, append mouse data
          wpiRec.append = setInterval(wpiRec.appendMouseData, wpiOpt.postInterval*1000);
      }      
    },*/
    
    /** Send a request to server to cache the page. */
    /*cacheUserPage: function()
	{
    	var requestData  = "uid="    + wpiRec.userId;
		requestData += "&action="    + "wpicachepage";
		//requestData += "&url="       + wpiRec.url;
		//requestData += "&urltitle="  + document.title;
		//requestData += "&cookies="   + document.cookie;
		requestData += "&html="      + wpiRec.getDocumentHtml();
		requestData += "&remote="    + wpiOpt.storageServer;
		
	    // send request
	    var gatewayUrl = wpiOpt.trackingUrl;
	    
	    if ('XDomainRequest' in window && window.XDomainRequest !== null) {
    	    // Use Microsoft XDR
    	    var xdr = new XDomainRequest();
    	    xdr.open("post", gatewayUrl+"?action=wpicachepage&isXDR=true&_="+(new Date()).getTime());
    	    xdr.onload = function () {};
    	    xdr.onprogress = function(){};
    	    xdr.ontimeout = function(){};
    	    xdr.onerror = function(){};
    	    setTimeout(function(){
    	        xdr.send(requestData);
    	    }, 0);
    	} else {
    		wpi_jquery.ajax({
      		  type: "POST",
      		  url:  gatewayUrl+"?action=wpicachepage&_="+(new Date()).getTime(),
      		  cache: false,
      		  data: requestData
    		});
    	}
	},*/
	
	getDocumentHtml: function() {
        for (var dt = window.document.doctype, de = window.document.documentElement, dt = (dt && null != dt ? "<!DOCTYPE " + dt.name + ("" != dt.publicId ? ' PUBLIC "' + dt.publicId + '" "' + dt.systemId + '"' : "") + ">\n" : "<!DOCTYPE html>\n") + "<html", attrId = 0; attrId < de.attributes.length; attrId++) 
        	var h = de.attributes[attrId],  dt = dt + ("null" != h.value && "" != h.value ? " " + h.name + '="' + h.value + '"' : "");
        return encodeURIComponent(dt += ">" + wpi_jquery(de).html() + "</html>");
    },
	
    /** Gets current time (in seconds). */
    getTime: function()
    {
      var ms = (new Date()).getTime() - wpiRec.timestamp;
      
      return ms/1000; // use seconds
    },
    
    /** Gets current focused time (in seconds). */
    getFocusTime: function()
    {
      var ms = 0;
      if(document.hasFocus()) {
    	  ms = ((new Date()).getTime() - wpiRec.timestamp) - wpiRec.blurTime; 
    	  wpiRec.log("Document Has Focus : " + ms/1000);
      } else {
    	  wpiRec.log("Document Doesnt have Focus : lastBlurTimeStamp : " + wpiRec.lastBlurTimeStamp);
    	  wpiRec.log("Document Doesnt have Focus : blurTime : " + wpiRec.blurTime);
    	  wpiRec.log("Document Doesnt have Focus : time till last blur : " + (wpiRec.lastBlurTimeStamp - wpiRec.timestamp));
    	  ms = (wpiRec.lastBlurTimeStamp - wpiRec.timestamp) - wpiRec.blurTime;
    	  wpiRec.log("Document Doesnt have Focus : " + ms/1000);
      }
      return ms/1000; // use seconds
    },
    
    getScrollPercentage: function()
    {
    	var win = wpi_jquery(window);
        
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
    appendMouseData: function(type) 
    {
      //if (!wpiRec.rec || wpiRec.paused) { return false; }
      // prepare data
      if (window.location.search.indexOf('nowpipause=yes') < 0) {
    	  if((type !== "cache") 
        		  && wpiRec.elem.hovered.length === 0 
        		  && wpiRec.elem.clicked.length === 0
        		  && wpiRec.elem.lostFocus.length === 0 
        		  && wpiRec.scrolls.length === wpiRec.lastScrollsLength 
        		  && wpiRec.viewPorts.length === wpiRec.lastViewPortsLength) {
        	  return false;
          }
      }
      
      $action = "wpiappend";
      if(type === "exit") {
    	  $action = "wpiexit";
      }      
      
     
      var requestData  = "rid="        + wpiOpt.recordingId;
	      requestData += "&time="      + wpiRec.getTime();
	      //requestData += "&pagew="     + wpiRec.page.width;
	      //requestData += "&pageh="     + wpiRec.page.height;
	      //requestData += "&xcoords="   + wpiRec.coords.x;
	      //requestData += "&ycoords="   + wpiRec.coords.y;
	      //requestData += "&clicks="    + wpiRec.coords.p;
	      requestData += "&elhovered=" + encodeURIComponent(JSON.stringify(wpiRec.elem.hovered));
	      requestData += "&elclicked=" + encodeURIComponent(JSON.stringify(wpiRec.elem.clicked));
	      requestData += "&ellostfocus=" + encodeURIComponent(JSON.stringify(wpiRec.elem.lostFocus));
	      requestData += "&scrolls=" + encodeURIComponent(JSON.stringify(wpiRec.scrolls));
	      requestData += "&vp="        + encodeURIComponent(JSON.stringify(wpiRec.viewPorts));
	      requestData += "&lostFocusCount=" + wpiRec.lostFocusCount;
	      requestData += "&focusedTime=" + wpiRec.getFocusTime();
	      requestData += "&scrollPercentage=" + wpiRec.scrollPercentage;
	      requestData += "&pageSections=" + encodeURIComponent(JSON.stringify(wpiRec.pageSections));
	      requestData += "&currentPageSection=" + wpiRec.currentPageSection;
          requestData += "&action="    + $action;
          requestData += "&remote="    + wpiOpt.storageServer;
          
       if(type === "cache") {
		   		/*requestData += "&url="       + wpiRec.url;
		   		requestData += "&urltitle="  + document.title;
		   		requestData += "&cookies="   + document.cookie;*/
		   		requestData += "&html="      + wpiRec.getDocumentHtml();
       }
          
      wpiRec.lastScrollsLength = wpiRec.scrolls.length;
      wpiRec.lastViewPortsLength = wpiRec.viewPorts.length;
      
      //wpiRec.log("Inside append mouse data");
      console.log("Inside "+$action+" append mouse data");
      // send request
      var gatewayUrl = wpiOpt.trackingUrl;
      if ('XDomainRequest' in window && window.XDomainRequest !== null) {
  	    // Use Microsoft XDR
    	wpiRec.log('XDomainRequest');
  	    var xdr = new XDomainRequest();
  	    xdr.open("post", gatewayUrl+"?action="+$action+"&isXDR=true&_="+(new Date()).getTime());
  	    xdr.onload = function () {};
  	    xdr.onprogress = function(){};
  	    xdr.ontimeout = function(){};
  	    xdr.onerror = function(){};
  	    setTimeout(function(){
  	        xdr.send(requestData);
  	    }, 0);
	} else {
		wpi_jquery.ajax({
			  type: "POST",
			  url:  gatewayUrl+"?action="+$action+"&_="+(new Date()).getTime(),
			  cache: false,
			  data: requestData
		});
	}
      /*
      wpi_jquery.ajax({
		  type: "POST",
		  url:  gatewayUrl,
		  data: requestData
	});*/
      // clean
      wpiRec.clearMouseData();
    },
    
    /** 
     * Clears mouse data from queue.        
     */
    clearMouseData: function()
    {
      wpiRec.coords.x = [];
      wpiRec.coords.y = [];
      wpiRec.coords.p = [];
      wpiRec.elem.hovered = [];
      wpiRec.elem.clicked = [];
      wpiRec.elem.lostFocus = [];
    },
    /** 
     * Computes page size.
     */
    computeAvailableSpace: function()
    {
      wpiRec.page.width  = (wpi_jquery(window).width() > wpi_jquery(document).width()) ? wpi_jquery(window).width() : wpi_jquery(document).width();;
      wpiRec.page.height = (wpi_jquery(window).height() > wpi_jquery(document).height()) ? wpi_jquery(window).height() : wpi_jquery(document).height();;
    },
    
    adjustPageSections: function()
    {
    	wpi_jquery.each(wpiRec.pageSections, function(index){
    		var sectionId = wpiRec.pageSections[index].sectionId;
    		var nextSectionId = wpiRec.pageSections[index].nextSectionId;
    		if("wpi_page_section_00" == sectionId){
        		var nextSelector = "img#wpipagesection-"+nextSectionId;
        		wpiRec.pageSections[index].top = 0;
        		wpiRec.pageSections[index].bottom = Math.round(wpi_jquery(nextSelector).offset().top);
    		}else if("wpi_page_section_999" == nextSectionId) {
    			var selector = "img#wpipagesection-"+sectionId;
        		wpiRec.pageSections[index].top = Math.round(wpi_jquery(selector).offset().top);
        		wpiRec.pageSections[index].bottom = (wpi_jquery(document).height() < wpi_jquery(window).height()) ? Math.round(wpi_jquery(window).height()) : Math.round(wpi_jquery(document).height());
    		}else {
    			var selector = "img#wpipagesection-"+sectionId;
        		var nextSelector = "img#wpipagesection-"+nextSectionId;
        		wpiRec.pageSections[index].top = Math.round(wpi_jquery(selector).offset().top);
        		wpiRec.pageSections[index].bottom = Math.round(wpi_jquery(nextSelector).offset().top);
    		}
    		
    	});
    },
    
    initPageSections: function()
    {
    	var pageSectionSeparators = wpi_jquery("img.wpipagesection");
    	if(pageSectionSeparators.length > 0) {
    		var pageSection = {
    		   	 			sectionId : "wpi_page_section_00",
    		   				sectionName : "Page Start",
    		   				order : 0,
    		   				top : 0,
    		   				bottom : Math.round(wpi_jquery(pageSectionSeparators.get(0)).offset().top),
    		   				prevSectionId: "",
    		   				prevSectionName: "",
    		   				nextSectionId: wpi_jquery(pageSectionSeparators.get(0)).data("psid"),
    		   				nextSectionName: wpi_jquery(pageSectionSeparators.get(0)).data("psname"),
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

    		   		wpiRec.pageSections.push(pageSection);
    		   	
    		   		pageSectionSeparators.each(function(index) {
    		   			pageSection = {
    		   			 		sectionId : wpi_jquery(pageSectionSeparators.get(index)).data("psid"),
    		   					sectionName : wpi_jquery(pageSectionSeparators.get(index)).data("psname"),
    		   					order : index+1,
    		   					top : Math.round(wpi_jquery(pageSectionSeparators.get(index)).offset().top),
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
    		   				pageSection.prevSectionId = wpi_jquery(pageSectionSeparators.get(index - 1)).data("psid");
    		   				pageSection.prevSectionName = wpi_jquery(pageSectionSeparators.get(index - 1)).data("psname");
    		   			} else {
    		   				pageSection.prevSectionId = "wpi_page_section_00";
    		   				pageSection.prevSectionName = "Page Start";
    		   			}
    		   			
    		   			if (index < pageSectionSeparators.size() - 1) {
    		   				pageSection.bottom = Math.round(wpi_jquery(pageSectionSeparators.get(index+1)).offset().top);
    		   				pageSection.nextSectionId = wpi_jquery(pageSectionSeparators.get(index + 1)).data("psid");
    		   				pageSection.nextSectionName = wpi_jquery(pageSectionSeparators.get(index + 1)).data("psname");
    		   		 	} else {
    		   		 		pageSection.bottom = (wpi_jquery(document).height() < wpi_jquery(window).height()) ? Math.round(wpi_jquery(window).height()) : Math.round(wpi_jquery(document).height());
    		   		 		pageSection.nextSectionId = "wpi_page_section_999";
    		   				pageSection.nextSectionName = "Page End";
    		   		 	}
    		   	
    		   			wpiRec.pageSections.push(pageSection);			  								
    		   	            
    		   		});
    		   		wpiRec.log(wpiRec.pageSections);
    		   		wpiRec.updatePageSections();
    	
    	}
    	
		
    },
    
    /** 
     * Finds hovered or clicked DOM element.     
     */
    findElement: function(e)
    {
      if (!e) { e = window.event; }
      if (e.type == "click" || e.type == "touchstart") {
        wpiRec.elem.clicked.push(this.getMousePositionDetails(e));
        //wpiRec.log(JSON.stringify(wpiRec.elem.clicked));
      } else if (e.type == "mousemove" || e.type == "touchmove") {
        wpiRec.elem.hovered.push(this.getMousePositionDetails(e));
        //wpiRec.log(JSON.stringify(wpiRec.elem.hovered));
      }
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
    	//wpiRec.log(pageX);
    	pageY = Math.round(pageY);
    	//wpiRec.log(pageY);
    	var target = event.target || event.srcElement;
    	if (target.nodeType == 3) { target = target.parentNode; }
    	//wpiRec.log(target);
    	var elementX = Math.round(wpi_jquery(target).offset().left);
    	//wpiRec.log(elementX);
    	var elementY = Math.round(wpi_jquery(target).offset().top);
    	//wpiRec.log(elementY);
        var mousePosition = {
            cp: wpi_jquery(target).getcssPath(),//csspath
            t: wpiRec.getTime(),
            ft: wpiRec.getFocusTime(),
            pX: pageX,//pageX
            pY: pageY,//pageY
            eX: elementX,//eX
            eY: elementY,//eY
            rX: pageX - elementX,//rX
            rY: pageY - elementY,//rY
            w: wpi_jquery(target).width(),//w
            h: wpi_jquery(target).height()//h
        };
        
        //wpiRec.log(wpi_jquery(target).getcssPath());
        //wpiRec.log(wpi_jquery(target).width());
        //wpiRec.log(wpi_jquery(target).height());
        return mousePosition;
    },
    
    /** 
     * System initialization.
     * Assigns events and performs other initialization routines.
     */
    init: function() 
    {      
      if(wpiOpt.recordingId>0) {
	    	  wpiRec.timestamp = wpiRec.lastBlurTimeStamp = wpiRec.lastFocusTimeStamp  = (new Date()).getTime();
	  	    wpiRec.computeAvailableSpace();
	  	    wpiRec.captureViewPorts();
	          // get this location BEFORE making the AJAX request
	          wpiRec.url = escape(window.location.href);
	          var enableHandler = true;
	  	    setInterval(function(){
	  	        enableHandler = true;
	  	    }, 50);
	        // reuse these functions for mobile clients
	        var onMove = function(e) {
	          if (e.touches) { e = e.touches[0] || e.targetTouches[0]; }
	          if(enableHandler) {
	          	wpiRec.findElement(e); // elements hovered
	          	enableHandler = false;
	          }        
	        };
	        var onPress = function(e) {
	          if (e.touches) { e = e.touches[0] || e.targetTouches[0]; }      
	          wpiRec.findElement(e); // elements clicked
	        };
	        /*aux.addEvent(document, "mousedown",  onPress);
	        aux.addEvent(document, "mousemove",  onMove);
	        aux.addEvent(document, "mouseup",    wpiRec.releaseClick);      
	        aux.addEvent(document, "touchstart", onPress);
	        aux.addEvent(document, "touchmove",  onMove);
	        aux.addEvent(document, "touchend",   wpiRec.releaseClick);
	        aux.addEvent(window,   "resize",     wpiRec.captureViewPorts);*/
	        
	        wpi_jquery(window).on("click", onPress);
	        wpi_jquery(window).on("mousemove", onMove);
	        wpi_jquery(window).on("touchstart", onPress);
	        wpi_jquery(window).on("touchmove", onMove);
	        //wpi_jquery(window).on("touchend", onPress);
	        wpi_jquery(window).on("resize", wpiRec.captureViewPorts);
	
	        wpiRec.initPageSections();
	        wpiRec.currentScrollTop = wpi_jquery(window).scrollTop();
	  	  wpiRec.currentScrollLeft = wpi_jquery(window).scrollLeft();
	        wpi_jquery(window).load(function() {
	      	  wpiRec.adjustPageSections();
	        });
	        
	        wpi_jquery(window).focus(function() {
	      		var thisFocusTimeStamp = new Date();
	      		wpiRec.inFocus = true;
	      		wpiRec.log("On Focus Timestamp: " + +thisFocusTimeStamp);
	      		wpiRec.log("Previous Blur Time: " + wpiRec.blurTime);
	      		//To avoid the effect of double fires on focus event in chrome
	      		var thisFocusDifference = thisFocusTimeStamp - wpiRec.lastFocusTimeStamp;
	      		wpiRec.log("thisFocusDifference: " + thisFocusDifference);
	      		if(thisFocusDifference > 100) {
	      			wpiRec.log("Will Add to blur time");
	      			wpiRec.log("This time window was blurred for: " + (new Date() - wpiRec.lastBlurTimeStamp));
	      			wpiRec.blurTime += (new Date() - wpiRec.lastBlurTimeStamp);
	      		}    
	      		wpiRec.log("After Blur Time: " + wpiRec.blurTime);
	      	    wpiRec.lastFocusTimeStamp = new Date();
	      	});
	
	        wpi_jquery(window).blur(function() {    		
	      		wpiRec.lastBlurTimeStamp = +new Date();
	      		wpiRec.inFocus = false;
	      		wpiRec.lostFocusCount += 1;
	      		wpiRec.elem.lostFocus.push(wpiRec.elem.hovered[wpiRec.elem.hovered.length - 1]);
	      		var currentPageSectionIndex = wpiRec.find_in_array(wpiRec.pageSections,"sectionName",wpiRec.currentPageSection);
	      		if(currentPageSectionIndex != false) {
	      			wpiRec.pageSections[currentPageSectionIndex].lostFocusCount += 1;
	      		}	
	      		
	      		wpiRec.log("On Blur Timestamp: " + wpiRec.lastBlurTimeStamp);
	      	});
	        
	        
	  	  wpi_jquery(window).scroll(function() {
	  		  wpiRec.recordScrolls("scrollStart");		
	  		});
	  	  
	  	  wpi_jquery(window).scrollStopped(500,function(){
	  		  wpiRec.recordScrolls("scrollStop",500/1000);
	  		  if(wpiRec.pageSections.length>0) {
	  			  wpiRec.updatePageSections();
	  		  } 
	  		});
	      wpi_jquery(window).on("beforeunload", function() { wpiRec.appendMouseData('exit'); });
	      wpi_jquery(window).on("unload", function() { wpiRec.appendMouseData('exit'); })
    	  setTimeout(function() { wpiRec.appendMouseData('cache'); }, 10);
          // once the session started, append mouse data
	      wpiRec.log(wpiOpt.postInterval);
          wpiRec.append = setInterval(wpiRec.appendMouseData, wpiOpt.postInterval*1000);
      }
      
    }
  };
  
  // do not overwrite the smt2 namespace
  if (typeof window.wpi !== 'undefined') { throw("wpi namespace conflict"); }
  // else expose record method
  window.wpi = {
    // to begin recording, the tracking script must be called explicitly
    record: function(opts) {
      // load custom recording options, if any
      if (typeof opts !== 'undefined') { wpiRec.overrideTrackingOptions(wpiOpt, opts); }
      wpiRec.init();
    } // end record
  }; // end expose
  
})();
