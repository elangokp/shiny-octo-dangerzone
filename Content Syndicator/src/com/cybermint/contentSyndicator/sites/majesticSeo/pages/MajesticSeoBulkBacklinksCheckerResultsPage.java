package com.cybermint.contentSyndicator.sites.majesticSeo.pages;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cybermint.contentSyndicator.pojo.UrlProperties;

public class MajesticSeoBulkBacklinksCheckerResultsPage extends MajesticSeoDashboardPage {

	@FindBy(xpath = "//table[@class=\"resultstable\"]/tbody/tr[@class=\"odd\" or @class=\"even\"]") 
	protected List<WebElement> resultsTableRows;
	
	@FindBy(xpath = "//input[@name=\"IndexDataSource\" and @value=\"H\"]") 
	protected WebElement historicIndexRadioButton;
	   
	@FindBy(xpath = "//input[@name=\"IndexDataSource\" and @value=\"F\"]") 
	protected WebElement freshIndexRadioButton;
	
	public MajesticSeoBulkBacklinksCheckerResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public List<UrlProperties> getBackLinksCount() {
		List<UrlProperties> UrlPropertiesList = new ArrayList<UrlProperties>();
		for(WebElement aResultsTableRow : resultsTableRows) {
			UrlProperties anUrlProperties = new UrlProperties();
			anUrlProperties.setUrl(getUrl(aResultsTableRow));
			String status = getStatus(aResultsTableRow);
			anUrlProperties.setMajesticSeoBacklinksStatus(status);
			if("Not found".equalsIgnoreCase(status)) {
				anUrlProperties.setMajesticSeoIPAddressesCount(new BigDecimal(0));
				anUrlProperties.setMajesticSeoClassCSubnetsCount(new BigDecimal(0));
				anUrlProperties.setMajesticSeoACRank(new BigDecimal(0));
				anUrlProperties.setMajesticSeoUrlType("NA");
				anUrlProperties.setMajesticSeoExternalBacklinksCount(new BigDecimal(0));
				anUrlProperties.setMajesticSeoGovExternalBacklinksCount(new BigDecimal(0));
				anUrlProperties.setMajesticSeoEduExternalBacklinksCount(new BigDecimal(0));
				anUrlProperties.setMajesticSeoReferringDomainsCount(new BigDecimal(0));
				anUrlProperties.setMajesticSeoGovReferringDomainsCount(new BigDecimal(0));
				anUrlProperties.setMajesticSeoEduReferringDomainsCount(new BigDecimal(0));
			} else {
				anUrlProperties.setMajesticSeoIPAddressesCount(getIPAddressesCount(aResultsTableRow));
				anUrlProperties.setMajesticSeoClassCSubnetsCount(getClassCSubnetsCount(aResultsTableRow));
				anUrlProperties.setMajesticSeoACRank(getACRank(aResultsTableRow));
				anUrlProperties.setMajesticSeoUrlType(getUrlType(aResultsTableRow));
				getAllExternalBacklinksCount(aResultsTableRow, anUrlProperties);
				getAllReferringDomainsCount(aResultsTableRow, anUrlProperties);
			}			
			System.out.println(anUrlProperties.getUrl());
			System.out.println(anUrlProperties.getMajesticSeoBacklinksStatus());
			System.out.println(anUrlProperties.getMajesticSeoIPAddressesCount());
			System.out.println(anUrlProperties.getMajesticSeoClassCSubnetsCount());
			System.out.println(anUrlProperties.getMajesticSeoACRank());
			System.out.println(anUrlProperties.getMajesticSeoUrlType());
			System.out.println(anUrlProperties.getMajesticSeoExternalBacklinksCount());
			System.out.println(anUrlProperties.getMajesticSeoEduExternalBacklinksCount());
			System.out.println(anUrlProperties.getMajesticSeoGovExternalBacklinksCount());
			System.out.println(anUrlProperties.getMajesticSeoReferringDomainsCount());
			System.out.println(anUrlProperties.getMajesticSeoEduReferringDomainsCount());
			System.out.println(anUrlProperties.getMajesticSeoGovReferringDomainsCount());
			UrlPropertiesList.add(anUrlProperties);
		}
		return UrlPropertiesList;
	}
	
	private String getUrl(WebElement resultsTableRow) {
		return resultsTableRow.findElement(By.xpath("td[2]/a")).getAttribute("title").trim();
	}
	
	private String getStatus(WebElement resultsTableRow) {
		return resultsTableRow.findElement(By.xpath("td[3]")).getText().replaceAll("\\*", "").trim();
	}
	
