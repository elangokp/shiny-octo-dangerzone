/**
 * 
 */
package com.cybermint.serpScraper.google.scenarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.serpScraper.google.pages.GoogleSERPage;
import com.cybermint.serpScraper.google.pages.GoogleSearchPage;
import com.cybermint.serpScraper.google.utils.TempBan;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

/**
 * @author Elango
 *
 */
public class GetGoogleRelatedSearches implements Callable {

	private ObjectPool driverPool;
    private String searchString;
    private TempBan aTempBan;
    
    public GetGoogleRelatedSearches (ObjectPool driverPool, String searchString, TempBan aTempBan) {
    	this.driverPool = driverPool;
        this.searchString = searchString;
        this.aTempBan = aTempBan;
    }
    
    /* (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public List<String> call() throws Exception {
		WebDriver driver = null;
		List<String> relatedSearches = new ArrayList<String>();
        try {
			driver = (WebDriver) driverPool.borrowObject();
			GoogleSearchPage aGoogleSearchPage = new GoogleSearchPage(driver,aTempBan);
			GoogleSERPage aGoogleSERPage = aGoogleSearchPage.searchFor(searchString);
			relatedSearches = aGoogleSERPage.getRelatedSearches();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			driverPool.invalidateObject(driver);
            System.out.println("Exception occured While retrieving related searches for keyword : " + searchString);
			e.printStackTrace();
		} finally {
			driverPool.returnObject(driver);
		}
		return relatedSearches;
	}
	
	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
		TempBan aTempBan = new TempBan();
		ArrayList<String> keywordsWithRelatedSearches = new ArrayList<String>();
		ThreadPoolExecutor es = new ThreadPoolExecutor(0,5,5,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
		List<String> allMainKeywords = TextFileReaderUtils.readLinesAsList("G:/Dropbox/Website Campaigns/Metadata/get-ex-back-keywords.txt", true);
		for(String aKeyword:allMainKeywords) {
			System.out.println(aKeyword);
			GetGoogleRelatedSearches aGetGoogleRelatedSearches = new GetGoogleRelatedSearches(driverPool,aKeyword,aTempBan);
			Future<List<String>> relatedSearchesFutures = es.submit(aGetGoogleRelatedSearches);
			List<String> relatedSearches = relatedSearchesFutures.get();
			StringBuffer sb = new StringBuffer();
			sb.append(aKeyword).append(",");
			sb.append("{");
        	for(int i=0;i<relatedSearches.size();i++) {
        		sb.append(StringUtils.remove(relatedSearches.get(i),","));
        		if(i<(relatedSearches.size()-1)) {
        			sb.append("|");
        		}
        	}
        	sb.append("}");
        	keywordsWithRelatedSearches.add(sb.toString());
        	System.out.println(sb.toString());
		}
		TextFileWriterUtils.writeListAsLines(keywordsWithRelatedSearches, "G:/Dropbox/Website Campaigns/Metadata/get-ex-back-keywords-related.csv", false);
		es.shutdown();
	}

	

}
