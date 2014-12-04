package com.cybermint.contentSyndicator.sites.majesticSeo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MajesticSeoSiteExplorerPage extends MajesticSeoDashboardPage {

	@FindBy(xpath = "//input[@id=\"search_text\"]") 
	protected WebElement urlTextBox;
	
	@FindBy(xpath = "//input[@type=\"submit\"]") 
	protected WebElement exploreSubmitButton;
	
	@FindBy(xpath = "//input[@name=\"IndexDataSource\" and @value=\"H\"]") 
	protected WebElement historicIndexRadioButton;
	   
	@FindBy(xpath = "//input[@name=\"IndexDataSource\" and @value=\"F\"]") 
	protected WebElement freshIndexRadioButton;
	
	public MajesticSeoSiteExplorerPage(WebDriver driver) {
		super(driver);
	}
	
	public MajesticSeoSiteExplorerResultsPage queryHistoricBacklinksCount(String url) {
		historicIndexRadioButton.click();
		clearAndType(urlTextBox, url);
		exploreSubmitButton.click();
		return PageFactory.initElements(driver, MajesticSeoSiteExplorerResultsPage.class);
	}
	
	public MajesticSeoSiteExplorerResultsPage queryFreshBacklinksCount(String url) {
		freshIndexRadioButton.click();
		clearAndType(urlTextBox, url);
		exploreSubmitButton.click();
		return PageFactory.initElements(driver, MajesticSeoSiteExplorerResultsPage.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
