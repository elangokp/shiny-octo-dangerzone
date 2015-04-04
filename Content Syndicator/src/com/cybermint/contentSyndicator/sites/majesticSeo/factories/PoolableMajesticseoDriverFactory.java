/**
 * 
 */
package com.cybermint.contentSyndicator.sites.majesticSeo.factories;

import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.majesticSeo.formObjects.MajesticSeoLoginFormObject;
import com.cybermint.contentSyndicator.sites.majesticSeo.pages.MajesticSeoDashboardPage;
import com.cybermint.contentSyndicator.sites.majesticSeo.pages.MajesticSeoLoginPage;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;

/**
 * @author aa
 *
 */
public class PoolableMajesticseoDriverFactory extends PoolableWebDriverFactory {

	protected GenericObjectPool majesticSeoLoginFormObjectPool;
	/**
	 * 
	 */
	public PoolableMajesticseoDriverFactory(String driverType, GenericObjectPool majesticSeoLoginFormObjectPool) {
		super(driverType);
		this.majesticSeoLoginFormObjectPool = majesticSeoLoginFormObjectPool;
	}
	
	@Override
	public Object makeObject() throws Exception {
		WebDriver driver = constructDriver();
		MajesticSeoLoginPage aMajesticSeoLoginPage = new MajesticSeoLoginPage(driver);
		MajesticSeoLoginFormObject aMajesticSeoLoginFormObject = (MajesticSeoLoginFormObject) majesticSeoLoginFormObjectPool.borrowObject();
		System.out.println(aMajesticSeoLoginFormObject.getEmail() + " " + aMajesticSeoLoginFormObject.getPassword());
		aMajesticSeoLoginPage.loginAs(aMajesticSeoLoginFormObject);
		return driver;
	}

}
