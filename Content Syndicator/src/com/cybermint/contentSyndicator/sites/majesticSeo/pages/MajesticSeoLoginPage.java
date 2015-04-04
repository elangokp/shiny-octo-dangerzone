package com.cybermint.contentSyndicator.sites.majesticSeo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.contentSyndicator.sites.majesticSeo.formObjects.MajesticSeoLoginFormObject;
import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;

public class MajesticSeoLoginPage extends Page{

   @FindBy(xpath = "//input[@name=\"EmailAddress\" and @class=\"longTextBox\"]") 
   protected WebElement emailAddressTextBox;
   
   @FindBy(xpath = "//input[@name=\"Password\" and @class=\"longTextBox\"]") 
   protected WebElement passwordTextBox;
   
   @FindBy(xpath = "//div[@class=\"paddedDiv\"]//input[@id=\"RememberMe\"]") 
   protected WebElement rememberMeRadioButton;
   
   @FindBy(xpath = "//div[@class=\"paddedDiv\"]//input[@type=\"submit\"]") 
   protected WebElement submitButton;

    public MajesticSeoLoginPage(WebDriver driver) {
        super(driver);
        driver.get("http://www.majesticseo.com/account/login");
        this.initialize();
    }

    public MajesticSeoDashboardPage loginAs(String username, String password) {
    	clearAndType(emailAddressTextBox, username);
    	clearAndType(passwordTextBox, password);
        submitButton.click();
        this.waitForElementToLoad("linkText", "Logout");
        return PageFactory.initElements(driver, MajesticSeoDashboardPage.class);
    }
    
    public MajesticSeoDashboardPage loginAs(MajesticSeoLoginFormObject aMajesticSeoLoginFormObject) {
    	//emailAddressTextBox = driver.findElement(By.xpath("//input[@name=\"EmailAddress\"]"));
    	clearAndType(emailAddressTextBox, aMajesticSeoLoginFormObject.getEmail());
    	clearAndType(passwordTextBox, aMajesticSeoLoginFormObject.getPassword());
    	rememberMeRadioButton.click();
        submitButton.click();
        this.waitForElementToLoad("linkText", "Logout");
        return PageFactory.initElements(driver, MajesticSeoDashboardPage.class);
    }
    

	public static void main(String[] args) {
		WebDriver driver = Page.constructDriver("firefox");
		MajesticSeoLoginFormObject aMajesticSeoLoginFormObject = new MajesticSeoLoginFormObject("pelangs@gmail.com", "123majestic!@#", true);
		MajesticSeoLoginPage aMajesticSeoLoginPage = new MajesticSeoLoginPage(driver);
		//MajesticSeoDashboardPage aMajesticSeoDashboardPage = aMajesticSeoLoginPage.loginAs("pelangs@gmail.com", "123majestic!@#");
		MajesticSeoDashboardPage aMajesticSeoDashboardPage =  aMajesticSeoLoginPage.loginAs(aMajesticSeoLoginFormObject);
		//aMajesticSeoDashboardPage.goToSiteExplorer();
		MajesticSeoBulkBacklinksCheckerPage aMajesticSeoBulkBacklinksCheckerPage = aMajesticSeoDashboardPage.goToBulkBacklinkChecker();
		List<String> urls = TextFileReaderUtils.readLinesAsList("F:/My Dropbox/Website Campaigns/02.Panic Attacks/serp.txt", false);
		MajesticSeoBulkBacklinksCheckerResultsPage aMajesticSeoBulkBacklinksCheckerResultsPage = aMajesticSeoBulkBacklinksCheckerPage.queryHistoricBacklinksCount(urls);
		aMajesticSeoBulkBacklinksCheckerResultsPage.getBackLinksCount();
		//driver.close();
	}

}
