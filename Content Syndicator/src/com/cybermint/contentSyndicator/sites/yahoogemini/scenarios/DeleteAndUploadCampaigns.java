package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiHomePage;
import com.cybermint.contentSyndicator.sites.yahoogemini.utils.YahooGeminiUtils;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class DeleteAndUploadCampaigns implements Runnable {

	public final static String allCampaigns = "all";
	
	public final static String pausedCampaigns = "paused";
	
	public final static String noCampaigns = "none";
	
	public final static String updateCampaigns = "update";
	
	private ObjectPool driverPool;
	private String username;
	private String password;
	private String displayUrl;
	private String sponsoredBy;
	private String bulkCampaignsFolderPath;
	private String uploadResultsFilePath;
	private String templateFilePath;
	private String randomNamesFilePath;
	private String domainRandomsFilePath;
	private String deleteType;
	private int noOfCampaignsToBeMaintained;
	private List<String> subAccountIDs;
	private List<String> subAccountStatus = new ArrayList<String>();
	
	public DeleteAndUploadCampaigns(ObjectPool driverPool, String username, String password, String displayUrl, String sponsoredBy, String bulkCampaignsFolderPath, String uploadResultsFilePath
			, String templateFilePath, String randomNamesFilePath, String domainRandomsFilePath, String deleteType, int noOfCampaignsToBeMaintained, List<String> subAccountIDs ) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
		this.displayUrl = displayUrl;
		this.sponsoredBy = sponsoredBy;
		this.password = password;
		this.bulkCampaignsFolderPath = bulkCampaignsFolderPath;
		this.uploadResultsFilePath = uploadResultsFilePath;
		this.templateFilePath = templateFilePath;
		this.randomNamesFilePath = randomNamesFilePath;
		this.domainRandomsFilePath = domainRandomsFilePath;
		this.deleteType = deleteType;
		this.noOfCampaignsToBeMaintained = noOfCampaignsToBeMaintained;
		this.subAccountIDs = subAccountIDs;
	}
	
	private void deleteAndUploadCampaignsForSubAccount(WebDriver driver, String subAccountURL) {
		List<Campaign> campaigns = new ArrayList<Campaign>();
		String status = "";
		String subAccountID = "";
		try {
			subAccountID = (null != subAccountURL ? subAccountURL.replaceAll("/campaigns", "") : "");
			status = "started";
			String baseURL = "https://gemini.yahoo.com/advertiser/";
			String subAccountCampaignsPageURL;
			if(null != subAccountURL) {
				subAccountCampaignsPageURL = baseURL + subAccountURL;
				driver.get(subAccountCampaignsPageURL);	
			}
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
			if(null != subAccountURL) {
				aYahooGeminiDashboardPage.clickGotIt();
				aYahooGeminiDashboardPage.dismissSplash();
			}			
			if(!DeleteAndUploadCampaigns.noCampaigns.equalsIgnoreCase(this.deleteType) && !DeleteAndUploadCampaigns.updateCampaigns.equalsIgnoreCase(this.deleteType)) {	
				campaigns = aYahooGeminiDashboardPage.getCampaignStats(Campaign.today);
				if(aYahooGeminiDashboardPage.areCampaignsAvailable()) {
					if(DeleteAndUploadCampaigns.allCampaigns.equalsIgnoreCase(this.deleteType)) {					
						aYahooGeminiDashboardPage.deleteAllCampaigns();
						status = "deleted";
					} else if(DeleteAndUploadCampaigns.pausedCampaigns.equalsIgnoreCase(this.deleteType)) {
						aYahooGeminiDashboardPage.deletePausedCampaigns(campaigns);
						status = "deleted";
					}
				}	
								
			}
			
			Thread.sleep(5000);
			aYahooGeminiDashboardPage.dismissSplash();
			campaigns = aYahooGeminiDashboardPage.getCampaignStats(Campaign.today);
			int noOfCampaignsToUpload = this.noOfCampaignsToBeMaintained - campaigns.size();
			noOfCampaignsToUpload = noOfCampaignsToUpload < 0 ? 0 : noOfCampaignsToUpload;
			String accountName = this.username + "-" + aYahooGeminiDashboardPage.getAccountName();
			String bulkCampaignsFilePath = "";
			if(DeleteAndUploadCampaigns.updateCampaigns.equalsIgnoreCase(this.deleteType)) {	
				bulkCampaignsFilePath = YahooGeminiUtils.generateBulkUpdateFileForSingleAccount(campaigns,accountName, displayUrl, sponsoredBy, bulkCampaignsFolderPath, templateFilePath);
			} else {
				bulkCampaignsFilePath = YahooGeminiUtils.generateBulkFileForSingleAccount(noOfCampaignsToUpload,accountName, displayUrl, sponsoredBy, randomNamesFilePath, domainRandomsFilePath, bulkCampaignsFolderPath, templateFilePath);
			}
					
			bulkCampaignsFilePath = bulkCampaignsFilePath.replaceAll("/", "\\\\");
			//System.out.println(bulkCampaignsFilePath);
			Boolean uploadStatus = false;
			if(campaigns.size()>0) {
				uploadStatus = aYahooGeminiDashboardPage.uploadAdditionalBulkCampaigns(bulkCampaignsFilePath);				
			} else {
				uploadStatus = aYahooGeminiDashboardPage.uploadBulkCampaignsOnEmptyAccount(bulkCampaignsFilePath);
			}
			if(uploadStatus == true) {
				status = "upload successful";
			} else {
				status = "upload failed";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		subAccountStatus.add(subAccountID+":"+status);		
	}

	@Override
	public void run() {
		WebDriver driver = null;		
		try {
			driver = (WebDriver) driverPool.borrowObject();
			//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
			aYahooGeminiDashboardPage.clickGotIt();
			aYahooGeminiDashboardPage.dismissSplash();
			if(aYahooGeminiDashboardPage.isAccountsPage()) {
				if(subAccountIDs.size()>0) {
					for(String subAccountID : subAccountIDs) {					
						try {
							String subAccountURL = subAccountID + "/campaigns";
							deleteAndUploadCampaignsForSubAccount(driver, subAccountURL);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} else {
					for(String subAccountURL : aYahooGeminiDashboardPage.getSubAccountURLs()) {					
						try {
							deleteAndUploadCampaignsForSubAccount(driver, subAccountURL);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				
			} else {
				deleteAndUploadCampaignsForSubAccount(driver, null);
			}
			//Thread.sleep(600000);
			aYahooGeminiDashboardPage.logout();
			//System.out.println("After Logout - " + new Date() + "\n");
		} catch (Exception e) {
			//System.out.println("this user failed : " + username + "\n");
			e.printStackTrace();
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(username+"-screenshot.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		} finally {
			try {
				String subAccountStatusesString = "";
				for(String aSubAccountStatus : subAccountStatus){
					subAccountStatusesString = subAccountStatusesString + aSubAccountStatus + "~";
				}
				
				if(uploadResultsFilePath.equalsIgnoreCase("todb")) {
					try {
						if(subAccountStatusesString.contains("successful")) {
							YahooGeminiUtils.updateCampaignUploadStatus(username, YahooGeminiUtils.UPL_CAMP_SUCCESS);
						} else {
							YahooGeminiUtils.updateCampaignUploadStatus(username, YahooGeminiUtils.UPL_CAMP_FAILURE);
						}		
					} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
					}
				} else {
					TextFileWriterUtils.writeString(username+","+password+","+subAccountStatusesString, uploadResultsFilePath, true, true);
				}				
				
				driverPool.returnObject(driver);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
		String userLoginsFilePath = args[0]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users.txt"
		String ReportsFilePath = args[1]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Reports"
		String binaryPath = args[2]; //"C:/Program Files (x86)/Mozilla Firefox/firefox.exe"
		int noOfThreads = Integer.parseInt(args[3]);
		String proxiesFilePath = args[4]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt"
		//String proxiesFilePath = "C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt"; 
		String bulkCampaignsFolderPath = args[5];
		String templateFolderPath = args[6];
		String randomNamesFilePath = args[7];
		String domainRandomsFilePath = args[8];
		String campaignDeleteType = args[9];
		int campaignsToMaintain = Integer.parseInt(args[10]);
		int accountsPerRun = Integer.parseInt(args[11]);
		String userLoginsLoopFilePath = args[12];
		List<String> userLoginsThisLoop = new ArrayList<String>();
		List<String> userLoginsForThisRun = new ArrayList<String>();
		/*if(userLoginsThisLoop.size() == 0  && campaignDeleteType.equalsIgnoreCase("paused")) {
			List<String> userLogins = TextFileReaderUtils.readLinesAsList(userLoginsFilePath, true);
			TextFileWriterUtils.writeListAsLines(userLogins, userLoginsLoopFilePath);
			userLoginsThisLoop = TextFileReaderUtils.readLinesAsList(userLoginsLoopFilePath, true);
		}*/
		
		if(userLoginsFilePath.equalsIgnoreCase("fromdb")) {
			for(int i=0; i < accountsPerRun ; i++) {
				String userLogin = YahooGeminiUtils.getAccountForUploadingCampaigns();
				if(userLogin.length()>0) {
					userLoginsForThisRun.add(userLogin);
				}				
			}
		} else {
			userLoginsThisLoop = TextFileReaderUtils.readLinesAsList(userLoginsLoopFilePath, true);
			for(int i=0; i<userLoginsThisLoop.size() && i < accountsPerRun ; i++) {
				userLoginsForThisRun.add(userLoginsThisLoop.get(i));
				userLoginsThisLoop.remove(i);
			}			
		}
		
		
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//String uploadResultsFilePath = ReportsFolderPath + "/uploadStats-" +sdf.format(new Date()) +".csv";
		String uploadResultsFilePath = ReportsFilePath;
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", proxiesFilePath, binaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		ExecutorService extractors = Executors.newFixedThreadPool(noOfThreads);			
		for(String userLogin : userLoginsForThisRun) {
			String username = userLogin.split(",")[0];
			String password = userLogin.split(",")[1];
			String templateFilePath = templateFolderPath + userLogin.split(",")[2] + ".csv";
			//bulkCampaignsFolderPath = bulkCampaignsFolderPath +  userLogin.split(",")[2];
			String displayUrl = userLogin.split(",")[3];
			String sponsoredBy = userLogin.split(",")[4];
			List<String> subAccountIDs = new ArrayList<String>();
			boolean hasAnSuccessfulSubAccount = false;
			if(userLogin.split(",").length>5 && userLogin.split(",")[5].length()>0) {
				String subAccounts = userLogin.split(",")[5];
				for(String aSubAccount : subAccounts.split("~")) {
					String subAccountID = aSubAccount.split(":")[0];
					if(subAccountID.length() > 0) {
						if(aSubAccount.split(":").length>1 && aSubAccount.split(":")[1].length()>0) {
							if(!aSubAccount.split(":")[1].equalsIgnoreCase("upload successful")) {								
								subAccountIDs.add(subAccountID);
								System.out.println("Step1 : " +  subAccountID);
							} else {
								hasAnSuccessfulSubAccount = true;
							}
						} else {
							subAccountIDs.add(subAccountID);
							System.out.println("Step2 : " +  subAccountID);
						}
					}
					
				}
			}
			
			if(subAccountIDs.size() > 0 || (subAccountIDs.size() == 0 && hasAnSuccessfulSubAccount == false)) {		
				if(userLoginsFilePath.equalsIgnoreCase("fromdb")) {
					extractors.execute(new DeleteAndUploadCampaigns(driverPool, username, password, displayUrl, sponsoredBy
							, bulkCampaignsFolderPath, "todb", templateFilePath, randomNamesFilePath
							, domainRandomsFilePath, campaignDeleteType, campaignsToMaintain, subAccountIDs));
				} else {
					extractors.execute(new DeleteAndUploadCampaigns(driverPool, username, password, displayUrl, sponsoredBy
							, bulkCampaignsFolderPath, uploadResultsFilePath, templateFilePath, randomNamesFilePath
							, domainRandomsFilePath, campaignDeleteType, campaignsToMaintain, subAccountIDs));
				}
				
			}
			
		}
		extractors.shutdown();
		extractors.awaitTermination(2, TimeUnit.HOURS);
		if(!userLoginsFilePath.equalsIgnoreCase("fromdb")) {
			TextFileWriterUtils.writeListAsLines(userLoginsThisLoop, userLoginsLoopFilePath, false);
		}		
		driverPool.clear();
		try {
			driverPool.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
