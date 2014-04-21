(function(){
  /** 
   * WP Insights default recording options.
   * This Object can be overriden when calling the wpi.record method.
   */
  var wpiOpt = {
    /**
     * URL to local wpi website, i.e., the site URL to track
     * @type string
     */
    trackingUrl: "",
    /**
     * URL to remote wpi server, i.e., the site URL where the logs will be stored, and (of course) the CMS is installed.
     * If this value is empty, data will be posted to trackingServer URL.
     * @type string
     */
    storageServer: "",
    /**
     * Cookies lifetime (in days) to reset both first time users and agreed-to-track visitors.
     * @type int     
     */
    cookieDays: 730,
    postInterval: 30
  };
    
  /** 
   * Wp Insights recording object.
   * This Object is private. Methods are cited but not documented.
   */
  var wpiRec = {
	visitorId: 0,
    recordingId: 0,
    ftu: false,
    i: 0,                                  // step counter
    mouse:     { x:0, y:0 },               // mouse position
    page:      { width:0, height:0 },      // data normalization
    coords:    { x:[], y:[], p:[] },       // position coords and mouse click state (~ pressure)
    elem:      { hovered:[], clicked:[], lostFocus:[] }, // clicked, hovered and lostfocus elements
    scrolls:   [],
    url:       null,                       // document URL
    rec:       null,                       // recording identifier
    userId:    null,                       // user identifier
    sendMouseDataInterval:    null,        // append data identifier
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
    isExitTriggered: false,
    
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
    
    getVisitorId: function()
    {
    	var visitorId = wpiRec.cookies.getCookie('wpi-visitor-id');
    	console.log(visitorId);
    	if(visitorId == undefined || visitorId == false) {
    		wpiRec.ftu = true; 
    		u = [];
            for (i = 0; i < 4; i += 1) {
                u[i] = Math.floor((Math.random() * 10));
            }
            var rand = u.join("");
            visitorId = wpiRec.timestamp+rand;
            wpiRec.cookies.setCookie('wpi-visitor-id',visitorId,wpiOpt.cookieDays);
    	}
    	return visitorId;
    },
    
    generateRecordingId: function()
    {
		u = [];
        for (i = 0; i < 4; i += 1) {
            u[i] = Math.floor((Math.random() * 10));
        }
        var rand = u.join("");
        recordingId = wpiRec.timestamp+rand;
    	return recordingId;
    },
    
    /**
     * Overrides (wpi) tracking options object with custom-provided options object
     * @return void
     * @param {object} wpiOptionsObj
     * @param {object} customOptionsObj
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
    	var viewPort = [];
    	viewPort.push(wpi_jquery(window).width()); // Window Width - index 0
    	viewPort.push(wpi_jquery(window).height()); // Window Height - index 1
    	viewPort.push(wpiRec.getTime()); // viewport change time - index 2
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
    		var scroll = [];
    		scroll.push(wpiRec.currentScrollTop); //StartTop - index 0
    		scroll.push(wpiRec.currentScrollLeft); //StartLeft - index 1
    		scroll.push(wpiRec.getTime()); //StartTime - index 2
    		scroll.push(null); //endTop - index 3
    		scroll.push(null); //endLeft - index 4
    		scroll.push(null); //endTime - index 5
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
    			wpiRec.scrolls[wpiRec.scrolls.length-1][3] = wpiRec.currentScrollTop;
        		wpiRec.scrolls[wpiRec.scrolls.length-1][4] = wpiRec.currentScrollLeft;
        		wpiRec.scrolls[wpiRec.scrolls.length-1][5] = wpiRec.getTime()-scrollStopDelay;
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
    sendMouseData: function(type) 
    {
      if(type === undefined) {
    	  type = "update";
      }
      
      var action = "wpisave";
      var isAsync = true;
      
	  if((type !== "init") 
    		  && wpiRec.elem.hovered.length === 0 
    		  && wpiRec.elem.clicked.length === 0
    		  && wpiRec.elem.lostFocus.length === 0 
    		  && wpiRec.scrolls.length === wpiRec.lastScrollsLength 
    		  && wpiRec.viewPorts.length === wpiRec.lastViewPortsLength
    		  && window.location.search.indexOf('nowpipause=yes') < 0) {
    	  return;
      }
	  
	  var hoveredjson = JSON.stringify(wpiRec.elem.hovered);
	  var clickedjson = JSON.stringify(wpiRec.elem.clicked);
	  var lostfocusjson = JSON.stringify(wpiRec.elem.lostFocus);
	  var scrolls = JSON.stringify(wpiRec.scrolls);
	  var vp = JSON.stringify(wpiRec.viewPorts);
	  
	  if(window.location.search.indexOf('nowpipause=yes') > 0) {
		  console.log("inside nowpipause");
		  hoveredjson = '[["div#content",1.573,1033,301,811,181,1038,217],["div#main",1.626,1031,390,1031,342,1260,690],["div#main",1.728,1030,389,1030,341,1260,690],["div#main",1.782,1025,385,1025,337,1260,690],["div#main",1.827,1005,383,1005,335,1260,690],["div#main",1.881,913,383,913,335,1260,690],["div#main",1.927,771,379,771,331,1260,690],["div#main",1.981,682,370,682,322,1260,690],["div#main",2.037,610,354,610,306,1260,690],["div#main",2.089,586,353,586,305,1260,690],["article#post-1>div.entry-content>p",2.584,584,260,80,43,474,48],["div#primary-sidebar",5.562,179,342,149,258,162,606],["div#primary-sidebar",5.569,188,339,158,255,162,606],["div#content",5.623,276,309,54,189,1038,217],["article#post-1",5.677,467,238,245,118,1038,169],["article#post-1>div.entry-content>p",5.723,526,218,22,1,474,48],["article#post-1>div.entry-content",5.786,527,216,53,11,474,72],["article#post-1>div.entry-content",5.917,527,215,53,10,474,72],["article#post-1>div.entry-content",6.041,526,216,52,11,474,72],["article#post-1>div.entry-content>p",6.081,520,219,16,2,474,48],["article#post-1>div.entry-content>p",6.135,504,224,0,7,474,48],["article#post-1>div.entry-content",6.523,497,226,23,21,474,72],["article#post-1>div.entry-content>p",6.577,528,247,24,30,474,48],["article#post-1>div.entry-content>p",6.625,535,250,31,33,474,48],["article#post-1>div.entry-content>p",6.764,537,251,33,34,474,48],["article#post-1>div.entry-content>p",6.787,538,250,34,33,474,48],["article#post-1>div.entry-content>p",6.833,543,245,39,28,474,48],["div#main",6.915,545,343,545,295,1260,690],["div#main",6.971,545,443,545,395,1260,690],["div#main",7.073,546,543,546,495,1260,690],["div#main",7.089,547,540,547,492,1260,690],["div#main",7.223,548,539,548,491,1260,690],["div#main",7.255,548,641,548,593,1260,690],["div#main",7.299,546,643,546,595,1260,690],["div#main",7.347,536,658,536,610,1260,690],["footer#colophon>div.site-info",7.401,528,762,528,24,1200,18],["footer#colophon>div.site-info",7.447,516,767,516,29,1200,18],["footer#colophon>div.site-info",7.501,484,774,484,36,1200,18],["footer#colophon>div.site-info",7.547,460,777,460,39,1200,18],["footer#colophon>div.site-info",7.603,445,777,445,39,1200,18],["footer#colophon>div.site-info",7.649,415,779,415,41,1200,18],["footer#colophon>div.site-info",7.703,373,779,373,41,1200,18],["footer#colophon>div.site-info",7.758,348,783,348,45,1200,18],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",7.809,315,897,315,849,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",7.859,289,928,289,880,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",7.905,281,928,281,880,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",7.959,262,927,262,879,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.013,230,927,230,879,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.062,211,927,211,879,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.115,191,924,191,876,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.161,166,919,166,871,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.215,137,911,137,863,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.263,107,901,107,853,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.317,87,889,87,841,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.363,66,876,66,828,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.417,49,864,49,816,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.472,31,852,31,804,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.52,22,839,22,791,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.573,24,818,24,770,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.62,29,803,29,755,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",8.673,43,786,43,738,1349,918],["footer#colophon>div.site-info",8.721,49,779,49,41,1200,18],["footer#colophon>div.site-info",8.775,54,773,54,35,1200,18],["footer#colophon>div.site-info",8.838,54,772,54,34,1200,18],["footer#colophon>div.site-info",8.884,57,770,57,32,1200,18],["footer#colophon>div.site-info>a",8.927,59,768,29,14,167,15],["footer#colophon>div.site-info>a",8.977,66,764,36,10,167,15],["footer#colophon>div.site-info>a",9.031,75,761,45,7,167,15],["footer#colophon>div.site-info>a",9.085,81,759,51,5,167,15],["footer#colophon>div.site-info>a",9.139,88,758,58,4,167,15],["footer#colophon>div.site-info>a",9.185,91,758,61,4,167,15],["footer#colophon>div.site-info>a",9.241,93,754,63,0,167,15],["footer#colophon>div.site-info",9.287,88,744,88,6,1200,18],["div#secondary",9.333,75,729,75,681,162,690],["div#secondary",9.387,56,705,56,657,162,690],["div#secondary",9.435,45,693,45,645,162,690],["div#secondary",9.489,44,691,44,643,162,690],["aside#meta-2>ul>li:eq(3)",9.543,44,688,14,16,162,18],["aside#meta-2>ul>li:eq(3)>a",9.597,47,684,17,11,80,15],["aside#meta-2>ul>li:eq(3)>a",9.643,51,680,21,7,80,15],["aside#meta-2>ul>li:eq(3)>a",9.705,53,678,23,5,80,15],["aside#meta-2>ul>li:eq(3)>a",9.753,56,675,26,2,80,15],["aside#meta-2>ul>li:eq(3)>a",9.815,57,675,27,2,80,15],["aside#meta-2>ul>li:eq(3)>a",9.853,60,673,30,0,80,15],["aside#meta-2>ul>li:eq(3)>a",9.893,63,673,33,0,80,15],["aside#meta-2>ul>li:eq(3)>a",9.947,68,674,38,1,80,15],["aside#meta-2>ul>li:eq(3)>a",10.002,84,682,54,9,80,15],["div#secondary",10.047,109,701,109,653,162,690],["div#secondary",10.1,127,709,127,661,162,690],["div#secondary",10.257,128,710,128,662,162,690],["div#secondary",10.311,130,707,130,659,162,690],["div#secondary",10.365,131,703,131,655,162,690],["div#secondary",10.405,130,695,130,647,162,690],["aside#meta-2>ul>li:eq(3)",10.46,120,680,90,8,162,18],["header#masthead>div.header-main",10.505,105,668,105,45,1230,48],["header#masthead>div.header-main>h1.site-title>a",10.56,89,656,59,20,75,22],["header#masthead>div.header-main>h1.site-title>a",10.608,84,652,54,16,75,22],["header#masthead>div.header-main>h1.site-title>a",10.662,81,648,51,12,75,22],["header#masthead>div.header-main>h1.site-title>a",10.715,80,644,50,8,75,22],["header#masthead>div.header-main>h1.site-title>a",10.761,80,642,50,6,75,22],["header#masthead>div.header-main>h1.site-title>a",10.831,80,639,50,3,75,22],["header#masthead>div.header-main>h1.site-title>a",10.956,82,638,52,2,75,22],["header#masthead>div.header-main>h1.site-title>a",10.972,83,639,53,3,75,22],["header#masthead>div.header-main>h1.site-title>a",11.026,87,640,57,4,75,22],["header#masthead>div.header-main>h1.site-title>a",11.071,98,643,68,7,75,22],["header#masthead>div.header-main",11.128,160,661,160,38,1230,48],["div#main",11.174,227,680,227,632,1260,690],["div#main",11.228,323,692,323,644,1260,690],["div#main",11.274,457,701,457,653,1260,690],["div#main",11.33,675,715,675,667,1260,690],["div#main",11.376,830,731,830,683,1260,690],["div#main",11.43,898,730,898,682,1260,690],["div#main",11.484,914,725,914,677,1260,690],["div#main",11.533,926,714,926,666,1260,690],["div#main",11.594,928,703,928,655,1260,690],["div#main",11.632,920,697,920,649,1260,690],["div#main",11.686,903,683,903,635,1260,690],["div#main",11.74,897,678,897,630,1260,690],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",11.791,894,668,85,45,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",11.842,894,652,85,29,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",11.888,894,649,85,26,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",11.942,901,630,92,7,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",12.109,941,624,132,1,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",12.145,979,640,17,17,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",12.198,1039,655,77,32,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",12.446,1048,658,86,35,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",12.455,1050,658,88,35,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",12.502,1080,654,118,31,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",12.557,1144,642,29,19,72,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",12.61,1184,639,69,16,72,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",12.704,1191,638,76,15,72,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",12.75,1192,638,77,15,72,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",12.766,1196,638,81,15,72,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",12.812,1210,639,95,16,72,48],["header#masthead>div.header-main>div.search-toggle",12.866,1232,638,20,15,48,48],["header#masthead>div.header-main>div.search-toggle",12.912,1245,636,33,13,48,48],["header#masthead>div.header-main>div.search-toggle",13.067,1246,639,34,16,48,48],["header#masthead>div.header-main>div.search-toggle",13.122,1244,657,32,34,48,48],["div#main",13.167,1239,693,1239,645,1260,690],["div#main",13.223,1232,718,1232,670,1260,690],["div#main",13.27,1222,733,1222,685,1260,690],["footer#colophon>div.site-info",13.324,1185,767,1185,29,1200,18],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",13.378,1126,803,1126,755,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",13.425,1073,821,1073,773,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",13.481,985,846,985,798,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",13.526,951,855,951,807,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",13.58,911,859,911,811,1349,918],["footer#colophon>div.site-info",13.631,886,759,886,21,1200,18],["footer#colophon>div.site-info",13.681,854,756,854,18,1200,18],["footer#colophon>div.site-info",13.735,812,747,812,9,1200,18],["div#main",13.79,749,732,749,684,1260,690],["div#main",13.836,652,720,652,672,1260,690],["div#main",13.889,490,687,490,639,1260,690],["div#main",13.938,375,669,375,621,1260,690],["div#main",13.992,241,645,241,597,1260,690],["aside#meta-2>ul>li:eq(1)",14.038,187,638,157,14,162,18],["aside#meta-2>ul>li:eq(1)",14.092,173,645,143,21,162,18],["div#primary-sidebar",14.146,167,561,137,477,162,606],["aside#categories-2>h1.widget-title",14.194,162,474,132,12,162,18],["aside#categories-2",14.248,157,488,127,26,162,54],["aside#categories-2>ul>li.cat-item.cat-item-1",14.294,151,498,121,0,162,18],["div#primary-sidebar",14.348,134,517,104,433,162,606],["div#primary-sidebar",14.395,105,543,75,459,162,606],["aside#meta-2>h1.widget-title",14.449,78,569,48,5,162,18],["aside#meta-2",14.499,67,594,37,30,162,126],["aside#meta-2>ul>li:eq(0)",14.55,68,608,38,8,162,18],["aside#meta-2>ul>li:eq(0)",14.636,69,611,39,11,162,18],["div#secondary",14.681,69,711,69,663,162,690],["div#secondary",14.722,68,710,68,662,162,690],["div#secondary",14.757,66,707,66,659,162,690],["div#secondary",14.806,61,700,61,652,162,690],["div#secondary",14.869,58,694,58,646,162,690],["aside#meta-2>ul>li:eq(3)",14.915,54,689,24,17,162,18],["aside#meta-2>ul>li:eq(3)>a",14.962,50,682,20,9,80,15],["aside#meta-2>ul>li:eq(2)",15.008,46,667,16,19,162,18],["aside#meta-2>ul>li:eq(2)>a",15.062,44,660,14,11,79,15],["aside#meta-2>ul>li:eq(2)>a",15.11,43,653,13,4,79,15],["aside#meta-2>ul>li:eq(1)",15.175,43,645,13,21,162,18],["aside#meta-2>ul>li:eq(1)>a",15.226,43,639,13,14,59,15],["aside#meta-2>ul>li:eq(1)>a",15.272,43,634,13,9,59,15],["aside#meta-2>ul>li:eq(1)>a",15.32,43,629,13,4,59,15],["aside#meta-2>ul>li:eq(1)>a",15.366,41,625,11,0,59,15],["aside#meta-2>ul>li:eq(0)>a",15.42,38,610,8,9,31,15],["aside#meta-2>ul>li:eq(0)>a",15.474,37,606,7,5,31,15],["aside#meta-2>ul>li:eq(0)>a",15.52,37,603,7,2,31,15],["aside#meta-2",15.575,36,599,6,35,162,126],["aside#meta-2",15.621,36,594,6,30,162,126],["aside#meta-2",15.73,37,593,7,29,162,126],["aside#categories-2",15.806,37,493,7,31,162,54],["aside#categories-2",15.977,38,493,8,31,162,54],["aside#categories-2",16.033,40,497,10,35,162,54],["aside#categories-2>ul>li.cat-item.cat-item-1>a",16.08,44,506,14,7,78,15],["div#primary-sidebar",16.133,53,521,23,437,162,606],["div#primary-sidebar",16.187,58,527,28,443,162,606],["div#primary-sidebar",16.274,60,529,30,445,162,606],["div#primary-sidebar",16.297,61,529,31,445,162,606],["div#primary-sidebar",16.335,64,524,34,440,162,606],["aside#categories-2>ul>li.cat-item.cat-item-1>a",16.389,69,507,39,8,78,15],["aside#categories-2>ul>li.cat-item.cat-item-1>a",16.444,70,501,40,2,78,15],["aside#categories-2>ul>li.cat-item.cat-item-1",16.506,70,498,40,0,162,18],["aside#categories-2",16.545,69,495,39,33,162,54],["aside#categories-2",16.591,69,491,39,29,162,54],["aside#archives-2",16.673,69,387,39,27,162,54],["aside#recent-comments-2",16.717,69,286,39,28,162,54],["aside#recent-comments-2",17.025,69,287,39,29,162,54],["aside#recent-comments-2",17.065,69,291,39,33,162,54],["ul#recentcomments>li.recentcomments>a.url",17.12,71,306,41,11,77,15],["div#primary-sidebar",17.165,72,323,42,239,162,606],["div#primary-sidebar",17.219,75,344,45,260,162,606],["aside#archives-2>h1.widget-title",17.268,75,362,45,2,162,18],["aside#archives-2>h1.widget-title",17.321,75,371,45,11,162,18],["aside#archives-2",17.367,76,380,46,20,162,54],["aside#archives-2",17.421,76,389,46,29,162,54],["aside#archives-2>ul>li>a",17.469,76,404,46,7,72,15],["aside#archives-2>ul>li>a",17.684,76,404,46,7,72,15],["aside#archives-2",17.733,75,391,45,31,162,54],["aside#archives-2>h1.widget-title",17.787,75,360,45,0,162,18],["div#primary-sidebar",17.833,71,332,41,248,162,606],["div#primary-sidebar",17.887,69,319,39,235,162,606],["div#primary-sidebar",17.935,70,314,40,230,162,606],["ul#recentcomments>li.recentcomments",17.997,72,310,42,16,162,18],["ul#recentcomments>li.recentcomments>a.url",18.043,72,308,42,13,77,15],["ul#recentcomments>li.recentcomments>a.url",18.089,76,305,46,10,77,15],["ul#recentcomments>li.recentcomments>a.url",18.143,80,302,50,7,77,15],["ul#recentcomments>li.recentcomments>a.url",18.191,84,301,54,6,77,15],["ul#recentcomments>li.recentcomments>a.url",18.245,91,300,61,5,77,15],["ul#recentcomments>li.recentcomments>a.url",18.291,99,300,69,5,77,15],["ul#recentcomments>li.recentcomments",18.345,114,303,84,9,162,18],["ul#recentcomments>li.recentcomments>a:eq(1)",18.394,130,306,5,11,65,15],["ul#recentcomments>li.recentcomments>a:eq(1)",18.448,146,307,21,12,65,15],["ul#recentcomments>li.recentcomments>a:eq(1)",18.502,159,309,34,14,65,15],["ul#recentcomments>li.recentcomments>a:eq(1)",18.602,160,308,35,13,65,15],["aside#recent-comments-2",18.653,152,287,122,29,162,54],["div#primary-sidebar",18.703,117,246,87,162,162,606],["div#primary-sidebar",18.749,88,216,58,132,162,606],["aside#recent-posts-2>ul>li>a",18.803,75,202,45,9,65,15],["aside#recent-posts-2>ul>li>a",18.858,73,199,43,6,65,15],["aside#recent-posts-2>ul>li>a",19.052,71,198,41,5,65,15],["aside#recent-posts-2>ul>li>a",19.06,72,199,42,6,65,15],["aside#recent-posts-2>ul>li>a",19.114,76,205,46,12,65,15],["div#primary-sidebar",19.161,85,213,55,129,162,606],["div#primary-sidebar",19.215,170,237,140,153,162,606],["article#post-1",19.261,266,254,44,134,1038,169],["article#post-1",19.315,333,273,111,153,1038,169],["article#post-1",19.363,349,277,127,157,1038,169],["article#post-1",19.426,352,280,130,160,1038,169],["article#post-1",19.471,354,282,132,162,1038,169],["article#post-1",19.517,355,185,133,65,1038,169],["article#post-1",19.589,357,188,135,68,1038,169],["article#post-1",19.619,357,189,135,69,1038,169],["article#post-1",19.685,358,167,136,47,1038,169],["article#post-1",19.727,358,169,136,49,1038,169],["article#post-1",19.781,359,172,137,52,1038,169],["article#post-1",19.829,359,175,137,55,1038,169],["article#post-1",19.875,359,180,137,60,1038,169],["article#post-1",19.929,357,189,135,69,1038,169],["article#post-1",19.975,355,196,133,76,1038,169],["article#post-1",20.03,351,210,129,90,1038,169],["article#post-1",20.077,347,221,125,101,1038,169],["article#post-1",20.131,343,225,121,105,1038,169],["article#post-1",20.185,339,228,117,108,1038,169],["article#post-1",20.232,332,231,110,111,1038,169],["article#post-1",20.287,316,234,94,114,1038,169],["article#post-1",20.333,291,235,69,115,1038,169],["article#post-1",20.387,249,241,27,121,1038,169],["article#post-1",20.441,233,249,11,129,1038,169],["article#post-1",20.487,225,253,3,133,1038,169],["div#secondary",20.543,208,253,208,205,162,690],["aside#recent-posts-2>ul>li",20.59,169,208,139,16,162,18],["div#primary-sidebar",20.643,122,155,92,71,162,606],["div#primary-sidebar",20.689,102,132,72,48,162,606],["div#primary-sidebar",20.745,91,114,61,30,162,606],["div#primary-sidebar",20.791,87,109,57,25,162,606],["aside#search-2>form.search-form>label>input.search-field",20.847,82,95,52,11,154,15],["div#secondary",20.899,77,74,77,26,162,690],["div#secondary>h2.site-description",20.945,75,62,45,17,162,18],["div#secondary>h2.site-description",21.001,74,57,44,12,162,18],["div#secondary>h2.site-description",21.047,77,54,47,9,162,18],["div#secondary>h2.site-description",21.101,83,49,53,4,162,18],["header#masthead>div.header-main>h1.site-title",21.147,95,47,65,47,75,48],["header#masthead>div.header-main",21.201,105,47,105,47,1230,48],["div#secondary>h2.site-description",21.249,114,55,84,10,162,18],["div#secondary",21.303,122,77,122,29,162,690],["aside#search-2>form.search-form>label>input.search-field",21.358,123,90,93,6,154,15],["aside#search-2>form.search-form>label>input.search-field",21.404,121,94,91,10,154,15],["aside#search-2>form.search-form>label>input.search-field",21.514,119,95,89,11,154,15],["aside#search-2>form.search-form>label>input.search-field",21.741,119,95,89,11,154,15],["aside#search-2>form.search-form>label>input.search-field",21.801,118,93,88,9,154,15],["aside#search-2>form.search-form>label>input.search-field",21.815,118,91,88,7,154,15],["div#secondary",21.869,110,78,110,30,162,690],["div#secondary>h2.site-description",21.917,99,60,69,15,162,18],["header#masthead>div.header-main>h1.site-title",21.964,92,43,62,43,75,48],["header#masthead>div.header-main>h1.site-title>a",22.018,86,32,56,19,75,22],["header#masthead>div.header-main>h1.site-title>a",22.071,84,27,54,14,75,22],["header#masthead>div.header-main>h1.site-title>a",22.196,82,24,52,11,75,22],["header#masthead>div.header-main>h1.site-title>a",22.219,84,22,54,9,75,22],["header#masthead>div.header-main>h1.site-title>a",22.274,89,18,59,5,75,22],["header#masthead>div.header-main>h1.site-title>a",22.32,104,19,74,6,75,22],["header#masthead>div.header-main",22.375,155,47,155,47,1230,48],["div#primary",22.429,239,93,239,45,1260,217],["article#post-1",22.475,287,120,65,0,1038,169],["article#post-1",22.529,325,135,103,15,1038,169],["article#post-1",22.575,352,143,130,23,1038,169],["article#post-1",22.631,397,148,175,28,1038,169],["article#post-1",22.677,417,146,195,26,1038,169],["article#post-1",22.731,446,144,224,24,1038,169],["article#post-1",22.779,473,144,251,24,1038,169],["article#post-1>header.entry-header>h1.entry-title>a",22.836,512,150,8,33,244,41],["article#post-1>header.entry-header>h1.entry-title>a",22.887,535,150,31,33,244,41],["article#post-1>header.entry-header>h1.entry-title>a",22.941,551,149,47,32,244,41],["article#post-1>header.entry-header>h1.entry-title>a",22.987,556,149,52,32,244,41],["article#post-1>header.entry-header>h1.entry-title>a",23.041,563,149,59,32,244,41],["article#post-1>header.entry-header>h1.entry-title>a",23.104,567,149,63,32,244,41],["article#post-1>header.entry-header>h1.entry-title>a",23.151,570,152,66,35,244,41],["article#post-1>header.entry-header",23.191,573,160,99,40,474,73],["article#post-1>header.entry-header>div.entry-meta>span.entry-date>a>time.entry-date",23.244,578,171,57,2,97,15],["article#post-1>header.entry-header>div.entry-meta>span.entry-date>a>time.entry-date",23.297,582,176,61,7,97,15],["article#post-1>header.entry-header>div.entry-meta>span.entry-date>a>time.entry-date",23.352,585,179,64,10,97,15],["article#post-1>header.entry-header>div.entry-meta>span.entry-date>a>time.entry-date",23.408,589,179,68,10,97,15],["article#post-1>header.entry-header>div.entry-meta>span.entry-date>a>time.entry-date",23.454,602,177,81,8,97,15],["article#post-1>header.entry-header>div.entry-meta",23.498,618,174,114,6,474,17],["article#post-1>header.entry-header>div.entry-meta>span.comments-link>a",23.557,631,170,1,1,90,15],["article#post-1>header.entry-header>div.entry-meta>span.comments-link>a",23.602,654,169,24,0,90,15],["article#post-1>header.entry-header>div.entry-meta",23.655,673,168,169,0,474,17],["article#post-1>header.entry-header>div.entry-meta",23.701,679,168,175,0,474,17],["article#post-1>header.entry-header>div.entry-meta",23.756,685,168,181,0,474,17],["article#post-1>header.entry-header>div.entry-meta>span.comments-link>a",23.804,692,171,62,2,90,15],["article#post-1>header.entry-header>div.entry-meta>span.comments-link>a",23.858,703,175,73,6,90,15],["article#post-1>header.entry-header>div.entry-meta",23.912,711,184,207,16,474,17],["article#post-1>header.entry-header",23.957,716,195,242,75,474,73],["article#post-1>div.entry-content",24.011,720,210,246,5,474,72],["article#post-1>div.entry-content",24.417,721,211,247,6,474,72],["article#post-1>div.entry-content",24.469,730,213,256,8,474,72],["article#post-1>div.entry-content",24.518,753,211,279,6,474,72],["article#post-1>header.entry-header",24.571,820,197,346,77,474,73],["article#post-1>header.entry-header>h1.entry-title",24.617,861,148,357,28,474,36],["article#post-1>header.entry-header>h1.entry-title",24.671,876,121,372,1,474,36],["div#primary",24.719,877,112,877,64,1260,217],["div#primary",24.773,876,106,876,58,1260,217],["div#primary",24.827,873,94,873,46,1260,217],["div#primary",24.873,872,75,872,27,1260,217],["div#primary",24.927,875,52,875,4,1260,217],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",24.975,880,38,71,38,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",25.029,883,33,74,33,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",25.083,887,29,78,29,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",25.129,899,26,90,26,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-4>a",25.184,930,27,121,27,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",25.232,967,32,5,32,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",25.288,1020,36,58,36,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",25.331,1035,34,73,34,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",25.385,1040,34,78,34,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",25.434,1048,31,86,31,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-15>a",25.487,1087,27,125,27,129,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",25.542,1146,22,31,22,72,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",25.587,1180,16,65,16,72,48],["nav#primary-navigation>div.nav-menu>ul>li.page_item.page-item-2>a",25.641,1203,11,88,11,72,48],["header#masthead>div.header-main>div.search-toggle",25.689,1215,10,3,10,48,48],["header#masthead>div.header-main>div.search-toggle",25.743,1235,6,23,6,48,48],["#document>html",25.797,1260,20,1260,20,1349,966],["#document>html",25.843,1271,35,1271,35,1349,966],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",25.9,1267,61,1267,13,1349,918],["div#primary",25.945,1230,79,1230,31,1260,217],["div#primary",25.999,1071,94,1071,46,1260,217],["div#primary",26.045,869,108,869,60,1260,217],["div#primary",26.099,736,105,736,57,1260,217],["div#primary",26.147,614,102,614,54,1260,217],["div#primary",26.201,512,91,512,43,1260,217],["div#primary",26.255,403,65,403,17,1260,217],["header#masthead>div.header-main",26.301,300,47,300,47,1230,48],["header#masthead>div.header-main",26.357,190,128,190,28,1230,48],["header#masthead>div.header-main",26.411,121,125,121,25,1230,48],["header#masthead>div.header-main>h1.site-title>a",26.457,103,225,73,12,75,22],["header#masthead>div.header-main>h1.site-title",26.511,98,238,68,38,75,48],["div#primary-sidebar",26.565,98,354,68,270,162,606],["aside#archives-2>h1.widget-title",26.613,105,368,75,8,162,18],["aside#archives-2",26.667,125,379,95,19,162,54],["aside#categories-2",26.713,169,497,139,35,162,54],["div#main",26.767,243,511,243,463,1260,690],["div#main",26.821,303,513,303,465,1260,690],["div#main",26.869,383,510,383,462,1260,690],["div#main",26.923,502,529,502,481,1260,690],["div#main",26.969,603,557,603,509,1260,690],["div#main",27.023,648,576,648,528,1260,690],["div#main",27.071,663,613,663,565,1260,690],["div#main",27.125,654,638,654,590,1260,690],["div#main",27.171,603,645,603,597,1260,690],["div#main",27.225,314,640,314,592,1260,690],["aside#meta-2",27.271,106,593,76,29,162,126],["div#secondary",27.327,0,545,0,497,162,690],["div#secondary",27.373,0,521,0,473,162,690],["div#secondary",27.427,0,501,0,453,162,690],["div#secondary",27.481,0,515,0,467,162,690],["div#secondary",27.529,1,560,1,512,162,690],["div#secondary",27.582,20,598,20,550,162,690],["aside#meta-2>ul>li:eq(0)>a",27.63,31,609,1,8,31,15],["div#secondary",27.68,38,718,38,670,162,690],["div#secondary",27.736,48,723,48,675,162,690],["div#secondary",27.831,53,724,53,676,162,690],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",27.864,53,823,53,775,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",27.893,53,822,53,774,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",27.945,52,843,52,795,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",27.987,49,836,49,788,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",28.045,48,822,48,774,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",28.095,41,791,41,743,1349,918],["footer#colophon>div.site-info>a",28.141,40,765,10,11,167,15],["div#secondary",28.194,50,728,50,680,162,690],["div#secondary",28.243,70,720,70,672,162,690],["div#secondary",28.297,100,730,100,682,162,690],["footer#colophon>div.site-info>a",28.344,151,754,121,0,167,15],["footer#colophon>div.site-info",28.398,158,771,158,33,1200,18],["footer#colophon>div.site-info",28.446,156,779,156,41,1200,18],["footer#colophon>div.site-info",28.5,171,780,171,42,1200,18],["footer#colophon>div.site-info",28.553,277,758,277,20,1200,18],["footer#colophon>div.site-info",28.6,411,740,411,2,1200,18],["footer#colophon>div.site-info",28.654,536,742,536,4,1200,18],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",28.702,685,807,685,759,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",28.756,913,920,913,872,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",28.802,991,951,991,903,1349,918],["#document>html>body.home.blog.masthead-fixed.list-view.full-width.grid",28.861,1022,855,1022,807,1349,918],["footer#colophon>div.site-info",28.905,1046,754,1046,16,1200,18],["div#main",28.96,1070,643,1070,595,1260,690],["div#main",29.011,1081,619,1081,571,1260,690],["div#main",29.066,1057,579,1057,531,1260,690],["div#main",29.111,993,436,993,388,1260,690],["div#main",29.168,799,407,799,359,1260,690],["div#main",29.214,453,377,453,329,1260,690],["aside#archives-2",29.268,131,386,101,26,162,54],["div#secondary",29.322,0,414,0,366,162,690],["div#secondary",29.368,0,413,0,365,162,690],["div#secondary",29.424,0,365,0,317,162,690],["div#secondary",29.47,17,279,17,231,162,690],["header#masthead>div.header-main>h1.site-title>a",29.524,77,243,47,7,75,22],["header#masthead>div.header-main",29.578,121,236,121,13,1230,48],["header#masthead>div.header-main",29.626,142,269,142,46,1230,48],["div#primary-sidebar",29.673,184,328,154,244,162,606],["div#secondary",29.726,198,352,198,304,162,690],["div#secondary",29.78,196,369,196,321,162,690],["aside#archives-2",29.826,170,378,140,18,162,54],["aside#archives-2>ul>li",29.882,110,405,80,9,162,18],["div#primary-sidebar",29.927,74,431,44,347,162,606],["aside#categories-2>h1.widget-title",29.982,78,472,48,10,162,18]]';
		  clickedjson = '[["article#post-1>div.entry-content",6.521,497,226,23,21,474,72],["aside#search-2>form.search-form>label>input.search-field",21.739,119,95,89,11,154,15],["article#post-1>div.entry-content",24.416,721,211,247,6,474,72]]';
		  lostfocusjson = '[["div#main",2.037,610,354,610,306,1260,690]]';
		  scrolls = '[[0,0,6.9,623,0,7.8149999999999995],[623,0,13.62,423,0,14.673],[423,0,15.782,323,0,15.786000000000001],[323,0,16.633,123,0,16.705],[123,0,19.505,0,0,19.678],[0,0,26.345,400,0,26.688],[400,0,27.65,623,0,27.942],[623,0,28.843,223,0,29.088]]';
		  vp = '[[1349,643,0.013],[1349,343,2.594]]';
	  }
	  
      
      if(type === "exit") {
    	  if(wpiRec.isExitTriggered) {
    		return;  
    	  } else {
    		  isAsync = false;
    		  wpiRec.isExitTriggered = true;
    	  }    	  
      }
      
     
      var requestData  = "rid="        + wpiRec.recordingId;
	      requestData += "&time="      + wpiRec.getTime();
	      requestData += "&focusedTime=" + wpiRec.getFocusTime();
	      //requestData += "&elhoveredcomp=" + compressedHovered;
	      //requestData += "&elhovered=" + encodeURIComponent(JSON.stringify(wpiRec.elem.hovered));
	      requestData += "&elhovered=" + hoveredjson;
	      requestData += "&elclicked=" + clickedjson;
	      requestData += "&ellostfocus=" + lostfocusjson;
	      requestData += "&scrolls=" + scrolls;
	      requestData += "&vp="        + vp;
	      requestData += "&lostFocusCount=" + wpiRec.lostFocusCount;
	      requestData += "&pageSections=" + encodeURIComponent(JSON.stringify(wpiRec.pageSections));
	      requestData += "&currentPageSection=" + encodeURIComponent(wpiRec.currentPageSection);
          requestData += "&action="    + action;
          requestData += "&type="    + type;
          
       if(type === "init") {
    	   		requestData += "&vid="        + wpiRec.visitorId;
    	   		requestData += "&ftu="        + wpiRec.ftu;
    	   		requestData += "&url="      + wpiRec.url;
		   		requestData += "&html="      + wpiRec.getDocumentHtml();
       }
          
      wpiRec.lastScrollsLength = wpiRec.scrolls.length;
      wpiRec.lastViewPortsLength = wpiRec.viewPorts.length;
      // clean
      wpiRec.clearMouseData();
      
      //wpiRec.log("Inside append mouse data");
      wpiRec.log("Inside "+action+" send mouse data and type = "+type);
      // send request
      var gatewayUrl = wpiOpt.trackingUrl;
      if ('XDomainRequest' in window && window.XDomainRequest !== null) {
  	    // Use Microsoft XDR
    	wpiRec.log('XDomainRequest');
  	    var xdr = new XDomainRequest();
  	    xdr.open("post", gatewayUrl+"?action="+action+"&isXDR=true&_="+(new Date()).getTime());
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
			  url:  gatewayUrl+"?action="+action+"&_="+(new Date()).getTime(),
			  cache: false,
			  async: true,
			  data: requestData
		});		
		
	  }
      
		if(type === "exit") {
			var waitBeforeRequest = wpiRec.getParameterByName('waitBeforeRequest');
		      
			if(waitBeforeRequest == null || waitBeforeRequest === "") {
				  waitBeforeRequest = 0;
			} else {
				waitBeforeRequest = parseInt(waitBeforeRequest,10);
			}
			
			
			wpiRec.sleep(waitBeforeRequest);
		}
	  
      
    },
    
    sleep: function(milliseconds) 
	{
	  var e = new Date().getTime() + (milliseconds);
	  while (new Date().getTime() <= e) {}
	},
	
	getParameterByName: function(name) {
	    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	        results = regex.exec(location.search);
	    return results == null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
	},

    
    /** 
     * Clears mouse data from queue.        
     */
    clearMouseData: function()
    {
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
        /*var mousePosition = {
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
        };*/
    	var mousePosition = [];
    	mousePosition.push(wpi_jquery(target).getcssPath()); //csspath - index 0
    	mousePosition.push(wpiRec.getTime()); //time - index 1
    	mousePosition.push(pageX); //pageX - index 2
    	mousePosition.push(pageY); //pageY - index 3
    	mousePosition.push(pageX - elementX); //rX - index 4
    	mousePosition.push(pageY - elementY); //rY - index 5
    	mousePosition.push(wpi_jquery(target).width()); //w - index 6
    	mousePosition.push(wpi_jquery(target).height()); //h - index 7
        
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
    	  wpiRec.timestamp = wpiRec.lastBlurTimeStamp = wpiRec.lastFocusTimeStamp  = (new Date()).getTime();
    	  console.log(wpiRec.timestamp);
    	  wpiRec.visitorId = wpiRec.getVisitorId();
    	  console.log("In Init Visitor ID : " + wpiRec.visitorId);
    	  wpiRec.recordingId = wpiRec.generateRecordingId();
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
      wpi_jquery(window).on("beforeunload", function() { wpiRec.sendMouseData('exit'); });
      wpi_jquery(window).on("unload", function() { wpiRec.sendMouseData('exit'); })
	  setTimeout(function() { wpiRec.sendMouseData('init'); }, 10);
      var randomSecs = Math.floor(Math.random()*1000); // this will get a number between 1 and 99;
      randomSecs *= Math.floor(Math.random()*2) == 1 ? 1 : -1; // this will add minus sign in 50% of cases
      var requestInterval = (wpiOpt.postInterval*1000)+randomSecs;
      // once the session started, append mouse data
      wpiRec.sendMouseDataInterval = setInterval(wpiRec.sendMouseData, requestInterval);
      
    }
  };
  
  // do not overwrite the wpi namespace
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
