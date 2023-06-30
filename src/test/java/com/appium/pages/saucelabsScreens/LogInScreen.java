package com.appium.pages.saucelabsScreens;

import com.appium.pages.elements.saucelabsElements.LogInElements;
import com.appium.scripts.Commons;

public class LogInScreen extends LogInElements {

    public static LogInElements logInElements = new LogInElements();

    public static void enterCredentialsXpath(String field,String text){
        setText(Commons.findElementByXpath(String.format(logInElements.logInGenericXpath,field)),text);
    }
    public static void enterCredentials(String user, String pass) {
        setText(logInElements.usernameField,user);
        setText(logInElements.passwordField,pass);
    }

    public static void clickLogin(){
        click(logInElements.loginButton);
    }
}
