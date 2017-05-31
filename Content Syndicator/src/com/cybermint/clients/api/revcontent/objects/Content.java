package com.cybermint.clients.api.revcontent.objects;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Content {

	private String ID;
	
	private String headline;
	
	private String targetURL;
	
	private String titleIdentifier;
	
	private String imageIdentifier;
	
	private String imageURL;
	
	private String brandName;
	
	private List<ContentStat> contentStats = new ArrayList<ContentStat>();
	
	public Content(String ID, String headline, String targetURL, String imageURL, String brandName) {
		this.ID = ID;
		this.headline = headline;
		this.targetURL = targetURL.replaceAll("&amp;", "&");
		this.imageURL = imageURL;
		this.brandName = brandName;
		try {			
			Map<String, List<String>> queryPairs = splitQuery(new URL(URLDecoder.decode(this.targetURL, "UTF-8")));
			this.titleIdentifier = queryPairs.get("utm_ad_title").get(0);
			this.imageIdentifier = queryPairs.get("utm_ad_img").get(0);
		} catch (UnsupportedEncodingException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public void addContentStat(ContentStat aContentStat) {
		contentStats.add(aContentStat);
	}

	public List<ContentStat> getContentStats() {
		return contentStats;
	}

	public void setContentStats(List<ContentStat> contentStats) {
		this.contentStats = contentStats;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getTargetURL() {
		return targetURL;
	}

	public void setTargetURL(String targetURL) {
		this.targetURL = targetURL;
		try {
			Map<String, List<String>> queryPairs = splitQuery(new URL(URLDecoder.decode(this.targetURL, "UTF-8")));
			this.titleIdentifier = queryPairs.get("utm_ad_title").get(0);
			this.imageIdentifier = queryPairs.get("utm_ad_img").get(0);
		} catch (UnsupportedEncodingException | MalformedURLException e) {
			e.printStackTrace();
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

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getTitleIdentifier() {
		return titleIdentifier;
	}
	public String getImageIdentifier() {
		return imageIdentifier;
	}
	
	
}
