package com.appium.scripts;

import com.appium.pages.baseAppium;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


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
