package com.cybermint.contentSyndicator.platforms.shopify.scenarios;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

import com.cybermint.contentSyndicator.platforms.shopify.objects.ShopifyProduct;
import com.cybermint.contentSyndicator.platforms.shopify.utils.ShopifyClient;

public class CrawlNextActiveProduct implements Runnable {

	private ShopifyClient client;
	private BlockingQueue<ShopifyProduct> pendingProductsQueue;
	private BlockingQueue<ShopifyProduct> productProcessingQueue;
	
	
	public CrawlNextActiveProduct(BlockingQueue<ShopifyProduct> pendingProductsQueue, BlockingQueue<ShopifyProduct> productProcessingQueue) {
		this.client = new ShopifyClient();
		this.pendingProductsQueue = pendingProductsQueue;
		this.productProcessingQueue = productProcessingQueue;					
	}

	@Override
	public void run() {
		while(1==1) {
			try {
				//System.out.println("Starting thread for : " + Thread.currentThread().getName());
				ShopifyProduct givenProduct = this.pendingProductsQueue.take();
				//System.out.println(Thread.currentThread().getName() + " : Got Product : "+givenProduct.getProductURL());
				client.getProductContent(givenProduct);
				//System.out.println(Thread.currentThread().getName() + " : Completed Product : "+givenProduct.getProductURL());
				this.productProcessingQueue.put(givenProduct);
				//System.out.println("PendingProductsQueue : " + pendingProductsQueue.size() + "," + pendingProductsQueue.remainingCapacity() + " , ProductDetailsQueue : " + productDetailsQueue.size() + "," + productDetailsQueue.remainingCapacity());
				//System.out.println(Thread.currentThread().getName() + " : Product Added : "+givenProduct.getProductURL());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

	public static void main(String[] args) {
		
		int noOfCrawlThreads = new Integer(args[0]);
		int noOfDBUpdateThreads = new Integer(args[1]);
		int recordsPerDBBatchUpdate = new Integer(args[2]);
		int noOfProcessorThreads = noOfCrawlThreads*20;
		
		BlockingQueue<ShopifyProduct> pendingProductsQueue = new LinkedBlockingQueue<ShopifyProduct>(noOfCrawlThreads*20);
		BlockingQueue<ShopifyProduct> productProcessingQueue = new LinkedBlockingQueue<ShopifyProduct>();
		BlockingQueue<ShopifyProduct> productDetailsQueue = new LinkedBlockingQueue<ShopifyProduct>();
		
		
		ExecutorService DBSelectors = Executors.newFixedThreadPool(1);		
		ExecutorService crawlers = Executors.newFixedThreadPool(noOfCrawlThreads);
		ExecutorService processors = Executors.newFixedThreadPool(noOfProcessorThreads);
		ExecutorService DBUpdators = Executors.newFixedThreadPool(noOfDBUpdateThreads);
		
		DBSelectors.execute(new GetProductsForCrawl(pendingProductsQueue,noOfCrawlThreads*3));
		
		int i = 1;
		while(i<=noOfCrawlThreads) {
			crawlers.execute(new CrawlNextActiveProduct(pendingProductsQueue, productProcessingQueue));
			i++;
		}
		
		int j = 1;
		while(j<=noOfProcessorThreads) {
			processors.execute(new ProcessProductDetails(productProcessingQueue, productDetailsQueue));
			j++;
		}
		
		int k = 1;
		while(k<=noOfDBUpdateThreads) {
			DBUpdators.execute(new UpdateProductDetails(productDetailsQueue, recordsPerDBBatchUpdate));
			k++;
		}
		
		DBSelectors.shutdown();
		crawlers.shutdown();
		processors.shutdown();
		DBUpdators.shutdown();
		
		while(1==1) {
			System.out.println("PendingProductsQueue : " + pendingProductsQueue.size() 
			+ " , ProductProcessingQueue : " + productProcessingQueue.size()
			+ " , ProductDetailsQueue : " + productDetailsQueue.size()
			);
			try {
				Thread.sleep(60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}
