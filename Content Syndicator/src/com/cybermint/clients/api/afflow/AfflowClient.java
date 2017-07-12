package com.cybermint.clients.api.afflow;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import com.cybermint.utils.TextFileWriterUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AfflowClient {

	public AfflowClient() {
		// TODO Auto-generated constructor stub
	}
	
	public static final MediaType JSON	= MediaType.parse("application/json; charset=utf-8");
	public static final MediaType FORM	= MediaType.parse("application/x-www-form-urlencoded");
	
	private static String accessToken = "";
	
	public static final String email = "elango.k.p@gmail.com";
	public static final String password = "123mon!@#";
	
	private void getAccessToken() {
		
		accessToken = "9f2bb004f43ee41ead2f400f131c91498e6bbf5b"; //token doesnt seem to change at all
		/* Uncomment this when token really changes
		try {
			if(accessToken.length() == 0) {
				URL url = new URL("https://api.afflow.rocks/auth.php");
				String requestBodyString = "email="+email+"&pass="+password;
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
				accessToken = node.get("api_key").asText();
				System.out.println(accessToken);
			} else {
				//System.out.println("Token Present Already");
				//System.out.println(accessToken);
				//System.out.println(accessTokenExpirationDate);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
	
	public Long getTimeStamp(String dateString) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(dateString);			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date.getTime();
	}
	
	public Long getTimeStampInSeconds(int CalendarField, int amount, String timeZone) {
		Calendar aCal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
		aCal.add(CalendarField, amount);
		return (long) Math.round(aCal.getTimeInMillis()/1000);
	}
	
	public ArrayList<String> getStats(String fast, String vertical, String order, String direction, String keyword, String dateRange, int hourRestriction) {
		ArrayList<String> stats = new ArrayList<String>();
		this.getAccessToken();
		StringBuilder URLAsString = new StringBuilder();
		URLAsString.append("https://api.afflow.rocks/data/partner-splitter-report.php");
		URLAsString.append("?");
		URLAsString.append("fast=").append(fast);
		URLAsString.append("&vertical=").append(vertical);
		URLAsString.append("&order=").append(order);
		URLAsString.append("&direction=").append(direction);
		URLAsString.append("&keyword=").append(keyword);
		URLAsString.append("&date_range=").append(dateRange);
		//URLAsString.append("&start_ts=").append(this.getTimeStamp(Calendar.HOUR, -9));
		//URLAsString.append("&end_ts=").append(this.getTimeStamp(Calendar.MINUTE, 0));
		String tz = null;
		if(dateRange.equalsIgnoreCase("today")) {
			tz = this.getTimeZoneForTheHour(hourRestriction);
		} else {
			tz = this.getTimeZoneForTheHour(1);
		}
		URLAsString.append("&tz=").append(tz);	
		System.out.println(URLAsString);
		try {
			URL url = new URL(URLAsString.toString());
			OkHttpClient client = new OkHttpClient().newBuilder()
					.readTimeout(600, TimeUnit.SECONDS)
					.connectTimeout(15, TimeUnit.SECONDS)
					.build();
			Request request = new Request.Builder()
			      .url(url)
			      .addHeader("X_AFFLOW_API_TOKEN", accessToken)
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			System.out.println(responseJson);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			Iterator<JsonNode> elementIterator = node.elements();
			while(elementIterator.hasNext()) {
				JsonNode anElement = elementIterator.next();
				StringBuilder output = new StringBuilder();
				output.append(dateRange.equalsIgnoreCase("today") ? "Last "+hourRestriction+" hour" : dateRange).append(",");
				output.append(vertical).append(",");
				output.append(anElement.get("keyword")).append(",");
				output.append(anElement.get("keyword").asText().substring(0,2)).append(",");
				output.append(anElement.get("keyword").asText().substring(3)).append(",");
				output.append(anElement.get("clicks")).append(",");
				output.append(anElement.get("leads")).append(",");
				output.append(anElement.get("revenue")).append(",");
				output.append((anElement.get("epc").asDouble()*1000)/1000).append(",");
				output.append(anElement.get("epc").asDouble()*1000);
				//System.out.println(output);
				stats.add(output.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stats;
	}
	
	
	public ArrayList<String> getCampaignStats(String nid, String campaignName, String order, String direction, String keyword, int hourDuration, String timeZone) {
		ArrayList<String> stats = new ArrayList<String>();
		this.getAccessToken();
		StringBuilder URLAsString = new StringBuilder();
		URLAsString.append("https://api.afflow.rocks/data/report.php");
		URLAsString.append("?");
		URLAsString.append("nid=").append(nid);
		URLAsString.append("&rcid=").append(campaignName);
		URLAsString.append("&order=").append(order);
		URLAsString.append("&direction=").append(direction);
		URLAsString.append("&keyword=").append(keyword);
		URLAsString.append("&start_ts=").append(this.getTimeStampInSeconds(Calendar.HOUR, -1 * hourDuration, timeZone));
		URLAsString.append("&end_ts=").append(this.getTimeStampInSeconds(Calendar.MINUTE, 0, timeZone));
		URLAsString.append("&tz=").append(timeZone);	
		System.out.println(URLAsString);
		try {
			URL url = new URL(URLAsString.toString());
			OkHttpClient client = new OkHttpClient().newBuilder()
					.readTimeout(600, TimeUnit.SECONDS)
					.connectTimeout(15, TimeUnit.SECONDS)
					.build();
			Request request = new Request.Builder()
			      .url(url)
			      .addHeader("X_AFFLOW_API_TOKEN", accessToken)
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			System.out.println(responseJson);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			Iterator<JsonNode> elementIterator = node.elements();
			while(elementIterator.hasNext()) {
				JsonNode anElement = elementIterator.next();
				StringBuilder output = new StringBuilder();
				output.append(hourDuration).append(",");
				output.append(campaignName).append(",");
				output.append(anElement.get("keyword")).append(",");
				output.append(anElement.get("clicks")).append(",");
				output.append(anElement.get("filtered_clicks")).append(",");
				output.append(anElement.get("offer_clicks")).append(",");
				output.append(anElement.get("bot_clicks")).append(",");
				output.append(anElement.get("leads")).append(",");			
				output.append(anElement.get("revenue")).append(",");
				output.append(anElement.get("ctr")).append(",");
				output.append(anElement.get("ltc")).append(",");
				output.append(anElement.get("cr")).append(",");
				output.append(anElement.get("epc").asDouble()).append(",");
				output.append(anElement.get("epc").asDouble()*1000);
				//System.out.println(output);
				stats.add(output.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stats;
	}
	
	public void getRegions(String type, String timescale) {
		this.getAccessToken();
		StringBuilder URLAsString = new StringBuilder();
		URLAsString.append("https://api.afflow.rocks/data/partner-rid-report.php");
		URLAsString.append("?");
		URLAsString.append("type=").append(type);
		URLAsString.append("&timescale=").append(timescale);	
		System.out.println(URLAsString);
		try {
			URL url = new URL(URLAsString.toString());
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
			      .url(url)
			      .addHeader("X_AFFLOW_API_TOKEN", accessToken)
			      .build();
			Response response = client.newCall(request).execute();
			String responseJson = response.body().string();
			System.out.println(responseJson);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(responseJson);
			Iterator<JsonNode> elementIterator = node.elements();
			int i = 0;
			while(elementIterator.hasNext()) {
				JsonNode anElement = elementIterator.next();
				StringBuilder output = new StringBuilder();
				//output.append(anElement.get("keyword")).append(",");
				//output.append(anElement.get("clicks")).append(",");
				//output.append(anElement.get("leads")).append(",");
				//output.append(anElement.get("revenue")).append(",");
				//output.append(anElement.get("epc")).append(",");
				//System.out.println(anElement.toString());
				i++;
			}
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public String getTimeZoneForTheHour(int hour) {
		ArrayList<String> validTimeZones = new ArrayList<String>(Arrays.asList("Africa/Abidjan","Africa/Accra","Africa/Addis_Ababa","Africa/Algiers","Africa/Asmara","Africa/Bamako","Africa/Bangui","Africa/Banjul","Africa/Bissau","Africa/Blantyre","Africa/Brazzaville","Africa/Bujumbura","Africa/Cairo","Africa/Casablanca","Africa/Ceuta","Africa/Conakry","Africa/Dakar","Africa/Dar_es_Salaam","Africa/Djibouti","Africa/Douala","Africa/El_Aaiun","Africa/Freetown","Africa/Gaborone","Africa/Harare","Africa/Johannesburg","Africa/Juba","Africa/Kampala","Africa/Khartoum","Africa/Kigali","Africa/Kinshasa","Africa/Lagos","Africa/Libreville","Africa/Lome","Africa/Luanda","Africa/Lubumbashi","Africa/Lusaka","Africa/Malabo","Africa/Maputo","Africa/Maseru","Africa/Mbabane","Africa/Mogadishu","Africa/Monrovia","Africa/Nairobi","Africa/Ndjamena","Africa/Niamey","Africa/Nouakchott","Africa/Ouagadougou","Africa/Porto-Novo","Africa/Sao_Tome","Africa/Tripoli","Africa/Tunis","Africa/Windhoek","America/Adak","America/Anchorage","America/Anguilla","America/Antigua","America/Araguaina","America/Argentina/Buenos_Aires","America/Argentina/Catamarca","America/Argentina/Cordoba","America/Argentina/Jujuy","America/Argentina/La_Rioja","America/Argentina/Mendoza","America/Argentina/Rio_Gallegos","America/Argentina/Salta","America/Argentina/San_Juan","America/Argentina/San_Luis","America/Argentina/Tucuman","America/Argentina/Ushuaia","America/Aruba","America/Asuncion","America/Atikokan","America/Bahia","America/Bahia_Banderas","America/Barbados","America/Belem","America/Belize","America/Blanc-Sablon","America/Boa_Vista","America/Bogota","America/Boise","America/Cambridge_Bay","America/Campo_Grande","America/Cancun","America/Caracas","America/Cayenne","America/Cayman","America/Chicago","America/Chihuahua","America/Costa_Rica","America/Creston","America/Cuiaba","America/Curacao","America/Danmarkshavn","America/Dawson","America/Dawson_Creek","America/Denver","America/Detroit","America/Dominica","America/Edmonton","America/Eirunepe","America/El_Salvador","America/Fortaleza","America/Glace_Bay","America/Godthab","America/Goose_Bay","America/Grand_Turk","America/Grenada","America/Guadeloupe","America/Guatemala","America/Guayaquil","America/Guyana","America/Halifax","America/Havana","America/Hermosillo","America/Indiana/Indianapolis","America/Indiana/Knox","America/Indiana/Marengo","America/Indiana/Petersburg","America/Indiana/Tell_City","America/Indiana/Vevay","America/Indiana/Vincennes","America/Indiana/Winamac","America/Inuvik","America/Iqaluit","America/Jamaica","America/Juneau","America/Kentucky/Louisville","America/Kentucky/Monticello","America/Kralendijk","America/La_Paz","America/Lima","America/Los_Angeles","America/Lower_Princes","America/Maceio","America/Managua","America/Manaus","America/Marigot","America/Martinique","America/Matamoros","America/Mazatlan","America/Menominee","America/Merida","America/Metlakatla","America/Mexico_City","America/Miquelon","America/Moncton","America/Monterrey","America/Montevideo","America/Montserrat","America/Nassau","America/New_York","America/Nipigon","America/Nome","America/Noronha","America/North_Dakota/Beulah","America/North_Dakota/Center","America/North_Dakota/New_Salem","America/Ojinaga","America/Panama","America/Pangnirtung","America/Paramaribo","America/Phoenix","America/Port-au-Prince","America/Port_of_Spain","America/Porto_Velho","America/Puerto_Rico","America/Rainy_River","America/Rankin_Inlet","America/Recife","America/Regina","America/Resolute","America/Rio_Branco","America/Santa_Isabel","America/Santarem","America/Santiago","America/Santo_Domingo","America/Sao_Paulo","America/Scoresbysund","America/Sitka","America/St_Barthelemy","America/St_Johns","America/St_Kitts","America/St_Lucia","America/St_Thomas","America/St_Vincent","America/Swift_Current","America/Tegucigalpa","America/Thule","America/Thunder_Bay","America/Tijuana","America/Toronto","America/Tortola","America/Vancouver","America/Whitehorse","America/Winnipeg","America/Yakutat","America/Yellowknife","Antarctica/Casey","Antarctica/Davis","Antarctica/DumontDUrville","Antarctica/Macquarie","Antarctica/Mawson","Antarctica/McMurdo","Antarctica/Palmer","Antarctica/Rothera","Antarctica/Syowa","Antarctica/Vostok","Arctic/Longyearbyen","Asia/Aden","Asia/Almaty","Asia/Amman","Asia/Anadyr","Asia/Aqtau","Asia/Aqtobe","Asia/Ashgabat","Asia/Baghdad","Asia/Bahrain","Asia/Baku","Asia/Bangkok","Asia/Beirut","Asia/Bishkek","Asia/Brunei","Asia/Choibalsan","Asia/Chongqing","Asia/Colombo","Asia/Damascus","Asia/Dhaka","Asia/Dili","Asia/Dubai","Asia/Dushanbe","Asia/Gaza","Asia/Harbin","Asia/Hebron","Asia/Ho_Chi_Minh","Asia/Hong_Kong","Asia/Hovd","Asia/Irkutsk","Asia/Jakarta","Asia/Jayapura","Asia/Jerusalem","Asia/Kabul","Asia/Kamchatka","Asia/Karachi","Asia/Kashgar","Asia/Kathmandu","Asia/Khandyga","Asia/Kolkata","Asia/Krasnoyarsk","Asia/Kuala_Lumpur","Asia/Kuching","Asia/Kuwait","Asia/Macau","Asia/Magadan","Asia/Makassar","Asia/Manila","Asia/Muscat","Asia/Nicosia","Asia/Novokuznetsk","Asia/Novosibirsk","Asia/Omsk","Asia/Oral","Asia/Phnom_Penh","Asia/Pontianak","Asia/Pyongyang","Asia/Qatar","Asia/Qyzylorda","Asia/Rangoon","Asia/Riyadh","Asia/Sakhalin","Asia/Samarkand","Asia/Seoul","Asia/Shanghai","Asia/Singapore","Asia/Taipei","Asia/Tashkent","Asia/Tbilisi","Asia/Tehran","Asia/Thimphu","Asia/Tokyo","Asia/Ulaanbaatar","Asia/Urumqi","Asia/Ust-Nera","Asia/Vientiane","Asia/Vladivostok","Asia/Yakutsk","Asia/Yekaterinburg","Asia/Yerevan","Atlantic/Azores","Atlantic/Bermuda","Atlantic/Canary","Atlantic/Cape_Verde","Atlantic/Faroe","Atlantic/Madeira","Atlantic/Reykjavik","Atlantic/South_Georgia","Atlantic/St_Helena","Atlantic/Stanley","Australia/Adelaide","Australia/Brisbane","Australia/Broken_Hill","Australia/Currie","Australia/Darwin","Australia/Eucla","Australia/Hobart","Australia/Lindeman","Australia/Lord_Howe","Australia/Melbourne","Australia/Perth","Australia/Sydney","Europe/Amsterdam","Europe/Andorra","Europe/Athens","Europe/Belgrade","Europe/Berlin","Europe/Bratislava","Europe/Brussels","Europe/Bucharest","Europe/Budapest","Europe/Busingen","Europe/Chisinau","Europe/Copenhagen","Europe/Dublin","Europe/Gibraltar","Europe/Guernsey","Europe/Helsinki","Europe/Isle_of_Man","Europe/Istanbul","Europe/Jersey","Europe/Kaliningrad","Europe/Kiev","Europe/Lisbon","Europe/Ljubljana","Europe/London","Europe/Luxembourg","Europe/Madrid","Europe/Malta","Europe/Mariehamn","Europe/Minsk","Europe/Monaco","Europe/Moscow","Europe/Oslo","Europe/Paris","Europe/Podgorica","Europe/Prague","Europe/Riga","Europe/Rome","Europe/Samara","Europe/San_Marino","Europe/Sarajevo","Europe/Simferopol","Europe/Skopje","Europe/Sofia","Europe/Stockholm","Europe/Tallinn","Europe/Tirane","Europe/Uzhgorod","Europe/Vaduz","Europe/Vatican","Europe/Vienna","Europe/Vilnius","Europe/Volgograd","Europe/Warsaw","Europe/Zagreb","Europe/Zaporozhye","Europe/Zurich","Indian/Antananarivo","Indian/Chagos","Indian/Christmas","Indian/Cocos","Indian/Comoro","Indian/Kerguelen","Indian/Mahe","Indian/Maldives","Indian/Mauritius","Indian/Mayotte","Indian/Reunion","Pacific/Apia","Pacific/Auckland","Pacific/Chatham","Pacific/Chuuk","Pacific/Easter","Pacific/Efate","Pacific/Enderbury","Pacific/Fakaofo","Pacific/Fiji","Pacific/Funafuti","Pacific/Galapagos","Pacific/Gambier","Pacific/Guadalcanal","Pacific/Guam","Pacific/Honolulu","Pacific/Johnston","Pacific/Kiritimati","Pacific/Kosrae","Pacific/Kwajalein","Pacific/Majuro","Pacific/Marquesas","Pacific/Midway","Pacific/Nauru","Pacific/Niue","Pacific/Norfolk","Pacific/Noumea","Pacific/Pago_Pago","Pacific/Palau","Pacific/Pitcairn","Pacific/Pohnpei","Pacific/Port_Moresby","Pacific/Rarotonga","Pacific/Saipan","Pacific/Tahiti","Pacific/Tarawa","Pacific/Tongatapu","Pacific/Wake","Pacific/Wallis"));
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			TimeZone tz = TimeZone.getTimeZone(id);
			SimpleDateFormat simpleDateFormat = 
				       new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy", Locale.US);
			simpleDateFormat.setTimeZone(tz);
			if(Calendar.getInstance(tz).get(Calendar.HOUR_OF_DAY) < hour && Calendar.getInstance(tz).get(Calendar.HOUR_OF_DAY) >= hour-1 && validTimeZones.contains(tz.getID())) {
				System.out.println(tz.getID()+", "+simpleDateFormat.format(Calendar.getInstance(tz).getTime()));
				return tz.getID();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		AfflowClient anAfflowClient =  new AfflowClient();
		anAfflowClient.getRegions("1", "336");
		/*
		ArrayList<String> stats = new ArrayList<String>();
		stats.add("Duration,campaignName,keyword,clicks,filtered_clicks,offer_clicks,bot_clicks,leads,revenue,ctr,ltc,cr,epc,epm");
		stats.addAll(anAfflowClient.getCampaignStats("7396", "AF_US_WIFI_ADL-o514a7a_POP_0eacbf90-3fcc-11e7-bc40-0e06c6fba698", "clicks", "desc", "sid", 1, "America/Los_Angeles"));
		TextFileWriterUtils.writeListAsLines(stats, "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Afflow/CampaignStats.csv", false);
		*/
		/*System.out.println(anAfflowClient.getTimeZoneForTheHour(1));
		System.out.println(anAfflowClient.getTimeZoneForTheHour(2));
		System.out.println(anAfflowClient.getTimeZoneForTheHour(3));
		
		
		stats.add("Duration,Vertical,Cohort,Geo,Carrier,Clicks,Leads,Revenue,EPC,EPM");
		ArrayList<String> verticals = new ArrayList<String>(Arrays.asList("dlpinsubmits","directlink","desktop","raffle","casino","adultcontent","apps","appsdl"));
		for(String vertical : verticals) {
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","today",1));
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","today",2));
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","today",3));
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","yesterday",1));
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","three",1));
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","seven",1));
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","fourteen",1));
			stats.addAll(anAfflowClient.getStats("0",vertical,"clicks","desc","carrier","thirty",1));
		}
		
		TextFileWriterUtils.writeListAsLines(stats, "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Afflow/stats2.csv", true);
		*/
		//anAfflowClient.getRegions("0","336");
	}

}
