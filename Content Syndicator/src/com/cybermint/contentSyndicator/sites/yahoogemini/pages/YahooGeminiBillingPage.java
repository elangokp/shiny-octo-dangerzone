package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cybermint.pages.Page;

public class YahooGeminiBillingPage extends Page {

	public YahooGeminiBillingPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean submitCCInfo(String cardNumber, String cardExpiry, String cardCVV, String cardHolderName, String zipCode
			, String address1, String address2, String city, String state, boolean shouldUsePromoCode) {
		
		if(super.waitForElementToLoad("css", "div.banner em", 2)) {
			WebElement warningBannerCloseButton =  driver.findElement(By.cssSelector("div.banner em"));
			warningBannerCloseButton.click();
			super.waitForElementToBeDisappear("css", "div.banner em", 2);
		}
		
		((JavascriptExecutor) driver).executeScript("document.querySelector('.common-footer').style.display = 'none';");
		
		driver.switchTo().frame(driver.findElement(By.id("yahooPaymentWidgetFrame")));
		driver.switchTo().frame(driver.findElement(By.id("vaultNoOpFrame")));
		driver.switchTo().frame(driver.findElement(By.id("vaultAPINoOpFrame")));
		driver.switchTo().frame(driver.findElement(By.id("vaultOuterPaymentFrame")));
		
		super.waitForElementToLoad("id", "card");
		WebElement cardNumberTextBox =  driver.findElement(By.id("card"));
		super.clearAndType(cardNumberTextBox, cardNumber);
		
		WebElement cardHolderTextBox =  driver.findElement(By.id("cardholder"));
		super.clearAndType(cardHolderTextBox, cardHolderName);
				
		WebElement expiryDateTextBox =  driver.findElement(By.id("date"));
		super.clearAndType(expiryDateTextBox, cardExpiry);
		
		/*
		String month = cardExpiry.substring(0, 2);		
		driver.findElement(By.id("payment_month")).click();			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String monthXpath = "//div[@id=\"payment_month\"]//span[contains(text(),\""+month+"\")]";	
		((JavascriptExecutor) driver).executeScript("document.evaluate('"+monthXpath+"', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();");
		WebElement monthSelectOption = driver.findElement(By.xpath(monthXpath)); 
		monthSelectOption.click();
		
		String year = "20" + cardExpiry.substring(2);
		driver.findElement(By.id("payment_year")).click();			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String yearXpath = "//div[@id=\"payment_year\"]//span[contains(text(),\""+year+"\")]";	
		((JavascriptExecutor) driver).executeScript("document.evaluate('"+yearXpath+"', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();");
		WebElement yearSelectOption = driver.findElement(By.xpath(yearXpath)); 
		yearSelectOption.click();
		*/
		WebElement cvvTextBox =  driver.findElement(By.id("cvv"));
		super.clearAndType(cvvTextBox, cardCVV);
		
		/*
		driver.findElement(By.id("country")).click();			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String countryXpath = "//div[@id=\"country\"]//div[@role=\"option\"]//span[contains(text(),\"United States\")]";	
		((JavascriptExecutor) driver).executeScript("document.evaluate('"+countryXpath+"', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();");
		WebElement countrySelectOption = driver.findElement(By.xpath(countryXpath)); 
		countrySelectOption.click();
		
		
		driver.findElement(By.id("state")).click();			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String stateXpath = "//div[@id=\"state\"]//div[@role=\"option\"]//span[contains(text(),\"California\")]";	
		((JavascriptExecutor) driver).executeScript("document.evaluate('"+stateXpath+"', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();");
		WebElement stateSelectOption = driver.findElement(By.xpath(stateXpath)); 
		stateSelectOption.click();
		*/
		
		WebElement address1TextBox =  driver.findElement(By.id("address1"));
		super.clearAndType(address1TextBox, address1);
		
		WebElement address2TextBox =  driver.findElement(By.id("address2"));
		super.clearAndType(address2TextBox, address2);
		
		WebElement cityTextBox =  driver.findElement(By.id("city"));
		super.clearAndType(cityTextBox, city);
		
		//((JavascriptExecutor) driver).executeScript("document.evaluate('//div[@ng-model=\"usState.selected\"]//div[contains(text(),\"California\")]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();");
		
		//WebElement stateSelectOption = driver.findElement(By.xpath("//div[@ng-model=\"usState.selected\"]//div[contains(text(),\"California\")]")); 
		//stateSelectOption.click();
		
		WebElement zipcodeTextBox =  driver.findElement(By.id("zipcode"));
		super.clearAndType(zipcodeTextBox, zipCode);
		
		driver.switchTo().defaultContent();
		
		if(shouldUsePromoCode) {
			WebElement promocodeTextBox =  driver.findElement(By.xpath("//input[@name=\"promo\"]"));
			super.clearAndType(promocodeTextBox, "YAHOOADS");
			
			WebElement promocodeApplyButton =  driver.findElement(By.xpath("//div[contains(text(),\"Apply\")]"));
			promocodeApplyButton.click();
			super.waitForElementToLoad("xpath", "//div[@ng-show=\"validPromoCode\"]");
		}
				
		WebElement cardSubmitButton =  driver.findElement(By.cssSelector("button.btn-primary"));
		cardSubmitButton.click();
		
		if(super.waitForElementToLoad("id", "prepay-add-funds")) {
			return true;
		} else {
			return false;
		}
		//return PageFactory.initElements(driver, YahooGeminiBillingPage.class);
	}
	
	public void logout() {
		WebElement settingsIcon = driver.findElement(By.cssSelector("li.nav-icon span.icon-settings-filled"));
		settingsIcon.click();
		super.waitForElementToLoad("xpath", "//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]");
		driver.findElement(By.xpath("//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]")).click();
		super.waitForElementToLoad("xpath", "//a[contains(text(), \"Sign in\")]");
	}

}
