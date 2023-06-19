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

    public static void pinchscreen() {
        try{
            commons.zoomOnElement(homeElements.drawingBoard);}
        catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public static void scrollToLinkedin() {
        commons.scrollToXpath(homeElements.linkedinIconXpath);
    }

    public static void clickLinkedin() {
        click(homeElements.linkedinIcon);
    }

    public static void scrollToIphone7() {
        commons.scrollToXpath(homeElements.apiCallsIphone7Xpath);
    }
}
