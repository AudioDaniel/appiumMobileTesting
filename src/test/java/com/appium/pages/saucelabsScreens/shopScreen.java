package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.homeElements;
import com.appium.scripts.Commons;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Objects;


public class shopScreen {

    //public static commons commons = new commons();

    public static void clickBurgerButton(){
        Commons.click(homeElements.burgerButton);
    }


    public static void clickAboutButton() {
        Commons.click(homeElements.aboutButton);
    }
    // TODO MOVER A UTILS

    public static void genericClickItem(String item) {
        String xpath = String.format(shopElements.xpathItemByText, item);
        Commons.click(Commons.findElementByXpath(xpath));
    }

    public static void clickPlusButton() {
        Commons.click(shopElements.plusButton);
    }

    public static void proceedToCheckout() {
        Commons.click(shopElements.proceedToCheckoutButton);
    }

    public static void clickItem2(int pos) {
        Commons.click(Objects.requireNonNull(Commons.findElementsByXpath(shopElements.xpathAllItems)).get(pos));
    }

    public static void clickSortButton() {
        Commons.click(shopElements.sortButton);
    }

    public static void selectPriceAscending() {
        Commons.click(shopElements.sortPriceAsc);
    }

    public static boolean assertOrderedAscPrices() {
        Commons.scrollToXpath(shopElements.xpathItemPrice + "[6]");
        List<MobileElement> prices = Commons.findElementsByXpath(shopElements.xpathItemPrice);
        assert prices != null;
        System.out.println(prices.size());
        return Commons.isOrderedAscPrice(prices);

    }

    public static void doubleTapBackpack() {
        Commons.longPress(shopElements.saucelabsBackpack);
    }


    public static void selectNameAscending() {
        Commons.click(shopElements.sortNameAsc);
    }

    public static boolean assertOrderedAscNames() {
        Commons.scrollToXpath(shopElements.xpathItemName + "[6]");
        List<MobileElement> names = Commons.findElementsByXpath(shopElements.xpathItemName);
        assert names != null;
        return Commons.assertElementsInOrder(names);

    }
}
