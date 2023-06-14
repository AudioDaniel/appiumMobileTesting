package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckoutElements extends mobilePageObject {


    public String genericFieldXpath = "//android.widget.EditText[@content-desc=\"%s input field\"]";
    public String getGenericFieldXpath = "//android.widget.EditText[@content-desc=\"Full Name* input field\"]";
    @AndroidFindBy(accessibility = "Full Name* input field")
    public MobileElement fullNameField;

    @AndroidFindBy(accessibility = "Address Line 1* input field")
    public MobileElement addresFirstLineField;

    @AndroidFindBy(accessibility = "Address Line 2 input field")
    public MobileElement addresssSecondLineField;
    @AndroidFindBy(accessibility = "City* input field")
    public MobileElement cityField;

    @AndroidFindBy(accessibility = "Zip Code* input field")
    public MobileElement zipCodeField;

    @AndroidFindBy(accessibility = "Country* input field")
    public MobileElement countryField;

    @AndroidFindBy(accessibility = "To Payment button")
    public MobileElement toPaymentButton;

    @AndroidFindBy(accessibility = "Full Name* input field")
    public MobileElement paymentFullName;

    @AndroidFindBy(accessibility = "Card Number* input field")
    public MobileElement paymentCardNumber;

    @AndroidFindBy(accessibility = "Expiration Date* input field")
    public MobileElement paymentExpirationDate;

    @AndroidFindBy(accessibility = "Security Code* input field")
    public MobileElement paymentSecurityCode;


    @AndroidFindBy(accessibility = "Review Order button")
    public MobileElement reviewOrderButton;

    @AndroidFindBy(accessibility = "Place Order button")
    public MobileElement placeOrderButton;
}
