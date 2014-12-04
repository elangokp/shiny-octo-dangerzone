/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.sites.aln.pages;

import com.cybermint.contentSyndicator.sites.aln.formObjects.ALNArticleFormObject;
import com.cybermint.contentSyndicator.sites.aln.utils.ALNUtils;
import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class ALNSubmitArticlePage extends ALNDashboard{

    @FindBy(xpath = "//input[@id=\"x_project_title\"]")
    protected WebElement projectTitleTextBox;

    @FindBy(xpath = "//textarea[@id=\"x_title\"]")
    protected WebElement articleTitleTextArea;

    @FindBy(xpath = "//textarea[@id=\"x_content\"]")
    protected WebElement articleContentTextArea;

    @FindBy(xpath = "//input[@id=\"x_tags\"]")
    protected WebElement articleTagsTextBox;

    @FindBy(xpath = "//input[@id=\"x_url1\"]")
    protected WebElement url1TextBox;

    @FindBy(xpath = "//input[@id=\"x_keyword1\"]")
    protected WebElement keyword1TextBox;

    @FindBy(xpath = "//input[@name=\"KW1\"]")
    protected WebElement keyword1BoldCheckBox;

    @FindBy(xpath = "//input[@id=\"x_url2\"]")
    protected WebElement url2TextBox;

    @FindBy(xpath = "//input[@id=\"x_keyword2\"]")
    protected WebElement keyword2TextBox;

    @FindBy(xpath = "//input[@name=\"KW2\"]")
    protected WebElement keyword2BoldCheckBox;

    @FindBy(xpath = "//input[@id=\"x_url3\"]")
    protected WebElement url3TextBox;

    @FindBy(xpath = "//input[@id=\"x_keyword3\"]")
    protected WebElement keyword3TextBox;

    @FindBy(xpath = "//input[@name=\"KW3\"]")
    protected WebElement keyword3BoldCheckBox;
    
    @FindBy(xpath = "//input[@id=\"x_youtube\"]")
    protected WebElement youtubeUrlTextBox;
    
    @FindBy(xpath = "//input[@id=\"x_sched\"]")
    protected WebElement scheduledDateTextBox;

    @FindBy(xpath = "//input[@id=\"newbutton\" and @value=\"Add\"]")
    protected WebElement AddArticleButton;

    public ALNSubmitArticlePage(WebDriver driver) {
        super(driver);
    }

    public ALNDashboard submitArticle(ALNArticleFormObject anALNArticle) {
        clearAndType(projectTitleTextBox, anALNArticle.getProjectTitle());
        clearAndType(articleTitleTextArea, anALNArticle.getArticleTitle());
        clearAndType(articleContentTextArea, anALNArticle.getArticleContent());
        clearAndType(articleTagsTextBox, anALNArticle.getArticleTags());
        clearAndType(url1TextBox, anALNArticle.getUrl1());
        clearAndType(keyword1TextBox, anALNArticle.getKeyword1());
        clearAndType(url2TextBox, anALNArticle.getUrl2());
        clearAndType(keyword2TextBox, anALNArticle.getKeyword2());
        clearAndType(url3TextBox, anALNArticle.getUrl3());
        clearAndType(keyword3TextBox, anALNArticle.getKeyword3());
        clearAndType(youtubeUrlTextBox, anALNArticle.getYoutubeUrl());
        clearAndType(scheduledDateTextBox, anALNArticle.getScheduledDate());

        if((null!=anALNArticle.getIsKeyword1Bold() && anALNArticle.getIsKeyword1Bold()) && !keyword1BoldCheckBox.isSelected()) {
            keyword1BoldCheckBox.click();
        } else if((null==anALNArticle.getIsKeyword1Bold() || !anALNArticle.getIsKeyword1Bold()) && keyword1BoldCheckBox.isSelected()) {
            keyword1BoldCheckBox.click();
        }

        if((null!=anALNArticle.getIsKeyword2Bold() && anALNArticle.getIsKeyword2Bold()) && !keyword2BoldCheckBox.isSelected()) {
            keyword2BoldCheckBox.click();
        } else if((null==anALNArticle.getIsKeyword2Bold() || !anALNArticle.getIsKeyword2Bold()) && keyword2BoldCheckBox.isSelected()) {
            keyword2BoldCheckBox.click();
        }

        if((null!=anALNArticle.getIsKeyword3Bold() && anALNArticle.getIsKeyword3Bold()) && !keyword3BoldCheckBox.isSelected()) {
            keyword3BoldCheckBox.click();
        } else if((null==anALNArticle.getIsKeyword3Bold() || !anALNArticle.getIsKeyword3Bold()) && keyword3BoldCheckBox.isSelected()) {
            keyword3BoldCheckBox.click();
        }

        AddArticleButton.click();
        this.waitForElementToLoad("linkText", "Sign Out");
        return PageFactory.initElements(driver, ALNDashboard.class);
    }

    public static void main(String args[]) {
//        ALNArticleFormObject anALNArticleFormObject = new ALNArticleFormObject();
//        anALNArticleFormObject.setProjectTitle("Get Ex Back 1");
//        ALNUtils.formatArticleForALN(anALNArticleFormObject, "E:/Dropbox/Website Campaigns/GetBackYourExNow.com/For Article Scraping/Article set 1/Formatted/2 Ways To Get Your Ex Girlfriend Back.txt", 1);
//        anALNArticleFormObject.setArticleTags("get ex back, break up, relationship, marriage, love, divorce, dating");
//        anALNArticleFormObject.setUrl1("http://www.getbackyourexnow.com/boyfriend-problems/tips-to-get-your-ex-boyfriend-back/");
//        anALNArticleFormObject.setKeyword1("{how to get your ex back|get your ex back|how to get my ex back|how to get back with your ex|get ex back|how to get an ex back|get my ex back|getting your ex back|how to get back your ex|how to get ex back|get your ex back fast|ways to get ex back|getting my ex back|get your ex back now|win ex back}");
//        anALNArticleFormObject.setIsKeyword1Bold(Boolean.TRUE);
        List<ALNArticleFormObject> ALNArticleFormObjects = ALNUtils.createALNArticles("E:/Dropbox/Website Campaigns/03.Cure Acne/promotion/ALN/", "Cure Acne - First ");
        ALNLoginPage anALNLoginPage = new ALNLoginPage(Page.constructDriver("firefox"));
        ALNDashboard anALNDashboard = anALNLoginPage.loginAs("pelangs", "123aln!@#");
        for(ALNArticleFormObject anALNArticleFormObject : ALNArticleFormObjects) {
            anALNDashboard = anALNDashboard.clickSubmitArticlesPage().submitArticle(anALNArticleFormObject);
            anALNDashboard.isElementVisible(null, null);
            try {
                String error = anALNDashboard.getDriver().findElement(By.className("notification error png_bg")).getText();
                System.out.println(anALNArticleFormObject.getArticleTitle() + " posting Error : " + error);
            } catch(Exception e) {
                System.out.println(anALNArticleFormObject.getArticleTitle() + " posted successfully");
            }
        }
        anALNDashboard.signOut();
    }
}
