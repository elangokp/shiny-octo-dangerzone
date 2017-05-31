package com.cybermint.clients.api.zeropark;

import java.net.URL;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ZeroparkClient {

	public ZeroparkClient() {
		// TODO Auto-generated constructor stub
	}
	
	public static final MediaType JSON	= MediaType.parse("application/json; charset=utf-8");
	public static final MediaType FORM	= MediaType.parse("application/x-www-form-urlencoded");
	
	private static String accessToken = "";
	
	private void getAccessToken() {		
		accessToken = "AAABXDkRon6jwuNkTNa2lFwRNn50Dhg72JWl2a5TuSmgcpgMNHFH/N8I3K1de78h8otNOCnxL1x4wbhcu31HpA=="; //token doesnt seem to change at all
	}
	
	private boolean doCampaignAction(String campaignId, String action) {
		this.getAccessToken();
		boolean success = false;
		StringBuilder URLAsString = new StringBuilder();
		URLAsString.append("https://panel.zeropark.com/api/campaign/")
					.append(campaignId).append("/").append(action);
		try {
			URL url = new URL(URLAsString.toString());
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
			      .url(url)
			      .post(RequestBody.create(null, new byte[0]))
			      .addHeader("api-token", accessToken)
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			System.out.println(responseJson);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			if(action.equalsIgnoreCase("pause") && node.get("state").asText().equalsIgnoreCase("paused")) {
				success = true;
			} else if(action.equalsIgnoreCase("resume") && node.get("state").asText().equalsIgnoreCase("active")) {
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}

	public static void main(String[] args) {
		ZeroparkClient anZeroparkClient = new ZeroparkClient();
		//System.out.println(anZeroparkClient.doCampaignAction("320141d0-3f56-11e7-a456-0eda985eb958","pause"));
		//System.out.println(anZeroparkClient.doCampaignAction("320141d0-3f56-11e7-a456-0eda985eb958","pause"));
		System.out.println(anZeroparkClient.doCampaignAction("320141d0-3f56-11e7-a456-0eda985eb958","resume"));
		//System.out.println(anZeroparkClient.doCampaignAction("320141d0-3f56-11e7-a456-0eda985eb958","resume"));

	}

}
