package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.concurrent.BlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyClient;

public class ProcessSiteTechDetails implements Runnable {

	private ShopifyClient client;
	private BlockingQueue<ShopifySite> siteProcessingQueue;
	private BlockingQueue<ShopifySite> siteDetailsQueue;	
	
	public ProcessSiteTechDetails(BlockingQueue<ShopifySite> siteProcessingQueue, BlockingQueue<ShopifySite> siteDetailsQueue) {
		this.client = new ShopifyClient();
		this.siteProcessingQueue = siteProcessingQueue;
		this.siteDetailsQueue = siteDetailsQueue;
	}

	@Override
	public void run() {
		while(1==1) {
			try {
				//System.out.println("Starting thread for : " + Thread.currentThread().getName());
				ShopifySite givenSite = this.siteProcessingQueue.take();
				if(givenSite.getFutureResponse().isFutureResponse()) {
					if(givenSite.getFutureResponse().getFutureResponse().isDone()) {
						client.processSite(givenSite);
						this.siteDetailsQueue.put(givenSite);
					} else {
						this.siteProcessingQueue.put(givenSite);
					}				 
				} else {
					client.processSite(givenSite);
					this.siteDetailsQueue.put(givenSite);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
