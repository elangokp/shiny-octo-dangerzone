package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.yahoo.pages.YahooMailAccountSecurityPage;
import com.cybermint.contentSyndicator.sites.yahoo.pages.YahooMailInboxPage;
import com.cybermint.contentSyndicator.sites.yahoo.pages.YahooMailLoginPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.pages.Page;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;

public class ChangeYahooPasswordAndRecovery implements Runnable{

	private ObjectPool driverPool;
	private String username;
	private String password;
	private String newPassword;
	private String recoveryEmailAddress;
	public ChangeYahooPasswordAndRecovery(ObjectPool driverPool, String username, String password, String newPassword, String recoveryEmailAddress) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
		this.newPassword = newPassword;
		this.recoveryEmailAddress = recoveryEmailAddress;
	}

	@Override
	public void run() {
		WebDriver driver = null;
		String status = "";
		try {			
			driver = (WebDriver) driverPool.borrowObject();
			driver.manage().window().maximize();
			status = "Starting";
			YahooMailLoginPage aYahooMailLoginPage = new YahooMailLoginPage(driver);			
			YahooMailInboxPage aYahooMailInboxPage = aYahooMailLoginPage.signInAs(username, password);
			status = "Signed in";
			YahooMailAccountSecurityPage aYahooMailAccountSecurityPage = aYahooMailInboxPage.getAccountSecurityPage();
			status = "Got Account Security Page";
			aYahooMailAccountSecurityPage = aYahooMailAccountSecurityPage.updateRecoveryEmailAddress(recoveryEmailAddress);
			status = "Updated Recovery Email";
			aYahooMailAccountSecurityPage = aYahooMailAccountSecurityPage.deleteRecoveryMobileNumber();
			status = "Deleted Recovery Number";
			aYahooMailAccountSecurityPage = aYahooMailAccountSecurityPage.changePasswordTo(newPassword);
			status = "Changed Password";
			aYahooMailAccountSecurityPage.logout();
			status = "Logged Out";
			System.out.println(username + " Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(username + " Failed - " + status);
			e.printStackTrace();
		} finally {
			try {
				driverPool.returnObject(driver);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		String userLoginsFilePath = "C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users-change.txt";
		int noOfThreads = 1;
		//String proxiesFilePath = "C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt";
		String firefoxBinaryPath = "C:/Program Files (x86)/Mozilla Firefox/firefox.exe";
		String recoveryEmailsFilePath = "C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/recoveryemails.txt";
		List<String> recoveryEmails = TextFileReaderUtils.readLinesAsList(recoveryEmailsFilePath, true);
		Collections.shuffle(recoveryEmails);
		CyclicIterator<String> recoveryEmailIterator = new CyclicIterator<String>(recoveryEmails);
		List<String> userLogins = TextFileReaderUtils.readLinesAsList(userLoginsFilePath, true);
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox", "", firefoxBinaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		ExecutorService extractors = Executors.newFixedThreadPool(noOfThreads);			
		for(String userLogin : userLogins) {
			String username = userLogin.split(",")[0];
			String password = userLogin.split(",")[1];
			extractors.execute(new ChangeYahooPasswordAndRecovery(driverPool, username, password, "123gemini!@#", recoveryEmailIterator.next()));
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
