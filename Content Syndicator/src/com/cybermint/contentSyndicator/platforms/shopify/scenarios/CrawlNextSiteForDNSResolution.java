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

public class CrawlNextSiteForDNSResolution implements Runnable {

	private ShopifyClient client;
	private BlockingQueue<ShopifySite> pendingSitesQueue;
	private BlockingQueue<ShopifySite> processedSitesQueue;
	
		
	public CrawlNextSiteForDNSResolution(BlockingQueue<ShopifySite> pendingSitesQueue, BlockingQueue<ShopifySite> processedSitesQueue) {
		this.client = new ShopifyClient();
		this.pendingSitesQueue =  pendingSitesQueue;
		this.processedSitesQueue = processedSitesQueue;		
	}

	@Override
	public void run() {
		while(1==1) {
			try {
				ShopifySite givenSite = this.pendingSitesQueue.take();
				client.getSiteDNS(givenSite);
				this.processedSitesQueue.put(givenSite);
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

		BlockingQueue<ShopifySite> pendingSitesQueue = new LinkedBlockingQueue<ShopifySite>(noOfCrawlThreads*3);
		BlockingQueue<ShopifySite> processedSitesQueue = new LinkedBlockingQueue<ShopifySite>();
		
		ExecutorService DBSelectors = Executors.newFixedThreadPool(1);		
		ExecutorService crawlers = Executors.newFixedThreadPool(noOfCrawlThreads);
		ExecutorService DBUpdators = Executors.newFixedThreadPool(noOfDBUpdateThreads);
		ShopifyDBUtils dbutils = new ShopifyDBUtils();
		int maxRetryRuns = 0;
		int retryNo = 0;
		while(retryNo <= maxRetryRuns) {
			
			//dbutils.UpdateInprogressRankCrawlSites();
			
			DBSelectors.execute(new GetSitesForDNSResolution(pendingSitesQueue,noOfCrawlThreads*3));
			
			int i = 1;
			while(i<=noOfCrawlThreads) {
				crawlers.execute(new CrawlNextSiteForDNSResolution(pendingSitesQueue, processedSitesQueue));
				i++;
			}
			
			int j = 1;
			while(j<=noOfDBUpdateThreads) {
				DBUpdators.execute(new UpdateSiteDNSDetails(processedSitesQueue, recordsPerDBBatchUpdate));
				j++;
			}
			
			int k = 1;
			
			while(k<5) {
				System.out.println("PendingSitesQueue : " + pendingSitesQueue.size() + " , ProcessedSitesQueue : " + processedSitesQueue.size());
				
				if(pendingSitesQueue.size()==0 && processedSitesQueue.size()==0) {
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
