package com.cybermint.clients.api.voluum;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.cybermint.clients.api.voluum.objects.VoluumCampaign;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class VoluumClient {

	public VoluumClient() {
		// TODO Auto-generated constructor stub
	}
	
	public static final MediaType JSON	= MediaType.parse("application/json; charset=utf-8");
	public static final MediaType FORM	= MediaType.parse("application/x-www-form-urlencoded");
	
	private static String accessToken = "";
	private static Date accessTokenExpirationDate = Calendar.getInstance().getTime();
	
	private static final String username = "elango.k.p@gmail.com";
	private static final String password = "123voluum!@#";
	
	private static final String zeroParkTrafficSourceId = "31919d3b-2fbd-45d7-b19d-8d4751be355d";
	private static final String adultContentFlowId = "d61c087c-f7d7-4b81-9b89-cd694d35ff48";
	private static final String appsFlowId = "70683020-2bda-4a1d-b56b-e9b8ac6bcab9";
	private static final String appsAggresiveFlowId = "abbe8fb7-999f-40e7-88ca-82097c82bccb";
	private static final String appsdlFlowId = "d6ecf934-6c63-4aef-84b1-b00ede5c020e";
	private static final String casinoFlowId = "9674b58d-bb8b-4cee-8700-e62ddd3e00d0";
	private static final String desktopFlowId = "36f02851-1b6c-4280-b332-680ecf800eee";
	private static final String desktopaggressiveFlowId = "e838cf5c-1de1-41ba-93c7-c3f0e8ccac10";
	private static final String directlinkFlowId = "2f4f27d6-0dd8-404d-a1d2-df708f56ae19";
	private static final String dlpinsubmitsFlowId = "58c9e033-7be7-4298-b931-c88b91b0515f";
	private static final String globalFlowId = "24843c02-cb7c-46ba-a482-ee96f4bab921";
	private static final String mobilecontentFlowId = "cd4d156b-fed1-4f7e-846b-e78580a3c39a";
	private static final String raffleFlowId = "64752855-c661-4ad0-9f10-cdb10e2e4ed5";
	
	private String getAccessToken() {
		try {
			if(accessToken.length() == 0 || Calendar.getInstance().after(accessTokenExpirationDate)) {
				URL url = new URL("https://api.voluum.com/auth/session");
				String requestBodyString = "{\"email\":\""+username+"\",\"password\":\""+password+"\"}";
				OkHttpClient client = new OkHttpClient();
				RequestBody body = RequestBody.create(JSON, requestBodyString);
				Request request = new Request.Builder()
				      .url(url)
				      .post(body)
				      .addHeader("Accept", "application/json")
				      .build();
				Response response = client.newCall(request).execute();
				String responseJson = response.body().string();
				ObjectMapper mapper = new ObjectMapper();
				JsonNode node = mapper.readTree(responseJson);
				System.out.println(responseJson);
				accessToken = node.get("token").asText();
				System.out.println(accessToken);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSXXX");
			    Date expiresDate = dateFormat.parse(node.get("expirationTimestamp").asText());
			    System.out.println(expiresDate);
				accessTokenExpirationDate = expiresDate;
				//System.out.println(accessTokenExpirationDate);
			} else {
				//System.out.println("Token Present Already");
				//System.out.println(accessToken);
				//System.out.println(accessTokenExpirationDate);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accessToken;
	}
	
	public void getCampaigns(String id) {
		try {
			URL url = new URL("https://api.voluum.com/campaign" + (null == id ? "" : "/"+id));
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
				      .url(url)
				      .addHeader("Accept", "application/json")
				      .addHeader("cwauth-token", getAccessToken())
				      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			System.out.println(responseJson);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createCampaign(String namePostfix, String postbackUrl, String pixelUrl
			, String pixelRedirectUrl, String costModelType, int costModelValue
			, String revenueModelType, int revenueModelValue, String code
			, String trafficSourceId, String flowId) throws Exception, JsonMappingException, IOException {
		
		VoluumCampaign aVoluumCampaign = new VoluumCampaign();
		aVoluumCampaign.setNamePostfix(namePostfix);
		aVoluumCampaign.setPostbackUrl(postbackUrl);
		aVoluumCampaign.setPixelUrl(pixelUrl);
		aVoluumCampaign.setPixelRedirectUrl(pixelRedirectUrl);
		aVoluumCampaign.setCostModel(costModelType, costModelValue);
		aVoluumCampaign.setRevenueModel(revenueModelType, revenueModelValue);
		aVoluumCampaign.setCountry(code);
		aVoluumCampaign.setTrafficSource(trafficSourceId);
		aVoluumCampaign.setRedirectTarget(flowId);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(aVoluumCampaign));
		
	}

	public static void main(String[] args) throws JsonMappingException, IOException, Exception {
		VoluumClient aVoluumClient = new VoluumClient();
		//aVoluumClient.getCampaigns("a31b7c2e-20a2-4e18-b37e-a5996d3e7887");
		aVoluumClient.createCampaign("Afflow - A1 NET - Directlink - Popup", "", "", "", "AUTO", 0
				, "RPA_AUTO", 0, "AT", VoluumClient.zeroParkTrafficSourceId
				,VoluumClient.directlinkFlowId);
	}

}
