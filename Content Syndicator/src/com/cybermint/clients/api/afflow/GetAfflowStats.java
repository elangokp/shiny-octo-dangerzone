package com.cybermint.clients.api.afflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.cybermint.utils.TextFileWriterUtils;

public class GetAfflowStats implements Runnable {

	private String fast = null;
	private String vertical = null;
	private String order = null;
	private String direction = null;
	private String keyword = null;
	private String dateRange = null;
	private int hourRestriction = 0;
	private List<String> stats = null;
	
	public GetAfflowStats(String fast, String vertical, String order, String direction, String keyword, String dateRange, int hourRestriction, List<String> stats) {
		this.fast = fast;
		this.vertical = vertical;
		this.order = order;
		this.direction = direction;
		this.keyword = keyword;
		this.dateRange = dateRange;
		this.hourRestriction = hourRestriction;
		this.stats = stats;
	}

	public void run() {
		AfflowClient anAfflowClient =  new AfflowClient();
		stats.addAll(anAfflowClient.getStats(fast,vertical,order,direction,keyword,dateRange,hourRestriction));
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService reporters = Executors.newFixedThreadPool(10);
		ArrayList<String> stats = new ArrayList<String>();
		stats.add("Duration,Vertical,Cohort,Geo,Carrier,Clicks,Leads,Revenue,EPC,EPM");
		ArrayList<String> verticals = new ArrayList<String>(Arrays.asList("dlpinsubmits","directlink","desktop","raffle","casino","adultcontent","apps","appsdl"));
		
		for(String vertical : verticals) {
			reporters.execute(new GetAfflowStats("0",vertical,"clicks","desc","carrier","today",1,stats));
			reporters.execute(new GetAfflowStats("0",vertical,"clicks","desc","carrier","today",2,stats));
			reporters.execute(new GetAfflowStats("0",vertical,"clicks","desc","carrier","today",3,stats));
			reporters.execute(new GetAfflowStats("1",vertical,"clicks","desc","carrier","yesterday",1,stats));
			reporters.execute(new GetAfflowStats("1",vertical,"clicks","desc","carrier","three",1,stats));
			reporters.execute(new GetAfflowStats("1",vertical,"clicks","desc","carrier","seven",1,stats));
			reporters.execute(new GetAfflowStats("1",vertical,"clicks","desc","carrier","fourteen",1,stats));
			reporters.execute(new GetAfflowStats("1",vertical,"clicks","desc","carrier","thirty",1,stats));
		}
		reporters.shutdown();
		reporters.awaitTermination(2, TimeUnit.HOURS);		
		TextFileWriterUtils.writeListAsLines(stats, "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Afflow/stats1.csv", true);

	}

}
