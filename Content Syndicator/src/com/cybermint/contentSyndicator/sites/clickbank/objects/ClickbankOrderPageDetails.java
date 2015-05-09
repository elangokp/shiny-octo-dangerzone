package com.cybermint.contentSyndicator.sites.clickbank.objects;

import java.net.URL;

public class ClickbankOrderPageDetails {

	private String vendorID;
	
	private String affiliateID;
	
	private Integer itemID;
	
	private String orderPageURL;
	
	private String vendorNumber;
	
	private boolean isProductEnabled;
	
	private String productTitle;
	
	private String productDescription;
	
	private String productImageURL;
	
	private double productPrice;
	
	private String extractionError;
	
	public ClickbankOrderPageDetails(String vendorID, String affiliateID, Integer itemID) {
		this.vendorID = vendorID;
		this.affiliateID = affiliateID;
		this.itemID = itemID;
	}
	
	public String getPayLink() {
		return "http://" + this.itemID + "." + this.affiliateID +"_" + this.vendorID + ".pay.clickbank.net";
	}
	
	public String getTarget() {
		return "ssl.clickbank.net/order/orderform.html*&vvvv="+this.vendorNumber+"&item="+this.itemID+"&";
	}
	
	public String getProductImageExtension() {
		String productImageExtension = "";
		if(this.productImageURL != null) {
			if(this.productImageURL.contains(".")) {
			    productImageExtension = this.productImageURL.substring(this.productImageURL.lastIndexOf(".")+1);
			}
		}
		return productImageExtension;
	}
	
	public String toString() {
		StringBuffer lineToSave = new StringBuffer();
		lineToSave.append("\""+vendorID+"\"");
		lineToSave.append(",\""+itemID+"\"");
		lineToSave.append(",\""+this.getTarget()+"\"");
		lineToSave.append(",\""+isProductEnabled+"\"");
		lineToSave.append(",\""+vendorNumber+"\"");
		lineToSave.append(",\""+this.getPayLink()+"\"");
		lineToSave.append(",\""+orderPageURL+"\"");
		lineToSave.append(",\""+productTitle+"\"");
		lineToSave.append(",\""+productDescription+"\"");
		lineToSave.append(",\""+productImageURL+"\"");
		lineToSave.append(",\""+productPrice+"\"");
		lineToSave.append(",\""+extractionError+"\"");
		return lineToSave.toString();
	}

	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}

	public String getAffiliateID() {
		return affiliateID;
	}

	public void setAffiliateID(String affiliateID) {
		this.affiliateID = affiliateID;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getOrderPageURL() {
		return orderPageURL;
	}

	public void setOrderPageURL(String orderPageURL) {
		this.orderPageURL = orderPageURL;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public boolean isProductEnabled() {
		return isProductEnabled;
	}

	public void setProductEnabled(boolean isProductEnabled) {
		this.isProductEnabled = isProductEnabled;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImageURL() {
		return productImageURL;
	}

	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getExtractionError() {
		return extractionError;
	}

	public void setExtractionError(String extractionError) {
		this.extractionError = extractionError;
	}

	

}
