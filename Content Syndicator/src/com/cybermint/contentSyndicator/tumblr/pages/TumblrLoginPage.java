/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.tumblr.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class TumblrLoginPage extends Page {
    
    @FindBy(id = "login_email")
    protected WebElement emailTextBox;
    @FindBy(id = "login_password")
    protected WebElement passwordTextBox;
    @FindBy(xpath = "//form[@id=\"login_form\"]/button[@type=\"submit\"]")
    protected WebElement loginButton;

    public TumblrLoginPage(WebDriver driver) {
        super(driver);
        driver.get("https://www.tumblr.com/login");
        this.initialize();
    }

    public Page loginAs(String email, String password) {
        clearAndType(emailTextBox,email);
        clearAndType(passwordTextBox,password);
        loginButton.click();
        this.waitForElementToLoad("xpath", "//a[@href=\"/logout\"]");
        return PageFactory.initElements(driver, TumblrDashboardPage.class);
    }

}
