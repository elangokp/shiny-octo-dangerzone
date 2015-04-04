/**
 * 
 */
package com.cybermint.contentSyndicator.sites.spinRewriter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;

/**
 * @author ADMIN
 * 
 */
public class SpinRewriterControlPanel extends Page {

	@FindBy(xpath = "//a[@href=\"http://www.spinrewriter.com/action/log-out\"]")
	protected WebElement logOutLink;
	@FindBy(xpath = "//a[@href=\"http://www.spinrewriter.com/cp-rewriter-start\"]")
	protected WebElement rewriteLink;

	/**
	 * @param driver
	 */
	public SpinRewriterControlPanel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public SpinRewriterLoginPage logout() {
		logOutLink.click();
		this.waitForElementToLoad("id", "submit");
        return PageFactory.initElements(driver, SpinRewriterLoginPage.class);
	}
	
	public SpinRewriterStartRewritePage goToRewritePage() {
		rewriteLink.click();
		this.waitForElementToLoad("xpath", "//button[@id=\"button_initialize\"]");
        return PageFactory.initElements(driver, SpinRewriterStartRewritePage.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpinRewriterLoginPage aSpinRewriterLoginPage = new SpinRewriterLoginPage(Page.constructDriver("firefox"));
		SpinRewriterControlPanel aSpinRewriterControlPanel = aSpinRewriterLoginPage.loginAs("pelangs@gmail.com", "123spinrewriter!@#");
		SpinRewriterStartRewritePage aSpinRewriterStartRewritePage = aSpinRewriterControlPanel.goToRewritePage();
		SpinRewriterEditRewritePage aSpinRewriterEditRewritePage = aSpinRewriterStartRewritePage.startRewrite(TextFileReaderUtils.readFileAsString("G:/text.txt"));
		SpinRewriterFinishedRewritePage aSpinRewriterFinishedRewritePage = aSpinRewriterEditRewritePage.startOneClickRewrite();
		System.out.println(aSpinRewriterFinishedRewritePage.getRewrittenArticle());
		//aSpinRewriterLoginPage = aSpinRewriterControlPanel.logout();
		//aSpinRewriterLoginPage.loginAs("pelangs@gmail.com", "123spinrewriter!@#");
	}

}
