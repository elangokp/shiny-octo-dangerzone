/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.threadsManager;

import com.cybermint.contentSyndicator.scenarios.ScenariosRunnable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author Elango
 */
public class driverThread extends Thread {
    private WebDriver driver;
    private Runnable r;

    public driverThread(String driverType, Runnable r) {
        this.r = r;
        if("firefox".equalsIgnoreCase(driverType)){
            driver = new FirefoxDriver();
        } else if("ie".equalsIgnoreCase(driverType)){
            driver = new InternetExplorerDriver();
        } else if("htmlunit".equalsIgnoreCase(driverType)){
            driver = new HtmlUnitDriver();
        } else {
            driver = new FirefoxDriver();
        }
    }

    @Override
    public void run() {
        r.run();
    }
}
