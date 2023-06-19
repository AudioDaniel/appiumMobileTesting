package com.appium.stepsDefinitions.saucelabsStepsDefs;

import io.cucumber.java.en.And;
import com.appium.pages.saucelabsScreens.homeScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @Then("pinch the screen")
    public void pinchTheScreen() {
        homeScreen.pinchscreen();
    }

    @When("the user scrolls to linkedin icon")
    public void theUserScrollsToLinkedinIcon() {
        homeScreen.scrollToLinkedin();
    }

    @Then("I click linkedin icon")
    public void iClickLinkedinIcon() {
        homeScreen.clickLinkedin();
    }

    @Then("the user scroll to Iphone{int}")
    public void theUserScrollToIphone(int arg0) {
        homeScreen.scrollToIphone7();
    }
}
