package com.cybermint.contentSyndicator.sites.yahoogemini.objects;

public class Campaign {
	
	public final static String minorOutlier = "Minor Outlier";
	
	public final static String majorOutlier = "Major Outlier";
	
	public final static String notAnOutlier = "Not an Outlier";
	
	public final static String today = "today";
	
	public final static String yesterday = "yesterday";
	
	public final static String oneMonth = "oneMonth";
	
	public final static String oneWeek = "oneWeek";
	
	public final static String shouldBePaused = "Should be Paused";
	
	public final static String shouldNotBePaused = "Should not be Paused";
	
	public final static String overLimit = "Over Limit";
	
	public final static String withinLimit = "Within Limit";
	
	private String groupName;
	
	private String campaignName;
	
	private String budget;
	
	private String campaignStatus;
	
	private String campaignObjective;
	
	private Double clicks;
	
	private Double impressions;
	
	private Double ctr;
	
	private Double spend;
	
	private Double avgCPC;
	
	private Double avgCPA;
	
	private int conversions;
	
	private String campaignId;
	
	private String campaignRandomPrefix;
	
	private String campaignAccountName;
	
	private String campaignSubAccountID;
	
	private String campaignOfferDomain;
	
	private String campaignAdName;
	
	private String campaignAdImageName;
	
	private String campaignGender;
	
	private String campaignAge;
	
	private String impressionOutlierType;
	
	private String ctrOutlierType;
	
	private String ctrLimitType;
	
	private String statsDuration;
	
	private String statsDurationDates;
	
	private String pauseDecision;
	
	private boolean shouldPause;
	
	private Double impressionPercentageOfMean;
	
	
	public Campaign() {
		impressionOutlierType = Campaign.notAnOutlier;
		ctrOutlierType = Campaign.notAnOutlier;
	}
	
	public static String titleString() {
		return "campaignId,groupName,campaignName,budget,campaignStatus,campaignObjective,clicks"
				+ ",impressions,ctr,spend,conversions,campaignRandomPrefix,campaignAccountName,campaignSubAccountID"
				+ ",campaignOfferDomain,campaignAdName,campaignAdImageName,campaignGender"
				+ ",campaignAge,impressionOutlierType,ctrOutlierType,ctrLimitType,impressionPercentageOfMean"
				+ ",statsDuration,statsDurationDates,pauseDecision";
	}
	
	public String toString() {
		return campaignId + "," + groupName + "," + campaignName + "," + budget + "," + campaignStatus + "," + campaignObjective + "," + clicks
				+ "," + impressions + "," + ctr + "," + spend + "," + conversions + "," + campaignRandomPrefix + "," + campaignAccountName
				 + "," + campaignSubAccountID + "," + campaignOfferDomain + "," + campaignAdName + "," + campaignAdImageName + "," + campaignGender
				+ "," + campaignAge+ "," + impressionOutlierType+ "," + ctrOutlierType+ "," + ctrLimitType+ "," + impressionPercentageOfMean
				+ "," + statsDuration + "," + statsDurationDates+ "," + pauseDecision;
	}
	
	public void makePauseDecision() {
		if((this.getClicks()>2 && this.getCtr()>0.75)) {
			this.ctrLimitType = Campaign.overLimit;
		} else {
			this.ctrLimitType = Campaign.withinLimit;
		}
		if((this.getImpressionOutlierType().equalsIgnoreCase(Campaign.majorOutlier) && this.impressions > 200)
				|| this.ctrLimitType == Campaign.overLimit) {
			this.shouldPause = true;
			this.pauseDecision = Campaign.shouldBePaused;
		} else {
			this.shouldPause = false;
			this.pauseDecision = Campaign.shouldNotBePaused;
		}
	}
	
	public boolean shouldPauseThisCampaign() {
		if(this.shouldPause == true && this.campaignStatus.contains("Active")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean shouldActivateThisCampaign() {
		if(this.shouldPause == false && this.campaignStatus.contains("Pause") && this.getImpressions()<10) {
			return true;
		} else {
			return false;
		}
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
		String[] nameSplit = this.campaignName.split("_");
		if(nameSplit.length>3) {
			this.groupName = nameSplit[4];
		} else {
			this.groupName = "G00";
		}
		/*this.campaignRandomPrefix = nameSplit[0];
		this.campaignAccountName = nameSplit[1];
		this.campaignOfferDomain = nameSplit[2];
		this.campaignAdName = nameSplit[3];
		this.campaignAdImageName = nameSplit[4];
		this.campaignGender = nameSplit[5];
		this.campaignAge = nameSplit[6];*/
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


	public Double getAvgCPC() {
		return avgCPC;
	}

	public void setAvgCPC(Double avgCPC) {
		this.avgCPC = avgCPC;
	}

	public Double getAvgCPA() {
		return avgCPA;
	}

	public void setAvgCPA(Double avgCPA) {
		this.avgCPA = avgCPA;
	}

	public int getConversions() {
		return conversions;
	}


	public void setConversions(int conversions) {
		this.conversions = conversions;
	}


	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignRandomPrefix() {
		return campaignRandomPrefix;
	}


	public String getCampaignAccountName() {
		return campaignAccountName;
	}


	public void setCampaignAccountName(String campaignAccountName) {
		this.campaignAccountName = campaignAccountName;
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

	public String getPauseDecision() {
		return pauseDecision;
	}

	public void setPauseDecision(String pauseDecision) {
		this.pauseDecision = pauseDecision;
	}

	public String getStatsDurationDates() {
		return statsDurationDates;
	}

	public void setStatsDurationDates(String statsDurationDates) {
		this.statsDurationDates = statsDurationDates;
	}

	public Double getImpressionPercentageOfMean() {
		return impressionPercentageOfMean;
	}

	public void setImpressionPercentageOfMean(Double impressionPercentageOfMean) {
		this.impressionPercentageOfMean = impressionPercentageOfMean;
	}

	public String getCampaignSubAccountID() {
		return campaignSubAccountID;
	}

	public void setCampaignSubAccountID(String campaignSubAccountID) {
		this.campaignSubAccountID = campaignSubAccountID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
