/**
 * 
 */
package com.cybermint.factories.webdrivers;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.pool.BasePoolableObjectFactory;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.CollectingAlertHandler;
import com.gargoylesoftware.htmlunit.DefaultCredentialsProvider;
import com.gargoylesoftware.htmlunit.IncorrectnessListenerImpl;
import com.gargoylesoftware.htmlunit.ProxyConfig;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;

/**
 * @author aa
 *
 */
public class PoolableWebDriverFactory extends BasePoolableObjectFactory {
	
	protected final String driverType;
	
	public PoolableWebDriverFactory(String driverType) {
		this.driverType = driverType;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.commons.pool.BasePoolableObjectFactory#makeObject()
	 */
	@Override
	public Object makeObject() throws Exception {
		WebDriver driver = constructDriver();
		return driver;
	}
	
	public WebDriver constructDriver() {
		WebDriver driver;
		if ("firefox-proxy".equalsIgnoreCase(driverType)) {
			FirefoxBinary aBinary = new FirefoxBinary();
			FirefoxProfile aProfile = new FirefoxProfile();
			Proxy a = new Proxy();
			a.setHttpProxy("184.22.228.177:80");
			a.setAutodetect(false);
			//aProfile.setProxyPreferences(a);			
			driver = new FirefoxDriver(aBinary, aProfile);
      } else if ("firefox".equalsIgnoreCase(driverType)) {
          driver = new FirefoxDriver();
      } else if ("ie".equalsIgnoreCase(driverType)) {
          driver = new InternetExplorerDriver();
      } else if ("htmlunit".equalsIgnoreCase(driverType)) {
          HtmlUnitDriver htmlunitdriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_8) {

              @Override
              protected WebClient modifyWebClient(WebClient client) {
                  client.setCssErrorHandler(new SilentCssErrorHandler());
                  client.setIncorrectnessListener(new IncorrectnessListenerImpl() {

                      @Override
                        public void notify(String arg0, Object arg1)
                        {
                          //System.err.println("Argument : " + arg0.toString() + ", Object : ");
                        }
                  });
                  client.setAlertHandler(new CollectingAlertHandler(new ArrayList()) );
                  return client;
              }
          };
          htmlunitdriver.setJavascriptEnabled(true);
          driver = htmlunitdriver;
      }  else if ("chrome".equalsIgnoreCase(driverType)) {
          System.setProperty("webdriver.chrome.driver", "D:/setups/Open Source Apps/chromedriver_win_16.0.902.0/chromedriver.exe");
          driver = new ChromeDriver();
      } else {
          driver = new FirefoxDriver();
      }
      return driver;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
