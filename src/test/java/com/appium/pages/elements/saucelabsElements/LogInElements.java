package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LogInElements extends mobilePageObject {



    public String logInGenericXpath= "//android.widget.EditText[@content-desc=\"%s input field\"]";
    @AndroidFindBy(accessibility = "Username input field")
    public WebElement usernameField;


    @AndroidFindBy(accessibility = "Password input field")
    public WebElement passwordField;

    @AndroidFindBy(accessibility = "Login button")
    public WebElement loginButton;
}
