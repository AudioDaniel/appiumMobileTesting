@Saucelabs
Feature: Saucelabs testing

  Background:
    Given the user enter to application 'Saucelabs'


  @Xpath
  Scenario: XPATH TEST
    When I click x item

  @Version
  Scenario Outline: Checking current version displayed
    When the user clicks burger button
    And the user clicks about button
    Then the version displayed should match <currentVersion>

    Examples:
      | currentVersion          |
      | "V.1.3.0-build 244 by " |


#  @Swipetest
#  Scenario: : Swiping page
#    When the user clicks burger button
#    When the user clicks on the section Drawing
#    Then the user swipes the screen
#    Then pinch the screen
#
#  @NavigateToSection
#  Scenario Outline: Navigating through sections
#    When the user clicks burger button
#    And the user clicks on the section <section>
#    #Then he should be redirected to the <section> page
#
#    Examples:
#      | section |
#      | Catalog |
#      | Webview |
#      #| QR Code Scanner |
#      #| Geo Location    |
#      #| Drawing         |
#      | About   |
#      #| Reset App State |
#      #| FingerPrint     |
#      #| Log In          |
#      #| Log Out         |
#      #| Api Calls       |
#      #| Sauce Bot Video |
#
#  @Shopping
#  Scenario Outline: Adding items to the cart
#    When the user clicks on the product <item>
#    And the user adds the item to the cart <times> times
#    Then the item counter should match <times>
#
#    Examples:
#      | item                | times |
#      | Sauce Labs Backpack | 4     |
#
#  @Scroll
#  Scenario: Scrolling to linkedin
#    #When the user scrolls to linkedin icon
#    #Then I click linkedin icon
#    When the user clicks burger button
#    And the user clicks on the section Api Calls
#    Then the user scroll to Iphone7
#
#
#  @SuccessfulShopping
#  Scenario Outline: Checkout to the shop
#    When the user clicks on the product <item>
#    And the user adds the item to the cart <times> times
#    Then the item counter should match <times>
#    And I click add items to cart
#    And I click on the shopping cart
#    And I click on the checkout button
#    And I enter my credentials
#      | field    | user1           |
#      | Username | bob@example.com |
#      | Password | 10203040        |
#    And I enter customer data
#      | field           | user1          |
#      | Full Name*      | Rebecca Winter |
#      | Address Line 1* | Mandorley 112  |
#      | Address Line 2  | Entrance 1     |
#      | City*           | Truro          |
#      | Zip Code*       | 89750          |
#      | Country*        | United Kingdom |
#    And I click on To Payment button
#    And I enter my payment data
#      | field            | user1           |
#      | Full Name*       | Rebecca Winter  |
#      | Card Number*     | 325812657568789 |
#      | Expiration Date* | 03/25           |
#      | Security Code*   | 123             |
#    And I click Review Order button
#    And I click on Place Order Button
#
#    Examples:
#      | item                | times |
#      | Sauce Labs Backpack | 4     |
#
#
#  @Order
#  Scenario: Sorting items by ascending price
#    When the user clicks sorting button
#    And he selects price ascending
#    Then the prices should be ordered in ascending price
#
#  @Order
#  Scenario: Sorting by ascending name
#    When the user clicks sorting button
#    And he selects name ascending
#    Then the names should be ordered in ascending name
#
#
#  @Testing
#  Scenario Outline: Adding items to the cart
#    When the user clicks on the product <item>
#
#    Examples:
#      | item                | times |
#      | Sauce Labs Backpack | 4     |


