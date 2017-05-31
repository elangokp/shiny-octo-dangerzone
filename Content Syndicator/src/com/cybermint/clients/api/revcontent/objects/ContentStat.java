package com.cybermint.clients.api.revcontent.objects;

public class ContentStat {

	private String ID;
	
	private String date;
	
	private String widgetID;
	
	private Integer impressions;
	
	private Integer clicks;
	
	private Double ctr;
	
	private Double cpc;
	
	private Double spend;
	
	public ContentStat(String ID, String date, String widgetID, Integer impressions, Integer clicks, Double ctr, Double cpc, Double spend) {
		this.ID = ID;
		this.date = date;
		this.widgetID = widgetID;
		this.impressions = impressions;
		this.clicks = clicks;
		this.ctr = ctr;
		this.cpc = cpc;
		this.spend = spend;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWidgetID() {
		return widgetID;
	}

	public void setWidgetID(String widgetID) {
		this.widgetID = widgetID;
	}

	public Integer getImpressions() {
		return impressions;
	}

	public void setImpressions(Integer impressions) {
		this.impressions = impressions;
	}

	public Integer getClicks() {
		return clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Double getCtr() {
		return ctr;
	}

	public void setCtr(Double ctr) {
		this.ctr = ctr;
	}

	public Double getCpc() {
		return cpc;
	}

	public void setCpc(Double cpc) {
		this.cpc = cpc;
	}

	public Double getSpend() {
		return spend;
	}

	public void setSpend(Double spend) {
		this.spend = spend;
	}
	
	
}
