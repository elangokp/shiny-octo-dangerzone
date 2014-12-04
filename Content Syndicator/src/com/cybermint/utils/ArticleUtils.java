/**
 * 
 */
package com.cybermint.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.cybermint.contentSyndicator.sites.aln.utils.ALNUtils;

/**
 * @author Elango
 *
 */
public class ArticleUtils {
	
	public static Collection<String> getDescFromScrapedArticles(String folderLocation, Integer minWordsInDesc, Integer maxWordsInDesc, Integer maxDescs) {
		File articlesFolder = new File(folderLocation);
		Set<String> descs = new HashSet<String> ();
		for(String anArticleName:articlesFolder.list()) {
			//System.out.println("Inside for : " + anArticleName);
            if(anArticleName.contains(".txt")) {
            	//System.out.println("Inside for with txt : " + anArticleName);
            	List<String> paragraphs = TextFileReaderUtils.readLinesAsList(articlesFolder.getAbsolutePath()+"/"+anArticleName, true);
            	if(paragraphs.size()>2) {
            		String title = paragraphs.get(0).trim();
            		if(LetterPairSimilarity.compareStrings(title, articlesFolder.getName())>=0.45) {
            				String desc = paragraphs.get(1).replaceAll("\\{", "(").replaceAll("\\}", ")").replaceAll("\\|", "").replaceAll("\\|", "").trim();
                        	Integer wordInDesc = StringUtils.getNumberOfWords(desc);
                        	//System.out.println(desc);
                        	if(wordInDesc>minWordsInDesc && wordInDesc<maxWordsInDesc) {
                        		descs.add(desc);
                        	}        			
            		}                	
            	}            	          	
            }
            if(descs.size()>maxDescs) { //max number of descriptions required.
            	break;
            }
       }
	   if(descs.size()<maxDescs) {
		   for(String anArticleName:articlesFolder.list()) {
				//System.out.println("Inside for : " + anArticleName);
	            if(anArticleName.contains(".txt")) {
	            	//System.out.println("Inside for with txt : " + anArticleName);
	            	List<String> paragraphs = TextFileReaderUtils.readLinesAsList(articlesFolder.getAbsolutePath()+"/"+anArticleName, true);
	            	if(paragraphs.size()>2) {
	            		String title = paragraphs.get(0).trim();
	            		paragraphs.remove(0);
	            		if(LetterPairSimilarity.compareStrings(title, articlesFolder.getName())>=0.45) {
	            			for(String aDesc:paragraphs) {
	            				String desc = aDesc.replaceAll("\\{", "(").replaceAll("\\}", ")").replaceAll("\\|", "").replaceAll("\\|", "").trim();
	                        	Integer wordInDesc = StringUtils.getNumberOfWords(desc);
	                        	//System.out.println(desc);
	                        	if(wordInDesc>minWordsInDesc && wordInDesc<maxWordsInDesc) {
	                        		descs.add(desc);
	                        	}  
	            			}            			
	            		}                	
	            	}            	          	
	            }
	            if(descs.size()>maxDescs) {
	            	break;
	            }
	       }
	   }
	   
	   if(descs.size()<maxDescs) {
		   for(String anArticleName:articlesFolder.list()) {
				//System.out.println("Inside for : " + anArticleName);
	            if(anArticleName.contains(".txt")) {
	            	//System.out.println("Inside for with txt : " + anArticleName);
	            	List<String> paragraphs = TextFileReaderUtils.readLinesAsList(articlesFolder.getAbsolutePath()+"/"+anArticleName, true);
	            	if(paragraphs.size()>2) {
	            		String title = paragraphs.get(0).trim();
	            		double similarity = LetterPairSimilarity.compareStrings(title, articlesFolder.getName());
	            		if(similarity<0.45 && similarity>=0.25) {
	            				String desc = paragraphs.get(1).replaceAll("\\{", "(").replaceAll("\\}", ")").replaceAll("\\|", "").replaceAll("\\|", "").trim();
	                        	Integer wordInDesc = StringUtils.getNumberOfWords(desc);
	                        	//System.out.println(desc);
	                        	if(wordInDesc>minWordsInDesc && wordInDesc<maxWordsInDesc) {
	                        		descs.add(desc);
	                        	}        			
	            		}                	
	            	}            	          	
	            }
	            if(descs.size()>maxDescs) { //max number of descriptions required.
	            	break;
	            }
	       }
		   if(descs.size()<maxDescs) {
			   for(String anArticleName:articlesFolder.list()) {
					//System.out.println("Inside for : " + anArticleName);
		            if(anArticleName.contains(".txt")) {
		            	//System.out.println("Inside for with txt : " + anArticleName);
		            	List<String> paragraphs = TextFileReaderUtils.readLinesAsList(articlesFolder.getAbsolutePath()+"/"+anArticleName, true);
		            	if(paragraphs.size()>2) {
		            		String title = paragraphs.get(0).trim();
		            		paragraphs.remove(0);
		            		double similarity = LetterPairSimilarity.compareStrings(title, articlesFolder.getName());
		            		if(similarity<0.45 && similarity>=0.25) {
		            			for(String aDesc:paragraphs) {
		            				String desc = aDesc.replaceAll("\\{", "(").replaceAll("\\}", ")").replaceAll("\\|", "").replaceAll("\\|", "").trim();
		                        	Integer wordInDesc = StringUtils.getNumberOfWords(desc);
		                        	//System.out.println(desc);
		                        	if(wordInDesc>minWordsInDesc && wordInDesc<maxWordsInDesc) {
		                        		descs.add(desc);
		                        	}  
		            			}            			
		            		}                	
		            	}            	          	
		            }
		            if(descs.size()>maxDescs) {
		            	break;
		            }
		       }
		   }
		   
	   }
		
		return descs;
	}
	
