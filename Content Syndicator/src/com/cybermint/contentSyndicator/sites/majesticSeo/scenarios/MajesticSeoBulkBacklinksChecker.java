package com.cybermint.contentSyndicator.sites.majesticSeo.scenarios;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.apache.commons.pool.impl.StackObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.pojo.UrlProperties;
import com.cybermint.contentSyndicator.sites.majesticSeo.factories.PoolableMajesticseoDriverFactory;
import com.cybermint.contentSyndicator.sites.majesticSeo.pages.MajesticSeoBulkBacklinksCheckerPage;
import com.cybermint.contentSyndicator.sites.majesticSeo.pages.MajesticSeoBulkBacklinksCheckerResultsPage;
import com.cybermint.contentSyndicator.sites.majesticSeo.pages.MajesticSeoDashboardPage;
import com.cybermint.contentSyndicator.sites.majesticSeo.utils.MajesticSeoUtils;
import com.cybermint.factories.webdrivers.utils.DriverPoolUtils;
import com.cybermint.serpScraper.domains.helpers.UrlHelper;

public class MajesticSeoBulkBacklinksChecker implements Callable<List<UrlProperties>> {

	private ObjectPool driverPool;
	private List<String> urls;
	private String indexType;
	public MajesticSeoBulkBacklinksChecker(ObjectPool driverPool, List<String> urls, String indexType) {
		this.driverPool = driverPool;
		this.urls = urls;
		this.indexType = indexType;
	}

	@Override
	public List<UrlProperties> call() throws Exception {
		List<UrlProperties> UrlPropertiesList = null;
		WebDriver driver = null;
		try {
			driver = (WebDriver) driverPool.borrowObject();
			MajesticSeoDashboardPage aMajesticSeoDashboardPage = new MajesticSeoDashboardPage(driver);
			MajesticSeoBulkBacklinksCheckerPage aMajesticSeoBulkBacklinksCheckerPage = aMajesticSeoDashboardPage.goToBulkBacklinkChecker();
			MajesticSeoBulkBacklinksCheckerResultsPage aMajesticSeoBulkBacklinksCheckerResultsPage = null;
			if(indexType.equalsIgnoreCase("H")) {
				aMajesticSeoBulkBacklinksCheckerResultsPage = aMajesticSeoBulkBacklinksCheckerPage.queryHistoricBacklinksCount(urls);
			} else if(indexType.equalsIgnoreCase("F")) {
				aMajesticSeoBulkBacklinksCheckerResultsPage = aMajesticSeoBulkBacklinksCheckerPage.queryFreshBacklinksCount(urls);
			}
			UrlPropertiesList = aMajesticSeoBulkBacklinksCheckerResultsPage.getBackLinksCount();
		} catch (NoSuchElementException e) {
			driverPool.invalidateObject(driver);
			e.printStackTrace();
		} catch (IllegalStateException e) {
			driverPool.invalidateObject(driver);
			e.printStackTrace();
		} catch (Exception e) {
			driverPool.invalidateObject(driver);
			e.printStackTrace();
		} finally {
			driverPool.returnObject(driver);
		}
		return UrlPropertiesList;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericObjectPool majesticSeoLoginFormObjectPool = MajesticSeoUtils.getLoginObjectsPool("C:/majestiseologins.txt");		
		PoolableMajesticseoDriverFactory aPoolableMajesticseoDriverFactory = new PoolableMajesticseoDriverFactory("firefox",majesticSeoLoginFormObjectPool);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableMajesticseoDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
		DriverPoolUtils.initiateObjects(driverPool, 2);
		ThreadPoolExecutor es = new ThreadPoolExecutor(2,20,Long.MAX_VALUE,TimeUnit.NANOSECONDS,new LinkedBlockingQueue<Runnable>());
		System.out.println("Inside Main... ");
		Boolean isAvailable = true;
		int counter = 0;
		while(isAvailable) {
			System.out.println("isAvailable is true... for count " + ++counter + " times");
			List<String> urls = UrlHelper.getDomainsWhereMajesticseoToDomainIsNull(20);
			if(urls.size()>0) {
				System.out.println("Urls size is greater than zero... for count " + counter + " times");
				while(es.getQueue().size()>2) {
					try {
						System.out.println("Executor pool active count is greater than five... for count " + counter + " times");
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Going to submit to thread pool... for count " + counter + " times");
				Future<List<UrlProperties>> urlPropertiesList = es.submit(new MajesticSeoBulkBacklinksChecker(driverPool,urls,"H"));
				es.execute(new SaveMajesticseoUrlsToDB(urlPropertiesList,"domain"));
			} else {
				isAvailable = false;
				System.out.println("isAvailable is false... for count " + ++counter + " times");
			}
		}
	}


}
