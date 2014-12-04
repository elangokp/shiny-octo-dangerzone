/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.platforms.pligg.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author krithika
 */
public class PliggPage extends Page {

    public PliggPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSubmitNewsSourceSuccessPage() {
        boolean isSuccessPage = isElementVisible("xpath", "//input[@value='Save Changes and Submit']");
        return isSuccessPage;

    }

    public boolean isSubmitNewSuccessPage() {
        boolean isSucessPage = isElementVisible("xpath", "//div[@id=\"title-0\"]");
        return isSucessPage;
    }
}
