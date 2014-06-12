package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class P6SpyLogFileReader {

	public static Set<String> getUniqueStatements(String filePath) {
		System.out.println("Inside getUniqueStatements");
		File givenFile = new File(filePath);
		Set<String> statements = new HashSet<String> ();
		Map<String,String> statementsMap = new HashMap<String, String> ();
		Scanner scanner = null;
		if(givenFile.exists()) {
			System.out.println("Inside getUniqueStatements File Exists");
			Integer lineNumber = new Integer(1);
			try {
				scanner = new Scanner(new FileInputStream(givenFile));
				while (scanner.hasNextLine()){
					System.out.println("Inside getUniqueStatements next Line : " +  lineNumber++);
					String nextLine = scanner.nextLine().trim();
					System.out.println(nextLine);
					if(!nextLine.isEmpty()) {
						String[] nextLineAsArray = nextLine.split("\\|");
						if(nextLineAsArray.length>3) { //to ignore resultset statements which skew with the format, with a newline in result
							if(nextLineAsArray[3].equalsIgnoreCase("statement")) {
								System.out.println("Inside getUniqueStatements next Line statement");
								System.out.println(nextLineAsArray[3]);
								System.out.println(nextLineAsArray[4]);
								System.out.println(nextLineAsArray[5]);
								statementsMap.put(nextLineAsArray[4], nextLineAsArray[5]);
								System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
								
							}
						}
						
					}
					
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally{
			      scanner.close();
		    }
		}
		statements.addAll(statementsMap.values());
		return statements;
	}
}
