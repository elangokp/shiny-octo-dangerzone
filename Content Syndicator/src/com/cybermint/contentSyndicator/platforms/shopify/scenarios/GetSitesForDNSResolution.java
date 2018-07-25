package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.List;
import java.util.concurrent.BlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyDBUtils;

public class GetSitesForDNSResolution implements Runnable {

	private int batchSize = 1;
	private BlockingQueue<ShopifySite> pendingSitesQueue;
	
	public GetSitesForDNSResolution(BlockingQueue<ShopifySite> pendingSitesQueue, int batchSize) {
		this.batchSize = batchSize;
		this.pendingSitesQueue = pendingSitesQueue;
	}

	@Override
	public void run() {
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		Boolean isNextSiteAvailable = true;
		while(isNextSiteAvailable) {
			try {
				//System.out.println("Before getting next batch from DB : " + Instant.now());
				List<ShopifySite> sites = dbutils.getNextSitesForDNSResolution(batchSize);
				//System.out.println("After getting next batch from DB : " + Instant.now());
				for(ShopifySite aSite: sites) {
					if(aSite.getStoreURL().equalsIgnoreCase("NOT AVAILABLE")) {
						isNextSiteAvailable = false;
					} else {
						pendingSitesQueue.put(aSite);
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