	private BigDecimal getACRank(WebElement resultsTableRow) {
		String ACRankColumnData = resultsTableRow.findElement(By.xpath("td[4]")).getText();
		BigDecimal ACRank = new BigDecimal(-1);
		if(ACRankColumnData.startsWith("URL")) {
			ACRank = new BigDecimal(ACRankColumnData.substring(ACRankColumnData.length()-1));
		}
		return ACRank;
	}
	
	private String getUrlType(WebElement resultsTableRow) {
		String typeColumnData = resultsTableRow.findElement(By.xpath("td[4]")).getText();
		String type = new String();
		if(typeColumnData.contains("URL")) {
			type="URL";
		} else if(typeColumnData.contains("Root")) {
			type="ROOT DOMAIN";
		} else if(typeColumnData.contains("Subdomain")) {
			type="SUB DOMAIN";
		}
		return type;
	}
	
	private BigDecimal getIPAddressesCount(WebElement resultsTableRow) {
		String IPAddressesCountAsString = resultsTableRow.findElement(By.xpath("td[7]")).getText().replaceAll("\\*", "").replaceAll(",", "").replaceAll("-", "");
		BigDecimal IPAddressesCount = new BigDecimal (0);
		if(null!=IPAddressesCountAsString && !"".equalsIgnoreCase(IPAddressesCountAsString)) {
			IPAddressesCount = new BigDecimal (IPAddressesCountAsString);
		} else {
			IPAddressesCount = new BigDecimal (0);
		}
		return IPAddressesCount;
	}
	
	private BigDecimal getClassCSubnetsCount(WebElement resultsTableRow) {
		String ClassCSubnetsCountAsString = resultsTableRow.findElement(By.xpath("td[8]")).getText().replaceAll("\\*", "").replaceAll(",", "").replaceAll("-", "");;
		BigDecimal ClassCSubnetsCount = new BigDecimal (0);
		if(null!=ClassCSubnetsCountAsString && !"".equalsIgnoreCase(ClassCSubnetsCountAsString)) {
			ClassCSubnetsCount = new BigDecimal (ClassCSubnetsCountAsString);
		} else {
			ClassCSubnetsCount = new BigDecimal (0);
		}
		return ClassCSubnetsCount;
	}
	
	private void getAllExternalBacklinksCount(WebElement resultsTableRow, UrlProperties anUrlProperties) {
		String allExternalBacklinksCountAsString = resultsTableRow.findElement(By.xpath("td[5]")).getText().replaceAll("\\*", "").replaceAll(",", "");
		//System.out.println(allExternalBacklinksCountAsString);
		BigDecimal externalBacklinksCount = new BigDecimal(0);
		BigDecimal externalEduBacklinksCount = new BigDecimal(0);
		BigDecimal externalGovBacklinksCount = new BigDecimal(0);
		if(allExternalBacklinksCountAsString.contains("(")) {
			String[] firstSplitArray = allExternalBacklinksCountAsString.split("\\(");
			String externalBacklinksCountAsString = firstSplitArray[0].trim();	
			//System.out.println(externalBacklinksCountAsString);
			String externalEduGovBacklinksCountAsString = firstSplitArray[1].replace(")", "").trim();
			//System.out.println(externalEduGovBacklinksCountAsString);
			String[] secondSplitArray = externalEduGovBacklinksCountAsString.split("/");
			String externalEduBacklinksCountAsString = secondSplitArray[0].trim();
			String externalGovBacklinksCountAsString = secondSplitArray[1].trim();
			
			if(null!=externalBacklinksCountAsString && !"".equalsIgnoreCase(externalBacklinksCountAsString) && !"-".equalsIgnoreCase(externalBacklinksCountAsString)) {
				try {
					externalBacklinksCount = new BigDecimal(externalBacklinksCountAsString.trim());
				} catch(Exception e) {
					System.out.println("Exception while parsing external backlinks count " + externalBacklinksCountAsString + " as integer");
				}
			} else {
				externalBacklinksCount = new BigDecimal(0);
			}
			
			if(null!=externalEduBacklinksCountAsString && !"".equalsIgnoreCase(externalEduBacklinksCountAsString) && !"-".equalsIgnoreCase(externalEduBacklinksCountAsString)) {
				try {
					externalEduBacklinksCount = new BigDecimal(externalEduBacklinksCountAsString.trim());
				} catch(Exception e) {
					System.out.println("Exception while parsing external Edu backlinks count " + externalEduBacklinksCountAsString + " as integer");
				}
			} else {
				externalEduBacklinksCount = new BigDecimal(0);
			}
			
			if(null!=externalGovBacklinksCountAsString && !"".equalsIgnoreCase(externalGovBacklinksCountAsString) && !"-".equalsIgnoreCase(externalGovBacklinksCountAsString)) {
				try {
					externalGovBacklinksCount = new BigDecimal(externalGovBacklinksCountAsString.trim());
				} catch(Exception e) {
					System.out.println("Exception while parsing external Gov backlinks count " + externalGovBacklinksCountAsString + " as integer");
				}
			} else {
				externalGovBacklinksCount = new BigDecimal(0);
			}
		} else {
			try {
				if(null!=allExternalBacklinksCountAsString && !"".equalsIgnoreCase(allExternalBacklinksCountAsString) && !"-".equalsIgnoreCase(allExternalBacklinksCountAsString)) {
					externalBacklinksCount = new BigDecimal(allExternalBacklinksCountAsString.trim());
				} else {
					externalBacklinksCount = new BigDecimal(0);
				}				
			} catch(Exception e) {
				System.out.println("Exception while parsing total external backlinks count " + allExternalBacklinksCountAsString + " as integer");
			}
		}
		anUrlProperties.setMajesticSeoExternalBacklinksCount(externalBacklinksCount);
		anUrlProperties.setMajesticSeoEduExternalBacklinksCount(externalEduBacklinksCount);
		anUrlProperties.setMajesticSeoGovExternalBacklinksCount(externalGovBacklinksCount);
	}
	
