/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.pages;

import com.cybermint.pages.Page;
import com.cybermint.serpScraper.google.utils.TempBan;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Elango
 */
public class GoogleSearchPage extends Page{

    @FindBy(name = "q") protected WebElement searchTextBox;
    @FindBy(name = "btnK") protected WebElement searchButton;
    private String searchString;
    private TempBan aTempBan;
    private HashMap<String,String> isBanOrSerpElements;

    public GoogleSearchPage (WebDriver driver, TempBan aTempBan) {
        super(driver);
        this.aTempBan = aTempBan;
        driver.get("http://www.google.com/search?complete=0&gl=US");
        isBanOrSerpElements = new HashMap<String, String>();
        isBanOrSerpElements.put("xpath", "(//h3[@class=\"r\"])[1]/a");
        isBanOrSerpElements.put("name", "q");
        isBanOrSerpElements.put("xpath", "//form[@action=\"CaptchaRedirect\"]");
        checkAndWaitForTempBan("home");
        //this.waitForElementToLoad("name", "q");
        //this.waitForElementToLoad("name", "btnK");
        this.initialize();
    }

    public GoogleSearchPage (WebDriver driver, String searchString) {
        super(driver);
        this.searchString = searchString;
    }

    public GoogleSearchPage (WebDriver driver) {
        super(driver);
    }
    
    public GoogleSERPage searchFor(String searchString) {
        this.searchString = searchString;
        searchTextBox.clear();
        searchTextBox.click();
        searchTextBox.sendKeys(searchString);
//        searchButton.click();
        searchTextBox.submit();
        checkAndWaitForTempBan("serp");
        //super.waitForElementToLoad("xpath", "(//h3[@class='r'])[1]/a");
        return PageFactory.initElements(driver, GoogleSERPage.class);
    }

    private void checkAndWaitForTempBan(String where) {
    	/*System.out.println("Inside checkAndWaitForTempBan");
    	System.out.println(driver.getCurrentUrl());
        if(driver.getCurrentUrl().contains("sorry")) {
            //aTempBan.setBannedAsTrue();
            while(aTempBan.isBanned()) {
                try {
                    Thread.sleep(16 * 60 * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GoogleSearchPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        	System.out.println("Inside sorry");
            GoogleSorryPage aGoogleSorryPage = new GoogleSorryPage(driver);
            aGoogleSorryPage.submitCaptcha();
            driver.get("http://www.google.com/search?complete=0&gl=US");
            if("serp".equalsIgnoreCase(where)) {
                this.initialize();
                this.searchFor(searchString);
            }            
        }*/
    	super.waitForOneOfTheElementToLoad(isBanOrSerpElements);
        while(driver.getCurrentUrl().contains("sorry")) {
        	GoogleSorryPage aGoogleSorryPage = new GoogleSorryPage(driver);
            aGoogleSorryPage.submitCaptcha();
            super.waitForOneOfTheElementToLoad(isBanOrSerpElements);
        }
    }
    
    public GooglePreferences ClickSearchSettings() {
        driver.findElement(By.xpath("//a[@id=\"gbg5\"]")).click();
        driver.findElement(By.linkText("Search settings")).click();
        super.waitForElementToLoad("xpath", "//input[@id=\"suggmid\"]");
        return PageFactory.initElements(driver, GooglePreferences.class);
    }

}
