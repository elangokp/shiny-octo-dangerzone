package com.cybermint.contentSyndicator.sites.yahoogemini.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.utils.TextFileWriterUtils;

public class YahooGeminiUtils {

	public YahooGeminiUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void saveCampaignsToFile(List<Campaign> campaignList, String givenFilePath) {
		if(!TextFileWriterUtils.doesFileExist(givenFilePath)) {
			TextFileWriterUtils.writeString(Campaign.titleString(), givenFilePath, true, false);
		}
		TextFileWriterUtils writer = new TextFileWriterUtils(givenFilePath);
		for(Campaign aCampaign : campaignList) {
			writer.writeContentToFile(aCampaign.toString());
		}
	}
	
	public static void setOutlierProperties(List<Campaign> campaignList) {
		if(campaignList.size() > 0) {
			setImpressionOutlierCampaigns(campaignList);
			setCtrOutlierCampaigns(campaignList);
		}		
	}
	
	private static void setImpressionOutlierCampaigns(List<Campaign> campaignList) {
		List<Double> impressionList = new ArrayList<Double>();
		for(Campaign aCampaign : campaignList) {
			if(aCampaign.getImpressions()>0) {
				impressionList.add(aCampaign.getImpressions());
			}			
		}
		Double[] impressionArray = impressionList.toArray(new Double[impressionList.size()]);
		
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
	
	private static void setCtrOutlierCampaigns(List<Campaign> campaignList) {
		List<Double> ctrList = new ArrayList<Double>();
		for(Campaign aCampaign : campaignList) {
			if(aCampaign.getImpressions()>0) {
				ctrList.add(aCampaign.getCtr());
			}			
		}
		Double[] ctrArray = ctrList.toArray(new Double[ctrList.size()]);
		
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
	
	private static double getMedian(Double[] givenArray) {
		Arrays.sort(givenArray);
		double median;
		if (givenArray.length % 2 == 0) {
			median = ((double)givenArray[givenArray.length/2] + (double)givenArray[givenArray.length/2 - 1])/2;
			
		} else {
			median = (double) givenArray[givenArray.length/2];
		}
		return median;
	}
	
	private static double getFirstQuartile(Double[] givenArray) {
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

	private static double getThirdQuartile(Double[] givenArray) {
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
}
