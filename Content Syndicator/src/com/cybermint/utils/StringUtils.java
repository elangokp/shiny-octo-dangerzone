/**
 * 
 */
package com.cybermint.utils;

import java.util.List;
import java.util.Random;

/**
 * @author Elango
 *
 */
public class StringUtils {
	
	public static String[] getWords(String text) {
		text = text.trim();
		if(text.equals("") || text.isEmpty() || text.length()<=0) {
			return null;
		}
		String[] words = text.split("\\s+");
		return words;
	}

	public static Integer getNumberOfWords(String text) {
		text = text.trim();
		if(text.equals("") || text.isEmpty() || text.length()<=0) {
			return 0;
		}
		String[] words = text.split("\\s+");
		return words.length;
	}
	
	public static String removeTheseCharacters(String text, List<String> characters) {
		text = text.trim();
		if(text.equals("") || text.isEmpty() || text.length()<=0) {
			return text;
		}
		for(String character:characters) { 
			text = text.replaceAll(character, "");
		}
		return text;
	}
	
	public static String removeThisCharacter(String text, String character) {
		text = text.trim();
		if(text.equals("") || text.isEmpty() || text.length()<=0) {
			return text;
		}
		text = text.replaceAll(character, "");
		return text;
	}
	
	public static String replaceThisCharacter(String text, String character, String replacementCharacter) {
		text = text.trim();
		if(text.equals("") || text.isEmpty() || text.length()<=0) {
			return text;
		}
		text = text.replaceAll(character, replacementCharacter);
		return text;
	}
	
	public static boolean doesContainAllWords(String text, String keyword) {
		for(String aWord:getWords(keyword)) {
			if(!text.contains(aWord)) {
				return false;
			}
		}
		return true;
	}
	
	public static double wordsPresentPercentage(String text, String keyword) {
		String[] words = getWords(keyword);
		Integer presence = 0;
		text = text.toUpperCase();
		for(String aWord:words) {
			if(text.contains(aWord.toUpperCase())) {
				presence++;
			}
		}		
		return (1.0 * presence)/words.length;
	}
	

	public static String stringCaseRandomizer(String givenString) {
		String caseConvertedString = new String();
		int randomNumber = new Random().nextInt(15);
		System.out.println(randomNumber);
		if(randomNumber == 0  || randomNumber == 1) {
			caseConvertedString = givenString.toLowerCase();
		}else if (randomNumber == 2 || randomNumber == 6 || randomNumber == 11) {
			caseConvertedString = toCamelCase(givenString);
		}else if (randomNumber == 3 || randomNumber == 7 || randomNumber == 12) {
			caseConvertedString = toSelectiveCamelCase(givenString);
		}else if (randomNumber == 4 || randomNumber == 8 || randomNumber == 13) {
			caseConvertedString = toSentenceCamelCase(givenString);
		}else if (randomNumber == 5 || randomNumber == 9 || randomNumber == 14) {
			caseConvertedString = givenString;
		}else if (randomNumber == 10) {
			caseConvertedString = givenString.toUpperCase();
		}
		return caseConvertedString;
	}

