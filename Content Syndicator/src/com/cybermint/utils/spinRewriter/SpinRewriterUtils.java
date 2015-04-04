package com.cybermint.utils.spinRewriter;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

import com.cybermint.contentSyndicator.sites.spinRewriter.utils.SpinRewriterWebdriverAsAPI;
import com.cybermint.utils.StringUtils;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

public class SpinRewriterUtils {

	static SpinRewriterWebdriverAsAPI aSpinRewriterWebdriverAsAPI;
	public static void main(String args[]) {
		aSpinRewriterWebdriverAsAPI = new SpinRewriterWebdriverAsAPI("pelangs@gmail.com", "123spinrewriter!@#");
		StringBuilder oneAPIRequestArticle = new StringBuilder();
		Integer oneAPIRequestArticleWordCount = 0;
		List<File> articleFiles = new ArrayList<File> ();
		File rootFolder = new File("G:/Scraped Articles In Cycles/");
		for(File projectFolder : rootFolder.listFiles()) {
			File cycleFolder = new File(projectFolder.getAbsoluteFile() + "/Cycle 3");
			for(File articleFile : cycleFolder.listFiles()) {
				String articleString = TextFileReaderUtils.readFileAsString(articleFile.getAbsolutePath());
				oneAPIRequestArticleWordCount = oneAPIRequestArticleWordCount + StringUtils.getNumberOfWords(articleString);
				System.out.println(oneAPIRequestArticleWordCount);
				if(oneAPIRequestArticleWordCount<1000) {
					articleFiles.add(articleFile);
					oneAPIRequestArticle.append(articleString).append(" 0000SEPARATOR0000 ");
				} else {
					//call api request helper function
					constructOneAPIRequestArticle(articleFiles, oneAPIRequestArticle.toString());
					oneAPIRequestArticle = new StringBuilder();
					oneAPIRequestArticleWordCount = 0;
					articleFiles = new ArrayList<File> ();	
					articleFiles.add(articleFile);
					oneAPIRequestArticle.append(articleString).append(" 0000SEPARATOR0000 ");
				}
			}
		}
	}
	
	private static void constructOneAPIRequestArticle(List<File> articleFiles, String oneAPIRequestArticle) {
		/*String emailAddress = "pelangs@gmail.com";
		String apiKey = "f2e06ec#117520a_55ce7f9?b47c97b";
		SpinRewriterAPI aSpinRewriterAPI = new SpinRewriterAPI(emailAddress, apiKey);
		String textWithSpintax = aSpinRewriterAPI.getTextWithSpintax(oneAPIRequestArticle);*/
		String textWithSpintax = aSpinRewriterWebdriverAsAPI.getTextWithSpintax(oneAPIRequestArticle);
		List<String> articles = Arrays.asList(textWithSpintax.split(" 0000SEPARATOR0000 "));
		for(String article : articles) {
			System.out.println("***************An Article with Spintax*****************");
			System.out.println(article);
		}
		for(int i = 0 ; i<articleFiles.size() ; i++) {
			File articleFile = articleFiles.get(i);
			String article = articles.get(i);
			String articleFileName = articleFile.getName();
			String cycleFolderName = articleFile.getParentFile().getName();
			String projectFolderName = articleFile.getParentFile().getParentFile().getName();
			String spunArtileFilePath = "G:/Google Drive/Scraped Articles/Scraped Articles In Cycles Spun/" + projectFolderName + "/" + cycleFolderName + "/" + articleFileName;
			TextFileWriterUtils.writeString(article, spunArtileFilePath, false);
			articleFile.delete();			
		}
	}
}
