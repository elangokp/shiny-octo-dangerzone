/**
 * 
 */
package com.cybermint.factories.webdrivers;

import java.util.Collections;
import java.util.List;

import org.apache.commons.pool.BasePoolableObjectFactory;
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
			Collections.shuffle(proxies);
			this.proxyIterator = new CyclicIterator<String>(proxies);
		}
		
	}
	
	public PoolableWebDriverFactory(String driverType, String proxiesFilePath, String binaryFilePath) {
		this.driverType = driverType;
		if(proxiesFilePath.length()>0){
			List<String> proxies = TextFileReaderUtils.readLinesAsList(proxiesFilePath, true);
			Collections.shuffle(proxies);
			this.proxyIterator = new CyclicIterator<String>(proxies);
		}
		this.binaryFilePath = binaryFilePath;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.commons.pool.BasePoolableObjectFactory#makeObject()
	 */
	@Override
	public Object makeObject() throws Exception {
		WebDriver driver = constructDriver();
		return driver;
	}	
	
	

	@Override
	public void destroyObject(Object obj) throws Exception {
		((WebDriver)obj).close();
		((WebDriver)obj).quit();
		super.destroyObject(obj);
	}

	protected WebDriver constructDriver() {
		if(this.proxyIterator == null) {
			return Page.constructDriver(this.driverType);
		} else {
			return Page.constructDriverWithProxy(this.driverType, proxyIterator.hasNext()?proxyIterator.next():null, this.binaryFilePath);
		} 
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
