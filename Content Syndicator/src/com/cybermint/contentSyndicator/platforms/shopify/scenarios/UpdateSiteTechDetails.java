package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyDBUtils;

public class UpdateSiteTechDetails implements Runnable {

	private BlockingQueue<ShopifySite> siteDetailsQueue;
	private int recordsPerBatch;
	
	public UpdateSiteTechDetails(BlockingQueue<ShopifySite> siteDetailsQueue, int recordsPerBatch) {
		this.siteDetailsQueue = siteDetailsQueue;
		this.recordsPerBatch = recordsPerBatch;
	}

	@Override
	public void run() {
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		List<ShopifySite> sites = new ArrayList<ShopifySite>();
		System.out.println("DB update Thread Initialized");
		Boolean ignoreBatchMinimum = false;
		while(sites.size() <= this.recordsPerBatch || ignoreBatchMinimum) {
			try {
				if(sites.size() >= this.recordsPerBatch) {
					System.out.println("Calling Update");
					dbutils.updateSiteTechDetails(sites);
					sites.clear();
					ignoreBatchMinimum = false;
				} else {
					//System.out.println("Adding product to DB Queue");
					ShopifySite site = this.siteDetailsQueue.poll(5, TimeUnit.SECONDS);
					if(null != site) {
						sites.add(site);
					}	
					
					if(null == site) {
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
