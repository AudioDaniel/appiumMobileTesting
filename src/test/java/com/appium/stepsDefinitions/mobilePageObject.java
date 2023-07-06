package com.appium.stepsDefinitions;

import io.appium.java_client.PerformsTouchActions;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static com.appium.pages.baseAppium.*;

public class mobilePageObject {


    // METODOS GENÉRICOS
    // TODO PONER PROTECTED?
    protected mobilePageObject() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public static WebElement findElementByXpath(String xpath) {

        try {

            int attempts = 0;

            boolean failed;

            do {

                try {

                    WebElement element = (WebElement) driver.findElement(By.xpath(xpath));

                    failed = false;

                    return element;

                } catch (Exception e) {

                    attempts++;

                    failed = true;

                }

            } while (attempts < 3 && failed);

            Assert.fail("Fail to find element: " + xpath);

            return null;

        } catch (Exception ignored) {

            Assert.fail("Fail to find element: " + xpath);

            return null;

        }

    }

    public static WebElement findElement(WebElement element) {
        try {
            int attempts = 0;
            boolean failed;
            do {
                try {
                    failed = element.isDisplayed();
                    System.out.println("Driver(mobilePageObject): " + getDriver());
                    return element;
                } catch (Exception e) {
                    attempts++;
                    failed = false;
                    System.out.println("Retry find element:" + element);
                }
            } while (attempts < 5 && !failed);
            Assert.fail("Fail to find element: " + element + "ATTEMPTS>5 \n");
            return null;
        } catch (Exception ignored) {
            Assert.fail("Fail to find element: " + element + "IGNORED \n");
            return null;
        }
    }

    public static void click(WebElement element) {
        try {
            //element.click();
            findElement(element).click();
        } catch (NoSuchElementException e) {
            Assert.fail("Fail to click on element: " + element);
        }
    }

    public void longPress(WebElement element, int timePressed) {
        AndroidTouchAction touch = new AndroidTouchAction((PerformsTouchActions) getDriver());
        touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)).withDuration(Duration.ofSeconds(timePressed))).release().perform();
    }

    public static void setText(WebElement element, String text) {
        try {
            //wait.until(ExpectedConditions.elementToBeSelected())
            element = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(element));
            element.clear();
            element.sendKeys(text);
            //findElement(element).clear();
            //findElement(element).sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Fail to set text on element:" + element);
        }
    }

    public static String getTextElement(WebElement element) {
        try {
            return findElement(element).getText();
            // return element.getText();
        } catch (Exception e) {
            Assert.fail("Fail to get text on element:" + element);
            return null;
        }
    }

    public static boolean isPresent(WebElement element) {
        try {
            boolean presence = element.isDisplayed();
            return presence;
        } catch (Exception e) {
            Assert.fail("Fail to get text on element:" + element);
            return false;
        }
    }

    public static Boolean verifyElementHasText(WebElement element, String text) {
        return getTextElement(element).equals(text);
    }
}