package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cybermint.pages.Page;

public class YahooGeminiSignUpPage extends Page {

	public YahooGeminiSignUpPage(WebDriver driver) {
		super(driver);
	}
	
	public void signup(String companyName, String companyWebsite, String email, String phoneNumber){
		WebElement companyNameTextBox = driver.findElement(By.id("companyName"));
		super.clearAndType(companyNameTextBox, companyName);
		WebElement companyWebsiteTextBox = driver.findElement(By.id("companyWebsite"));
		super.clearAndType(companyWebsiteTextBox, companyWebsite);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		super.clearAndType(emailTextBox, email);
		WebElement phoneTextBox = driver.findElement(By.id("phone"));
		super.clearAndType(phoneTextBox, phoneNumber);
	}

}
