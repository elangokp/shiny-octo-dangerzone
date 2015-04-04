package com.cybermint.utils.custom;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.http.client.utils.URIUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.jetty.html.Page;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.cybermint.pages.Page;

public class HopLinkURLFinder {

	public static void main(String[] args) throws URISyntaxException {
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
		/*driver.get("http://www.google.com");
        driver.getTitle();
        driver.findElementByName("q").sendKeys("Elango");
        driver.findElementByName("q").submit();
        System.out.println(driver.getTitle());*/
		driver.quit();

	}

}
