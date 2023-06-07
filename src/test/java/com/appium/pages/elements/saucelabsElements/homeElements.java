package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class homeElements extends mobilePageObject {

    // String TODO Mover a UTILS
    public String genericSectionXpath = "//android.view.ViewGroup[@content-desc=\"menu item %s\"]";

    // MobileElements
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"menu item about\"]")
    public MobileElement aboutButton;

    @AndroidFindBy(accessibility = "open menu")
    public MobileElement burgerButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"container header\"]")
    public MobileElement sectionTitle;
}
