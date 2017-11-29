package com.cybermint.contentSyndicator.platforms.shopify.objects;

import java.util.concurrent.Future;

public class ShopifySite {

	private Integer crawlHeaderID;
	private Integer siteID;
	private String storeURL;
	private Future<org.asynchttpclient.Response> futureResponse;
	
	private boolean doesUseHurrify;
	
	public static final int STATUS_COMPLETED = 0; 
	public static final int STATUS_INPROGRESS = -1; 
	public static final int STATUS_PENDING = 1; 
	
	public Integer getCrawlHeaderID() {
		return crawlHeaderID;
	}
	public void setCrawlHeaderID(Integer crawlHeaderID) {
		this.crawlHeaderID = crawlHeaderID;
	}
	public Integer getSiteID() {
		return siteID;
	}
	public void setSiteID(Integer siteID) {
		this.siteID = siteID;
	}
	public String getStoreURL() {
		return storeURL;
	}
	public void setStoreURL(String storeURL) {
		this.storeURL = storeURL;
	}
	public Future<org.asynchttpclient.Response> getFutureResponse() {
		return futureResponse;
	}
	public void setFutureResponse(Future<org.asynchttpclient.Response> futureResponse) {
		this.futureResponse = futureResponse;
	}
	public boolean isDoesUseHurrify() {
		return doesUseHurrify;
	}
	public void setDoesUseHurrify(boolean doesUseHurrify) {
		this.doesUseHurrify = doesUseHurrify;
	}
	
	
}
