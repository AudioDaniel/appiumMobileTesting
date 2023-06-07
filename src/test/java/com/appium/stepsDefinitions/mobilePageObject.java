package com.appium.stepsDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static com.appium.pages.baseAppium.driver;
import static com.appium.pages.baseAppium.getDriver;

public class mobilePageObject {


    // METODOS GENÉRICOS
    protected mobilePageObject() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public static MobileElement findElementByXpath(String xpath) {

        WebElement element = driver.findElement(By.xpath(xpath));
        return (MobileElement) element;
    }
    public static MobileElement findElement(MobileElement element) {
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

    public static void click(MobileElement element) {
        try {
            //element.click();
            findElement(element).click();
        } catch (NoSuchElementException e) {
            Assert.fail("Fail to click on element: " + element);
        }
    }

    public void longPress(MobileElement element, int timePressed) {
        AndroidTouchAction touch = new AndroidTouchAction(getDriver());
        touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)).withDuration(Duration.ofSeconds(timePressed))).release().perform();
    }

    public static void setText(MobileElement element, String text) {
        try {
            // element.clear();
            // element.sendKeys(text);
            findElement(element).clear();
            findElement(element).sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Fail to set text on element:" + element);
        }
    }

    public static String getTextElement(MobileElement element) {
        try {
            return findElement(element).getText();
            // return element.getText();
        } catch (Exception e) {
            Assert.fail("Fail to get text on element:" + element);
            return null;
        }
    }

    public static boolean isPresent(MobileElement element) {
        try {
            boolean presence = element.isDisplayed();
            return presence;
        } catch (Exception e) {
            Assert.fail("Fail to get text on element:" + element);
            return false;
        }
    }

    public static Boolean verifyElementHasText(MobileElement element, String text) {
        return getTextElement(element).equals(text);
    }
}