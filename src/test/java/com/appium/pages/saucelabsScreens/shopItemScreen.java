package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.shopItemElements;
import org.junit.Assert;
import com.appium.stepsDefinitions.mobilePageObject;
public class shopItemScreen extends shopElements {
    public static shopItemElements shopItemElements = new shopItemElements();

    public static int getCounterNumber() {

    return Integer.parseInt(mobilePageObject.getTextElement(shopItemElements.counterAmount));
    }

    public static void clickShoppingCart() {
        click(shopItemElements.shoppingCartBadge);
    }

    public static void clickAddToCart() {
        click(shopItemElements.addToCartButton);
    }
}
