package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class YahooGeminiLoginPage extends Page {
	
	@FindBy(id = "login-username")
    protected WebElement usernameTextBox;
    @FindBy(id = "login-passwd")
    protected WebElement passwordTextBox;
    @FindBy(id = "login-signin")
    protected WebElement signInButton;

	public YahooGeminiLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public YahooGeminiDashboardPage signInAs(String username, String password) {
		try {
			super.waitForElementToLoad("id", "login-username");	
			usernameTextBox.clear();
			usernameTextBox.click();
			usernameTextBox.sendKeys(username);
			super.waitForElementToLoad("id", "login-signin");
			if(signInButton.getText().contains("Continue")) {
				signInButton.click();
			}
			super.waitForElementToLoad("id", "login-passwd");	
			passwordTextBox.clear();
			passwordTextBox.click();
			passwordTextBox.sendKeys(password);
			/*if(super.waitForElementToLoad("xpath", "//label[@for=\"persistent\" and contains(@id,\"yui\")]",1)) { //checks if the Stay signed in option is selected
				WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\" and contains(@id,\"yui\")]")); 
				staySignedInCheckBox.click(); //de-selects the stay signed in option.
				//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			}*/
			//WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\"]"));			
			//staySignedInCheckBox.click(); //de-selects the stay signed in option.
			//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			signInButton.click();
			Thread.sleep(2000);
			driver.get("https://gemini.yahoo.com");
			super.waitForElementToLoad("id", "datepicker");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
    }

}
