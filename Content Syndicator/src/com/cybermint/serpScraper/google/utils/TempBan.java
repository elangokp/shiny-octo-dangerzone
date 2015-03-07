/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.utils;

import com.cybermint.serpScraper.google.pages.GoogleSearchPage;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class TempBan {

    private Boolean banned = false;
    private WebDriver driver;
    private Integer totalbanTime = 0;
    private Boolean isInvoked = false;

    public TempBan() {
        
    }

    public Boolean isBanned() {
        return banned;
    }

    public void setBannedAsTrue() {
        if(!isInvoked) {
            banned = true;
            try {
                recheckBan();
            } catch (InterruptedException ex) {
                Logger.getLogger(TempBan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    public void recheckBan() throws InterruptedException {
        isInvoked = true;
        driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11);
//        driver = new FirefoxDriver();
        System.out.println("Rechecking Ban after " + totalbanTime + " minutes.");
        driver.get("http://www.google.com/search?complete=0&gl=US");
        Thread.sleep(5000);
//        System.out.println(driver.getCurrentUrl());
        if(driver.getCurrentUrl().contains("sorry")) {
            banned = true;
            System.out.println("Google Temp Ban found. Pausing for 15 minutes");
            Thread.sleep(15*60*1000);
            totalbanTime = totalbanTime + 15;
            recheckBan();
        } else if(!driver.getCurrentUrl().contains("sorry")) {
            driver.findElement(By.name("q")).clear();
            driver.findElement(By.name("q")).sendKeys("Checking");
            driver.findElement(By.name("q")).submit();
            if(driver.getCurrentUrl().contains("sorry")) {
                banned = true;
                System.out.println("Google Temp Ban found. Pausing for 15 minutes");
                Thread.sleep(15*60*1000);
                totalbanTime = totalbanTime + 15;
                recheckBan();
            } else if(!driver.getCurrentUrl().contains("sorry")) {
                banned = false;
                System.out.println("Google temp ban revoked after " + totalbanTime + " minutes (approx)");
                totalbanTime = 0;
                isInvoked = false;
            }
        }
    }

    public static void main(String args[]) {
        TempBan aTempBan = new TempBan();
        aTempBan.setBannedAsTrue();
    }
    
}
