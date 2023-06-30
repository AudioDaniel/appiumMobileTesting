package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.homeElements;
import com.appium.scripts.Commons;
import io.appium.java_client.MobileElement;

import java.util.Objects;

public class homeScreen extends homeElements {

    //public static homeElements homeElements = new homeElements();
    public static void clickOnSection(String section){
        String xpath = String.format(homeElements.genericSectionXpath,section.toLowerCase());
        Objects.requireNonNull(findElementByXpath(xpath)).click();
    }

    public static void swipeScreen() {
        Commons.horizontalSwipeByPercentage(0.9,0.1,0.5);
    }

    public static void pinchscreen() {
        try{
            Commons.zoomOnElement(homeElements.drawingBoard);}
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public static void scrollToLinkedin() {
        Commons.scrollToXpath(homeElements.linkedinIconXpath);
    }

    public static void clickLinkedin() {
        click(homeElements.linkedinIcon);
    }

    public static void scrollToIphone7() {
        Commons.scrollToXpath(homeElements.apiCallsIphone7Xpath);
    }

    public static void clickBurgerButton(){
        Commons.click(homeElements.burgerButton);
    }
}
