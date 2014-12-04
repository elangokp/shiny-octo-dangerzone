/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author ADMIN
 */
public class ATD {

    public static void main(String args[]) {
        try {
            //FirefoxBinary fb = new FirefoxBinary();
            WebDriver driver = new ChromeDriver();
            //WebDriver driver = new FirefoxDriver(fb, null);
            String data = TextFileReaderUtils.readFileAsString("E:\\Dropbox\\Website Campaigns\\GetBackYourExNow.com\\attraction.txt");
            driver.get("http://127.0.0.1:1049/checkDocument?data="+data);
            System.out.println(driver.getPageSource());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
