package com.cybermint.contentSyndicator.sites.spinRewriter.factories;

import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.spinRewriter.formObjects.SpinRewriterLoginFormObject;
import com.cybermint.contentSyndicator.sites.spinRewriter.pages.SpinRewriterControlPanel;
import com.cybermint.contentSyndicator.sites.spinRewriter.pages.SpinRewriterLoginPage;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;

public class PoolableSpinRewriterDriverFactory extends PoolableWebDriverFactory {

	protected GenericObjectPool spinRewriterLoginFormObjectPool;
	/**
	 * 
	 */
	public PoolableSpinRewriterDriverFactory(String driverType, GenericObjectPool spinRewriterLoginFormObjectPool) {
		super(driverType);
		this.spinRewriterLoginFormObjectPool = spinRewriterLoginFormObjectPool;
	}
	
	@Override
	public Object makeObject() throws Exception {
		WebDriver driver = constructDriver();
		SpinRewriterLoginPage aSpinRewriterLoginPage = new SpinRewriterLoginPage(driver);
		SpinRewriterLoginFormObject aSpinRewriterLoginFormObject = (SpinRewriterLoginFormObject) spinRewriterLoginFormObjectPool.borrowObject();
		System.out.println(aSpinRewriterLoginFormObject.getEmail() + " " + aSpinRewriterLoginFormObject.getPassword());
		aSpinRewriterLoginPage.loginAs(aSpinRewriterLoginFormObject);
		return driver;
	}
}
