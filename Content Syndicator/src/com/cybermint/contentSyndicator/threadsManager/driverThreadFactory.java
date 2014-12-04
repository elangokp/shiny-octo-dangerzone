/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.threadsManager;

import java.util.concurrent.ThreadFactory;

/**
 *
 * @author Elango
 */
public class driverThreadFactory implements ThreadFactory{

    private String driverType;
   
    public driverThreadFactory(String driverType){
        this.driverType = driverType;
    }

    public Thread newThread(Runnable r) {
        Thread aThread = new driverThread(driverType,r);
        aThread.setDaemon(true);
        return aThread;

    }
}
