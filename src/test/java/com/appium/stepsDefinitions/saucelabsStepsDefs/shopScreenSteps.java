package com.appium.stepsDefinitions.saucelabsStepsDefs;

import com.appium.pages.saucelabsScreens.LogInScreen;
import com.appium.pages.saucelabsScreens.shopItemScreen;
import com.appium.stepsDefinitions.mobilePageObject;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.appium.pages.saucelabsScreens.shopScreen;
import com.appium.pages.saucelabsScreens.CheckoutScreen;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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

            while (times > 1 && i < times){
                shopScreen.clickPlusButton();
                i++;
            }
    }

    @Then("^the item counter should match (.*)$")
    public void theItemCounterShouldMatchTimes(int times) {
        int cartContent = shopItemScreen.getCounterNumber();
        Assert.assertTrue("The number doesn't match the specified value " + times + "\nactual value: "
                        + cartContent,
                (times == cartContent));
    }

    @And("I click on the shopping cart")
    public void iClickOnTheShoppingCart() {
        shopItemScreen.clickShoppingCart();
    }

    @And("I click on the checkout button")
    public void iClickOnTheCheckoutButton() {
        shopScreen.proceedToCheckout();
    }

    @And("I click add items to cart")
    public void iClickAddItemsToCart() {
        shopItemScreen.clickAddToCart();
    }

    @And("^I enter customer data$")
//    public void iEnterCustomerData(String fullName,String firstAddressLine,
//                                   String secondAddressLine,String city,String zipCode,String country) {
// CheckoutScreen.enterCustomerData(fullName,firstAddressLine,secondAddressLine,city,zipCode,country);
    public void iEnterCustomerData(DataTable dt){

        List<Map<String, String>> rows = dt.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            String field = columns.get("field");
            String text = columns.get("user1");
            CheckoutScreen.enterCredentialsXpath(field,text);
        }

    }

    @And("I click on To Payment button")
    public void iClickOnToPaymentButton() {
        CheckoutScreen.clickToPaymentButton();
    }

    @And("^I enter my payment data$")
    public void iEnterPaymentData(DataTable dt) throws InterruptedException {

        Thread.sleep(1000);

            List<Map<String, String>> rows = dt.asMaps(String.class, String.class);
            for (Map<String, String> columns : rows) {
                String field = columns.get("field");
                String text = columns.get("user1");
                CheckoutScreen.enterCredentialsXpath(field, text);
            }
        }

    @And("I click Review Order button")
    public void iClickReviewOrderButton() {
        CheckoutScreen.clickReviewOrder();
    }

    @And("I click on Place Order Button")
    public void iClickOnPlaceOrderButton() {
        CheckoutScreen.clickPlaceOrder();
    }

    @When("I click x item")
    public void iClickAllItems() {
        shopScreen.clickItem2(0);
    }

    @Then("^zoom on the product (.*)$")
    public void zoomOnTheProduct(String item) {
        shopItemScreen.zoomItem(item);

    }

    @When("the user clicks sorting button")
    public void theUserClicksSortingButton() {
        shopScreen.clickSortButton();

    }

    @And("he selects price ascending")
    public void heSelectsPriceAscending() {
        shopScreen.selectPriceAscending();
    }

    @Then("the prices should be ordered in ascending price")
    public void thePricesShouldBeOrderedInAscendingPrice() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Prices not ordered",shopScreen.assertOrderedAscPrices());
    }
}
