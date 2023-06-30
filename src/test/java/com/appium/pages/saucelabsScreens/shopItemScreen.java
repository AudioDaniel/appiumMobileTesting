package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.shopElements;
import com.appium.pages.elements.saucelabsElements.shopItemElements;
import com.appium.scripts.Commons;
import com.appium.stepsDefinitions.mobilePageObject;
public class shopItemScreen extends shopElements {

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
        Commons.zoomOnElement(shopItemElements.currentItem);}
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
