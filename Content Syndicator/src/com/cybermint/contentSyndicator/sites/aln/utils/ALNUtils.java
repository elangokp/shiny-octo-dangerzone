/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.sites.aln.utils;

import com.cybermint.contentSyndicator.sites.aln.formObjects.ALNArticleFormObject;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class ALNUtils {

	private static Calendar aCalendar = Calendar.getInstance();
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void prepareFormatedArticlesForALN(ALNArticleFormObject anALNArticleFormObject, String filePath, Integer noOfLinks) {
		Random randomGenerator = new Random();
		List<String> paragraphs = TextFileReaderUtils.readLinesAsList(filePath, true);
		anALNArticleFormObject.setArticleTitle(paragraphs.get(0));
		paragraphs.remove(0); //To remove the title as it already added.
		Boolean shouldIncludeYoutube = isTrue(6);
		Integer youtubePosition = 1 + randomGenerator.nextInt(paragraphs.size());
		Integer LinkOnePosition = 1 + randomGenerator.nextInt(paragraphs.size());
		Integer LinkTwoPosition = 1 + randomGenerator.nextInt(paragraphs.size());
		Integer LinkThreePosition = 1 + randomGenerator.nextInt(paragraphs.size());
        StringBuilder articleContent = new StringBuilder();
        Integer paragraphsAppended = 0;
        for (String aParagraph : paragraphs) {
        	Boolean paragraphAppendedinThisLoop = false;
        	if(LinkOnePosition == (paragraphsAppended+1)) {
        		System.out.println("Before inserting LINK1 : " + aParagraph);
        		String thisParagraph = insertLinkHolder(aParagraph, "%LINK1%");
        		articleContent.append(thisParagraph);
        		articleContent.append(System.getProperty("line.separator"));
            	articleContent.append(System.getProperty("line.separator"));
        		paragraphAppendedinThisLoop = true;
        		System.out.println("After inserting LINK1  : " + thisParagraph);
        	}
        	if(noOfLinks>1 && LinkTwoPosition == (paragraphsAppended+1)) {
        		System.out.println("Before inserting LINK2 : " + aParagraph);
        		String thisParagraph = insertLinkHolder(aParagraph, "%LINK2%");
        		articleContent.append(thisParagraph);
        		articleContent.append(System.getProperty("line.separator"));
            	articleContent.append(System.getProperty("line.separator"));
        		paragraphAppendedinThisLoop = true;
        		System.out.println("After inserting LINK2  : " + thisParagraph);
        	}
        	if(noOfLinks>2 && LinkThreePosition == (paragraphsAppended+1)) {
        		System.out.println("Before inserting LINK3 : " + aParagraph);
        		String thisParagraph = insertLinkHolder(aParagraph, "%LINK3%");
        		articleContent.append(thisParagraph);
        		articleContent.append(System.getProperty("line.separator"));
            	articleContent.append(System.getProperty("line.separator"));
        		paragraphAppendedinThisLoop = true;
        		System.out.println("After inserting LINK3  : " + thisParagraph);
        	}
        	if(!paragraphAppendedinThisLoop) {
        		articleContent.append(aParagraph);
            	articleContent.append(System.getProperty("line.separator"));
            	articleContent.append(System.getProperty("line.separator"));
        	}        	
        	paragraphsAppended++;
        	if(shouldIncludeYoutube && paragraphsAppended == youtubePosition) {
        		articleContent.append("%YOUTUBE%");
            	articleContent.append(System.getProperty("line.separator"));
            	articleContent.append(System.getProperty("line.separator"));
        	}        	
        }
        anALNArticleFormObject.setArticleContent(articleContent.toString());
	}
	
	public static String insertLinkHolder(String paragraph, String linkHolder) {
		Random randomGenerator = new Random();
		
		String[] words = paragraph.split("}");
		Integer linkPosition = 1 + randomGenerator.nextInt(words.length);
		System.out.println("Link Position  : " + linkPosition);
		System.out.println("Words Count  : " + words.length);
		StringBuffer reconstructedParagraph = new StringBuffer();
		Integer wordsAppended = 0;
		if(words.length<2) {
			if(paragraph.endsWith("}")) {
				reconstructedParagraph.append("}").append(words[0]).append(" ").append(linkHolder);
			} else {
				reconstructedParagraph.append(words[0]).append(" ").append(linkHolder);
			}			
		} else {
			for(int i=0; i<words.length; i++) {
				if(linkPosition  == (wordsAppended+1)) {
					reconstructedParagraph.append(" ").append(linkHolder).append(" ");
	        	}
				reconstructedParagraph.append(words[i]);
				if(i<(words.length-1)) {
					reconstructedParagraph.append("}");
				} else if(i == (words.length - 1)) {
					if(paragraph.endsWith("}")) {
						reconstructedParagraph.append("}");
					}
				}
				wordsAppended++;
			}
		}
		
		return reconstructedParagraph.toString();
	}
	
	public static Boolean isTrue(Integer successPercentage) {
		Random randomGenerator = new Random();
		Integer randomNumber = randomGenerator.nextInt(10);
		Boolean result;
		if(randomNumber < successPercentage) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
    public static void formatArticleForALN(ALNArticleFormObject anALNArticleFormObject, String filePath, Integer noOfLinks) {
        Random randomGenerator = new Random();
    	Integer youtubePosition = randomGenerator.nextInt(3);
    	Integer paragraphCount=0;
    	List<String> unFormattedLines = TextFileReaderUtils.readLinesAsList(filePath, false);
        anALNArticleFormObject.setArticleTitle(unFormattedLines.get(0));
        unFormattedLines.remove(0); //To remove the title as it already added.
        StringBuilder articleContent = new StringBuilder();
        if(noOfLinks>3) {
        	noOfLinks = 3;
        } else if(noOfLinks<1) {
        	noOfLinks = 1;
        }
        Integer linksInserted = 1;
        boolean isYoutubeLinkInserted = false;
        Pattern p = Pattern.compile(".*?\\.");
        Matcher m;
        for (String unFormattedLine : unFormattedLines) {
            //System.out.println("unFormatted Line : " + unFormattedLine);
            m = p.matcher(unFormattedLine);
            StringBuilder aParagraph = new StringBuilder();
            int sentenceCount = 3;
            while (m.find()) {
                String aSentence = m.group();
                //System.out.println("aSentence : " + aSentence);
                if (sentenceCount > 0) {
                    aParagraph.append(m.group()).append(" ");
                    if (sentenceCount == 3 && noOfLinks > 0) {
                        aParagraph.append(" %LINK").append(linksInserted).append("% ");
                        linksInserted++;
                        noOfLinks--;
                    }
                    sentenceCount--;
                }

                if (sentenceCount <= 0||(sentenceCount > 0 && m.groupCount()<3)) {
                    System.out.println("aParagraph : " + aParagraph.toString());
                    aParagraph.append(System.getProperty("line.separator"));
                    if(!isYoutubeLinkInserted && paragraphCount==youtubePosition) {
                        //aParagraph.append(System.getProperty("line.separator")).append("%YOUTUBE%").append(System.getProperty("line.separator"));
                        isYoutubeLinkInserted = true;
                    }
                    articleContent.append(aParagraph.toString()).append(System.getProperty("line.separator"));
                    aParagraph = new StringBuilder();
                    sentenceCount = 3;
                    paragraphCount++;
                }
            }

        }
        //System.out.println(articleContent.toString());
        anALNArticleFormObject.setArticleContent(articleContent.toString());
    }

    public static Map<String,String> parseURLAndKeyword(String filePath) {
        List<String> lines = TextFileReaderUtils.readLinesAsList(filePath, false);
        Map<String,String> urlAndKeywords = new HashMap<String,String>();
        //System.out.println(lines.size());
        for(int i=0;i<lines.size();i=i+2) {
            //System.out.println(lines.get(i) + " " + lines.get(i+1));
            urlAndKeywords.put(lines.get(i), lines.get(i+1));
        }
        return urlAndKeywords;
    }

    public static String getTagsAsString(List<String> tags) {
        Collections.shuffle(tags);
        return tags.subList(0, 4).toString().replace("[", "").replace("]", "");
    }
    
    public static String getDate(Integer numberOfDaysToIncrement) {
    	String dateAsText = sdf.format(aCalendar.getTime());
    	aCalendar.add(Calendar.DATE, numberOfDaysToIncrement);
    	return dateAsText;
    }
    
    public static void convertALNLinksToCSV (String folderPath) {
		File alnLinkSFolder = new File(folderPath);
		StringBuffer csvString = new StringBuffer();
		csvString.append("Project,Keyword,url,Anchor").append(System.getProperty("line.separator"));
		for(String afileName:alnLinkSFolder.list()) {
			HashMap<String,String> urlandKeywords = (HashMap<String, String>) ALNUtils.parseURLAndKeyword(alnLinkSFolder.getAbsolutePath()+"/"+afileName);
			Set<Entry<String,String>> urlAndKeywordSet = urlandKeywords.entrySet();
			for(Entry<String,String> urlAndKeyword:urlAndKeywordSet) {
				csvString.append(afileName.replaceAll("\\s+-.*" , "")).append(",");
				csvString.append(urlAndKeyword.getValue().replaceFirst("\\|.*", "").replaceAll("\\{", "")).append(",");
				csvString.append(urlAndKeyword.getKey() + "," + urlAndKeyword.getValue()).append(System.getProperty("line.separator"));
			}
       }
	   TextFileWriterUtils.writeString(csvString.toString(), folderPath+"all-links.csv", false);
	}
    
    public static List<ALNArticleFormObject> createALNArticles(String alnProjectFolderPath, String projectTitleBase) {
    	Random randomGenerator = new Random();
    	List<ALNArticleFormObject> ALNArticleFormObjects = new ArrayList<ALNArticleFormObject>();
        File articlesFolder = new File(alnProjectFolderPath + "Articles/");
        Map<String,String> promotedUrlAndKeywords = parseURLAndKeyword(alnProjectFolderPath + "promotedUrlandKeywords.txt");
        Map<String,String> camouflageUrlAndKeywords = parseURLAndKeyword("E:\\Dropbox\\Website Campaigns\\Camouflaged URLs\\camouflage-urlKeywords.txt");
        List<String> tags = TextFileReaderUtils.readLinesAsList(alnProjectFolderPath + "tags.txt",",");
        List<String> youtubeUrls = TextFileReaderUtils.readLinesAsList("E:\\Dropbox\\youtube.txt", true);
        Collections.shuffle(youtubeUrls);
        CyclicIterator<Entry<String,String>> promotedUrlAndKeywordsIterator = new CyclicIterator<Entry<String,String>>(promotedUrlAndKeywords.entrySet());
        CyclicIterator<Entry<String,String>> camouflageUrlAndKeywordsIterator = new CyclicIterator<Entry<String,String>>(camouflageUrlAndKeywords.entrySet());
        //CyclicIterator<String> youtubeUrlsIterator = new CyclicIterator<String>(youtubeUrls);
        Integer projectCounter = 1;
        Boolean isKeywordBold = Boolean.TRUE;
        Integer noOfLinks;
        Integer noOfPromotedLinks;
        for(String anArticleName:articlesFolder.list()) {
            if(anArticleName.contains(".txt")) {
                System.out.println(articlesFolder.getAbsolutePath()+"\\"+anArticleName);
                noOfLinks = 1 + randomGenerator.nextInt(3);
                noOfPromotedLinks = 1 + randomGenerator.nextInt(3);
                ALNArticleFormObject anALNArticleFormObject = new ALNArticleFormObject();
                anALNArticleFormObject.setProjectTitle(projectTitleBase + " " + projectCounter++);
                prepareFormatedArticlesForALN(anALNArticleFormObject, articlesFolder.getAbsolutePath()+"\\"+anArticleName, noOfLinks);
                anALNArticleFormObject.setArticleTags(getTagsAsString(tags));
                Entry<String,String> anUrlKeywordPair = promotedUrlAndKeywordsIterator.next();
                anALNArticleFormObject.setUrl1(anUrlKeywordPair.getKey());
                anALNArticleFormObject.setKeyword1(anUrlKeywordPair.getValue());
                if(noOfLinks>1) {
                	if(noOfPromotedLinks>1) {
                		anUrlKeywordPair = promotedUrlAndKeywordsIterator.next();
                	} else {
                		anUrlKeywordPair = camouflageUrlAndKeywordsIterator.next();
                	}                	
                    anALNArticleFormObject.setUrl2(anUrlKeywordPair.getKey());
                    anALNArticleFormObject.setKeyword2(anUrlKeywordPair.getValue());
                }
                if(noOfLinks>2) {
                	if(noOfPromotedLinks>2) {
                		anUrlKeywordPair = promotedUrlAndKeywordsIterator.next();
                	} else {
                		anUrlKeywordPair = camouflageUrlAndKeywordsIterator.next();
                	}  
                    anALNArticleFormObject.setUrl3(anUrlKeywordPair.getKey());
                    anALNArticleFormObject.setKeyword3(anUrlKeywordPair.getValue());
                }
                anALNArticleFormObject.setIsKeyword1Bold(isKeywordBold);
                //anALNArticleFormObject.setYoutubeUrl(youtubeUrlsIterator.next());
                if(isKeywordBold) {
                    isKeywordBold = Boolean.FALSE;
                } else if(!isKeywordBold) {
                    isKeywordBold = Boolean.TRUE;
                }
                anALNArticleFormObject.setScheduledDate(getDate(1));
                System.out.println(anALNArticleFormObject.getArticleContent());
                ALNArticleFormObjects.add(anALNArticleFormObject);
            }
        }
        return ALNArticleFormObjects;
    }

    public static void main(String args[]) {
    	convertALNLinksToCSV("E:/Dropbox/Website Campaigns/ALN-LINKS/");
    	
//        List<String> tags = TextFileReaderUtils.readLinesAsList("E:/Dropbox/Website Campaigns/GetBackYourExNow.com/ALN Projects/project1/tags.txt",",");
    	/*Random randomGenerator = new Random();
		Integer noOfLinks;
		
        for(int i=0;i<100;i++) {
        	noOfLinks = 1 + randomGenerator.nextInt(3);
    		System.out.println(noOfLinks);
        }*/
        
//    	createALNArticles("E:/Dropbox/Website Campaigns/GetBackYourExNow.com/ALN Projects/project1/", "Get Ex Back - Fifth ",  3);
    }


}
