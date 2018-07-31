package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyClient;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyDBUtils;
import com.cybermint.http.URLConnectionPool;

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
				List<ShopifyProduct> products = client.getProductLinks(givenSite
						, ShopifyClient.SORT_BY_BEST_SELLING, 500);
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
		System.setProperty("jsse.enableSNIExtension", "false");
		
		int noOfCrawlThreads = Integer.parseInt(args[0]);
		int noOfDBUpdateThreads = Integer.parseInt(args[1]);
		int recordsPerDBBatchUpdate = Integer.parseInt(args[2]);
		int maxActiveConnections = Integer.parseInt(args[3]);
		
		if(args[4].equalsIgnoreCase("yes")) {
			ShopifyClient.shouldUseProxy = true;
		} else {
			ShopifyClient.shouldUseProxy = false;
		}
		
		URLConnectionPool.setMaxActiveConnections(maxActiveConnections);
		
		BlockingQueue<ShopifyProduct> productRankingsQueue = new LinkedBlockingQueue<ShopifyProduct>();
		BlockingQueue<ShopifySite> pendingSitesQueue = new LinkedBlockingQueue<ShopifySite>(noOfCrawlThreads*3);
		
		ExecutorService DBSelectors = Executors.newFixedThreadPool(1);		
		ExecutorService crawlers = Executors.newFixedThreadPool(noOfCrawlThreads);
		ExecutorService DBUpdators = Executors.newFixedThreadPool(noOfDBUpdateThreads);
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		int maxRetryRuns = 20;
		int retryNo = 0;
		while(retryNo <= maxRetryRuns) {
			
			dbutils.UpdateInprogressRankCrawlSites();
			
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
			
			int k = 1;
			
			while(k<5) {
				System.out.println("PendingSitesQueue : " + pendingSitesQueue.size() + " , ProductRankingsQueue : " + productRankingsQueue.size());
				
				if(pendingSitesQueue.size()==0 && productRankingsQueue.size()==0) {
					k++;
				} else {
					k = 1;
				}
				
				try {
					Thread.sleep(60*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			retryNo++;
		}
		
		
		DBSelectors.shutdown();
		crawlers.shutdown();
		DBUpdators.shutdown();
		
		
	}

}
