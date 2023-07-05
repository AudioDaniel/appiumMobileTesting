package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.ShopElements;
import com.appium.pages.elements.saucelabsElements.ShopItemElements;
import com.appium.scripts.Commons;
import com.appium.stepsDefinitions.mobilePageObject;
public class shopItemScreen extends ShopElements {

    public static int getCounterNumber() {

    return Integer.parseInt(mobilePageObject.getTextElement(ShopItemElements.counterAmount));
    }

    public static void clickShoppingCart() {
        click(ShopItemElements.shoppingCartBadge);
    }

    public static void clickAddToCart() {
        click(ShopItemElements.addToCartButton);
    }

    public static void zoomItem(String item) {
        try{
        Commons.zoomOnElement(ShopItemElements.currentItem);}
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
