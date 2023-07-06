package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShopItemElements extends mobilePageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"counter amount\"]/android.widget.TextView")
    public static WebElement counterAmount;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.TextView")
    public static WebElement shoppingCartBadge;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"product screen\"]/android.view.ViewGroup")
    public static WebElement currentItem;

    @AndroidFindBy(accessibility = "Add To Cart button")
    public static WebElement addToCartButton;
}
