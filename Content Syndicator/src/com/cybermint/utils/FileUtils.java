/**
 * 
 */
package com.cybermint.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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
	
	public Boolean moveToDir(String sourceFilePath, String destinationFilePath) {
		try {
			Path sourcePath = Paths.get(sourceFilePath);
			Path destPath = Paths.get(destinationFilePath);
			Files.move(sourcePath, destPath, StandardCopyOption.ATOMIC_MOVE);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public Boolean saveFileFromURL(String URL, String destinationFilePath) {
		Boolean isSuccess = true;
		try {
			URL weblink = new URL(URL);
			ReadableByteChannel rbc = Channels.newChannel(weblink.openStream());
			FileOutputStream fos = new FileOutputStream(destinationFilePath);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
		} catch(Exception e) {
			isSuccess =  false;
			e.printStackTrace();
		}
		return isSuccess;
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
