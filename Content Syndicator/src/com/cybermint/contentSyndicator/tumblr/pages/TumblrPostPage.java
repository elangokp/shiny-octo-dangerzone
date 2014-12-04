/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.tumblr.pages;

import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author ADMIN
 */
public class TumblrPostPage extends Page{

    //@FindBy(xpath="//input[@type=\"image\" and @title=\"Like\" and @alt=\"Like\"]")
    protected WebElement likeIcon;

    public TumblrPostPage(WebDriver driver) {
        super(driver);
    }
    
    public TumblrPostPage(WebDriver driver, String postUrl) {
        super(driver);
        driver.get(postUrl);
        this.initialize();
    }

    public void likeThePost() {
        driver.switchTo().frame("tumblr_controls");
        likeIcon = driver.findElement(By.xpath("//input[@type=\"image\" and @title=\"Like\" and @alt=\"Like\"]"));
        likeIcon.click();
    }

    public static void main(String args[]) {
        TumblrLoginPage aTumblrLoginPage = new TumblrLoginPage(Page.constructDriver("firefox"));
        aTumblrLoginPage.loginAs("johnny@getbackyourexnow.com", "123jt!@#");
        List<String> tumblrlist = TextFileReaderUtils.readLinesAsList("E:/Dropbox/Website Campaigns/GetBackYourExNow.com/Project Tumblr Links/split/Split List -3.txt", false);
        for(String aTumblrPostPageUrl:tumblrlist) {
            try {
                TumblrPostPage aTumblrPostPage = new TumblrPostPage(aTumblrLoginPage.getDriver(),aTumblrPostPageUrl);
                aTumblrPostPage.likeThePost();
                System.out.println("Successfully liked : " + aTumblrPostPageUrl + "\n");
            } catch(Exception e) {
                System.out.println("Exception while liking : " + aTumblrPostPageUrl + "\n");
                e.printStackTrace();
            }
        }
        aTumblrLoginPage.getDriver().quit();
    }
}
