package com.cybermint.contentSyndicator.sites.zeropark.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class ZeroparkLoginPage extends Page {

	@FindBy(css = "#email")
	protected WebElement emailTextBox;
	
	@FindBy(css = "#password")
	protected WebElement passwordTextBox;
	
	@FindBy(css = "#submit")
	protected WebElement submitButton;
	
	public ZeroparkLoginPage(WebDriver driver) {
		super(driver);
		driver.get("https://panel.zeropark.com/signin");
		if(super.waitForElementToLoad("css", "#email",10)) {
			this.initialize();
		}
	}
	
	public ZeroparkDashboardPage signInAs(String username, String password) {
		emailTextBox.clear();
		emailTextBox.click();
		emailTextBox.sendKeys(username);
		
		passwordTextBox.clear();
		passwordTextBox.click();
		passwordTextBox.sendKeys(password);
		
		submitButton.click();
		
		super.waitForElementToLoad("css", ".signout",10);
		
		return PageFactory.initElements(driver, ZeroparkDashboardPage.class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
