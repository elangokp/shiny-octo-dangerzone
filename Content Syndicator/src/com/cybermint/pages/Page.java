/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.pages;

import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.captchasolver.dbc.DBCCaptchaSolver;
import com.gargoylesoftware.htmlunit.AlertHandler;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.CollectingAlertHandler;
import com.gargoylesoftware.htmlunit.DefaultCredentialsProvider;
import com.gargoylesoftware.htmlunit.IncorrectnessListenerImpl;
import com.gargoylesoftware.htmlunit.ProxyConfig;
import com.gargoylesoftware.htmlunit.ScriptException;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HTMLParserListener;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.JavaScriptErrorListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.jetty.log.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Elango
 */
public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void initialize() {
        try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			//e.printStackTrace();
		}
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static boolean isPageLoaded(HashMap<String, String> elementIdentifiers) {
        boolean isLoaded = false;
        Set<Entry<String, String>> elementIdentifierEntries = elementIdentifiers.entrySet();
        for (Entry anElementIdentifier : elementIdentifierEntries) {
        }
        return isLoaded;
    }

    public boolean waitForElementToLoad(String by, String identifier) {
        boolean isLoaded = false;
        for (int i = 0; isLoaded == false && i < 65; i++) {
            isLoaded = isElementVisible(by, identifier);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return isLoaded;
    }
    
    public boolean waitForOneOfTheElementToLoad(HashMap<String, String> elementIdentifiers) {
        boolean isLoaded = false;
        for (int i = 0; isLoaded == false && i < 65; i++) {
        	Set<Entry<String, String>> elementIdentifierEntries = elementIdentifiers.entrySet();
            for (Entry<String, String> anElementIdentifier : elementIdentifierEntries) {
            	isLoaded = isLoaded ? true : isElementVisible(anElementIdentifier.getKey(), anElementIdentifier.getValue());
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return isLoaded;
    }

    public boolean waitForElementToBeEnabled(WebElement element) {
        boolean isEnabled = false;
        for (int i = 0; isEnabled == false && i < 30; i++) {
            isEnabled = element.isEnabled();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return isEnabled;
    }
    
    public boolean waitForElementToBeDisappear(String by, String identifier, Integer secondsToWait) {
        boolean doesAppear = false;
        for (int i = 0; doesAppear == false && i < secondsToWait; i++) {
        	doesAppear = !isElementVisible(by, identifier);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return doesAppear;
    }

    public boolean isElementVisible(String by, String identifier) {
        boolean isVisible = false;
        try {
            if ("id".equalsIgnoreCase(by)) {
                isVisible = true;
                driver.findElement(By.id(identifier));
            } else if ("name".equalsIgnoreCase(by)) {
                isVisible = true;
                driver.findElement(By.name(identifier));
            } else if ("linkText".equalsIgnoreCase(by)) {
                isVisible = true;
                driver.findElement(By.linkText(identifier));
            } else if ("xpath".equalsIgnoreCase(by)) {
                isVisible = true;
                driver.findElement(By.xpath(identifier));
            }
        } catch (Exception e) {
            isVisible = false;
        }
        return isVisible;

    }

    public void clearAndType(WebElement givenElement, String givenString) {
        givenElement.clear();
        givenElement.click();
        if(null!=givenString) {
            givenElement.sendKeys(givenString);
        }
    }

    //Doesnt work properly
    public void pasteText(WebElement givenElement, String text) {
        givenElement.clear();
        givenElement.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String webElementID = givenElement.getAttribute("id");
        if(null!=text) {
            js.executeScript("document.getElementById('"+ webElementID +"').value='"+ TextFileReaderUtils.escapeString(text) +"';");
        }
    }
    
    public File getImage(WebElement givenImageElement) {
    	File screen = null;
    	try {
			//WebElement Image=driver.findElement(By.xpath(imageXpath));
			screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			int width=givenImageElement.getSize().getWidth();
			int height=givenImageElement.getSize().getHeight();
			BufferedImage img=ImageIO.read(screen);
			BufferedImage reqImg=img.getSubimage(givenImageElement.getLocation().getX(), givenImageElement.getLocation().getY(), width, height);
			ImageIO.write(reqImg, "png", screen);
			return screen;
			//File file=new File(loc);
			//FileUtils.copyFile(screen,file);
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return screen;
    }

    public static WebDriver constructDriver(String driverType) {
        @SuppressWarnings("all") WebDriver driver;
        if ("firefox".equalsIgnoreCase(driverType)) {
//            FirefoxBinary fb = new FirefoxBinary();
//            fb.setEnvironmentProperty("DISPLAY", ":1");
            //FirefoxProfile profile = new FirefoxProfile();
           // profile.setPreference("network.http.max-connections", 48);
           // driver = new FirefoxDriver(profile);
        	FirefoxBinary fb = new FirefoxBinary(new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe"));
        	FirefoxProfile profile = new FirefoxProfile();
        	driver = new FirefoxDriver(fb,profile);
        }else if ("firefoxproxy".equalsIgnoreCase(driverType)) {
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("network.proxy.http", "bproxy123:ichoosebproxy@173.0.61.237");
            profile.setPreference("network.proxy.http_port", "3128");
            driver = new FirefoxDriver(profile);
        } else if ("ie".equalsIgnoreCase(driverType)) {
            driver = new InternetExplorerDriver();
        }else if ("htmlunit".equalsIgnoreCase(driverType)) {
            HtmlUnitDriver htmldriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_8) {

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
                    client.setAlertHandler(new CollectingAlertHandler(new ArrayList()) );
                    return client;
                }
            };
            htmldriver.setJavascriptEnabled(false);
            driver = htmldriver;
        } else if ("htmlunitsilent".equalsIgnoreCase(driverType)) {
            HtmlUnitDriver htmldriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_8) {

                @Override
                protected WebClient modifyWebClient(WebClient client) {
                	
                	LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

                    java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF); 
                    java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);

                    //webClient = new WebClient(bv);
                    //webClient.setCssEnabled(false);
                    
                    client.setCssErrorHandler(new SilentCssErrorHandler());
                    client.setIncorrectnessListener(new IncorrectnessListenerImpl() {

                        @Override
                          public void notify(String arg0, Object arg1)
                          {
                            //System.err.println("Argument : " + arg0.toString() + ", Object : ");
                          }
                    });
                    client.setHTMLParserListener(new HTMLParserListener() {

						@Override
						public void error(String arg0, URL arg1, String arg2,
								int arg3, int arg4, String arg5) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void warning(String arg0, URL arg1, String arg2,
								int arg3, int arg4, String arg5) {
							// TODO Auto-generated method stub
							
						}
                    });
                    client.setJavaScriptErrorListener(new JavaScriptErrorListener() {

						@Override
						public void loadScriptError(HtmlPage arg0, URL arg1,
								Exception arg2) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void malformedScriptURL(HtmlPage arg0,
								String arg1, MalformedURLException arg2) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void scriptException(HtmlPage arg0,
								ScriptException arg1) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void timeoutError(HtmlPage arg0, long arg1,
								long arg2) {
							// TODO Auto-generated method stub
							
						}

                    });
                    client.setAlertHandler(new CollectingAlertHandler(new ArrayList()) );
                    return client;
                }
            };
            htmldriver.setJavascriptEnabled(false);
            driver = htmldriver;
        }else if ("htmlunitproxy".equalsIgnoreCase(driverType)) {
            HtmlUnitDriver htmldriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11) {

                @Override
                protected WebClient modifyWebClient(WebClient client) {
                    //client.setProxyConfig(new ProxyConfig("proxy.cognizant.com", 6050));

                    /*DefaultCredentialsProvider credentialsProvider = new DefaultCredentialsProvider();
                    credentialsProvider.addCredentials("331847", "ch@rl3s_b_pass03");
                    //credentialsProvider.addProxyCredentials("309680", "nov@1234", "proxy.tcs.com", 8080);
                    client.setCredentialsProvider(credentialsProvider);*/
                    String userAndPassword = "331847" + ":" + "ch@rl3s_b_pass03";
                    String userAndPasswordBase64 = Base64.encodeBase64String(userAndPassword.getBytes());
                    client.addRequestHeader("Proxy-Authorization", "Basic "+userAndPasswordBase64);
                    /*client.getProxyConfig().setProxyHost("proxy.cognizant.com");
                    client.getProxyConfig().setProxyPort(6050);*/
                    client.setCssErrorHandler(new SilentCssErrorHandler());
                    /*client.setIncorrectnessListener(new IncorrectnessListenerImpl() {

                        @Override
                          public void notify(String arg0, Object arg1)
                          {
                            //System.err.println("Argument : " + arg0.toString() + ", Object : ");
                          }
                    });*/
                    client.setAlertHandler(new CollectingAlertHandler(new ArrayList()) );
                    
                    return client;
                }
            };
            htmldriver.setJavascriptEnabled(true);
            //htmldriver.setProxy("proxy.tcs.com", 8080);
            driver = htmldriver;
        } else if ("chrome".equalsIgnoreCase(driverType)) {
            System.setProperty("webdriver.chrome.driver", "D:/setups/Open Source Apps/chromedriver_win_16.0.902.0/chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("phantomjs".equalsIgnoreCase(driverType)) {
        	DesiredCapabilities sCaps = new DesiredCapabilities();
            sCaps.setJavascriptEnabled(true);
            sCaps.setCapability("takesScreenshot", false);
            sCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "lib/PhantomJS/phantomjs.exe");
            ArrayList<String> cliArgsCap = new ArrayList<String>();
            cliArgsCap.add("--web-security=false");
            cliArgsCap.add("--ssl-protocol=any");
            cliArgsCap.add("--ignore-ssl-errors=true");
            sCaps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cliArgsCap);
            driver = new PhantomJSDriver(sCaps);
        } else {
            driver = new FirefoxDriver();
        }
        return driver;
    }
    
    public static void main(String args[]) throws Exception{
//    	HtmlUnitDriver htmldriver = (HtmlUnitDriver) Page.constructDriver("htmlunitproxy");
//    	htmldriver.get("http://www.google.com");
//    	System.out.println(htmldriver.getPageSource());
    	WebDriver driver = Page.constructDriver("firefox");
    	Page aPage = new Page(driver);
    	driver.get("http://ipv6.google.com/sorry/IndexRedirect?continue=");
    	WebElement Image=driver.findElement(By.xpath("//img"));
    	File captchaImage = aPage.getImage(Image);
    	File file=new File("C://data//img.jpeg");
		FileUtils.copyFile(captchaImage,file);
    	DBCCaptchaSolver cs = new DBCCaptchaSolver();
    	cs.solveCaptchaFromFile("captcher12", "123solvecaptch!@#", captchaImage);
    }
}
