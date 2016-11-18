package com.cybermint.contentSyndicator.sites.yahoo.pages;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.contentSyndicator.sites.yahoogemini.pages.YahooGeminiDashboardPage;
import com.cybermint.pages.Page;

public class YahooMailAccountSecurityPage extends Page{

	public YahooMailAccountSecurityPage(WebDriver driver) {
		super(driver);
	}
	
	public YahooMailAccountSecurityPage getAccountSecurityPage() {
		driver.get("https://login.yahoo.com/account/security");
		super.waitForElementToLoad("id", "comm-channel");
		return PageFactory.initElements(driver, YahooMailAccountSecurityPage.class);
	}
	
	public void logout() {
		((JavascriptExecutor) driver).executeScript("document.getElementById('yucs-signout').click();");
		super.waitForElementToLoad("id", "uh-signin");
	}
	
	public YahooMailAccountSecurityPage changePasswordTo(String givenPassword) {
		WebElement changepasswordLink =  driver.findElement(By.xpath("//a[contains(@href,\"change-password\")][2]"));
		changepasswordLink.click();
		super.waitForElementToLoad("id", "cpwd-password");
		WebElement passwordTextbox =  driver.findElement(By.id("cpwd-password"));
		super.clearAndType(passwordTextbox, givenPassword);
		WebElement confirmPasswordTextbox =  driver.findElement(By.id("cpwd-confirm-password"));
		super.clearAndType(confirmPasswordTextbox, givenPassword);
		WebElement submitButton =  driver.findElement(By.cssSelector(".cpwd-submit-button"));
		submitButton.click();
		/*super.waitForElementToLoad("css", ".cpwd-success-button a");
		WebElement continueButton =  driver.findElement(By.cssSelector(".cpwd-success-button a"));
		continueButton.click();*/
		//super.waitForElementToLoad("id", "skipbtn",10);
		//WebElement skipLink =  driver.findElement(By.id("skipbtn"));
		//skipLink.click();
		//((JavascriptExecutor) driver).executeScript("document.getElementById('skipbtn').click();");
		//driver.get("https://login.yahoo.com/account/security");
		//super.waitForElementToLoad("id", "comm-channel");
		/*if(driver.getCurrentUrl().contains("comm-channel")) {
			super.waitForElementToLoad("css", "div.refresh-cta-container button");
			driver.findElement(By.cssSelector("div.refresh-cta-container button")).click();
		}*/
		return this.getAccountSecurityPage();
		//return PageFactory.initElements(driver, YahooMailAccountSecurityPage.class);
	}
	
	public YahooMailAccountSecurityPage deleteRecoveryMobileNumber() {
		WebElement phoneNumbersLink =  driver.findElement(By.xpath("//a[contains(@title,\"Phone\")]"));
		phoneNumbersLink.click();
		super.waitForElementToLoad("css", "div.delete-txt input");
		WebElement deletePhoneNumberButton = driver.findElement(By.cssSelector("div.delete-txt input"));
		deletePhoneNumberButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.waitForElementToLoad("css", "a.close");
		WebElement popupCloseButton = driver.findElement(By.cssSelector("a.close"));
		popupCloseButton.click();
		super.waitForElementToLoad("id", "comm-channel");
		return PageFactory.initElements(driver, YahooMailAccountSecurityPage.class);
	}
	
	public YahooMailAccountSecurityPage updateRecoveryEmailAddress(String givenEmail) {
		WebElement addRecoveryEmailLink =  driver.findElement(By.xpath("//a[contains(@title,\"recovery\")]"));
		addRecoveryEmailLink.click();
		super.waitForElementToLoad("xpath", "//input[@name=\"email\"]");
		WebElement emailTextBox =  driver.findElement(By.xpath("//input[@name=\"email\"]"));
		super.clearAndType(emailTextBox, givenEmail);
		WebElement sendVerificationEmailButton =  driver.findElement(By.xpath("//input[@name=\"add-email\"]"));
		sendVerificationEmailButton.click();
		int maxRetries = 3;
		int retryInterval = 60;
		String verificationLink = "";
		for(int i=maxRetries; i >=0; i--) {
			try {
				Thread.sleep(retryInterval*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			verificationLink = getVerificationLink();
			if(verificationLink.length()>0) {
				i = -1;
			}
		}
		driver.get(verificationLink);
		super.waitForElementToLoad("xpath", "//input[@type=\"submit\"]");
		WebElement verifyButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		verifyButton.click();
		super.waitForElementToLoad("xpath", "//input[@type=\"submit\"]");
		driver.get("https://login.yahoo.com/account/security");
		super.waitForElementToLoad("id", "comm-channel");
		return PageFactory.initElements(driver, YahooMailAccountSecurityPage.class);
	}
	
	private String getVerificationLink() {
		String verificationLink = "";
		try {
		  String host = "c20272.sgvps.net";// change accordingly
	      //String mailStoreType = "pop3";
	      String username = "yahooverify@affilialogy.com";// change accordingly
	      String password = "123yv!@#";// change accordingly
	      Properties properties = new Properties();
	      
	      properties.put("mail.store.protocol", "pop3");
	      properties.put("mail.pop3.host", host);
	      properties.put("mail.pop3.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");
	      Session emailSession = Session.getDefaultInstance(properties);
	  
	      //create the POP3 store object and connect with the pop server
	      Store store = emailSession.getStore("pop3s");

	      store.connect(host, username, password);

	      //create the folder object and open it
	      Folder emailFolder = store.getFolder("INBOX");
	      emailFolder.open(Folder.READ_WRITE);

	      // retrieve the messages from the folder in an array and print it
	      Message[] messages = emailFolder.getMessages();
	      for (int i = 0, n = messages.length; i < n; i++) {
	          Message message = messages[i];
	          /*System.out.println("---------------------------------");
	          System.out.println("Email Number " + (i + 1));
	          System.out.println("Subject: " + message.getSubject());
	          System.out.println("From: " + message.getFrom()[0]);
	          System.out.println("Text: " + message.getContent().toString());*/
	          if(message.getSubject().contains("email address") && message.getFrom()[0].toString().contains("yahoo")) {
	         	 Pattern pattern = Pattern.compile("'https://login.yahoo.com/account/action/verify(.*?)'");
	         	 Matcher matcher = pattern.matcher(message.getContent().toString());
	         	 if (matcher.find())
	         	 {
	         	    //System.out.println(matcher.group(0).replaceAll("'", ""));
	         	    verificationLink = matcher.group(0).replaceAll("'", "");
	         	   System.out.println("verificationLink : " + verificationLink);
	         	 }
	         	 
	          }
	          message.setFlag(Flags.Flag.DELETED, true);
	       }

	       //close the store and folder objects
	       emailFolder.close(true);
	       store.close();

	       } catch (NoSuchProviderException e) {
	          e.printStackTrace();
	       } catch (MessagingException e) {
	          e.printStackTrace();
	       } catch (Exception e) {
	          e.printStackTrace();
	       }
		return verificationLink;
	}

}