	private void getAllReferringDomainsCount(WebElement resultsTableRow, UrlProperties anUrlProperties) {
		String allReferringDomainsCountAsString = resultsTableRow.findElement(By.xpath("td[6]")).getText().replaceAll("\\*", "").replaceAll(",", "");
		//System.out.println(allReferringDomainsCountAsString);
		BigDecimal referringDomainsCount = new BigDecimal(0);
		BigDecimal referringEduDomainsCount = new BigDecimal(0);
		BigDecimal referringGovDomainsCount = new BigDecimal(0);
		if(allReferringDomainsCountAsString.contains("(")) {
			String[] firstSplitArray = allReferringDomainsCountAsString.split("\\(");
			String referringDomainsCountAsString = firstSplitArray[0].trim();	
			//System.out.println(referringDomainsCountAsString);
			String referringEduGovDomainsCountAsString = firstSplitArray[1].replace(")", "").trim();
			//System.out.println(referringEduGovDomainsCountAsString);
			String[] secondSplitArray = referringEduGovDomainsCountAsString.split("/");
			String referringEduDomainsCountAsString = secondSplitArray[0].trim();
			String referringGovDomainsCountAsString = secondSplitArray[1].trim();
			
			if(null!=referringDomainsCountAsString && !"".equalsIgnoreCase(referringDomainsCountAsString) && !"-".equalsIgnoreCase(referringDomainsCountAsString)) {
				try {
					referringDomainsCount = new BigDecimal(referringDomainsCountAsString.trim());
				} catch(Exception e) {
					System.out.println("Exception while parsing referring domains count " + referringDomainsCountAsString + " as integer");
				}
			} else {
				referringDomainsCount = new BigDecimal(0);
			}
			
			if(null!=referringEduDomainsCountAsString && !"".equalsIgnoreCase(referringEduDomainsCountAsString) && !"-".equalsIgnoreCase(referringEduDomainsCountAsString)) {
				try {
					referringEduDomainsCount = new BigDecimal(referringEduDomainsCountAsString.trim());
				} catch(Exception e) {
					System.out.println("Exception while parsing referring Edu domains count " + referringEduDomainsCountAsString + " as integer");
				}
			} else {
				referringEduDomainsCount = new BigDecimal(0);
			}
			
			if(null!=referringGovDomainsCountAsString && !"".equalsIgnoreCase(referringGovDomainsCountAsString) && !"-".equalsIgnoreCase(referringGovDomainsCountAsString)) {
				try {
					referringGovDomainsCount = new BigDecimal(referringGovDomainsCountAsString.trim());
				} catch(Exception e) {
					System.out.println("Exception while parsing referring Gov domains count " + referringGovDomainsCountAsString + " as integer");
				}
			} else {
				referringGovDomainsCount = new BigDecimal(0);
			}
		} else {
			try {
				if(null!=allReferringDomainsCountAsString && !"".equalsIgnoreCase(allReferringDomainsCountAsString) && !"-".equalsIgnoreCase(allReferringDomainsCountAsString)) {
					referringDomainsCount = new BigDecimal(allReferringDomainsCountAsString.trim());
				} else {
					referringDomainsCount = new BigDecimal(0);
				}
			} catch(Exception e) {
				System.out.println("Exception while parsing total referring domains count " + allReferringDomainsCountAsString + " as integer");
			}
		}
		anUrlProperties.setMajesticSeoReferringDomainsCount(referringDomainsCount);
		anUrlProperties.setMajesticSeoEduReferringDomainsCount(referringEduDomainsCount);
		anUrlProperties.setMajesticSeoGovReferringDomainsCount(referringGovDomainsCount);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
