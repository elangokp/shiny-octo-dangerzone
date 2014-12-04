/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.sandbox;

import com.cybermint.pages.Page;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author ADMIN
 */
public class pliggValidator {


    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        String url = "http://www.bassfishingplus.com/story.php?title=Martial_Artist";
        Pattern p = Pattern.compile(".+/");
        Matcher m = p.matcher(url);
        while(m.find()) {
            System.out.println(m.group());
            driver.get(m.group()+"register.php");
            Page page = new Page(driver);
            page.isElementVisible(url, url);
        }

    }
}
