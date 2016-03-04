package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class YahooGeminiHomePage extends Page {
	
	@FindBy(xpath = "//span[@ng-bind-html=\"signInText\"]/a")
    protected WebElement signInLink;

	public YahooGeminiHomePage(WebDriver driver) {
		super(driver);
		driver.get("https://gemini.yahoo.com");
		if(super.waitForElementToLoad("xpath", "//span[@ng-bind-html=\"signInText\"]/a",10)) {
			this.initialize();
		} else if(super.waitForElementToLoad("id", "datepicker",10)) {
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
			aYahooGeminiDashboardPage.logout();
			this.initialize();
		}
        
	}
	
	public YahooGeminiLoginPage clickSignInLink() {
		signInLink.click();
        super.waitForElementToLoad("id", "login-username");
        return PageFactory.initElements(driver, YahooGeminiLoginPage.class);
    }

}
