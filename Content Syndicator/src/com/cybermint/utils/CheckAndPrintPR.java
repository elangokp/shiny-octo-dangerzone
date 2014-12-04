/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.utils;

import com.cybermint.pageRank.PageRankChecker;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class CheckAndPrintPR {

    public static void main(String args[]) throws InterruptedException {

        List<String> linesList = TextFileReaderUtils.readLinesAsList("E:\\Dropbox\\Projects\\GetBackYourExNow.com [New 9-6-2010]\\howtowinyourexbackeasy-urls.txt", false);
        System.out.println("URL,PR");
        for(String url:linesList) {
            System.out.println(url+ "," + PageRankChecker.getPageRank(url));
            Thread.sleep(1500);
        }
    }
}
