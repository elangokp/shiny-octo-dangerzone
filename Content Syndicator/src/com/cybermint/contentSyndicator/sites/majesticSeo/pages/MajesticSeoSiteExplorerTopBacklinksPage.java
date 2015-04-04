/**
 * 
 */
package com.cybermint.contentSyndicator.sites.majesticSeo.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;

import com.cybermint.contentSyndicator.sites.majesticSeo.formObjects.MajesticSeoLoginFormObject;
import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;

/**
 * @author Elango
 *
 */
public class MajesticSeoSiteExplorerTopBacklinksPage extends
		MajesticSeoSiteExplorerPage {

	@FindBy(xpath = "//a[text()=\"Download CSV\"]")
	protected WebElement downloadCSVLink;
	
	@FindBy(xpath = "//form[@action=\"/reports/site-explorer/top-backlinks\" and @name=\"urlSearch\"]//h3//span[2]")
	protected WebElement remainingLimitSpanElement;
	
	/**
	 * @param driver
	 */
	public MajesticSeoSiteExplorerTopBacklinksPage(WebDriver driver) {
		super(driver);
	}
	
	public void downloadCSV() {
		downloadCSVLink.click();
	}
	
	public Long waitFor() {
		Long waitTime = new Long(0);
		String spanText = remainingLimitSpanElement.getText();
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(spanText);
		ArrayList<Integer> numberList = new ArrayList<Integer> ();
		while(m.find()) {
			numberList.add(new Integer(m.group()));
		}
		Integer remainingDomainCount = numberList.get(0);
		Integer minutesRemaining = numberList.get(1);
		System.out.println(remainingDomainCount + " domains can be queried");
		System.out.println(minutesRemaining + " minutes remaining");
		if(remainingDomainCount>0) {
			return waitTime;
		} else {
			waitTime = new Long((minutesRemaining+1)*60*1000); //Converting to milli seconds. +1 for buffer time.
		}
		return waitTime;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.http.max-connections", 48);
        profile.setPreference("browser.download.dir", "E:\\Competetive-Research"); 
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream"); 
        FirefoxDriver driver = new FirefoxDriver(profile);
		MajesticSeoLoginFormObject aMajesticSeoLoginFormObject = new MajesticSeoLoginFormObject("pelangs@gmail.com", "123majestic!@#", true);
		MajesticSeoLoginPage aMajesticSeoLoginPage = new MajesticSeoLoginPage(driver);
		MajesticSeoDashboardPage aMajesticSeoDashboardPage =  aMajesticSeoLoginPage.loginAs(aMajesticSeoLoginFormObject);
		MajesticSeoSiteExplorerPage aMajesticSeoSiteExplorerPage = aMajesticSeoDashboardPage.goToSiteExplorer();
		List<String> urls = TextFileReaderUtils.readLinesAsList("E:/Dropbox/Website Campaigns/Competetive Research/urls-remaining.txt", true);
		for(String url:urls) {
				try {
					System.out.println(url + " : Started");
					MajesticSeoSiteExplorerResultsPage aMajesticSeoSiteExplorerResultsPage = aMajesticSeoSiteExplorerPage.queryHistoricBacklinksCount(url);
					MajesticSeoSiteExplorerTopBacklinksPage aMajesticSeoSiteExplorerTopBacklinksPage = aMajesticSeoSiteExplorerResultsPage.goToTopBacklinks();
					Long waitTime = aMajesticSeoSiteExplorerTopBacklinksPage.waitFor();
					while(waitTime>0) {
						System.out.println("Wait Detected while querying for : " + url);
						System.out.println("Will be Waiting for : " + waitTime + " milliseconds.");
						try {
							Thread.sleep(waitTime);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						aMajesticSeoSiteExplorerPage = aMajesticSeoDashboardPage.goToSiteExplorer();
						aMajesticSeoSiteExplorerResultsPage = aMajesticSeoSiteExplorerPage.queryHistoricBacklinksCount(url);
						aMajesticSeoSiteExplorerTopBacklinksPage = aMajesticSeoSiteExplorerResultsPage.goToTopBacklinks();
						waitTime = aMajesticSeoSiteExplorerTopBacklinksPage.waitFor();
					}
					aMajesticSeoSiteExplorerTopBacklinksPage.downloadCSV();
					aMajesticSeoSiteExplorerTopBacklinksPage.freshIndexRadioButton.click();
					aMajesticSeoSiteExplorerTopBacklinksPage.downloadCSV();
					System.out.println(url + " : Completed");
				} catch (Exception e) {
					System.out.println(url + " : Exception");
					aMajesticSeoSiteExplorerPage = aMajesticSeoDashboardPage.goToSiteExplorer();
					e.printStackTrace();
				}				
			
		}
	}

}
