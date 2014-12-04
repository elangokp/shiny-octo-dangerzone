/**
 * 
 */
package com.cybermint.utils.spinRewriter;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;

import com.cybermint.utils.StringUtils;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Files;

/**
 * @author Elango
 *
 */
public class SpinRewriterAPI {

	String apiUrl;
	Map<String,String> data = new HashMap<String, String>();
	Map<String,String> response = new HashMap<String, String>();
	
	public SpinRewriterAPI(String emailAddress, String apiKey) {
		data.put("email_address", emailAddress);
		data.put("api_key", apiKey);
		apiUrl = "http://www.spinrewriter.com/action/api";
	}
	
	public String getQuota() {
		data.put("action", "api_quota");
		this.makeRequest();
		return this.response.get("response");
	}
	
	public String getTextWithSpintax(String text) {
		data.put("action", "text_with_spintax");
		data.put("text", text);
		this.makeRequest();
		return this.response.get("response");
	}
	
	public String getUniqueVariation(String text) {
		data.put("action", "unique_variation");
		data.put("text", text);
		this.makeRequest();
		return this.response.get("response");
	}
	
	public String getUniqueVariationFromSpintax(String text) {
		data.put("action", "unique_variation_from_spintax");
		data.put("text", text);
		this.makeRequest();
		return this.response.get("response");
	}
	
	/**
	 * Sets the confidence level of the One-Click Rewrite process.
	 * @param $confidence_level ('low', 'medium', 'high')
	 */
	public void setConfidenceLevel(String confidenceLevel) {
		data.put("confidence_level", "unique_variation_from_spintax");
	}
	
	/**
	 * Sets whether the One-Click Rewrite process uses nested spinning syntax (multi-level spinning) or not.
	 * @param $nested_spintax boolean
	 */
	public void setNestedSpintax(Boolean shouldSet) {
		if (shouldSet) {
			data.put("nested_spintax", "true");
		} else {
			data.put("nested_spintax", "false");
		}
	}
	
	/**
	 * Sets whether Spin Rewriter rewrites complete sentences on its own.
	 * @param $auto_sentences boolean
	 */
	public void setAutoSentences(Boolean shouldSet) {
		if (shouldSet) {
			data.put("auto_sentences", "true");
		} else {
			data.put("auto_sentences", "false");
		}
	}
	
	/**
	 * Sets whether Spin Rewriter rewrites entire paragraphs on its own.
	 * @param $auto_paragraphs boolean
	 */
	public void setAutoParagraphs(Boolean shouldSet) {
		if (shouldSet) {
			data.put("auto_paragraphs", "true");
		} else {
			data.put("auto_paragraphs", "false");
		}
	}
	
	/**
	 * Sets whether Spin Rewriter writes additional paragraphs on its own.
	 * @param $auto_new_paragraphs boolean
	 */
	public void setAutoNewParagraphs(Boolean shouldSet) {
		if (shouldSet) {
			data.put("auto_new_paragraphs", "true");
		} else {
			data.put("auto_new_paragraphs", "false");
		}
	}
	
	/**
	 * Sets the desired spintax format to be used with the returned spun text.
	 * @param $spintax_format ('{|}', '{~}', '[|]', '[spin]')
	 */
	public void  setSpintaxFormat(String spintaxFormat) {
		data.put("spintax_format", spintaxFormat);
	}
	
	private void makeRequest() {		
		try {
			URL requestURL = new URL(apiUrl);
			String parameters = "";
			HttpURLConnection aConnection = (HttpURLConnection) requestURL.openConnection();
			aConnection.setRequestMethod("POST");
			for(Entry<String,String> anEntry : data.entrySet()) {
				parameters = parameters + anEntry.getKey() + "=" + URLEncoder.encode(anEntry.getValue(), "UTF-8") + "&";
			}
			aConnection.setDoOutput(true);
		    OutputStreamWriter wr = new OutputStreamWriter(aConnection.getOutputStream());
		    wr.write(parameters);
		    wr.flush();
		    InputStream in = aConnection.getInputStream();
		    String json = IOUtils.toString(in, "UTF-8");
			this.response = new ObjectMapper().readValue(json, HashMap.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void main (String args[]) {
		String emailAddress = "pelangs@gmail.com";
		String apiKey = "f2e06ec#117520a_55ce7f9?b47c97b";
		SpinRewriterAPI aSpinRewriterAPI = new SpinRewriterAPI(emailAddress, apiKey);
		String cycleNumber = "20";
		String projectName = "00 Get Ex Back";
		File sourceArticlesRootFolder = new File("G:/Scraped Articles In Cycles/" + projectName + "/Cycle " + cycleNumber + "/");
		File spunArticlesRootFolder = new File("G:/Google Drive/Scraped Articles/Scraped Articles In Cycles Spun/" + projectName + "/Cycle " + cycleNumber + "/");
		File spunDoneArticlesFolder = new File("G:/Scraped Articles In Cycles - Spun Done/" + projectName + "/Cycle " + cycleNumber + "/");
		for(File articleFile : sourceArticlesRootFolder.listFiles()) {
			String quota = aSpinRewriterAPI.getQuota();
			System.out.println(quota);
			if(quota.contains("API quota exceeded")) {
				break;
			}
			String articleString = TextFileReaderUtils.readFileAsString(articleFile.getAbsolutePath());
			String articleWithSpintax = aSpinRewriterAPI.getTextWithSpintax(articleString.toString());
			if(StringUtils.getNumberOfWords(articleWithSpintax)>50) {
				String spunArtileFilePath = spunArticlesRootFolder.getAbsolutePath() + "/[Spun] " + articleFile.getName();
				TextFileWriterUtils.writeString(articleWithSpintax, spunArtileFilePath, false);
				File spunDoneArticlesFolderArticleFile = new File(spunDoneArticlesFolder.getAbsolutePath() + "/" + articleFile.getName());
				spunDoneArticlesFolderArticleFile.getParentFile().mkdirs();
				try {
					Files.move(articleFile, spunDoneArticlesFolderArticleFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
				//articleFile.delete();	
			}			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
