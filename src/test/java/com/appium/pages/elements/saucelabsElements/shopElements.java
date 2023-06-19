package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class shopElements extends mobilePageObject {

    // GENERICOS TODO MOVER A UTILS



    public String xpathAllItems = "(//android.view.ViewGroup[@content-desc=\"store item\"])";

    public String xpathItemByText = "(//android.widget.TextView[@text=\"%s\"])[1]";

    public String xpathItemPrice = "(//android.widget.TextView[@content-desc=\"store item price\"])";


    //SHOP ELEMENTS
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc='store item'])[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    public MobileElement saucelabsBackpack;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"counter plus button\"]")
    public MobileElement plusButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]")
    public MobileElement proceedToCheckoutButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"sort button\"]")
    public MobileElement sortButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"nameAsc\"]/android.widget.TextView")
    public MobileElement sortNameAsc;
    @AndroidFindBy(id = "nameDesc")
    public MobileElement sortNameDesc;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"priceAsc\"]/android.widget.TextView[2]")
    public MobileElement sortPriceAsc;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"priceDesc\"]/android.widget.TextView[2]")
    public MobileElement sortPriceDesc;

}
