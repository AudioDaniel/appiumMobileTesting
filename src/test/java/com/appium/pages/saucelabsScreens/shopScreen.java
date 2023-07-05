package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.ShopElements;
import com.appium.pages.elements.saucelabsElements.HomeElements;
import com.appium.scripts.Commons;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Objects;


public class shopScreen {

    public static void clickBurgerButton(){
        Commons.click(HomeElements.burgerButton);
    }


    public static void clickAboutButton() {
        Commons.click(HomeElements.aboutButton);
    }
    // TODO MOVER A UTILS

    public static void genericClickItem(String item) {
        String xpath = String.format(ShopElements.xpathItemByText, item);
        Commons.click(Commons.findElementByXpath(xpath));
    }

    public static void clickPlusButton() {
        Commons.click(ShopElements.plusButton);
    }

    public static void proceedToCheckout() {
        Commons.click(ShopElements.proceedToCheckoutButton);
    }

    public static void clickItem2(int pos) {
        Commons.click(Objects.requireNonNull(Commons.findElementsByXpath(ShopElements.xpathAllItems)).get(pos));
    }

    public static void clickSortButton() {
        Commons.click(ShopElements.sortButton);
    }

    public static void selectPriceAscending() {
        Commons.click(ShopElements.sortPriceAsc);
    }

    public static boolean assertOrderedAscPrices() {
        Commons.scrollToXpath(ShopElements.xpathItemPrice + "[6]");
        List<MobileElement> prices = Commons.findElementsByXpath(ShopElements.xpathItemPrice);
        assert prices != null;
        System.out.println(prices.size());
        return Commons.isOrderedAscPrice(prices);

    }

    public static void doubleTapBackpack() {
        Commons.longPress(ShopElements.saucelabsBackpack);
    }


    public static void selectNameAscending() {
        Commons.click(ShopElements.sortNameAsc);
    }

    public static boolean assertOrderedAscNames() {
        Commons.scrollToXpath(ShopElements.xpathItemName + "[6]");
        List<MobileElement> names = Commons.findElementsByXpath(ShopElements.xpathItemName);
        assert names != null;
        return Commons.assertElementsInOrder(names);

    }
}
