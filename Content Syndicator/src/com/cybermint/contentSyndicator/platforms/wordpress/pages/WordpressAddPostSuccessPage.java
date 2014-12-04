/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.platforms.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Elango
 */
public class WordpressAddPostSuccessPage extends WordpressAddPostPage{

    @FindBy(xpath="//div[@id='message']//a")
    protected WebElement linkToPublishedPost;

    public WordpressAddPostSuccessPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLinkToPublishedPost() {
        return linkToPublishedPost;
    }

    public void setLinkToPublishedPost(WebElement linkToPublishedPost) {
        this.linkToPublishedPost = linkToPublishedPost;
    }

    

}
