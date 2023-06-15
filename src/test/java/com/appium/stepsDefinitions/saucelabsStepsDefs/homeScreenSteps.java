package com.appium.stepsDefinitions.saucelabsStepsDefs;

import io.cucumber.java.en.And;
import com.appium.pages.saucelabsScreens.homeScreen;
import io.cucumber.java.en.Then;

public class homeScreenSteps {

    @And("^the user clicks on the section (.*)$")
    public void theUserClicksTheSectionSection(String section) {
        homeScreen.clickOnSection(section);
    }

    @Then("the user swipes the screen")
    public void theUserSwipesTheScreen() throws InterruptedException {
        // TODO QUITAR SLEEP
        Thread.sleep(3000);
        homeScreen.swipeScreen();
    }
}
