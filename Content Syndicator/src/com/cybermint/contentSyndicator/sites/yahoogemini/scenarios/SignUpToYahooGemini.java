package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiBillingPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiHomePage;
import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiSignUpPage;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class SignUpToYahooGemini implements Runnable{

	private ObjectPool driverPool;
	private String username;
	private String password;
	private String companyName;
	private String companyWebsite;
	private String email;
	private String phoneNumber;
	private String cardNumber;
	private String cardExpiry;
	private String cardCVV;
	private String cardHolderName;
	private String zipCode;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String signupStatsFilepath;
	private String lastStatus;
	
	public SignUpToYahooGemini(ObjectPool driverPool, String username, String password, String companyName, String companyWebsite, String email, String phoneNumber
			, String cardNumber, String cardExpiry, String cardCVV, String cardHolderName, String zipCode, String signupStatsFilepath
			, String address1, String address2, String city, String state, String lastStatus) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
		this.companyName = companyName;
		this.companyWebsite = companyWebsite;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.cardNumber = cardNumber;
		this.cardExpiry = cardExpiry;
		this.cardCVV = cardCVV;
		this.cardHolderName = cardHolderName;
		this.zipCode = zipCode;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.signupStatsFilepath = signupStatsFilepath;
		this.lastStatus = lastStatus;
	}
	
	@Override
	public void run()  {
		WebDriver driver = null;
		List<String> failureLog = new ArrayList<String>();
		//failureLog.add("this user started : " + username + " - " + new Date());
		//System.out.println("Started - " + new Date() + "\n");
		String status = "started";
		try {
			driver = (WebDriver) driverPool.borrowObject();
			//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			YahooGeminiHomePage aYahooGeminiHomePage = new YahooGeminiHomePage(driver);
			YahooGeminiSignUpPage aYahooGeminiSignUpPage = null;
			YahooGeminiDashboardPage aYahooGeminiDashboardPage = null;
			if(null == this.lastStatus ||  this.lastStatus.length() == 0 || this.lastStatus.equalsIgnoreCase("started")
					|| this.lastStatus.equalsIgnoreCase("signed in")) {
				aYahooGeminiSignUpPage = aYahooGeminiHomePage.clickSignInLink().signInAndGetSignUpPage(username, password);
				status = "signed in";
				System.out.println(status);
				aYahooGeminiDashboardPage = aYahooGeminiSignUpPage.signup(companyName, companyWebsite, email, phoneNumber);
				status = "signed up";
				System.out.println(status);
			} else {
				aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
			}
			
			
			//YahooGeminiDashboardPage aYahooGeminiDashboardPage = aYahooGeminiHomePage.clickSignInLink().signInAs(username, password);
			aYahooGeminiDashboardPage.clickGotIt();
			aYahooGeminiDashboardPage.dismissSplash();
			YahooGeminiBillingPage aYahooGeminiBillingPage = aYahooGeminiDashboardPage.goToBilling();
			status = "Opened Billing";
			System.out.println(status);
			Boolean billingSuccess = aYahooGeminiBillingPage.submitCCInfo(cardNumber, cardExpiry, cardCVV, cardHolderName, zipCode
																			,address1, address2, city, state, false);
			
			if(billingSuccess) {
				status = "Billing Success";
			} else {
				status = "Billing Failure";
			}
			System.out.println(status);
			
			aYahooGeminiBillingPage.logout();
		} catch (Exception e) {
			//System.out.println("this user failed : " + username + "\n");
			e.printStackTrace();
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(username+"-"+companyName+"-screenshot.png"));
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
		TextFileWriterUtils.writeString(username+"-"+companyName+","+status, signupStatsFilepath, true, true);
		//System.out.println("Completed - " + new Date() + "\n");		
	}
	
	private static List<String> getCardDetails(String cardId) {
		List<String> cardDetails = new ArrayList<String>();
		if(cardId.equalsIgnoreCase("Amex1")) {
			cardDetails.add("371291736941002");
			cardDetails.add("0121");
			cardDetails.add("2869");
			cardDetails.add("ELANGO KUMANAN PADMAVATHY");
			cardDetails.add("90621");
		} else if(cardId.equalsIgnoreCase("Disc1")) {
			cardDetails.add("6011003518582018");
			cardDetails.add("0320");
			cardDetails.add("760");
			cardDetails.add("ELANGO KUMANAN PADMAVATHY");
			cardDetails.add("90621");
		} else if(cardId.equalsIgnoreCase("BaviAmex1")) {
			cardDetails.add("371291736941069");
			cardDetails.add("0921");
			cardDetails.add("4543");
			cardDetails.add("Bavithra");
			cardDetails.add("90621");
			cardDetails.add("7300 8th St");
			cardDetails.add("");
			cardDetails.add("BuenaPark");
			cardDetails.add("California");
		} else if(cardId.equalsIgnoreCase("Amex3")) {
			cardDetails.add("371291736941044");
			cardDetails.add("0821");
			cardDetails.add("2756");
			cardDetails.add("Elango");
			cardDetails.add("90621");
			cardDetails.add("7270 8th St");
			cardDetails.add("");
			cardDetails.add("BuenaPark");
			cardDetails.add("California");
		} else if(cardId.equalsIgnoreCase("Amex4")) {
			cardDetails.add("371291736941010");
			cardDetails.add("0821");
			cardDetails.add("5186");
			cardDetails.add("Elango");
			cardDetails.add("90621");
			cardDetails.add("7270 8th St");
			cardDetails.add("");
			cardDetails.add("BuenaPark");
			cardDetails.add("California");
		} else if(cardId.equalsIgnoreCase("Amex5")) {
			cardDetails.add("371291736941028");
			cardDetails.add("0821");
			cardDetails.add("8339");
			cardDetails.add("Elango");
			cardDetails.add("90621");
			cardDetails.add("7270 8th St");
			cardDetails.add("");
			cardDetails.add("BuenaPark");
			cardDetails.add("California");
		} else if(cardId.equalsIgnoreCase("Amex6")) {
			cardDetails.add("371291736941036");
			cardDetails.add("0821");
			cardDetails.add("9215");
			cardDetails.add("Elango");
			cardDetails.add("90621");
			cardDetails.add("7270 8th St");
			cardDetails.add("");
			cardDetails.add("BuenaPark");
			cardDetails.add("California");
		}
		return cardDetails;
	}

	public static void main(String[] args) throws InterruptedException {	
		String userLoginsFilePath = args[0]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users.txt"
		String reportsFolderPath = args[1]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Reports"
		String binaryPath = args[2]; //"C:/Program Files (x86)/Mozilla Firefox/firefox.exe"
		int noOfThreads = Integer.parseInt(args[3]);
		String proxiesFilePath = args[4]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt"
		int accountsPerRun = Integer.parseInt(args[5]);
		List<String> userLogins = TextFileReaderUtils.readLinesAsList(userLoginsFilePath, true);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String signupStatsFilepath = reportsFolderPath + "/signupStat-" +sdf.format(new Date()) +".csv";
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", proxiesFilePath, binaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		ExecutorService extractors = Executors.newFixedThreadPool(noOfThreads);		
		
		List<String> userLoginsForThisRun = new ArrayList<String>();
		for(int i=0; i<userLogins.size() && i < accountsPerRun ; i++) {
			userLoginsForThisRun.add(userLogins.get(i));
			userLogins.remove(i);
		}
		
		for(String userLogin : userLoginsForThisRun) {
			String[] userLoginArray = userLogin.split(",");
			String username = userLoginArray[0];
			String password = userLoginArray[1];
			String companyName = userLoginArray[2];
			String companyWebsite = userLoginArray[3];
			String email = userLoginArray[4];
			String phoneNumber = userLoginArray[5];
			List<String> cardDetails = getCardDetails(userLoginArray[6]);
			String lastStatus = null;
			if(userLoginArray.length>7) {
				lastStatus = userLoginArray[7];
			}
			String cardNumber = cardDetails.get(0);
			String cardExpiry = cardDetails.get(1);
			String cardCVV = cardDetails.get(2);
			String cardHolderName = cardDetails.get(3);
			String zipCode = cardDetails.get(4);
			String address1 = cardDetails.get(5);
			String address2 = cardDetails.get(6);
			String city = cardDetails.get(7);
			String state = cardDetails.get(8);
			extractors.execute(new SignUpToYahooGemini(driverPool, username, password, companyName
					, companyWebsite, email, phoneNumber, cardNumber, cardExpiry
					, cardCVV, cardHolderName, zipCode, signupStatsFilepath
					,address1, address2, city, state, lastStatus));
		}
		extractors.shutdown();
		extractors.awaitTermination(2, TimeUnit.HOURS);
		TextFileWriterUtils.writeListAsLines(userLogins, userLoginsFilePath);
		driverPool.clear();
		try {
			driverPool.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
