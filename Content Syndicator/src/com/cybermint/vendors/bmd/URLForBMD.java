/**
 * 
 */
package com.cybermint.vendors.bmd;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cybermint.utils.ArticleUtils;
import com.cybermint.utils.StringUtils;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;

/**
 * @author Elango
 *
 */
public class URLForBMD {

	private String type;
	
	private String url;
	
	private String title;
	
	private String tags;
	
	private String description;
	
	private String categories;
	
	private String is_money_site;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the categories
	 */
	public String getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(String categories) {
		this.categories = categories;
	}
	/**
	 * @return the is_money_site
	 */
	public String getIs_money_site() {
		return is_money_site;
	}
	/**
	 * @param isMoneySite the is_money_site to set
	 */
	public void setIs_money_site(String isMoneySite) {
		is_money_site = isMoneySite;
	}
	
	public static String spintaxParse(Random rand, String s, List<String> spintaxes)
    {
        if(s.contains("{")) {
            int closingBracePosition = s.indexOf("}");
            //System.out.println("closingBracePosition : " + closingBracePosition);
            int openingBracePosition = closingBracePosition;
            //System.out.println("openingBracePosition : " + openingBracePosition);

            while(!Character.toString(s.charAt(openingBracePosition)).equals("{")) {
            	openingBracePosition--;
            }
            //System.out.println("openingBracePosition After loop: " + openingBracePosition);
            String spintaxBlock = s.substring(openingBracePosition, closingBracePosition + 1 );
            //System.out.println(spintaxBlock);
            spintaxes.add(spintaxBlock);
            String[] items = spintaxBlock.substring(1, spintaxBlock.length()-1).split("\\|");
           /* for(String item:items) {
            	System.out.println(item);
            }*/      
            //rand = new Random();
            s = s.replace(spintaxBlock, items[rand.nextInt(items.length)]);
            //System.out.println(s);
            return spintaxParse(rand, s, spintaxes);
        } else {
        	//System.out.println(s);
            return s;
        }
    }
	
	public static String getTagSpintax(String categories, String lateralMatch, String phraseMatch, String primaryKeyword) {
		StringBuffer tagSpintax = new StringBuffer();
		List<String> categoryList = new ArrayList<String> ();
		String[] categoriesAsArray = categories.split(",");
		for(int i =0 ; i<categoriesAsArray.length ; i++) {
			//System.out.println(categoriesAsArray[i]);
			categoryList.add(categoriesAsArray[i].toString());
		}		
		String[] lateralMatchKeywords = lateralMatch.replaceAll("\\{", "").replaceAll("\\}", "").split("\\|");
		for(int i =0 ; i<lateralMatchKeywords.length ; i++) {
			//System.out.println(lateralMatchKeywords[i]);
			categoryList.add(lateralMatchKeywords[i].toString());
		}		
		//categoryList.addAll(Arrays.asList(lateralMatchKeywords));
		categoryList.add(phraseMatch);
		categoryList.add(primaryKeyword);
		Integer count = categoryList.size() * 10;
		tagSpintax.append("{");		
		for(int i = 0; i<count ; i++) {
			Collections.shuffle(categoryList);
			String aTagSet = categoryList.subList(0, 3).toString().replace("[", "").replace("]", "").trim();
			aTagSet = aTagSet.replaceAll(",\\s+", ",").replaceAll("\\s+,", ",");
			if(aTagSet.length()>39) {
				aTagSet = categoryList.subList(0, 2).toString().replace("[", "").replace("]", "").trim();
				aTagSet = aTagSet.replaceAll(",\\s+", ",").replaceAll("\\s+,", ",");
			}
			if(aTagSet.length()>39) {
				aTagSet = categoryList.subList(0, 1).toString().replace("[", "").replace("]", "").trim();
				aTagSet = aTagSet.replaceAll(",\\s+", ",").replaceAll("\\s+,", ",");
			}
			tagSpintax.append(aTagSet);
			
			if(i<(count-1)) {
				tagSpintax.append("|");
			}
		}
		tagSpintax.append("}");
		return tagSpintax.toString();
	}
	
	public static String getAllCaseSpintax(String givenString) {
		StringBuffer aStringBuffer = new StringBuffer();
		aStringBuffer.append("{");
		aStringBuffer.append(givenString.toLowerCase());
		aStringBuffer.append("|");
		aStringBuffer.append(StringUtils.toCamelCase(givenString));
		aStringBuffer.append("|");
		aStringBuffer.append(StringUtils.toSelectiveCamelCase(givenString));
		aStringBuffer.append("|");
		aStringBuffer.append(StringUtils.toSentenceCamelCase(givenString));
		aStringBuffer.append("|");
		aStringBuffer.append(givenString.toUpperCase());
		aStringBuffer.append("}");
		return aStringBuffer.toString();
	}
	