	public static String toCamelCase(String givenString) {
		String[] words = givenString.split("\\s+");
		StringBuffer camelCased = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			camelCased.append(capitalizeFirstLetter(words[i]));
			if (i < words.length - 1) {
				camelCased.append(" ");
			}
		}
		words.toString();
		return camelCased.toString();
	}

	public static String toSelectiveCamelCase(String givenString) {
		String[] words = givenString.split("\\s+");
		StringBuffer camelCased = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			if (i == 0) {
				camelCased.append(capitalizeFirstLetter(words[i]));
			} else if (i != 0 && isCommonWordFound(words[i])) {
				camelCased.append(words[i]);
			} else if (i != 0 && !isCommonWordFound(words[i])) {
				camelCased.append(capitalizeFirstLetter(words[i]));
			}
			if (i < words.length - 1) {
				camelCased.append(" ");
			}
		}
		words.toString();
		return camelCased.toString();
	}


	public static String toSentenceCamelCase(String givenString) {
		return capitalizeFirstLetter(givenString);
	}
	
	private static boolean isCommonWordFound(String givenWord) {
		String[] commonWords = { "to", "a", "an", "on", "in", "of", "for",
				"and", "the", "is" };
		boolean isFound = false;
		for (String commonWord : commonWords) {
			if (commonWord.equalsIgnoreCase(givenWord)) {
				isFound = true;
			}

		}
		return isFound;
	}

	private static String capitalizeFirstLetter(String givenWord) {
		if (givenWord.length()>0 && givenWord.substring(0, 1).matches("[a-zA-Z]")) {
			givenWord = givenWord.replaceFirst(givenWord.substring(0, 1), givenWord.substring(0, 1).toUpperCase());
		}
		return givenWord;
	}
	
	public static String spintaxParse(Random rand, String s)
    {
		Boolean containSpintax = s.contains("{");
		
		while(containSpintax) {
	            int closingBracePosition = s.indexOf("}");
	            //System.out.println("closingBracePosition : " + closingBracePosition);
	            int openingBracePosition = closingBracePosition;
	            //System.out.println("openingBracePosition : " + openingBracePosition);

	            while(!Character.toString(s.charAt(openingBracePosition)).equals("{")) {
	            	openingBracePosition--;
	            }
	            //openingBracePosition = s.lastIndexOf("{", closingBracePosition);
	            //System.out.println("openingBracePosition After loop: " + openingBracePosition);
	            String spintaxBlock = s.substring(openingBracePosition, closingBracePosition + 1 );
	            //System.out.println(spintaxBlock);
	            String[] items = spintaxBlock.substring(1, spintaxBlock.length()-1).split("\\|");
	           /* for(String item:items) {
	            	System.out.println(item);
	            }*/      
	            //rand = new Random();
	            s = s.replace(spintaxBlock, items[rand.nextInt(items.length)]);
	            //System.out.println(s);
	            containSpintax = s.contains("{");
		}
        
        return s;
    }
	
	public static void main (String args[]) {
		//System.out.println(getNumberOfWords(""));
		/*String s = "{{clear tinnitus|clear tinnitus|{how to|ways to} {clear tinnitus} {naturally|now}|{cure tinnitus|tinnitus treatment|tinnitus remedy}}|{{How to Clear Tinnitus Without Drugs - 2 Simple Ways to Get Rid of Ringing in the Ears|Tinnitus Remedies - Normal Tinnitus Remedies in order to Clear tinnitus With no Drug Treatments Qui|Tinnitus|Clear Tinnitus - Need To Know|Stop Ear Ringing and Clear Tinnitus Noise for Good|Simple Steps to Clear Tinnitus|PULSATILE TINNITUS|Tinnitus Causes|What Is Tinnitus|End Tinnitus|Clear Tinnitus With Essential Fatty Acids|What On Earth Is Tinnitus|Effective Ways To Clear Tinnitus Without Resorting To Drastic Measures|Stop Ear Ringing And Clear Tinnitus Noise For Good|Valuable Ways To Clear Tinnitus With no Resorting To Radical Measures|There's No Medication To Clear Tinnitus - But These Tips May Ease Some Of The Pain|Clear Tinnitus Today!|How to Clear Tinnitus Naturally and Safely|Tinnitus Miracle Review|How to Clear Tinnitus - Detailed Information and Advice|Clear Tinnitus And Eating Nutritious Foods|How To Clear Tinnitus Using Natural Tinnitus Remedies|Clear Tinnitus - How To Stop The Rining Of Ears|Clear Tinnitus - What You Need To Know|Tinnitus Remedies - Normal Tinnitus Remedies For You to Clear tinnitus Without Having Medicines Fast|Clear Tinnitus Problems|Valuable Techniques To Clear Tinnitus Without Resorting To Drastic Measures|Clear Tinnitus - Your Review|Clear Tinnitus - Detailed Info And Advice|How To Clear Tinnitus Naturally And Safely} }}";
		for(int i = 0; i<100; i++) {
			System.out.println(spintaxParse(new Random(), s));
		}*/
		String superSpin = TextFileReaderUtils.readFileAsString("G:/Google Drive/Scraped Articles/Scraped Articles In Cycles Super Spun/Cycle 4/01.Cure Tinnitus-Cycle 4-super-spin.txt");
		System.out.println(spintaxParse(new Random(), superSpin));
	}
}
