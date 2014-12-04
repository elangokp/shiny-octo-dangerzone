/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.scenarioExecutors;

import com.cybermint.contentSyndicator.platforms.wordpress.scenarios.AddNewPostToWordpress;
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
public class AddNewPostToAllWordpressSites implements Runnable{

    private List<String> wordpressSites;
    private String username;
    private String password;
    private String title;
    private String post;
    private String driverType;
    public AddNewPostToAllWordpressSites(List<String> givenWordpressSites,String username,String password,String title,String post,String driverType) {
        this.wordpressSites = givenWordpressSites;
        this.username = username;
        this.password = password;
        this.title = title;
        this.post = post;
        this.driverType = driverType;
    }

    public void run() {
        List<String> failedSites = new ArrayList<String>();
        ThreadPoolExecutor es = new ThreadPoolExecutor(5,20,20,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        //es.prestartAllCoreThreads();
        int i = 5;
        for(String aWordpressSite:wordpressSites) {
            if(i>0 && i<5) {
                try {
                    Thread.sleep(30000);
                    i--;
                } catch (InterruptedException ex) {
                    Logger.getLogger(AddNewPostToAllWordpressSites.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            es.execute(new AddNewPostToWordpress(driverType,aWordpressSite,username,password,title,post,failedSites));
        }
        es.shutdown();
        while(!es.isTerminated()) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                Logger.getLogger(AddNewPostToAllWordpressSites.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int c = 0;
        for(String failedSite:failedSites) {
            System.out.println(failedSite);
            c++;
        }

        System.out.println("Total No. of failed sites = " + c);
    }

    public static void main(String args[]) {
        List<String> siteList = TextFileReaderUtils.readLinesAsList(args[0], false);
//        List<String> postLines = TextFileReaderUtils.readLinesAsList(args[1]);
//        String title = postLines.get(0);
//        postLines.remove(0);
        String title = "title";
        String post = "body";
//        String post = TextFileReaderUtils.listToString(postLines);
//        new AddNewPostToAllWordpressSites(siteList,"window22","123eliteslv",title,post,"firefox").run();
        new AddNewPostToAllWordpressSites(siteList,"admin","GD6afvJ^1V!h",title,post,"htmlunit").run();
    }

}
