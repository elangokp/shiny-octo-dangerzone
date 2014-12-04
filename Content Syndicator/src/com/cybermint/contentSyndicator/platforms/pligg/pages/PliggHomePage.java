/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.platforms.pligg.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Krithika Vittal
 */
public class PliggHomePage extends PliggPage {
    
    @FindBy(xpath ="//a[contains(@href,'submit.php')]") protected WebElement submitNewStoryLink;
    @FindBy(xpath ="//a[contains(@href,'user.php')]") protected WebElement editProfileLink;
    @FindBy(xpath ="//a[contains(@href,'logout')]") protected WebElement logOutLink;

    public PliggHomePage(WebDriver driver) {
        super(driver);
    }

    public PliggNewsSourcePage clickSubmitNewStory() {
        submitNewStoryLink.click();
        super.waitForElementToLoad("xpath", "//input[@value='Continue']");
        return PageFactory.initElements(driver, PliggNewsSourcePage.class);
    }

     public PliggProfilePage clickEditProfile() {
        editProfileLink.click();
        super.waitForElementToLoad("xpath", "//input[@value='Modify']");
        return PageFactory.initElements(driver, PliggProfilePage.class);
    }

    public PliggLoginPage logOut() {
        logOutLink.click();
        super.waitForElementToLoad("name","username");
        return PageFactory.initElements(driver, PliggLoginPage.class);
    }

    public String getDisplayName() {
        return editProfileLink.getText();
    }

    
}


