package com.appium.pages.clockScreens;

import com.appium.pages.elements.clockElements;

public class alarmScreen extends clockElements {
    public static clockElements alarmElements = new clockElements();

    public static void clickToAddAlarm() {
        click(alarmElements.ALARM_SCREEN_ADD_ALARM_BUTTON);
    }

    public static void setTime() {
        click(alarmElements.ALARM_SCREEN_SET_AM_ALARM_BUTTON);
        click(alarmElements.ALARM_SCREEN_SET_HOUR_ALARM_12H_BUTTON);
        click(alarmElements.ALARM_SCREEN_SET_MINUTE_ALARM_1M_BUTTON);
        click(alarmElements.ALARM_SCREEN_OK_BUTTON);
    }

    public static boolean verifyAlarmIsAdded() {
        return isPresent(alarmElements.ALARM_SCREEN_ALARM_ADDED_BUTTON);
    }

    public static boolean verifyAlarmIsActivated() {
        return findElement(alarmElements.ALARM_SCREEN_ACTIVATE_ALARM_SWITCH).getText().matches("ON");
    }
}
