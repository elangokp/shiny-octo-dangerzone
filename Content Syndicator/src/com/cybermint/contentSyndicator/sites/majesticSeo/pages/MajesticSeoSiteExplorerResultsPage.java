/**
 * 
 */
package com.cybermint.contentSyndicator.sites.majesticSeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Elango
 *
 */
public class MajesticSeoSiteExplorerResultsPage extends
		MajesticSeoSiteExplorerPage {

	@FindBy(xpath = "//a[text()=\"Top Backlinks\"]")
	protected WebElement topBacklinksLink;
	
	/**
	 * @param driver
	 */
	public MajesticSeoSiteExplorerResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public MajesticSeoSiteExplorerTopBacklinksPage goToTopBacklinks() {
		topBacklinksLink.click();
		return PageFactory.initElements(driver, MajesticSeoSiteExplorerTopBacklinksPage.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
