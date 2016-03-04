package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.pages.Page;

public class YahooGeminiDashboardPage extends Page {

	@FindBy(css = "li.nav-notifications")
    protected WebElement notificationsIcon;
	
	@FindBy(css = "li.nav-icon span.icon-settings-filled")
    protected WebElement settingsIcon;

	@FindBy(css = "div.ui-table-pagination div.combobox i")
    protected WebElement resultsPerPageDropdown;	
	
	public YahooGeminiDashboardPage(WebDriver driver) {
		super(driver);
		((JavascriptExecutor) driver).executeScript("document.querySelector('#header').style.position = 'absolute';");
	}
	
	private void clickGotIt() {
		if(super.waitForElementToLoad("css", "div.finished button",2)) {
			WebElement gotitElement = driver.findElement(By.cssSelector("div.finished button"));
			gotitElement.click();
		}		
	}
	
	private void markAllNotificationsAsRead() {
		notificationsIcon.click();
		super.waitForElementToLoad("xpath", "//a[@ng-show=\"notifications\"]");
		driver.findElement(By.xpath("//a[@ng-show=\"notifications\"]")).click();
		super.waitForElementToBeDisappear("xpath", "//p[@class=\"ng-binding\" and contains(@ng-bind-html,\"notification\")]", 5);
		super.waitForElementToLoad("id", "datepicker");
	}
	
