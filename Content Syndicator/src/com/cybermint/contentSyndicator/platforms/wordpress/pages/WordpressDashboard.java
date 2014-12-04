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
public class WordpressDashboard extends Page{

    @FindBy(xpath = "//a[@href='post-new.php']") protected WebElement addNewPostLink;
    @FindBy(xpath = "//a[@href='profile.php']") protected WebElement editProfileLink;
    @FindBy(xpath = "//a[@title='Log Out']") protected WebElement logOutLink;

    public WordpressDashboard(WebDriver driver) {
        super(driver);
    }

    public WordpressAddPostPage clickAddNewPost() {
        addNewPostLink.click();
        super.waitForElementToLoad("id", "title");
        return PageFactory.initElements(driver, WordpressAddPostPage.class);
    }

     public WordpressProfilePage clickEditProfile() {
        editProfileLink.click();
        super.waitForElementToLoad("name", "submit");
        return PageFactory.initElements(driver, WordpressProfilePage.class);
    }

    public WordpressLoginPage logOut() {
        logOutLink.click();
        super.waitForElementToLoad("id", "user_login");
        return PageFactory.initElements(driver, WordpressLoginPage.class);
    }

    public String getDisplayName() {
        return editProfileLink.getText();
    }

}
