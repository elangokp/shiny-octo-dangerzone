package com.cybermint.contentSyndicator.sites.spinRewriter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpinRewriterEditRewritePage extends SpinRewriterControlPanel{

	@FindBy(xpath = "//button[@id=\"button_one_click_rewrite_dialog\"]") 
	protected WebElement oneClickRewriteDialogButton;
	
	@FindBy(xpath = "//button[@id=\"button_one_click_rewrite\"]") 
	protected WebElement oneClickRewriteButton;
	
	@FindBy(xpath = "//button[@id=\"button_finalize\"]") 
	protected WebElement oneClickFinalizeButton;
	
	@FindBy(xpath = "//div[@class=\"ui-widget-overlay\"]") 
	protected WebElement overlay;
	
	public SpinRewriterEditRewritePage(WebDriver driver) {
		super(driver);
	}
	
	public SpinRewriterFinishedRewritePage startOneClickRewrite() {
		this.waitForElementToBeDisappear("xpath", "//div[@class=\"ui-widget-overlay\"]", 300);
		oneClickRewriteDialogButton.click();
		this.waitForElementToBeEnabled(oneClickRewriteButton);
		oneClickRewriteButton.click();
		this.waitForElementToBeDisappear("xpath", "//div[@class=\"ui-widget-overlay\"]", 1800);
		oneClickFinalizeButton.click();
		Boolean didDisappear = this.waitForElementToBeDisappear("xpath", "//div[@class=\"ui-widget-overlay\"]", 300);
		if(!didDisappear) {
			WebElement errorDialogTitle = driver.findElement(By.xpath("//span[@class=\"ui-dialog-title-dialog-message\"]"));
			if(errorDialogTitle.getText().contains("wrong")) {
				WebElement errorDialogCloseButton = driver.findElement(By.xpath("//a[@class=\"ui-dialog-titlebar-close ui-corner-all\"]"));
				errorDialogCloseButton.click();
			}
			oneClickFinalizeButton.click();
			this.waitForElementToBeDisappear("xpath", "//div[@class=\"ui-widget-overlay\"]", 300);
		}
		System.out.println("Wait is over");
		return PageFactory.initElements(driver, SpinRewriterFinishedRewritePage.class);
	}

}
