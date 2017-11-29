package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.pages.Page;
import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class YahooGeminiDashboardPage extends Page {

	@FindBy(css = "li.nav-notifications")
    protected WebElement notificationsIcon;
	
	@FindBy(css = "li.nav-icon span.icon-settings-filled")
    protected WebElement settingsIcon;

	@FindBy(css = "div.ui-table-pagination div.combobox i")
    protected WebElement resultsPerPageDropdown;	
	
	public YahooGeminiDashboardPage(WebDriver driver) {
		super(driver);
		((JavascriptExecutor) driver).executeScript("document.querySelector('#header').style.position = 'static';");
		((JavascriptExecutor) driver).executeScript("document.querySelector('footer').style.display = 'none';");
		if(super.waitForElementToLoad("css", "div.message-shown",2)) {
			try {
				((JavascriptExecutor) driver).executeScript("document.querySelector('div.message-shown').style.position = 'absolute';");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(super.waitForElementToLoad("css", "#system-message",2)) {
			try {
				((JavascriptExecutor) driver).executeScript("document.querySelector('#system-message').style.visibility='hidden';");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public boolean isAccountsPage() {
		if(driver.getCurrentUrl().contains("account")) {
			return true;
		} else {
			return false;
		}
	}
	
	public List<String> getSubAccountURLs() {
		List<String> subAccountURLs = new ArrayList<String>();
		String jsstmt = "var nodesSnapshot = document.evaluate('//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr/td[@column-id=\"advertiserName\"]//a', document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null );";
		jsstmt += "var accountURLs = [];";
		jsstmt += "for ( var i=0 ; i < nodesSnapshot.snapshotLength; i++ )";
		jsstmt += "{";
		jsstmt += "accountURLs.push(nodesSnapshot.snapshotItem(i).getAttribute(\"href\"));";		
		jsstmt += "}";
		jsstmt += "return accountURLs;";
		super.waitForElementToLoad("xpath", "//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr/td[@column-id=\"advertiserName\"]//a");
		subAccountURLs = (List<String>) ((JavascriptExecutor) driver).executeScript(jsstmt);
		return subAccountURLs;
	}
	
	public String getAccountName() {
		return driver.findElement(By.cssSelector("#accountSelector span:nth-child(2)")).getText().trim();
	}
	
	public void dismissSplash() {
		System.out.println("Inside dismissSplash");
		if(super.waitForElementToLoad("css", "#remindLater",2)) {
			System.out.println("Inside remindLater");
			WebElement remindLaterCheckBox = driver.findElement(By.id("remindLater"));
			remindLaterCheckBox.click();
			System.out.println("After remindLater click");
			if(super.waitForElementToLoad("css", "div#feature-splash a.dismiss",2)) {
				try {
					((JavascriptExecutor) driver).executeScript("document.querySelector('div#feature-splash a.dismiss').click();");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//WebElement dismissButton = driver.findElement(By.cssSelector("div#feature-splash a.dismiss"));
			//dismissButton.click();
			System.out.println("After dismissButton click");
		}		
	}
	
	public void clickGotIt() {
		System.out.println("Inside clickGotIt");
		if(super.waitForElementToLoad("id", "div.finished button",2)) {
			WebElement gotitElement = driver.findElement(By.cssSelector("div.finished button"));
			gotitElement.click();
		}		
	}
	
	public YahooGeminiBillingPage goToBilling() {
		/*
		WebElement settingsIcon = driver.findElement(By.cssSelector("span.icon-settings-filled"));
		settingsIcon.click();
		System.out.println("After Settings Icon Click");
		WebElement billingLink = driver.findElement(By.linkText("Billing"));
		billingLink.click();
		System.out.println("After Billing Icon Click");
		*/
		String baseAdvertiserURL = driver.getCurrentUrl().replaceAll("campaigns.*", "");
		String billingURL = baseAdvertiserURL + "billing";
		driver.get(billingURL);
		super.waitForElementToLoad("id", "yahooPaymentWidgetFrame");
		return PageFactory.initElements(driver, YahooGeminiBillingPage.class);
	}
	
	public YahooGeminiReportsPage goToReportspage() {
		String baseAdvertiserURL = driver.getCurrentUrl().replaceAll("campaigns.*", "");
		String reportsURL = baseAdvertiserURL + "reportBuilder";
		driver.get(reportsURL);
		super.waitForElementToLoad("css", "a[href*=\"reportBuilder/create\"]");
		return PageFactory.initElements(driver, YahooGeminiReportsPage.class);
	}
	
	public YahooGeminiReportsCreatePage goToReportsCreatepage() {
		String baseAdvertiserURL = driver.getCurrentUrl().replaceAll("campaigns.*", "");
		String reportsBuilderURL = baseAdvertiserURL + "reportBuilder/create";
		driver.get(reportsBuilderURL);
		super.waitForElementToLoad("css", "button[ng-click*=\"onScheduleClick\"]");
		return PageFactory.initElements(driver, YahooGeminiReportsCreatePage.class);
	}
	
	public void markAllNotificationsAsRead() {
		notificationsIcon.click();
		super.waitForElementToLoad("xpath", "//a[@ng-show=\"notifications\"]");
		driver.findElement(By.xpath("//a[@ng-show=\"notifications\"]")).click();
		super.waitForElementToBeDisappear("xpath", "//p[@class=\"ng-binding\" and contains(@ng-bind-html,\"notification\")]", 5);
		super.waitForElementToLoad("css", "div.date-range-selector");
	}
	
	/*private void selectDates(Date startDate, Date endDate) {
		System.out.println("In Select Dates before daterange selector: " + new Date());
		WebElement datePicker = driver.findElement(By.cssSelector("div.date-range-selector"));
		System.out.println("In Select Dates after daterange selector: " + new Date());
		System.out.println("In Select Dates before daterange click: " + new Date());
		datePicker.click();
		System.out.println("In Select Dates after daterange click: " + new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(startDate));
		WebElement startDateTextBox = driver.findElement(By.cssSelector("div.date-range input[name=\"startDate\"]"));
		this.clearAndType(startDateTextBox, sdf.format(startDate));
		System.out.println(sdf.format(startDate));
		WebElement endDateTextBox = driver.findElement(By.cssSelector("div.date-range input[name=\"endDate\"]"));
		this.clearAndType(endDateTextBox, sdf.format(endDate));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement customLabel = driver.findElement(By.cssSelector("div.date-range span"));
		customLabel.click();
		WebElement applyButton = driver.findElement(By.cssSelector("div.date-range-options div.apply-btn"));
		applyButton.click();
		super.waitForElementToLoad("xpath", "//h1[text()=\"All campaigns\"]");
		WebElement allCampaignsHeader = driver.findElement(By.xpath("//h1[text()=\"All campaigns\"]"));
		allCampaignsHeader.click();
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30); //The loading element while table refresh
		
	}*/
	
	private void selectToday() {
		WebElement datePicker = driver.findElement(By.cssSelector("div.date-range-selector"));
		datePicker.click();
		WebElement todayRangeLabel = driver.findElement(By.xpath("//div[@class=\"date-range\"]//li[contains(text(),\"Today\")]"));
		todayRangeLabel.click();
		//WebElement applyButton = driver.findElement(By.cssSelector("div.date-range-options div.apply-btn"));
		//applyButton.click();
		super.waitForElementToLoad("xpath", "//h1[text()=\"All campaigns\"]");
		WebElement allCampaignsHeader = driver.findElement(By.xpath("//h1[text()=\"All campaigns\"]"));
		allCampaignsHeader.click();
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30); //The loading element while table refresh
	}
	
	private void selectYesterday() {
		WebElement datePicker = driver.findElement(By.cssSelector("div.date-range-selector"));
		datePicker.click();
		WebElement todayRangeLabel = driver.findElement(By.xpath("//div[@class=\"date-range\"]//li[contains(text(),\"Yesterday\")]"));
		todayRangeLabel.click();
		WebElement applyButton = driver.findElement(By.cssSelector("div.date-range-options div.apply-btn"));
		applyButton.click();
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
		//System.out.println("Inside select200ResultsPerPage");
		//resultsPerPageDropdown = driver.findElement(By.cssSelector("div.ui-table-pagination div.combobox"));
		//System.out.println("1");
		//resultsPerPageDropdown.click();
		//System.out.println("2");
		((JavascriptExecutor) driver).executeScript("document.querySelector('div.ui-table-pagination div.menu').style.display = 'block';");
		WebElement perPageMenuElement = driver.findElement(By.cssSelector("div.ui-table-pagination div.menu"));
		System.out.println("3");
		super.waitForElementToBeEnabled(perPageMenuElement);
		System.out.println("4");
		WebElement perPage200MenuItem = driver.findElement(By.xpath("//div[@class=\"ui-table-pagination\"]//div[contains(@class,\"menu\")]//div[contains(text(),\"500\")]"));
		System.out.println("5");
		super.waitForElementToBeEnabled(perPage200MenuItem);
		System.out.println("5.5");
		((JavascriptExecutor) driver).executeScript("document.evaluate('//div[@class=\"ui-table-pagination\"]//div[contains(@class,\"menu\")]//div[contains(text(),\"500\")]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");
		//perPage200MenuItem.click();
		System.out.println("6");
		//System.out.println("Waiting for loader to disappear start: " + new Date());
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30); //The loading element while table refresh
		//System.out.println("Waiting for loader to disappear end: " + new Date());
		System.out.println("7");
	}
	
	private void selectAllCampaigns() {
		super.waitForElementToLoad("xpath", "//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/label");
		WebElement selectAll = driver.findElement(By.xpath("//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/label"));
		selectAll.click();
		super.waitForElementToLoad("xpath", "//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/input[@checked=\"checked\"]/../label");
	}
	
	private void selectCampaign(String campaignName) {
		String givenCampaignXpath = "//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr/td[@column-id=\"campaign_name\"]//a[text()=\"" + campaignName + "\"]/../../../td/label";
		String givenCampaignXpathAfterSelect = "//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr/td[@column-id=\"campaign_name\"]//a[text()=\"" + campaignName + "\"]/../../../td/input[@checked=\"checked\"]/../label";
		super.waitForElementToLoad("xpath", givenCampaignXpath);
		WebElement selectCampaign = driver.findElement(By.xpath(givenCampaignXpath));		
		selectCampaign.click();
		super.waitForElementToLoad("xpath", givenCampaignXpathAfterSelect);
	}
	
	private void deselectAllCampaigns() {
		WebElement deselectAll = driver.findElement(By.xpath("//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/input[@checked=\"checked\"]/../label"));
		deselectAll.click();
		super.waitForElementToLoad("xpath", "//table[@ng-class=\"{ fetching: fetching }\"]/thead/tr/th/label");
	}
	
	public void clearAllCampaignSelection() {
		selectAllCampaigns();
		deselectAllCampaigns();
	}
	
	public boolean areCampaignsAvailable() {
		return super.waitForElementToLoad("css", "div.ui-table-pagination div.combobox i", 2);
	}
	
	public void enableAllCampaigns() {
		this.select200ResultsPerPage();
		this.selectAllCampaigns();
		WebElement actionsButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Enable\")]");
		WebElement enableButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Enable\")]"));
		enableButton.click();
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");
		deselectAllCampaigns();
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
		
	}
	
	public void deleteAllCampaigns() {
		this.select200ResultsPerPage();
		this.selectAllCampaigns();
		//WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		WebElement actionsButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		//super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]");
		super.waitForElementToLoad("xpath", "//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]");
		//WebElement deleteButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]"));
		WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]"));
		deleteButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"modal-footer\"]//button[contains(text(),\"Yes\")]");
		WebElement deleteConfirmButton = driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[contains(text(),\"Yes\")]"));
		deleteConfirmButton.click();
		super.waitForElementToLoad("css", "div.ui-table div.loader");
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30);
		
	}
	
	public void deleteAllAdgroups() {
		super.waitForElementToLoad("xpath", "//ul[contains(@class,\"nav-tabs\")]//li//a[contains(text(),\"Ad groups\")]");
		WebElement adGroupsTab = driver.findElement(By.xpath("//ul[contains(@class,\"nav-tabs\")]//li//a[contains(text(),\"Ad groups\")]"));
		adGroupsTab.click();
		this.deleteAllCampaigns();		
	}
	
	public void setBidForAllAdgroupsTo(float dollars) {
		super.waitForElementToLoad("xpath", "//ul[contains(@class,\"nav-tabs\")]//li//a[contains(text(),\"Ad groups\")]");
		WebElement adGroupsTab = driver.findElement(By.xpath("//ul[contains(@class,\"nav-tabs\")]//li//a[contains(text(),\"Ad groups\")]"));
		adGroupsTab.click();
		this.select200ResultsPerPage();
		this.selectAllCampaigns();
		WebElement actionsButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Edit native bid\")]");
		WebElement editNativeBidButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Edit native bid\")]"));
		editNativeBidButton.click();
		super.waitForElementToLoad("xpath", "//div[@ng-if=\"bulkEdit.useNumberInput\"]//input");
		WebElement bidAmountInput = driver.findElement(By.xpath("//div[@ng-if=\"bulkEdit.useNumberInput\"]//input"));
		super.clearAndType(bidAmountInput, String.valueOf(dollars));
		super.waitForElementToLoad("id", "makeChangesButton");
		WebElement makeChangesButton = driver.findElement(By.id("makeChangesButton"));
		makeChangesButton.click();
		//System.out.println("Before waiting for changes saved notification - " + new Date());
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 7);
		//System.out.println("After changes saved notification - " + new Date());
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 7);
		//System.out.println("After changes saved notification Disappeared- " + new Date());
		
	}
	
	public void deleteAllAds() {
		super.waitForElementToLoad("xpath", "//ul[contains(@class,\"nav-tabs\")]//li//a[contains(text(),\"Ads\")]");
		WebElement adsTab = driver.findElement(By.xpath("//ul[contains(@class,\"nav-tabs\")]//li//a[contains(text(),\"Ads\")]"));
		adsTab.click();
		this.deleteAllCampaigns();		
	}
	
	
	
	private void pauseSelectedCampaigns() {
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Pause\")]");
		WebElement pauseButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Pause\")]"));
		pauseButton.click();
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");	
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
	}
	
	private void activateSelectedCampaigns() {
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Enable\")]");
		WebElement enableButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Enable\")]"));
		enableButton.click();
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");	
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
	}
	
	private void deleteSelectedCampaigns() {
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]");
		WebElement deleteButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/a[contains(text(),\"Delete\")]"));
		deleteButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]");
		WebElement deleteConfirmButton = driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]"));
		deleteConfirmButton.click();
		super.waitForElementToLoad("css", "div.ui-table div.loader");
		super.waitForElementToBeDisappear("css", "div.ui-table div.loader", 30);
	}
	
	public void pauseOutlierCampaigns(List<Campaign> campaignList) {
		int toBePaused = 0;
		for(Campaign aCampaign : campaignList) {
			if(aCampaign.shouldPauseThisCampaign()) {
				selectCampaign(aCampaign.getCampaignName());
				toBePaused++;
			}
		}
		if(toBePaused>0) {
			pauseSelectedCampaigns();
		}
		
	}
	
	public void pauseAllCampaigns(List<Campaign> campaignList) {
		if(campaignList.size()>0) {
			this.selectAllCampaigns();
			pauseSelectedCampaigns();
		}
		
	}
	
	public void activateNormalCampaigns(List<Campaign> campaignList) {
		int toBeActivated = 0;
		for(Campaign aCampaign : campaignList) {
			if(aCampaign.shouldActivateThisCampaign()) {
				selectCampaign(aCampaign.getCampaignName());
				toBeActivated++;
			}
		}
		if(toBeActivated>0) {
			activateSelectedCampaigns();
		}
		
	}
	
	public void deletePausedCampaigns(List<Campaign> campaignList) {
		int toBeDeleted = 0;
		for(Campaign aCampaign : campaignList) {
			if(aCampaign.getCampaignStatus().equalsIgnoreCase("Paused")) {
				selectCampaign(aCampaign.getCampaignName());
				toBeDeleted++;
			}
		}
		if(toBeDeleted>0) {
			deleteSelectedCampaigns();
		}
		
	}
	
	public List<Campaign> getCampaignStats(String durationRange) {
		String jsstmt = "var nodesSnapshot = document.evaluate('//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr', document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null );";
		jsstmt += "var campaigns = [];";
		jsstmt += "for ( var i=0 ; i < nodesSnapshot.snapshotLength; i++ )";
		jsstmt += "{";
		jsstmt += "var columns = nodesSnapshot.snapshotItem(i).childNodes;";
		jsstmt += "var txt='';";
		jsstmt += "var campaignId='';";
		jsstmt += "for (j = 2; j < columns.length; j++) { ";
		jsstmt += "if(j == 2) {";
		jsstmt += "campaignId = document.evaluate('.//a/@href', columns[j], null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue.nodeValue;";
		jsstmt += "}";
		jsstmt += "if(j == columns.length - 1) {";
		jsstmt += "txt += columns[j].textContent;";
		jsstmt += "} else {";
		jsstmt += "txt += columns[j].textContent+'||';";
		jsstmt += "}";
		jsstmt += "}";
		jsstmt += "txt += '||'+campaignId;";
		jsstmt += "campaigns.push(txt);";
		jsstmt += "}";
		jsstmt += "return campaigns;";
		this.markAllNotificationsAsRead();
		List<Campaign> campaigns = new ArrayList<Campaign>();
		//Check if the account is empty. No campaigns
		if(super.waitForElementToLoad("xpath", "//upload-selected//span", 1)) {
			return campaigns;
		}
		if(durationRange.equalsIgnoreCase(Campaign.today)) {
			//System.out.println("In Select today if start: " + new Date());
			this.selectToday();
		} else if(durationRange.equalsIgnoreCase(Campaign.yesterday)) {
			this.selectYesterday();
		}else if(durationRange.equalsIgnoreCase(Campaign.oneMonth)) {
			this.selectOneMonth();
		}
		//System.out.println("Before selecting 200 results - " + new Date() + "\n");
		this.select200ResultsPerPage();
		//System.out.println("After selecting 200 results - " + new Date() + "\n");
		//System.out.println("Before Campaigns loop - " + new Date() + "\n");
		/*String campaignextractjsFilePath = null;
		try {
			campaignextractjsFilePath = new URI(getClass().getResource("campaignextractjs.txt").toString()).getPath();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} 
		System.out.println(campaignextractjsFilePath);*/
		//String jsstmt = TextFileReaderUtils.readFileAsString("./metadata/campaignextractjs.txt");
		List<String> allCampaignData = (List<String>) ((JavascriptExecutor) driver).executeScript(jsstmt);		
		for(String aCampaignData : allCampaignData) {
			Campaign aCampaign = new Campaign();
			String[] aCampaignDataFields = aCampaignData.split("\\|\\|");
			aCampaign.setCampaignName(aCampaignDataFields[0]);
			aCampaign.setBudget(aCampaignDataFields[1]);
			aCampaign.setCampaignStatus(aCampaignDataFields[2]);
			aCampaign.setCampaignObjective(aCampaignDataFields[3]);
			aCampaign.setClicks(new Double(aCampaignDataFields[4].replaceAll(",", "").replaceAll("—", "0")));
			aCampaign.setImpressions(new Double(aCampaignDataFields[5].replaceAll(",", "").replaceAll("—", "0")));
			aCampaign.setCtr((aCampaign.getImpressions()>0 ? (aCampaign.getClicks()/aCampaign.getImpressions()) : 0)*100);
			aCampaign.setSpend(new Double(aCampaignDataFields[7].replaceAll("\\$", "").replaceAll("—", "0")));
			aCampaign.setAvgCPC(new Double(aCampaignDataFields[8].replaceAll("\\$", "").replaceAll("—", "0")));
			aCampaign.setAvgCPA(new Double(aCampaignDataFields[9].replaceAll("\\$", "").replaceAll("—", "0")));
			aCampaign.setConversions(new Integer(aCampaignDataFields[10].replaceAll(",", "").replaceAll("—", "0")));
			String campaignId = aCampaignDataFields[11].split("/")[2];
			aCampaign.setCampaignId(campaignId);
			aCampaign.setStatsDuration(durationRange);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(durationRange.equalsIgnoreCase(Campaign.today)) {
				aCampaign.setStatsDurationDates(sdf.format(new Date()));
			} else if(durationRange.equalsIgnoreCase(Campaign.yesterday)) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DATE, -1);
				aCampaign.setStatsDurationDates(sdf.format(cal.getTime()));
			}else if(durationRange.equalsIgnoreCase(Campaign.oneMonth)) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.MONTH, -1);
				aCampaign.setStatsDurationDates(sdf.format(cal.getTime()) + " - " + sdf.format(new Date()));
			}
			campaigns.add(aCampaign);
		}
		//System.out.println("After Campaigns loop - " + new Date() + "\n");
		/*
		System.out.println("Before selecting Campaign Rows - " + new Date() + "\n");
		List<WebElement> campaignRows = driver.findElements(By.xpath("//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr"));
		System.out.println("After selecting Campaign Rows - " + new Date() + "\n");
		List<Campaign> campaigns = new ArrayList<Campaign>();
		System.out.println("Before Campaigns loop - " + new Date() + "\n");
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
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(durationRange.equalsIgnoreCase(Campaign.today)) {
				aCampaign.setStatsDurationDates(sdf.format(new Date()));
			} else if(durationRange.equalsIgnoreCase(Campaign.yesterday)) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DATE, -1);
				aCampaign.setStatsDurationDates(sdf.format(cal.getTime()));
			}else if(durationRange.equalsIgnoreCase(Campaign.oneMonth)) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.MONTH, -1);
				aCampaign.setStatsDurationDates(sdf.format(cal.getTime()) + " - " + sdf.format(new Date()));
			}
			campaigns.add(aCampaign);
		}
		System.out.println("After Campaigns loop - " + new Date() + "\n");
		return campaigns;
		*/
		return campaigns;
	}
	
	public boolean uploadBulkCampaignsOnEmptyAccount(String bulkCampaignsFilePath) {
		try {
			if(super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]", 3)) {
				return uploadAdditionalBulkCampaigns(bulkCampaignsFilePath);
			} else {
				super.waitForElementToLoad("xpath", "//upload-selected/div");
				WebElement uploadFileLinkParent = driver.findElement(By.xpath("//upload-selected/../.."));
				uploadFileLinkParent.click();
				Thread.sleep(1000);
				WebElement uploadFileLink = driver.findElement(By.xpath("//upload-selected/div"));
				uploadFileLink.click();
				return uploadBulkCampaignsAndVerify(bulkCampaignsFilePath);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;			
		}
	}
	
	public boolean uploadAdditionalBulkCampaigns(String bulkCampaignsFilePath) {
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/upload-selected/div");
		WebElement uploadFileButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[1]/li/upload-selected/div"));
		uploadFileButton.click();
		return uploadBulkCampaignsAndVerify(bulkCampaignsFilePath);		
	}
	
	private boolean uploadBulkCampaignsAndVerify(String bulkCampaignsFilePath) {
		/*StringSelection ss = new StringSelection(bulkCampaignsFilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}*/
		try {			
			String jacobDllVersionToUse;
			if (System.getProperty("sun.arch.data.model").contains("32")){
				jacobDllVersionToUse = "jacob-1.18-x86.dll";
			}
			else {
				jacobDllVersionToUse = "jacob-1.18-x64.dll";
			}
	
			File file = new File("lib\\autoit", jacobDllVersionToUse);
			if(!file.exists()) {
				file = new File("dll", jacobDllVersionToUse);
			}
			System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
	
			AutoItX x = new AutoItX();
			String screenName = "Open";
			x.winActivate(screenName);
			//Thread.sleep(1000);			
			x.winWaitActive(screenName);
			System.out.println(bulkCampaignsFilePath);
			boolean settingText = x.ControlSetText(screenName, "", "1148", bulkCampaignsFilePath);
			System.out.println("Text was Set : " + settingText);
			//Thread.sleep(30000);
			boolean clickingOpen = x.controlClick(screenName, "", "1") ;
			//Thread.sleep(30000);
			System.out.println("Open was clicked : " + clickingOpen);
			/*
			int timeSpentWaitingForDialog = 0;
			int recheckDelayForDialog = 1;
			boolean foundWindow = x.winExists(screenName);
			while(!foundWindow && timeSpentWaitingForDialog < 5/recheckDelayForDialog) {
				Thread.sleep(recheckDelayForDialog*1000);
				timeSpentWaitingForDialog = timeSpentWaitingForDialog + recheckDelayForDialog;
				foundWindow = x.winExists(screenName);
			}
			if(!foundWindow) {
				return false;
			}
			x.controlFocus(screenName, "", "1148");
			x.controlSend(screenName, "", "1148", bulkCampaignsFilePath);
			x.controlFocus(screenName, "", "1");
			x.controlSend(screenName, "", "1", "{ENTER}");
			*/
		} catch(Exception e) {
			e.printStackTrace();
		}
		boolean wasFileProcessed = false;
		int timeSpentWaiting = 0;
		int recheckDelay = 5;
		while(wasFileProcessed == false && timeSpentWaiting < (10*60)) {
			try {
				Thread.sleep(recheckDelay*1000);
				timeSpentWaiting = timeSpentWaiting + recheckDelay;
				String notificationAlertText =  driver.findElement(By.cssSelector("span.notifications-alert")).getText().trim();
				notificationAlertText = notificationAlertText.length() == 0 ? "0":notificationAlertText;
				if(Integer.parseInt(notificationAlertText)>0) {
					wasFileProcessed = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		
		return wasFileProcessed;
		
	}
	
	public void logout() {
		settingsIcon.click();
		super.waitForElementToLoad("xpath", "//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]");
		driver.findElement(By.xpath("//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]")).click();
		if(super.waitForElementToLoad("xpath", "//a[contains(@href,\"logout\")]", 5)) {
			driver.findElement(By.xpath("//a[contains(@href,\"logout\")]")).click();
		}
		super.waitForElementToLoad("xpath", "//a[contains(text(), \"Sign in\")]");
	}

}
