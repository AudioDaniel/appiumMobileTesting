package com.appium.stepsDefinitions.saucelabsStepsDefs;

import io.cucumber.java.en.Then;
import com.appium.pages.saucelabsScreens.aboutScreen;
public class aboutScreenSteps {

    @Then("the version displayed should match {string}")
    public static void theVersionDisplayedShouldMatch(String currentVersion){
        aboutScreen.verifyCurrentVersion(currentVersion);

    }
}
