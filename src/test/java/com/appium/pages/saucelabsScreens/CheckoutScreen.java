package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.AboutElements;
import com.appium.pages.elements.saucelabsElements.CheckoutElements;
import com.appium.scripts.Commons;

public class CheckoutScreen extends AboutElements {
    public static AboutElements aboutElements = new AboutElements();
    public static CheckoutElements checkoutElements = new CheckoutElements();

    public static void enterCustomerData(String fullName,String firstAddressLine,
                                  String secondAddressLine,String city,String zipCode,String country){
        setText(checkoutElements.fullNameField,fullName);
        setText(checkoutElements.addresFirstLineField,firstAddressLine);
        setText(checkoutElements.addresssSecondLineField,secondAddressLine);
        setText(checkoutElements.cityField,city);
        setText(checkoutElements.zipCodeField,zipCode);
        setText(checkoutElements.countryField,country);

    }

    public static void clickToPaymentButton() {
        click(checkoutElements.toPaymentButton);
    }

    public static void enterPaymentData(String fullName, String cardNumber, String expirationDat,String securityCode) {
        setText(checkoutElements.paymentFullName, fullName);
        setText(checkoutElements.paymentCardNumber,cardNumber);
        setText(checkoutElements.paymentExpirationDate,expirationDat);
        setText(checkoutElements.paymentSecurityCode,securityCode);
    }

    public static void clickReviewOrder() {
        click(checkoutElements.reviewOrderButton);
    }

    public static void clickPlaceOrder() {
        click(checkoutElements.placeOrderButton);
    }

    public static void enterCredentialsXpath(String field, String text) {
        setText(Commons.findElementByXpath(String.format(checkoutElements.genericFieldXpath,field)),text);

    }
}
