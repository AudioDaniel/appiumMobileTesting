package com.appium.pages.clockScreens;

import com.appium.pages.elements.clockElements;

public class homeScreen extends clockElements {

    public static clockElements homeElements = new clockElements();

    public static void clickToWorldButton(){
        click(homeElements.HOME_SCREEN_WORLD_BUTTON);
    }

    public static void clickToAlarmButton(){

        click(homeElements.HOME_SCREEN_ALARM_BUTTON);
    }
}
