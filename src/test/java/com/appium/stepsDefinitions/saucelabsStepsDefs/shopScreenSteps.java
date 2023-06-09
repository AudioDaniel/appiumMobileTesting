package com.appium.stepsDefinitions.saucelabsStepsDefs;

import com.appium.pages.saucelabsScreens.shopItemScreen;
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

    @When("^the user clicks on the product (.*)$")
    public void theUserClicksOnTheProductItem(String item) {
        shopScreen.genericClickItem(item);
    }

    @And("^the user adds the item to the cart (.*) times$")
    public void theUserAddsTheItemToTheCartTimesTimes(int times) {
            int i = 1;
            //for (int i = 1; i <= times; i++){
            while (times > 1 && i < times){
                shopScreen.clickPlusButton();
                i++;
            }
    }

    @Then("^the item counter should match (.*)$")
    public void theItemCounterShouldMatchTimes(int times) {
        shopItemScreen.verifyCounterNumber(times);
    }
}
