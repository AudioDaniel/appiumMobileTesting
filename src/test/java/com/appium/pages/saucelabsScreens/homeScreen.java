package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.homeElements;
import com.appium.scripts.commons;
public class homeScreen extends homeElements {
    public static commons commons = new commons();

    public static homeElements homeElements = new homeElements();
    public static void clickOnSection(String section){
        String xpath = String.format(homeElements.genericSectionXpath,section.toLowerCase());
        findElementByXpath(xpath).click();
    }

    public static void swipeScreen() {
        commons.horizontalSwipeByPercentage(0.9,0.1,0.5);
    }
}
