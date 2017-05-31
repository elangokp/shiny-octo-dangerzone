package com.cybermint.contentSyndicator.sites.yahoogemini.utils;

import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class YahooGeminiUtils {

	public static final String CH_PASS_YET_TO_START = "CH_PASS_YET_TO_START";
	public static final String CH_PASS_INPROGRESS = "CH_PASS_INPROGRESS";
	public static final String CH_PASS_STARTING = "CH_PASS_STARTING";
	public static final String CH_PASS_SIGNED_IN = "CH_PASS_SIGNED_IN";
	public static final String CH_PASS_GOT_ACCOUNT_SECURITY_PAGE = "CH_PASS_GOT_ACCOUNT_SECURITY_PAGE";
	public static final String CH_PASS_UPDATED_RECOVERY_EMAIL = "CH_PASS_UPDATED_RECOVERY_EMAIL";
	public static final String CH_PASS_DELETED_RECOVERY_NUMBER = "CH_PASS_DELETED_RECOVERY_NUMBER";
	public static final String CH_PASS_CHANGED_PASSWORD = "CH_PASS_CHANGED_PASSWORD";
	public static final String CH_PASS_DONE = "CH_PASS_DONE";
	
	public static final String SU_ACCT_INPROGRESS = "SU_ACCT_INPROGRESS";
	public static final String SU_ACCT_STARTING = "SU_ACCT_STARTING";
	public static final String SU_ACCT_SIGNED_IN = "SU_ACCT_SIGNED_IN";
	public static final String SU_ACCT_SIGNED_UP = "SU_ACCT_SIGNED_UP";
	public static final String SU_ACCT_OPENED_BILLING = "SU_ACCT_OPENED_BILLING";
	public static final String SU_ACCT_BILLING_FAILURE = "SU_ACCT_BILLING_FAILURE";
	public static final String ACTIVE = "ACTIVE";
	
	public static final String UPL_CAMP_YET_TO_START = "UPL_CAMP_YET_TO_START";
	public static final String UPL_CAMP_INPROGRESS = "UPL_CAMP_INPROGRESS";
	public static final String UPL_CAMP_SUCCESS = "UPL_CAMP_SUCCESS";
	public static final String UPL_CAMP_FAILURE = "UPL_CAMP_FAILURE";
	
	public YahooGeminiUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public void setAccountUsername(List<Campaign> campaignList, String username) {
		for(Campaign aCampaign : campaignList) {
			aCampaign.setCampaignAccountName(username);
		}
	}
	
	public void setSubAccountID(List<Campaign> campaignList, String subAccountID) {
		for(Campaign aCampaign : campaignList) {
			aCampaign.setCampaignSubAccountID(subAccountID);
		}
	}
	
	public void saveCampaignsToFile(List<Campaign> campaignList, String givenFilePath) {
		if(!TextFileWriterUtils.doesFileExist(givenFilePath)) {
			TextFileWriterUtils.writeString(Campaign.titleString(), givenFilePath, true, false);
		}
		TextFileWriterUtils writer = new TextFileWriterUtils(givenFilePath);
		for(Campaign aCampaign : campaignList) {
			writer.writeContentToFile(aCampaign.toString());
		}
	}
	
	public void makePauseDecisionsforCampaigns(List<Campaign> campaignList) {
		NavigableMap<String,List<Campaign>> campaignsByGroup = new TreeMap<String,List<Campaign>>();
		if(campaignList.size() > 0) {
			for (Campaign aCampaign : campaignList) {
		        List<Campaign> aGroupCampaigns = campaignsByGroup.get(aCampaign.getGroupName());
		        if (aGroupCampaigns == null) {
		        	campaignsByGroup.put(aCampaign.getGroupName(), aGroupCampaigns = new ArrayList<Campaign>());
		        }
		        aGroupCampaigns.add(aCampaign);          
		    }
		}
		for(Entry<String, List<Campaign>> aGroupCampaignsEntry : campaignsByGroup.entrySet()) {
			List<Campaign> aGroupCampaigns = aGroupCampaignsEntry.getValue();
			if(aGroupCampaigns.size() > 0) {
				setImpressionOutlierCampaigns(aGroupCampaigns);
				setCtrOutlierCampaigns(aGroupCampaigns);
				//setImpressionPercentageFromMean(campaignList);
				for(Campaign aCampaign : aGroupCampaigns) {
					aCampaign.makePauseDecision();
				}
			}
		}
					
	}
	
	/*private void setImpressionPercentageFromMean(List<Campaign> campaignList) {
		Double mean = 0.00;
		Double totalImpressions = 0.00;
		Integer totalCampaigns = 0;
		for(Campaign aCampaign : campaignList) {
			if(!aCampaign.getImpressionOutlierType().equalsIgnoreCase(Campaign.majorOutlier) && aCampaign.getImpressions()>0) {
				totalImpressions = totalImpressions + aCampaign.getImpressions();
				totalCampaigns++;
			}			
		}
		
		if(totalCampaigns>0) {
			mean = totalImpressions/totalCampaigns;
		} else {
			mean = 0.00;
		}
		
		for(Campaign aCampaign : campaignList) {
			if(mean>0) {
				Double impressionPercentageOfMean = (aCampaign.getImpressions()/mean)*100;
				aCampaign.setImpressionPercentageOfMean(impressionPercentageOfMean);
			} else {
				aCampaign.setImpressionPercentageOfMean(0.00);
			}
		}
		
	}*/
	
	private void setImpressionOutlierCampaigns(List<Campaign> campaignList) {
		try {
			List<Double> impressionList = new ArrayList<Double>();
			for(Campaign aCampaign : campaignList) {
				if(aCampaign.getImpressions()>0) {
					impressionList.add(aCampaign.getImpressions());
				}			
			}
			Double[] impressionArray = impressionList.toArray(new Double[impressionList.size()]);
			if(impressionArray.length > 1) {
				//double median = getMedian(impressionArray);
				double firstQuartile = getFirstQuartile(impressionArray);
				double thirdQuartile = getThirdQuartile(impressionArray);
				double interQuartileRange = thirdQuartile - firstQuartile;
				double minorOutlierImpressions = interQuartileRange * 1.5;
				double majorOutlierImpressions = interQuartileRange * 3;
				for(Campaign aCampaign : campaignList) {
					if(aCampaign.getImpressions()>0) {
						if(aCampaign.getImpressions()>=thirdQuartile+majorOutlierImpressions) {
							aCampaign.setImpressionOutlierType(Campaign.majorOutlier);					
						} else if (aCampaign.getImpressions()>=thirdQuartile+minorOutlierImpressions) {
							aCampaign.setImpressionOutlierType(Campaign.minorOutlier);
						}
						
					}			
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setCtrOutlierCampaigns(List<Campaign> campaignList) {
		try {
			List<Double> ctrList = new ArrayList<Double>();
			for(Campaign aCampaign : campaignList) {
				if(aCampaign.getImpressions()>0) {
					ctrList.add(aCampaign.getCtr());
				}			
			}
			Double[] ctrArray = ctrList.toArray(new Double[ctrList.size()]);
			if(ctrArray.length > 1) {
				//double median = getMedian(impressionArray);
				double firstQuartile = getFirstQuartile(ctrArray);
				double thirdQuartile = getThirdQuartile(ctrArray);
				double interQuartileRange = thirdQuartile - firstQuartile;
				double minorOutlierCtr = interQuartileRange * 1.5;
				double majorOutlierCtr = interQuartileRange * 3;
				for(Campaign aCampaign : campaignList) {
					if(aCampaign.getImpressions()>0) {
						if(aCampaign.getCtr()>=thirdQuartile+majorOutlierCtr || aCampaign.getCtr()<=firstQuartile-majorOutlierCtr) {
							aCampaign.setCtrOutlierType(Campaign.majorOutlier);					
						} else if (aCampaign.getCtr()>=thirdQuartile+minorOutlierCtr || aCampaign.getCtr()<=firstQuartile-minorOutlierCtr) {
							aCampaign.setCtrOutlierType(Campaign.minorOutlier);
						}
						
					}			
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	private double getMedian(Double[] givenArray) {
		Arrays.sort(givenArray);
		double median;
		if (givenArray.length % 2 == 0) {
			median = ((double)givenArray[givenArray.length/2] + (double)givenArray[givenArray.length/2 - 1])/2;
			
		} else {
			median = (double) givenArray[givenArray.length/2];
		}
		return median;
	}
	
	private double getFirstQuartile(Double[] givenArray) {
		Arrays.sort(givenArray);
		double firstQuartile;
		if (givenArray.length % 2 == 0) {
			Double[] firstQuartileArray = Arrays.copyOfRange(givenArray, 0, givenArray.length/2 - 1);
			firstQuartile = getMedian(firstQuartileArray);			
		} else {
			Double[] firstQuartileArray = Arrays.copyOfRange(givenArray, 0, givenArray.length/2);
			firstQuartile = getMedian(firstQuartileArray);
		}
		return firstQuartile;
	}	

	private double getThirdQuartile(Double[] givenArray) {
		Arrays.sort(givenArray);
		double thirdQuartile;
		if (givenArray.length % 2 == 0) {
			Double[] thirdQuartileArray = Arrays.copyOfRange(givenArray, givenArray.length/2, givenArray.length-1);
			thirdQuartile = getMedian(thirdQuartileArray);			
		} else {
			Double[] thirdQuartileArray = Arrays.copyOfRange(givenArray, givenArray.length/2 + 1, givenArray.length-1);
			thirdQuartile = getMedian(thirdQuartileArray);
		}
		return thirdQuartile;
	}
	
	public static void generateBulkFiles(int noOfCampaigns, String accountsFilePath, String randomNamesFilePath, String domainRandomsFilePath, String fileGenerationFolderPath, String templateFilePath) {
		List<String> accounts = TextFileReaderUtils.readLinesAsList(accountsFilePath, true,"UTF-16");
		List<String> randomNames = TextFileReaderUtils.readLinesAsList(randomNamesFilePath, true,"UTF-16");
		Collections.shuffle(randomNames);
		CyclicIterator<String> randomNamesIterator = new CyclicIterator<String>(randomNames);
		List<String> domainRandomNames = TextFileReaderUtils.readLinesAsList(domainRandomsFilePath, true,"UTF-16");
		Collections.shuffle(domainRandomNames);
		CyclicIterator<String> domainRandomNamesIterator = new CyclicIterator<String>(domainRandomNames);
		List<String> templateFileLines = TextFileReaderUtils.readLinesAsList(templateFilePath,true,"UTF-16");
		String templateHeaderLineString = templateFileLines.get(0);
		String aCampaignDetailLinesString = "";
		for(int i = 1; i<templateFileLines.size(); i++) {
			aCampaignDetailLinesString = aCampaignDetailLinesString + "\n" + templateFileLines.get(i);
		}
		String allCampaignsDetailLinesString = aCampaignDetailLinesString;
		for(int i = 2; i<=noOfCampaigns; i++) {
			allCampaignsDetailLinesString = allCampaignsDetailLinesString + aCampaignDetailLinesString.replaceAll("1#", i+"#");
		}
		String templateFileString = templateHeaderLineString + allCampaignsDetailLinesString;
		for(String accountName: accounts) {
			//System.out.println(templateFileString);
			String  replacedFileString = templateFileString.replaceAll("#Account#", accountName);
			//System.out.println(replacedFileString);
			//break;
			for(int i = 1; i<=100; i++) {
				String randomPlaceholder = "\\#Random"+i+"\\#";
				String randomGroupPlaceholder = "\\#RandomGroup"+i+"\\#";
				String domainRandomPlaceholder = "\\#DomainRandom"+i+"\\#";
				String randomReplacement = randomNamesIterator.next() + randomNamesIterator.next();
				replacedFileString = replacedFileString.replaceAll(randomPlaceholder, randomReplacement);
				replacedFileString = replacedFileString.replaceAll(randomGroupPlaceholder, randomReplacement+"Group");
				replacedFileString = replacedFileString.replaceAll(domainRandomPlaceholder, domainRandomNamesIterator.next());
			}
			String filePath = fileGenerationFolderPath + "/" + accountName + ".csv";
			TextFileWriterUtils.writeString(replacedFileString, filePath, false, false,"UTF-16LE",true);
		}
		
	}
	
	public static String createTemplateFile(String templatePartsFolderPath, String templateFilePath, String state, String gender, String age, String imageType, String supplyGrouping) {
		String templateFileString = "";
		
		List<String> campaigntemplateFileLines = TextFileReaderUtils.readLinesAsList(templatePartsFolderPath+"/Campaign.csv",true,"UTF-16");
		
		/*for(String campaigntemplateFileLine : campaigntemplateFileLines) {
			templateFileString = templateFileString + campaigntemplateFileLine + "\n";
		}*/
		
		File templateFile = new File(templateFilePath);
		for(int i=0; i<campaigntemplateFileLines.size(); i++) {
			if(i==0 && !templateFile.exists()) {
				templateFileString = templateFileString + campaigntemplateFileLines.get(i) + "\n";
			} else if (i > 0  && templateFile.exists()){
				templateFileString = templateFileString + campaigntemplateFileLines.get(i) + "\n";
			}
		}
		
		if(null != gender) {
			
			List<String> gendertemplateFileLines = TextFileReaderUtils.readLinesAsList(templatePartsFolderPath+"/Gender_"+gender+".csv",true,"UTF-16");
			gendertemplateFileLines.remove(0);
			
			for(String gendertemplateFileLine : gendertemplateFileLines) {
				templateFileString = templateFileString + gendertemplateFileLine + "\n";
			}
		}
		
		
		if(null != age) {	
			
			List<String> agetemplateFileLines = TextFileReaderUtils.readLinesAsList(templatePartsFolderPath+"/Age_"+age+".csv",true,"UTF-16");
			agetemplateFileLines.remove(0);
			
			for(String agetemplateFileLine : agetemplateFileLines) {
				templateFileString = templateFileString + agetemplateFileLine + "\n";
			}
		}
		
		
		if(null != imageType) {	
			
			List<String> imageTypeAdstemplateFileLines = TextFileReaderUtils.readLinesAsList(templatePartsFolderPath+"/Ads_"+imageType+".csv",true,"UTF-16");
			imageTypeAdstemplateFileLines.remove(0);
			
			for(String imageTypeAdstemplateFileLine : imageTypeAdstemplateFileLines) {
				templateFileString = templateFileString + imageTypeAdstemplateFileLine + "\n";
			}
		}
		
		if(null != supplyGrouping) {	
			
			List<String> supplyGrouptemplateFileLines = TextFileReaderUtils.readLinesAsList(templatePartsFolderPath+"/SupplyGrouping_"+supplyGrouping+".csv",true,"UTF-16");
			supplyGrouptemplateFileLines.remove(0);
			
			for(String supplyGrouptemplateFileLine : supplyGrouptemplateFileLines) {
				templateFileString = templateFileString + supplyGrouptemplateFileLine + "\n";
			}
		}
		
		if(null != state) {		
			
			List<String> woeidLines = TextFileReaderUtils.readLinesAsList(templatePartsFolderPath+"/state-woeid-state-level.csv",true,"UTF-8");
			List<String> statetemplateFileLines = TextFileReaderUtils.readLinesAsList(templatePartsFolderPath+"/Locations.csv",true,"UTF-16");
			statetemplateFileLines.remove(0);
			
			for(String woeidLine : woeidLines) {
				String woeidState = woeidLine.split(",")[0];
				String woeid = woeidLine.split(",")[1];
				if(woeidState.equalsIgnoreCase(state)) {
					for(String statetemplateFileLine : statetemplateFileLines) {
						templateFileString = templateFileString + statetemplateFileLine.replaceAll("#WOEID#", woeid) + "\n";
					}
				}				
			}			
			
		}
		
		templateFileString = templateFileString.replaceAll("#GEN#", gender);
		templateFileString = templateFileString.replaceAll("#AGE#", age);
		templateFileString = templateFileString.replaceAll("#BM#", supplyGrouping);
		templateFileString = templateFileString.replaceAll("#ST#", state);
		templateFileString = templateFileString.replaceAll("#IT#", imageType);
		
		TextFileWriterUtils.writeString(templateFileString, templateFilePath, true, false,"UTF-16LE",true);
		return templateFileString;
	}
	
	public static String generateBulkFileForSingleAccount(int noOfCampaigns, String accountName, String displayUrl, String sponsoredBy, String randomNamesFilePath, String domainRandomsFilePath, String fileGenerationFolderPath, String templateFilePath) {
		List<String> randomNames = TextFileReaderUtils.readLinesAsList(randomNamesFilePath, true,"UTF-16");
		Collections.shuffle(randomNames);
		CyclicIterator<String> randomNamesIterator = new CyclicIterator<String>(randomNames);
		List<String> domainRandomNames = TextFileReaderUtils.readLinesAsList(domainRandomsFilePath, true,"UTF-16");
		Collections.shuffle(domainRandomNames);
		CyclicIterator<String> domainRandomNamesIterator = new CyclicIterator<String>(domainRandomNames);
		List<String> templateFileLines = TextFileReaderUtils.readLinesAsList(templateFilePath,true,"UTF-16");
		String templateHeaderLineString = templateFileLines.get(0);
		String aCampaignDetailLinesString = "";
		for(int i = 1; i<templateFileLines.size(); i++) {
			aCampaignDetailLinesString = aCampaignDetailLinesString + "\n" + templateFileLines.get(i);
		}
		String allCampaignsDetailLinesString = aCampaignDetailLinesString;
		for(int i = 2; i<=noOfCampaigns; i++) {
			allCampaignsDetailLinesString = allCampaignsDetailLinesString + aCampaignDetailLinesString.replaceAll("1#", i+"#");
		}
		String templateFileString = templateHeaderLineString + allCampaignsDetailLinesString;
		//System.out.println(templateFileString);
		String  replacedFileString = templateFileString.replaceAll("#Account#", accountName);
		Random rand = new Random();
		Integer  n = rand.nextInt(999) + 1;
		replacedFileString = replacedFileString.replaceAll("#RNO#", n.toString());
		replacedFileString = replacedFileString.replaceAll("#DisplayUrl#", displayUrl);
		replacedFileString = replacedFileString.replaceAll("#SponsoredBy#", sponsoredBy);
		replacedFileString = replacedFileString.replaceAll("#DisplayUrlLower#", displayUrl.toLowerCase());
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		replacedFileString = replacedFileString.replaceAll("#StartDate#", sdf.format(new Date()));
		//System.out.println(replacedFileString);
		//break;
		for(int i = 1; i<=100; i++) {
			String randomPlaceholder = "\\#Random"+i+"\\#";
			String randomGroupPlaceholder = "\\#RandomGroup"+i+"\\#";
			String domainRandomPlaceholder = "\\#DomainRandom"+i+"\\#";
			String randomReplacement = randomNamesIterator.next() + randomNamesIterator.next();
			replacedFileString = replacedFileString.replaceAll(randomPlaceholder, randomReplacement);
			replacedFileString = replacedFileString.replaceAll(randomGroupPlaceholder, randomReplacement+"Group");
			replacedFileString = replacedFileString.replaceAll(domainRandomPlaceholder, domainRandomNamesIterator.next());
		}
		String filePath = fileGenerationFolderPath + "/" + accountName + "-" + sponsoredBy + ".csv";
		TextFileWriterUtils.writeString(replacedFileString, filePath, false, false,"UTF-16LE",true);
		return filePath;
	}
	
	public static String generateBulkUpdateFileForSingleAccount(List<Campaign> campaigns, String accountName, String displayUrl, String sponsoredBy, String fileGenerationFolderPath, String templateFilePath) {
		List<String> templateFileLines = TextFileReaderUtils.readLinesAsList(templateFilePath,true,"UTF-16");
		String templateHeaderLineString = templateFileLines.get(0);
		String aCampaignDetailLinesString = "";
		for(int i = 1; i<templateFileLines.size(); i++) {
			aCampaignDetailLinesString = aCampaignDetailLinesString + "\n" + templateFileLines.get(i);
		}
		String allCampaignsDetailLinesString = templateHeaderLineString;
		for(Campaign aCampaign:campaigns) {
			String replacedFileString = aCampaignDetailLinesString.replaceAll("#CampaignID#", aCampaign.getCampaignId());
			replacedFileString = replacedFileString.replaceAll("#CampaignName#", aCampaign.getCampaignName());
			allCampaignsDetailLinesString = allCampaignsDetailLinesString + replacedFileString;
		}
		
		String filePath = fileGenerationFolderPath + "/" + accountName + ".csv";
		TextFileWriterUtils.writeString(allCampaignsDetailLinesString, filePath, false, false,"UTF-16LE",true);
		return filePath;		
	
	}
	
	public static String getWOEIDByZip (String zipCode, String state) throws IOException {
		String WOEID = "";
		String apiURL = "https://api.gemini.yahoo.com/v2/rest/dictionary/woeid/?type=zip&location=" + zipCode;
		OkHttpClient client = new OkHttpClient();
		Request authRequest = new Request.Builder()
			      .url(apiURL)
			      .addHeader("Authorization", "Bearer 4m087imdogAVuOIztwmgQZvQCLHAa1.aP7DM_oYofy3g8IY_STQeCCR_eez0aWfn.zaZTVbje4HEG3E3vo4y1P8FsFB0ZBcTkCMDOUBJXE86rbmTPNF1m_Law1fcfOBPg31ZmbKq8HHpnt6RYwA1afvA3tj.Ffv_E6j_gha6AImAHZQozHMfb3InD7ztTTyHjnlZ2d2L0yvV5hABU7QOPmSOR60pbLAiu4qhpHXiInrMHdzxEeah60nTUQgnZqAmaUZruhqPNMl1MQF.cbFBt_ziMJN4NYJtZVxrSqdmK.P6Rd0_uXGdtQwVhMQrLQT9Z23l3nWCLKjm8WTo.VTQffypgBdS3Km9tPJcJjMbyHFO9H6Sbxo4EVsTrT4WvQiv6FNpvYk8w4s0812fUiYJ4tfDByD27mly2vYm0x03CXmqhoX9EnMrFuTaxxQOU6y4GB_uTeFAGtF9byvZINyTxTN8jxo6pb0KNm8l0p_ngETvaBydMPyWGX_iUa_DVja5nqSCFD9ZqSz4rm89CuwjWDIShG_h7tqpmedy7yurDRIfFe8NUKNpZNm7_A8Oirw07viAdkvuIc2SakvzlJGSaXpOsKsiYxnC26PD0UC9B3GTMse3SDZg32JAKKzcpuNV3wujaeyA1ujVZ9t21EX_4CDvDjDLJTwTgQ.JV1px9pBO32Fhpbt3iPJvkG8Actab5ASBQcgXRa0V3LyyYAYzK29IeXy2pK.ooffrksPOMvsCJC_vjD8s4uEXVLgUKsl5SG7P0IJcsaP47I7OqlPE2Z2AnJc32HBYP2bln4K_eVmH2UJzkP22r1YRv83wt2O4Xmq0V7fgIEBbwcmqA26DDvUltJnwf6LYVsmWoRLw")
			      .build();
		Response authResponse = client.newCall(authRequest).execute();
		String jsonResponse = authResponse.body().string();
		//System.out.println(jsonResponse);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readValue(jsonResponse, JsonNode.class);
		JsonNode responses = rootNode.get("response");
		Iterator<JsonNode> responsesIterator =  responses.iterator();
		while(responsesIterator.hasNext()) {
			StringBuilder responseAsString = new StringBuilder();
			JsonNode thisResponse = responsesIterator.next();
			responseAsString.append(thisResponse.get("woeid")).append(",");
			responseAsString.append(thisResponse.get("name")).append(",");
			responseAsString.append(thisResponse.get("type")).append(",");
			responseAsString.append(thisResponse.get("parentWoeid")).append(",");
			System.out.println(zipCode+","+state+","+responseAsString.toString());
		}
		
		return WOEID;
	}
	
	public static Connection getCampaignStatsSQLConnection () throws ClassNotFoundException, SQLException {
		String connectionString = "jdbc:sqlserver://cybermint.database.windows.net:1433;"
				+ "database=CampaignStats;user=ca@cybermint;password=123CyberAdmin!@#;"
				+ "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;"
				+ "loginTimeout=30;";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(connectionString);
		return connection;
	}
	
	public static String getAccountForPasswordChange() throws ClassNotFoundException, SQLException {
		Connection connection = getCampaignStatsSQLConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("select top 1 username, password from GeminiAccounts where status in (");
		sql.append("'" + CH_PASS_YET_TO_START + "',");
		sql.append("'" + CH_PASS_STARTING + "',");
		sql.append("'" + CH_PASS_SIGNED_IN + "',");
		sql.append("'" + CH_PASS_GOT_ACCOUNT_SECURITY_PAGE + "'");
		sql.append(") order by isnull(lastUpdatedon,'1900-01-01') asc");
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery(sql.toString());
		String username = "";
		String password = "";
		if(rs.next()) {
			username = rs.getString(1);
			password = rs.getString(2);
		}
		s.close();
		if(username.length() > 0) {
			String updateSql = "update GeminiAccounts SET status = ?, lastUpdatedon = getdate() where username = ?";
			PreparedStatement ps = connection.prepareStatement(updateSql);
			ps.setString(1, CH_PASS_INPROGRESS);
			ps.setString(2, username);
			ps.executeUpdate();
			ps.close();
		}
		connection.close();
		
		return username+","+password;
	}

	public static String getAccountForGeminiSignup() throws ClassNotFoundException, SQLException {
		Connection connection = getCampaignStatsSQLConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("select top 1 username, password, company, website, email, phone, card, status from GeminiAccounts where status in (");
		sql.append("'" + CH_PASS_DONE + "',");
		sql.append("'" + SU_ACCT_STARTING + "',");
		sql.append("'" + SU_ACCT_SIGNED_IN + "',");
		sql.append("'" + SU_ACCT_SIGNED_UP + "'");
		sql.append("'" + SU_ACCT_OPENED_BILLING + "'");
		sql.append("'" + SU_ACCT_BILLING_FAILURE + "'");
		sql.append(") order by isnull(lastUpdatedon,'1900-01-01') asc");
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery(sql.toString());
		String username = "";
		String password = "";
		String company = "";
		String website = "";
		String email = "";
		String phone = "";
		String card = "";
		String lastStatus = "";
		if(rs.next()) {
			username = rs.getString(1);
			password = rs.getString(2);
			company = rs.getString(3);
			website = rs.getString(4);
			email = rs.getString(5);
			phone = rs.getString(6);
			card = rs.getString(7);
			lastStatus = rs.getString(8);
		}
		s.close();
		if(username.length() > 0) {
			String updateSql = "update GeminiAccounts SET status = ?, lastUpdatedon = getdate() where username = ?";
			PreparedStatement ps = connection.prepareStatement(updateSql);
			ps.setString(1, SU_ACCT_INPROGRESS);
			ps.setString(2, username);
			ps.executeUpdate();
			ps.close();
		}
		connection.close();
		
		return username+","+password+","+company+","+website+","+email+","+phone+","+card+","+lastStatus;
	}
	
	public static String getAccountForUploadingCampaigns() throws ClassNotFoundException, SQLException {
		Connection connection = getCampaignStatsSQLConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("select top 1 ga.username, ga.password, gud.Template, gud.Domain, gud.SponsoredBy ");
		sql.append("from GeminiUploadsDetail gud ");
		sql.append("inner join GeminiUploadsMaster gum on gum.UploadMasterID = gud.UploadMasterID and gum.Status = ");
		sql.append("'" + ACTIVE + "' ");
		sql.append("inner join GeminiAccounts ga on gud.Username = ga.Username ");
		sql.append("where gud.Status in (");
		sql.append("'" + UPL_CAMP_YET_TO_START + "',");
		sql.append("'" + UPL_CAMP_FAILURE + "'");
		sql.append(") order by isnull(gud.lastUpdatedon,'1900-01-01') asc");
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery(sql.toString());
		String username = "";
		String password = "";
		String template = "";
		String domain = "";
		String sponsoredBy = "";
		if(rs.next()) {
			username = rs.getString(1);
			password = rs.getString(2);
			template = rs.getString(3);
			domain = rs.getString(4);
			sponsoredBy = rs.getString(5);
		}
		s.close();
		if(username.length() > 0) {
			StringBuilder updateSql = new StringBuilder();
			updateSql.append("update GeminiUploadsDetail SET status = ?, lastUpdatedon = getdate() ");
			updateSql.append("from GeminiUploadsDetail gud ");
			updateSql.append("inner join GeminiUploadsMaster gum on gum.UploadMasterID = gud.UploadMasterID and gum.Status = 'ACTIVE' ");
			updateSql.append("inner join GeminiAccounts ga on gud.Username = ga.Username ");
			updateSql.append("where gud.username = ?");
			PreparedStatement ps = connection.prepareStatement(updateSql.toString());
			ps.setString(1, UPL_CAMP_INPROGRESS);
			ps.setString(2, username);
			ps.executeUpdate();
			ps.close();
		}
		connection.close();
		
		return username+","+password+","+template+","+domain+","+sponsoredBy;
	}
	
	public static void updateCampaignUploadStatus(String username, String status) throws ClassNotFoundException, SQLException {
		Connection connection = getCampaignStatsSQLConnection();
		StringBuilder updateSql = new StringBuilder();
		updateSql.append("update GeminiUploadsDetail SET status = ?, lastUpdatedon = getdate() ");
		updateSql.append("from GeminiUploadsDetail gud ");
		updateSql.append("inner join GeminiUploadsMaster gum on gum.UploadMasterID = gud.UploadMasterID and gum.Status = 'ACTIVE' ");
		updateSql.append("inner join GeminiAccounts ga on gud.Username = ga.Username ");
		updateSql.append("where gud.username = ?");
		PreparedStatement ps = connection.prepareStatement(updateSql.toString());
		ps.setString(1, status);
		ps.setString(2, username);
		ps.executeUpdate();
		ps.close();
		connection.close();
	}
	
	public static void updateAccountStatus(String username, String status) throws ClassNotFoundException, SQLException {
		Connection connection = getCampaignStatsSQLConnection();
		String updateSql = "update GeminiAccounts SET status = ?, lastUpdatedon = getdate() where username = ?";
		PreparedStatement ps = connection.prepareStatement(updateSql);
		ps.setString(1, status);
		ps.setString(2, username);
		ps.executeUpdate();
		ps.close();
		connection.close();
	}
	
	public static void updateAccountStatusAndPassword(String username, String password, String status) throws ClassNotFoundException, SQLException {
		Connection connection = getCampaignStatsSQLConnection();
		String updateSql = "update GeminiAccounts SET status = ?, password = ?, lastUpdatedon = getdate() where username = ?";
		PreparedStatement ps = connection.prepareStatement(updateSql);
		ps.setString(1, status);
		ps.setString(2, password);
		ps.setString(3, username);
		ps.executeUpdate();
		ps.close();
		connection.close();
	}
	
	public static void main(String args[]) throws Exception {
		
		/*
		System.out.println("Zip,State,WOEID,Name,Type,ParentWOEID");
		String locationsFilePath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/locations-delta.csv";
		List<String> locations = TextFileReaderUtils.readLinesAsList(locationsFilePath, true);
		for(String location : locations) {
			YahooGeminiUtils.getWOEIDByZip(location.split(",")[1],location.split(",")[0]);
		}
		*/
		//SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		//System.out.println(sdf.format(new Date()));

		
		String[] states = {"AZ","CA","CT","FL","HI","MA","MD","NJ","NM","NY","RI","SC","TX","UT","CO","DE"};
		//String[] states = {"AZ","CA","CT","FL","HI","MA","MD","NJ","NM","NY","RI","SC","TX","UT"};
		String[] genders = {"M","F"};
		String[] ages = {"35-44","45-54","55-64","65-120"};
		String templateParts = "C:/Users/elangokp.AHC.000/Google Drive/Programs/YahooGeminiDeleteAndUploadCampaigns/metadata/bulkads/003templateparts";
		String templateFilePath = templateParts+"/gen-template.csv";
		for(String state : states) {
			for(String gender : genders) {
				for(String age : ages) {
					YahooGeminiUtils.createTemplateFile(templateParts, templateFilePath, state, gender, age, "whq", "sg01");
				}
			}
		}
		
		/*
		String accountName = args[0]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/accountusernames.txt
		String displayUrl = args[1];
		String sponsoredBy = args[2];
		String randomNamesFilePath = args[3]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/randoms.txt
		String domainRandomsFilePath = args[4]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/solardomainrandoms.txt
		String fileGenerationFolderPath = args[5]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/002GeneratedFiles/Ad37-AllGenders-35-120-DiffImages-Template
		String templateFilePath = args[6]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/Ad37-AllGenders-35-120-DiffImages-Template.csv
		Integer noOfCampaigns = Integer.parseInt(args[7]);
		YahooGeminiUtils.generateBulkFileForSingleAccount(noOfCampaigns,accountName, displayUrl, sponsoredBy, randomNamesFilePath, domainRandomsFilePath, fileGenerationFolderPath, templateFilePath);
		*/
		
		/*String jacobDllVersionToUse;
		if (System.getProperty("sun.arch.data.model").contains("32")){
			jacobDllVersionToUse = "jacob-1.18-x86.dll";
		}
		else {
			jacobDllVersionToUse = "jacob-1.18-x64.dll";
		}

		File file = new File("lib\\autoit", jacobDllVersionToUse);
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

		AutoItX x = new AutoItX();
		x.run("calc.exe");
		x.winActivate("Calculator");
		x.winWaitActive("Calculator");
		//Enter 3
		//x.controlClick("Calculator", "", "133") ;
		x.controlFocus("Calculator", "", "133");
		x.controlSend("Calculator", "", "133", "{ENTER}",false);
		x.send("{ENTER}",true);
		//Thread.sleep(1000);
		//Enter +
		//x.controlClick("Calculator", "", "93") ;
		x.controlFocus("Calculator", "", "93");
		x.controlSend("Calculator", "", "93", "{ENTER}");
		//Thread.sleep(1000);
		//Enter 3
		//x.controlClick("Calculator", "", "133") ;
		x.controlFocus("Calculator", "", "133");
		x.controlSend("Calculator", "", "133", "{ENTER}");
		//Thread.sleep(1000);
		//Enter =
		//x.controlClick("Calculator", "", "121") ;
		x.controlFocus("Calculator", "", "121");
		x.controlSend("Calculator", "", "121", "{ENTER}");
		*/
	}
}
