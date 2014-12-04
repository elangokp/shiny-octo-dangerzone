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
import com.cybermint.serpScraper.google.scenarios.GetGoogleResultsForSingleKeyword;
import com.cybermint.serpScraper.google.utils.TempBan;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
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

    public SaveGoogleResultsToDB(ObjectPool driverPool, Integer minWaitTime, Integer maxWaitTime, Integer maxResultsPerKeyword, Integer minNextPageDelay, Integer maxNextPageDelay) {
        this.driverPool = driverPool;
        this.minWaitTime = minWaitTime;
        this.maxWaitTime = maxWaitTime;
        this.maxResultsPerKeyword = maxResultsPerKeyword;
        this.minNextPageDelay = minNextPageDelay;
        this.maxNextPageDelay = maxNextPageDelay;
    }

    public void run() {
        KeywordHelper aKeywordHelper = new KeywordHelper();
        Random rand = new Random();
        Keyword aKeyword;
        TempBan aTempBan = new TempBan();
        int keywordsBeforeBan = 0;
        Set<Url> urlSet;
        ExecutorService es = Executors.newSingleThreadExecutor();
        while((aKeyword = aKeywordHelper.getNextPendingKeyword(1))!=null) {
            if(aTempBan.isBanned()) {
                System.out.println("Queries before Ban is " + keywordsBeforeBan);
                keywordsBeforeBan = 0;
            }
            urlSet = new HashSet<Url>();
            System.out.println(aKeyword.getKeyword() + " with keyword id " + aKeyword.getKeywordId() + " started");
            Callable<List<String>> aGetGoogleResultsForSingleKeywordScenario = new GetGoogleResultsForSingleKeyword(driverPool, aKeyword.getKeyword(), maxResultsPerKeyword, minNextPageDelay, maxNextPageDelay, aTempBan);
            Future<List<String>> urlResults = es.submit(aGetGoogleResultsForSingleKeywordScenario);
            es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
            try {
                int i = 1;
                for(String aLink:urlResults.get()) {
                    Url newURL = new Url();
                    newURL.setUrl(aLink);
                    newURL.setRank(new BigDecimal(i));
                    newURL.setKeyword(aKeyword);
                    newURL.setProject(aKeyword.getProject());
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
            aKeywordHelper.setURLsAndCompleteKeyword(aKeyword, urlSet);
//            System.out.println(aKeyword.getKeyword() + " with keyword id " + aKeyword.getKeywordId() + " is completed");
            System.out.println(aKeyword.getKeyword() + " with keyword id " + aKeyword.getKeywordId() + " is updated with " + urlSet.size() + " URLs.");
            keywordsBeforeBan++;
        }
        es.shutdown();
    }

    public static void main(String args[]) throws MalformedURLException {
    	PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
        SaveGoogleResultsToDB aSaveGoogleResultsToDB = new SaveGoogleResultsToDB(driverPool, 3000, 10000, 10, 1000, 3000);
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(aSaveGoogleResultsToDB);
        es.shutdown();
    }

}
