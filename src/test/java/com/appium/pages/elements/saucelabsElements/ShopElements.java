package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ShopElements extends mobilePageObject {

    // GENERICOS TODO MOVER A UTILS



    public static String xpathAllItems = "(//android.view.ViewGroup[@content-desc=\"store item\"])";

    public static String xpathItemByText = "(//android.widget.TextView[@text=\"%s\"])[1]";

    public static String xpathItemPrice = "(//android.widget.TextView[@content-desc=\"store item price\"])";

    public static String xpathItemName = "(//android.widget.TextView[@content-desc=\"store item text\"])";


    //SHOP ELEMENTS
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc='store item'])[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    public static WebElement saucelabsBackpack;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"counter plus button\"]")
    public static WebElement plusButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]")
    public static WebElement proceedToCheckoutButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"sort button\"]")
    public static WebElement sortButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"nameAsc\"]/android.widget.TextView")
    public static WebElement sortNameAsc;
    @AndroidFindBy(id = "nameDesc")
    public WebElement sortNameDesc;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"priceAsc\"]/android.widget.TextView[2]")
    public static WebElement sortPriceAsc;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"priceDesc\"]/android.widget.TextView[2]")
    public WebElement sortPriceDesc;

}
