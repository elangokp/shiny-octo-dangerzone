package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TextFileReader {

	public static List<String> getFileLinesAsList(String filePath) {
		File givenFile = new File(filePath);
		List<String> linesList = new ArrayList<String> ();
		Scanner scanner = null;
		if(givenFile.exists()) {
			try {
				scanner = new Scanner(new FileInputStream(givenFile));
				while (scanner.hasNextLine()){
					linesList.add(scanner.nextLine().trim());
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally{
			      scanner.close();
		    }
		}
		return linesList;
	}
	
	public static String getFileContentAsString(String filePath) {
		File givenFile = new File(filePath);
		StringBuilder fileContent = new StringBuilder ();
		Scanner scanner = null;
		if(givenFile.exists()) {
			try {
				scanner = new Scanner(new FileInputStream(givenFile));
				while (scanner.hasNextLine()){
					fileContent.append(scanner.nextLine().trim());
					fileContent.append(System.getProperty("line.separator"));
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally{
			      scanner.close();
		    }
		}
		return fileContent.toString();
	}
	
	public static List<String> getFileContentAsList(String filePath, String separator) {
		String fileContent = getFileContentAsString(filePath);
		List<String> contentList = new ArrayList<String> ();
		contentList = Arrays.asList(fileContent.split(separator));
		return contentList;
	}

	public static Set<String> getFileLinesAsSet(String filePath) {
		Set<String> linesSet = new HashSet<String> ();
		linesSet.addAll(getFileLinesAsList(filePath));
		return linesSet;
	}
	public static Set<String> getFileContentAsSet(String filePath, String separator) {
		Set<String> contentSet = new HashSet<String> ();
		contentSet.addAll(getFileContentAsList(filePath, separator));
		return contentSet;
	}
}
