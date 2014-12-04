/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.keywordResearcher.suggest.google;

import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

/**
 *
 * @author ADMIN
 */
public class GoogleKeywordSuggestScraper {

    private String driverType;
    private String rootKeyword;

    public GoogleKeywordSuggestScraper(String driverType, String rootKeyword) {
        this.driverType = driverType;
        this.rootKeyword = rootKeyword;
    }

    public Set<String> getSuggestedKeywords() {
       WebDriver driver = null;
       List<String> suggestedKeywords = new ArrayList<String>();
        Set<String> withoutDuplicates = new HashSet<String>();
        try {
            driver = Page.constructDriver(driverType);
            for(Integer cp:deduceAvailableCursorPositions()) {
                //driver.get("https://clients1.google.com/complete/search?client=hp&q=" + rootKeyword + "&cp=" + cp.toString() + "&output=toolbar");
            	URLConnection connection = new URL("https://clients1.google.com/complete/search?client=hp&q=" + URLEncoder.encode(rootKeyword, "UTF-8") + "&cp=" + cp.toString()).openConnection();
            	//connection.setRequestProperty("Accept-Charset", "UTF-8");
            	InputStream response = connection.getInputStream();
            	StringWriter writer = new StringWriter();
            	IOUtils.copy(response, writer, "UTF-8");
                String source = writer.toString();
                //String source = driver.getPageSource();
                //System.out.println(source);
                Pattern p = Pattern.compile("\\[\\[.*\\]\\]");
                Matcher m = p.matcher(source);
                //System.out.println(m.find());
                m.find();
                //System.out.println(m.pattern());
                //System.out.println(m.group());
                String source1=m.group();
                //p = Pattern.compile("\\[\".*?\"\\]");
                p = Pattern.compile("\\[\".*?\"");
                m = p.matcher(source1);
                while(m.find()) {
                    String aSuggestElement = m.group();
                    //System.out.println(aSuggestElement);
                    Pattern p1 = Pattern.compile("\".*?\"");
                    Matcher m1 = p1.matcher(aSuggestElement);
                    m1.find();
                    String aKeyword = m1.group();
                    suggestedKeywords.add(aKeyword.subSequence(1, (aKeyword.length()-1)).toString().replaceAll("\\\\u003Cb\\\\u003E", "").replaceAll("\\\\u003C\\\\/b\\\\u003E", ""));
                    //System.out.println(aKeyword.subSequence(1, (aKeyword.length()-1)));
                }                
            }           
            withoutDuplicates.addAll(suggestedKeywords);
//            for(String aKeyword:withoutDuplicates) {
//                    System.out.println(aKeyword);
//                }
            //System.out.println("Total keywords found : tex" + suggestedKeywords.size());  
            //TextFileWriterUtils.writeListAsLines(new ArrayList(withoutDuplicates), "E:/Dropbox/Website Campaigns/01.Cure Tinnitus/Keyword Research/suggested/suggested keywords.txt");
            System.out.println(rootKeyword + " : Total keywords found for without Duplicates: " + withoutDuplicates.size());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
       return withoutDuplicates;
    }

    public List<Integer> deduceAvailableCursorPositions() {
        List<Integer> availableCursorPositions = new ArrayList<Integer>();
        availableCursorPositions.add(0);        
        for(Integer index=rootKeyword.indexOf(' ');index>0;index=rootKeyword.indexOf(' ',index+1)) {            
            availableCursorPositions.add(index);
        }
        availableCursorPositions.add(rootKeyword.length());
        System.out.println(availableCursorPositions);
        return availableCursorPositions;
    }

    public static void main(String args[]) {
        List<String> allMainKeywords = TextFileReaderUtils.readLinesAsList("G:/Dropbox/Website Campaigns/Metadata/get-ex-back-keywords.txt", false);
        ArrayList<String> keywordsWithSuggestions = new ArrayList<String>();

        for(String aMainKeyword:allMainKeywords) {
        	Set<String> allWithoutDuplicates = new HashSet<String>();
        	ArrayList<String> allWithoutDuplicatesAsList = new ArrayList<String>();
            GoogleKeywordSuggestScraper ob = new GoogleKeywordSuggestScraper("htmlunit",aMainKeyword);
            try {
                Thread.sleep(500 + new Random().nextInt(2000 - 500 + 1));
            } catch (InterruptedException ex) {
                Logger.getLogger(GoogleKeywordSuggestScraper.class.getName()).log(Level.SEVERE, null, ex);
            }
            allWithoutDuplicates.addAll(ob.getSuggestedKeywords());
            allWithoutDuplicatesAsList.addAll(allWithoutDuplicates);
            StringBuffer sb = new StringBuffer();
            sb.append(aMainKeyword).append(",");
        	sb.append("{");
        	for(int i=0;i<allWithoutDuplicatesAsList.size();i++) {
        		sb.append(StringUtils.remove(allWithoutDuplicatesAsList.get(i),","));
        		if(i<(allWithoutDuplicatesAsList.size()-1)) {
        			sb.append("|");
        		}
        	}
        	sb.append("}");
        	keywordsWithSuggestions.add(sb.toString());
        	System.out.println(sb.toString());
        }
        TextFileWriterUtils.writeListAsLines(keywordsWithSuggestions, "G:/Dropbox/Website Campaigns/Metadata/get-ex-back-keywords-suggestions.csv");
    	//tempFun();
    }
    
    public static void tempFun() {
    	GoogleKeywordSuggestScraper ob = new GoogleKeywordSuggestScraper("htmlunit","teen");
    	ArrayList<String> suggests = new ArrayList<String>(ob.getSuggestedKeywords());
    	StringBuffer sb = new StringBuffer();
    	sb.append("{");
    	for(int i=0;i<suggests.size();i++) {
    		sb.append(suggests.get(i));
    		if(i<(suggests.size()-1)) {
    			sb.append("|");
    		}
    	}
    	sb.append("}");
    	System.out.println(sb.toString());
    	ArrayList<String> urlKeywordList = new ArrayList<String>();
    	List<String> linesList = TextFileReaderUtils.readLinesAsList("E:\\Dropbox\\Website Campaigns\\Camouflaged URLs\\teens.txt", true);
    	for(String line : linesList) {
    		urlKeywordList.add(line);
    		urlKeywordList.add(sb.toString());
    	}
    	TextFileWriterUtils.writeListAsLines(urlKeywordList, "E:\\Dropbox\\Website Campaigns\\Camouflaged URLs\\teens-urlKeywords.txt");
    }
}
