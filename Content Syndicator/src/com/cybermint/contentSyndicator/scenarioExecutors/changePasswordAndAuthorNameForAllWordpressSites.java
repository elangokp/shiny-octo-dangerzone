/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.scenarioExecutors;

import com.cybermint.contentSyndicator.platforms.wordpress.scenarios.changePasswordAndAuthorName;
import com.cybermint.utils.CyclicIterator;
import com.cybermint.utils.TextFileReaderUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elango
 */
public class changePasswordAndAuthorNameForAllWordpressSites {

    private List<String> wordpressSites;
    private String driverType;
    private String username;
    private String presentPassword;
    private String futurePassword;
    private List<String> authorNames;

    public changePasswordAndAuthorNameForAllWordpressSites(List<String> givenWordpressSites, String driverType, String username, String presentPassword, String futurePassword, List<String> authorNames) {
        this.driverType = driverType;
        this.username = username;
        this.presentPassword = presentPassword;
        this.futurePassword = futurePassword;
        this.authorNames = authorNames;
        this.wordpressSites = givenWordpressSites;
    }

    public void run() {
        List<String> failedSites = new ArrayList<String>();
        List<String> passedSites = new ArrayList<String>();
        ThreadPoolExecutor es = new ThreadPoolExecutor(5,20,20,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        CyclicIterator<String> authors = new CyclicIterator<String>(authorNames);
        int i = 5;
        for(String aWordpressSite:wordpressSites) {
            if(i>0 && i<5) {
                try {
                    Thread.sleep(30000);
                    i--;
                } catch (InterruptedException ex) {
                    Logger.getLogger(changePasswordAndAuthorNameForAllWordpressSites.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            es.execute(new changePasswordAndAuthorName(driverType,aWordpressSite,username,presentPassword,futurePassword,authors.next(),failedSites,passedSites));
        }
        es.shutdown();
        while(!es.isTerminated()) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(changePasswordAndAuthorNameForAllWordpressSites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int c = 0;
        for(String failedSite:failedSites) {
            System.out.println(failedSite);
            c++;
        }

        System.out.println("Total No. of failed sites = " + c);
        c = 0;
        for(String passedSite:passedSites) {
            System.out.println(passedSite);
            c++;
        }

        System.out.println("Total No. of passed sites = " + c);
    }

    public static void main(String args[]) {
        List<String> siteList = TextFileReaderUtils.readLinesAsList(args[0], false);
        List<String> authorNames = TextFileReaderUtils.readLinesAsList(args[1], false);
        new changePasswordAndAuthorNameForAllWordpressSites(siteList,"firefox","window22","ChangeMe","123eliteslv",authorNames).run();
    }
}
