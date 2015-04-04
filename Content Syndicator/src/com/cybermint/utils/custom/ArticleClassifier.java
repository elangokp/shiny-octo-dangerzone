package com.cybermint.utils.custom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cybermint.contentSyndicator.sites.aln.utils.ALNUtils;
import com.cybermint.utils.StringUtils;
import com.cybermint.utils.TextFileFilter;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class ArticleClassifier {

	static Map<String,String> camoUrlAndKeywords = new HashMap<String, String> ();
	static List<String> urls = new ArrayList<String> ();
	
	/**
	 * @param args
	 */
	public static void main2(String[] args) {
		String scrapedArticlesFolderPath = "G:/Scraped Articles/Scraped Articles";
		String scrapedArticlesReorganizedFolderPath = "G:/Scraped Articles Reorganized Full";
		File scrapedArticlesFolder = new File(scrapedArticlesFolderPath);
		File scrapedArticlesReorganizedFolder = new File(
				scrapedArticlesReorganizedFolderPath);
		scrapedArticlesReorganizedFolder.mkdir();
		List<String> csvLines = TextFileReaderUtils
				.readLinesAsList(
						"G:/Dropbox/Website Campaigns/ALN-LINKS/all-links.csv",
						true);
		List<List<String>> urlsWithProperties = new ArrayList<List<String>>();
		for (int i = 1; i < csvLines.size(); i++) {
			urlsWithProperties.add(Arrays.asList(csvLines.get(i).split(",")));
		}
		for(List<String> anUrlWithProperties : urlsWithProperties) {
			String projectName = anUrlWithProperties.get(0).trim();
			String primaryKeyword = anUrlWithProperties.get(1).trim();
			File scrapedArticlesProjectFolder = new File(scrapedArticlesReorganizedFolder.getAbsolutePath() + "/" +projectName);
			File scrapedArticlesKeywordFolder = new File(scrapedArticlesFolder.getAbsolutePath() + "/" +primaryKeyword);
			try {
				copyDirectory(scrapedArticlesKeywordFolder, scrapedArticlesProjectFolder);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main1(String args[]) {
		organizeInCycles();
	}
	
	public static void organizeInCycles() {
		String scrapedArticlesReorganizedFolderPath = "G:/Scraped Articles Reorganized Full";
		File scrapedArticlesReorganizedFolder = new File(scrapedArticlesReorganizedFolderPath);
		String scrapedArticlesInCyclesFolderPath = "G:/Scraped Articles In Cycles";
		File scrapedArticlesInCyclesFolder = new File(scrapedArticlesInCyclesFolderPath);
		scrapedArticlesInCyclesFolder.mkdir();
		File[] projectFolders = scrapedArticlesReorganizedFolder.listFiles();
		for(File aProjectFolder : projectFolders) {
			File projectFolderForCycles = new File(scrapedArticlesInCyclesFolder.getAbsolutePath() + "/" + aProjectFolder.getName());
			projectFolderForCycles.mkdir();
			File[] articleFiles = aProjectFolder.listFiles();
			Integer cycleCount = 1;
			Integer articleCount = 0;
			for(File anArticleFile : articleFiles) {
				File cycleFolderInProject = new File(projectFolderForCycles.getAbsolutePath() + "/Cycle " + cycleCount);
				cycleFolderInProject.mkdir();
				try {
					copyFile(anArticleFile , new File(cycleFolderInProject.getAbsolutePath() + "/" + anArticleFile.getName()));
				} catch (IOException e) {
					e.printStackTrace();
				}
				articleCount++;
				if(articleCount%20 == 0) {
					cycleCount++;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		//String spunArticle = spinAllArticlesInAFolder("G:/Scraped Articles In Cycles/01.Cure Tinnitus/Cycle 1");
		//TextFileWriterUtils.writeString(spunArticle, "G:/Scraped Articles In Cycles/01.Cure Tinnitus/Cycle 1/super-spin.txt");
		String projectName = "00 Get Ex Back";
		String cycleNumber = "20";
		String spunArticlesFolderPath = "G:/Google Drive/Scraped Articles/Scraped Articles In Cycles Spun/" + projectName + "/Cycle " + cycleNumber + "/";
		String superSpunCycleProjectFolderPath = "G:/Google Drive/Scraped Articles/Scraped Articles In Cycles Super Spun/Cycle " + cycleNumber + "/";
		String dilutionSuperSpunCycleProjectFolderPath = "G:/Google Drive/Scraped Articles/Scraped Articles Super Spun Dilution/" + projectName + "/";
		String gsaSuperSpunCycleProjectFolderPath = "G:/Google Drive/Scraped Articles/Scraped Articles Super Spun GSA/" + projectName + "/";
		String superSpunFilePath = superSpunCycleProjectFolderPath + projectName + "-Cycle " + cycleNumber + "-super-spin.txt";
		String dilutionSuperSpunFilePath = dilutionSuperSpunCycleProjectFolderPath + projectName + "-Cycle " + cycleNumber + "-super-spin.txt";
		String gsaSuperSpunFilePath = gsaSuperSpunCycleProjectFolderPath + projectName + "-Cycle " + cycleNumber + "-super-spin.txt";
		//String articleSpunFilePath = superSpunCycleProjectFolderPath + projectName + "-Cycle 4-article-spin.txt";
		//String paragraphSpunFilePath = superSpunCycleProjectFolderPath + projectName + "-Cycle 4-para-spin.txt";
		//String projectMlinkText = TextFileReaderUtils.readFileAsString("G:/Dropbox/Website Campaigns/Promotion Metadata/Links with Anchor  by Project/" + projectName + ".txt");
		//String projectDilutionLinkText = TextFileReaderUtils.readFileAsString("G:/Dropbox/Website Campaigns/Promotion Metadata/Dilution links by project-with url anchors/" + projectName + ".txt");
		String projectDilutionLinkText = TextFileReaderUtils.readFileAsString("G:/Dropbox/Website Campaigns/Promotion Metadata/Dilution links by project-with url anchors/00 GBYEN.txt");
		List<List<String>> listOfArticles = getArticlesAsListOfParagraphs(spunArticlesFolderPath);
		String titles = spinTitles(listOfArticles);
		String spinByArticles = spinByArticles(listOfArticles);
		String spinByParagraphs = spinByParagraphs(listOfArticles);
		StringBuilder totalSpun = new StringBuilder();
		//StringBuilder articleSpun = new StringBuilder();
		//StringBuilder paraSpun = new StringBuilder();
		totalSpun.append(titles);
		totalSpun.append(System.getProperty("line.separator"));
		totalSpun.append(System.getProperty("line.separator"));		
		totalSpun.append("{").append(spinByParagraphs).append("|").append(spinByArticles).append("}");
		loadCamoLinks();
		String totalSpunString = totalSpun.toString();
		//totalSpunString = totalSpunString.replaceAll("%MLINK%", Matcher.quoteReplacement(projectMlinkText));
		//totalSpunString = totalSpunString.replaceAll("%MLINK%", Matcher.quoteReplacement(projectDilutionLinkText));
		totalSpunString = totalSpunString.replaceAll("%MLINK%", Matcher.quoteReplacement("<a href=\"%url%\">{%url%|%anchor_text%|%anchor_text%|%anchor_text%|%anchor_text%}</a>"));
		Pattern p = Pattern.compile("%CLINK%");
		Matcher m = p.matcher(totalSpunString);
		StringBuffer camoReplacedTotalSpun = new StringBuffer();
		 while (m.find()) {
			 String camoLinks = camoReplacedTotalSpun();
			 System.out.println(camoLinks);
		     m.appendReplacement(camoReplacedTotalSpun, Matcher.quoteReplacement(camoLinks));
		 }
		 m.appendTail(camoReplacedTotalSpun);
		//TextFileWriterUtils.writeString(camoReplacedTotalSpun.toString(), superSpunFilePath);
		//TextFileWriterUtils.writeString(camoReplacedTotalSpun.toString(), dilutionSuperSpunFilePath);
		TextFileWriterUtils.writeString(camoReplacedTotalSpun.toString(), gsaSuperSpunFilePath, false, false);
	}
	
	public static void loadCamoLinks() {
		File camoUrlKeywordsFolder = new File("G:/Dropbox/Website Campaigns/Camouflaged URLs/urlKeywords");
		for(File aCamoFile : camoUrlKeywordsFolder.listFiles(new TextFileFilter())) {
			camoUrlAndKeywords.putAll(ALNUtils.parseURLAndKeyword(aCamoFile.getAbsolutePath()));
		}
		urls.addAll(camoUrlAndKeywords.keySet());		
	}
	
	public static String camoReplacedTotalSpun() {
		Collections.shuffle(urls);
		Collections.shuffle(urls);
		Collections.shuffle(urls);
		Collections.shuffle(urls);
		Collections.shuffle(urls);
		Collections.shuffle(urls);
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		sb.append("{");
		for(int i = 0; i<30; i++) {
			sb.append("<a href=\"").append(urls.get(i)).append("\">");
			sb.append(camoUrlAndKeywords.get(urls.get(i)));
			sb.append("</a>");
			if(i<29) {
				sb.append("|");
			}
		}
		sb.append("}");
		sb.append("|");
		Collections.shuffle(urls);
		sb.append("{");
		for(int i = 0; i<30; i++) {
			sb.append(urls.get(i));
			if(i<29) {
				sb.append("|");
			}
		}
		sb.append("}");
		sb.append("|");
		Collections.shuffle(urls);
		sb.append("{");
		for(int i = 0; i<30; i++) {
			sb.append("<a href=\"").append(urls.get(i)).append("\">");
			sb.append(camoUrlAndKeywords.get(urls.get(i)));
			sb.append("</a>");
			if(i<29) {
				sb.append("|");
			}
		}
		sb.append("}");
		sb.append("|");
		sb.append("}");
		return sb.toString();
	}
	
	public static List<List<String>> getArticlesAsListOfParagraphs(String folderPath) {
		File givenFolder = new File(folderPath);
		File[] articleFiles = givenFolder.listFiles(new TextFileFilter());
		List<List<String>> listOfArticles = new ArrayList<List<String>> ();
		if(null != articleFiles && articleFiles.length>0) {
			for(File anArticle : articleFiles) {
				List<String> paragraphsInAnArticle = TextFileReaderUtils.readLinesAsList(anArticle.getAbsolutePath(), true);
				listOfArticles.add(paragraphsInAnArticle);
			}
		}		
		return listOfArticles;
	}
	
	public static String spinTitles(List<List<String>> listOfArticles) {
		StringBuffer titles = new StringBuffer();
		titles.append("{");
		for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {
			titles.append(listOfArticles.get(articleNumber).get(0));
			if(articleNumber<listOfArticles.size()-1) {
				titles.append("|");
			}
		}
		titles.append("}");
		return titles.toString();
	}
	
	public static String spinDescs(List<List<String>> listOfArticles) {
		StringBuffer descs = new StringBuffer();
		descs.append("{");
		for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {
			for(int paraNumber=1 ; paraNumber<listOfArticles.get(articleNumber).size() ; paraNumber++) {
				String desc = listOfArticles.get(articleNumber).get(paraNumber);
				Integer wordInDesc = StringUtils.getNumberOfWords(desc);
				if(wordInDesc>35){
					descs.append(desc);
					if(articleNumber<listOfArticles.size()-1) {
						descs.append("|");
					}
				}
				
			}			
		}
		descs.append("}");
		return descs.toString();
	}
	
	public static String spinByArticles(List<List<String>> listOfArticles) {
		StringBuffer articleSpun = new StringBuffer();
		Random randomGenerator = new Random();		
		articleSpun.append("{");
		//paraNumber starts from 1 to ignore the first para, which will be the title of the article.
		for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {		
			randomGenerator = new Random();
			Boolean shouldIncludeCamouflage = ALNUtils.isTrue(4);
			Integer mainLinkPosition = 1 + randomGenerator.nextInt(listOfArticles.get(articleNumber).size()-1);
			Integer camoLinkPosition = 1 + randomGenerator.nextInt(listOfArticles.get(articleNumber).size()-1);
			System.out.println("Main Link Position for article number : " + articleNumber + " is : " + mainLinkPosition);
			System.out.println("Camo Link Position for article number : " + articleNumber + " is : " + camoLinkPosition);
			System.out.println("shouldIncludeCamouflage : " + shouldIncludeCamouflage);
			System.out.println("Number of paras : " + listOfArticles.get(articleNumber).size());
			for(int paraNumber = 1; paraNumber<listOfArticles.get(articleNumber).size(); paraNumber++) {
				String thisPara = listOfArticles.get(articleNumber).get(paraNumber);
				if(mainLinkPosition == paraNumber){
					thisPara = ALNUtils.insertLinkHolder(thisPara, "%MLINK%");
					System.out.println("MLINK added in paranumber : " + paraNumber + " in article number : " + articleNumber);
				}
				if(shouldIncludeCamouflage && camoLinkPosition == paraNumber){
					thisPara = ALNUtils.insertLinkHolder(thisPara, "%CLINK%");
					System.out.println("CLINK added in paranumber : " + paraNumber + " in article number : " + articleNumber);
				}
				articleSpun.append(thisPara);
				if(paraNumber<listOfArticles.get(articleNumber).size()-1) {
					articleSpun.append(System.getProperty("line.separator"));
					articleSpun.append(System.getProperty("line.separator"));
				}				
			}
			if(articleNumber<listOfArticles.size()-1) {
				articleSpun.append("|");
			}
		}
		articleSpun.append("}");
		return articleSpun.toString();
	}
	
	public static String spinByParagraphs(List<List<String>> listOfArticles) {
		StringBuffer paragraphSpun = new StringBuffer();
		Integer maxParagraphsInAnArticle = 0;
		Integer minParagraphsInAnArticle = 0;
		Integer avgParagraphsInAnArticle = 0;
		Random randomGenerator = new Random();
		Boolean shouldIncludeCamouflage = ALNUtils.isTrue(4);
		Boolean linkInsideParagraph = true;
		
		for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {
			if(maxParagraphsInAnArticle<listOfArticles.get(articleNumber).size()) {
				maxParagraphsInAnArticle = listOfArticles.get(articleNumber).size();
			}
			if(minParagraphsInAnArticle>listOfArticles.get(articleNumber).size()) {
				minParagraphsInAnArticle = listOfArticles.get(articleNumber).size();
			}
		}
		
		avgParagraphsInAnArticle = (minParagraphsInAnArticle + maxParagraphsInAnArticle)/2;
		Integer mainLinkPosition = 1 + randomGenerator.nextInt(avgParagraphsInAnArticle);
		Integer camoLinkPosition = 1 + randomGenerator.nextInt((avgParagraphsInAnArticle + maxParagraphsInAnArticle)/2);
		if(camoLinkPosition.equals(mainLinkPosition)) {
			camoLinkPosition = camoLinkPosition+1;
		}
		
		Integer linkContextPercentage = 1 + randomGenerator.nextInt(10);
		if(linkContextPercentage>7) {
			linkInsideParagraph = false;
		} else {
			linkInsideParagraph = true;
		}
		
		//paraNumber starts from 1 to ignore the first para, which will be the title of the article.
		for(int paraNumber = 1; paraNumber<maxParagraphsInAnArticle; paraNumber++) {
			paragraphSpun.append("{");
			for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {
				Boolean isParaAppended = false;
				if(paraNumber<listOfArticles.get(articleNumber).size()) {
					String para  = listOfArticles.get(articleNumber).get(paraNumber);
					if(linkInsideParagraph) {
						if(mainLinkPosition == paraNumber){
							para = insertLinkinSpunParagraph(para, "%MLINK%");
						}
					}
					paragraphSpun.append(para);
					paragraphSpun.append(System.getProperty("line.separator"));
					paragraphSpun.append(System.getProperty("line.separator"));
					isParaAppended = true;
				}
				if(articleNumber<listOfArticles.size()-1) {
					paragraphSpun.append("|");
				}
				if(linkInsideParagraph) {
					if(mainLinkPosition == paraNumber && !isParaAppended){
						if(String.valueOf(paragraphSpun.charAt(paragraphSpun.length()-1)).equalsIgnoreCase("|")) {
							paragraphSpun.deleteCharAt(paragraphSpun.length()-1);
						}
					}
				}
			}
			paragraphSpun.append("}");
			if(!linkInsideParagraph) {
				if(mainLinkPosition == paraNumber){
					paragraphSpun.append(System.getProperty("line.separator"));
					paragraphSpun.append(System.getProperty("line.separator"));
					paragraphSpun.append("%MLINK%");
					paragraphSpun.append(System.getProperty("line.separator"));
					paragraphSpun.append(System.getProperty("line.separator"));
				}				
			}
			
			if(shouldIncludeCamouflage && camoLinkPosition == paraNumber){
				paragraphSpun.append(System.getProperty("line.separator"));
				paragraphSpun.append(System.getProperty("line.separator"));
				paragraphSpun.append("%CLINK%");
				paragraphSpun.append(System.getProperty("line.separator"));
				paragraphSpun.append(System.getProperty("line.separator"));
			}
			
		}
		return paragraphSpun.toString();
	}
	
	public static String insertLinkinSpunParagraph(String givenSpunString, String linkString){
		char[] givenSpunChars = givenSpunString.toCharArray();
		StringBuffer linkInsertedStringBuffer = new StringBuffer();
		Integer insideSpunLevel = 0;
		Integer numberOfSpinsClosed = 0;
		Boolean isLinkInserted = false;
		Random randomGenerator = new Random();
		Integer linkPosition = 1 + randomGenerator.nextInt(8);
		for(char aCharacter : givenSpunChars) {
			if(String.valueOf(aCharacter).equalsIgnoreCase("{")) {
				insideSpunLevel++;
			}
			if(String.valueOf(aCharacter).equalsIgnoreCase("}")) {
				insideSpunLevel--;
				if(insideSpunLevel ==  0) {
					numberOfSpinsClosed++;
				}
			}
			linkInsertedStringBuffer.append(aCharacter);
			if(numberOfSpinsClosed == linkPosition && insideSpunLevel == 0 && !isLinkInserted) {
				linkInsertedStringBuffer.append(" " + linkString + " ");
				isLinkInserted = true;
			}
		}
		
		if(!isLinkInserted){
			linkInsertedStringBuffer.append(" " + linkString + " ");
		}
		
		return linkInsertedStringBuffer.toString();
	}
	
	public static String spinAllArticlesInAFolder(String folderPath) {
		File givenFolder = new File(folderPath);
		File[] articleFiles = givenFolder.listFiles();
		List<List<String>> listOfArticles = new ArrayList<List<String>> ();
		StringBuffer totalSpun = new StringBuffer();
		for(File anArticle : articleFiles) {
			List<String> paragraphsInAnArticle = TextFileReaderUtils.readLinesAsList(anArticle.getAbsolutePath(), true);
			listOfArticles.add(paragraphsInAnArticle);
		}
		Integer maxParagraphsInAnArticle = 0;
		StringBuffer titles = new StringBuffer();
		titles.append("{");
		for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {
			titles.append(listOfArticles.get(articleNumber).get(0));
			if(articleNumber<listOfArticles.size()-1) {
				titles.append("|");
			}
			if(maxParagraphsInAnArticle<listOfArticles.get(articleNumber).size()) {
				maxParagraphsInAnArticle = listOfArticles.get(articleNumber).size();
			}
			listOfArticles.get(articleNumber).remove(0);
		}
		titles.append("}");
		
		StringBuffer paragraphSpun = new StringBuffer();
		List<List<String>> listOfParagraphsReorganized = new ArrayList<List<String>> ();
		
		for(int paraNumber = 0; paraNumber<maxParagraphsInAnArticle; paraNumber++) {
			List<String> paragraphsInAPosition = new ArrayList<String> ();
			for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {
				if(paraNumber<listOfArticles.get(articleNumber).size()) {
					paragraphsInAPosition.add(listOfArticles.get(articleNumber).get(paraNumber));
				}
			}
			listOfParagraphsReorganized.add(paragraphsInAPosition);
		}
		
		for(int i = 0; i<listOfParagraphsReorganized.size(); i++) {
			paragraphSpun.append("{");
			for(int j = 0; j<listOfParagraphsReorganized.get(i).size(); j++) {
				paragraphSpun.append(listOfParagraphsReorganized.get(i).get(j));
				if(j<listOfParagraphsReorganized.get(i).size()-1) {
					paragraphSpun.append("|");
				}
			}
			paragraphSpun.append("}");
			paragraphSpun.append(System.getProperty("line.separator"));
			paragraphSpun.append(System.getProperty("line.separator"));
		}
		
		
		
		StringBuffer articleSpun = new StringBuffer();
		articleSpun.append("{");
		for(int articleNumber =0 ; articleNumber<listOfArticles.size() ; articleNumber++) {			
			for(int paraNumber = 0; paraNumber<listOfArticles.get(articleNumber).size(); paraNumber++) {
				articleSpun.append(listOfArticles.get(articleNumber).get(paraNumber));
				if(paraNumber<listOfArticles.get(articleNumber).size()-1) {
					articleSpun.append(System.getProperty("line.separator"));
					articleSpun.append(System.getProperty("line.separator"));
				}				
			}
			if(articleNumber<listOfArticles.size()-1) {
				articleSpun.append("|");
			}
		}
		articleSpun.append("}");
		System.out.println(titles.toString());
		totalSpun.append(titles.toString());
		totalSpun.append(System.getProperty("line.separator"));
		totalSpun.append(System.getProperty("line.separator"));
		totalSpun.append("{");
		totalSpun.append(paragraphSpun.toString());
		totalSpun.append("|");
		totalSpun.append(articleSpun.toString());
		totalSpun.append("}");		
		return totalSpun.toString();
	}

	public static void copyDirectory(File sourceDir, File destDir)
			throws IOException {

		if (!destDir.exists()) {

			destDir.mkdirs();

		}
		System.out.println("sourceDir : " + sourceDir.getAbsolutePath());
		System.out.println("destDir : " + destDir.getAbsolutePath());
		File[] children = sourceDir.listFiles();

		for (File sourceChild : children) {

			String name = sourceChild.getName();

			File destChild = new File(destDir, name);

			if (sourceChild.isDirectory()) {

				copyDirectory(sourceChild, destChild);

			}

			else {

				copyFile(sourceChild, destChild);

			}

		}

	}

	public static void copyFile(File source, File dest) throws IOException {

		if (!dest.exists()) {

			dest.createNewFile();

		}

		InputStream in = null;

		OutputStream out = null;

		try {

			in = new FileInputStream(source);

			out = new FileOutputStream(dest);

			byte[] buf = new byte[1024];

			int len;

			while ((len = in.read(buf)) > 0) {

				out.write(buf, 0, len);

			}

		}

		finally {

			in.close();

			out.close();

		}

	}

	public static boolean delete(File resource) throws IOException {

		if (resource.isDirectory()) {

			File[] childFiles = resource.listFiles();

			for (File child : childFiles) {

				delete(child);

			}

		}

		return resource.delete();

	}

}
