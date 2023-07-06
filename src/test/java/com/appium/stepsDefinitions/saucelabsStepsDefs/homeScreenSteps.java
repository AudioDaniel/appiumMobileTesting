package com.appium.stepsDefinitions.saucelabsStepsDefs;

import com.appium.pages.saucelabsScreens.HomeScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homeScreenSteps {

    @When("the user clicks burger button")
    public void clickBurger() throws InterruptedException {
        HomeScreen.clickBurgerButton();
    }

    @And("^the user clicks on the section (.*)$")
    public void theUserClicksTheSectionSection(String section) {
        HomeScreen.clickOnSection(section);
    }

    @Then("the user swipes the screen")
    public void theUserSwipesTheScreen() throws InterruptedException {
        HomeScreen.swipeScreen();
    }

    @Then("pinch the screen")
    public void pinchTheScreen() {
        HomeScreen.pinchscreen();
    }

    @When("the user scrolls to linkedin icon")
    public void theUserScrollsToLinkedinIcon() {
        HomeScreen.scrollToLinkedin();
    }

    @Then("I click linkedin icon")
    public void iClickLinkedinIcon() {
        HomeScreen.clickLinkedin();
    }

    @Then("the user scroll to Iphone{int}")
    public void theUserScrollToIphone(int arg0) {
        HomeScreen.scrollToIphone7();
    }
}
