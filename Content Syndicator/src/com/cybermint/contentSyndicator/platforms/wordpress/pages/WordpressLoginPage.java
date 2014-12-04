/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.platforms.wordpress.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class WordpressLoginPage extends Page{

    @FindBy(id="user_login") private WebElement usernameTextBox;
    @FindBy(id="user_pass") private WebElement passwordTextBox;
    @FindBy(id="wp-submit") private WebElement loginButton;

    public WordpressLoginPage(WebDriver driver) {
        super(driver);
    }

    public WordpressDashboard loginAs(String username, String password) {
        usernameTextBox.clear();
        usernameTextBox.sendKeys(username);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
        loginButton.click();
        //System.out.println("Login Clicked");
       // System.out.println(driver.getTitle());
        super.waitForElementToLoad("xpath", "//a[@href='post-new.php']");
        //System.out.println(driver.getTitle());
        return PageFactory.initElements(driver, WordpressDashboard.class);
    }
}
