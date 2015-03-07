package com.cybermint.utils.custom;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.client.utils.URIUtils;
import org.openqa.selenium.WebDriver;
//import org.openqa.jetty.html.Page;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.cybermint.pages.Page;

public class HopLinkURLFinder {

	public static void main(String[] args) throws URISyntaxException {
		WebDriver driver = Page.constructDriver("firefox");
		List<String> lines = TextFileReaderUtils.readLinesAsList("C:\\Users\\elangokp\\Dropbox\\Projects\\Clickbank PPV Snipe\\HoplinksForProcessing.csv", true);
		for(String line:lines) {
			String[] lineItems = line.split(",");
			String vendorID = lineItems[0];
			String hoplink = lineItems[1];
			String paylink = lineItems[2];
			String hoplinkUrlString;
			String paylinkUrlString;
			URI hoplinkUrl;
			String vendorNumber;
			String lineToSave = line;
			try {
				driver.get(hoplink);
				hoplinkUrlString = driver.getCurrentUrl();
				driver.get(paylink);
				paylinkUrlString = driver.getCurrentUrl();
				hoplinkUrl = new URI(hoplinkUrlString);
				URI paylinkUrl = new URI(paylinkUrlString);
				vendorNumber = paylinkUrl.getRawQuery().split("\\&")[1].split("=")[1];
				lineToSave = lineToSave + ",\"" + hoplinkUrlString 
						+ "\",\"" + hoplinkUrl.getHost() + "\",\"" + paylinkUrlString 
						+ "\",\"" + vendorNumber + "\"";
				TextFileWriterUtils.writeString(lineToSave, "C:\\Users\\elangokp\\Dropbox\\Projects\\Clickbank PPV Snipe\\Hoplinks-ff-processed.csv", true, true);
				System.out.println(lineToSave);
			} catch (Exception e) {
				lineToSave = line + ",\"" + e.getMessage() + "\"";
				System.out.println("EXCEPTION: " + lineToSave);
				TextFileWriterUtils.writeString(lineToSave, "C:\\Users\\elangokp\\Dropbox\\Projects\\Clickbank PPV Snipe\\Hoplinks-ff-errors.csv", true, true);
			}
			
			
			//System.out.println(lineToSave);
        }
		/*driver.get("http://www.google.com");
        driver.getTitle();
        driver.findElementByName("q").sendKeys("Elango");
        driver.findElementByName("q").submit();
        System.out.println(driver.getTitle());*/

	}

}
