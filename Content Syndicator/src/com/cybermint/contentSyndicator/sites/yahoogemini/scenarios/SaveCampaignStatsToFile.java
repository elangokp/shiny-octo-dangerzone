package com.cybermint.contentSyndicator.sites.yahoogemini.scenarios;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.contentSyndicator.sites.yahoogemini.utils.YahooGeminiUtils;

public class SaveCampaignStatsToFile implements Runnable{

	Future<List<Campaign>> campaigns;
	String fileURL;
	
	public SaveCampaignStatsToFile(Future<List<Campaign>> campaigns, String fileURL) {
		this.campaigns = campaigns;
		this.fileURL = fileURL;
	}

	@Override
	public void run() {
		try {
			YahooGeminiUtils anYahooGeminiUtils = new YahooGeminiUtils();
			List<Campaign> returnedCampaigns = campaigns.get();			
			if(returnedCampaigns.size()>0){
				System.out.println("this user saving started : " + returnedCampaigns.get(0).getCampaignAccountName() + "\n");
				anYahooGeminiUtils.saveCampaignsToFile(returnedCampaigns, fileURL);
			} else {
				System.out.println("this user has no campaigns \n");
			}
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
