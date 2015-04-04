/**
 * 
 */
package com.cybermint.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 *
 */
public class FileUtils {

	/**
	 * 
	 */
	public FileUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public Boolean move(File sourceFile, File destinationFile) {
		return false;
	}
	
	public static Boolean removeTheseCharactersAndCopy(String sourceFilePath, String destinationFilePath) {
		Boolean isReplaced = false;
		try {
			String givenText = TextFileReaderUtils.readFileAsString(sourceFilePath);
			String replacedText = StringUtils.replaceThisCharacter(givenText, "\\{", "(");
			replacedText = StringUtils.replaceThisCharacter(replacedText, "\\}", ")");
			replacedText = StringUtils.removeThisCharacter(replacedText, "\\|");
			TextFileWriterUtils.writeString(replacedText, destinationFilePath, false, false);
			if(replacedText.equalsIgnoreCase(givenText)) {
				isReplaced = false;
			} else {
				isReplaced = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			isReplaced = false;
		}
		return isReplaced;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sourceFolderPath = "G:/Scraped Articles Reorganized/";
		String destinationFolderPath = "G:/Scraped Articles Reorganized Sanitized/";
		File sourceFolder = new File(sourceFolderPath);
		File[] articleFolders = sourceFolder.listFiles();
		for(File anArticleFolder : articleFolders) {
			String destinationArticleFolderPath = destinationFolderPath + anArticleFolder.getName() + "/";
			File[] articleFiles = anArticleFolder.listFiles(new TextFileFilter());
			for(File anArticleFile : articleFiles) {
				String destinationArticlePath = destinationArticleFolderPath + anArticleFile.getName();
				Boolean isReplaced = removeTheseCharactersAndCopy(anArticleFile.getAbsolutePath(),destinationArticlePath);
				/*if(isReplaced){
					System.out.println(destinationArticlePath + " - Replaced");
				}*/
			}
		}
	}

}
