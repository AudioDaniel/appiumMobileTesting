package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.HomeElements;
import com.appium.scripts.Commons;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class HomeScreen extends HomeElements{

    public static void clickOnSection(String section){
        String xpath = String.format(HomeElements.genericSectionXpath,section.toLowerCase());
        (Commons.findElementByXpath(xpath)).click();
    }

    public static void swipeScreen() {
        Commons.horizontalSwipeByPercentage(0.9,0.1,0.5);
    }

    public static void pinchscreen() {
        try{
            Commons.zoomOnElement(HomeElements.drawingBoard);}
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public static void scrollToLinkedin() {
        Commons.scrollToXpath(HomeElements.linkedinIconXpath);
    }

    public static void clickLinkedin() {
        Commons.click(HomeElements.linkedinIcon);
    }

    public static void scrollToIphone7() {
        Commons.scrollToXpath(HomeElements.apiCallsIphone7Xpath);
    }

    public static void clickBurgerButton(){
        // TODO FUNCIONA CUANDO INSTANCIAS LA CLASE PERO NO CUANDO LA LLAMAS
        HomeElements.burgerButton.click();
    }
}
