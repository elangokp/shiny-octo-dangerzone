/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.pages;

import com.cybermint.pages.Page;
import com.cybermint.serpScraper.google.utils.TempBan;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Elango
 */
public class GooglePreferences extends Page{

    public GooglePreferences(WebDriver driver) {
        super(driver);
    }

    public GoogleSearchPage setResultsPerPage(Integer num) {  
        WebElement disableGoogleInstantRadioButton = driver.findElement(By.xpath("//input[@id=\"suggmid\"]"));
        Select numOfResultsSelectBox = new Select(driver.findElement(By.xpath("//select[@id=\"numsel\"]")));
        List<WebElement> savePreferencesButtons = driver.findElements(By.xpath("//input[@name=\"submit2\"]"));
        disableGoogleInstantRadioButton.click();
        numOfResultsSelectBox.selectByValue(num.toString());
        savePreferencesButtons.get(0).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        super.waitForElementToLoad("name", "q");
        return PageFactory.initElements(driver, GoogleSearchPage.class);
    }

    public static void main(String args[]) {
        GooglePreferences aGooglePreferences = new GoogleSearchPage(Page.constructDriver("firefox"), new TempBan()).ClickSearchSettings();
        GoogleSearchPage aGoogleSearchPage = aGooglePreferences.setResultsPerPage(100);
        System.out.println("Preference setting completed successfully");
        GoogleSERPage aGoogleSERPage = aGoogleSearchPage.searchFor("get ex back");
        System.out.println(aGoogleSERPage.getSERPLinks().size());
    }


}
