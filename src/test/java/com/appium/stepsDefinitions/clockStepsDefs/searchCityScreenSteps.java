package com.appium.stepsDefinitions.clockStepsDefs;

import com.appium.pages.clockScreens.searchCityScreen;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class searchCityScreenSteps {
    @When("^the user search the city '(.*)'$")
    public static void searchCity(String city) {
        searchCityScreen.searchCity(city);
    }

    @When("^the user add city$")
    public static void addCity() {
        searchCityScreen.addCity();
    }

    @When("a city is added '(.*)'$")
    public static void verifyCityAdded(String city) {
        Assert.assertTrue("The city is not added",searchCityScreen.verifyCityAdded(city));
    }
}
