/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.utils;

import com.cybermint.contentSyndicator.sites.aln.utils.ALNUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import com.cybermint.utils.TextFileReaderUtils;
import java.util.Map;
import java.util.Map.Entry;
/**
 *
 * @author Elango
 */
public class CyclicIterator<T> implements Iterator<T> {

	private final Collection<T> c;
	private Iterator<T> it;


	public CyclicIterator(Collection<T> c) {
		this.c = c;
		this.it = c.iterator();
	}

        public boolean hasNext() {
                    return !c.isEmpty();
        }

        public T next() {
            T ret;

            if (!hasNext()) {
              throw new NoSuchElementException();
            } else if (it.hasNext()) {
              ret = it.next();
            } else {
              it = c.iterator();
              ret = it.next();
            }

            return ret;
        }

        public void remove() {
            it.remove();
        }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TextFileReaderUtils textFileReaderUtils = new TextFileReaderUtils();
		//List<String> authorsList = textFileReaderUtils.readLinesAsList("E:\\Authors.txt");
                ALNUtils anALNUtils = new ALNUtils();
                Map<String,String> urlAndKeywords = anALNUtils.parseURLAndKeyword("E:/Dropbox/Website Campaigns/GetBackYourExNow.com/ALN Projects/project1/urlAndKeywords.txt");
		CyclicIterator<Entry<String,String>> ci = new CyclicIterator<Entry<String,String>>(urlAndKeywords.entrySet());
		while(ci.hasNext()) {
                        Entry<String,String> anEntry = ci.next();
			System.out.println(anEntry.getKey() + " " + anEntry.getValue());
		}

	}

}