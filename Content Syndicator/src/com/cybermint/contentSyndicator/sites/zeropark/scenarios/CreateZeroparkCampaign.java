package com.cybermint.contentSyndicator.sites.zeropark.scenarios;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.WebDriver;

import com.cybermint.contentSyndicator.sites.zeropark.pages.ZeroparkCampaignAddPage;
import com.cybermint.contentSyndicator.sites.zeropark.pages.ZeroparkDashboardPage;
import com.cybermint.contentSyndicator.sites.zeropark.pages.ZeroparkLoginPage;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;

public class CreateZeroparkCampaign implements Runnable {

	private ObjectPool driverPool;
	private String username;
	private String password;
	private String campaignName;
	private String countryCode;
	private Double bid;
	private Double dailyBudget;
	private Double campaignBudget;
	private Double targetMaxBudget;
	private String deviceType;
	private String[] devices;
	private String connectionType;
	private String[] carriers;
	private String frequency;
	private String visitorType;
	private String destination;
	
	public CreateZeroparkCampaign(ObjectPool driverPool, String username, String password, String campaignName, String countryCode
			, Double bid, Double dailyBudget, Double campaignBudget
			, Double targetMaxBudget, String deviceType, String[] devices, String connectionType, String[] carriers
			, String frequency, String visitorType, String destination) {
		this.driverPool = driverPool;
		this.username = username;
		this.password = password;
		this.campaignName = campaignName;
		this.countryCode = countryCode;
		this.bid = bid;
		this.dailyBudget = dailyBudget;
		this.campaignBudget = campaignBudget;
		this.targetMaxBudget = targetMaxBudget;
		this.deviceType = deviceType;
		this.devices = devices;
		this.connectionType = connectionType;
		this.carriers = carriers;
		this.frequency = frequency;
		this.visitorType = visitorType;
		this.destination = destination;
	}

	@Override
	public void run() {
		WebDriver driver = null;
		try {
			driver = (WebDriver) driverPool.borrowObject();
			driver.manage().window().maximize();
			ZeroparkLoginPage aZeroparkLoginPage =  new ZeroparkLoginPage(driver);
			ZeroparkDashboardPage aZeroparkDashboardPage = aZeroparkLoginPage.signInAs(username, password);
			ZeroparkCampaignAddPage aZeroparkCampaignAddPage = aZeroparkDashboardPage.getCampaignAddPage();
			aZeroparkCampaignAddPage.addCampaign(campaignName, countryCode, bid, dailyBudget, campaignBudget
					, targetMaxBudget, deviceType, devices, connectionType
					, carriers, frequency, visitorType, destination);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException {
		String binaryPath = args[0];
		String proxiesFilePath = args[1];
		int noOfThreads = Integer.parseInt(args[2]);
		PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", proxiesFilePath, binaryPath);
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
		driverPool.setMaxActive(noOfThreads);
		driverPool.setLifo(false); //To make it behave a FIFO
		driverPool.setMaxWait(45000);
		ExecutorService campaignCreators = Executors.newFixedThreadPool(noOfThreads);
		
		campaignCreators.execute(new CreateZeroparkCampaign(driverPool, "elango.k.p@gmail.com", "123zp!@#"
				, "Afflow", "AF", 0.0001, 10.00, 10.00, 10.00, "mobile", null, "selectedCarriersTraffic"
				, new String[] {"Etisalat","MTN"}, "24", "nonadult", "http://google.com"));
		campaignCreators.shutdown();
		campaignCreators.awaitTermination(2, TimeUnit.HOURS);
		driverPool.clear();
		try {
			driverPool.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
