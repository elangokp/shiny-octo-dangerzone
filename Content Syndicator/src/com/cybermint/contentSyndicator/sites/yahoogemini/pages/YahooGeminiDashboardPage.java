package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;

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
		if(super.waitForElementToLoad("css", "div.message-shown",2)) {
			try {
				((JavascriptExecutor) driver).executeScript("document.querySelector('div.message-shown').style.position = 'absolute';");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		
	}
	
	public void clickGotIt() {
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
		WebElement applyButton = driver.findElement(By.cssSelector("div.date-range-options div.apply-btn"));
		applyButton.click();
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
		resultsPerPageDropdown = driver.findElement(By.cssSelector("div.ui-table-pagination div.combobox i"));
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
	
	public void clearAllCampaignSelection() {
		selectAllCampaigns();
		deselectAllCampaigns();
	}
	
	public void enableAllCampaigns() {
		this.select200ResultsPerPage();
		this.selectAllCampaigns();
		WebElement actionsButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Enable\")]");
		WebElement enableButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Enable\")]"));
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
		//super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Delete\")]");
		super.waitForElementToLoad("xpath", "//button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Delete\")]");
		//WebElement deleteButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Delete\")]"));
		WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Delete\")]"));
		deleteButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]");
		WebElement deleteConfirmButton = driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[text()=\"Yes\"]"));
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
		super.waitForElementToLoad("xpath", "//button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Edit native bid\")]");
		WebElement editNativeBidButton = driver.findElement(By.xpath("//button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Edit native bid\")]"));
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
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Pause\")]");
		WebElement pauseButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Pause\")]"));
		pauseButton.click();
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");	
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
	}
	
	private void activateSelectedCampaigns() {
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Enable\")]");
		WebElement enableButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a[contains(text(),\"Enable\")]"));
		enableButton.click();
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");	
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
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
	
	public List<Campaign> getCampaignStats(String durationRange) {
		String jsstmt = "var nodesSnapshot = document.evaluate('//table[@ng-class=\"{ fetching: fetching }\"]/tbody/tr', document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null );";
		jsstmt += "var campaigns = [];";
		jsstmt += "for ( var i=0 ; i < nodesSnapshot.snapshotLength; i++ )";
		jsstmt += "{";
		jsstmt += "var columns = nodesSnapshot.snapshotItem(i).childNodes;";
		jsstmt += "var txt=\"\";";
		jsstmt += "for (j = 2; j < columns.length; j++) { ";
		jsstmt += "if(j == columns.length - 1) {";
		jsstmt += "txt += columns[j].textContent;";
		jsstmt += "} else {";
		jsstmt += "txt += columns[j].textContent+\"||\";";
		jsstmt += "}";
		jsstmt += "}";
		jsstmt += "campaigns.push(txt);";
		jsstmt += "}";
		jsstmt += "return campaigns;";
		this.clickGotIt();
		this.markAllNotificationsAsRead();
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
		List<Campaign> campaigns = new ArrayList<Campaign>();
		for(String aCampaignData : allCampaignData) {
			Campaign aCampaign = new Campaign();
			String[] aCampaignDataFields = aCampaignData.split("\\|\\|");
			aCampaign.setCampaignName(aCampaignDataFields[0]);
			aCampaign.setBudget(aCampaignDataFields[1]);
			aCampaign.setCampaignStatus(aCampaignDataFields[2]);
			aCampaign.setCampaignObjective(aCampaignDataFields[3]);
			aCampaign.setClicks(new Double(aCampaignDataFields[4].replaceAll(",", "")));
			aCampaign.setImpressions(new Double(aCampaignDataFields[5].replaceAll(",", "")));
			aCampaign.setCtr(new Double(aCampaignDataFields[6].replaceAll("%", "").replaceAll("—", "0")));
			aCampaign.setSpend(new Double(aCampaignDataFields[7].replaceAll("\\$", "").replaceAll("—", "0")));
			aCampaign.setConversions(new Integer(aCampaignDataFields[8].replaceAll(",", "")));
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
	
	
	public void uploadBulkCampaigns(String bulkCampaignsFilePath) {
		WebElement actionsButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]"));
		actionsButton.click();
		super.waitForElementToLoad("xpath", "//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a//span[contains(text(),\"Upload\")]");
		WebElement uploadFileButton = driver.findElement(By.xpath("//div[@class=\"table-header-container\"]/div/button[contains(text(),\"Actions\")]/../ul[@class=\"dropdown-menu\"]/li/a//span[contains(text(),\"Upload\")]"));
		uploadFileButton.click();
		StringSelection ss = new StringSelection(bulkCampaignsFilePath);
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
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		/*
		super.waitForElementToLoad("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]");	
		super.waitForElementToBeDisappear("xpath", "//banners/div[contains(@class,\"in\")]/span[contains(text(),\"saved\")]", 5);
		*/
	}
	
	public void logout() {
		settingsIcon.click();
		super.waitForElementToLoad("xpath", "//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]");
		driver.findElement(By.xpath("//ul[@list-tree=\"gearMenuOptions\"]/li/a[text()=\"Log out\"]")).click();
		super.waitForElementToLoad("xpath", "//a[contains(text(), \"Sign in\")]");
	}

}
