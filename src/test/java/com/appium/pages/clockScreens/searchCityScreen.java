package com.appium.pages.clockScreens;

import com.appium.pages.elements.clockElements;

public class searchCityScreen extends clockElements {

    public static clockElements searchElements = new clockElements();

    public static void searchCity(String city) {
        setText(searchElements.SEARCH_CITY_SCREEN_SEARCH_TEXT_INPUT, city);
    }

    public static void addCity(){
        click(searchElements.SEARCH_CITY_FIRTS_RESULT_LIST);
    }

    public static boolean verifyCityAdded(String city){
        String textElement = findElement(searchElements.HOME_SCREEN_CLOCK_ADDED_CITYNAME).getText();
        return textElement.matches(city);
    }
}
