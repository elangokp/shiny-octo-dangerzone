package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiHomePage;
import com.cybermint.contentSyndicator.sites.yahoogemini.utils.YahooGeminiUtils;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileReaderUtils;

public class ExtractCampaignStatsForToday implements Callable<List<Campaign>>{

	private ObjectPool driverPool;
	private String username;
	private String password;
	private String failureLogsFolderPath;
	
	public ExtractCampaignStatsForToday(ObjectPool driverPool, String username, String password, String failureLogsFolderPath) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
		this.failureLogsFolderPath = failureLogsFolderPath;
	}
	
	@Override
	public List<Campaign> call()  {
		WebDriver driver = null;
		List<Campaign> campaigns = null;
		List<String> failureLog = new ArrayList<String>();
		//failureLog.add("this user started : " + username + " - " + new Date());
		//System.out.println("Started - " + new Date() + "\n");
		try {
			driver = (WebDriver) driverPool.borrowObject();
			driver.manage().window().maximize();
			YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
			//aYahooGeminiDashboardPage.deleteAllCampaigns();
			//aYahooGeminiDashboardPage.deleteAllAdgroups();
			//aYahooGeminiDashboardPage.deleteAllAds();
			//aYahooGeminiDashboardPage.enableAllCampaigns();
			campaigns = aYahooGeminiDashboardPage.getCampaignStats(Campaign.today);
			//List<Campaign> campaigns = aYahooGeminiDashboardPage.getCampaignStats(Campaign.oneMonth);
			YahooGeminiUtils anYahooGeminiUtils = new YahooGeminiUtils();
			anYahooGeminiUtils.setAccountUsername(campaigns, username);
			//System.out.println("Before Pause Decisions - " + new Date() + "\n");
			anYahooGeminiUtils.makePauseDecisionsforCampaigns(campaigns);
			//System.out.println("After Pause Decisions - " + new Date() + "\n");
			//System.out.println("Before Pausing Campaigns - " + new Date() + "\n");
			aYahooGeminiDashboardPage.pauseOutlierCampaigns(campaigns);
			//System.out.println("After Pausing Campaigns - " + new Date() + "\n");
			//System.out.println("Before Clear all Campaigns - " + new Date() + "\n");
			aYahooGeminiDashboardPage.clearAllCampaignSelection();
			//System.out.println("After Clear all Campaigns - " + new Date() + "\n");
			//System.out.println("Before Activate Campaigns - " + new Date() + "\n");
			aYahooGeminiDashboardPage.activateNormalCampaigns(campaigns);
			//System.out.println("After Activate Campaigns - " + new Date() + "\n");
			//System.out.println("Before Logout - " + new Date() + "\n");
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
				driverPool.returnObject(driver);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//System.out.println("Completed - " + new Date() + "\n");
		return campaigns;
		
	}

	public static void main(String[] args) throws InterruptedException {	
		String userLoginsFilePath = args[0]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users.txt"
		String ReportsFolderPath = args[1]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Reports"
		String firefoxBinaryPath = args[2]; //"C:/Program Files (x86)/Mozilla Firefox/firefox.exe"
		int noOfThreads = Integer.parseInt(args[3]);
		String proxiesFilePath = args[4]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt"
		List<String> userLogins = TextFileReaderUtils.readLinesAsList(userLoginsFilePath, true);
		Collections.shuffle(userLogins);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
		String campaignFilePath = ReportsFolderPath + "/CampaignStats-" +sdf.format(new Date()) +".csv";
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox", proxiesFilePath, firefoxBinaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		ExecutorService extractors = Executors.newFixedThreadPool(noOfThreads);
		ExecutorService savingExtractors = Executors.newFixedThreadPool(noOfThreads);				
		for(String userLogin : userLogins) {
			String username = userLogin.split(",")[0];
			String password = userLogin.split(",")[1];
			Future<List<Campaign>> campaigns = extractors.submit(new ExtractCampaignStatsForToday(driverPool, username, password, ""));
			savingExtractors.execute(new SaveCampaignStatsToFile(campaigns, campaignFilePath));
		}
		extractors.shutdown();
		extractors.awaitTermination(2, TimeUnit.HOURS);
		driverPool.clear();
		savingExtractors.shutdown();
		try {
			driverPool.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
