package com.cybermint.contentSyndicator.sites.yahoogemini.pages;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermint.pages.Page;
import com.cybermint.utils.captchasolver.dbc.DBCCaptchaSolver;

public class YahooGeminiLoginPage extends Page {
	
	@FindBy(id = "login-username")
    protected WebElement usernameTextBox;
    @FindBy(id = "login-passwd")
    protected WebElement passwordTextBox;
    @FindBy(id = "login-signin")
    protected WebElement signInButton;
    
    private int retryCount = 0;
    
    private DBCCaptchaSolver dbc;

	public YahooGeminiLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public YahooGeminiDashboardPage signInAs(String username, String password) {
		try {
			super.waitForElementToLoad("id", "login-username");	
			usernameTextBox.clear();
			usernameTextBox.click();
			usernameTextBox.sendKeys(username);
			super.waitForElementToLoad("id", "login-signin");
			if(!super.waitForElementToLoad("id", "login-passwd",2)) {
				signInButton.click();
			}
			super.waitForElementToLoad("id", "login-passwd");	
			passwordTextBox.clear();
			passwordTextBox.click();
			passwordTextBox.sendKeys(password);
			/*if(super.waitForElementToLoad("xpath", "//label[@for=\"persistent\" and contains(@id,\"yui\")]",1)) { //checks if the Stay signed in option is selected
				WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\" and contains(@id,\"yui\")]")); 
				staySignedInCheckBox.click(); //de-selects the stay signed in option.
				//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			}*/
			//WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\"]"));			
			//staySignedInCheckBox.click(); //de-selects the stay signed in option.
			//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			signInButton.click();
			/*
			while(driver.getCurrentUrl().contains("campaign")) {
				Thread.sleep(300);
			}	
			Thread.sleep(1000);
			if(driver.getCurrentUrl().contains("scrumb")) {
				driver.get("https://gemini.yahoo.com");
			}
			if(driver.getCurrentUrl().contains("home") && retryCount<3) {
				retryCount++;
				this.signInAs(username, password);
			}*/
			
			if(super.waitForElementToLoad("id", "cpt-vc-src",5)) {
				int maxRetries = 5;
				int retryInterval = 5;
				for(int i=maxRetries; i >=0; i--) {
					try {
						Thread.sleep(retryInterval*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					this.solveCaptcha(username, i);
					if(!super.waitForElementToLoad("id", "cpt-vc-src",3)) {
						i = -1;
					} else {
						this.dbc.reportIncorrectCaptcha();
					}					
				}
			}
			
			Thread.sleep(3000);
			if(driver.getCurrentUrl().contains("ylc")) {
				super.waitForElementToLoad("css", "button[channel='email']");
				driver.findElement(By.cssSelector("button[channel='email']")).click();
				int maxRetries = 3;
				int retryInterval = 60;
				String verificationCode = "";
				for(int i=maxRetries; i >=0; i--) {
					try {
						Thread.sleep(retryInterval*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					verificationCode = this.getVerificationCode(username);
					if(verificationCode.length()>0) {
						i = -1;
					}
				}
				super.waitForElementToLoad("css", "#ylc-code");
				WebElement codeInput = driver.findElement(By.cssSelector("#ylc-code"));
				codeInput.click();
				codeInput.clear();
				codeInput.sendKeys(verificationCode);
				driver.findElement(By.cssSelector("button.puree-button-primary")).click();
			}
			if(driver.getCurrentUrl().contains("comm-channel")) {
				super.waitForElementToLoad("css", "div.refresh-cta-container button");
				driver.findElement(By.cssSelector("div.refresh-cta-container button")).click();
			}
			if(driver.getCurrentUrl().contains("account") || driver.getCurrentUrl().contains("campaign")) {
				super.waitForElementToLoad("css", "li.nav-icon");
				return PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
			} 
			
			if(super.waitForElementToLoad("id", "skipbtn",10)) {
				((JavascriptExecutor) driver).executeScript("document.getElementById('skipbtn').click();");
				super.waitForElementToLoad("css", "li.nav-icon");
				return PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, YahooGeminiDashboardPage.class);
    }
	
	public YahooGeminiSignUpPage signInAndGetSignUpPage(String username, String password) {
		try {
			super.waitForElementToLoad("id", "login-username");	
			usernameTextBox.clear();
			usernameTextBox.click();
			usernameTextBox.sendKeys(username);
			super.waitForElementToLoad("id", "login-signin");
			if(!super.waitForElementToLoad("id", "login-passwd",2)) {
				signInButton.click();
			}
			super.waitForElementToLoad("id", "login-passwd");	
			passwordTextBox.clear();
			passwordTextBox.click();
			passwordTextBox.sendKeys(password);
			/*if(super.waitForElementToLoad("xpath", "//label[@for=\"persistent\" and contains(@id,\"yui\")]",1)) { //checks if the Stay signed in option is selected
				WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\" and contains(@id,\"yui\")]")); 
				staySignedInCheckBox.click(); //de-selects the stay signed in option.
				//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			}*/
			//WebElement staySignedInCheckBox = driver.findElement(By.xpath("//label[@for=\"persistent\"]"));			
			//staySignedInCheckBox.click(); //de-selects the stay signed in option.
			//super.waitForElementToLoad("xpath", "//label[@for=\"persistent\"]",1);
			signInButton.click();
			/*
			while(driver.getCurrentUrl().contains("campaign")) {
				Thread.sleep(300);
			}	
			Thread.sleep(1000);
			if(driver.getCurrentUrl().contains("scrumb")) {
				driver.get("https://gemini.yahoo.com");
			}
			if(driver.getCurrentUrl().contains("home") && retryCount<3) {
				retryCount++;
				this.signInAs(username, password);
			}*/
			Thread.sleep(3000);
			if(driver.getCurrentUrl().contains("comm-channel")) {
				super.waitForElementToLoad("css", "div.refresh-cta-container button");
				driver.findElement(By.cssSelector("div.refresh-cta-container button")).click();
			}
			if(driver.getCurrentUrl().contains("account") || driver.getCurrentUrl().contains("campaign")) {
				driver.get("https://gemini.yahoo.com/advertiser/new?create=true");
				super.waitForElementToLoad("id", "sign_up_form");
				return PageFactory.initElements(driver, YahooGeminiSignUpPage.class);
			}
			if(super.waitForElementToLoad("id", "skipbtn",10)) {
				((JavascriptExecutor) driver).executeScript("document.getElementById('skipbtn').click();");
			}
			super.waitForElementToLoad("xpath", "//a[contains(text(), \"Sign up\")]");
			driver.get("https://gemini.yahoo.com/advertiser/new?create=true");
			super.waitForElementToLoad("id", "sign_up_form");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, YahooGeminiSignUpPage.class);
    }
	
	private void solveCaptcha(String yahooUsername, int interationCount) throws Exception {
		String solvedCaptcha = "";
		WebElement captchaImage = driver.findElement(By.id("cpt-vc-src"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
		String captchaImageScreenshotLocation = "captchas/"+yahooUsername+"-"+sdf.format(new Date())+"-captcha-"+interationCount+".png";
		if(super.screenShotThisElement(captchaImage, captchaImageScreenshotLocation)) {
			this.dbc = new DBCCaptchaSolver();
			solvedCaptcha = dbc.solveCaptchaFromFileLocation(captchaImageScreenshotLocation);
			if(null != solvedCaptcha && solvedCaptcha.length()>0) {
				WebElement captchaAnswerInput = driver.findElement(By.id("captchaAnswer"));
				captchaAnswerInput.clear();
				captchaAnswerInput.click();
				captchaAnswerInput.sendKeys(solvedCaptcha);
				WebElement continueButton = driver.findElement(By.cssSelector("#mbr-login-popup button.mbr-button-primary"));
				continueButton.click();
			}
			
		}
	}
	
	private String getVerificationCode(String yahooUsername) {
		String verificationCode = "";
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
	          if(message.getSubject().contains("Yahoo Login Verification Code") && message.getFrom()[0].toString().contains("yahoo")) {
	        	 System.out.println("inside yahoo login verification mail");
	        	 
	        	 String msgContentText = "";
	        	 Object msgContent = message.getContent();
	        	 if(msgContent instanceof Multipart) {
	        		 Multipart multipart = (Multipart) msgContent;

	        		 System.out.println("BodyPart, MultiPartCount: "+multipart.getCount());

	                 for (int j = 0; j < multipart.getCount(); j++) {

	                  BodyPart bodyPart = multipart.getBodyPart(j);

	                  String disposition = bodyPart.getDisposition();

	                  if (disposition != null && (disposition.equalsIgnoreCase("ATTACHMENT"))) { 
	                      System.out.println("Mail have some attachment");

	                      DataHandler handler = bodyPart.getDataHandler();
	                      System.out.println("file name : " + handler.getName());                                 
	                    }
	                  else { 
	                	  msgContentText = this.dumpPart(bodyPart);  // the changed code         
	                    }
	                }
	        	 } else {
	        		 msgContentText = message.getContent().toString();
	        	 }
	        	 
	        	 if(msgContentText.contains(yahooUsername)) {
	        		 System.out.println("inside yahoo matching username verification mail");
	        		 Pattern pattern = Pattern.compile("[0-9]+\\s+is your verification code\\.");
		         	 Matcher matcher = pattern.matcher(msgContentText);
		         	 if (matcher.find())
		         	 {
		         	    //System.out.println(matcher.group(0).replaceAll("'", ""));
		         		String verificationCodeSentence = matcher.group(0);
		         		System.out.println("verificationCodeSentence : " + verificationCodeSentence);
		         	    verificationCode = verificationCodeSentence.replaceAll("\\s+is.*", "");
		         	    System.out.println("verificationCode : " + verificationCode);
		         	 }
		         	message.setFlag(Flags.Flag.DELETED, true);	
	        	 }
	         	          	 
	          }
	          
	          if(!message.getFrom()[0].toString().contains("yahoo")) {
	        	  message.setFlag(Flags.Flag.DELETED, true);
	          }
	          
	          if(message.getFrom()[0].toString().contains("yahoo") && message.getSubject().contains("Unexpected sign-in attempt")) {
	        	  message.setFlag(Flags.Flag.DELETED, true);
	          }
	          
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
		return verificationCode;
	}
	
	private String dumpPart(Part p) throws Exception {

        InputStream is = p.getInputStream();
        // If "is" is not already buffered, wrap a BufferedInputStream
        // around it.
        if (!(is instanceof BufferedInputStream)) {
            is = new BufferedInputStream(is);
        }
        return this.getStringFromInputStream(is);
    }

	private String getStringFromInputStream(InputStream is) {
	
	        BufferedReader br = null;
	        StringBuilder sb = new StringBuilder();
	        String line;
	        try {
	            br = new BufferedReader(new InputStreamReader(is));
	            while ((line = br.readLine()) != null) {
	                sb.append(line);
	                sb.append("\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return sb.toString();
	    }
	
	public static void main(String args[]) {
		//String verificationCode = YahooGeminiLoginPage.getVerificationCode("jamesquiroz671");
		//System.out.println(verificationCode);
	}

}
