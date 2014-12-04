/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.scenarios;

import com.cybermint.contentSyndicator.sites.majesticSeo.factories.PoolableMajesticseoDriverFactory;
import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.pages.Page;
import com.cybermint.scenarios.WaitThread;
import com.cybermint.serpScraper.domains.Keyword;
import com.cybermint.serpScraper.domains.Url;
import com.cybermint.serpScraper.google.pages.GoogleSearchPage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.WebDriver;
import com.cybermint.serpScraper.domains.helpers.KeywordHelper;
import com.cybermint.serpScraper.google.pages.GoogleSERPage;
import com.cybermint.serpScraper.google.utils.TempBan;
import com.cybermint.utils.TextFileReaderUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 *
 * @author Elango
 */
public class GetGoogleResultsForSingleKeyword implements Callable{

    private String driverType;
    private ObjectPool driverPool;
    private String searchString;
    private TempBan aTempBan;
    private Integer maxLinks;
    private Integer minNextPageDelay;
    private Integer maxNextPageDelay;

    public GetGoogleResultsForSingleKeyword(ObjectPool driverPool, String searchString, Integer maxLinks, Integer minNextPageDelay, Integer maxNextPageDelay, TempBan aTempBan) {
        this.driverPool = driverPool;
        this.searchString = searchString;
        this.aTempBan = aTempBan;
        this.maxLinks = maxLinks;
        this.minNextPageDelay = minNextPageDelay;
        this.maxNextPageDelay = maxNextPageDelay;
    }

    public List<String> call() throws Exception{
        WebDriver driver = null;
        List<String> serps = new ArrayList<String>();
        Random rand = new Random();
        try {
            driver = (WebDriver) driverPool.borrowObject();
            GoogleSearchPage aGoogleSearchPage = new GoogleSearchPage(driver,aTempBan);
            aGoogleSearchPage = aGoogleSearchPage.ClickSearchSettings().setResultsPerPage(100);
            GoogleSERPage aGoogleSERPage = aGoogleSearchPage.searchFor(searchString);
            //totalResults = aGoogleSERPage.getTotalResults();
            serps = aGoogleSERPage.getSERPLinks();
            Thread.sleep(minNextPageDelay + rand.nextInt(maxNextPageDelay - minNextPageDelay + 1));
            while(aGoogleSERPage.isNextPageAvailable() && serps.size()<maxLinks) {
                aGoogleSERPage = aGoogleSERPage.getNextSERPage();
                serps.addAll(aGoogleSERPage.getSERPLinks());
                Thread.sleep(minNextPageDelay + rand.nextInt(maxNextPageDelay - minNextPageDelay + 1));
            }
            
//            int i = 1;
//            for(String alink:serps) {
//                System.out.println(searchString + "," + alink + "," + i);
//                i++;
//            }
//            System.out.println(totalResults);
//            System.out.println("SERP for keyword : " + searchString + " retrieved successfully");
            driver.close();
        } catch(Exception e) {
//            if(driver != null) {
//                driver.quit();
//            }
        	driverPool.invalidateObject(driver);
            System.out.println("Exception occured While retrieving SERP for keyword : " + searchString);
            e.printStackTrace();
        } finally {
        	driverPool.returnObject(driver);
        }
        return serps;
    }

//    public static void main (String args[]) {
//        KeywordHelper aKeywordHelper = new KeywordHelper();
//        Keyword aKeyword;
//        TempBan aTempBan = new TempBan();
//
//        while((aKeyword = aKeywordHelper.getNextPendingKeyword())!=null) {
//            //GetGoogleResultsForSingleKeyword aScenario = new GetGoogleResultsForSingleKeyword("htmlunit", aKeyword.getKeyword());
//            Callable<List<String>> aGetGoogleResultsForSingleKeywordScenario = new GetGoogleResultsForSingleKeyword("htmlunit", aKeyword.getKeyword(), aTempBan);
//            Callable<BigDecimal> aGetNumberOfResultsForBroadMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"broad","estimated", aTempBan);
//            Callable<BigDecimal> aGetNumberOfResultsForPhraseMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"phrase","estimated", aTempBan);
//            Callable<BigDecimal> aGetNumberOfResultsForTitleMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"title","estimated", aTempBan);
//            Callable<BigDecimal> aGetLeastImperfectForBroadMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"broad","real", aTempBan);
//            Callable<BigDecimal> aGetLeastImperfectForPhraseMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"phrase","real", aTempBan);
//            Set<Url> urlSet = new HashSet<Url>();
////            ExecutorService pool = Executors.newCachedThreadPool();
//            ThreadPoolExecutor es = new ThreadPoolExecutor(5,20,20,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
//            Future<List<String>> urlResults = es.submit(aGetGoogleResultsForSingleKeywordScenario);
//            Future<BigDecimal> broadResults = es.submit(aGetNumberOfResultsForBroadMatchScenario);
//            Future<BigDecimal> phraseResults = es.submit(aGetNumberOfResultsForPhraseMatchScenario);
//            Future<BigDecimal> titleResults = es.submit(aGetNumberOfResultsForTitleMatchScenario);
//            Future<BigDecimal> broadLIResults = es.submit(aGetLeastImperfectForBroadMatchScenario);
//            Future<BigDecimal> phraseLIResults = es.submit(aGetLeastImperfectForPhraseMatchScenario);
//            try {
//                int i = 1;
//                for(String aLink:urlResults.get()) {
//                    Url newURL = new Url();
//                    newURL.setUrl(aLink);
//                    newURL.setRank(new BigDecimal(i));
//                    newURL.setKeywords(aKeyword);
//                    urlSet.add(newURL);
//                    i++;
//                }
//                aKeyword.setSEOBC(broadResults.get());
//                aKeyword.setSEOPC(phraseResults.get());
//                aKeyword.setSEOTC(titleResults.get());
//                aKeyword.setSEOBLI(broadLIResults.get());
//                aKeyword.setSEOPLI(phraseLIResults.get());
//            } catch (InterruptedException ex) {
//                Logger.getLogger(GetGoogleResultsForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (ExecutionException ex) {
//                Logger.getLogger(GetGoogleResultsForSingleKeyword.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            //aKeyword.setUrls(urlSet);
//            aKeywordHelper.setURLsAndCompleteKeyword(aKeyword, urlSet);
//            System.out.println(aKeyword.getKeyword() + " with keyword id " + aKeyword.getKeywordId() + " is updated with " + urlSet.size() + " URLs.");
//            es.shutdown();
//            }
//     }

