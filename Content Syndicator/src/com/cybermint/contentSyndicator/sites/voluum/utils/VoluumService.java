package com.cybermint.contentSyndicator.sites.voluum.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.cybermint.contentSyndicator.sites.voluum.objects.CampaignStats;
import com.cybermint.utils.TextFileWriterUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class VoluumService {
	
	private OkHttpClient client;
	private String token;
	private static VoluumService instanceHolder;

	private VoluumService() {
		client = new OkHttpClient();
	}
	
	public static VoluumService getInstance() {
		if(null == instanceHolder) {
			instanceHolder = new VoluumService();
		}
		return instanceHolder;
	}
	
	public boolean getAuthenticationToken(String username, String password) {
		boolean success = false;
		try {
			String toEncode = username+":"+password;
			String base64String = Base64.getMimeEncoder().encodeToString(toEncode.getBytes("utf-8"));
			String url = "https://security.voluum.com/login";
			Request authRequest = new Request.Builder()
				      .url(url)
				      .addHeader("Authorization", "Basic "+base64String)
				      .build();
			Response authResponse = client.newCall(authRequest).execute();
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNode = mapper.readValue(authResponse.body().string(), JsonNode.class);
			token = rootNode.path("token").textValue();
			success = true;
		} catch (Exception e) {
			success = false;
			//e.printStackTrace();
		}
		return success;
	}
	
	public List<CampaignStats> getHourlyStatsThisDay(LocalDateTime givenDate) {
		List<CampaignStats> stats =  new ArrayList<CampaignStats>();
		try {
			LocalDateTime start = givenDate;
			LocalDateTime end = start.plusDays(1);

			LocalDateTime loopDate = start;
			
			do {
				System.out.println(loopDate + " " + loopDate.plusHours(1));	
				String fromDate = loopDate + ":00Z";
				String toDate = loopDate.plusHours(1) + ":00Z";
				String url = "https://reports.voluum.com/report?"
						+"from="+fromDate
						+"&to="+toDate
						+"&tz=America%2FLos_Angeles&sort=visits&direction=desc"
						+"&columns=landerName&columns=visits&columns=clicks&columns=conversions&columns=revenue"
						+"&columns=cost&columns=profit&columns=cpv&columns=ctr&columns=cr&columns=cv&columns=roi"
						+"&columns=epv&columns=epc&columns=ap&columns=errors"
						+"&groupBy=custom-variable-7"
						+"&groupBy=custom-variable-8"
						+"&groupBy=device"
						+"&offset=0&limit=10000&include=active"
						+"&filter1=campaign&filter1Value=059bd362-2f14-4995-b31d-33757fc08a39"
						+"&filter2=custom-variable-4&filter2Value=n";
						//+"&filter3=custom-variable-8&filter3Value=doper1983-Edward";
				Request reportRequest = new Request.Builder()
					      .url(url)
					      .addHeader("cwauth-token", token)
					      .build();
				Response reportResponse = client.newCall(reportRequest).execute();
				String response = reportResponse.body().string();
				//System.out.println(response);
				ObjectMapper mapper = new ObjectMapper();
				JsonNode rootNode = mapper.readValue(response, JsonNode.class);
				for (JsonNode node : rootNode.path("rows")) {
				    CampaignStats aCampaignStats = new CampaignStats();
				    aCampaignStats.setDateTime(loopDate);
				    aCampaignStats.setAccount(node.path("customVariable8").textValue());
				    aCampaignStats.setCampaign(node.path("customVariable7").textValue());
				    aCampaignStats.setDevice(node.path("device").textValue());
				    aCampaignStats.setVisits(node.path("visits").asInt());
				    aCampaignStats.setClicks(node.path("clicks").asInt());
				    aCampaignStats.setConversions(node.path("conversions").asInt());
				    aCampaignStats.setCost(aCampaignStats.getVisits()*0.05);
				    aCampaignStats.setRevenue(node.path("revenue").asDouble());
				    aCampaignStats.setProfit(aCampaignStats.getRevenue() - aCampaignStats.getCost());
				    stats.add(aCampaignStats);
				  }
				loopDate = loopDate.plusHours(1);				
			} while(loopDate.isBefore(end));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stats;
	}
	
	public List<CampaignStats> getStatsForThisPeriod(LocalDateTime fromDate, LocalDateTime toDate) {
		List<CampaignStats> stats =  new ArrayList<CampaignStats>();
		LocalDateTime loopDate = fromDate;
		
		do {
			//System.out.println(loopDate + " " + loopDate.plusDays(1));				
			stats.addAll(this.getHourlyStatsThisDay(loopDate));
			loopDate = loopDate.plusDays(1);
		} while(loopDate.isBefore(toDate));
		return stats;
	}
	
	public List<CampaignStats> getStatsForToday() {
		LocalDateTime today = LocalDate.now(ZoneId.of("PST", ZoneId.SHORT_IDS)).atTime(LocalTime.MIN);
		return this.getHourlyStatsThisDay(today);
	}

	public static void main(String[] args) throws Exception {
		
		VoluumService aVoluumService =  VoluumService.getInstance();
		if(aVoluumService.getAuthenticationToken("elango.k.p@gmail.com", "123voluum!@#")) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			LocalDateTime start = LocalDateTime.parse("2017-03-01 00:00", formatter);
			LocalDateTime end = LocalDateTime.parse("2017-03-31 00:00", formatter);
			//List<CampaignStats> stats = aVoluumService.getHourlyStatsThisDay(start);
			//List<CampaignStats> stats = aVoluumService.getStatsForToday();
			List<CampaignStats> stats = aVoluumService.getStatsForThisPeriod(start, end);
			TextFileWriterUtils.saveObjectsAsCSVToFile(stats, "C:/Users/elangokp.AHC.000/Google Drive/Programs/test.csv");
			
		}

	}

}
