/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class KeywordUtils {

    public static List<String> permutateLists(List<String> firstList, List<String> secondList, Boolean doRemoveDuplicates, Boolean doShuffle) {
        List<String> permutatedList = new ArrayList<String>();
        for(String aFirstListString:firstList) {
            for(String aSecondListString:secondList) {
                permutatedList.add(aFirstListString + " " + aSecondListString);
            }
        }
        if(doRemoveDuplicates) {
            permutatedList = removeDuplicates(permutatedList);
        }
        if(doShuffle) {
            Collections.shuffle(permutatedList);
        }
        return permutatedList;
    }

    public static List<String> removeDuplicates(List<String> givenList) {
        Set<String> dupefreeSet = new HashSet<String>();
        dupefreeSet.addAll(givenList);
        List<String> dupeFreeList = new ArrayList<String>();
        dupeFreeList.addAll(dupefreeSet);
        return dupeFreeList;
    }

    public static void splitAndWrite(List<String> givenList, String folderLocation, Integer splitSize, String prefix) {
        for(int i = 0, j = 0; i<=(givenList.size()-splitSize); j++) {
            TextFileWriterUtils.writeListAsLines(givenList.subList(i, i+splitSize), folderLocation+"Split List " + prefix + "-" + j +".txt");
            i = i+splitSize;
        }
    }

    public static List<List<String>> splitList(List<String> givenList, Integer splitSize) {
        List<List<String>> splitedLists = new ArrayList<List<String>>();
        for(int i = 0, j = 0; i<=(givenList.size()-splitSize); j++) {
            splitedLists.add(givenList.subList(i, i+splitSize));
            i = i+splitSize;
        }
        return splitedLists;
    }

    public static List<String> formatAsParagraphs(List<String> unFormattedLines) {
        List<String> formattedLines = new ArrayList<String>();
        formattedLines.add(unFormattedLines.get(0).concat(System.getProperty("line.separator"))); //To Put Article Title as the first element.
        unFormattedLines.remove(0); //To remove the title as it already added.
        Pattern p = Pattern.compile(".*?\\.");
        Matcher m;
        for(String unFormattedLine : unFormattedLines ) {
            //System.out.println("unFormatted Line : " + unFormattedLine);
            m = p.matcher(unFormattedLine);
            StringBuilder aParagraph = new StringBuilder();
            int sentenceCount = 3;
            while(m.find()) {
                //String aSentence = m.group();
                //System.out.println("aSentence : " + aSentence);
                if(sentenceCount>0) {
                    aParagraph.append(m.group()).append(" ");
                    sentenceCount--;
                }else if(sentenceCount<=0) {
                    //System.out.println("aParagraph : " + aParagraph.toString());
                    aParagraph.append(System.getProperty("line.separator"));
                    formattedLines.add(aParagraph.toString());
                    aParagraph = new StringBuilder();
                    sentenceCount = 3;
                }
            }
        }
        return formattedLines;
    }

    public static void main(String args[]) {
        List<String> keywords = TextFileReaderUtils.readLinesAsList("E:/scraping/Keyword List/700,000 Keyword List.txt", false);
        List<String> pliggFootprints = TextFileReaderUtils.readLinesAsList("E:/scraping/vBulletin/footprints for high pr single page threads.txt", false);
        //List<String> siteFootprints = TextFileReaderUtils.readLinesAsList("E:/scraping/Footprints/site signature.txt");
        List<String> permutatedKeywords = new ArrayList<String>();
        Integer prefix = 0;
        for(List<String> aSplitList:splitList(keywords, 20000)) {
            permutatedKeywords = permutateLists(aSplitList , pliggFootprints, Boolean.TRUE, Boolean.TRUE);
            splitAndWrite(permutatedKeywords, "E:/scraping/vBulletin/High PR Keyword Footprints/", 20000, prefix.toString());
            prefix++;
            //aSplitList = null;
        }


//        for(String aLine:unFormattedLinSes) {
//            System.out.println(aLine);
//        }
//        List<String> unFormattedLines;
//        File f = new File("E:/Dropbox/Article Campaigns/01.Cure Tinnitus/Scraped Articles/");
//        for(String aFileName:f.list()) {
//            if(aFileName.contains(".txt")) {
//                System.out.println(f.getAbsolutePath()+"\\"+aFileName);
//                unFormattedLines = TextFileReaderUtils.readLinesAsList(f.getAbsolutePath()+"\\"+aFileName);
//                List<String> formattedLines = formatAsParagraphs(unFormattedLines);
//                if(formattedLines.size()>5 && (!formattedLines.toString().contains("sex")&&!formattedLines.toString().contains("porn"))) {
//                    TextFileWriterUtils.writeListAsLines(formattedLines,f.getAbsolutePath()+"/Formatted/"+aFileName);
//                }
//
//            }
//        }

        
//          List<String> tumblrlist = TextFileReaderUtils.readLinesAsList("E:/Dropbox/Website Campaigns/GetBackYourExNow.com/Project Tumblr Links/tumblr list.txt");
//          Collections.shuffle(tumblrlist);
//          splitAndWrite(tumblrlist,"E:/Dropbox/Website Campaigns/GetBackYourExNow.com/Project Tumblr Links/split/",100,"");
    }

}
