/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.scenarioExecutors;

import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.scenarios.WaitThread;
import com.cybermint.serpScraper.domains.Keyword;
import com.cybermint.serpScraper.domains.Url;
import com.cybermint.serpScraper.domains.helpers.KeywordHelper;
import com.cybermint.serpScraper.domains.helpers.ProjectHelper;
import com.cybermint.serpScraper.google.scenarios.GetGoogleResultsForSingleKeyword;
import com.cybermint.serpScraper.google.utils.TempBan;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;

/**
 *
 * @author ADMIN
 */
public class SaveGoogleResultsToDB implements Runnable{

    private boolean humanEmulation;
    private Integer minWaitTime; //in milliSeconds
    private Integer maxWaitTime; //in milliSeconds
    private Integer maxResultsPerKeyword;
    private Integer minNextPageDelay; //in milliSeconds
    private Integer maxNextPageDelay; //in milliSeconds
    private String driverType;
    private ObjectPool driverPool;
    private Integer projectID;

    public SaveGoogleResultsToDB(ObjectPool driverPool, Integer projectID, Integer minWaitTime, Integer maxWaitTime, Integer maxResultsPerKeyword, Integer minNextPageDelay, Integer maxNextPageDelay) {
        this.driverPool = driverPool;
        this.minWaitTime = minWaitTime;
        this.maxWaitTime = maxWaitTime;
        this.maxResultsPerKeyword = maxResultsPerKeyword;
        this.minNextPageDelay = minNextPageDelay;
        this.maxNextPageDelay = maxNextPageDelay;
        this.projectID = projectID;
    }

    public void run() {
    	KeywordHelper aKeywordHelper = KeywordHelper.getInstance();
        Random rand = new Random();
        Keyword aKeyword;
        TempBan aTempBan = new TempBan();
        int keywordsBeforeBan = 0;
        Set<Url> urlSet;
        ExecutorService es = Executors.newSingleThreadExecutor();
        while((aKeyword = aKeywordHelper.getNextPendingKeyword(projectID))!=null) {
            if(aTempBan.isBanned()) {
                System.out.println("Queries before Ban is " + keywordsBeforeBan);
                keywordsBeforeBan = 0;
            }
            urlSet = new HashSet<Url>();
            System.out.println(aKeyword.getKeyword() + " with keyword id " + aKeyword.getKeywordId() + " started");
            Callable<Map<String,List<String>>> aGetGoogleResultsForSingleKeywordScenario = new GetGoogleResultsForSingleKeyword(driverPool, aKeyword.getKeyword(), maxResultsPerKeyword, minNextPageDelay, maxNextPageDelay, aTempBan);
            Future<Map<String,List<String>>> urlResults = es.submit(aGetGoogleResultsForSingleKeywordScenario);
            //es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
            
            //For adding the SERP organic listing URLs.
            try {
                int i = 1;
                for(String aLink:urlResults.get().get("serps")) {
                    Url newURL = new Url();
                    newURL.setUrl(aLink);
                    newURL.setRank(new BigDecimal(i));
                    newURL.setKeyword(aKeyword);
                    newURL.setProject(aKeyword.getProject());
                    newURL.setResultType("serp");
                    try {
                        newURL.setDomain(new URL(aLink).getHost());
                    }catch (MalformedURLException ex) {
                        newURL.setDomain("Could Not Determine");
                        Logger.getLogger(SaveGoogleResultsToDB.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    urlSet.add(newURL);
                    i++;
                }
            }  catch (InterruptedException ex) {
                Logger.getLogger(SaveGoogleResultsToDB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(SaveGoogleResultsToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //For saving the Ad URLs
            try {
                int i = 1;
                for(String aLink:urlResults.get().get("ads")) {
                    Url newURL = new Url();
                    newURL.setUrl(aLink);
                    newURL.setRank(new BigDecimal(i));
                    newURL.setKeyword(aKeyword);
                    newURL.setProject(aKeyword.getProject());
                    newURL.setResultType("ad");
                    try {
                        newURL.setDomain(new URL(aLink).getHost());
                    }catch (MalformedURLException ex) {
                        newURL.setDomain("Could Not Determine");
                        Logger.getLogger(SaveGoogleResultsToDB.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    urlSet.add(newURL);
                    i++;
                }
            }  catch (InterruptedException ex) {
                Logger.getLogger(SaveGoogleResultsToDB.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(SaveGoogleResultsToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
				aKeywordHelper.setURLsAndCompleteKeyword(aKeyword, urlSet);
//            System.out.println(aKeyword.getKeyword() + " with keyword id " + aKeyword.getKeywordId() + " is completed");
				System.out.println(aKeyword.getKeyword() + " with keyword id " + aKeyword.getKeywordId() + " is updated with " + urlSet.size() + " URLs.");
				keywordsBeforeBan++;
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
        es.shutdown();
    }

    public static void main(String args[]) throws MalformedURLException {
    	PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
        SaveGoogleResultsToDB aSaveGoogleResultsToDB;
        //ExecutorService es = Executors.newSingleThreadExecutor();
        //es.execute(aSaveGoogleResultsToDB);
        ExecutorService es = Executors.newFixedThreadPool(3);
        int i = 0;
        while(i++<5) {
        	aSaveGoogleResultsToDB = new SaveGoogleResultsToDB(driverPool, 5, 100, 200, 1000, 100, 200);
        	es.execute(aSaveGoogleResultsToDB);
        }
        es.shutdown();
    }

}
