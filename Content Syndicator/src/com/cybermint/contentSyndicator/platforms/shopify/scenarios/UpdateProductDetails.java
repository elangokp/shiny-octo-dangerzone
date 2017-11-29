package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyDBUtils;

public class UpdateProductDetails implements Runnable {

	private BlockingQueue<ShopifyProduct> productDetailsQueue;
	private int recordsPerBatch;
	
	public UpdateProductDetails(BlockingQueue<ShopifyProduct> productDetailsQueue, int recordsPerBatch) {
		this.productDetailsQueue = productDetailsQueue;
		this.recordsPerBatch = recordsPerBatch;
	}

	@Override
	public void run() {
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		List<ShopifyProduct> products = new ArrayList<ShopifyProduct>();
		System.out.println("DB update Thread Initialized");
		Boolean ignoreBatchMinimum = false;
		while(products.size() <= this.recordsPerBatch || ignoreBatchMinimum) {
			try {
				if(products.size() >= this.recordsPerBatch) {
					System.out.println("Calling Update");
					dbutils.updateProductDetails(products);
					products.clear();
					ignoreBatchMinimum = false;
				} else {
					//System.out.println("Adding product to DB Queue");
					ShopifyProduct product = this.productDetailsQueue.poll(5, TimeUnit.SECONDS);
					if(null != product 
							&& 
							(product.getProductTitle() != null 
							|| product.getProductDesc() != null
							|| product.getProductPrice() != null
							|| product.getProductCurrency() != null
							|| product.getPublishedOn() != null
							)) {
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
