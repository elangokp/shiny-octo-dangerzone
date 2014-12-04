/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.scenarios;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Elango
 */
public abstract class ScenariosRunnableAbstract implements Runnable {

    private WebDriver driver;

    private String startingURL;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getStartingURL() {
        return startingURL;
    }

    public void setStartingURL(String startingURL) {
        this.startingURL = startingURL;
    }

    public void run() {
        //To be overridden
    }


}
