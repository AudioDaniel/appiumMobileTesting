package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.homeElements;

public class homeScreen extends homeElements {

    public static homeElements homeElements = new homeElements();
    public static void clickOnSection(String section){
        String xpath = String.format(homeElements.genericSectionXpath,section.toLowerCase());
        findElementByXpath(xpath).click();
    }
}
