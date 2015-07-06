/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.pages;

import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.pages.Page;
import com.cybermint.serpScraper.google.utils.TempBan;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class GoogleSERPage extends Page{

    //@FindBy(className = "l") protected List<WebElement> SERPLinks;
	protected List<WebElement> SERPLinks;
	protected List<WebElement> ADLinks;
    @FindBy(id = "resultStats") protected WebElement resultStats;
    @FindBy(id = "ofr") protected WebElement endOfResultsNotice;
    @FindBy(id = "pnnext") protected WebElement nextPageLink;
    @FindBy(xpath = "//div[@id=\"botstuff\"]") protected WebElement relatedSearchesDiv;
    //@FindBy(xpath = "//div[@id=\"botstuff\"]//div[@class=\"brs_col\"][1]") protected WebElement relatedSearchDiv1;
    //@FindBy(xpath = "//div[@id=\"botstuff\"]//div[@class=\"brs_col\"][1]") protected WebElement relatedSearchDiv2;
    private HashMap<String,String> isBanOrSerpElements;
    
    public GoogleSERPage (WebDriver driver) {
        super(driver);
        this.initialize();
        isBanOrSerpElements = new HashMap<String, String>();
        isBanOrSerpElements.put("xpath", "//h3[@class=\"r\"])[1]/a");
        isBanOrSerpElements.put("xpath", "//form[@action=\"CaptchaRedirect\"]");
        isBanOrSerpElements.put("name", "q");
    }

    public List<String> getSERPLinks() {
        List<String> links = new ArrayList<String>();
        SERPLinks = driver.findElements(By.xpath("//h3[@class=\"r\"]/a"));
        for(WebElement SERPLink:SERPLinks) {
            links.add(SERPLink.getAttribute("href"));
        }
        return links;
    }
    
    public List<String> getAdLinks() {
        List<String> links = new ArrayList<String>();
        ADLinks = driver.findElements(By.xpath("//li[@class=\"ads-ad\"]/div[@class=\"ads-visurl\"]/cite"));
        for(WebElement ADLink:ADLinks) {
            links.add("http://" + ADLink.getText().replace("\"", "").trim());
        }
        return links;
    }
    
    public List<String> getRelatedSearches() {
        List<String> relatedSearches = new ArrayList<String>();
        relatedSearchesDiv = driver.findElement(By.xpath("//div[@id=\"botstuff\"]"));
        try {
			List<WebElement> relatedSearchElements = relatedSearchesDiv.findElements(By.xpath("//div[@class=\"brs_col\"]//p"));
			for(WebElement aRelatedSearchElement:relatedSearchElements) {
				relatedSearches.add(aRelatedSearchElement.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        return relatedSearches;
    }

    public BigDecimal getTotalResults() {
        String totalResults = resultStats.getText();
        totalResults = totalResults.replaceAll("About ", "");
        totalResults = totalResults.replaceAll(" results.*", "");
        totalResults = totalResults.replaceAll(",", "");
        BigDecimal totalResultsAsNumber = new BigDecimal(totalResults);
        return totalResultsAsNumber;
    }

    public BigDecimal getRealResults() {
        String realResults = endOfResultsNotice.getText();
        realResults = realResults.replaceAll(".* similar to the ", "");        
        realResults = realResults.replaceAll(" already displayed.*\n.*", "");       
        realResults = realResults.replaceAll(",", "");
        BigDecimal realResultsAsNumber = new BigDecimal(realResults);
        return realResultsAsNumber;
    }

    public boolean isNextPageAvailable() {
        boolean isAvailable = true;
        try {
            nextPageLink.getText();
        } catch(Exception e) {
            //System.out.println(e);
            isAvailable = false;
        }
        return isAvailable;
    }

    public GoogleSERPage getNextSERPage() {
        nextPageLink.click();
        checkAndWaitForTempBan();
        super.waitForElementToLoad("xpath", "//h3[@class=\"r\"]/a");
        return PageFactory.initElements(driver, GoogleSERPage.class);
    }

        private void checkAndWaitForTempBan() {
/*        if(driver.getCurrentUrl().contains("sorry")) {
//            aTempBan.setBannedAsTrue();
//            while(aTempBan.isBanned()) {
//                try {
//                    Thread.sleep(16 * 60 * 1000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(GoogleSearchPage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
            GoogleSorryPage aGoogleSorryPage = new GoogleSorryPage(driver);
            aGoogleSorryPage.submitCaptcha();
            //driver.get("http://www.google.com/search?complete=0&gl=US");
            try {
                this.wait(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GoogleSERPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    	super.waitForOneOfTheElementToLoad(isBanOrSerpElements);
        while(driver.getCurrentUrl().contains("sorry")) {
        	GoogleSorryPage aGoogleSorryPage = new GoogleSorryPage(driver);
            aGoogleSorryPage.submitCaptcha();
            super.waitForOneOfTheElementToLoad(isBanOrSerpElements);
        }
    }
   
   public static void main(String args[]) throws Exception {
	   PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox");
	   GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
	   driverPool.setLifo(false);
	   WebDriver driver = (WebDriver) driverPool.borrowObject();
	   GoogleSearchPage aGoogleSearchPage = new GoogleSearchPage(driver,new TempBan());
	   GoogleSERPage aGoogleSERPage = aGoogleSearchPage.searchFor("solar panel installation");
	   List<String> relatedSearches = aGoogleSERPage.getRelatedSearches();
	   for(String aRelatedSearch:relatedSearches) {
		   System.out.println(aRelatedSearch);
	   }
	   List<String> SERPLinks = aGoogleSERPage.getSERPLinks();
	   for(String aSERPLink:SERPLinks) {
		   System.out.println(aSERPLink);
	   }
	   List<String> ADLinks = aGoogleSERPage.getAdLinks();
	   for(String anADLink:ADLinks) {
		   System.out.println(anADLink);
	   }
   }
}
