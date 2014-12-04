package com.cybermint.contentSyndicator.sites.majesticSeo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cybermint.utils.TextFileReaderUtils;

public class MajesticSeoBulkBacklinksCheckerPage extends
		MajesticSeoDashboardPage {

	@FindBy(xpath = "//input[@name=\"IndexDataSource\" and @value=\"H\"]") 
	protected WebElement historicIndexRadioButton;
	   
	@FindBy(xpath = "//input[@name=\"IndexDataSource\" and @value=\"F\"]") 
	protected WebElement freshIndexRadioButton;
	   
	@FindBy(xpath = "//textarea[@name=\"q\"]") 
	protected WebElement urlsTextArea;
	
	@FindBy(xpath = "//select[@name=\"SortBy\"]") 
	protected WebElement sortBySelectBox;
	
	@FindBy(xpath = "//input[@name=\"getcounts\"]") 
	protected WebElement getCountsButton;
	   
	public MajesticSeoBulkBacklinksCheckerPage(WebDriver driver) {
		super(driver);
	}
	
	public MajesticSeoBulkBacklinksCheckerResultsPage queryHistoricBacklinksCount(List<String> urls) {
		historicIndexRadioButton.click();
		StringBuffer urlsAsStringBuffer = new StringBuffer();
		for(String url:urls) {
			urlsAsStringBuffer.append(url).append("\n");			
		}
		clearAndType(urlsTextArea, urlsAsStringBuffer.toString());
		Select sortBySelectBoxAsSelect = new Select(sortBySelectBox);
		sortBySelectBoxAsSelect.selectByValue("-1");
		getCountsButton.click();
		return PageFactory.initElements(driver, MajesticSeoBulkBacklinksCheckerResultsPage.class);
	}
	
	public MajesticSeoBulkBacklinksCheckerResultsPage queryFreshBacklinksCount(List<String> urls) {
		freshIndexRadioButton.click();
		StringBuffer urlsAsStringBuffer = new StringBuffer();
		for(String url:urls) {
			urlsAsStringBuffer.append(url).append("\n");
		}
		clearAndType(urlsTextArea, urlsAsStringBuffer.toString());
		((Select)sortBySelectBox).selectByValue("-1");
		getCountsButton.click();
		return PageFactory.initElements(driver, MajesticSeoBulkBacklinksCheckerResultsPage.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> urls = TextFileReaderUtils.readLinesAsList("F:/My Dropbox/Website Campaigns/02.Panic Attacks/temp-url.txt", false);
		
	}

}
