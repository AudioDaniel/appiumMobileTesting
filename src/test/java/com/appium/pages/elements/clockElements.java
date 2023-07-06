package com.appium.pages.elements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class clockElements extends mobilePageObject {
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // HOME SCREEN
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    @AndroidFindBy(id = "com.google.android.deskclock:id/fab")
    public WebElement HOME_SCREEN_WORLD_BUTTON;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    public WebElement HOME_SCREEN_CLOCK_ADDED_CITYNAME;

    @AndroidFindBy(accessibility = "Alarm")
    public WebElement HOME_SCREEN_ALARM_BUTTON;

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // SEARCH CITY SCREEN
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    @AndroidFindBy(id = "com.google.android.deskclock:id/search_src_text")
    public WebElement SEARCH_CITY_SCREEN_SEARCH_TEXT_INPUT;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")
    public WebElement SEARCH_CITY_FIRTS_RESULT_LIST;

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // ALARM SCREEN
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    @AndroidFindBy(accessibility = "Add alarm")
    public WebElement ALARM_SCREEN_ADD_ALARM_BUTTON;

    @AndroidFindBy(id = "com.google.android.deskclock:id/onoff")
    public WebElement ALARM_SCREEN_ACTIVATE_ALARM_SWITCH;

    @AndroidFindBy(id = "com.google.android.deskclock:id/delete")
    public WebElement ALARM_SCREEN_DELETE_ALARM_BUTTON;

    @AndroidFindBy(accessibility = "12:30 AM")
    public WebElement ALARM_SCREEN_ALARM_ADDED_BUTTON;

    // set alarm
    @AndroidFindBy(id = "android:id/am_label")
    public WebElement ALARM_SCREEN_SET_AM_ALARM_BUTTON;

    @AndroidFindBy(accessibility = "12")
    public WebElement ALARM_SCREEN_SET_HOUR_ALARM_12H_BUTTON;

    @AndroidFindBy(accessibility = "30")
    public WebElement ALARM_SCREEN_SET_MINUTE_ALARM_1M_BUTTON;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement ALARM_SCREEN_OK_BUTTON;


}
