package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class shopItemElements extends mobilePageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"counter amount\"]/android.widget.TextView")
    public MobileElement counterAmount;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.TextView")
    public MobileElement shoppingCartBadge;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"product screen\"]/android.view.ViewGroup")
    public MobileElement currentItem;

    @AndroidFindBy(accessibility = "Add To Cart button")
    public MobileElement addToCartButton;
}
