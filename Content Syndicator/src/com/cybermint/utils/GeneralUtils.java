/**
 * 
 */
package com.cybermint.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Elango
 *
 */
public class GeneralUtils {

	public static Boolean presentIn(String aString, Collection<String> aListOfStrings) {
		Boolean isPresent = false;
		for(String aStringInList : aListOfStrings) {
			if(aStringInList.equalsIgnoreCase(aString)) {
				isPresent = true;
				return isPresent;
			}
		}
		return isPresent;
	}
	
	public static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                return e1.getValue().compareTo(e2.getValue());
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}
	
	public static <T, K> SortedSet<Entry<K,List<T>>> entriesSortedByListSizeInValues(Map<K,List<T>> map) {
	    SortedSet<Entry<K,List<T>>> sortedEntries = new TreeSet<Entry<K,List<T>>>(
	        new Comparator<Entry<K,List<T>>>() {
	            @Override public int compare(Entry<K,List<T>> e1, Entry<K,List<T>> e2) {
	            	//System.out.println("Comparing...");
	            	//System.out.println(e1.getKey() + " " + e1.getValue().size());
	            	//System.out.println(e2.getKey() + " " + e2.getValue().size());
	            	int result = new Integer(e2.getValue().size()).compareTo(new Integer(e1.getValue().size()));
	            	//System.out.println(result);
	            	if(result==0){
	            		result = e2.getKey().toString().compareTo(e1.getKey().toString());
	            	}
	                return result;
	            }
	        }
	    );
	    //System.out.println(map.entrySet());
	    //System.out.println(map.entrySet().size());
	    sortedEntries.addAll(map.entrySet());
	    //System.out.println(sortedEntries);
	    //System.out.println(sortedEntries.size());
	    return sortedEntries;
	}
	
}
