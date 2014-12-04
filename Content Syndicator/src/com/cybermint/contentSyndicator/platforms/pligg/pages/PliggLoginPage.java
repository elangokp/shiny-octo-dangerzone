package com.cybermint.contentSyndicator.platforms.pligg.pages;

import com.cybermint.pages.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Krithika Vittal
 */
public class PliggLoginPage extends PliggPage {

    @FindBy(name = "username")
    private WebElement usernameTextBox;
    @FindBy(name = "password")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    public PliggLoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Provides login functionality
     * @param username in login credentials to the website
     * @param password in login credentials to the website
     * @return PliggHomePage which contains links to submit,edit profile and logout
     */
    public PliggNewsSourcePage loginAs(String username, String password) {
        super.waitForElementToBeEnabled(usernameTextBox);
        super.waitForElementToBeEnabled(passwordTextBox);
        super.waitForElementToBeEnabled(loginButton);
        usernameTextBox.clear();
        usernameTextBox.sendKeys(username);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
        loginButton.click();
        System.out.println(driver.getTitle());
        super.waitForElementToLoad("xpath", "//a[contains(@href,'submit.php')]");
        return PageFactory.initElements(driver, PliggNewsSourcePage.class);
    }

    public static void main(String args[]) {
        try {
            WebDriver driver = new FirefoxDriver();
            driver.get("http://cybermint.com/demos/pligg/login.php");
            PliggLoginPage aPliggLoginPage = PageFactory.initElements(driver, PliggLoginPage.class);
            PliggNewsSourcePage aPliggPage = aPliggLoginPage.loginAs("demo", "demo123");
            aPliggPage.enterNewsSourceURL("http://charlottesfancy.com/2009/06/05/summer-fun-list/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
