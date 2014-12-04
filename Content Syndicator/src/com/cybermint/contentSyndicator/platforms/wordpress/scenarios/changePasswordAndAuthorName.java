/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.platforms.wordpress.scenarios;

import com.cybermint.contentSyndicator.platforms.wordpress.pages.WordpressAddPostSuccessPage;
import com.cybermint.contentSyndicator.platforms.wordpress.pages.WordpressLoginPage;
import com.cybermint.contentSyndicator.platforms.wordpress.pages.WordpressProfilePage;
import com.cybermint.pages.Page;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class changePasswordAndAuthorName implements Runnable {

    private String driverType;
    private String startingURL;
    private String username;
    private String presentPassword;
    private String futurePassword;
    private String authorName;
    private List<String> failedSites;
    private List<String> passedSites;

    public changePasswordAndAuthorName(String driverType, String startingURL, String username, String presentPassword, String futurePassword, String authorName, List<String> failedSites, List<String> passedSites) {
        this.driverType = driverType;
        this.startingURL = startingURL;
        this.username = username;
        this.presentPassword = presentPassword;
        this.futurePassword = futurePassword;
        this.authorName = authorName;
        this.failedSites = failedSites;
        this.passedSites = passedSites;
    }

    public void run() {
        WebDriver driver = null;
        try {
            driver = constructDriver();
            driver.get(startingURL + "wp-login.php");
            Page aPage = new Page(driver);
            aPage.waitForElementToLoad("id", "user_login");
            WordpressLoginPage aWordpressLoginPage = PageFactory.initElements(driver, WordpressLoginPage.class);
            WordpressProfilePage aWordpressProfilePage = aWordpressLoginPage.loginAs(username, presentPassword).clickEditProfile();
            aWordpressProfilePage = aWordpressProfilePage.setNickname(authorName);
            aWordpressProfilePage = aWordpressProfilePage.setPassword(futurePassword).submitProfileForm();
            
            aWordpressProfilePage = aWordpressProfilePage.setNicknameAsDisplayName().submitProfileForm();
            aWordpressLoginPage = aWordpressProfilePage.logOut();

            String displayName = aWordpressLoginPage.loginAs(username, futurePassword).getDisplayName();
            
            if (!authorName.equalsIgnoreCase(displayName)) {
                 System.out.println("Failed " + Thread.currentThread().getName() + " : "
                    + startingURL);
                 failedSites.add(startingURL);
            } else if (authorName.equalsIgnoreCase(displayName)) {
                System.out.println("Passed " + Thread.currentThread().getName() + " : "
                    + startingURL);
                passedSites.add(startingURL);
            }
            driver.quit();
        } catch (Exception e) {
            if(driver != null) {
             driver.quit();
            }
            failedSites.add(startingURL);
        }
    }

    private WebDriver constructDriver() {
        WebDriver driver;
        if ("firefox".equalsIgnoreCase(driverType)) {
            FirefoxBinary fb = new FirefoxBinary();
            fb.setEnvironmentProperty("DISPLAY", ":1");
            driver = new FirefoxDriver(fb, null);
        } else if ("ie".equalsIgnoreCase(driverType)) {
            driver = new InternetExplorerDriver();
        } else if ("htmlunit".equalsIgnoreCase(driverType)) {
            HtmlUnitDriver htmldriver = new HtmlUnitDriver(BrowserVersion.FIREFOX_3_6);
            htmldriver.setJavascriptEnabled(true);
            driver = htmldriver;
        } else {
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
