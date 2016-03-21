package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.io.IOException;
import java.util.Date;
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

import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiHomePage;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileReaderUtils;

public class ChangeBidForCampaigns implements Runnable {

	private ObjectPool driverPool;
	private String username;
	private String password;
	private float bidAmount;
	
	public ChangeBidForCampaigns(ObjectPool driverPool, String username, String password, float bidAmount) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
		this.bidAmount = bidAmount;
	}

	@Override
	public void run() {
		WebDriver driver = null;
		System.out.println("this user started : " + username + "\n");
		try {
			System.out.println("Before Borrow Object - " + new Date());
			driver = (WebDriver) driverPool.borrowObject();
			System.out.println("After Borrow Object - " + new Date());
			driver.manage().window().maximize();
			System.out.println("Before Yahoo Gemini Home Page  - " + new Date());
			YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
			System.out.println("After Yahoo Gemini Home Page  - " + new Date());
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
			aYahooGeminiDashboardPage.setBidForAllAdgroupsTo(bidAmount);
			System.out.println("Before logout - " + new Date());
			aYahooGeminiDashboardPage.logout();
			System.out.println("After logout - " + new Date());
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
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		String userLoginsFilePath = args[0]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users.txt"
		String firefoxBinaryPath = args[1]; //"C:/Program Files (x86)/Mozilla Firefox/firefox.exe"
		int noOfThreads = Integer.parseInt(args[2]);
		String proxiesFilePath = args[3]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt"
		float bidAmount = Float.parseFloat(args[4]); //0.06
		List<String> userLogins = TextFileReaderUtils.readLinesAsList(userLoginsFilePath, true);
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox", proxiesFilePath, firefoxBinaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		ExecutorService extractors = Executors.newFixedThreadPool(noOfThreads);			
		for(String userLogin : userLogins) {
			String username = userLogin.split(",")[0];
			String password = userLogin.split(",")[1];
			extractors.execute(new ChangeBidForCampaigns(driverPool, username, password,bidAmount));
		}
		extractors.shutdown();
		extractors.awaitTermination(2, TimeUnit.HOURS);
		driverPool.clear();
		try {
			driverPool.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
