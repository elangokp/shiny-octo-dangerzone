package com.cybermint.clients.api.revcontent;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.bouncycastle.util.encoders.Base64;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import com.cybermint.clients.api.revcontent.objects.Boost;
import com.cybermint.clients.api.revcontent.objects.Content;
import com.cybermint.clients.api.revcontent.objects.ContentStat;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RevContentClient {

	public static final MediaType JSON	= MediaType.parse("application/json; charset=utf-8");
	public static final MediaType FORM	= MediaType.parse("application/x-www-form-urlencoded");
	
	private static final String clientId = "elangokp";
	private static final String clientSecret = "a79a13875f39f160732be983df4a6c2a9804a1ef";
	
	private static RevContentClient instance = null;
	
	private static String accessToken = "";
	private static Date accessTokenExpirationDate = Calendar.getInstance().getTime();
	
	private RevContentClient() {
		
	}
	
	private void getAccessToken() throws IOException {
		if(accessToken.length() == 0 || Calendar.getInstance().after(accessTokenExpirationDate)) {
			URL url = new URL("https://api.revcontent.io/oauth/token");
			String requestBodyString = "grant_type=client_credentials&client_id="+clientId+"&client_secret="+clientSecret;
			OkHttpClient client = new OkHttpClient();
			RequestBody body = RequestBody.create(FORM, requestBodyString);
			  Request request = new Request.Builder()
			      .url(url)
			      .post(body)
			      .addHeader("Cache-Control", "no-cache")
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			System.out.println(responseJson);
			accessToken = node.get("token_type").asText() + " " + node.get("access_token").asText();
			//System.out.println(accessToken);
			int expireSeconds = Integer.parseInt(node.get("expires_in").asText());
			Calendar expiresCalendar = Calendar.getInstance();
			expiresCalendar.add(Calendar.SECOND, expireSeconds);
			accessTokenExpirationDate = expiresCalendar.getTime();
			//System.out.println(accessTokenExpirationDate);
		} else {
			//System.out.println("Token Present Already");
			//System.out.println(accessToken);
			//System.out.println(accessTokenExpirationDate);
		}
		
	}
	
	public String getTopVCPM(String widgetID, String country, String device, String subDevice, String language) throws IOException {
		if(null == widgetID || widgetID.length() == 0) {
			return null;
		} else {
			this.getAccessToken();
			String URLAsString = "https://api.revcontent.io/stats/api/v1.0/boosts/widgets/"+widgetID+"/cpvs";
			String queryString = "";
			
			if(null != country && country.length() > 0) {
				queryString = queryString+"country="+country;
			}
			
			if(null != device && device.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"device="+device;
			}
			
			if(null != subDevice && subDevice.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"sub_device="+subDevice;
			}
			
			if(null != language && language.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"language="+language;
			}
			
			if(queryString.length() > 0) {
				URLAsString = URLAsString + "?" + queryString;
			}
			//System.out.println(URLAsString);
			String bid = widgetID+","
					+country+","
					+device+","
					+subDevice+","
					+language+",";
			try {
				URL url = new URL(URLAsString);
				OkHttpClient client = new OkHttpClient();
				Request request = new Request.Builder()
				      .url(url)
				      .addHeader("Cache-Control", "no-cache")
				      .addHeader("Content-Type", "application/json")
				      .addHeader("Authorization", accessToken)
				      .build();
				Response response = client.newCall(request).execute();
				String responseJson = response.body().string();
				//System.out.println(responseJson);
				ObjectMapper mapper = new ObjectMapper();
				JsonNode node = mapper.readTree(responseJson);
				bid = bid+Double.parseDouble(node.get("data").get(0).asText())+","+Double.parseDouble(node.get("data").get(1).asText());
			} catch (Exception e) {
				bid = bid+"Error,Error";
			}
			System.out.println(bid);
		}
		return null;
		
	}
	
	public List<Boost> getBoosts(String targetingType, String status, String enabled, String dateFrom, String dateTo, String limit, String offset, String aggregate) throws IOException {
		List<Boost> boosts = new ArrayList<Boost>();
		this.getAccessToken();
		String URLAsString = "https://api.revcontent.io/stats/api/v1.0/boosts";
		String queryString = "";
		
		if(null != targetingType && targetingType.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"targeting_type="+targetingType;
		}
		
		if(null != status && status.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"status="+status;
		}
		
		if(null != enabled && enabled.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"enabled="+enabled;
		}
		
		if(null != dateFrom && dateFrom.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"date_from="+dateFrom;
		}
		
		if(null != dateTo && dateTo.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"date_to="+dateTo;
		}
		
		if(null != limit && limit.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"limit="+limit;
		}
		
		if(null != offset && offset.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"offset="+offset;
		}
		
		if(null != aggregate && aggregate.length() > 0) {
			if(queryString.length() > 0) {
				queryString = queryString+"&";
			}
			queryString = queryString+"aggregate="+aggregate;
		}
		
		if(queryString.length() > 0) {
			URLAsString = URLAsString + "?" + queryString;
		}
		
		System.out.println(URLAsString);
		URL url = new URL(URLAsString);
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
		      .url(url)
		      .addHeader("Cache-Control", "no-cache")
		      .addHeader("Content-Type", "application/json")
		      .addHeader("Authorization", accessToken)
		      .build();
		Response response = client.newCall(request).execute();
		String responseJson = response.body().string();
		//System.out.println(responseJson);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(responseJson);
		Iterator<JsonNode> boostsIterator = node.get("data").iterator();
		while(boostsIterator.hasNext()) {
			JsonNode aBoostNode = boostsIterator.next();
			Boost aBoost = new Boost(aBoostNode.get("id").textValue(),aBoostNode.get("name").textValue());
			boosts.add(aBoost);
			System.out.println(aBoostNode.get("id") + "," + aBoostNode.get("name"));
		}
		return boosts;
	}
	
	public List<Content> getBoostContent(String boostId, String adminStatus, String enabled, String dateFrom, String dateTo, Integer limit, Integer offset) throws IOException {
		List<Content> contents = new ArrayList<Content>();
		int statCount = offset == null ? 0 : offset;
		if(null == boostId || boostId.length() == 0) {
			//return null;
		} else {
			this.getAccessToken();
			String URLAsString = "https://api.revcontent.io/stats/api/v1.0/boosts/"+boostId+"/content";
			String queryString = "";
			
			if(null != adminStatus && adminStatus.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"admin_status="+adminStatus;
			}
			
			if(null != enabled && enabled.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"enabled="+enabled;
			}
			
			if(null != dateFrom && dateFrom.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"date_from="+dateFrom;
			}
			
			if(null != dateTo && dateTo.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"date_to="+dateTo;
			}
			
			if(null != limit) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"limit="+limit;
			}
			
			if(null != offset) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"date_to="+offset;
			}
			
			if(queryString.length() > 0) {
				URLAsString = URLAsString + "?" + queryString;
			}
			
			System.out.println(URLAsString);
			URL url = new URL(URLAsString);
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
			      .url(url)
			      .addHeader("Cache-Control", "no-cache")
			      .addHeader("Content-Type", "application/json")
			      .addHeader("Authorization", accessToken)
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			//System.out.println(responseJson);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			Iterator<JsonNode> contentsIterator = node.get("data").iterator();
			while(contentsIterator.hasNext()) {
				JsonNode aContentNode = contentsIterator.next();
				Content aContent = new Content(aContentNode.get("content_id").textValue()
						,aContentNode.get("headline").textValue()
						,aContentNode.get("target_url").textValue()
						,aContentNode.get("image_url").textValue()
						,aContentNode.get("brand_name").textValue());
				contents.add(aContent);
				System.out.println(aContentNode.get("content_id") 
						+ "," + aContentNode.get("headline")
						+ "," + aContentNode.get("target_url")
						+ "," + aContentNode.get("impressions")
						+ "," + aContentNode.get("clicks")
						+ "," + aContentNode.get("cost"));
				statCount++;
			}
		}
		
		if(null == limit) {
			limit = 100;
		}
		
		if(null == offset) {
			offset = 0;
		}
		
		if((statCount - offset) >= limit) {
			contents.addAll(this.getBoostContent(boostId, adminStatus, enabled, dateFrom, dateTo, null, statCount));
		}
		
		return contents;
		
	}
	
	public List<ContentStat> getContentWidgetStats(String contentId, String date, Integer limit, Integer offset) throws IOException {
		List<ContentStat> contentStats = new ArrayList<ContentStat>();
		int statCount = offset == null ? 0 : offset;
		if(null == contentId || contentId.length() == 0) {
			//return null;
		} else {
			this.getAccessToken();
			String URLAsString = "https://api.revcontent.io/stats/api/v1.0/contents/"+contentId+"/widgets/stats";
			String queryString = "";
			
			if(null != date && date.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"date="+date;
			}
			
			if(null != limit) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"limit="+limit;
			}
			
			if(null != offset) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"offset="+offset;
			}
			
			if(queryString.length() > 0) {
				URLAsString = URLAsString + "?" + queryString;
			}
			
			//System.out.println(URLAsString);
			URL url = new URL(URLAsString);
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
			      .url(url)
			      .addHeader("Cache-Control", "no-cache")
			      .addHeader("Content-Type", "application/json")
			      .addHeader("Authorization", accessToken)
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			//System.out.println(responseJson);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			Iterator<JsonNode> contentWidgetStats = node.get("data").iterator();
			while(contentWidgetStats.hasNext()) {
				JsonNode widgetStat = contentWidgetStats.next();
				ContentStat aContentStat = new ContentStat(contentId, date
						,widgetStat.get("widget_id").textValue()
						,widgetStat.get("impressions").asInt()
						,widgetStat.get("clicks").asInt()
						,widgetStat.get("ctr").asDouble()
						,widgetStat.get("avg_cpc").asDouble()
						,widgetStat.get("spend").asDouble());
				contentStats.add(aContentStat);
				String widgetStatString = contentId + "," + date + ",";
				widgetStatString = widgetStatString 
						+ widgetStat.get("widget_id") + "," 
						+ widgetStat.get("impressions") + "," 
						+ widgetStat.get("clicks") + ","
						+ widgetStat.get("ctr") + ","
						+ widgetStat.get("avg_cpc") + ","
						+ widgetStat.get("spend") + ","
						+ widgetStat.get("conversion") + ","
						+ widgetStat.get("profit");
				System.out.println(widgetStatString);
				statCount++;
			}
		}
		
		if(null == limit) {
			limit = 100;
		}
		
		if(null == offset) {
			offset = 0;
		}
		
		if((statCount - offset) >= limit) {
			contentStats.addAll(this.getContentWidgetStats(contentId, date, null, statCount));
		}
		
		return contentStats;
	}
	
	public void getBoostWidgetStats(String boostId, String widgetId, String dateFrom, String dateTo, Integer limit, Integer offset) throws IOException {
		int statCount = offset == null ? 0 : offset;
		if(null == boostId || boostId.length() == 0) {
			//return null;
		} else {
			this.getAccessToken();
			String URLAsString = "https://api.revcontent.io/stats/api/v1.0/boosts/"+boostId+"/widgets/stats";
			String queryString = "";
			
			if(null != widgetId && widgetId.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"widget_id="+widgetId;
			}
			
			if(null != dateFrom && dateFrom.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"date_from="+dateFrom;
			}
			
			if(null != dateTo && dateTo.length() > 0) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"date_to="+dateTo;
			}
			
			if(null != limit) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"limit="+limit;
			}
			
			if(null != offset) {
				if(queryString.length() > 0) {
					queryString = queryString+"&";
				}
				queryString = queryString+"offset="+offset;
			}
			
			if(queryString.length() > 0) {
				URLAsString = URLAsString + "?" + queryString;
			}
			
			//System.out.println(URLAsString);
			URL url = new URL(URLAsString);
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
			      .url(url)
			      .addHeader("Cache-Control", "no-cache")
			      .addHeader("Content-Type", "application/json")
			      .addHeader("Authorization", accessToken)
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			//System.out.println(responseJson);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			Iterator<JsonNode> contentWidgetStats = node.get("data").iterator();
			while(contentWidgetStats.hasNext()) {
				JsonNode widgetStat = contentWidgetStats.next();
				String widgetStatString = boostId + "," + dateFrom + "," + dateTo + ",";
				widgetStatString = widgetStatString 
						+ widgetStat.get("id") + "," 
						+ widgetStat.get("impressions") + "," 
						+ widgetStat.get("clicks") + ","
						+ widgetStat.get("ctr") + ","
						+ widgetStat.get("avg_cpc") + ","
						+ widgetStat.get("avg_cpv") + ","
						+ widgetStat.get("spend") + ","
						+ widgetStat.get("conversion") + ","
						+ widgetStat.get("profit");
				System.out.println(widgetStatString);
				statCount++;
			}
		}
		
		if(null == limit) {
			limit = 100;
		}
		
		if(null == offset) {
			offset = 0;
		}
		
		if((statCount - offset) >= limit) {
			this.getBoostWidgetStats(boostId, widgetId, dateFrom, dateTo, null, statCount);
		}
	}
	
	public void getBoostStatsByContentByWidget(String boostId, String boostName, String dateFrom, String dateTo) throws IOException {
		Boost aBoost = new Boost(boostId, boostName);
		List<Content> contents = this.getBoostContent(boostId, null, null, null, null, null, null);
		LocalDate startDate = LocalDate.parse(dateFrom);
		LocalDate endDate = LocalDate.parse(dateTo);
		for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
			for(Content aContent : contents) {
				aContent.getContentStats().addAll(this.getContentWidgetStats(aContent.getID(), date.toString(), null, null));
			}
		}
		
		aBoost.setContents(contents);
		aBoost.printStats("C:/Users/elangokp.AHC.000/Google Drive/Campaigns/Shepherds Diet/Stats/stats.csv");
	}
	
	public static void main(String[] args) throws IOException {
		//RevContentClient rcc = new RevContentClient();
		//rcc.getBoostStatsByContentByWidget("212931", "TSD-D-US-FUI", "2017-01-22", "2017-01-29");
		String consumerKey = "xdXLRO42VZr1kRJBczoLdIY_cMUa";
		String consumerSecret = "f3E9gLsOGUbY5_eJrRFlnitL4MQa";
		String base64Encoded = new String(Base64.encode(new String(consumerKey+":"+consumerSecret).getBytes()));
		System.out.println(base64Encoded);
		URL url = new URL("http://biccapi:8281/token");
		String requestBodyString = "grant_type=client_credentials";
		OkHttpClient client = new OkHttpClient();
		RequestBody body = RequestBody.create(FORM, requestBodyString);
		  Request request = new Request.Builder()
		      .url(url)
		      .post(body)
		      .addHeader("Cache-Control", "no-cache")
		      .addHeader("Authorization", "Basic "+base64Encoded)
		      .addHeader("Content-Type", "application/json")
		      .build();
		Response response = client.newCall(request).execute();
		String responseJson = response.body().string();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(responseJson);
		System.out.println(responseJson);
		System.out.println(response.toString());
		accessToken = node.get("token_type").asText() + " " + node.get("access_token").asText();
		//System.out.println(accessToken);
		int expireSeconds = Integer.parseInt(node.get("expires_in").asText());
		Calendar expiresCalendar = Calendar.getInstance();
		expiresCalendar.add(Calendar.SECOND, expireSeconds);
		accessTokenExpirationDate = expiresCalendar.getTime();
		//System.out.println(accessTokenExpirationDate);

		/*
		LocalDate startDate = LocalDate.parse("2017-01-23");
		LocalDate endDate = LocalDate.parse("2017-01-23");
		for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1))
		{
			rcc.getBoostWidgetStats("212931", null, date.toString(), date.toString(), null, null);
		}
		*/
		/*
		LocalDate startDate = LocalDate.parse("2017-01-23");
		LocalDate endDate = LocalDate.parse("2017-01-25");
		for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1))
		{
			//rcc.getBoostWidgetStats("210934", null, date.toString(), date.toString(), null, null);
			rcc.getContentWidgetStats("1612906", date.toString(), null, null);
		}
		*/
		/*
		LocalDate startDate = LocalDate.parse("2017-01-23");
		LocalDate endDate = LocalDate.parse("2017-01-25");
		for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1))
		{
			rcc.getBoostWidgetStats("210934", null, date.toString(), date.toString(), null, null);
			//rcc.getBoostContent("212931", "", "", "", "", null, null);
		}
		*/
		/*
		Integer widgetId = 2407;
		while(widgetId<60000) {
			rcc.getTopVCPM(widgetId.toString(),"AU","tablet","ios","English");
			widgetId++;
		}
		*/
		/*
		rcc.getTopVCPM("31553","US","desktop","","English");
		rcc.getTopVCPM("31553","US","tablet","ios","English");
		rcc.getTopVCPM("31553","US","tablet","android","English");
		
		rcc.getTopVCPM("17177","US","desktop","","English");
		rcc.getTopVCPM("17177","US","tablet","ios","English");
		rcc.getTopVCPM("17177","US","tablet","android","English");
		*/
		
		//rcc.getBoosts("", "", "", "", "", "", "", "");
		//rcc.getBoostContent("207630", "", "", "", "", "", "");
		//rcc.getContentWidgetStats("1568769", "2017-01-13", "", "", "", "");
		//rcc.getTopVCPM("55670","AU","tablet","ios","English");
		//rcc.getTopVCPM("55670","US","tablet","ios","English");
		/*rcc.getTopVCPM("36232","AU","tablet","ios","English");
		
		rcc.getTopVCPM("36232","US","tablet","ios","English");
		rcc.getTopVCPM("36232","GB","tablet","ios","English");
		rcc.getTopVCPM("36232","AU","tablet","ios","English");
		rcc.getTopVCPM("36232","US","desktop","","English");
		rcc.getTopVCPM("36232","GB","desktop","","English");
		rcc.getTopVCPM("36232","AU","desktop","","English");*/
		
		/*rcc.getTopVCPM("36232","US","tablet","android","English");
		rcc.getTopVCPM("36232","US","desktop","ios","English");
		rcc.getTopVCPM("36232","US","desktop","android","English");
		rcc.getTopVCPM("36232","US","desktop","windows","English");*/
		
		/*rcc.getTopVCPM("1","","","","");
		rcc.getTopVCPM("22","","","","");
		rcc.getTopVCPM("36232","AU","tablet","ios","English");
		rcc.getTopVCPM("55032","AU","tablet","ios","English");
		rcc.getTopVCPM("5596","AU","tablet","ios","English");
		rcc.getTopVCPM("30752","AU","tablet","ios","English");
		rcc.getTopVCPM("31734","AU","tablet","ios","English");
		rcc.getTopVCPM("12242","AU","tablet","ios","English");
		rcc.getTopVCPM("40356","AU","tablet","ios","English");
		*/
	}

}
