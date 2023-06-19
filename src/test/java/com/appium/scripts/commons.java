package com.appium.scripts;

import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;


import com.appium.pages.baseAppium;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.appium.java_client.touch.offset.PointOption;





public class commons extends baseAppium {

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //MOBILE ELEMENT METHODS
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    //FIND ELEMENT
    public static WebElement findElementByID(String ID) {
        try {
            int attempts = 0;
            boolean failed;
            do {
                try {
                    WebElement element = driver.findElement(By.id(ID));
                    failed = false;
                    return element;
                } catch (Exception e) {
                    attempts++;
                    failed = true;
                }
            } while (attempts < 3 && failed);
            Assert.fail("Fail to find element: " + ID);
            return null;
        } catch (Exception ignored) {
            Assert.fail("Fail to find element: " + ID);
            return null;
        }
    }

    // TODO BORRAR EL DE mobilePage!!!!!!!!!!!!!!!!!!!!!
// FIND ELEMENT ----------------------------
    public static MobileElement findElementByXpath(String xpath) {
        try {
            int attempts = 0;
            boolean failed;
            do {
                try {
                    //MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                    MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                    failed = false;
                    return element;
                } catch (Exception e) {
                    attempts++;
                    System.out.println("Failed to find element after attempts: " + attempts);
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

    public static List<MobileElement> findElementsByXpath(String xpath) {
        try {
            int attempts = 0;
            boolean failed;
            do {
                try {
                    List<MobileElement> elements = (List<MobileElement>) driver.findElements(By.xpath(xpath));
                    failed = false;
                    return elements;
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


    //CLICK
    public static void click(String ID) {
        try {
            findElementByID(ID).click();
        } catch (Exception e) {
            Assert.fail("Fail to click on element: " + ID);
        }
    }

    //SET TEXT
    public static void setText(String ID, String text) {
        try {
            findElementByID(ID).clear();
            findElementByID(ID).sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Fail to set text on element:" + ID);
        }
    }

    //GET TEXT
    public static String getText(String ID) {
        try {
            return findElementByID(ID).getAttribute("text");
        } catch (Exception e) {
            Assert.fail("Fail to get text on element:" + ID);
            return null;
        }
    }
    //ELEMENTS TEXT ORDER
    public static boolean isOrderedAscPrice(List<MobileElement> prices) {
        if (prices.isEmpty()) {
            return true; // Empty list is considered ordered
        }

        Pattern pricePattern = Pattern.compile("\\$\\d+(\\.\\d{2})?"); // Regular expression for matching prices

        double previousPrice = extractPrice(prices.get(0).getText());

        for (int i = 1; i < prices.size(); i++) {
            double currentPrice = extractPrice(prices.get(i).getText());

            if (currentPrice < previousPrice) {
                return false; // Prices are not ordered
            }

            previousPrice = currentPrice;
        }

        return true; // All prices are ordered
    }

    private static double extractPrice(String text) {
        Matcher matcher = Pattern.compile("\\$\\d+(\\.\\d{2})?").matcher(text);
        if (matcher.find()) {
            String priceString = matcher.group();
            return Double.parseDouble(priceString.substring(1));
        }
        return 0.0;
    }

    //VERIFICATIONS
    public static boolean verifyElementHasText(String ID, String text) {
        return getText(ID).equals(text);
    }

    public static boolean verifyElementTypeHasText(String elementType, String text) {
        switch (elementType) {
            case "errorMessage":
                return verifyElementHasText("android:id/message", text);
        }
        return false;
    }

    // SWIPE
    //Horizontal Swipe by percentages
    public void horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);
        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }


    // ZOOM
    public void zoomOnElement(MobileElement element) throws InterruptedException {
        WebElement newElement = (WebElement) element;

        int x1 = element.getLocation().getX();
        int y1 = element.getLocation().getY();

        final int x = newElement.getLocation().getX() + newElement.getSize().getWidth() / 2;
        final int y = newElement.getLocation().getY() + newElement.getSize().getHeight() / 2;

        System.out.println("Now zooming");
        TouchAction finger1 = new TouchAction(driver);
        finger1.press(PointOption.point(x, y - 10)).moveTo(PointOption.point(x, y - 100)).release().perform();

        TouchAction finger2 = new TouchAction(driver);
        finger2.press(PointOption.point(x, y + 10)).moveTo(PointOption.point(x, y + 100)).release().perform();

        finger1.longPress(PointOption.point(x1, y1)).moveTo(PointOption.point(x1 + 50, y1 + 50));
        finger2.longPress(PointOption.point(x1, y1)).moveTo(PointOption.point(x1 - 50, y1 - 50));

        MultiTouchAction myAction = new MultiTouchAction(driver);

        myAction.add(finger1).add(finger2);
        myAction.perform();

        System.out.println("Zoom Done");
        Thread.sleep(8000);
    }

    // SCROLL VERTICAL
    public void scrollToXpath(String xpath) {
        WebElement element = null;
        boolean elementFound = false;

        while (!elementFound) {
            try {
                element = driver.findElement(By.xpath(xpath));
                elementFound = true;
            } catch (NoSuchElementException e) {
                verticalSwipeByPercentages(0.8, 0.2, 0.5);
            }
        }
    }




    // TODO BORRAR TODO MENOS ESTO
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PROPERTIES METHODS
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Properties getProperties(String propertiesFileName) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(System.getProperty("user.dir"),propertiesFileName)));
        } catch (FileNotFoundException e) {
            Assert.fail("File not found: " + propertiesFileName + ".\n" + e.getMessage());
        } catch (IOException e) {
            Assert.fail("Exception while reading: " + propertiesFileName + ".\n" + e.getMessage());
        }
        return properties;
    }
}
