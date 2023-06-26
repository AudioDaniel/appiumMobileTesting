package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.homeElements;
import com.appium.pages.elements.saucelabsElements.shopItemElements;
import com.appium.scripts.commons;
import io.appium.java_client.MobileElement;

import javax.xml.xpath.XPath;
import java.util.List;


public class shopScreen extends shopElements {

    public static homeElements homeElements = new homeElements();
    public static shopElements shopElements = new shopElements();

    public static commons commons = new commons();

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

    public static void clickSortButton() {
        click(shopElements.sortButton);
    }

    public static void selectPriceAscending() {
        click(shopElements.sortPriceAsc);
    }

    public static boolean assertOrderedAscPrices() {
        commons.scrollToXpath(shopElements.xpathItemPrice + "[6]");
        List<MobileElement> prices = commons.findElementsByXpath(shopElements.xpathItemPrice);
        System.out.println(prices.size());
        return commons.isOrderedAscPrice(prices);

    }

    public static void doubleTapBackpack() {
        commons.longPress(shopElements.saucelabsBackpack);
    }


    public static void selectNameAscending() {
        click(shopElements.sortNameAsc);
    }

    public static boolean assertOrderedAscNames() {
        commons.scrollToXpath(shopElements.xpathItemName + "[6]");
        List<MobileElement> names = commons.findElementsByXpath(shopElements.xpathItemName);
        return commons.assertElementsInOrder(names);

    }
}
