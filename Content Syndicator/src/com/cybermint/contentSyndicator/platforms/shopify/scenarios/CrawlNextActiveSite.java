package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyClient;

public class CrawlNextActiveSite implements Runnable {

	private ShopifyClient client;
	private BlockingQueue<ShopifySite> pendingSitesQueue;
	private BlockingQueue<ShopifyProduct> productRankingsQueue;
	
		
	public CrawlNextActiveSite(BlockingQueue<ShopifySite> pendingSitesQueue, BlockingQueue<ShopifyProduct> productRankingsQueue) {
		this.client = new ShopifyClient();
		this.pendingSitesQueue =  pendingSitesQueue;
		this.productRankingsQueue = productRankingsQueue;		
	}

	@Override
	public void run() {
		while(1==1) {
			try {
				ShopifySite givenSite = this.pendingSitesQueue.take();
				List<ShopifyProduct> products = client.getProductLinks(givenSite.getCrawlHeaderID()
						, givenSite.getSiteID(), givenSite.getStoreURL()
						, ShopifyClient.SORT_BY_BEST_SELLING, 200);
				for(ShopifyProduct aProduct : products) {
					this.productRankingsQueue.put(aProduct);
				}
				//this.DBExecutorService.execute(new UpdateProductRankings(products, givenSite));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {		
		int noOfCrawlThreads = new Integer(args[0]);
		int noOfDBUpdateThreads = new Integer(args[1]);
		int recordsPerDBBatchUpdate = new Integer(args[2]);
		
		BlockingQueue<ShopifyProduct> productRankingsQueue = new LinkedBlockingQueue<ShopifyProduct>();
		BlockingQueue<ShopifySite> pendingSitesQueue = new LinkedBlockingQueue<ShopifySite>(noOfCrawlThreads*3);
		
		ExecutorService DBSelectors = Executors.newFixedThreadPool(1);		
		ExecutorService crawlers = Executors.newFixedThreadPool(noOfCrawlThreads);
		ExecutorService DBUpdators = Executors.newFixedThreadPool(noOfDBUpdateThreads);
		
		DBSelectors.execute(new GetSitesForCrawl(pendingSitesQueue,noOfCrawlThreads*3));
		
		int i = 1;
		while(i<=noOfCrawlThreads) {
			crawlers.execute(new CrawlNextActiveSite(pendingSitesQueue, productRankingsQueue));
			i++;
		}
		
		int j = 1;
		while(j<=noOfDBUpdateThreads) {
			DBUpdators.execute(new UpdateProductRankings(productRankingsQueue, recordsPerDBBatchUpdate));
			j++;
		}
		
		DBSelectors.shutdown();
		crawlers.shutdown();
		DBUpdators.shutdown();
		
		while(1==1) {
			System.out.println("PendingSitesQueue : " + pendingSitesQueue.size() + " , ProductRankingsQueue : " + productRankingsQueue.size());
			try {
				Thread.sleep(60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
