package com.cybermint.contentSyndicator.sites.yahoogemini.objects;

public class Campaign {
	
	public final static String minorOutlier = "Minor Outlier";
	
	public final static String majorOutlier = "Major Outlier";
	
	public final static String notAnOutlier = "Not an Outlier";
	
	public final static String today = "today";
	
	public final static String oneMonth = "oneMonth";
	
	public final static String oneWeek = "oneWeek";
	
	private String campaignName;
	
	private String budget;
	
	private String campaignStatus;
	
	private String campaignObjective;
	
	private Double clicks;
	
	private Double impressions;
	
	private Double ctr;
	
	private Double spend;
	
	private int conversions;
	
	private String campaignRandomPrefix;
	
	private String campaignAccountName;
	
	private String campaignOfferDomain;
	
	private String campaignAdName;
	
	private String campaignAdImageName;
	
	private String campaignGender;
	
	private String campaignAge;
	
	private String impressionOutlierType;
	
	private String ctrOutlierType;
	
	private String statsDuration;
	
	
	public Campaign() {
		impressionOutlierType = Campaign.notAnOutlier;
		ctrOutlierType = Campaign.notAnOutlier;
	}
	
	public static String titleString() {
		return "campaignName,budget,campaignStatus,campaignObjective,clicks"
				+ ",impressions,ctr,spend,conversions,campaignRandomPrefix,campaignAccountName"
				+ ",campaignOfferDomain,campaignAdName,campaignAdImageName,campaignGender"
				+ ",campaignAge,impressionOutlierType,ctrOutlierType,statsDuration";
	}
	
	public String toString() {
		return campaignName + "," + budget + "," + campaignStatus + "," + campaignObjective + "," + clicks
				+ "," + impressions + "," + ctr + "," + spend + "," + conversions + "," + campaignRandomPrefix + "," + campaignAccountName
				+ "," + campaignOfferDomain + "," + campaignAdName + "," + campaignAdImageName + "," + campaignGender
				+ "," + campaignAge+ "," + impressionOutlierType+ "," + ctrOutlierType+ "," + statsDuration;
	}
	
	public boolean shouldBePaused() {
		boolean shouldPause = false;
		if(this.getImpressionOutlierType().equalsIgnoreCase(Campaign.majorOutlier) && this.impressions > 200) {
			shouldPause = true;
		}
		return shouldPause;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
		String[] nameSplit = this.campaignName.split("_");
		this.campaignRandomPrefix = nameSplit[0];
		this.campaignAccountName = nameSplit[1];
		this.campaignOfferDomain = nameSplit[2];
		this.campaignAdName = nameSplit[3];
		this.campaignAdImageName = nameSplit[4];
		this.campaignGender = nameSplit[5];
		this.campaignAge = nameSplit[6];
	}


	public String getBudget() {
		return budget;
	}


	public void setBudget(String budget) {
		this.budget = budget;
	}


	public String getCampaignStatus() {
		return campaignStatus;
	}


	public void setCampaignStatus(String campaignStatus) {
		this.campaignStatus = campaignStatus;
	}


	public String getCampaignObjective() {
		return campaignObjective;
	}


	public void setCampaignObjective(String campaignObjective) {
		this.campaignObjective = campaignObjective;
	}


	public Double getClicks() {
		return clicks;
	}


	public void setClicks(Double clicks) {
		this.clicks = clicks;
	}


	public Double getImpressions() {
		return impressions;
	}


	public void setImpressions(Double impressions) {
		this.impressions = impressions;
	}


	public Double getCtr() {
		return ctr;
	}


	public void setCtr(Double ctr) {
		this.ctr = ctr;
	}


	public Double getSpend() {
		return spend;
	}


	public void setSpend(Double spend) {
		this.spend = spend;
	}


	public int getConversions() {
		return conversions;
	}


	public void setConversions(int conversions) {
		this.conversions = conversions;
	}


	public String getCampaignRandomPrefix() {
		return campaignRandomPrefix;
	}


	public String getCampaignAccountName() {
		return campaignAccountName;
	}


	public String getCampaignOfferDomain() {
		return campaignOfferDomain;
	}


	public String getCampaignAdName() {
		return campaignAdName;
	}


	public String getCampaignAdImageName() {
		return campaignAdImageName;
	}


	public String getCampaignGender() {
		return campaignGender;
	}


	public String getCampaignAge() {
		return campaignAge;
	}

	public String getImpressionOutlierType() {
		return impressionOutlierType;
	}

	public void setImpressionOutlierType(String impressionOutlierType) {
		this.impressionOutlierType = impressionOutlierType;
	}

	public String getCtrOutlierType() {
		return ctrOutlierType;
	}

	public void setCtrOutlierType(String ctrOutlierType) {
		this.ctrOutlierType = ctrOutlierType;
	}

	public String getStatsDuration() {
		return statsDuration;
	}

	public void setStatsDuration(String statsDuration) {
		this.statsDuration = statsDuration;
	}

}