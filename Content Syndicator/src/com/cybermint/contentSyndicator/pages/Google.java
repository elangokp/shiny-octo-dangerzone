/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.pages;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 *
 * @author Elango
 */
public class Google {

    public static void main(String args[]) {
        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_3_6);
        driver.get("http://www.google.com");
        driver.getTitle();
        driver.findElementByName("q").sendKeys("Elango");
        driver.findElementByName("q").submit();
        System.out.println(driver.getTitle());
    }
}
