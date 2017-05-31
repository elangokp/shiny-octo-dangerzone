package com.cybermint.contentSyndicator.sites.zeropark.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cybermint.pages.Page;

public class ZeroparkCampaignAddPage extends Page {

	public ZeroparkCampaignAddPage(WebDriver driver) {
		super(driver);
	}
	
	public void addCampaign(String name, String countryCode, Double bid, Double dailyBudget, Double campaignBudget
			, Double targetMaxBudget, String deviceType, String[] devices, String connectionType, String[] carriers
			, String frequency, String visitorType, String destination) {
		WebElement campaignTextBox = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		campaignTextBox.clear();
		campaignTextBox.click();
		campaignTextBox.sendKeys(name);
		WebElement countrySelectBox = driver.findElement(By.xpath("//select[@name=\"geoCountry\"]"));
		countrySelectBox.click();
		WebElement countryOption = driver.findElement(By.xpath("//select[@name=\"geoCountry\"]/option[@value=\""+countryCode+"\"]"));
		super.waitForElementToBeEnabled(countryOption);
		countryOption.click();
		WebElement bidTextBox = driver.findElement(By.xpath("//input[@name=\"bid\"]"));
		bidTextBox.clear();
		bidTextBox.click();
		bidTextBox.sendKeys(bid.toString());
		if(null != dailyBudget) {
			WebElement dailyBudgetRadioButton = driver.findElement(By.xpath("//input[@name=\"dailyBudgetLimited\" and @value=\"true\"]"));
			dailyBudgetRadioButton.click();
			WebElement dailyBudgetTextBox = driver.findElement(By.name("dailyBudget"));
			super.waitForElementToBeEnabled(dailyBudgetTextBox);
			dailyBudgetTextBox.clear();
			dailyBudgetTextBox.click();
			dailyBudgetTextBox.sendKeys(dailyBudget.toString());
		}
		
		if(null != campaignBudget) {
			WebElement campaignBudgetRadioButton = driver.findElement(By.xpath("//input[@name=\"budgetLimited\" and @value=\"true\"]"));
			campaignBudgetRadioButton.click();
			WebElement campaignBudgetTextBox = driver.findElement(By.name("budget"));
			super.waitForElementToBeEnabled(campaignBudgetTextBox);
			campaignBudgetTextBox.clear();
			campaignBudgetTextBox.click();
			campaignBudgetTextBox.sendKeys(campaignBudget.toString());
		}
		
		if(null != targetMaxBudget) {
			//WebElement targetsBudgetRadioButton = driver.findElement(By.xpath("//input[@name=\"targetsDailyBudget\" and @value=\"true\"]"));
			//targetsBudgetRadioButton.click();
			((JavascriptExecutor) driver).executeScript("document.querySelectorAll('input[name=\"targetsDailyBudget\"]')[1].click();");
			WebElement targetsBudgetTextBox = driver.findElement(By.name("budgetPerTarget"));
			super.waitForElementToBeEnabled(targetsBudgetTextBox);
			targetsBudgetTextBox.clear();
			targetsBudgetTextBox.click();
			targetsBudgetTextBox.sendKeys(targetMaxBudget.toString());
		}
		
		if(null != deviceType) {
			if(deviceType.equalsIgnoreCase("DesktopAndMobile")){
				WebElement deviceTypeRadioButton = driver.findElement(By.id("desktop-and-mobile-type"));
				deviceTypeRadioButton.click();
			} else if(deviceType.equalsIgnoreCase("Desktop")){
				WebElement deviceTypeRadioButton = driver.findElement(By.id("desktop-type"));
				deviceTypeRadioButton.click();
			} else if(deviceType.equalsIgnoreCase("Mobile")){
				WebElement deviceTypeRadioButton = driver.findElement(By.id("mobile-type"));
				deviceTypeRadioButton.click();
				if(devices != null || connectionType != null || carriers != null) {
					WebElement advancedShowButton = driver.findElement(By.cssSelector("span#tag-visitorSource-hideShow"));
					advancedShowButton.click();
					if(connectionType.equalsIgnoreCase("carrierWifitraffic")) {
						WebElement connectionTypeRadioButton = driver.findElement(By.id("carrierWifitraffic"));
						connectionTypeRadioButton.click();
					} else if(connectionType.equalsIgnoreCase("wifiOnlyTraffic")) {
						WebElement connectionTypeRadioButton = driver.findElement(By.id("wifiOnlyTraffic"));
						connectionTypeRadioButton.click();
					} else if(connectionType.equalsIgnoreCase("carrierOnlyTraffic")) {
						WebElement connectionTypeRadioButton = driver.findElement(By.id("carrierOnlyTraffic"));
						connectionTypeRadioButton.click();
					} else if(connectionType.equalsIgnoreCase("selectedCarriersTraffic")) {
						WebElement connectionTypeRadioButton = driver.findElement(By.id("selectedCarriersTraffic"));
						connectionTypeRadioButton.click();
						WebElement carrierSelectButton = driver.findElement(By.xpath("//button[@title=\"None selected\"]"));
						carrierSelectButton.click();
						for(String carrier : carriers) {
							carrier = countryCode+"|"+carrier;
							WebElement singleCarrierSelectButton = driver.findElement(By.xpath("//input[@value=\""+carrier+"\"]"));
							singleCarrierSelectButton.click();
						}
					}
				}
			}
		}
		
		if(null != frequency) {
			WebElement showFrequencies = driver.findElement(By.cssSelector("span#tag-visitorSource-hideShowFrequencyFilter"));
			showFrequencies.click();
			WebElement frequencyRadioButton = driver.findElement(By.xpath("//input[@name=\"frequencyFilterInHours\" and @value="+frequency+"]"));
			frequencyRadioButton.click();
		}
		
		if(null != visitorType) {
			if(visitorType.equalsIgnoreCase("adult") || visitorType.equalsIgnoreCase("all")) {
				WebElement adultFiltering = driver.findElement(By.xpath("//input[@value=\"ADULT\"]"));
				adultFiltering.click();
			} else if(visitorType.equalsIgnoreCase("nonadult") || visitorType.equalsIgnoreCase("all")) {
				WebElement nonAdultFiltering = driver.findElement(By.xpath("//input[@value=\"NON_ADULT\"]"));
				nonAdultFiltering.click();
			}
		}
		
		if(null != destination) {
			WebElement destinationTextBox = driver.findElement(By.xpath("//input[@name=\"destinationUrl\"]"));
			destinationTextBox.clear();
			destinationTextBox.click();
			destinationTextBox.sendKeys(destination);
		}
		
		WebElement saveButton = driver.findElement(By.id("btn-save"));
		//saveButton.click();
	}

}
