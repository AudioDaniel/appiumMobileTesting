package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.homeElements;


public class shopScreen extends shopElements {

    public static homeElements homeElements = new homeElements();

    public static void clickBurgerButton(){
        click(homeElements.burgerButton);
    }


    public static void clickAboutButton() {
        click(homeElements.aboutButton);
    }
}
