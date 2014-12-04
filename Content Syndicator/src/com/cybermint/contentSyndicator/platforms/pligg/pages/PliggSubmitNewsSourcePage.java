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
public class PliggSubmitNewsSourcePage extends PliggPage{
    
     @FindBy(id ="url") protected WebElement uRLTextBox;
     @FindBy(xpath="//input[@value='Continue']") protected WebElement continueButton;
     
    public PliggSubmitNewsSourcePage(WebDriver driver) {
        super(driver);
    }
     
     public PliggSubmitANewStoryPage enterNewsSourceURL(String uRL){
         uRLTextBox.clear();
         uRLTextBox.sendKeys(uRL);
         continueButton.click();
         return PageFactory.initElements(driver, PliggSubmitANewStoryPage.class);
     }
    
     
}
