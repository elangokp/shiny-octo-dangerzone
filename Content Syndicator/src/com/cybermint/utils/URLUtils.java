/**
 * 
 */
package com.cybermint.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Elango
 *
 */
public class URLUtils {

	public static List<String> compareAndRemoveDomains(String toRemoveInFilePath, String toCompareWithFilePath) {
		List<String> toRemoveInUrlList = TextFileReaderUtils.readLinesAsList(toRemoveInFilePath , true);
		List<String> toCompareWithUrlList = TextFileReaderUtils.readLinesAsList(toCompareWithFilePath , true);
		toCompareWithUrlList = addHttpProtocol(toCompareWithUrlList);
		Set<String> toCompareWithDomainList = new HashSet<String> ();
		for(String aUrlString : toCompareWithUrlList) {
			URL aUrl;
			try {
				aUrl = new URL(aUrlString);
				toCompareWithDomainList.add(aUrl.getHost());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				System.out.println(aUrlString);
				e.printStackTrace();
			}			
		}
		
		System.out.println(toCompareWithDomainList.size());
		List<String> filteredList = new ArrayList<String> ();
		for(String aUrlString : toRemoveInUrlList) {
			URL aUrl;
			try {
				aUrl = new URL(aUrlString);
				if(!GeneralUtils.presentIn(aUrl.getHost(), toCompareWithDomainList)) {
					//System.out.println("Not Present");
					filteredList.add(aUrlString);
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return filteredList;
	}
	
	public static List<String> addHttpProtocol(Collection<String> listOfUrls) {
		List<String> listWithProtocol = new ArrayList<String> ();
		for(String aUrl : listOfUrls) {
			if(!aUrl.startsWith("http")) {
				listWithProtocol.add("http://" + aUrl);
			} else {
				listWithProtocol.add(aUrl);
			}
		}
		return listWithProtocol;
	}
	
	public static List<String> removeUrlsWithJustDomain (Collection<String> listOfUrls) {
		List<String> listWithoutJustDomain = new ArrayList<String> ();
		for(String aUrlString : listOfUrls) {
			URL aUrl;
			try {
				aUrl = new URL(aUrlString);
				if(!aUrl.getPath().equalsIgnoreCase("/") && !aUrl.getPath().isEmpty()) {
					listWithoutJustDomain.add(aUrlString);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			
		}
		return listWithoutJustDomain;
	}
	
	
	public static List<String> getAllFolderUrls(String urlString) {
		List<String> listOfAllFolderUrls = new ArrayList<String> ();
		URL aUrl;
		String constructedUrl = new String();
		try {
			aUrl = new URL(urlString);
			String domain = aUrl.getHost();
			String path = aUrl.getPath();
			String[] folders = path.split("/");
			constructedUrl = aUrl.getProtocol() + "://" + domain;
			listOfAllFolderUrls.add(constructedUrl+"/");
			for(String aFolder : Arrays.asList(folders)) {
				if(!aFolder.isEmpty()) {
					constructedUrl =  constructedUrl + "/" + aFolder;
					listOfAllFolderUrls.add(new String(constructedUrl + "/"));	
				}							
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return listOfAllFolderUrls;
	}
	
	public static void main (String args[]) {
		//List<String> filteredList = URLUtils.compareAndRemoveDomains("C:/Users/Elango/Desktop/Harvester_Sessions/all footprint urls Without Just Domains.txt", "E:/Dropbox/UD/Latest Added Sites to UD/All Sites.txt");
		//TextFileWriterUtils.writeListAsLines(filteredList, "C:/Users/Elango/Desktop/Harvester_Sessions/all footprint urls Without Just Domains Filtered.txt");	
		//List<String> listWithoutJustDomain = removeUrlsWithJustDomain(TextFileReaderUtils.readLinesAsList("C:/Users/Elango/Desktop/Harvester_Sessions/all footprint urls.txt" , true));
		//TextFileWriterUtils.writeListAsLines(listWithoutJustDomain, "C:/Users/Elango/Desktop/Harvester_Sessions/all footprint urls Without Just Domains.txt");
		List<String> listOfAllFolderUrls = getAllFolderUrls("http://elearningblogs.education.ed.ac.uk/oldelgg/elgg/heywayne/weblog/140.html");
		for(String url : listOfAllFolderUrls) {
			System.out.println(url);
		}
	}
}
