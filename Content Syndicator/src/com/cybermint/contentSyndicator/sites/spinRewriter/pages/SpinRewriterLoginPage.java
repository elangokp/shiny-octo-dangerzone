/**
 * 
 */
package com.cybermint.contentSyndicator.sites.spinRewriter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.contentSyndicator.sites.spinRewriter.formObjects.SpinRewriterLoginFormObject;
import com.cybermint.pages.Page;

/**
 * @author ADMIN
 *
 */
public class SpinRewriterLoginPage extends Page{

	@FindBy(xpath = "//input[@id=\"email\" and @class=\"subpageForm\"]") 
	protected WebElement usernameTextBox;
	@FindBy(xpath = "//input[@id=\"password\" and @class=\"subpageForm\"]") 
	protected WebElement passwordTextBox;
	@FindBy(xpath = "//input[@id=\"submit\"]") 
	protected WebElement submitButton;

	
	public SpinRewriterLoginPage(WebDriver driver) {
        super(driver);
        driver.get("http://www.spinrewriter.com/log-in");
        this.initialize();
    }
	
	public SpinRewriterControlPanel loginAs(String username, String password) {
        clearAndType(usernameTextBox,username);
        clearAndType(passwordTextBox,password);
        submitButton.click();
        //this.waitForElementToLoad("xpath", "//a[@href=\"http://www.spinrewriter.com/action/log-out\"]");
        return PageFactory.initElements(driver, SpinRewriterControlPanel.class);
    }
	
	public SpinRewriterControlPanel loginAs(SpinRewriterLoginFormObject aSpinRewriterLoginFormObject) {
        clearAndType(usernameTextBox,aSpinRewriterLoginFormObject.getEmail());
        clearAndType(passwordTextBox,aSpinRewriterLoginFormObject.getPassword());
        submitButton.click();
        //this.waitForElementToLoad("xpath", "//a[@href=\"http://www.spinrewriter.com/action/log-out\"]");
        return PageFactory.initElements(driver, SpinRewriterControlPanel.class);
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpinRewriterLoginPage aSpinRewriterLoginPage = new SpinRewriterLoginPage(Page.constructDriver("firefox"));
		aSpinRewriterLoginPage.loginAs("pelangs@gmail.com", "123spinrewriter!@#");
	}

}
