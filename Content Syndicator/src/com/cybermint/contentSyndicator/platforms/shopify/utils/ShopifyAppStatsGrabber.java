package com.cybermint.contentSyndicator.platforms.shopify.utils;

import com.cybermint.factories.webdrivers.PoolableWebDriverFactory;
import com.cybermint.utils.TextFileWriterUtils;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopifyAppStatsGrabber {

    public static void main(String[] args) throws Exception {

        PoolableWebDriverFactory aPoolableWebDriverFactory = new PoolableWebDriverFactory("chrome", "", "C:\\custom\\ChromeDriver\\chromedriver.exe");
        GenericObjectPool driverPool = new GenericObjectPool(aPoolableWebDriverFactory);
        driverPool.setWhenExhaustedAction(GenericObjectPool.WHEN_EXHAUSTED_BLOCK);
        driverPool.setMaxActive(1);
        driverPool.setLifo(false); //To make it behave a FIFO
        driverPool.setMaxWait(45000);
        WebDriver driver = null;
        driver = (WebDriver) driverPool.borrowObject();
        TextFileWriterUtils.writeString("App Name,Desc,Rating,Review Count,Rank", "C:\\custom\\shopify-apps.csv", Boolean.TRUE, Boolean.TRUE);
        int rank = 1;
        for (int page = 1; page <= 130; page++) {
            driver.get("https://apps.shopify.com/browse?page=" + page);
            List<WebElement> appContainers = driver.findElements(By.cssSelector(".ui-app-card__container"));
            for (WebElement appContainer : appContainers) {
                StringBuffer appDetails = new StringBuffer();
                String appName = appContainer.findElement(By.cssSelector(".ui-app-card__name")).getText();
                String appDesc = appContainer.findElement(By.cssSelector(".ui-app-card__details")).getText();
                String appRating = "0";
                String appReviewCount = "0";
                try {
                    appRating = appContainer.findElement(By.cssSelector(".ui-star-rating__rating")).getText().substring(0, 3);
                    appReviewCount = appContainer.findElement(By.cssSelector(".ui-review-count-summary")).getText()
                            .replaceAll("\\(", "").replaceAll("\\)", "")
                            .replaceAll("\\s+", "").replaceAll("reviews", "");
                } catch (Exception e) {

                }
                appDetails.append("\"").append(appName).append("\",\"").append(appDesc).append("\",\"")
                        .append(appRating).append("\",\"").append(appReviewCount).append("\",")
                        .append(rank++);
                System.out.println(appDetails.toString());
                TextFileWriterUtils.writeString(appDetails.toString(), "C:\\custom\\shopify-apps.csv", Boolean.TRUE, Boolean.TRUE);
            }
        }
    }
}
