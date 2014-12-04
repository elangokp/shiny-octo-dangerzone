/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.platforms.wordpress.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class WordpressProfilePage extends WordpressDashboard {

    @FindBy(id = "nickname") protected WebElement nicknameTextBox;
    @FindBy(id = "pass1") protected WebElement password1TextBox;
    @FindBy(id = "pass2") protected WebElement password2TextBox;
    @FindBy(id = "display_name") protected WebElement displayNameSelectBox;
    //@FindBy(id = "display_username") protected WebElement displayUsernameOption;
    //@FindBy(id = "display_nickname") protected WebElement displayNicknameOption;
    @FindBy(name = "submit") protected WebElement updateProfileButton;

    public WordpressProfilePage(WebDriver driver) {
        super(driver);
    }

    public WordpressProfilePage setNickname(String nickname) {
        nicknameTextBox.clear();
        nicknameTextBox.click();
        nicknameTextBox.sendKeys(nickname);
        return PageFactory.initElements(driver, WordpressProfilePage.class);
    }

    public WordpressProfilePage setPassword(String password) {
        password1TextBox.clear();
        password1TextBox.click();
        password1TextBox.sendKeys(password);
        password2TextBox.clear();
        password2TextBox.click();
        password2TextBox.sendKeys(password);
        return PageFactory.initElements(driver, WordpressProfilePage.class);
    }

    public WordpressProfilePage setNicknameAsDisplayName() {
        //displayNameSelectBox.findElement(By.id("display_nickname")).setSelected();
        return PageFactory.initElements(driver, WordpressProfilePage.class);
    }

    public WordpressProfilePage setUsernameAsDisplayName() {
        //displayNameSelectBox.findElement(By.id("display_username")).setSelected();
        return PageFactory.initElements(driver, WordpressProfilePage.class);
    }

    public WordpressProfilePage submitProfileForm() {
        updateProfileButton.submit();
        super.waitForElementToLoad("name", "submit");
        return PageFactory.initElements(driver, WordpressProfilePage.class);
    }

    public static void main(String args[]) {
       try {
            WebDriver driver = new FirefoxDriver();
            driver.get("http://www.buildabsnow.com/wp-login.php");
            Page aPage = new Page(driver);
            aPage.waitForElementToLoad("id", "user_login");
            WordpressLoginPage aWordpressLoginPage = PageFactory.initElements(driver, WordpressLoginPage.class);
            WordpressProfilePage aWordpressProfilePage = aWordpressLoginPage.loginAs("admin", "GD6afvJ^1V!h").clickEditProfile();
            aWordpressProfilePage = aWordpressProfilePage.setNickname("remo").submitProfileForm();
            aWordpressProfilePage = aWordpressProfilePage.setNicknameAsDisplayName().submitProfileForm();
            aWordpressLoginPage = aWordpressProfilePage.logOut();

            String displayName = aWordpressLoginPage.loginAs("admin", "GD6afvJ^1V!h").getDisplayName();
            if(!"remo".equalsIgnoreCase(displayName)) {
                System.out.println(" Failed ");
            }else if("remo".equalsIgnoreCase(displayName)) {
                System.out.println(" Passed ");
            }
        } catch (Exception e) {
            //if(driver != null) {
               // driver.quit();
            //}
           //failedSites.add(startingURL);
            e.printStackTrace();
            System.out.println("Exception Failed ");
        }
    }
}
