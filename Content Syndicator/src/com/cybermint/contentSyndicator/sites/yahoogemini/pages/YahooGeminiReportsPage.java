package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class YahooGeminiReportsPage extends Page {

	public YahooGeminiReportsPage(WebDriver driver) {
		super(driver);
	}
	
	public YahooGeminiReportsCreatePage goToReportsCreatepage() {
		String baseAdvertiserURL = driver.getCurrentUrl();
		String reportsBuilderURL = baseAdvertiserURL + "/create";
		driver.get(reportsBuilderURL);
		super.waitForElementToLoad("css", "button[ng-click*=\"onScheduleClick\"]");
		return PageFactory.initElements(driver, YahooGeminiReportsCreatePage.class);
	}
	
	private void selectAllScheduledReports() {
		super.waitForElementToLoad("xpath", "//grid[@id=\"reportsGrid\"]//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/label");
		WebElement selectAll = driver.findElement(By.xpath("//grid[@id=\"reportsGrid\"]//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/label"));
		selectAll.click();
		super.waitForElementToLoad("xpath", "//grid[@id=\"reportsGrid\"]//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/input[@checked=\"checked\"]/../label");
	}
	
	private boolean doesContainScheduledReports() {
		if(super.waitForElementToLoad("xpath", "//grid[@id=\"reportsGrid\"]//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr/td/label",5)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void deleteAllScheduledReports() {
		if(this.doesContainScheduledReports()){
			this.selectAllScheduledReports();
			WebElement actionsButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]"));
			actionsButton.click();
			super.waitForElementToLoad("xpath", "//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]");
			WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]"));
			deleteButton.click();
			super.waitForElementToLoad("xpath", "//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]");
			WebElement deleteConfirmButton = driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]"));
			deleteConfirmButton.click();
			super.waitForElementToLoad("css", "div.ui-table div.loader",3);
			super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30);
		}
		
	}

}
