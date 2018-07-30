package org.codacy;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Fragment {
    public WebDriverWait wait;
    public WebDriver driver;


    public Fragment(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 15);

    }


    public boolean waitForElementToBePresent(By by, int waitInMilliSeconds) throws Exception {
        WebDriver driver = getDriver();
        int wait = waitInMilliSeconds;
        int iterations = (wait / 250);
        long startmilliSec = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            if ((System.currentTimeMillis() - startmilliSec) > wait)
                return false;
            List<WebElement> elements = driver.findElements(by);
            if (elements != null && elements.size() > 0)
                return true;
            Thread.sleep(250);
        }
        return false;
    }


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getElementWhenVisible(final By by) {
        final Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .ignoreAll(Arrays.asList(StaleElementReferenceException.class, NoSuchElementException.class));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }

    public WebElement getElementWhenClickable(final By by) {
        final Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .ignoreAll(Arrays.asList(StaleElementReferenceException.class, NoSuchElementException.class));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return driver.findElement(by);
    }




    public WebElement elementNotPresent(final By by) {
        final Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(15, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .ignoreAll(Arrays.asList(StaleElementReferenceException.class, NoSuchElementException.class));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        return driver.findElement(by);
    }

    public boolean retryingStaleElement(By by) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                driver.findElement(by).isDisplayed();
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
    }
}





