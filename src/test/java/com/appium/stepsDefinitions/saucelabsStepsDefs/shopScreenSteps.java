package com.appium.stepsDefinitions.saucelabsStepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.appium.pages.saucelabsScreens.shopScreen;

public class shopScreenSteps {

    @When("the user clicks burger button")
    public static void clickBurger(){
        // TODO Cambiar por a homeScreen
        shopScreen.clickBurgerButton();
    }

    @And("the user clicks about button")
    public void theUserClicksAboutButton() {
        shopScreen.clickAboutButton();
    }
}
