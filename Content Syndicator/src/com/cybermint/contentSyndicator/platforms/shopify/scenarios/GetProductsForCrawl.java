package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.List;
import java.util.concurrent.BlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyDBUtils;

public class GetProductsForCrawl implements Runnable {

	private int batchSize = 1;
	private BlockingQueue<ShopifyProduct> pendingProductsQueue;
	
	public GetProductsForCrawl(BlockingQueue<ShopifyProduct> pendingProductsQueue, int batchSize) {
		this.batchSize = batchSize;
		this.pendingProductsQueue = pendingProductsQueue;
	}

	@Override
	public void run() {
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		Boolean isNextProductAvailable = true;
		while(isNextProductAvailable) {
			try {
				//System.out.println("Before getting next batch from DB : " + Instant.now());
				List<ShopifyProduct> products = dbutils.getNextActiveProductsForCrawl(batchSize);
				//System.out.println("After getting next batch from DB : " + Instant.now());
				for(ShopifyProduct aProduct: products) {
					if(aProduct.getProductURL().equalsIgnoreCase("NOT AVAILABLE")) {
						isNextProductAvailable = false;
					} else {
						//System.out.println("Adding : " + aProduct.getProductURL());
						//extractors.execute(new CrawlNextActiveProduct(aProduct, productDetailsQueue));
						//System.out.println("Available Products : "+products.size()+" , PendingProductsQueue : " 
						//+ pendingProductsQueue.size() 
						//+ "," + pendingProductsQueue.remainingCapacity());
						//System.out.println("Before putting the product : " + Instant.now()); 
						pendingProductsQueue.put(aProduct);
						//System.out.println("After putting the product : " + Instant.now()); 
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
