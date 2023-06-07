package com.appium.stepsDefinitions.saucelabsStepsDefs;

import io.cucumber.java.en.And;
import com.appium.pages.saucelabsScreens.homeScreen;

public class homeScreenSteps {

    @And("^the user clicks on the section (.*)$")
    public void theUserClicksTheSectionSection(String section) {
        homeScreen.clickOnSection(section);
    }
}
