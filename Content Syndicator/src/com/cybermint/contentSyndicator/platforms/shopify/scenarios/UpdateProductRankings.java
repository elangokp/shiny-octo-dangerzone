package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyDBUtils;

public class UpdateProductRankings implements Runnable {

	private BlockingQueue<ShopifyProduct> productRankingsQueue;
	private int recordsPerBatch;
	
	public UpdateProductRankings(BlockingQueue<ShopifyProduct> productRankingsQueue, int recordsPerBatch) {
		this.productRankingsQueue = productRankingsQueue;
		this.recordsPerBatch = recordsPerBatch;
	}

	@Override
	public void run() {
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		List<ShopifyProduct> products = new ArrayList<ShopifyProduct>();
		System.out.println("DB update Thread Initialized");
		Boolean ignoreBatchMinimum = false;
		while(products.size() <= this.recordsPerBatch) {			
			try {
				if(products.size() >= this.recordsPerBatch || (ignoreBatchMinimum && products.size()>0)) {
					System.out.println("Calling Update");
					dbutils.insertProductRankings(products);
					products.clear();
					ignoreBatchMinimum = false;
				} else {
					//System.out.println("Adding product to DB Queue");
					ShopifyProduct product = this.productRankingsQueue.poll(5, TimeUnit.SECONDS);
					if(null != product 
							&& product.getCrawlHeaderID() != null 
							&& product.getSiteID() != null
							&& product.getProductURL() != null
							&& product.getBestSellerRank() != null) {
						products.add(product);
					}
					
					if(null == product) {
						ignoreBatchMinimum = true;
					}
					//System.out.println("Product taken from queue");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
