package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cybermint.pages.Page;

public class YahooGeminiReportsCreatePage extends Page {

	public YahooGeminiReportsCreatePage(WebDriver driver) {
		super(driver);
	}
	
	public void scheduleReport() {
		driver.findElement(By.cssSelector("div.select-title")).click();
		super.waitForElementToLoad("xpath", "//div[@class=\"report-center-dropdown\"]//li//span[contains(text(),\"Ad performance report\")]");
		driver.findElement(By.xpath("//div[@class=\"report-center-dropdown\"]//li//span[contains(text(),\"Ad performance report\")]")).click();
		driver.findElement(By.cssSelector("div.date-range-selector")).click();
		super.waitForElementToLoad("xpath", "//div[@class=\"date-range\"]//li[contains(text(),\"Yesterday\")]");
		driver.findElement(By.xpath("//div[@class=\"date-range\"]//li[contains(text(),\"Yesterday\")]")).click();
		WebElement scheduleReportButton = driver.findElement(By.cssSelector("button[ng-click*=\"onScheduleClick\"]"));
		scheduleReportButton.click();
		super.waitForElementToLoad("css", "div.modal-body input");
		WebElement reportNameInput = driver.findElement(By.cssSelector("div.modal-body input"));
		reportNameInput.click();
		reportNameInput.clear();
		reportNameInput.sendKeys("Yesterday Ad Performance Report");
		driver.findElement(By.xpath("//div[contains(@class,\"modal-footer\")]//button[contains(text(),\"Schedule\")]")).click();
		super.waitForElementToLoad("css", "grid#reportsGrid tr.grid:first-child td[column-id=\"reportName\"]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
