package com.cybermint.pageRank;
/*
 * Main.java
 *
 * Created on May 27, 2007, 2:26 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.cybermint.pages.Page;


/**
 *
 * @author fusion
 */
public class PageRankChecker {
    
 
    
    public static String getQueryUrl(String url) {
        long checksum;
        checksum = getCheckSum(url);
        if(checksum == 0)
            return null;
        
        String temp = "";
        try {
            
            temp = URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return "http://toolbarqueries.google.com/tbr?client=navclient-auto&ch=6" + checksum + "&ie=UTF-8&oe=UTF-8&features=Rank" + "&q=info:" + temp;

    }
    
    public static String getXmlQueryUrl(String url) {
        long checksum;
        checksum = getCheckSum(url);
        if(checksum == 0)
            return null;
        
        String temp = "";
        try {
            
            temp = URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        
        return "http://toolbarqueries.google.com/tbr?client=navclient-auto&ch=6" + checksum + "&ie=UTF-8&oe=UTF-8" + "&q=info:" + temp;

    }
    
    public static int getDomainPageRank(String urlString) {
    	int pageRank = -1;
    	URL aUrl;
    	try {
			aUrl= new URL(urlString);
			String domain = aUrl.getProtocol() + "://" + aUrl.getHost();
			pageRank = getPageRank(domain);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    	return pageRank;
    }
    
    public static int getPageRank(String url) {
        int pageRank = -1;
        String query = getQueryUrl(url);
        if(query == null)
            return pageRank;
        BufferedReader in = null;
        try {
        	Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.cognizant.com", 6050));
            URL pr = new URL(query);
            URLConnection conn = pr.openConnection(proxy);
            String userAndPassword = "331847" + ":" + "ch@rl3s_b_pass03";
            String userAndPasswordBase64 = Base64.encodeBase64String(userAndPassword.getBytes());
            conn.addRequestProperty("Proxy-Authorization", "Basic "+userAndPasswordBase64);
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = null;
            do
            {
                if((line = in.readLine()) == null)
                    break;
                if(line.contains(":")) {
                    String tokens[] = line.split(":");
                    if(tokens.length > 2)
                        pageRank = Integer.parseInt(tokens[2]);
                }
            } while(true);
           /* HtmlUnitDriver htmldriver = (HtmlUnitDriver) Page.constructDriver("htmlunitproxy");
        	htmldriver.get(query);
        	String content = htmldriver.findElementByTagName("body").getText();        	
        	//System.out.println(content);
        	if(content.contains(":")) {
                String tokens[] = content.split(":");
                if(tokens.length > 2)
                    pageRank = Integer.parseInt(tokens[2]);
            }*/
        } catch(Exception e) { 
        	System.out.println(e);
        }
        return pageRank;
    }
    
    private static long getCheckSum(String url) {
        if(!validUrl(url))
            return 0;
        else
            return generateNewCheckSum(generateCheckSum(strord("info:" + url)));
    }
    
    private static boolean validUrl(String url) {
        if(url == null || !url.startsWith("http"))
            return false;
        try {
            new URL(url);
        } catch(MalformedURLException e) {
            return false;
        }
        return true;
    }
    
    private static long[] strord(String str) {
        long result[] = new long[str.length()];
        for(int i = 0; i < str.length(); i++)
            result[i] = str.charAt(i);
        
        return result;
    }
    
    private static long generateCheckSum(long url[]) {
        int length = url.length;
        int init = 0xE6359A60;
        int a = 0x9E3779B9;
        int b = 0x9E3779B9;
        int c = init;
        int k = 0;
        int len;
        int mix[];
        for(len = length; len >= 12; len -= 12) {
            a += url[k + 0] + (url[k + 1] << 8) + (url[k + 2] << 16) + (url[k + 3] << 24);
            b += url[k + 4] + (url[k + 5] << 8) + (url[k + 6] << 16) + (url[k + 7] << 24);
            c += url[k + 8] + (url[k + 9] << 8) + (url[k + 10] << 16) + (url[k + 11] << 24);
            mix = mix(a, b, c);
            a = mix[0];
            b = mix[1];
            c = mix[2];
            k += 12;
        }
        
        c += length;
        switch(len) {
            case 11: // '\013'
                c += url[k + 10] << 24;
                // fall through
                
            case 10: // '\n'
                c += url[k + 9] << 16;
                // fall through
                
            case 9: // '\t'
                c += url[k + 8] << 8;
                // fall through
                
            case 8: // '\b'
                b += url[k + 7] << 24;
                // fall through
                
            case 7: // '\007'
                b += url[k + 6] << 16;
                // fall through
                
            case 6: // '\006'
                b += url[k + 5] << 8;
                // fall through
                
            case 5: // '\005'
                b += url[k + 4];
                // fall through
                
            case 4: // '\004'
                a += url[k + 3] << 24;
                // fall through
                
            case 3: // '\003'
                a += url[k + 2] << 16;
                // fall through
                
            case 2: // '\002'
                a += url[k + 1] << 8;
                // fall through
                
            case 1: // '\001'
                a += url[k + 0];
                // fall through
                
            default:
                mix = mix(a, b, c);
                break;
        }
        //System.out.println(mix[2]);
        if (mix[2]<0) {
        	long x = (long)mix[2];
        	x = Long.valueOf("4294967296").longValue() + x;
        	return x;
        } else {
        	return mix[2];
        }
        //return  ((mix[2] < 0) ? (1073741824 + mix[2]) : mix[2]);
        
    }
    
    private static int[] mix(int a, int b, int c) {
        a -= b;
        a -= c;
        a ^= zeroFill(c, 13);
        b -= c;
        b -= a;
        b ^= a << 8;
        c -= a;
        c -= b;
        c ^= zeroFill(b, 13);
        a -= b;
        a -= c;
        a ^= zeroFill(c, 12);
        b -= c;
        b -= a;
        b ^= a << 16;
        c -= a;
        c -= b;
        c ^= zeroFill(b, 5);
        a -= b;
        a -= c;
        a ^= zeroFill(c, 3);
        b -= c;
        b -= a;
        b ^= a << 10;
        c -= a;
        c -= b;
        c ^= zeroFill(b, 15);
        return (new int[] {
            a, b, c
        });
    }
    
    private static long zeroFill(long a, int b) {
        int z = 0x80000000;
        if((z & a) != 0) {
            a >>= 1;
            a &= ~z;
            a |= 0x40000000;
            a >>= b - 1;
        } else {
            a >>= b;
        }
        return a;
    }
    
    private static long generateNewCheckSum(long checksum) {
        checksum = ( ( ( checksum / 7 ) << 2 ) | ( ( myfmod( checksum, 13 ) ) & 7 ) );

        long[] prbuf = new long[20];
        prbuf[0] = checksum;
        for (int i = 1; i < 20; i++ ) {
            prbuf[i] = prbuf[i-1] - 9;
        }
        //System.out.println(checksum);
        checksum = generateCheckSum(c32to8bit(prbuf));

        return checksum;
    }

 
    private static long myfmod(long x, long y) {
        long i = (long) Math.floor(x/y);
        return  (x - i*y);
    }
    
    private static long[] c32to8bit(long[] arr32) {
    	long[] arr8 = new long[80];
        for(int i = 0; i < arr32.length; i++) {
            for (int bitOrder = i*4; bitOrder <= i*4 + 3; bitOrder++) {
                arr8[bitOrder] = arr32[i] & 255;
                arr32[i] = zeroFill(arr32[i], 8);
            }
        }
        return arr8;
    }
    
    /**
     * @throws InterruptedException **********************************************************************/
    

    public static void main(String[] args) throws InterruptedException {
    	String url = "http://www.getbackyourexnow.com/sdsdg/sdgsd/sdgsd.dg";
	    url="http://www.java.net";
	    System.out.println(new Date().getTime());
    	for(int i=0;i<=100;i++) {
	    	if(i!=0 && i%100 == 0){
	    		//System.out.println(new Date().getTime());
	    		//System.out.println(getDomainPageRank(url));
	    		//System.out.println(new Date().getTime());
	    		getDomainPageRank(url);
	    	} else {
	    		//System.out.print(getDomainPageRank(url));
	    		getDomainPageRank(url);
	    	}
	    	//Thread.sleep(1000);
	    }
    	System.out.println(new Date().getTime());
    	//System.out.println(generateNewCheckSum(generateCheckSum(strord("info:" + url))));
    }
    
}