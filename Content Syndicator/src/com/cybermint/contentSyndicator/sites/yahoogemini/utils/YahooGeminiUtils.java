package com.cybermint.contentSyndicator.sites.yahoogemini.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.Campaign;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class YahooGeminiUtils {

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
	
	public static String generateBulkFileForSingleAccount(int noOfCampaigns, String accountName, String randomNamesFilePath, String domainRandomsFilePath, String fileGenerationFolderPath, String templateFilePath) {
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
		return filePath;
	}
	
	public static String generateBulkUpdateFileForSingleAccount(List<Campaign> campaigns, String accountName, String fileGenerationFolderPath, String templateFilePath) {
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
	
	public static void main(String args[]) throws Exception {
		
		String accountName = args[0]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/accountusernames.txt
		String randomNamesFilePath = args[1]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/randoms.txt
		String domainRandomsFilePath = args[2]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/solardomainrandoms.txt
		String fileGenerationFolderPath = args[3]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/002GeneratedFiles/Ad37-AllGenders-35-120-DiffImages-Template
		String templateFilePath = args[4]; // C:/Users/elangokp.AHC.000/Dropbox/Projects/Solar/Bulk Ads/001templates/Ad37-AllGenders-35-120-DiffImages-Template.csv
		Integer noOfCampaigns = Integer.parseInt(args[5]);
		YahooGeminiUtils.generateBulkFileForSingleAccount(noOfCampaigns,accountName, randomNamesFilePath, domainRandomsFilePath, fileGenerationFolderPath, templateFilePath);

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
