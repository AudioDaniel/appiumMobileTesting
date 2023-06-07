package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.aboutElements;
import org.junit.Assert;

import java.util.Objects;

public class aboutScreen extends aboutElements {

    public static aboutElements aboutElements = new aboutElements();
    public static void verifyCurrentVersion(String currentVersion) {
        Assert.assertTrue("Element not present",isPresent(aboutElements.versionText));
        String currentText = aboutElements.versionText.getText();
        Assert.assertTrue(
                "The text doesn't match:\"" + currentVersion + "\"" +
                "\n Current text:\"" + currentText +"\"",
                (Objects.equals(currentText, currentVersion)));
    }
}
