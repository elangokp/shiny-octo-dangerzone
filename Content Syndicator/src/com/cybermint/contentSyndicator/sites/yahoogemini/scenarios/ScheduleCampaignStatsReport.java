package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.openqa.selenium.support.PageFactory;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiHomePage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiReportsPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.utils.YahooGeminiUtils;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class ScheduleCampaignStatsReport implements Callable<List<String>> {

	private ObjectPool driverPool;
	private String username;
	private String password;
	
	public ScheduleCampaignStatsReport(ObjectPool driverPool, String username, String password) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
	}
	
	private String scheduleReportForSubAccount(WebDriver driver, String subAccountURL) {
		boolean scheduleSuccess = false;
		try {
			String subAccountID = null != subAccountURL ? subAccountURL.replaceAll("/campaigns", "") : null;
			String baseURL = "https://gemini.yahoo.com/advertiser/";
			String subAccountCampaignsPageURL;
			if(null != subAccountURL) {
				subAccountCampaignsPageURL = baseURL + subAccountURL;
				driver.get(subAccountCampaignsPageURL);	
			}
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
			aYahooGeminiDashboardPage.clickGotIt();	
			aYahooGeminiDashboardPage.dismissSplash();
			YahooGeminiReportsPage aYahooGeminiReportsPage = aYahooGeminiDashboardPage.goToReportspage();
			aYahooGeminiReportsPage.deleteAllScheduledReports();
			aYahooGeminiReportsPage.goToReportsCreatepage().scheduleReport();
			scheduleSuccess = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			scheduleSuccess = false;
			e.printStackTrace();
		}
		return this.username+","+this.password+","+subAccountURL.replaceAll("/campaigns", "")+","+scheduleSuccess;
	}
	
	@Override
	public List<String> call()  {
		WebDriver driver = null;
		List<String> successStat = new ArrayList<String>();
		//failureLog.add("this user started : " + username + " - " + new Date());
		//System.out.println("Started - " + new Date() + "\n");
		//logger.error("Inside Call");
		try {
			driver = (WebDriver) driverPool.borrowObject();
			//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);		
			if(aYahooGeminiDashboardPage.isAccountsPage()) {
				for(String subAccountURL : aYahooGeminiDashboardPage.getSubAccountURLs()) {					
					try {
						successStat.add(scheduleReportForSubAccount(driver, subAccountURL));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else {
				aYahooGeminiDashboardPage.clickGotIt();	
				aYahooGeminiDashboardPage.dismissSplash();	
				String subAccountURL = driver.getCurrentUrl().replaceAll("https://gemini.yahoo.com/advertiser/", "");
				successStat.add(scheduleReportForSubAccount(driver, subAccountURL));
			}
			aYahooGeminiDashboardPage.logout();
		} catch (Exception e) {
			//System.out.println("this user failed : " + username + "\n");
			e.printStackTrace();
			//logger.error(e.getMessage());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(username+"-"+sdf.format(new Date())+"-screenshot.png"));
				driverPool.invalidateObject(driver);
				driver = null;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		} finally {
			try {
				if(null != driver) {
					driverPool.returnObject(driver);
				}				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//System.out.println("Completed - " + new Date() + "\n");
		return successStat;
	}
	public static void main(String[] args) {
		try {
		String userLoginsFilePath = args[0]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users.txt"
		String ReportsFolderPath = args[1]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Reports"
		String binaryPath = args[2]; //"C:/Program Files (x86)/Mozilla Firefox/firefox.exe"
		int noOfThreads = Integer.parseInt(args[3]);
		String proxiesFilePath = args[4]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt"
		List<String> userLogins = TextFileReaderUtils.readLinesAsList(userLoginsFilePath, true);
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", proxiesFilePath, binaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String reportFilePath = ReportsFolderPath + "/ScheduleStats-" +sdf.format(new Date()) +".csv";
		ExecutorService extractors = Executors.newFixedThreadPool(noOfThreads);			
		for(String userLogin : userLogins) {
			String username = userLogin.split(",")[0];
			String password = userLogin.split(",")[1];
			Future<List<String>> scheduleReportStats = extractors.submit(new ScheduleCampaignStatsReport(driverPool, username, password));
			if(!TextFileWriterUtils.doesFileExist(reportFilePath)) {
				TextFileWriterUtils.writeString("Username,Password,SubAccountURL,Status", reportFilePath, true, false);
			}
			TextFileWriterUtils.writeListAsLines(scheduleReportStats.get(), reportFilePath, true);
		}
		extractors.shutdown();
		extractors.awaitTermination(2, TimeUnit.HOURS);
		driverPool.clear();
		driverPool.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
