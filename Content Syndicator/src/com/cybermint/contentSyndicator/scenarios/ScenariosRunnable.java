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
public interface ScenariosRunnable extends Runnable{

    public WebDriver getDriver();

    public void setDriver(WebDriver driver);
    
    public String getStartingURL();

    public void setStartingURL(String startingURL);
}
