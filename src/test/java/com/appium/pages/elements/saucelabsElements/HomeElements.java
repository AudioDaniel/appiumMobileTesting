package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeElements extends mobilePageObject {

    // String TODO Mover a UTILS
    public static String genericSectionXpath = "//android.view.ViewGroup[@content-desc=\"menu item %s\"]";
    public static String apiCallsIphone7Xpath = "//android.view.ViewGroup[@content-desc=\"api calls screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView[@text=\"iPhone 7\"]";

    public static String linkedinIconXpath = "//android.view.ViewGroup[@content-desc=\"products screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView[3]";

    // MobileElements
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"menu item about\"]")
    public static MobileElement aboutButton;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"drawing screen\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.webkit.WebView")
    public static MobileElement drawingBoard;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]")
    public static MobileElement burgerButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"container header\"]")
    public MobileElement sectionTitle;

    @AndroidFindBy(xpath =
            "//android.view.ViewGroup[@content-desc=\"products screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView[3]")
    public static MobileElement linkedinIcon;
}
