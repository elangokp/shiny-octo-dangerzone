package com.cybermint.contentSyndicator.sites.clickbank.scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.commons.pool.ObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.clickbank.objects.ClickbankOrderPageDetails;
import com.cybermint.contentSyndicator.sites.clickbank.pages.ClickbankOrderPage;

public class ClickbankOrderPageExtractor implements Callable<ArrayList<ClickbankOrderPageDetails>>{

	private ObjectPool driverPool;
	private String vendorID;
	private String affiliateID;
	
	public ClickbankOrderPageExtractor(ObjectPool driverPool, String vendorID, String affiliateID) {
		this.driverPool = driverPool;
		this.vendorID = vendorID;
		this.affiliateID = affiliateID;
	}

	@Override
	public ArrayList<ClickbankOrderPageDetails> call() throws Exception {
		ArrayList<ClickbankOrderPageDetails> clickbankOrderPageDetailsList = new ArrayList<ClickbankOrderPageDetails>();
		WebDriver driver = (WebDriver) driverPool.borrowObject();
		int itemCounter = 1;
		int itemNotFoundCount = 0;
		int maxItemNotFoundCount = 4;
		while(maxItemNotFoundCount > itemNotFoundCount) {
			ClickbankOrderPageDetails aClickbankOrderPageDetails = new ClickbankOrderPageDetails(this.vendorID, this.affiliateID, itemCounter);
			try {				
				ClickbankOrderPage aClickbankOrderPage = new ClickbankOrderPage(driver, aClickbankOrderPageDetails.getPayLink());
				String itemName = aClickbankOrderPage.getItemName();
				if(itemName.equals("Not Found")) {
					itemNotFoundCount++;
				} else {
					itemNotFoundCount = 0;
					aClickbankOrderPageDetails.setVendorNumber(aClickbankOrderPage.getVendorNumber());
					aClickbankOrderPageDetails.setItemID(itemCounter);
					aClickbankOrderPageDetails.setOrderPageURL(aClickbankOrderPage.getOrderPageURL());
					aClickbankOrderPageDetails.setProductTitle(itemName);
					aClickbankOrderPageDetails.setProductDescription(aClickbankOrderPage.getItemDescription());
					aClickbankOrderPageDetails.setProductImageURL(aClickbankOrderPage.getImageURL());
					aClickbankOrderPageDetails.setProductPrice(aClickbankOrderPage.getItemUSDPrice());
					aClickbankOrderPageDetails.setProductEnabled(true);
				}
			} catch(Exception e) {
				e.printStackTrace();
				aClickbankOrderPageDetails.setExtractionError("Some error happened");
			} finally {
				if(aClickbankOrderPageDetails.getVendorNumber() != null) {
					clickbankOrderPageDetailsList.add(aClickbankOrderPageDetails);
				}				
				itemCounter++;
			}
		}
		//To document that this vendor pay link has been tried and no active record has bee found.
		if(clickbankOrderPageDetailsList.size() <= 0) {
			ClickbankOrderPageDetails aClickbankOrderPageDetails = new ClickbankOrderPageDetails(this.vendorID, this.affiliateID, 1);
			aClickbankOrderPageDetails.setVendorNumber("0000");
			aClickbankOrderPageDetails.setItemID(1);
			aClickbankOrderPageDetails.setOrderPageURL("Not Found");
			aClickbankOrderPageDetails.setProductTitle("Not Found");
			aClickbankOrderPageDetails.setProductDescription("Not Found");
			aClickbankOrderPageDetails.setProductImageURL("Not Found");
			aClickbankOrderPageDetails.setProductPrice(0.00);
			aClickbankOrderPageDetails.setProductEnabled(false);
			clickbankOrderPageDetailsList.add(aClickbankOrderPageDetails);
		}
		driverPool.returnObject(driver);
		return clickbankOrderPageDetailsList;
	}

}
