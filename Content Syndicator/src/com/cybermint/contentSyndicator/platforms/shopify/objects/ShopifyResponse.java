package com.cybermint.contentSyndicator.platforms.shopify.objects;

import java.util.concurrent.ExecutionException;

import org.asynchttpclient.ListenableFuture;

public class ShopifyResponse {

	private String statusCode;
	private String statusText;
	private String html;	
	private ListenableFuture<org.asynchttpclient.Response> futureResponse;
	
	public ShopifyResponse() {
	}
	
	public boolean isFutureResponse() {
		if (null != futureResponse && null == statusCode) {
			return true;
		} else {
			return false;
		}
	}

	public String getStatusCode() throws InterruptedException, ExecutionException {
		if (null != futureResponse && null == statusCode) {
			this.statusCode = Integer.toString(futureResponse.get().getStatusCode());
		}
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusText() throws InterruptedException, ExecutionException {
		if (null != futureResponse && null == statusText) {
			this.statusText = futureResponse.get().getStatusText();
		}
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public String getHtml() throws InterruptedException, ExecutionException {
		if (null != futureResponse && null == html) {
			this.html = futureResponse.get().getResponseBody();
		}
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public ListenableFuture<org.asynchttpclient.Response> getFutureResponse() {
		return futureResponse;
	}

	public void setFutureResponse(ListenableFuture<org.asynchttpclient.Response> futureResponse) {
		this.futureResponse = futureResponse;
	}

}
