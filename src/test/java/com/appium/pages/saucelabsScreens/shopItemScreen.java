package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.shopItemElements;
import org.junit.Assert;
import com.appium.stepsDefinitions.mobilePageObject;
public class shopItemScreen extends shopElements {
    public static shopItemElements shopItemElements = new shopItemElements();

    public static void verifyCounterNumber(int times) {
        Assert.assertTrue("The number doesn't match the specified value " + times + "\nactual value: " + mobilePageObject.getTextElement(shopItemElements.counterAmount),
                (times == Integer.parseInt(mobilePageObject.getTextElement(shopItemElements.counterAmount))));
    }
}