	/**
	 * @param args
	 */
	public static void anotherMain(String[] args) {
		StringBuffer allLinks = new StringBuffer();
		StringBuffer onlyTags = new StringBuffer();
		List<String> csvLines = TextFileReaderUtils.readLinesAsList("G:/Dropbox/Website Campaigns/ALN-LINKS/all-links.csv", true);
		List<List<String>> urlsWithProperties = new ArrayList<List<String>> ();
		Map<String, String> keywordTitleSpintaxMap = new HashMap<String, String> ();
		Map<String, String> keywordDescSpintaxMap = new HashMap<String, String> ();
		Map<String, String> projectCategoryMap = new HashMap<String, String> ();
		File titlesFolder = new File("G:/Scraped Articles/titles");
		File descsFolder = new File("G:/Scraped Articles/spun descs");
		File categoriesFolder = new File("G:/Dropbox/Website Campaigns/Metadata/Categories");
		for(File aFile:titlesFolder.listFiles()) {
			String titleSpintax = TextFileReaderUtils.readFileAsString(aFile.getAbsolutePath());
			keywordTitleSpintaxMap.put(aFile.getName().replaceAll("\\.txt", "").toLowerCase(), titleSpintax);
		}
		for(File aFile:descsFolder.listFiles()) {
			String descSpintax = TextFileReaderUtils.readFileAsString(aFile.getAbsolutePath());
			keywordDescSpintaxMap.put(aFile.getName().replaceAll("\\.txt", "").toLowerCase(), descSpintax);
		}
		for(File aFile:categoriesFolder.listFiles()) {
			String categories = TextFileReaderUtils.readFileAsString(aFile.getAbsolutePath());
			projectCategoryMap.put(aFile.getName().replaceAll("\\.txt", ""), categories);
		}
		for(int i = 1; i<csvLines.size(); i++) {
			urlsWithProperties.add(Arrays.asList(csvLines.get(i).split(",")));
		}
		int urlCount = 0;
		int fileCount = 0;
		//Collections.shuffle(urlsWithProperties);
		allLinks.append("\"type\",\"url\",\"title\",\"tags\",\"description\",\"categories\",\"is_money_site\"");
		allLinks.append(System.getProperty("line.separator"));
		onlyTags.append("Project;url;Primary Keyword;tags");
		onlyTags.append(System.getProperty("line.separator"));
		for(List<String> anUrlWithProperties : urlsWithProperties) {
			String projectName = anUrlWithProperties.get(0).trim();
			String primaryKeyword = anUrlWithProperties.get(1).trim();
			String url = anUrlWithProperties.get(2).trim();
			String domain = null;
			try {
				domain = new URL(anUrlWithProperties.get(2).trim()).getHost();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			String anchorSpin = anUrlWithProperties.get(3).trim();
			List<String> spintaxes = new ArrayList<String> ();
			spintaxParse(new Random(), anchorSpin, spintaxes);
			String phraseMatch = spintaxes.get(0) + " " + spintaxes.get(1) + " " + spintaxes.get(2);
			String lateralMatch = spintaxes.get(4);
			String generalMatch = spintaxes.get(5);
			String titleMatch = keywordTitleSpintaxMap.get(primaryKeyword.toLowerCase());
			String primaryKeywordInAllCases = getAllCaseSpintax(primaryKeyword);
			String lateralMatchInAllCases = getAllCaseSpintax(lateralMatch);
			String phraseMatchInAllCases = getAllCaseSpintax(phraseMatch);
			String descs = keywordDescSpintaxMap.get(primaryKeyword.toLowerCase());
			System.out.println(primaryKeyword);
			//System.out.println(titleMatch);
			//System.out.println(descs);
			/*if(null==titleMatch) {
				System.out.println(primaryKeyword + " - titleMatch Null");
				if("".equals(titleMatch)||titleMatch.length()<5) {
					System.out.println(primaryKeyword + " - titleMatch mismatch");
				}
			}
			if(null==descs) {
				System.out.println(primaryKeyword + " - descs Null");
				if("".equals(descs)||descs.length()<5) {
					System.out.println(primaryKeyword + " - descs mismatch");
				}
			}*/
			
			
			descs = StringUtils.removeThisCharacter(descs, ",");
			String titles = "{{" + primaryKeywordInAllCases + "|" + phraseMatchInAllCases + "|" + lateralMatchInAllCases + "}|{" + titleMatch + "}}";
			titles = StringUtils.removeThisCharacter(titles, ",");
			allLinks.append("\"WEB\"").append(",");
			allLinks.append("\"" + url + "\"").append(",");
			allLinks.append("\"" + titles + "\"").append(",");
			allLinks.append("\"" + getTagSpintax(projectCategoryMap.get(projectName),lateralMatch,phraseMatch,primaryKeyword) + "\"").append(",");
			allLinks.append("\"" + descs + "\"").append(",");
			allLinks.append("\"" + projectCategoryMap.get(projectName) + "\"").append(",");
			allLinks.append("\"TRUE\"");
			allLinks.append(System.getProperty("line.separator"));
			onlyTags.append(projectName).append(";");
			onlyTags.append(url).append(";");
			onlyTags.append(primaryKeyword).append(";");
			onlyTags.append(getTagSpintax(projectCategoryMap.get(projectName),lateralMatch,phraseMatch,primaryKeyword));
			onlyTags.append(System.getProperty("line.separator"));
			/*urlCount++;
			if(urlCount>9) {
				fileCount++;
				urlCount = 0;
				TextFileWriterUtils.writeString(allLinks.toString(), "C:/Users/Elango/Desktop/BMD CSVs/all-links-for-BMD-" + fileCount + ".csv");
				allLinks.setLength(0);
				allLinks.append("\"type\",\"url\",\"title\",\"tags\",\"description\",\"categories\",\"is_money_site\"");
				allLinks.append(System.getProperty("line.separator"));
			}*/
		}	
		fileCount++;
		//TextFileWriterUtils.writeString(allLinks.toString(), "C:/Users/Elango/Desktop/BMD CSVs/all-links-for-BMD-" + fileCount + ".csv");
		//TextFileWriterUtils.writeString(allLinks.toString(), "G:/Dropbox/Website Campaigns/Promotion Metadata/all-links-for-BMD.csv");
		TextFileWriterUtils.writeString(onlyTags.toString(), "G:/Dropbox/Website Campaigns/Promotion Metadata/only-tags.csv", false);
		/*String anchorSpin = "{clear tinnitus|{{how to|ways to} {clear tinnitus} {naturally|now}}|{{cure tinnitus|tinnitus treatment|tinnitus remedy}|{http://www.tinnitus411.com/clear-tinnitus/|http://www.tinnitus411.com|{click here|read here|read this|go here|read now|read it|have a look here}}}}";
		List<String> spintaxes = new ArrayList<String> ();
		System.out.println(spintaxParse(new Random(), anchorSpin, spintaxes));
		for(String spintax:spintaxes) {
			System.out.println(spintax);
		}
		String primaryKeyword = anchorSpin.replaceFirst("\\|.*", "").replaceAll("\\{", "").trim();
		String phraseMatch = spintaxes.get(0) + " " + spintaxes.get(1) + " " + spintaxes.get(2);
		String lateralMatch = spintaxes.get(4);
		String general = spintaxes.get(5);
		String urlMatch = spintaxes.get(6).replaceAll("\\|.*", "").replaceFirst("\\{", "").trim();
		String domainMatch = spintaxes.get(6).replaceAll("\\{.*?\\|", "").replaceAll("\\|.*", "").trim();
		System.out.println("primaryKeyword : " + primaryKeyword);
		System.out.println("phraseMatch : " + phraseMatch);
		System.out.println("lateralMatch : " + lateralMatch);
		System.out.println("general : " + general);
		System.out.println("urlMatch : " + urlMatch);
		System.out.println("domainMatch : " + domainMatch);		*/
	}
	
	public static void main1(String[] args) {
		System.out.println(getTagSpintax("love,relationship,marriage,divorce,get ex back,get your ex back,how to get your ex back,sad,happy","love","{get|win} {your|my|} ex {girlfriend|boyfriend|} back", "getting your ex back"));
	}

	public static void main(String[] args) {
		StringBuffer allLinks = new StringBuffer();
		List<String> csvLines = TextFileReaderUtils.readLinesAsList("G:/Dropbox/Website Campaigns/ALN-LINKS/all-links.csv", true);
		List<String> suggestionKeywordLines = TextFileReaderUtils.readLinesAsList("G:/Dropbox/Website Campaigns/Metadata/All-Keywords-suggestions.csv", true);
		List<String> relatedKeywordLines = TextFileReaderUtils.readLinesAsList("G:/Dropbox/Website Campaigns/Metadata/All-Keywords-related.csv", true);
		List<List<String>> urlsWithProperties = new ArrayList<List<String>> ();
		Map<String, String> keywordTitleSpintaxMap = new HashMap<String, String> ();
		Map<String, String> keywordDescSpintaxMap = new HashMap<String, String> ();
		Map<String, String> projectCategoryMap = new HashMap<String, String> ();
		Map<String, String> projectDomainBrandingMap = new HashMap<String, String> ();
		Map<String, String> keywordSuggestionMap = new HashMap<String, String> ();
		Map<String, String> keywordRelatedMap = new HashMap<String, String> ();
		File gsaAnchorsFolder = new File("G:/Dropbox/Website Campaigns/Promotion Metadata/GSA Links");
		File titlesFolder = new File("G:/Scraped Articles/titles");
		File descsFolder = new File("G:/Scraped Articles/spun descs");
		File categoriesFolder = new File("G:/Dropbox/Website Campaigns/Metadata/Categories");
		File domainBrandingsFolder = new File("G:/Dropbox/Website Campaigns/Promotion Metadata/Domain Branding Keywords");
		for(File aFile:titlesFolder.listFiles()) {
			String titleSpintax = TextFileReaderUtils.readFileAsString(aFile.getAbsolutePath());
			keywordTitleSpintaxMap.put(aFile.getName().replaceAll("\\.txt", "").toLowerCase(), titleSpintax);
		}
		for(File aFile:descsFolder.listFiles()) {
			String descSpintax = TextFileReaderUtils.readFileAsString(aFile.getAbsolutePath());
			keywordDescSpintaxMap.put(aFile.getName().replaceAll("\\.txt", "").toLowerCase(), descSpintax);
		}
		for(File aFile:categoriesFolder.listFiles()) {
			StringBuffer categories = new StringBuffer();
			categories.append("{");
			categories.append(TextFileReaderUtils.readFileAsString(aFile.getAbsolutePath()).trim().replaceAll(",", "\\|"));
			categories.append("}");
			projectCategoryMap.put(aFile.getName().replaceAll("\\.txt", ""), categories.toString());
		}
		for(File aFile:domainBrandingsFolder.listFiles()) {
			String domainBrandingKeywords = TextFileReaderUtils.readFileAsString(aFile.getAbsolutePath());
			projectDomainBrandingMap.put(aFile.getName().replaceAll("\\.txt", ""), domainBrandingKeywords);
		}
		for(int i = 1; i<csvLines.size(); i++) {
			urlsWithProperties.add(Arrays.asList(csvLines.get(i).split(",")));
		}
		for(int i = 0; i<suggestionKeywordLines.size(); i++) {
			String[] suggestionKeywordsArray = suggestionKeywordLines.get(i).split(",");
			keywordSuggestionMap.put(suggestionKeywordsArray[0].trim(), suggestionKeywordsArray[1].trim());
		}
		for(int i = 0; i<relatedKeywordLines.size(); i++) {
			String[] relatedKeywordsArray = relatedKeywordLines.get(i).split(",");
			keywordRelatedMap.put(relatedKeywordsArray[0].trim(), relatedKeywordsArray[1].trim());
		}
		//int urlCount = 0;
		//int fileCount = 0;
		//Collections.shuffle(urlsWithProperties);
		allLinks.append("Project,Domain,Url,Domain Branded Keywords,Primary Keywords,Phrase Match Keywords,Lateral Keywords,Title Match Keywords,Related Search Keywords,Suggestion Keywords,General Keywords,Categories,Anchors Without HREF,Anchors");
		allLinks.append(System.getProperty("line.separator"));
		for(List<String> anUrlWithProperties : urlsWithProperties) {
			String projectNameForMaps = anUrlWithProperties.get(0).trim().replaceAll("-Batch-[0-9]+", "").trim();
			String projectName = anUrlWithProperties.get(0).trim();
			String primaryKeyword = anUrlWithProperties.get(1).trim();					
			String url = anUrlWithProperties.get(2).trim();
			String domain = null;
			try {
				domain = new URL(anUrlWithProperties.get(2).trim()).getHost();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			String anchorSpin = anUrlWithProperties.get(3).trim();
			List<String> spintaxes = new ArrayList<String> ();
			spintaxParse(new Random(), anchorSpin, spintaxes);
			String phraseMatch = spintaxes.get(0) + " " + spintaxes.get(1) + " " + spintaxes.get(2);
			String lateralMatch = spintaxes.get(4);
			String generalMatch = spintaxes.get(5);
			String titleMatch = keywordTitleSpintaxMap.get(primaryKeyword.toLowerCase());
			String descs = keywordDescSpintaxMap.get(primaryKeyword.toLowerCase());			
			descs = StringUtils.removeThisCharacter(descs, ",");
			titleMatch = StringUtils.removeThisCharacter(titleMatch, ",");
			
			allLinks.append(projectName).append(",");
			allLinks.append(domain).append(",");
			allLinks.append(url).append(",");
			
			StringBuilder anchors = new StringBuilder();
			anchors.append("{");
			anchors.append(url).append("|");
			anchors.append(url).append("|");
			allLinks.append(projectDomainBrandingMap.get(projectNameForMaps).trim()).append(",");
			anchors.append("<a href=\"").append(url).append("\">").append(projectDomainBrandingMap.get(projectNameForMaps).trim()).append("</a>").append("|");
			allLinks.append(primaryKeyword).append(",");
			anchors.append("<a href=\"").append(url).append("\">").append(getAllCaseSpintax(primaryKeyword)).append("</a>").append("|");
			allLinks.append(phraseMatch).append(",");
			anchors.append("<a href=\"").append(url).append("\">").append(getAllCaseSpintax(phraseMatch)).append("</a>").append("|");
			allLinks.append(lateralMatch).append(",");
			anchors.append("<a href=\"").append(url).append("\">").append(getAllCaseSpintax(lateralMatch)).append("</a>").append("|");
			allLinks.append(titleMatch).append(",");
			anchors.append("<a href=\"").append(url).append("\">").append(titleMatch).append("</a>").append("|");
			allLinks.append(keywordRelatedMap.get(primaryKeyword.toLowerCase())).append(",");
			if(null != keywordRelatedMap.get(primaryKeyword.toLowerCase()) && !keywordRelatedMap.get(primaryKeyword.toLowerCase()).equalsIgnoreCase("{}")) {
				anchors.append("<a href=\"").append(url).append("\">").append(getAllCaseSpintax(keywordRelatedMap.get(primaryKeyword.toLowerCase()))).append("</a>").append("|");
			}			
			allLinks.append(keywordSuggestionMap.get(primaryKeyword.toLowerCase())).append(",");
			if(null != keywordSuggestionMap.get(primaryKeyword.toLowerCase()) && !keywordSuggestionMap.get(primaryKeyword.toLowerCase()).equalsIgnoreCase("{}")) {
				anchors.append("<a href=\"").append(url).append("\">").append(getAllCaseSpintax(keywordSuggestionMap.get(primaryKeyword.toLowerCase()))).append("</a>").append("|");
			}
			allLinks.append(generalMatch).append(",");
			anchors.append("<a href=\"").append(url).append("\">").append(getAllCaseSpintax(generalMatch)).append("</a>").append("|");
			allLinks.append(projectCategoryMap.get(projectNameForMaps)).append(",");
			anchors.append("<a href=\"").append(url).append("\">").append(getAllCaseSpintax(projectCategoryMap.get(projectNameForMaps))).append("</a>");
			anchors.append("}");
			
			StringBuilder anchorsWithoutHref = new StringBuilder();
			anchorsWithoutHref.append(url).append("#");
			anchorsWithoutHref.append("{");
			anchorsWithoutHref.append(url).append("|");
			anchorsWithoutHref.append(url).append("|");
			anchorsWithoutHref.append(projectDomainBrandingMap.get(projectNameForMaps).trim()).append("|");
			anchorsWithoutHref.append(getAllCaseSpintax(primaryKeyword)).append("|");
			anchorsWithoutHref.append(getAllCaseSpintax(phraseMatch)).append("|");
			anchorsWithoutHref.append(getAllCaseSpintax(lateralMatch)).append("|");
			anchorsWithoutHref.append(titleMatch).append("|");
			if(null != keywordRelatedMap.get(primaryKeyword.toLowerCase()) && !keywordRelatedMap.get(primaryKeyword.toLowerCase()).equalsIgnoreCase("{}")) {
				anchorsWithoutHref.append(getAllCaseSpintax(keywordRelatedMap.get(primaryKeyword.toLowerCase()))).append("|");
			}			
			if(null != keywordSuggestionMap.get(primaryKeyword.toLowerCase()) && !keywordSuggestionMap.get(primaryKeyword.toLowerCase()).equalsIgnoreCase("{}")) {
				anchorsWithoutHref.append(getAllCaseSpintax(keywordSuggestionMap.get(primaryKeyword.toLowerCase()))).append("|");
			}
			anchorsWithoutHref.append(getAllCaseSpintax(generalMatch)).append("|");
			anchorsWithoutHref.append(getAllCaseSpintax(projectCategoryMap.get(projectNameForMaps)));
			anchorsWithoutHref.append("}");
			
			StringBuilder gsaAnchors = new StringBuilder();
			gsaAnchors.append(url).append("#");
			gsaAnchors.append("{");
			gsaAnchors.append(primaryKeyword).append("|");
			gsaAnchors.append(phraseMatch).append("|");
			gsaAnchors.append(lateralMatch).append("|");
			gsaAnchors.append(titleMatch).append("|");
			if(null != keywordRelatedMap.get(primaryKeyword.toLowerCase()) && !keywordRelatedMap.get(primaryKeyword.toLowerCase()).equalsIgnoreCase("{}")) {
				gsaAnchors.append(keywordRelatedMap.get(primaryKeyword.toLowerCase())).append("|");
			}			
			if(null != keywordSuggestionMap.get(primaryKeyword.toLowerCase()) && !keywordSuggestionMap.get(primaryKeyword.toLowerCase()).equalsIgnoreCase("{}")) {
				gsaAnchors.append(keywordSuggestionMap.get(primaryKeyword.toLowerCase())).append("|");
			}
			gsaAnchors.append(generalMatch).append("|");
			gsaAnchors.append(projectCategoryMap.get(projectNameForMaps));
			gsaAnchors.append("}");
			
			TextFileWriterUtils.writeString(gsaAnchors.toString(), gsaAnchorsFolder + "/" + projectName + ".txt", true);
			TextFileWriterUtils.writeString(System.getProperty("line.separator"), gsaAnchorsFolder + "/" + projectName + ".txt", true);
			allLinks.append(anchorsWithoutHref.toString()).append(",");
			allLinks.append(anchors.toString()).append(",");
			allLinks.append(System.getProperty("line.separator"));
			
			/*urlCount++;
			if(urlCount>9) {
				fileCount++;
				urlCount = 0;
				TextFileWriterUtils.writeString(allLinks.toString(), "C:/Users/Elango/Desktop/BMD CSVs/all-links-for-BMD-" + fileCount + ".csv");
				allLinks.setLength(0);
				allLinks.append("\"type\",\"url\",\"title\",\"tags\",\"description\",\"categories\",\"is_money_site\"");
				allLinks.append(System.getProperty("line.separator"));
			}*/
		}	
		//fileCount++;
		TextFileWriterUtils.writeString(allLinks.toString(), "G:/Dropbox/Website Campaigns/Promotion Metadata/all-links-for-master2.csv", false);
		/*String anchorSpin = "{clear tinnitus|{{how to|ways to} {clear tinnitus} {naturally|now}}|{{cure tinnitus|tinnitus treatment|tinnitus remedy}|{http://www.tinnitus411.com/clear-tinnitus/|http://www.tinnitus411.com|{click here|read here|read this|go here|read now|read it|have a look here}}}}";
		List<String> spintaxes = new ArrayList<String> ();
		System.out.println(spintaxParse(new Random(), anchorSpin, spintaxes));
		for(String spintax:spintaxes) {
			System.out.println(spintax);
		}
		String primaryKeyword = anchorSpin.replaceFirst("\\|.*", "").replaceAll("\\{", "").trim();
		String phraseMatch = spintaxes.get(0) + " " + spintaxes.get(1) + " " + spintaxes.get(2);
		String lateralMatch = spintaxes.get(4);
		String general = spintaxes.get(5);
		String urlMatch = spintaxes.get(6).replaceAll("\\|.*", "").replaceFirst("\\{", "").trim();
		String domainMatch = spintaxes.get(6).replaceAll("\\{.*?\\|", "").replaceAll("\\|.*", "").trim();
		System.out.println("primaryKeyword : " + primaryKeyword);
		System.out.println("phraseMatch : " + phraseMatch);
		System.out.println("lateralMatch : " + lateralMatch);
		System.out.println("general : " + general);
		System.out.println("urlMatch : " + urlMatch);
		System.out.println("domainMatch : " + domainMatch);		*/
	}

}
