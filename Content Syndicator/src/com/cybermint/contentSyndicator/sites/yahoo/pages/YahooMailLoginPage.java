/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.sites.yahoo.pages;

import com.cybermint.pages.Page;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class YahooMailLoginPage extends Page{

    @FindBy(id="signUpBtn") protected WebElement createNewAccountButton;

    public YahooMailLoginPage(WebDriver driver) {
        super(driver);
    }
    public YahooMailSignUpPage clickCreateNewAccountButton() {
        createNewAccountButton.click();
        super.waitForElementToLoad("id", "IAgreeBtn");
        return PageFactory.initElements(driver, YahooMailSignUpPage.class);
    }

    public static void main(String args[]) {
//        FirefoxDriver driver = new FirefoxDriver();
        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_3_6);
        driver.setJavascriptEnabled(true);
        driver.get("http://mail.yahoo.com");
        YahooMailLoginPage thisPage = new YahooMailLoginPage(driver);
        thisPage.waitForElementToLoad("id", "signUpBtn");
        thisPage = PageFactory.initElements(driver, YahooMailLoginPage.class);
        System.out.println("After init of YahooMailLoginPage.class");
        YahooMailSignUpPage aYahooMailSignUpPage = thisPage.clickCreateNewAccountButton();
        System.out.println("After clicking create new account button");
        aYahooMailSignUpPage.waitForElementToLoad("id", "firstname");
        System.out.println(driver.getTitle());
    }

}
