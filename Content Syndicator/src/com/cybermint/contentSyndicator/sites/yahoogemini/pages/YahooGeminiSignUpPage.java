package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class YahooGeminiSignUpPage extends Page {

	public YahooGeminiSignUpPage(WebDriver driver) {
		super(driver);
	}
	
	public YahooGeminiDashboardPage signup(String companyName, String companyWebsite, String email, String phoneNumber){
		WebElement companyNameTextBox = driver.findElement(By.id("companyName"));
		super.clearAndType(companyNameTextBox, companyName);
		WebElement companyWebsiteTextBox = driver.findElement(By.id("companyWebsite"));
		super.clearAndType(companyWebsiteTextBox, companyWebsite);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		super.clearAndType(emailTextBox, email);		
		WebElement phoneTextBox = driver.findElement(By.id("phone"));
		super.waitForElementToBeInteractable(phoneTextBox);
		super.clearAndType(phoneTextBox, phoneNumber);
		WebElement countrySelectBox = driver.findElement(By.xpath("//div[@ng-model=\"advertiser.selectedBillingCountry\"]")); 
		countrySelectBox.click();
		WebElement unitedStatesSelectOption = driver.findElement(By.xpath("//div[@ng-model=\"advertiser.selectedBillingCountry\"]//div[text()=\"United States\"]")); 
		unitedStatesSelectOption.click();
		
		WebElement timezoneSelectBox = driver.findElement(By.xpath("//div[@ng-model=\"advertiser.selectedTimeZone\"]")); 
		timezoneSelectBox.click();	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		((JavascriptExecutor) driver).executeScript("document.evaluate('//div[@ng-model=\"advertiser.selectedTimeZone\"]//div[contains(text(),\"(GMT-08:00) Pacific Time\")]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();");
		
		WebElement pstSelectOption = driver.findElement(By.xpath("//div[@ng-model=\"advertiser.selectedTimeZone\"]//div[contains(text(),\"(GMT-08:00) Pacific Time\")]")); 
		pstSelectOption.click();
		
		WebElement currencySelectBox = driver.findElement(By.xpath("//div[@ng-model=\"advertiser.selectedCurrency\"]")); 
		currencySelectBox.click();
		WebElement usdSelectOption = driver.findElement(By.xpath("//div[@ng-model=\"advertiser.selectedCurrency\"]//div[text()=\"USD\"]")); 
		usdSelectOption.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//label[@for=\"tnc\"]")),1,1).click().build().perform();
		
		WebElement submitButton = driver.findElement(By.cssSelector("button.btn-primary")); 
		submitButton.click();
		
		super.waitForElementToLoad("css", "a.btn-primary");
		return PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
	}

}