	private void selectToday() {
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		WebElement today = driver.findElement(By.cssSelector("div.daterangepicker div.first td.today"));
		today.click();
		super.waitForElementToLoad("xpath", "//h1[text()=\"All campaigns\"]");
		WebElement allCampaignsHeader = driver.findElement(By.xpath("//h1[text()=\"All campaigns\"]"));
		allCampaignsHeader.click();
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30); //The loading element while table refresh
	}
	
	private void selectOneMonth() {
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		WebElement oneMonthRange = driver.findElement(By.xpath("//div[contains(@class,\"daterangepicker\")]//div[@class=\"ranges\"]//li[contains(text(),\"One month\")]"));
		oneMonthRange.click();
		super.waitForElementToLoad("xpath", "//h1[text()=\"All campaigns\"]");
		WebElement allCampaignsHeader = driver.findElement(By.xpath("//h1[text()=\"All campaigns\"]"));
		allCampaignsHeader.click();
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30); //The loading element while table refresh
	}
	
	private void select200ResultsPerPage() {
		resultsPerPageDropdown.click();
		WebElement perPageMenuElement = driver.findElement(By.cssSelector("div.ui-table-pagination div.menu"));
		super.waitForElementToBeEnabled(perPageMenuElement);
		WebElement perPage200MenuItem = driver.findElement(By.xpath("//div[@class=\"ui-table-pagination\"]//div[@class=\"menu\"]//div[contains(text(),\"200\")]"));
		perPage200MenuItem.click();
		//System.out.println("Waiting for loader to disappear start: " + new Date());
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30); //The loading element while table refresh
		//System.out.println("Waiting for loader to disappear end: " + new Date());
	}
	
	private void selectAllCampaigns() {
		super.waitForElementToLoad("xpath", "//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th[@ng-show=\"checkboxColumn\"]/label");
		WebElement selectAll = driver.findElement(By.xpath("//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th[@ng-show=\"checkboxColumn\"]/label"));
		selectAll.click();
		super.waitForElementToLoad("xpath", "//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th[@ng-show=\"checkboxColumn\"]/input[@checked=\"checked\"]/../label");
	}
	
	private void selectCampaign(String campaignName) {
		String givenCampaignXpath = "//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr/td[@column-id=\"campaign_name\"]//a[text()=\"" + campaignName + "\"]/../../../td[@class=\"skinny\"]/label";
		String givenCampaignXpathAfterSelect = "//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr/td[@column-id=\"campaign_name\"]//a[text()=\"" + campaignName + "\"]/../../../td[@class=\"skinny\"]/input[@checked=\"checked\"]/../label";
		super.waitForElementToLoad("xpath", givenCampaignXpath);
		WebElement selectCampaign = driver.findElement(By.xpath(givenCampaignXpath));		
		selectCampaign.click();
		super.waitForElementToLoad("xpath", givenCampaignXpathAfterSelect);
	}
	
	private void deselectAllCampaigns() {
		WebElement deselectAll = driver.findElement(By.xpath("//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th[@ng-show=\"checkboxColumn\"]/input[@checked=\"checked\"]/../label"));
		deselectAll.click();
		super.waitForElementToLoad("xpath", "//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th[@ng-show=\"checkboxColumn\"]/label");
	}
	
	public void enableAllCampaigns() {
		this.select200ResultsPerPage();
		this.selectAllCampaigns();
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Enable\")]");
		WebElement enableButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Enable\")]"));
		enableButton.click();
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");
		deselectAllCampaigns();
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
		
	}
	
	public void deleteAllCampaigns() {
		this.select200ResultsPerPage();
		this.selectAllCampaigns();
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Delete\")]");
		WebElement deleteButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Delete\")]"));
		deleteButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]");
		WebElement deleteConfirmButton = driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]"));
		deleteConfirmButton.click();
		super.waitForElementToLoad("css", "div.ui-table div.loader");
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30);
		
	}
	
	private void pauseSelectedCampaigns() {
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Pause\")]");
		WebElement pauseButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Pause\")]"));
		pauseButton.click();
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");	
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
	}
	
	public void pauseOutlierCampaigns(List<Campaign> campaignList) {
		int toBePaused = 0;
		for(Campaign aCampaign : campaignList) {
			if(aCampaign.shouldBePaused()) {
				selectCampaign(aCampaign.getCampaignName());
				toBePaused++;
			}
		}
		if(toBePaused>0) {
			pauseSelectedCampaigns();
		}
		
	}
	
	public List<Campaign> getCampaignStats(String durationRange) {
		this.clickGotIt();
		this.markAllNotificationsAsRead();
		if(durationRange.equalsIgnoreCase(Campaign.today)) {
			this.selectToday();
		} else if(durationRange.equalsIgnoreCase(Campaign.oneMonth)) {
			this.selectOneMonth();
		}
		
		this.select200ResultsPerPage();
		List<WebElement> campaignRows = driver.findElements(By.xpath("//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr"));
		List<Campaign> campaigns = new ArrayList<Campaign>();
		for(WebElement campaignRow : campaignRows){
			Campaign aCampaign = new Campaign();
			aCampaign.setCampaignName(campaignRow.findElement(By.xpath("td[@column-id=\"campaign_name\"]//a")).getText());
			aCampaign.setBudget(campaignRow.findElement(By.xpath("td[@column-id=\"budget\"]//span[@class=\"ng-scope\"]")).getText());
			aCampaign.setCampaignStatus(campaignRow.findElement(By.xpath("td[@column-id=\"campaign_status\"]//span[@class=\"ng-scope\"]")).getText());
			aCampaign.setCampaignObjective(campaignRow.findElement(By.xpath("td[@column-id=\"campaign_objective\"]//span[@class=\"goal-type ng-scope\"]")).getText());
			aCampaign.setClicks(new Double(campaignRow.findElement(By.xpath("td[@column-id=\"clicks\"]//span[@class=\"ng-scope\"]")).getText().replaceAll(",", "")));
			aCampaign.setImpressions(new Double(campaignRow.findElement(By.xpath("td[@column-id=\"impressions\"]//span[@class=\"ng-scope\"]")).getText().replaceAll(",", "")));
			aCampaign.setCtr(new Double(campaignRow.findElement(By.xpath("td[@column-id=\"ctr\"]//span[@class=\"ng-scope\"]")).getText().replaceAll(",", "").replaceAll("%", "").replaceAll("—", "0")));
			aCampaign.setSpend(new Double(campaignRow.findElement(By.xpath("td[@column-id=\"spend\"]//span[@class=\"ng-scope\"]")).getText().replaceAll(",", "").replaceAll("\\$", "").replaceAll("—", "0")));
			aCampaign.setConversions(Integer.parseInt(campaignRow.findElement(By.xpath("td[@column-id=\"post_click_conversions\"]//span[@class=\"ng-scope\"]")).getText().replaceAll(",", "")));
			aCampaign.setStatsDuration(durationRange);
			campaigns.add(aCampaign);
		}
		return campaigns;
	}
	
	public void logout() {
		settingsIcon.click();
		super.waitForElementToLoad("xpath", "//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]");
		driver.findElement(By.xpath("//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]")).click();
		super.waitForElementToLoad("xpath", "//span[@ng-bind-html=\"signInText\"]/a");
	}

}
