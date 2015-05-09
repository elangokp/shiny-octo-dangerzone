/**
 * 
 */
package com.cybermint.factories.webdrivers;

import org.apache.commons.pool.BasePoolableObjectFactory;

import org.openqa.selenium.WebDriver;

import com.cybermint.pages.Page;

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

	protected WebDriver constructDriver() {
		return Page.constructDriver(this.driverType);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
