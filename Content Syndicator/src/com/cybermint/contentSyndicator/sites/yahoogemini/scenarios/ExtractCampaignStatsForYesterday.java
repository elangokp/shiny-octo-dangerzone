package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
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

public class ExtractCampaignStatsForYesterday implements Callable<List<Campaign>>{

	private ObjectPool driverPool;
	private String username;
	private String password;
	
	public ExtractCampaignStatsForYesterday(ObjectPool driverPool, String username, String password) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public List<Campaign> call()  {
		WebDriver driver = null;
		List<Campaign> campaigns = null;
		System.out.println("this user started : " + username + "\n");
		try {
			driver = (WebDriver) driverPool.borrowObject();
			driver.manage().window().maximize();
			YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
			campaigns = aYahooGeminiDashboardPage.getCampaignStats(Campaign.yesterday);
			YahooGeminiUtils anYahooGeminiUtils = new YahooGeminiUtils();
			anYahooGeminiUtils.makePauseDecisionsforCampaigns(campaigns);
			aYahooGeminiDashboardPage.pauseOutlierCampaigns(campaigns);
			aYahooGeminiDashboardPage.clearAllCampaignSelection();
			aYahooGeminiDashboardPage.activateNormalCampaigns(campaigns);
			aYahooGeminiDashboardPage.logout();
		} catch (Exception e) {
			System.out.println("this user failed : " + username + "\n");
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
			Future<List<Campaign>> campaigns = extractors.submit(new ExtractCampaignStatsForYesterday(driverPool, username, password));
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
