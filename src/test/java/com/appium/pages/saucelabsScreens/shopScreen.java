package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.homeElements;
import com.appium.pages.elements.saucelabsElements.shopItemElements;
import com.appium.scripts.commons;


public class shopScreen extends shopElements {

    public static homeElements homeElements = new homeElements();
    public static shopElements shopElements = new shopElements();

    // QUITAR
    public static shopItemElements shopItemElements = new shopItemElements();




    public static void clickBurgerButton(){
        click(homeElements.burgerButton);
    }


    public static void clickAboutButton() {
        click(homeElements.aboutButton);
    }
    // TODO MOVER A UTILS

    public static void genericClickItem(String item) {
        String xpath = String.format(shopElements.xpathItemByText, item);
        click(findElementByXpath(xpath));
    }

    public static void clickPlusButton() {
        click(shopElements.plusButton);
    }

    public static void proceedToCheckout() {
        click(shopElements.proceedToCheckoutButton);
    }

    public static void clickItem2(int pos) {
        click(commons.findElementsByXpath(shopElements.xpathAllItems).get(pos));
    }
}
