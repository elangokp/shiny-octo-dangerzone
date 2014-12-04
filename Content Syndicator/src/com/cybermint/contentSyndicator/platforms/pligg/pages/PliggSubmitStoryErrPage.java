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
 * @author Krithika Vittal
 */
public class PliggSubmitStoryErrPage extends PliggPage{
           
    @FindBy(xpath = "//*[@class='error']")
    protected WebElement errNotification;
    
    String errStatus;
    
    public PliggSubmitStoryErrPage(WebDriver driver) {
        super(driver);
    }

    public String getErrStatus() {
        return errNotification.getText();
    }
}
