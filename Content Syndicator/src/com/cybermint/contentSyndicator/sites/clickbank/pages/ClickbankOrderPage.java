package com.cybermint.contentSyndicator.sites.clickbank.pages;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cybermint.pages.Page;

public class ClickbankOrderPage extends Page {

	@FindBy(xpath = "//div[@id='itemname']")
    protected WebElement itemNameElement;
	
	@FindBy(xpath = "//div[@id='itemdescription']")
    protected WebElement itemDescriptionElement;
	
	@FindBy(xpath = "//img[@id='itemimage']")
    protected WebElement itemImageElement;
    
	@FindBy(xpath = "//td[@id='total']")
    protected WebElement itemPriceElement;
    
	@FindBy(xpath = "//select[@id='order.currency']")
    protected WebElement currencySelectElement;
    
	public ClickbankOrderPage(WebDriver driver, String payLink) {
		super(driver);
		driver.get(payLink);
        this.initialize();
	}
	
	public void selectUSDCurrency() {
		Select select = new Select(currencySelectElement);
		select.selectByValue("USD");
	}
	
	public String getItemName() {
		String itemName;
		try {
			itemName = itemNameElement.getText();
		}catch(Exception e) {
			itemName = "Not Found";
		}
		//System.out.println(itemName);
		return itemName;
	}
	
	public String getItemDescription() {
		String itemDescription;
		try {
			itemDescription = itemDescriptionElement.getText();
		}catch(Exception e) {
			itemDescription = "Not Found";
		}
		//System.out.println(itemDescription);
		return itemDescription;
	}
	
	public String getImageURL() {
		String imageURL;
		try {
			imageURL = itemImageElement.getAttribute("src");
		}catch(Exception e) {
			imageURL = "Not Found";
		}
		//System.out.println(imageURL);
		return imageURL;
	}
	
	public double getItemPrice() {
		Double price;
		try {
			String priceAsString = itemPriceElement.getText().replaceAll("\\$", "").replaceAll("\\,", "").trim();
			priceAsString = priceAsString.replaceAll("\\s+", "");
			price = new Double(priceAsString);
		}catch(Exception e) {
			e.printStackTrace();
			price = 0.00;
		}
		//System.out.println(price);
		return price.doubleValue();
	}
	
	public double getItemUSDPrice() throws InterruptedException {
		Select select = new Select(this.currencySelectElement);
		if(!select.getFirstSelectedOption().getAttribute("value").contains("USD")) {
			this.selectUSDCurrency();
			this.wait(2000);
		}		
		return this.getItemPrice();
	}
	
	public String getOrderPageURL() {
		return driver.getCurrentUrl();
	}
	
	public String getVendorNumber() throws URISyntaxException {
		URI orderPageURL = new URI(driver.getCurrentUrl());
		return orderPageURL.getRawQuery().split("\\&")[1].split("=")[1];
	}

	public static void main(String[] args) {
		
	}

}
