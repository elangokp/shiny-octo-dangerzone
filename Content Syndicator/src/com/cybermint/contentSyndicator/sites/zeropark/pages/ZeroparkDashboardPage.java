package com.cybermint.contentSyndicator.sites.zeropark.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;

public class ZeroparkDashboardPage extends Page {

	public ZeroparkDashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public ZeroparkCampaignAddPage getCampaignAddPage() {
		driver.get("https://panel.zeropark.com/bidding/campaign/popup/ron/add");
		super.waitForElementToLoad("xpath", "//input[@name=\"name\"]",10);
		
		return PageFactory.initElements(driver, ZeroparkCampaignAddPage.class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
