/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.platforms.wordpress.pages;

import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class WordpressAddPostPage extends WordpressDashboard{

    @FindBy(id="title") protected WebElement postTitleTextBox;
    @FindBy(id="edButtonHTML") protected WebElement changeToHtmlViewButton;
    @FindBy(id="content") protected WebElement postBodyTextArea;
    @FindBy(id="save-post") protected WebElement saveDraftButton;
    @FindBy(id="publish") protected WebElement publishButton;

    public WordpressAddPostPage(WebDriver driver) {
        super(driver);
    }

    public WordpressAddPostSuccessPage addPostAndPublish(String title,String post) throws InterruptedException {
        postTitleTextBox.click();
        postTitleTextBox.clear();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.getElementById('title').value='"+ TextFileReaderUtils.escapeString(title) +"';");
        changeToHtmlViewButton.click();        
        js.executeScript("document.getElementById('content').value='"+ TextFileReaderUtils.escapeString(post) +"';");
        super.waitForElementToBeEnabled(saveDraftButton);
        super.waitForElementToBeEnabled(publishButton);
        publishButton.click();
        super.waitForElementToLoad("xpath", "//div[@id='message']//a");
        return PageFactory.initElements(driver, WordpressAddPostSuccessPage.class);
    }
}
