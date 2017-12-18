package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.concurrent.BlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyClient;
import com.cybermint.http.URLConnectionPool;

public class ProcessProductDetails implements Runnable {

	private ShopifyClient client;
	//private BlockingQueue<ShopifyProduct> productProcessingQueue;
	private BlockingQueue<ShopifyProduct> productDetailsQueue;	
	private ShopifyProduct givenProduct;
	
	/*
	public ProcessProductDetails(BlockingQueue<ShopifyProduct> productProcessingQueue, BlockingQueue<ShopifyProduct> productDetailsQueue) {
		this.client = new ShopifyClient();
		this.productProcessingQueue = productProcessingQueue;
		this.productDetailsQueue = productDetailsQueue;
	}
	*/
	
	public ProcessProductDetails(ShopifyProduct givenProduct, BlockingQueue<ShopifyProduct> productDetailsQueue) {
		this.client = new ShopifyClient();
		this.givenProduct = givenProduct;
		this.productDetailsQueue = productDetailsQueue;
	}


	@Override
	public void run() {
		/*
		while(1==1) {
			try {
				//System.out.println("Starting thread for : " + Thread.currentThread().getName());
				ShopifyProduct givenProduct = this.productProcessingQueue.take();
				if(givenProduct.getFutureResponse().isDone()) {
					client.processProduct(givenProduct);
					this.productDetailsQueue.put(givenProduct);
				} else {
					this.productProcessingQueue.put(givenProduct);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		*/
		try {
			//System.out.println("Starting thread for : " + Thread.currentThread().getName());
			//System.out.println("Before Product : " + givenProduct.getProductURL());
			URLConnectionPool.reduceConnection();
			client.processProduct(givenProduct);
			//System.out.println("After Product : " + givenProduct.getProductURL());
			this.productDetailsQueue.put(givenProduct);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
