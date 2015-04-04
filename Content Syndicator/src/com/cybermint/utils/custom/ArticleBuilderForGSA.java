package com.cybermint.utils.custom;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class ArticleBuilderForGSA {

	public ArticleBuilderForGSA() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		String projectsParentFolder = "G:/Scraped Articles Reorganized Sanitized Spun/";
		File projectsParentFolderAsFile = new File(projectsParentFolder);
		File[] projectFolders = projectsParentFolderAsFile.listFiles();
		for(File aProjectFolder : projectFolders) {
			
			String projectName = aProjectFolder.getName();
			
			//String spunArticlesFolderPath = "G:/Google Drive/Scraped Articles/Scraped Articles In Cycles Spun/" + projectName + "/";
			String spunArticlesFolderPath = projectsParentFolder + projectName + "/done/";
			String gsaSuperSpunProjectFolderPath = "G:/Scraped Articles Super Spun GSA/" + projectName + "/";
			String gsaSuperSpunProjectArticleFolderPath = gsaSuperSpunProjectFolderPath + "articles/";
			List<List<String>> listOfArticles = ArticleClassifier.getArticlesAsListOfParagraphs(spunArticlesFolderPath);
			if(null == listOfArticles || listOfArticles.size()<1) {
				System.out.println("No spun articles found at : " + spunArticlesFolderPath);
				continue;
			}
			ArticleClassifier.loadCamoLinks();
			for(Integer i=0; i<listOfArticles.size()/10; i++){
				String cycleNumber = i.toString();
				Collections.shuffle(listOfArticles);
				List<List<String>> subsetOflistOfArticles = listOfArticles.subList(0, 20);
				String gsaSuperSpunProjectArticleFilePath = gsaSuperSpunProjectArticleFolderPath + projectName + "-Cycle " + cycleNumber + "-super-spin.txt";	
				String gsaSuperSpunProjectTitleFilePath = gsaSuperSpunProjectFolderPath + "titles/" + projectName + "-Cycle " + cycleNumber + "-titles.txt";
				String gsaSuperSpunProjectDescFilePath = gsaSuperSpunProjectFolderPath + "descs/" + projectName + "-Cycle " + cycleNumber + "-descs.txt";
				String titles = ArticleClassifier.spinTitles(subsetOflistOfArticles);
				String descs = ArticleClassifier.spinDescs(subsetOflistOfArticles);
				String spinByParagraphs = ArticleClassifier.spinByParagraphs(subsetOflistOfArticles);
				String spinByParagraphsString = spinByParagraphs.toString();
				spinByParagraphsString = spinByParagraphsString.replaceAll("%MLINK%", Matcher.quoteReplacement("<a href=\"%url%\">{%url%|%anchor_text%|%anchor_text%|%anchor_text%|%anchor_text%}</a>"));
				Pattern p = Pattern.compile("%CLINK%");
				Matcher m = p.matcher(spinByParagraphsString);
				StringBuffer camoReplacedTotalSpun = new StringBuffer();
				 while (m.find()) {
					 String camoLinks = ArticleClassifier.camoReplacedTotalSpun();
					 //System.out.println(camoLinks);
				     m.appendReplacement(camoReplacedTotalSpun, Matcher.quoteReplacement(camoLinks));
				 }
				 m.appendTail(camoReplacedTotalSpun);
				TextFileWriterUtils.writeString(camoReplacedTotalSpun.toString(), gsaSuperSpunProjectArticleFilePath, false, false);
				TextFileWriterUtils.writeString(titles, gsaSuperSpunProjectTitleFilePath, false, false);
				TextFileWriterUtils.writeString(descs, gsaSuperSpunProjectDescFilePath, false, false);
			}
		}
				
		
	}

}
