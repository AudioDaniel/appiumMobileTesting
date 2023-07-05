package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShopItemElements extends mobilePageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"counter amount\"]/android.widget.TextView")
    public static MobileElement counterAmount;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.TextView")
    public static MobileElement shoppingCartBadge;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"product screen\"]/android.view.ViewGroup")
    public static MobileElement currentItem;

    @AndroidFindBy(accessibility = "Add To Cart button")
    public static MobileElement addToCartButton;
}
