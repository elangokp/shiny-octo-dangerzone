/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.contentSyndicator.platforms.pligg.pages;

import com.cybermint.pages.Page;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.captchasolver.CaptchaSolverServiceProvider;
import com.cybermint.utils.captchasolver.CaptchaSolverServiceProviderFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Krithika Vittal
 */
public class PliggSubmitANewStoryPage extends PliggPage {

    @FindBy(id = "title")
    protected WebElement titleTextBox;
    @FindBy(id = "tags")
    protected WebElement tagsTextBox;
    @FindBy(id = "bodytext")
    protected WebElement bodyTextArea;
    @FindBy(xpath = "//input[@value='Save Changes and Submit']")
    protected WebElement submitButton;
    @FindBy(id = "category")
    protected WebElement categorySelectBox;
    @FindBy(xpath = "//div[@id=\"recaptcha_image\"]/img")
    protected WebElement captchaImage;
    @FindBy(id = "recaptcha_response_field")
    protected WebElement captchaTextBox;

    public PliggSubmitANewStoryPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Submits a story in the submit page
     * @param title
     * @param category
     * @param tags
     * @param newsfile
     * @param username
     * @param password
     * @param serviceProviderName
     * @return 
     */
    public PliggPage submitANewStory(String title, String category,
            List<String> tags, String newsfile, String username, String password, String serviceProviderName) {

        String tagString = "";
        ListIterator<String> tagsIter = tags.listIterator();
        int tagCount = tags.size();
        while (tagsIter.hasNext()) {
            if ((tagsIter.nextIndex()+1)<tagCount) {
                System.out.println("tagCount "+tagCount);
                System.out.println("tagsIter.nextIndex() "+tagsIter.nextIndex());
                tagString = tagString.concat(tagsIter.next()).concat(",");
            } else {
                tagString = tagString.concat(tagsIter.next());
            }
        }
        checkMaxLengthAndEnterText(title, titleTextBox);
        selectOption(category, categorySelectBox);
        checkMaxLengthAndEnterText(tagString, tagsTextBox);
        checkMaxLengthAndEnterText(TextFileReaderUtils.readFileAsString(newsfile), bodyTextArea);
        String captchStr = callCaptchaServiceProvider(serviceProviderName, username, password, captchaImage);
        checkMaxLengthAndEnterText(captchStr, captchaTextBox);
        submitButton.click();
        if(isSubmitNewSuccessPage()){
        return PageFactory.initElements(driver, PliggSubmitStorySuccessPage.class);
        }
        return PageFactory.initElements(driver, PliggSubmitStoryErrPage.class);
    }

    /**
     * Method to select the option in a select box
     * @param category
     * @param selectElement 
     */
    public void selectOption(String optionStr, WebElement selectBox) {
        Select select = new Select(selectBox);
        List<WebElement> alloptions = select.getOptions();
        int categoryIndex = 0;
        for (WebElement option : alloptions) {
            String selectText = option.getText();
            if (optionStr.equalsIgnoreCase(selectText)) {
                categoryIndex = Integer.parseInt(option.getAttribute("Value"));
            }
        }
        select.selectByIndex(categoryIndex);
    }

    /**
     * Check the maxlength of a textbox/textarea and to enter the given text
     * @param entrytext
     * @param textBox 
     */
    public void checkMaxLengthAndEnterText(String entrytext, WebElement textBox) {
        
        String maxlengthStr = textBox.getAttribute("maxlength");
        
        if (null != maxlengthStr) {
            int maxLength = Integer.parseInt(maxlengthStr);
            int entrytextLength = entrytext.length();
            if (entrytextLength <= maxLength) {
                textBox.clear();
                textBox.sendKeys(entrytext);
            } else {
                System.out.println("more than maxlength "+entrytext+"::"+maxlengthStr);
            }
        } else {
            textBox.clear();
            textBox.sendKeys(entrytext);
        }
    }

    /**
     * Returns a instance of the captcha solver service provider
     * @param serviceProviderName
     * @param username
     * @param password
     * @param captchaImage
     * @return 
     */
    public String callCaptchaServiceProvider(String serviceProviderName, String username, String password, WebElement captchaImage) {
        String uRL = captchaImage.getAttribute("src");
        System.out.println("Src image URL"+uRL);
        CaptchaSolverServiceProviderFactory service = CaptchaSolverServiceProviderFactory.getInstance();
        CaptchaSolverServiceProvider serviceProvider = service.getProvider(serviceProviderName);
        String captchStr = serviceProvider.solveCaptchaFromURL(username, password, uRL);
        return captchStr;
    }
    

    public static void main(String args[]) {
        try {
            WebDriver driver = new InternetExplorerDriver();
            PliggPage postPage = null;
            String publishedLink = null;
            String publishedStatus = null;
            String errStatus = null;
            driver.get("http://cybermint.com/demos/pligg/submit.php");
            PliggLoginPage aPliggLoginPage = PageFactory.initElements(driver, PliggLoginPage.class);
            PliggNewsSourcePage aPliggPage = aPliggLoginPage.loginAs("demo", "demo123");
            PliggPage submitNewsTestPage = aPliggPage.enterNewsSourceURL("http://geosoft.no/development/javastyle.html");
            List<String> tagList = new ArrayList<String>();
            tagList.add("test 1");
            tagList.add("test 2");
            if (submitNewsTestPage.isSubmitNewsSourceSuccessPage()) {
                postPage = ((PliggSubmitANewStoryPage) submitNewsTestPage).submitANewStory("111downcasting", "News", tagList,
                        "F:/KRITHIKA/test.txt", "captcher12", "123solvecaptch!@#", "DBC");
                if (postPage.isSubmitNewSuccessPage()) {
                    publishedStatus = ((PliggSubmitStorySuccessPage) postPage).checkAndGetPublishedStatus("111downcasting");
                    publishedLink = ((PliggSubmitStorySuccessPage) postPage).getPublishedLink();
                    System.out.println("*******Status******" + publishedStatus);
                    System.out.println("*******Link******" + publishedLink);
                } else {
                    errStatus = ((PliggSubmitStoryErrPage) postPage).getErrStatus();
                    System.out.println("*******Error******" + errStatus);
                }
            } else {
                errStatus = ((PliggSubmitStoryErrPage) submitNewsTestPage).getErrStatus();
                System.out.println("*******Error******" + errStatus);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
