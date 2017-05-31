package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
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

import com.cybermint.contentSyndicator.sites.yahoo.pages.YahooMailAccountSecurityPage;
import com.cybermint.contentSyndicator.sites.yahoo.pages.YahooMailInboxPage;
import com.cybermint.contentSyndicator.sites.yahoo.pages.YahooMailLoginPage;
import com.cybermint.contentSyndicator.sites.yahoogemini.utils.YahooGeminiUtils;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class ChangeYahooPasswordAndRecovery implements Runnable{

	private ObjectPool driverPool;
	private String username;
	private String password;
	private String newPassword;
	private String recoveryEmailAddress;
	private String reportsFilepath;
	
	public ChangeYahooPasswordAndRecovery(ObjectPool driverPool, String username, String password, String newPassword, String recoveryEmailAddress, String reportsFilepath) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
		this.newPassword = newPassword;
		this.recoveryEmailAddress = recoveryEmailAddress;
		this.reportsFilepath = reportsFilepath;
	}

	@Override
	public void run() {
		WebDriver driver = null;
		String status = "";
		try {
			driver = (WebDriver) driverPool.borrowObject();
			driver.manage().window().maximize();
			status = YahooGeminiUtils.CH_PASS_STARTING;
			YahooMailLoginPage aYahooMailLoginPage = new YahooMailLoginPage(driver);			
			YahooMailInboxPage aYahooMailInboxPage = aYahooMailLoginPage.signInAs(username, password);
			status = YahooGeminiUtils.CH_PASS_SIGNED_IN;
			YahooMailAccountSecurityPage aYahooMailAccountSecurityPage = aYahooMailInboxPage.getAccountSecurityPage();
			status = YahooGeminiUtils.CH_PASS_GOT_ACCOUNT_SECURITY_PAGE;
			aYahooMailAccountSecurityPage = aYahooMailAccountSecurityPage.updateRecoveryEmailAddress(recoveryEmailAddress);
			status = YahooGeminiUtils.CH_PASS_UPDATED_RECOVERY_EMAIL;
			aYahooMailAccountSecurityPage = aYahooMailAccountSecurityPage.deleteRecoveryMobileNumber();
			status = YahooGeminiUtils.CH_PASS_DELETED_RECOVERY_NUMBER;
			aYahooMailAccountSecurityPage = aYahooMailAccountSecurityPage.changePasswordTo(newPassword);
			status = YahooGeminiUtils.CH_PASS_CHANGED_PASSWORD;
			aYahooMailAccountSecurityPage.logout();
			status = YahooGeminiUtils.CH_PASS_DONE;
			System.out.println(username + " Passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(username + " Failed - " + status);
			e.printStackTrace();
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
					driverPool.invalidateObject(driver);
					//driverPool.returnObject(driver);
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(reportsFilepath.equalsIgnoreCase("todb")) {
			try {
				if(YahooGeminiUtils.CH_PASS_DONE.equalsIgnoreCase(status)) {
					YahooGeminiUtils.updateAccountStatusAndPassword(username, newPassword, status);
				} else {
					YahooGeminiUtils.updateAccountStatus(username, status);
				}				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		} else {
			TextFileWriterUtils.writeString(username+","+status, reportsFilepath, true, true);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, ClassNotFoundException, SQLException {
		String userLoginsFilePath = args[0]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/users-change.txt";
		int noOfThreads = Integer.parseInt(args[1]);
		String proxiesFilePath = args[2]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/proxies.txt";
		String binaryPath = args[3]; //"C:/Program Files (x86)/Mozilla Firefox/firefox.exe";
		String recoveryEmailsFilePath = args[4]; //"C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/FakeProfiles/recoveryemails.txt";
		String reportsFolderPath = args[5];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String reportsFilepath = reportsFolderPath + "/stat-" +sdf.format(new Date()) +".csv";
		List<String> recoveryEmails = TextFileReaderUtils.readLinesAsList(recoveryEmailsFilePath, true);
		Collections.shuffle(recoveryEmails);
		CyclicIterator<String> recoveryEmailIterator = new CyclicIterator<String>(recoveryEmails);
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", proxiesFilePath, binaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		ExecutorService extractors = Executors.newFixedThreadPool(noOfThreads);
		
		if(userLoginsFilePath.equalsIgnoreCase("fromdb")) {
			String userLogin = YahooGeminiUtils.getAccountForPasswordChange();
			while(userLogin.length()>0) {
				String username = userLogin.split(",")[0];
				String password = userLogin.split(",")[1];
				Future f = extractors.submit(new ChangeYahooPasswordAndRecovery(driverPool, username, password, "123gemini!@#", recoveryEmailIterator.next(), "todb"));
				f.get();
				userLogin = YahooGeminiUtils.getAccountForPasswordChange();
			}
		} else {
			List<String> userLogins = TextFileReaderUtils.readLinesAsList(userLoginsFilePath, true);
			ListIterator<String> userLoginsIterator = userLogins.listIterator();
			while(userLoginsIterator.hasNext()) {
				String userLogin = userLoginsIterator.next();
				String username = userLogin.split(",")[0];
				String password = userLogin.split(",")[1];
				Future f = extractors.submit(new ChangeYahooPasswordAndRecovery(driverPool, username, password, "123gemini!@#", recoveryEmailIterator.next(), reportsFilepath));
				f.get();
				userLoginsIterator.remove();
				TextFileWriterUtils.writeListAsLines(userLogins, userLoginsFilePath, false);
			}
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
