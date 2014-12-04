/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.platforms.pligg.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author krithika
 */
public class PliggSubmitStorySuccessPage extends PliggPage{
           
    @FindBy(xpath = "//div[@id=\"title-0\"]/h2")
    protected WebElement latestPublishedTitle;
    
    @FindBy(xpath = "//div[@id=\"title-0\"]/h2/a")
    protected WebElement latestPublishedLink;
    
    String publishedStatus;
    
    String publishedLink;
    
    
    public PliggSubmitStorySuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getPublishedLink() {
        return publishedLink;
    }
    
    public String checkAndGetPublishedStatus(String title){
        String publishedTitleStr=latestPublishedTitle.getText();
        publishedStatus="Failure";
        if(publishedTitleStr.equals(title)){
            publishedLink=latestPublishedLink.getAttribute("href");   
            publishedStatus="Success";
        }
        
        return publishedStatus;
    }

}
