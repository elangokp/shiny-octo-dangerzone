package com.cybermint.contentSyndicator.sites.voluum.objects;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.cybermint.utils.WritableAsCSV;

public class CampaignStats implements WritableAsCSV{
	
	private LocalDateTime dateTime;
	
	private LocalDate date;
		
	private int hour;
	
	private int month;
	
	private int year;
	
	private String weekday;
	
	private String account;
	
	private String campaign;
	
	private String device;
	
	private int visits;
	
	private int clicks;
	
	private int conversions;
	
	private double cost;
	
	private double revenue;
	
	private double profit;

	public CampaignStats() {
		
	}
	
	public String titleString() {
		return "dateTime,date,hour,month,year,weekday"
				+",account,campaign,device,visits,clicks"
				+",conversions,cost,revenue,profit";
	}
	
	public String toString() {
		return dateTime +","+ date +","+ hour +","+ month +","+ year +","+ weekday
				+","+ account +","+ campaign +","+ device +","+ visits +","+ clicks
				 +","+ conversions +","+ cost +","+ revenue +","+ profit;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
		this.date = dateTime.toLocalDate();
		this.hour = dateTime.getHour();
		this.month = dateTime.getMonthValue();
		this.year = dateTime.getYear();
		this.weekday = dateTime.getDayOfWeek().toString();
	}

	public LocalDate getDate() {
		return date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public int getClicks() {
		return clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	public int getConversions() {
		return conversions;
	}

	public void setConversions(int conversions) {
		this.conversions = conversions;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}
	
	

}
