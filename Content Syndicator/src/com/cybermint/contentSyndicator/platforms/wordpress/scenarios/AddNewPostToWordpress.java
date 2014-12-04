/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.platforms.wordpress.scenarios;

import com.cybermint.contentSyndicator.pages.MyCookieManager;
import com.cybermint.contentSyndicator.platforms.wordpress.pages.WordpressAddPostSuccessPage;
import com.cybermint.contentSyndicator.platforms.wordpress.pages.WordpressLoginPage;
import com.cybermint.pages.Page;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.IncorrectnessListenerImpl;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class AddNewPostToWordpress implements Runnable {

    private String driverType;
    private String startingURL;
    private String username;
    private String password;
    private String title;
    private String post;
    private List<String> failedSites;

    public AddNewPostToWordpress(String driverType, String startingURL, String username, String password, String title, String post, List<String> failedSites) {
        this.driverType = driverType;
        this.startingURL = startingURL;
        this.username = username;
        this.password = password;
        this.title = title;
        this.post = post;
        this.failedSites = failedSites;
    }

    public AddNewPostToWordpress(String startingURL) {
        this.startingURL = startingURL;
    }

    public AddNewPostToWordpress() {
        //Empty Constructor    
    }

    @Override
    public void run() {
        WebDriver driver = null;
        try {
            driver = constructDriver();
            driver.get(startingURL + "wp-login.php");
            Page aPage = new Page(driver);
            aPage.waitForElementToLoad("id", "user_login");
            WordpressLoginPage aWordpressLoginPage = PageFactory.initElements(driver, WordpressLoginPage.class);
            WordpressAddPostSuccessPage aWordpressAddPostSuccessPage = aWordpressLoginPage.loginAs(username, password)
                    .clickAddNewPost()
                    .addPostAndPublish(title, post);
            String postedURL = aWordpressAddPostSuccessPage.getLinkToPublishedPost().getAttribute("href");
            System.out.println("Passed " + Thread.currentThread().getName() + " : "
                    + startingURL + " : " + postedURL);
            aWordpressAddPostSuccessPage.logOut();
            driver.quit();
        } catch(Exception e) {
//            if(driver != null) {
//                driver.quit();
//            }
            failedSites.add(startingURL);
            System.out.println("Failed " + Thread.currentThread().getName() + " : "
                    + startingURL + " : " + e.getMessage());
        }
        
    }

    private WebDriver constructDriver() {
        WebDriver driver;
        if ("firefox".equalsIgnoreCase(driverType)) {
//            FirefoxBinary fb = new FirefoxBinary();
//            fb.setEnvironmentProperty("DISPLAY", ":1");
//            driver = new FirefoxDriver(fb,null);
            driver = new FirefoxDriver();
        } else if ("ie".equalsIgnoreCase(driverType)) {
            driver = new InternetExplorerDriver();
        } else if ("htmlunit".equalsIgnoreCase(driverType)) {
           HtmlUnitDriver htmldriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_7) {

                @Override
                protected WebClient modifyWebClient(WebClient client) {
                    client.setCssErrorHandler(new SilentCssErrorHandler());
                    client.setIncorrectnessListener(new IncorrectnessListenerImpl() {

                        @Override
                          public void notify(String arg0, Object arg1)
                          {
                            //System.err.println("Argument : " + arg0.toString() + ", Object : ");
                          }
                    });
                    client.setCookieManager(new MyCookieManager());
                    System.out.println(client.getCookieManager().HTMLUNIT_COOKIE_POLICY);
                    return client;
                }
            };
            htmldriver.setJavascriptEnabled(true);
            driver = htmldriver;
        } else {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public String getStartingURL() {
        return startingURL;
    }

    public void setStartingURL(String startingURL) {
        this.startingURL = startingURL;
    }

    public static void main(String args[]) {
        //FirefoxDriver driver = new FirefoxDriver();
        //new AddNewPostToWordpress(driver,"http://www.buildabsnow.com/").run();
        //ExecutorService es = new ThreadPoolExecutor(5,10,20,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(),new driverThreadFactory("firefox"));
        //ThreadPoolExecutor es = new ThreadPoolExecutor(5,10,20,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        //List<Runnable> threads  = new ArrayList<Runnable>();
        //ScenariosRunnable aScenario = new AddNewPostToWordpress("http://www.buildabsnow.com/");
//        Runnable aRunnable = (Runnable)aScenario;
//        es.prestartAllCoreThreads();
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println("Iteration Number " + i);
//            es.execute(aRunnable);
//        }
//        es.execute(new AddNewPostToWordpress(new FirefoxDriver(), "http://www.buildabsnow.com/"));
//        System.out.println("Invoked thread Number 1");
//        es.execute(new AddNewPostToWordpress(new FirefoxDriver(), "http://www.buildabsnow.com/"));
//        System.out.println("Invoked thread Number 2");
//        es.execute(new AddNewPostToWordpress(new FirefoxDriver(), "http://www.buildabsnow.com/"));
//        System.out.println("Invoked thread Number 3");
//        es.execute(new AddNewPostToWordpress(new FirefoxDriver(), "http://www.buildabsnow.com/"));
//        System.out.println("Invoked thread Number 4");
//        es.execute(new AddNewPostToWordpress(new FirefoxDriver(), "http://www.buildabsnow.com/"));
//        System.out.println("Invoked thread Number 5");
//        es.execute(new AddNewPostToWordpress(new FirefoxDriver(), "http://www.buildabsnow.com/"));
//        System.out.println("Invoked thread Number 6");
//        es.execute(new AddNewPostToWordpress(new FirefoxDriver(), "http://www.buildabsnow.com/"));

        System.out.println("Main Completed");
    }
}
