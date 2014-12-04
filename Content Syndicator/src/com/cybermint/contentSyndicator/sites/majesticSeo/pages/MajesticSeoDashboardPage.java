package com.cybermint.contentSyndicator.sites.majesticSeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class MajesticSeoDashboardPage extends Page {

	@FindBy(linkText = "Logout")
    protected WebElement logOutLink;
	
	public MajesticSeoDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public MajesticSeoLoginPage logOut() {
		logOutLink.click();
        this.waitForElementToLoad("xpath", "//input[@name=\"EmailAddress\"]");
        return PageFactory.initElements(driver, MajesticSeoLoginPage.class);
    }
	
	public MajesticSeoSiteExplorerPage goToSiteExplorer() {
		driver.get("https://www.majesticseo.com/reports/site-explorer");
        this.waitForElementToLoad("xpath", "//input[@value=\"Explore\"]");
        return PageFactory.initElements(driver, MajesticSeoSiteExplorerPage.class);
    }
	
	public MajesticSeoBulkBacklinksCheckerPage goToBulkBacklinkChecker() {
		driver.get("https://www.majesticseo.com/reports/bulk-backlink-checker");
        this.waitForElementToLoad("xpath", "//input[@name=\"getcounts\"]");
        return PageFactory.initElements(driver, MajesticSeoBulkBacklinksCheckerPage.class);
    }

}
