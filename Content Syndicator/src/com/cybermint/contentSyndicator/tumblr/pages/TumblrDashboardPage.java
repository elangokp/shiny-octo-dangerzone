/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.tumblr.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author ADMIN
 */
public class TumblrDashboardPage extends Page{
    
    @FindBy(xpath = "//a[@href=\"/new/text\"]") protected WebElement newTextPostButton;

    public TumblrDashboardPage(WebDriver driver) {
        super(driver);
    }

}
