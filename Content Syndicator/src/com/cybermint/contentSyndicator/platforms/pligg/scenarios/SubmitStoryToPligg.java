/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.platforms.pligg.scenarios;

import com.cybermint.contentSyndicator.platforms.pligg.pages.PliggLoginPage;
import com.cybermint.contentSyndicator.platforms.pligg.pages.PliggNewsSourcePage;
import com.cybermint.contentSyndicator.platforms.pligg.pages.PliggSubmitANewStoryPage;
import com.cybermint.contentSyndicator.platforms.pligg.pages.PliggSubmitStoryErrPage;
import com.cybermint.contentSyndicator.platforms.pligg.pages.PliggSubmitStorySuccessPage;
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
public class SubmitStoryToPligg implements Runnable {

    private String driverType;
    private String startingURL;
    private String pliggUsername;
    private String pliggPassword;
    private String newsUrl;
    private String title;
    private String category;
    private List<String> tags;
    private String newsFile;
    private String captchaUsername;
    private String captchaPwd;
    private String serviceProviderName;

    public SubmitStoryToPligg(String driverType, String startingURL, String pliggUsername, String pliggPassword,
            String newsUrl,String title,String category,
            List<String> tags,String newsFile,String captchaUsername,String captchaPwd,String serviceProviderName){
        this.driverType = driverType;
        this.startingURL = startingURL;
        this.pliggUsername = pliggUsername;
        this.pliggPassword = pliggPassword;
        this.newsUrl=newsUrl;
        this.title=title;
        this.category=category;
        this.tags=tags;
        this.newsFile=newsFile;
        this.captchaUsername=captchaUsername;
        this.captchaPwd=captchaPwd;
        this.serviceProviderName=serviceProviderName;
    }

    public void run() {
        WebDriver driver = null;
        try {
            Page postPage = null;
            String publishedLink = null;
            String publishedStatus = null;
            String errStatus = null;
            driver = constructDriver();
            driver.get(startingURL + "submit.php");
            Page aPage = new Page(driver);
            aPage.waitForElementToLoad("name", "username");
            PliggLoginPage aPliggLoginPage = PageFactory.initElements(driver, PliggLoginPage.class);
            PliggNewsSourcePage aPliggPage = aPliggLoginPage.loginAs(pliggUsername, pliggPassword);
            Page submitNewsTestPage = aPliggPage.enterNewsSourceURL(newsUrl);
            boolean isNewsSubmitPage = submitNewsTestPage.isElementVisible("xpath", "//input[@value='Save Changes and Submit']");
            if (isNewsSubmitPage) {
                postPage = ((PliggSubmitANewStoryPage) submitNewsTestPage).submitANewStory(title, category, tags,
                        newsFile, captchaUsername, captchaPwd, serviceProviderName);
                boolean sucessPage = postPage.isElementVisible("xpath", "//div[@id=\"title-0\"]");
                if (sucessPage) {
                    publishedStatus = ((PliggSubmitStorySuccessPage) postPage).checkAndGetPublishedStatus("TestTestTestTestTest");
                    publishedLink = ((PliggSubmitStorySuccessPage) postPage).getPublishedLink();
                    System.out.println("*******Status******" + publishedStatus);
                    System.out.println("*******Link******" + publishedLink);
                } else {
                    errStatus = ((PliggSubmitStoryErrPage) postPage).getErrStatus();
                    System.out.println("*******Error******" + errStatus);
                }
            } else {
                errStatus = ((PliggSubmitStoryErrPage) submitNewsTestPage).getErrStatus();
                System.out.println("*******Error******" + errStatus);

            }

        } catch (Exception e) {
            e.printStackTrace();
            //failedSites.add(startingURL);
            System.out.println("Failed " + Thread.currentThread().getName() + " : "
                    + startingURL + " : " + e.getMessage());
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
            HtmlUnitDriver htmldriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11);
            htmldriver.setJavascriptEnabled(true);
            driver = htmldriver;
        } else {
            driver = new FirefoxDriver();
        }
        return driver;
    }

}