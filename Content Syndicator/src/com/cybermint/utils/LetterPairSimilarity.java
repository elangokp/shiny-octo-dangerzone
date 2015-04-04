package com.cybermint.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author Elango
 *
 */
public class LetterPairSimilarity {
	/** @return lexical similarity value in the range [0,1] */
	   public static double compareStrings(String str1, String str2, boolean shouldBreakWords) {
	       ArrayList pairs1 = wordLetterPairs(str1.toUpperCase(), shouldBreakWords);
	       ArrayList pairs2 = wordLetterPairs(str2.toUpperCase(), shouldBreakWords);
	       int intersection = 0;
	       int union = pairs1.size() + pairs2.size();
	       for (int i=0; i<pairs1.size(); i++) {
	           Object pair1=pairs1.get(i);
	           for(int j=0; j<pairs2.size(); j++) {
	               Object pair2=pairs2.get(j);
	               if (pair1.equals(pair2)) {
	                   intersection++;
	                   pairs2.remove(j);
	                   break;
	               }
	           }
	       }
	       return (2.0*intersection)/union;
	   }
	   
	   /** @return an ArrayList of 2-character Strings. */
	   private static ArrayList wordLetterPairs(String str, boolean shouldBreakWords) {
	       ArrayList allPairs = new ArrayList();
	       if(shouldBreakWords){
	    	   // Tokenize the string and put the tokens/words into an array
	    	   String[] words = str.split("\\s+");
		       // For each word
		       for (int w=0; w < words.length; w++) {
		           // Find the pairs of characters
		           String[] pairsInWord = letterPairs(words[w]);
		           for (int p=0; p < pairsInWord.length; p++) {
		               allPairs.add(pairsInWord[p]);
		           }
		       }
	       } else {
	    	   String[] pairsInWord = letterPairs(str);
	    	   for (int p=0; p < pairsInWord.length; p++) {
	               allPairs.add(pairsInWord[p]);
	           }
	       }
	       
	       
	       return allPairs;
	   }
	   
	   /** @return an array of adjacent letter pairs contained in the input string */
	   private static String[] letterPairs(String str) {
	       int numPairs = str.length()-1;
	       String[] pairs = new String[numPairs];
	       for (int i=0; i<numPairs; i++) {
	           pairs[i] = str.substring(i,i+2);
	       }
	       return pairs;
	   }
	   
	   public static void main(String args[]) {
		   
		   List<String> keyList = TextFileReaderUtils.readLinesAsList("C:\\data\\keylist.txt", true);
		   List<String> searchList = TextFileReaderUtils.readLinesAsList("C:\\data\\searchlist.txt", true);
		   HashMap<String, String> searchMap = new HashMap<String, String>();
		   //HashMap<String, String> resultsMap = new HashMap<String, String>();
		   for(String anSearchItem: searchList) {
			   String[] items = anSearchItem.split(",");
			   searchMap.put(items[0], items[1]);
		   }
		   
		   for(String anKeyItem: keyList) {
			   double matchPercentageForThisKey = 0.00;
			   String matchingRecordForThisKey = "";
			   for(Entry<String, String> searchRecord:searchMap.entrySet()) {
				   double currentMatchPercentageThisSearch = LetterPairSimilarity.compareStrings(anKeyItem, searchRecord.getKey(), false);
				   if(currentMatchPercentageThisSearch > matchPercentageForThisKey) {
					   matchPercentageForThisKey = currentMatchPercentageThisSearch;
					   matchingRecordForThisKey = searchRecord.getKey() + "," + searchRecord.getValue();
				   }
			   }
			   String mostMatchingRecord = anKeyItem + "," + matchingRecordForThisKey + "," + matchPercentageForThisKey*100;
			   System.out.println(mostMatchingRecord);
			   TextFileWriterUtils.writeString(mostMatchingRecord, "C:\\data\\matchlist.txt", true, true);
		   }
		   
/*		   System.out.println(LetterPairSimilarity.compareStrings("ANADIAEL-SAYEDFEMALE15322", "ANADIAEL SAYEDFEMALE15322", false));
		   System.out.println(LetterPairSimilarity.compareStrings("CAROLEDWARDS CLEGGFEMALE18021", "CAROLEDWARDS-CLEGGFEMALE18021", false));
		   System.out.println(LetterPairSimilarity.compareStrings("ANADIAEL-SAYEDFEMALE15322", "CAROLEDWARDS-CLEGGFEMALE18021", false));
		   System.out.println(LetterPairSimilarity.compareStrings("CAROLEDWARDS CLEGGFEMALE18021", "ANADIAEL SAYEDFEMALE15322", false));
		   System.out.println(LetterPairSimilarity.compareStrings("ANADIAEL-SAYEDFEMALE15322", "ANADIAEL-SAYEDFEMALE15322", false));
		   System.out.println(LetterPairSimilarity.compareStrings("CAROLEDWARDS CLEGGFEMALE18021", "CAROLEDWARDS CLEGGFEMALE18021", false));*/
	   }
	}
