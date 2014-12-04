/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Elango
 */
public class TextFileReaderUtils {

    public static List<String> readLinesAsList(String fileReadLocation, Boolean omitEmptyLines) {
        List<String> linesList = new ArrayList<String>();//List used to store all the contents from given file
        try {
            File givenFile = new File(fileReadLocation);
            FileInputStream fis = new FileInputStream(givenFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            BufferedReader br = new BufferedReader(new InputStreamReader(dis));
            String strLine = new String(); //temporary storage of each line read
            while ((strLine = br.readLine()) != null) {
            	if(strLine.length()>0 && !strLine.matches("\\s+")) {
            		linesList.add(strLine);
            	} else if( ( strLine.length()==0 || strLine.matches("\\s+") ) && !omitEmptyLines) {
            		linesList.add(strLine);
            	}
            }
            fis.close();
            bis.close();
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesList;
    }

    public static List<String> readLinesAsList(String fileReadLocation, String separator) {
        List<String> linesList = new ArrayList<String>();//List used to store all the contents from given file
        try {
            StringTokenizer tokenizer = null;
            File givenFile = new File(fileReadLocation);
            FileInputStream fis = new FileInputStream(givenFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            BufferedReader br = new BufferedReader(new InputStreamReader(dis));
            Pattern p = Pattern.compile("[\\p{Alnum}\\p{Space}]++");
            String strLine = new String(); //temporary storage of each line read
            while ((strLine = br.readLine()) != null) {
                tokenizer = new StringTokenizer(strLine, separator);
                while (tokenizer.hasMoreTokens()) {
                    String s = tokenizer.nextToken();
                    s = s.replaceAll(",", "");
                    s = s.replaceAll("_", " ");
                    //s = removeDiacriticalMarks(s);
                    Matcher m = p.matcher(s);
                    if(m.matches()) {
                        linesList.add(s);
                    }
                }
            }
            fis.close();
            bis.close();
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesList;
    }

    public static String removeDiacriticalMarks(String string) {
        return Normalizer.normalize(string, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    public static String listToString(List<String> givenList) {
        StringBuffer sb = new StringBuffer();
        for (String aString : givenList) {
            sb.append(aString);
        }
        return sb.toString();
    }

    public static String listToString(List<String> givenList, boolean ShouldInsertBlankLine) {
        StringBuilder sb = new StringBuilder();
        if(ShouldInsertBlankLine){
            for (String aString : givenList) {
                sb.append(aString).append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));
            }
        } else if(!ShouldInsertBlankLine){
            for (String aString : givenList) {
                sb.append(aString);
            }
        }
        return sb.toString();
    }

    public synchronized static String escapeString(String givenString) {
        String escapedString;
        escapedString = givenString.replaceAll("\\'", "&apos;");
//          escapedString = escapedString.replaceAll("\"", "&quot;");
        return escapedString;
    }

   public static void main(String args[]) {
//		TextFileReaderUtils textFileReaderUtils = new TextFileReaderUtils();
//		List<String> linesList = textFileReaderUtils.readLinesAsList(args[0]);
//		for(String line:linesList) {
//			System.out.println(line);
//		}
//            System.out.println(TextFileReaderUtils.escapeString("sdgdsg'dsgadg"));
        List<String> linesList = TextFileReaderUtils.readLinesAsList("E:\\Dropbox\\Website Campaigns\\05.Hemorrhoids\\promotion\\ALN\\Articles\\A1 Articles_Hemroid Relief_573.txt", true);
        for(String aLine:linesList) {
        	System.out.println(aLine);
        }
        /*Set<String> linesSet = new LinkedHashSet(linesList);
        linesList.clear();
        linesList.addAll(linesSet);
        int totalCategories = linesList.size();
        for(int i=0;!linesList.isEmpty();i++) {
            if(linesList.size()>1000) {
                TextFileWriterUtils.writeListAsLines(linesList.subList(0, 1000), "F:\\Scraping\\allCategories" + i +".txt");
                linesList.subList(0, 1000).clear();
                System.out.println(linesList.size());
            } else {
                TextFileWriterUtils.writeListAsLines(linesList.subList(0, linesList.size()), "F:\\Scraping\\allCategories" + i +".txt");
                linesList.clear();
            }
            
        }*/

    }
    
    public static String readFileAsString(String fileReadLocation) {
        
        StringBuffer strBuffer=new StringBuffer();
        try {
            File givenFile = new File(fileReadLocation);
            FileInputStream fis = new FileInputStream(givenFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            BufferedReader br = new BufferedReader(new InputStreamReader(dis));
            String strLine=new String();
            while ((strLine = br.readLine()) != null) {
               strBuffer.append(strLine);
               strBuffer.append(System.getProperty("line.separator"));
            }
            fis.close();
            bis.close();
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBuffer.toString();
    }
}
