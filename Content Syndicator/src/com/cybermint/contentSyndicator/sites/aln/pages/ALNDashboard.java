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
public class ALNDashboard extends Page{

    @FindBy(xpath = "//a[@href=\"articlesadd.php\" and @class=\"shortcut-button\"]")
    protected WebElement submitArticleLink;
    @FindBy(linkText = "Sign Out")
    protected WebElement signOutLink;

    public ALNDashboard(WebDriver driver) {
        super(driver);
    }

    public ALNSubmitArticlePage clickSubmitArticlesPage() {
        submitArticleLink.click();
        this.waitForElementToLoad("xpath", "//input[@id=\"newbutton\" and @value=\"Add\"]");
        return PageFactory.initElements(driver, ALNSubmitArticlePage.class);
    }

    public ALNLoginPage signOut() {
        signOutLink.click();
        this.waitForElementToLoad("id", "username");
        return PageFactory.initElements(driver, ALNLoginPage.class);
    }

}
