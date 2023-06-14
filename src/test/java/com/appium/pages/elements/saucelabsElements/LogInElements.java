package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LogInElements extends mobilePageObject {



    public String logInGenericXpath= "//android.widget.EditText[@content-desc=\"%s input field\"]";
    @AndroidFindBy(accessibility = "Username input field")
    public MobileElement usernameField;


    @AndroidFindBy(accessibility = "Password input field")
    public MobileElement passwordField;

    @AndroidFindBy(accessibility = "Login button")
    public MobileElement loginButton;
}
