package com.cybermint.scenarios.generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileReaderUtils;

public class GetSelectedItemsFromPage implements Callable {
	
    private ObjectPool driverPool;
    private String pageURL;
    private String xpathSelector;
    private String attributeName;
	
	public GetSelectedItemsFromPage(ObjectPool driverPool, String pageURL, String xpathSelector, String attributeName) {
		this.driverPool = driverPool;
		this.pageURL = pageURL;
		this.xpathSelector = xpathSelector;
		this.attributeName = attributeName;
	}
	
	public ArrayList<String> call() {
		WebDriver driver = null;
		ArrayList<String> selectedItems = new ArrayList<String>();
		try {
			driver = (WebDriver) driverPool.borrowObject();
			driver.get(pageURL);
			for(WebElement anElement : driver.findElements(By.xpath(xpathSelector))) {
				if(null == attributeName) {
					selectedItems.add(anElement.getText().trim());
				} else {
					selectedItems.add(anElement.getAttribute(attributeName).trim());
				}
				
			}
			for(String item: selectedItems) {
				System.out.println(item);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
        	try {
				driverPool.returnObject(driver);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
		
		return selectedItems;
	}

	public static void main(String[] args) throws Exception {
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("phantomjs");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
		List<String> linesList = TextFileReaderUtils.readLinesAsList("C:/Users/elangokp.AHC.000/Dropbox/Projects/PPV/Solar installation US/solar companies scrape.txt",true);
		String xpathSelector = "//span[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/span[2]";
		//String xpathSelector = "//*[@id='topsolartable']/tbody/tr/td[2]/a";
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(String url: linesList) {
			GetSelectedItemsFromPage aGetSelectedItemsFromPage = new GetSelectedItemsFromPage(driverPool,url,xpathSelector, null);
			Future<ArrayList<String>> selectedItems = es.submit(aGetSelectedItemsFromPage);
		}
		es.shutdown();
		while(!es.isTerminated()) {
			Thread.sleep(30000);
		}
		driverPool.clear();		
		driverPool.close();
	}

}
