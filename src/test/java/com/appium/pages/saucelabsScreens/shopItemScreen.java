package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.shopItemElements;
import com.appium.scripts.commons;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import com.appium.stepsDefinitions.mobilePageObject;
public class shopItemScreen extends shopElements {
    public static shopItemElements shopItemElements = new shopItemElements();
    public static commons commons = new commons();
    public static int getCounterNumber() {

    return Integer.parseInt(mobilePageObject.getTextElement(shopItemElements.counterAmount));
    }

    public static void clickShoppingCart() {
        click(shopItemElements.shoppingCartBadge);
    }

    public static void clickAddToCart() {
        click(shopItemElements.addToCartButton);
    }

    public static void zoomItem(String item) {
        try{
        commons.zoomOnElement(shopItemElements.currentItem);}
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
