package com.cybermint.utils.ppv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cybermint.utils.TextFileReaderUtils;

public class TargetManipulationUtils {

	private static ArrayList<String> symbols = new ArrayList<String>(
		    								Arrays.asList("", "+", "-", "_"));
	public TargetManipulationUtils() {
		// TODO Auto-generated constructor stub
	}
	
	private static List<String> getTargetVariations(String aKeyword) {
		ArrayList<String> targets = new ArrayList<String>();
		ArrayList<String> words = new ArrayList<String>();
		words.addAll(Arrays.asList(aKeyword.split("\\s+")));
		for(String symbol : symbols) {
			System.out.println(String.join(symbol, words));
		}
		return targets;
	}
	
	private static String longestCommonSubstring(String S1, String S2)
	{
	    int Start = 0;
	    int Max = 0;
	    for (int i = 0; i < S1.length(); i++)
	    {
	        for (int j = 0; j < S2.length(); j++)
	        {
	            int x = 0;
	            while (S1.charAt(i + x) == S2.charAt(j + x))
	            {
	                x++;
	                if (((i + x) >= S1.length()) || ((j + x) >= S2.length())) break;
	            }
	            if (x > Max)
	            {
	                Max = x;
	                Start = i;
	            }
	         }
	    }
	    return S1.substring(Start, (Start + Max));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getTargetVariations("Social Security Disability");
		List<String> keywords = TextFileReaderUtils.readLinesAsList("C:/Users/elangokp.AHC.000/Dropbox/Projects/PPV/American SSD/keywords-less4count.txt", true);
		for(String keyword: keywords) {
			getTargetVariations(keyword);
		}
		//System.out.println(longestCommonSubstring("apply for social security disability ny","best supplemental disability insurance"));

	}

}
