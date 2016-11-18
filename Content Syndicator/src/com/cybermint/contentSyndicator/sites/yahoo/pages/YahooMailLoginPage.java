/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.sites.yahoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.pages.Page;

/**
 *
 * @author Elango
 */
public class YahooMailLoginPage extends Page{

	@FindBy(id = "login-username")
    protected WebElement usernameTextBox;
    @FindBy(id = "login-passwd")
    protected WebElement passwordTextBox;
    @FindBy(id = "login-signin")
    protected WebElement signInButton;
    
    private int retryCount = 0;

	public YahooMailLoginPage(WebDriver driver) {
		super(driver);
		driver.get("https://mail.yahoo.com");
		if(super.waitForElementToLoad("id", "login-username",10)) {
			this.initialize();
		} else if(super.waitForElementToLoad("id", "toolbar",10)) {
			YahooMailInboxPage aYahooMailInboxPage = PageFactory.initElements(driver, YahooMailInboxPage.class);
			aYahooMailInboxPage.logout();
			this.initialize();
		}
	}
	
	public YahooMailInboxPage signInAs(String username, String password) {
		try {
			super.waitForElementToLoad("id", "login-username");	
			usernameTextBox.clear();
			usernameTextBox.click();
			usernameTextBox.sendKeys(username);
			super.waitForElementToLoad("id", "login-signin");
			if(!super.waitForElementToLoad("id", "login-passwd",2)) {
				signInButton.click();
			}
			super.waitForElementToLoad("id", "login-passwd");	
			passwordTextBox.clear();
			passwordTextBox.click();
			passwordTextBox.sendKeys(password);
			/*if(super.waitForElementToLoad("xpath", "//label[@for=\"persistent\" and contains(@id,\"yui\")]",1)) { //checks if the Stay signed in option is selected
				WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\" and contains(@id,\"yui\")]")); 
				staySignedInCheckBox.click(); //de-selects the stay signed in option.
				//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			}*/
			//WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\"]"));			
			//staySignedInCheckBox.click(); //de-selects the stay signed in option.
			//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			signInButton.click();
			/*
			while(driver.getCurrentUrl().contains("campaign")) {
				Thread.sleep(300);
			}	
			Thread.sleep(1000);
			if(driver.getCurrentUrl().contains("scrumb")) {
				driver.get("https://gemini.yahoo.com");
			}
			if(driver.getCurrentUrl().contains("home") && retryCount<3) {
				retryCount++;
				this.signInAs(username, password);
			}*/
			Thread.sleep(3000);
			if(driver.getCurrentUrl().contains("comm-channel")) {
				super.waitForElementToLoad("css", "div.refresh-cta-container button");
				driver.findElement(By.cssSelector("div.refresh-cta-container button")).click();
			}
			if(super.waitForElementToLoad("id", "skipbtn",10)) {
				((JavascriptExecutor) driver).executeScript("document.getElementById('skipbtn').click();");
			}
			super.waitForElementToLoad("id", "toolbar");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, YahooMailInboxPage.class);
    }

}
