package com.cybermint.contentSyndicator.sites.yahoogemini.objects;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class AdStat {

	@CsvBindByName(column="Advertiser ID", required=false)
	private String advertiserID;
	
	@CsvBindByName(column="Day", required=false)
	@CsvDate(value="yyyy-MM-dd")
	private Date day;
	
	@CsvBindByName(column="Advertiser Name", required=false)
	private String advertiserName;
	
	@CsvBindByName(column="Advertiser Timezone", required=false)
	private String advertiserTimezone;
	
	@CsvBindByName(column="Advertiser Currency", required=false)
	private String advertiserCurrency;
	
	@CsvBindByName(column="Campaign ID", required=false)
	private String campaignID;
	
	@CsvBindByName(column="Campaign Name", required=false)
	private String campaignName;
	
	@CsvBindByName(column="Campaign Start Date", required=false)
	private String campaignStartDate;
	
	@CsvBindByName(column="Campaign End Date", required=false)
	private String campaignEndDate;
	
	@CsvBindByName(column="Campaign Status", required=false)
	private String campaignStatus;
	
	@CsvBindByName(column="Campaign Objective", required=false)
	private String campaignObjective;
	
	@CsvBindByName(column="Budget", required=false)
	private Double budget;
	
	@CsvBindByName(column="Budget Type", required=false)
	private String budgetType;
	
	@CsvBindByName(column="Ad Group ID", required=false)
	private String adGroupID;
	
	@CsvBindByName(column="Ad Group Name", required=false)
	private String adGroupName;
	
	@CsvBindByName(column="Ad Group Status", required=false)
	private String adGroupStatus;
	
	@CsvBindByName(column="Ad ID", required=false)
	private String adID;
	
	@CsvBindByName(column="Ad Title", required=false)
	private String adTitle;
	
	@CsvBindByName(column="Ad Description", required=false)
	private String adDescription;
	
	@CsvBindByName(column="Ad Status", required=false)
	private String adStatus;
	
	@CsvBindByName(column="Ad Format", required=false)
	private String adFormat;
	
	@CsvBindByName(column="Ad SponsoredBy", required=false)
	private String adSponsoredBy;
	
	@CsvBindByName(column="Ad Image URL", required=false)
	private String adImageURL;
	
	@CsvBindByName(column="Ad Landing URL", required=false)
	private String adLandingURL;
	
	@CsvBindByName(column="Ad Display URL", required=false)
	private String adDisplayURL;
	
	@CsvBindByName(column="Impressions", required=false)
	private Double impressions;
	
	@CsvBindByName(column="Clicks", required=false)
	private Double clicks;
	
	@CsvBindByName(column="CTR", required=false)
	private Double CTR;
	
	@CsvBindByName(column="Conversions", required=false)
	private Double conversions;
	
	@CsvBindByName(column="Spend", required=false)
	private Double spend;
	
	@CsvBindByName(column="Average CPC", required=false)
	private Double averageCPC;
	
	@CsvBindByName(column="Average CPI", required=false)
	private Double averageCPI;
	
	@CsvBindByName(column="Average CPM", required=false)
	private Double averageCPM;
	
	@CsvBindByName(column="Pricing Type", required=false)
	private String pricingType;
	
	@CsvBindByName(column="Source", required=false)
	private String source;
	
	@CsvBindByName(column="Average Position", required=false)
	private Double averagePosition;
	
	@CsvBindByName(column="Max Bid", required=false)
	private String maxBid;

	private String supplyGrouping;
	private String adTitleCode;
	private String adImageCode;
	private String adImageType;
	private String adAccountCode;
	private String gender;
	private String age;
	private String location;
	
	public AdStat() {
			
	}
	
	public static PreparedStatement getPreparedStatement(Connection connection) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into GeminiCampaignStats (");
		sql.append("AdvertiserID,StatDate,AdvertiserName,AdvertiserTimeZone,AdvertiserCurrency,");
		sql.append("CampaignID,CampaignName,CampaignStartDate,CampaignEndDate,CampaignStatus,CampaignObjective,CampaignBudget,CampaignBudgetType,CampaignPricingType,");
		sql.append("AdGroupId,AdGroupName,AdGroupStatus,AdId,AdTitle,AdDescription,AdStatus,AdFormat,AdSponsoredBy,AdImageURL,");
		sql.append("AdLandingURL,AdDisplayURL,AdSupplyGrouping,AdTitleCode,AdImageCode,AdImageType,AdAccountCode,Gender,Age,Location,");
		sql.append("Impressions,Clicks,CTR,Conversions,Spend,CPC,CPI,CPM,Source,AdPosition,MaxBid");
		sql.append(") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		PreparedStatement ps = connection.prepareStatement(sql.toString());
		return ps;
	}
	public PreparedStatement setPreparedStatementValues(PreparedStatement ps) throws SQLException {
		ps.setString(1, this.advertiserID);
		ps.setDate(2, new java.sql.Date(this.day.getTime()));
		ps.setString(3, this.advertiserName);
		ps.setString(4, this.advertiserTimezone);
		ps.setString(5, this.advertiserCurrency);
		ps.setString(6, this.campaignID);
		ps.setString(7, this.campaignName);
		ps.setString(8, this.campaignStartDate);
		ps.setString(9, this.campaignEndDate);
		ps.setString(10, this.campaignStatus);
		ps.setString(11, this.campaignObjective);
		ps.setDouble(12, this.budget);
		ps.setString(13, this.budgetType);
		ps.setString(14, this.pricingType);
		ps.setString(15, this.adGroupID);
		ps.setString(16, this.adGroupName);
		ps.setString(17, this.adGroupStatus);
		ps.setString(18, this.adID);
		ps.setString(19, this.adTitle);
		ps.setString(20, this.adDescription);
		ps.setString(21, this.adStatus);
		ps.setString(22, this.adFormat);
		ps.setString(23, this.adSponsoredBy);
		ps.setString(24, this.adImageURL);
		ps.setString(25, this.adLandingURL);
		ps.setString(26, this.adDisplayURL);
		ps.setString(27, this.supplyGrouping);
		ps.setString(28, this.adTitleCode);
		ps.setString(29, this.adImageCode);
		ps.setString(30, this.adImageType);
		ps.setString(31, this.adAccountCode);
		ps.setString(32, this.gender);
		ps.setString(33, this.age);
		ps.setString(34, this.location);
		ps.setDouble(35, this.impressions);
		ps.setDouble(36, this.clicks);
		ps.setDouble(37, this.CTR);
		ps.setDouble(38, this.conversions);
		ps.setDouble(39, this.spend);
		ps.setDouble(40, this.averageCPC==null?0:this.averageCPC);
		ps.setDouble(41, this.averageCPI==null?0:this.averageCPI);
		ps.setDouble(42, this.averageCPM==null?0:this.averageCPM);
		ps.setString(43, this.source);
		ps.setDouble(44, this.averagePosition);
		ps.setString(45, this.maxBid);
		return ps;
	}

	public String getAdvertiserID() {
		return advertiserID;
	}

	public void setAdvertiserID(String advertiserID) {
		this.advertiserID = advertiserID;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getAdvertiserName() {
		return advertiserName;
	}

	public void setAdvertiserName(String advertiserName) {
		this.advertiserName = advertiserName;
	}

	public String getAdvertiserTimezone() {
		return advertiserTimezone;
	}

	public void setAdvertiserTimezone(String advertiserTimezone) {
		this.advertiserTimezone = advertiserTimezone;
	}

	public String getAdvertiserCurrency() {
		return advertiserCurrency;
	}

	public void setAdvertiserCurrency(String advertiserCurrency) {
		this.advertiserCurrency = advertiserCurrency;
	}

	public String getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(String campaignID) {
		this.campaignID = campaignID;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(String campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public String getCampaignEndDate() {
		return campaignEndDate;
	}

	public void setCampaignEndDate(String campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
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

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public String getBudgetType() {
		return budgetType;
	}

	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public String getAdGroupID() {
		return adGroupID;
	}

	public void setAdGroupID(String adGroupID) {
		this.adGroupID = adGroupID;
	}

	public String getAdGroupName() {
		return adGroupName;
	}

	public void setAdGroupName(String adGroupName) {
		this.adGroupName = adGroupName;
	}

	public String getAdGroupStatus() {
		return adGroupStatus;
	}

	public void setAdGroupStatus(String adGroupStatus) {
		this.adGroupStatus = adGroupStatus;
	}

	public String getAdID() {
		return adID;
	}

	public void setAdID(String adID) {
		this.adID = adID;
	}

	public String getAdTitle() {
		return adTitle;
	}

	public void setAdTitle(String adTitle) {
		this.adTitle = adTitle;
	}

	public String getAdDescription() {
		return adDescription;
	}

	public void setAdDescription(String adDescription) {
		this.adDescription = adDescription;
	}

	public String getAdStatus() {
		return adStatus;
	}

	public void setAdStatus(String adStatus) {
		this.adStatus = adStatus;
	}

	public String getAdFormat() {
		return adFormat;
	}

	public void setAdFormat(String adFormat) {
		this.adFormat = adFormat;
	}

	public String getAdSponsoredBy() {
		return adSponsoredBy;
	}

	public void setAdSponsoredBy(String adSponsoredBy) {
		this.adSponsoredBy = adSponsoredBy;
	}

	public String getAdImageURL() {
		return adImageURL;
	}

	public void setAdImageURL(String adImageURL) {
		this.adImageURL = adImageURL;
	}

	public String getAdLandingURL() {
		return adLandingURL;
	}

	public void setAdLandingURL(String adLandingURL) {
		this.adLandingURL = adLandingURL;
		try {
			URL landingURL = new URL(adLandingURL);
			Map<String, List<String>> params = AdStat.splitQuery(landingURL);
			this.processInterestString(params.get("int").get(0));
			this.setAdTitleCode(params.get("t").get(0));
			this.setAdImageCode(params.get("i").get(0));
			this.setAdAccountCode(params.get("a").get(0));
			this.setGender(params.get("g").get(0));
			this.setAge(params.get("age").get(0));
			if(params.containsKey("st")) {
				this.setLocation(params.get("st").get(0));
			}
			if(params.containsKey("bm")) {
				this.setSupplyGrouping(params.get("bm").get(0));
			}
			if(params.containsKey("it")) {
				this.setAdImageType(params.get("it").get(0));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	private void processInterestString(String intParamValue) {
		String[] values = intParamValue.split("-");
		if(values.length > 2) {			
			this.setSupplyGrouping(values[0]);
			this.setLocation(values[1]);
			this.setAdImageType(values[2]);
		} else if(values.length > 1) {
			this.setSupplyGrouping(values[0]);
			this.setAdImageType(values[1]);
		} else {
			this.setSupplyGrouping(values[0]);
		}
	}
	
	private static Map<String, List<String>> splitQuery(URL url) throws UnsupportedEncodingException {
		  final Map<String, List<String>> query_pairs = new LinkedHashMap<String, List<String>>();
		  final String[] pairs = url.getQuery().split("&");
		  for (String pair : pairs) {
		    final int idx = pair.indexOf("=");
		    final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
		    if (!query_pairs.containsKey(key)) {
		      query_pairs.put(key, new LinkedList<String>());
		    }
		    final String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;
		    query_pairs.get(key).add(value);
		  }
		  return query_pairs;
		}

	public String getAdDisplayURL() {
		return adDisplayURL;
	}

	public void setAdDisplayURL(String adDisplayURL) {
		this.adDisplayURL = adDisplayURL;
	}

	public Double getImpressions() {
		return impressions;
	}

	public void setImpressions(Double impressions) {
		this.impressions = impressions;
	}

	public Double getClicks() {
		return clicks;
	}

	public void setClicks(Double clicks) {
		this.clicks = clicks;
	}

	public Double getCTR() {
		return CTR;
	}

	public void setCTR(Double cTR) {
		CTR = cTR;
	}

	public Double getConversions() {
		return conversions;
	}

	public void setConversions(Double conversions) {
		this.conversions = conversions;
	}

	public Double getSpend() {
		return spend;
	}

	public void setSpend(Double spend) {
		this.spend = spend;
	}

	public Double getAverageCPC() {
		return averageCPC;
	}

	public void setAverageCPC(Double averageCPC) {
		this.averageCPC = averageCPC;
	}

	public Double getAverageCPI() {
		return averageCPI;
	}

	public void setAverageCPI(Double averageCPI) {
		this.averageCPI = averageCPI;
	}

	public Double getAverageCPM() {
		return averageCPM;
	}

	public void setAverageCPM(Double averageCPM) {
		this.averageCPM = averageCPM;
	}

	public String getPricingType() {
		return pricingType;
	}

	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Double getAveragePosition() {
		return averagePosition;
	}

	public void setAveragePosition(Double averagePosition) {
		this.averagePosition = averagePosition;
	}

	public String getMaxBid() {
		return maxBid;
	}

	public void setMaxBid(String maxBid) {
		this.maxBid = maxBid;
	}

	public String getSupplyGrouping() {
		return supplyGrouping;
	}

	public void setSupplyGrouping(String supplyGrouping) {
		this.supplyGrouping = supplyGrouping;
	}

	public String getAdTitleCode() {
		return adTitleCode;
	}

	public void setAdTitleCode(String adTitleCode) {
		this.adTitleCode = adTitleCode;
	}

	public String getAdImageCode() {
		return adImageCode;
	}

	public void setAdImageCode(String adImageCode) {
		this.adImageCode = adImageCode;
	}

	public String getAdAccountCode() {
		return adAccountCode;
	}

	public void setAdAccountCode(String adAccountCode) {
		this.adAccountCode = adAccountCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdImageType() {
		return adImageType;
	}

	public void setAdImageType(String adImageType) {
		this.adImageType = adImageType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
