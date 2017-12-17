package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifySite;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyClient;
import com.cybermint.http.URLConnectionPool;

public class CrawlNextSiteForTechDetermination implements Runnable {

	private ShopifyClient client;
	private BlockingQueue<ShopifySite> pendingSitesQueue;
	private BlockingQueue<ShopifySite> siteProcessingQueue;
	
	public CrawlNextSiteForTechDetermination(BlockingQueue<ShopifySite> pendingSitesQueue, BlockingQueue<ShopifySite> siteProcessingQueue) {
		this.client = new ShopifyClient();
		this.pendingSitesQueue =  pendingSitesQueue;
		this.siteProcessingQueue = siteProcessingQueue;
	}

	@Override
	public void run() {
		while(1==1) {
			try {
				ShopifySite givenSite = this.pendingSitesQueue.take();
				client.getSiteContent(givenSite);
				this.siteProcessingQueue.put(givenSite);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
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
		int noOfProcessorThreads = noOfCrawlThreads*20;
		
		BlockingQueue<ShopifySite> pendingSitesQueue = new LinkedBlockingQueue<ShopifySite>(noOfCrawlThreads*20);
		BlockingQueue<ShopifySite> siteProcessingQueue = new LinkedBlockingQueue<ShopifySite>();
		BlockingQueue<ShopifySite> siteDetailsQueue = new LinkedBlockingQueue<ShopifySite>();
		
		
		ExecutorService DBSelectors = Executors.newFixedThreadPool(1);		
		ExecutorService crawlers = Executors.newFixedThreadPool(noOfCrawlThreads);
		ExecutorService processors = Executors.newFixedThreadPool(noOfProcessorThreads);
		ExecutorService DBUpdators = Executors.newFixedThreadPool(noOfDBUpdateThreads);
		
		DBSelectors.execute(new GetSitesForTechDetermination(pendingSitesQueue,noOfCrawlThreads*10));
		
		int i = 1;
		while(i<=noOfCrawlThreads) {
			crawlers.execute(new CrawlNextSiteForTechDetermination(pendingSitesQueue, siteProcessingQueue));
			i++;
		}
		
		int j = 1;
		while(j<=noOfProcessorThreads) {
			processors.execute(new ProcessSiteTechDetails(siteProcessingQueue, siteDetailsQueue));
			j++;
		}
		
		int k = 1;
		while(k<=noOfDBUpdateThreads) {
			DBUpdators.execute(new UpdateSiteTechDetails(siteDetailsQueue, recordsPerDBBatchUpdate));
			k++;
		}
		
		DBSelectors.shutdown();
		crawlers.shutdown();
		processors.shutdown();
		DBUpdators.shutdown();
		
		while(1==1) {
			System.out.println("PendingSitesQueue : " + pendingSitesQueue.size() 
			+ " , SiteProcessingQueue : " + siteProcessingQueue.size()
			+ " , SiteDetailsQueue : " + siteDetailsQueue.size()
			);
			try {
				Thread.sleep(60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
