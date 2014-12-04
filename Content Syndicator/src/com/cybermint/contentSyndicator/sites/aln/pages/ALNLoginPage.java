/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.sites.aln.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class ALNLoginPage extends Page{

   @FindBy(id = "username") protected WebElement usernameTextBox;
   @FindBy(id = "password") protected WebElement passwordTextBox;
   @FindBy(id = "newbutton") protected WebElement submitButton;

    public ALNLoginPage(WebDriver driver) {
        super(driver);
        driver.get("http://www.authoritylinknetwork.com/login.php");
        this.initialize();
    }

    public ALNDashboard loginAs(String username, String password) {
        usernameTextBox.clear();
        usernameTextBox.click();
        usernameTextBox.sendKeys(username);
        passwordTextBox.clear();
        passwordTextBox.click();
        passwordTextBox.sendKeys(password);
        submitButton.click();
        this.waitForElementToLoad("linkText", "Sign Out");
        return PageFactory.initElements(driver, ALNDashboard.class);
    }

    public static void main(String args[]) {
        ALNLoginPage aALNLoginPage = new ALNLoginPage(Page.constructDriver("firefox"));
        aALNLoginPage.loginAs("pelangs", "123aln!@#");
    }

}
