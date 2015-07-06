/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.utils.captchasolver.dbc;

import com.DeathByCaptcha.AccessDeniedException; 
import com.DeathByCaptcha.Client;
import com.DeathByCaptcha.SocketClient;
import com.DeathByCaptcha.Captcha;
import com.cybermint.utils.captchasolver.CaptchaSolverServiceProvider;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DBCCaptchaSolver implements CaptchaSolverServiceProvider {

    public String solveCaptchaFromURL(String userName, String password, String imgURL) {

        Client client = (Client) (new SocketClient(userName, password));
        Captcha captcha = null;

        try {
            URL uRL = new URL(imgURL);
            InputStream imgStream = uRL.openStream();
            captcha = client.decode(imgStream);

            if (null != captcha) {
                System.out.println("CAPTCHA " + captcha.id + " solved: " + captcha.text);
            }
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException" + e);
        } catch (AccessDeniedException e) {
            System.out.println("Cannot connect to DBC" + e);
        } catch (IOException e) {
            System.out.println("IOException" + e);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException" + e);
        }

        return captcha.text;
    }
    
    public String solveCaptchaFromFile(String userName, String password, File img) {

        Client client = (Client) (new SocketClient(userName, password));
        Captcha captcha = null;

        try {
            captcha = client.decode(img);

            if (null != captcha) {
                System.out.println("CAPTCHA " + captcha.id + " solved: " + captcha.text);
            }
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException" + e);
        } catch (AccessDeniedException e) {
            System.out.println("Cannot connect to DBC" + e);
        } catch (IOException e) {
            System.out.println("IOException" + e);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException" + e);
        }

        return captcha.text;
    }
    
}
