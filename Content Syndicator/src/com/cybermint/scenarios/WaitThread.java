/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.scenarios;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ADMIN
 */
public class WaitThread implements Runnable{

    Integer timeToWait  = 0;

    public WaitThread(Integer givenTimeToWait) {
        timeToWait = givenTimeToWait;
    }
    public void run() {
        try {
            System.out.println("Waiting for " + timeToWait + " milliSeconds.");
            Thread.sleep(timeToWait);
//            System.out.println("I am Done - Waiting for " + timeToWait + " milliSeconds.");
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
