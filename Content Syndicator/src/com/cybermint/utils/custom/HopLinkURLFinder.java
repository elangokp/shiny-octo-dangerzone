package com.cybermint.utils.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool.impl.GenericObjectPool;

import com.cybermint.contentSyndicator.pojo.UrlProperties;
import com.cybermint.contentSyndicator.sites.clickbank.objects.ClickbankOrderPageDetails;
import com.cybermint.contentSyndicator.sites.clickbank.scenarios.ClickbankOrderPageExtractor;
import com.cybermint.contentSyndicator.sites.clickbank.scenarios.SaveClickbankOrderPageDetails;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.factories.webdrivers.utils.DriverPoolUtils;
//import org.openqa.jetty.html.Page;
import com.cybermint.utils.TextFileReaderUtils;

public class HopLinkURLFinder {
	

	public static void main(String[] args) {
		String affiliateID = "pelangs";
		String vendorReadFilePath = "C:\\Users\\elangokp\\Dropbox\\Projects\\Clickbank PPV Snipe\\New\\vendors-to-process.txt";
		String vendorWriteFilePath = "C:\\Users\\elangokp\\Dropbox\\Projects\\Clickbank PPV Snipe\\new\\vendors-processed.csv";
		String productImagesDirectoryPath = "C:\\Users\\elangokp\\Dropbox\\Projects\\Clickbank PPV Snipe\\new\\product-images\\";
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("phantomjs");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
		//DriverPoolUtils.initiateObjects(driverPool, 1);
		//ThreadPoolExecutor es = new ThreadPoolExecutor(2,20,Long.MAX_VALUE,TimeUnit.NANOSECONDS,new LinkedBlockingQueue<Runnable>());
		ExecutorService extractors = Executors.newFixedThreadPool(30);
		//ExecutorService savers = Executors.newFixedThreadPool(15);
		List<String> lines = TextFileReaderUtils.readLinesAsList(vendorReadFilePath, true);
		for(String line:lines) {
			String vendorID = line;
			Future<ArrayList<ClickbankOrderPageDetails>> clickbankOrderPageDetailsList = extractors.submit(new ClickbankOrderPageExtractor(driverPool, vendorID, affiliateID));
			extractors.execute(new SaveClickbankOrderPageDetails(clickbankOrderPageDetailsList, vendorWriteFilePath, productImagesDirectoryPath));
		}
	}
	
	/*public static void main(String[] args) throws URISyntaxException {
		String driverType = "firefox";
		WebDriver driver = Page.constructDriver(driverType);
		List<String> lines = TextFileReaderUtils.readLinesAsList("G:\\Dropbox\\Projects\\Clickbank PPV Snipe\\New\\vendors-to-process.txt", true);
		int recordsProcessed = 0;
		for(String line:lines) {
			if(recordsProcessed >= 100) {
				driver.quit();
				driver = Page.constructDriver(driverType);
				recordsProcessed = 0;
			}
			//String[] lineItems = line.split(",");
			String vendorID = line;
			String hoplink = "http://pelangs."+vendorID+".hop.clickbank.net";
			String paylink = "http://1.pelangs_"+vendorID+".pay.clickbank.net";
			String hoplinkUrlString;
			String paylinkUrlString;
			URI hoplinkUrl;
			String vendorNumber;
			String target;
			StringBuffer lineToSave = new StringBuffer();
			try {
				//driver.get(hoplink);
				//hoplinkUrlString = driver.getCurrentUrl();
				driver.get(paylink);
				paylinkUrlString = driver.getCurrentUrl();
				Boolean isProductEnabled = true;
				if(driver.findElement(By.tagName("body")).getText().contains("This product is inactive and")) {
					isProductEnabled = false;
				}
				//hoplinkUrl = new URI(hoplinkUrlString);
				URI paylinkUrl = new URI(paylinkUrlString);
				vendorNumber = paylinkUrl.getRawQuery().split("\\&")[1].split("=")[1];
				target = "ssl.clickbank.net/order/orderform.html*&vvvv="+vendorNumber+"&";
				lineToSave.append("\""+vendorID+"\"");
				lineToSave.append(",\""+target+"\"");
				lineToSave.append(",\""+isProductEnabled+"\"");
				lineToSave.append(",\""+vendorNumber+"\"");
				lineToSave.append(",\""+hoplink+"\"");
				lineToSave.append(",\""+paylink+"\"");
				lineToSave.append(",\""+paylinkUrlString+"\"");
				TextFileWriterUtils.writeString(lineToSave.toString(), "G:\\Dropbox\\Projects\\Clickbank PPV Snipe\\new\\vendors-processed.csv", true, true);
				System.out.println(lineToSave.toString());
			} catch (Exception e) {
				String exceptionLine = "EXCEPTION: " + vendorID + ",\"" + e.getMessage() + "\"";
				System.out.println(exceptionLine);
				TextFileWriterUtils.writeString(exceptionLine, "G:\\Dropbox\\Projects\\Clickbank PPV Snipe\\new\\vendors-errors.csv", true, true);
			}
			recordsProcessed++;
			
			//System.out.println(lineToSave);
        }
		driver.get("http://www.google.com");
        driver.getTitle();
        driver.findElementByName("q").sendKeys("Elango");
        driver.findElementByName("q").submit();
        System.out.println(driver.getTitle());
		driver.quit();

	}
*/
}