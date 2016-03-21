package com.cybermint.contentSyndicator.sites.yahoogemini.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class YahooGeminiUtils {

	public YahooGeminiUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public void setAccountUsername(List<Campaign> campaignList, String username) {
		for(Campaign aCampaign : campaignList) {
			aCampaign.setCampaignAccountName(username);
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
		if(campaignList.size() > 0) {
			setImpressionOutlierCampaigns(campaignList);
			setCtrOutlierCampaigns(campaignList);
			for(Campaign aCampaign : campaignList) {
				aCampaign.makePauseDecision();
			}
		}			
	}
	
	private void setImpressionOutlierCampaigns(List<Campaign> campaignList) {
		try {
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
	
	public static void generateBulkFiles(String accountsFilePath, String randomNamesFilePath, String domainRandomsFilePath, String fileGenerationFolderPath, String templateFilePath) {
		List<String> accounts = TextFileReaderUtils.readLinesAsList(accountsFilePath, true,"UTF-16");
		List<String> randomNames = TextFileReaderUtils.readLinesAsList(randomNamesFilePath, true,"UTF-16");
		Collections.shuffle(randomNames);
		CyclicIterator<String> randomNamesIterator = new CyclicIterator<String>(randomNames);
		List<String> domainRandomNames = TextFileReaderUtils.readLinesAsList(domainRandomsFilePath, true,"UTF-16");
		Collections.shuffle(domainRandomNames);
		CyclicIterator<String> domainRandomNamesIterator = new CyclicIterator<String>(domainRandomNames);
		String templateFileString = TextFileReaderUtils.readFileAsString(templateFilePath,"UTF-16");
		for(String accountName: accounts) {
			//System.out.println(templateFileString);
			String  replacedFileString = templateFileString.replaceAll("#Account#", accountName);
			//System.out.println(replacedFileString);
			//break;
			for(int i = 1; i<=100; i++) {
				String randomPlaceholder = "\\#Random"+i+"\\#";
				String randomGroupPlaceholder = "\\#RandomGroup"+i+"\\#";
				String domainRandomPlaceholder = "\\#DomainRandom"+i+"\\#";
				String randomReplacement = randomNamesIterator.next().substring(0,3) + randomNamesIterator.next().substring(0,3);
				replacedFileString = replacedFileString.replaceAll(randomPlaceholder, randomReplacement);
				replacedFileString = replacedFileString.replaceAll(randomGroupPlaceholder, randomReplacement+"Group");
				replacedFileString = replacedFileString.replaceAll(domainRandomPlaceholder, domainRandomNamesIterator.next());
			}
			String filePath = fileGenerationFolderPath + "/" + accountName + ".csv";
			TextFileWriterUtils.writeString(replacedFileString, filePath, false, false,"UTF-16LE",true);
		}
		
	}
	
	public static void main(String args[]) {
		String accountsFilePath = args[0]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/accountusernames.txt
		String randomNamesFilePath = args[1]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/randoms.txt
		String domainRandomsFilePath = args[2]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/solardomainrandoms.txt
		String fileGenerationFolderPath = args[3]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/002GeneratedFiles/Ad37-AllGenders-35-120-DiffImages-Template
		String templateFilePath = args[4]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/Ad37-AllGenders-35-120-DiffImages-Template.csv
		YahooGeminiUtils.generateBulkFiles(accountsFilePath, randomNamesFilePath, domainRandomsFilePath, fileGenerationFolderPath, templateFilePath);
	}
}
