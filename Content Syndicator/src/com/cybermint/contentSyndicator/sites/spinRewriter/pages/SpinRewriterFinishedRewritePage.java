package com.cybermint.contentSyndicator.sites.spinRewriter.pages;

import org.apache.commons.lang3.StringEscapeUtils;
import org.openqa.jetty.html.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpinRewriterFinishedRewritePage extends SpinRewriterControlPanel{

	@FindBy(xpath = "//textarea[@id=\"finished_text\"]") 
	protected WebElement finishedArticleTextArea;
	
	public SpinRewriterFinishedRewritePage(WebDriver driver) {
		super(driver);
	}
	
	public String getRewrittenArticle() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String rewrittenText = js.executeScript("return arguments[0].innerHTML", finishedArticleTextArea).toString();
		rewrittenText = StringEscapeUtils.escapeHtml4(rewrittenText);
		return rewrittenText;
	}

}
