/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.serpScraper.google.pages;

import com.cybermint.pages.Page;
import com.cybermint.utils.captchasolver.CaptchaSolverServiceProvider;
import com.cybermint.utils.captchasolver.CaptchaSolverServiceProviderFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ADMIN
 */
public class GoogleSorryPage extends Page {

    @FindBy(xpath = "//img") protected WebElement captchaImage;
    @FindBy(xpath = "//form[@action=\"Captcha\"]/input[@id=\"captcha\"]") protected WebElement captchaTextBox;
    @FindBy(xpath = "//form[@action=\"Captcha\"]/input[@type=\"submit\"]") protected WebElement captchaSubmitButton;

    public GoogleSorryPage(WebDriver driver) {
        super(driver);
        this.initialize();
    }

    public GoogleSERPage submitCaptcha() {
        System.out.println("Sorry Page Detected");
        //String captchaText = callCaptchaServiceProvider("DBC", "captcher12", "123solvecaptch!@#", captchaImage);
        captchaTextBox.clear();
        captchaTextBox.click();
        try {
            //captchaTextBox.sendKeys(captchaText);
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GoogleSorryPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        captchaSubmitButton.click();
        return PageFactory.initElements(driver, GoogleSERPage.class);

    }

     public String callCaptchaServiceProvider(String serviceProviderName, String username, String password, WebElement captchaImage) {
        String uRL = captchaImage.getAttribute("src");
        System.out.println("Src image URL"+uRL);
        CaptchaSolverServiceProviderFactory service = CaptchaSolverServiceProviderFactory.getInstance();
        CaptchaSolverServiceProvider serviceProvider = service.getProvider(serviceProviderName);
        String captchStr = serviceProvider.solveCaptchaFromURL(username, password, uRL);
        return captchStr;
    }


}
