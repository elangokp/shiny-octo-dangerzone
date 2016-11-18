/**
 * 
 */
package com.cybermint.factories.webdrivers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool.BasePoolableObjectFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cybermint.pages.Page;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;

/**
 * @author aa
 *
 */
public class PoolableWebDriverFactory extends BasePoolableObjectFactory {
	
	protected final String driverType;
	protected CyclicIterator<String> proxyIterator = null;
	protected String binaryFilePath = null;
	
	public PoolableWebDriverFactory(String driverType) {
		this.driverType = driverType;
	}
	
	public PoolableWebDriverFactory(String driverType, String proxiesFilePath) {
		this.driverType = driverType;
		if(proxiesFilePath.length()>0){
			List<String> proxies = TextFileReaderUtils.readLinesAsList(proxiesFilePath, true);
			List<String> usableProxies = new ArrayList<String>();
			WebDriver driver = Page.constructDriverWithProxy(this.driverType,null,null);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			for(int i=0;i<proxies.size();i++) {
				if(this.verifyProxy(proxies.get(i),driver) == true) {					
					usableProxies.add(proxies.get(i));
				}
			}
			driver.close();
			driver.quit();
			Collections.shuffle(usableProxies);
			this.proxyIterator = new CyclicIterator<String>(usableProxies);
		}
		
	}
	
	public PoolableWebDriverFactory(String driverType, String proxiesFilePath, String binaryFilePath) {
		this.driverType = driverType;
		if(proxiesFilePath.length()>0){
			List<String> proxies = TextFileReaderUtils.readLinesAsList(proxiesFilePath, true);
			List<String> usableProxies = new ArrayList<String>();
			WebDriver driver = Page.constructDriverWithProxy(this.driverType,null,binaryFilePath);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			for(int i=0;i<proxies.size();i++) {
				if(this.verifyProxy(proxies.get(i),driver) == true) {					
					usableProxies.add(proxies.get(i));
				}
			}
			driver.close();
			driver.quit();
			Collections.shuffle(usableProxies);
			//System.out.println(usableProxies.size());
			this.proxyIterator = new CyclicIterator<String>(usableProxies);
		}
		this.binaryFilePath = binaryFilePath;
	}
	
	private boolean verifyProxy(String proxy, WebDriver driver) {
		boolean isPass = false;
		try {			
			driver.get("https://instantproxies.com/proxytester/test.json.php?proxy="+proxy);
			String totalContent = driver.findElement(By.tagName("body")).getText();
			int responseTime = Integer.parseInt(totalContent.toString().split(",")[0]);
			String status = totalContent.split(",")[1];			
			if(status.equalsIgnoreCase("200") && responseTime < 550 && responseTime > 0) {
				isPass = true;
			}			
			//System.out.println(proxy + "," + totalContent + "," + isPass);
		} catch (Exception e) {
			//e.printStackTrace();
		}		
		return isPass;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.commons.pool.BasePoolableObjectFactory#makeObject()
	 */
	@Override
	public Object makeObject() throws Exception {
		WebDriver driver = constructDriver();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		return driver;
	}	
	
	

	@Override
	public void destroyObject(Object obj) throws Exception {
		((WebDriver)obj).close();
		((WebDriver)obj).quit();
		super.destroyObject(obj);
	}

	protected WebDriver constructDriver() {
		WebDriver driver = null;
		if(this.proxyIterator == null) {			
			driver = Page.constructDriver(this.driverType);
			return driver;
		} else {
			Boolean hasProxyError = true;
			int maxRetries = 10;
			while(hasProxyError && maxRetries>0) {
				driver = Page.constructDriverWithProxy(this.driverType, proxyIterator.hasNext()?proxyIterator.next():null, this.binaryFilePath);
				driver.get("http://www.google.com/ncr");
				hasProxyError = driver.getPageSource().contains("ERR_PROXY_CONNECTION_FAILED")?true:false;
				if(hasProxyError) {
					driver.close();
					driver.quit();
				}
				maxRetries--;
			}
			return driver;
		} 
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
