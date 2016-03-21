package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;

public class YahooGeminiHomePage extends Page {
	
	@FindBy(xpath = "//a[contains(text(), \"Sign in\")]")
    protected WebElement signInLink;

	public YahooGeminiHomePage(WebDriver driver) {
		super(driver);
		driver.get("https://gemini.yahoo.com");
		if(super.waitForElementToLoad("xpath", "//a[contains(text(), \"Sign in\")]",10)) {
			this.initialize();
		} else if(super.waitForElementToLoad("css", "div.date-range-selector",10)) {
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
