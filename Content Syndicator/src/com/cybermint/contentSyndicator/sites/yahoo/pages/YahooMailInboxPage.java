package com.cybermint.contentSyndicator.sites.yahoo.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class YahooMailInboxPage extends Page{

	public YahooMailInboxPage(WebDriver driver) {
		super(driver);
	}
	
	public void logout() {
		((JavascriptExecutor) driver).executeScript("document.getElementById('yucs-signout').click();");
		super.waitForElementToLoad("id", "uh-signin");
	}
	
	public YahooMailAccountSecurityPage getAccountSecurityPage() {
		driver.get("https://login.yahoo.com/account/security");
		super.waitForElementToLoad("id", "comm-channel");
		return PageFactory.initElements(driver, YahooMailAccountSecurityPage.class);
	}

}
