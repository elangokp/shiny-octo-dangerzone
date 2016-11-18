/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.utils.captchasolver.dbc;

import com.DeathByCaptcha.AccessDeniedException; 
import com.DeathByCaptcha.Client;
import com.DeathByCaptcha.Exception;
import com.DeathByCaptcha.SocketClient;
import com.DeathByCaptcha.Captcha;
import com.cybermint.utils.captchasolver.CaptchaSolverServiceProvider;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DBCCaptchaSolver implements CaptchaSolverServiceProvider {
	
	private String username = "captcher12";
	
	private String password = "123solvecaptch!@#";
	
	private Captcha captcha = null;

    public String solveCaptchaFromURL(String userName, String password, String imgURL) {

        Client client = (Client) (new SocketClient(userName, password));
        captcha = null;

        try {
            URL uRL = new URL(imgURL);
            System.out.println("1");
            InputStream imgStream = uRL.openStream();
            System.out.println("2");
            captcha = client.decode(imgStream);
            System.out.println("3");

            if (null != captcha) {
                System.out.println("CAPTCHA " + captcha.id + " solved: " + captcha.text);
            }
        } catch (MalformedURLException e) {
        	System.out.println("11");
            System.out.println("MalformedURLException" + e);
        } catch (AccessDeniedException e) {
        	System.out.println("12");
            System.out.println("Cannot connect to DBC" + e);
        } catch (IOException e) {
        	System.out.println("13");
        	e.printStackTrace();
            System.out.println("IOException" + e);
        } catch (InterruptedException e) {
        	System.out.println("14");
            System.out.println("InterruptedException" + e);
        } catch (Exception e) {
        	System.out.println("15");
            System.out.println("Exception" + e);
        }

        return captcha.text;
    }
    
    public String solveCaptchaFromFile(String userName, String password, File img) {

        Client client = (Client) (new SocketClient(userName, password));
        captcha = null;

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
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }

        return captcha.text;
    }
    
    public String solveCaptchaFromFileLocation(String imgLocation) {

    	// Put your DBC username & password here:
        //Client client = (Client)(new HttpClient(args[0], args[1]));
        Client client = (Client)(new SocketClient(this.username, this.password));
        client.isVerbose = true;
        captcha = null;

        try {
            try {
                System.out.println("Your balance is " + client.getBalance() + " US cents");
            } catch (IOException e) {
                System.out.println("Failed fetching balance: " + e.toString());
                return null;
            }

            
            try {
                // Upload a CAPTCHA and poll for its status with 120 seconds timeout.
                // Put you CAPTCHA image file name, file object, input stream, or
                // vector of bytes, and optional solving timeout (in seconds) here.
            	//URL uRL = new URL("https://c5.ah.yahoo.com/captcha/v3/render?encodedUrl=ws_0pVP5zlAybgTpqjnGCmsRoW_zD7X5tSsIPTne5OZDYLzoSJP.5tFgpOg23TV6arnoyym.H.Uyo7Exj89sONhdnKOAfq7FVpQ.VJjcIuDhXoSlN96nl3in_dpsH5Zjo.hfp670WfW9UvZ2EzRLBZcI5ErTzdOJloeo7harxITlbAWG7QZoPLuyN_ORg--");
                //System.out.println("1");
                //InputStream imgStream = uRL.openStream();
                //System.out.println("2");
                captcha = client.decode(new File(imgLocation), 120);
            } catch (IOException e) {
                System.out.println("Failed uploading CAPTCHA");
                return null;
            } catch (InterruptedException e) {
            	System.out.println("Failed uploading CAPTCHA");
				e.printStackTrace();
				return null;
			} catch (Exception e) {
                System.out.println("Failed uploading CAPTCHA");
                return null;
            } 
            if (null != captcha) {
                System.out.println("CAPTCHA " + captcha.id + " solved: " + captcha.text);

                // Report incorrectly solved CAPTCHA if necessary.
                // Make sure you've checked if the CAPTCHA was in fact incorrectly
                // solved, or else you might get banned as abuser.
                /*try {
                    if (client.report(captcha)) {
                        System.out.println("Reported as incorrectly solved");
                    } else {
                        System.out.println("Failed reporting incorrectly solved CAPTCHA");
                    }
                } catch (IOException e) {
                    System.out.println("Failed reporting incorrectly solved CAPTCHA: " + e.toString());
                }*/
            } else {
                System.out.println("Failed solving CAPTCHA");
                return null;
            }
        } catch (com.DeathByCaptcha.Exception e) {
            System.out.println(e);
            return null;
        }
        
        return captcha.text;
    }
    
    
    public void reportIncorrectCaptcha() {
    	Client client = (Client)(new SocketClient(this.username, this.password));
    	try {
			client.report(captcha);
		} catch (IOException | Exception e) {
			e.printStackTrace();
		}
    }
    /*public static void main(String[] args) {
    	DBCCaptchaSolver dbc = new DBCCaptchaSolver();
		String text = dbc.solveCaptchaFromFile("captcher12", "123solvecaptch!@#", new File("C:/Users/elangokp.AHC.000/Google Drive/render.gif"));
		System.out.println(text);
    }*/
    
    public static void main(String[] args)
            throws Exception
        {
            // Put your DBC username & password here:
            //Client client = (Client)(new HttpClient(args[0], args[1]));
            Client client = (Client)(new SocketClient("captcher12", "123solvecaptch!@#"));
            client.isVerbose = true;

            try {
                try {
                    System.out.println("Your balance is " + client.getBalance() + " US cents");
                } catch (IOException e) {
                    System.out.println("Failed fetching balance: " + e.toString());
                    return;
                }

                Captcha captcha = null;
                try {
                    // Upload a CAPTCHA and poll for its status with 120 seconds timeout.
                    // Put you CAPTCHA image file name, file object, input stream, or
                    // vector of bytes, and optional solving timeout (in seconds) here.
                	URL uRL = new URL("https://c5.ah.yahoo.com/captcha/v3/render?encodedUrl=ws_0pVP5zlAybgTpqjnGCmsRoW_zD7X5tSsIPTne5OZDYLzoSJP.5tFgpOg23TV6arnoyym.H.Uyo7Exj89sONhdnKOAfq7FVpQ.VJjcIuDhXoSlN96nl3in_dpsH5Zjo.hfp670WfW9UvZ2EzRLBZcI5ErTzdOJloeo7harxITlbAWG7QZoPLuyN_ORg--");
                    System.out.println("1");
                    InputStream imgStream = uRL.openStream();
                    System.out.println("2");
                    captcha = client.decode(new File("C:/Users/elangokp.AHC.000/Google Drive/render-sc.png"), 120);
                } catch (IOException e) {
                    System.out.println("Failed uploading CAPTCHA");
                    return;
                } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
                    System.out.println("Failed uploading CAPTCHA");
                    return;
                } 
                if (null != captcha) {
                    System.out.println("CAPTCHA " + captcha.id + " solved: " + captcha.text);

                    // Report incorrectly solved CAPTCHA if necessary.
                    // Make sure you've checked if the CAPTCHA was in fact incorrectly
                    // solved, or else you might get banned as abuser.
                    /*try {
                        if (client.report(captcha)) {
                            System.out.println("Reported as incorrectly solved");
                        } else {
                            System.out.println("Failed reporting incorrectly solved CAPTCHA");
                        }
                    } catch (IOException e) {
                        System.out.println("Failed reporting incorrectly solved CAPTCHA: " + e.toString());
                    }*/
                } else {
                    System.out.println("Failed solving CAPTCHA");
                }
            } catch (com.DeathByCaptcha.Exception e) {
                System.out.println(e);
            }
        }
    
    
}
