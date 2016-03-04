package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiHomePage;
import com.cybermint.contentSyndicator.sites.yahoogemini.utils.YahooGeminiUtils;
import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;

public class ExtractCampaignStatsForToday {

	public ExtractCampaignStatsForToday() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Page.constructDriver("firefox");
		driver.manage().window().maximize();
		List<String> userLogins = TextFileReaderUtils.readLinesAsList("C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users.txt", true);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
		String campaignFilePath = "C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Reports/sample-" +sdf.format(new Date()) +".csv";
		for(String userLogin : userLogins) {
			String username = userLogin.split(",")[0];
			String password = userLogin.split(",")[1];
			try {
				YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
				YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
				aYahooGeminiDashboardPage.deleteAllCampaigns();
				//aYahooGeminiDashboardPage.enableAllCampaigns();
				//List<Campaign> campaigns = aYahooGeminiDashboardPage.getCampaignStats(Campaign.today);
				//List<Campaign> campaigns = aYahooGeminiDashboardPage.getCampaignStats(Campaign.oneMonth);
				//YahooGeminiUtils.setOutlierProperties(campaigns);
				//YahooGeminiUtils.saveCampaignsToFile(campaigns, campaignFilePath);
				//aYahooGeminiDashboardPage.pauseOutlierCampaigns(campaigns);
				aYahooGeminiDashboardPage.logout();
			} catch (Exception e) {
				System.out.println("this user failed : " + username + "\n");
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(scrFile, new File("C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Reports/"+username+"-screenshot.png"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		}
		driver.close();
		driver.quit();

	}

}