	public static Collection<String> getTitlesFromScrapedArticles(String folderLocation, Integer minWordsInTitle, Integer maxWordsInTitle) {
		File articlesFolder = new File(folderLocation);
		Set<String> titles = new HashSet<String> ();
		for(String anArticleName:articlesFolder.list()) {
			//System.out.println("Inside for : " + anArticleName);
            if(anArticleName.contains(".txt")) {
            	//System.out.println("Inside for with txt : " + anArticleName);
            	List<String> paragraphs = TextFileReaderUtils.readLinesAsList(articlesFolder.getAbsolutePath()+"/"+anArticleName, true);
            	String title = paragraphs.get(0).replaceAll("\\{", "(").replaceAll("\\}", ")").replaceAll("\\|", "").replaceAll("\\|", "").trim();
            	Integer wordInTitle = StringUtils.getNumberOfWords(title);
            	//System.out.println(title);
            	if(wordInTitle >= minWordsInTitle && wordInTitle <= maxWordsInTitle && (LetterPairSimilarity.compareStrings(title, articlesFolder.getName()) > 0.6 || StringUtils.wordsPresentPercentage(title, articlesFolder.getName()) == 1)) {
            		titles.add(title);
            	}            	 	
            }
       }
	   if(titles.size()<20) {
		   for(String anArticleName:articlesFolder.list()) {
				//System.out.println("Inside for : " + anArticleName);
	            if(anArticleName.contains(".txt")) {
	            	//System.out.println("Inside for with txt : " + anArticleName);
	            	List<String> paragraphs = TextFileReaderUtils.readLinesAsList(articlesFolder.getAbsolutePath()+"/"+anArticleName, true);
	            	String title = paragraphs.get(0).replaceAll("\\{", "(").replaceAll("\\}", ")").replaceAll("\\|", "").replaceAll("\\|", "").trim();
	            	Integer wordInTitle = StringUtils.getNumberOfWords(title);
	            	//System.out.println(title);
	            	if(wordInTitle >= minWordsInTitle && wordInTitle <= maxWordsInTitle && (LetterPairSimilarity.compareStrings(title, articlesFolder.getName()) > 0.4)) {
	            		titles.add(title);
	            	}            	 	
	            }
	       }
	   }
		return titles;
	}
	
	public static Map<String, String> getTitles(String scrapedArticlesRootFolderLocation) {
		Map<String, String> keywordTitleSpintaxMap = new HashMap<String, String> ();
		File scrapedArticlesRootFolder = new File(scrapedArticlesRootFolderLocation);
		List<String> titles = new ArrayList<String> ();
		StringBuffer titleSpintax = new StringBuffer();
		for(File afolderLocation:scrapedArticlesRootFolder.listFiles()) {
			if(afolderLocation.isDirectory()) {
				titles = (List<String>) getTitlesFromScrapedArticles(afolderLocation.getAbsolutePath(), 1, 19);
				titleSpintax.append("{");
				for(int i = 0; i<titles.size(); i++) {
					String title = StringUtils.removeThisCharacter(titles.get(i), ",");
					titleSpintax.append(title);
					if(i<titles.size()-1) {
						titleSpintax.append("|");
					}					
				}
				titleSpintax.append("}");
				keywordTitleSpintaxMap.put(afolderLocation.getName(), titleSpintax.toString());
				titleSpintax.setLength(0);
				titles.clear();
			}
		}
		return keywordTitleSpintaxMap;
		
	}
	