    public static void main(String args[]) throws InterruptedException {
    	PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("htmlunit");
		GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
		driverPool.setLifo(false); //To make it behave a FIFO
        //List<String> linesList = TextFileReaderUtils.readLinesAsList("F:\\My Dropbox\\Projects\\GetBackYourExNow.com\\Top 100 keywords.txt",true);
        System.out.println("Keyword,URL,Position");
        //for(String keyword:linesList) {
            //Thread.sleep(2000);
            //GetGoogleResultsForSingleKeyword aScenario = new GetGoogleResultsForSingleKeyword("htmlunit", keyword, 50, new TempBan());
            //aScenario.call();
        //}
        
        GetGoogleResultsForSingleKeyword aScenario = new GetGoogleResultsForSingleKeyword(driverPool, "what is my ip", 1000, 0, 0, new TempBan());
        //GetGoogleResultsForSingleKeyword aScenario = new GetGoogleResultsForSingleKeyword("firefoxproxy", "\"What is Pligg?\"|\"pligg content management system\"|\"powered by pligg\" + inurl:story.php", 1000, 0, 0, new TempBan());
        try {
        	List<String> serps = aScenario.call();
        	for(String serp : serps) {
        		System.out.println(serp);
        	}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //FirefoxProfile profile = new FirefoxProfile();
        //Proxy proxy = new Proxy();
        //proxy.setHttpProxy("bproxy123:ichoosebproxy@173.0.61.237:80");
        //profile.setPreference("network.proxy.type", 1);
        //profile.setPreference("network.proxy.http", "173.0.61.237");
        //profile.setPreference("network.proxy.http_port", 80);
        //profile.setProxyPreferences(proxy);
        //WebDriver driver = new FirefoxDriver(profile);
        //driver.get("http://bproxy123:ichoosebproxy@www.whatismyip.com/");
    }

}
