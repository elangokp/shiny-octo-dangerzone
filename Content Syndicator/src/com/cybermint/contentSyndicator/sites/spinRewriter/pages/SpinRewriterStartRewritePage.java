/**
 * 
 */
package com.cybermint.contentSyndicator.sites.spinRewriter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

/**
 * @author ADMIN
 *
 */
public class SpinRewriterStartRewritePage extends SpinRewriterControlPanel {

	@FindBy(xpath = "//textarea[@id=\"original_text\"]") 
	protected WebElement articleTextArea;
	
	@FindBy(xpath = "//button[@id=\"button_initialize\"]") 
	protected WebElement startRewritingButton;
	/**
	 * @param driver
	 */
	public SpinRewriterStartRewritePage(WebDriver driver) {
		super(driver);
	}
	
	public SpinRewriterEditRewritePage startRewrite(String text) {
		clearAndType(articleTextArea,text);
		startRewritingButton.click();
		this.waitForElementToLoad("xpath", "//button[@id=\"button_one_click_rewrite_dialog\"]");
		return PageFactory.initElements(driver, SpinRewriterEditRewritePage.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
