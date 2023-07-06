package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckoutElements extends mobilePageObject {


    public String genericFieldXpath = "//android.widget.EditText[@content-desc=\"%s input field\"]";
    public String getGenericFieldXpath = "//android.widget.EditText[@content-desc=\"Full Name* input field\"]";
    @AndroidFindBy(accessibility = "Full Name* input field")
    public WebElement fullNameField;

    @AndroidFindBy(accessibility = "Address Line 1* input field")
    public WebElement addresFirstLineField;

    @AndroidFindBy(accessibility = "Address Line 2 input field")
    public WebElement addresssSecondLineField;
    @AndroidFindBy(accessibility = "City* input field")
    public WebElement cityField;

    @AndroidFindBy(accessibility = "Zip Code* input field")
    public WebElement zipCodeField;

    @AndroidFindBy(accessibility = "Country* input field")
    public WebElement countryField;

    @AndroidFindBy(accessibility = "To Payment button")
    public WebElement toPaymentButton;

    @AndroidFindBy(accessibility = "Full Name* input field")
    public WebElement paymentFullName;

    @AndroidFindBy(accessibility = "Card Number* input field")
    public WebElement paymentCardNumber;

    @AndroidFindBy(accessibility = "Expiration Date* input field")
    public WebElement paymentExpirationDate;

    @AndroidFindBy(accessibility = "Security Code* input field")
    public WebElement paymentSecurityCode;


    @AndroidFindBy(accessibility = "Review Order button")
    public WebElement reviewOrderButton;

    @AndroidFindBy(accessibility = "Place Order button")
    public WebElement placeOrderButton;
}
