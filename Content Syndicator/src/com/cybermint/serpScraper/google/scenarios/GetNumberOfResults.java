/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.scenarios;

import com.cybermint.pages.Page;
import com.cybermint.serpScraper.domains.Keyword;
import com.cybermint.serpScraper.domains.helpers.KeywordHelper;
import com.cybermint.serpScraper.google.pages.GoogleSERPage;
import com.cybermint.serpScraper.google.pages.GoogleSearchPage;
import com.cybermint.serpScraper.google.utils.TempBan;
import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ADMIN
 */
public class GetNumberOfResults implements Callable {

    private String driverType;
    private String searchString;
    private String matchType;
    private String numberOfResultsType;
    private TempBan aTempBan;

    public GetNumberOfResults(String driverType, String searchString, String matchType, String numberOfResultsType, TempBan aTempBan) {
        this.driverType = driverType;
        this.searchString = searchString;
        this.matchType = matchType;
        this.numberOfResultsType = numberOfResultsType;
        this.aTempBan = aTempBan;
    }

    public BigDecimal call() {
        WebDriver driver = null;
        BigDecimal totalResults = null;
        try {
            driver = Page.constructDriver(driverType);
            GoogleSearchPage aGoogleSearchPage = new GoogleSearchPage(driver,aTempBan);
            aGoogleSearchPage.initialize();
            if("estimated".equalsIgnoreCase(numberOfResultsType)) {
                if("phrase".equalsIgnoreCase(matchType)) {
                    searchString = "\""+searchString+"\"";
                }else if("title".equalsIgnoreCase(matchType)) {
                    searchString = "allintitle:"+searchString;
                }
                GoogleSERPage aGoogleSERPage = aGoogleSearchPage.searchFor(searchString);
//                driver.get("http://www.google.com/search?sclient=psy&hl=en&complete=0&gl=US&site=webhp&source=hp&q=" + searchString);
//                GoogleSERPage aGoogleSERPage = new GoogleSERPage(driver);
//                aGoogleSERPage.initialize();
                totalResults = aGoogleSERPage.getTotalResults();
            } else if("real".equalsIgnoreCase(numberOfResultsType)) {
                if("phrase".equalsIgnoreCase(matchType)) {
                    searchString = "\""+searchString+"\"";
                }else if("title".equalsIgnoreCase(matchType)) {
                    searchString = "allintitle:"+searchString;
                }
                GoogleSERPage aGoogleSERPage = aGoogleSearchPage.searchFor(searchString);
                String lastPageURL = driver.getCurrentUrl() + "&start=990";
                driver.get(lastPageURL);
                aGoogleSERPage = PageFactory.initElements(driver, GoogleSERPage.class);
//                driver.get("http://www.google.com/search?sclient=psy&hl=en&complete=0&gl=US&site=webhp&source=hp&q=" + searchString + "&start=990");
//                GoogleSERPage aGoogleSERPage = new GoogleSERPage(driver);
//                aGoogleSERPage.initialize();
                totalResults = aGoogleSERPage.getRealResults();
            }
            
            driver.quit();
        } catch(Exception e) {
//            if(driver != null) {
//                driver.quit();
//            }
            System.out.println(e);
        }
        return totalResults;
    }

    public static void main(String args[]) {
        KeywordHelper aKeywordHelper = new KeywordHelper();
        TempBan aTempBan = new TempBan();
        Keyword aKeyword = aKeywordHelper.getNextPendingKeyword();
        Callable<BigDecimal> aGetNumberOfResultsForBroadMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"broad","estimated", aTempBan);
        Callable<BigDecimal> aGetNumberOfResultsForPhraseMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"phrase","estimated", aTempBan);
        Callable<BigDecimal> aGetNumberOfResultsForTitleMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"title","estimated", aTempBan);
        Callable<BigDecimal> aGetLeastImperfectForBroadMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"broad","real", aTempBan);
        Callable<BigDecimal> aGetLeastImperfectForPhraseMatchScenario = new GetNumberOfResults("htmlunit", aKeyword.getKeyword(),"phrase","real", aTempBan);
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<BigDecimal> broadResults = es.submit(aGetNumberOfResultsForBroadMatchScenario);
        Future<BigDecimal> phraseResults = es.submit(aGetNumberOfResultsForPhraseMatchScenario);
        Future<BigDecimal> titleResults = es.submit(aGetNumberOfResultsForTitleMatchScenario);
        Future<BigDecimal> broadLIResults = es.submit(aGetLeastImperfectForBroadMatchScenario);
        Future<BigDecimal> phraseLIResults = es.submit(aGetLeastImperfectForPhraseMatchScenario);
        try {
            System.out.println("Keyword is " + aKeyword.getKeyword());
            System.out.println("Broad Match Results are " + broadResults.get());
            System.out.println("Phrase Match Results are " + phraseResults.get());
            System.out.println("Title Match Results are " + titleResults.get());
            System.out.println("Broad LI Match Results are " + broadLIResults.get());
            System.out.println("Phrase LI Match Results are " + phraseLIResults.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(GetNumberOfResults.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(GetNumberOfResults.class.getName()).log(Level.SEVERE, null, ex);
        }
        es.shutdown();
    }
}