	public static Map<String, String> getDesc(String scrapedArticlesRootFolderLocation) {
		Map<String, String> keywordDescSpintaxMap = new HashMap<String, String> ();
		File scrapedArticlesRootFolder = new File(scrapedArticlesRootFolderLocation);
		List<String> descs = new ArrayList<String> ();
		StringBuffer descsInSpintax = new StringBuffer();
		for(File afolderLocation:scrapedArticlesRootFolder.listFiles()) {
			if(afolderLocation.isDirectory()) {
				descs.addAll(getDescFromScrapedArticles(afolderLocation.getAbsolutePath(), 31, 199, 200));
				descsInSpintax.append("{");
				for(int i=0;i<descs.size();i++) {
					String desc = StringUtils.removeThisCharacter(descs.get(i), ",");
					descsInSpintax.append(desc);
					if(i<descs.size()-1) {
						descsInSpintax.append("|");
					}
				}
				descsInSpintax.append("}");				
				keywordDescSpintaxMap.put(afolderLocation.getName(), descsInSpintax.toString());
				descsInSpintax.setLength(0);
				descs.clear();
			}
		}
		return keywordDescSpintaxMap;
	}	
	
	
	public static void writeTitlesAsSpintax(String scrapedArticlesRootFolderLocation) {
		File scrapedArticlesRootFolder = new File(scrapedArticlesRootFolderLocation);
		for(File afolderLocation:scrapedArticlesRootFolder.listFiles()) {
			if(afolderLocation.isDirectory()) {
				List<String> titles = new ArrayList<String> ();
				titles.addAll(getTitlesFromScrapedArticles(afolderLocation.getAbsolutePath(), 1, 19));
				StringBuffer titleSpintax = new StringBuffer();
				titleSpintax.append("{");
				for(int i = 0; i<titles.size(); i++) {
					String title = StringUtils.removeThisCharacter(titles.get(i), ",");
					titleSpintax.append(title);
					if(i<titles.size()-1) {
						titleSpintax.append("|");
					}					
				}
				titleSpintax.append("}");
				TextFileWriterUtils.writeString(titleSpintax.toString(), scrapedArticlesRootFolder.getAbsolutePath() + "/titles/" + afolderLocation.getName() + ".txt", false);
			}
			System.out.println("Titles for " + afolderLocation.getName() + " written.");
		}
		
	}
	
	public static void writeTitles(String scrapedArticlesRootFolderLocation) {
		File scrapedArticlesRootFolder = new File(scrapedArticlesRootFolderLocation);
		for(File afolderLocation:scrapedArticlesRootFolder.listFiles()) {
			if(afolderLocation.isDirectory()) {
				Set<String> titles = (Set<String>) getTitlesFromScrapedArticles(afolderLocation.getAbsolutePath(), 1, 19);
				StringBuffer titlesWithCoeff = new StringBuffer();
				for(String title:titles) {
					title = StringUtils.removeThisCharacter(title, ",");
					titlesWithCoeff.append(title).append(",").append(LetterPairSimilarity.compareStrings(title, afolderLocation.getName()));
					//titlesWithCoeff.append(",").append(StringUtils.doesContainAllWords(title, afolderLocation.getName()));
					titlesWithCoeff.append(",").append(StringUtils.wordsPresentPercentage(title, afolderLocation.getName()));
					titlesWithCoeff.append(System.getProperty("line.separator"));
				}
				TextFileWriterUtils.writeString(titlesWithCoeff.toString(), scrapedArticlesRootFolder.getAbsolutePath() + "/titles/" + afolderLocation.getName() + ".csv", false);
			}
			System.out.println("Titles for " + afolderLocation.getName() + " written.");
		}
		
	}
	
	public static void writeDescAsSpintax(String scrapedArticlesRootFolderLocation) {
		File scrapedArticlesRootFolder = new File(scrapedArticlesRootFolderLocation);
		List<String> descs = new ArrayList<String> ();
		StringBuffer descsInSpintax = new StringBuffer();
		for(File afolderLocation:scrapedArticlesRootFolder.listFiles()) {
			if(afolderLocation.isDirectory()) {
				descs.addAll(getDescFromScrapedArticles(afolderLocation.getAbsolutePath(), 31, 199, 200));
				descsInSpintax.append("{");
				for(int i=0;i<descs.size();i++) {
					String desc = StringUtils.removeThisCharacter(descs.get(i), ",");
					descsInSpintax.append(desc);
					if(i<descs.size()-1) {
						descsInSpintax.append("|");
					}
				}
				descsInSpintax.append("}");				
				TextFileWriterUtils.writeString(descsInSpintax.toString(), scrapedArticlesRootFolder.getAbsolutePath() + "/descs/" + afolderLocation.getName() + ".txt", false);
				descsInSpintax.setLength(0);
				descs.clear();
			}
			System.out.println("Descs for " + afolderLocation.getName() + " written.");
		}
		
	}
	
	public static void main (String args[]) {
		writeTitlesAsSpintax("G:/Dropbox/Website Campaigns/00.GetBackYourExNow.com/For Article Scraping/");
		writeDescAsSpintax("G:/Dropbox/Website Campaigns/00.GetBackYourExNow.com/For Article Scraping/");
	}
	
	

}
