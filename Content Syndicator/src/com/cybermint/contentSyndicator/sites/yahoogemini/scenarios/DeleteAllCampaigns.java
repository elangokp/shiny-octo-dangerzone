package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.io.IOException;
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

public class DeleteAllCampaigns implements Runnable {

	private ObjectPool driverPool;
	private String username;
	private String password;
	
	public DeleteAllCampaigns(ObjectPool driverPool, String username, String password) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
	}

	@Override
	public void run() {
		WebDriver driver = null;
		try {
			driver = (WebDriver) driverPool.borrowObject();
			driver.manage().window().maximize();
			YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
			aYahooGeminiDashboardPage.deleteAllCampaigns();
			//aYahooGeminiDashboardPage.deleteAllAdgroups();
			//aYahooGeminiDashboardPage.deleteAllAds();
			//aYahooGeminiDashboardPage.enableAllCampaigns();
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
		
	}
	
	public static void main(String[] args) throws InterruptedException {	
		String userLoginsFilePath = args[0]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users.txt"
		String ReportsFolderPath = args[1]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Reports"
		String firefoxBinaryPath = args[2]; //"C:/Program Files (x86)/Mozilla Firefox/firefox.exe"
		int noOfThreads = Integer.parseInt(args[3]);
		String proxiesFilePath = args[4]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt"
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
			extractors.execute(new DeleteAllCampaigns(driverPool, username, password));
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
