/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.scenarios;

import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.scenarios.WaitThread;
import com.cybermint.serpScraper.domains.Keyword;
import com.cybermint.serpScraper.domains.Url;
import com.cybermint.serpScraper.domains.helpers.KeywordHelper;
import com.cybermint.serpScraper.google.utils.TempBan;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.pool.impl.GenericObjectPool;

/**
 *
 * @author ADMIN
 */
public class GetAllParametersForSingleKeyword implements Runnable{

    private Keyword givenKeyword;
    private Integer minWaitTime; //in milliSeconds
    private Integer maxWaitTime; //in milliSeconds
    private Integer minNextPageDelay; //in milliSeconds
    private Integer maxNextPageDelay; //in milliSeconds
    private String driverType;
    private TempBan aTempBan;

    public GetAllParametersForSingleKeyword(Keyword givenKeyword, Integer minWaitTime, Integer maxWaitTime, String driverType, Integer minNextPageDelay, Integer maxNextPageDelay, TempBan aTempBan) {
        this.givenKeyword = givenKeyword;
        this.minWaitTime = minWaitTime;
        this.maxWaitTime = maxWaitTime;
        this.driverType = driverType;
        this.minNextPageDelay = minNextPageDelay;
        this.maxNextPageDelay = maxNextPageDelay;
        this.aTempBan = aTempBan;
    }

    public void run(){
        KeywordHelper aKeywordHelper = new KeywordHelper();
        Random rand = new Random();
        Set<Url> urlSet = new HashSet<Url>();
        PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("firefox");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
        System.out.println(givenKeyword.getKeyword() + " with keyword id " + givenKeyword.getKeywordId() + " started");
        Callable<List<String>> aGetGoogleResultsForSingleKeywordScenario = new GetGoogleResultsForSingleKeyword(driverPool, givenKeyword.getKeyword(), 10, minNextPageDelay, maxNextPageDelay, aTempBan);
        Callable<BigDecimal> aGetNumberOfResultsForBroadMatchScenario = new GetNumberOfResults(driverType, givenKeyword.getKeyword(),"broad","estimated", aTempBan);
        Callable<BigDecimal> aGetNumberOfResultsForPhraseMatchScenario = new GetNumberOfResults(driverType, givenKeyword.getKeyword(),"phrase","estimated", aTempBan);
        Callable<BigDecimal> aGetNumberOfResultsForTitleMatchScenario = new GetNumberOfResults(driverType, givenKeyword.getKeyword(),"title","estimated", aTempBan);
        Callable<BigDecimal> aGetLeastImperfectForBroadMatchScenario = new GetNumberOfResults(driverType, givenKeyword.getKeyword(),"broad","real", aTempBan);
        Callable<BigDecimal> aGetLeastImperfectForPhraseMatchScenario = new GetNumberOfResults(driverType, givenKeyword.getKeyword(),"phrase","real", aTempBan);
        ThreadPoolExecutor es = new ThreadPoolExecutor(0,20,20,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        Future<List<String>> urlResults = es.submit(aGetGoogleResultsForSingleKeywordScenario);
        es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
        Future<BigDecimal> broadResults = es.submit(aGetNumberOfResultsForBroadMatchScenario);
        es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
        Future<BigDecimal> phraseResults = es.submit(aGetNumberOfResultsForPhraseMatchScenario);
        es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
        Future<BigDecimal> titleResults = es.submit(aGetNumberOfResultsForTitleMatchScenario);
        es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
        Future<BigDecimal> broadLIResults = es.submit(aGetLeastImperfectForBroadMatchScenario);
        es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
        Future<BigDecimal> phraseLIResults = es.submit(aGetLeastImperfectForPhraseMatchScenario);
        es.execute(new WaitThread(minWaitTime + rand.nextInt(maxWaitTime - minWaitTime + 1)));
        try {
            int i = 1;
            for(String aLink:urlResults.get()) {
                Url newURL = new Url();
                newURL.setUrl(aLink);
                newURL.setRank(new BigDecimal(i));
                newURL.setKeyword(givenKeyword);
                newURL.setProject(givenKeyword.getProject());
                urlSet.add(newURL);
                i++;
            }
            givenKeyword.setSEOBC(broadResults.get());
            givenKeyword.setSEOPC(phraseResults.get());
            givenKeyword.setSEOTC(titleResults.get());
            givenKeyword.setSEOBLI(broadLIResults.get());
            givenKeyword.setSEOPLI(phraseLIResults.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(GetGoogleResultsForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(GetGoogleResultsForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
        }
        aKeywordHelper.setURLsAndCompleteKeyword(givenKeyword, urlSet);
        System.out.println(givenKeyword.getKeyword() + " with keyword id " + givenKeyword.getKeywordId() + " is completed");
//        System.out.println(givenKeyword.getKeyword() + " with keyword id " + givenKeyword.getKeywordId() + " is updated with " + urlSet.size() + " URLs.");
        es.shutdown();
    }

    public static void main(String args[]) {
        KeywordHelper aKeywordHelper = new KeywordHelper();
        Keyword aKeyword;
        int corePoolSize =0;
        TempBan aTempBan = new TempBan();
        ThreadPoolExecutor es = new ThreadPoolExecutor(corePoolSize,5,20,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        while((aKeyword = aKeywordHelper.getNextPendingKeyword(5))!=null) {
            es.execute(new GetAllParametersForSingleKeyword(aKeyword,2000,5000,"htmlunit",3000,7000,aTempBan));
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(GetAllParametersForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
//            }
            if(es.getTaskCount()%10==0 && es.getTaskCount()!=0) {
                try {
                    Thread.sleep(2*60*1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GetAllParametersForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(es.getTaskCount()%50==0 && es.getTaskCount()!=0) {
                try {
                    Thread.sleep(10*60*1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GetAllParametersForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            while(es.getQueue().size()>=1) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GetAllParametersForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        es.shutdown();
    }
}