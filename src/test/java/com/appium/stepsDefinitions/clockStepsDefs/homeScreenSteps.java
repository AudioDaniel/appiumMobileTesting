package com.appium.stepsDefinitions.clockStepsDefs;


import com.appium.pages.clockScreens.homeScreen;
import io.cucumber.java.en.When;

public class homeScreenSteps {
    @When("^the user click to world clock button$")
    public static void clickToWorldButton() {
        homeScreen.clickToWorldButton();
    }

    @When("^the user clicks to alarm button$")
    public static void clickToAlarmButton() {
        homeScreen.clickToAlarmButton();
    }
}
