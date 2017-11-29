package com.cybermint.contentSyndicator.platforms.shopify.objects;

import java.time.Instant;
import java.util.concurrent.Future;

public class ShopifyProduct {

	private Integer crawlHeaderID;
	private Integer productID;
	private Integer siteID;
	private String storeURL;
	private String productURL;
	private String productTitle;
	private String productDesc;
	private Double productPrice;
	private String productCurrency;
	private Instant publishedOn;
	private Instant createdOn;
	private Integer bestSellerRank;
	private Integer isSiteCrawlComplete;
	private Future<org.asynchttpclient.Response> futureResponse;
	
	public static final int STATUS_COMPLETED = 0; 
	public static final int STATUS_INPROGRESS = -1; 
	public static final int STATUS_PENDING = 1; 
	
	public Integer getCrawlHeaderID() {
		return crawlHeaderID;
	}
	public void setCrawlHeaderID(Integer crawlHeaderID) {
		this.crawlHeaderID = crawlHeaderID;
	}
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
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
	public String getProductURL() {
		return productURL;
	}
	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCurrency() {
		return productCurrency;
	}
	public void setProductCurrency(String productCurrency) {
		this.productCurrency = productCurrency;
	}
	public Instant getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(Instant publishedOn) {
		this.publishedOn = publishedOn;
	}
	public Instant getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}
	public Integer getBestSellerRank() {
		return bestSellerRank;
	}
	public void setBestSellerRank(Integer bestSellerRank) {
		this.bestSellerRank = bestSellerRank;
	}
	public Integer getIsSiteCrawlComplete() {
		return isSiteCrawlComplete;
	}
	public void setIsSiteCrawlComplete(Integer isSiteCrawlComplete) {
		this.isSiteCrawlComplete = isSiteCrawlComplete;
	}
	public Future<org.asynchttpclient.Response> getFutureResponse() {
		return futureResponse;
	}
	public void setFutureResponse(Future<org.asynchttpclient.Response> futureResponse) {
		this.futureResponse = futureResponse;
	}
	
	
	
}
