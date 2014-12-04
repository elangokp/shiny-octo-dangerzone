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
public class PliggNewsSourcePage extends PliggPage{
    
     @FindBy(id ="url") protected WebElement uRLTextBox;
     @FindBy(xpath="//input[@value='Continue']") protected WebElement continueButton;
     
    public PliggNewsSourcePage(WebDriver driver) {
        super(driver);
    }
     
     public PliggPage enterNewsSourceURL(String uRL){
         uRLTextBox.clear();
         uRLTextBox.sendKeys(uRL);
         continueButton.click();
         if(isSubmitNewsSourceSuccessPage()){
         return PageFactory.initElements(driver,PliggSubmitANewStoryPage.class);
         }
         return PageFactory.initElements(driver,PliggSubmitStoryErrPage.class);
     }
     
}
