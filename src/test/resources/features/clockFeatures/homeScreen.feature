@homeScreen
Feature: Test clock app.

  Background: the user opens the application.
    Given the user enter to application 'Clock'

  @searchCity @clockApp
  Scenario Outline: add new clock
    When the user click to world clock button
    And the user search the city '<city>'
    And the user add city
    Then a city is added '<city>'
    Examples:
      | city   |
      | Madrid |

  @AddAlarm @clockApp
  Scenario: add new alarm
    When the user clicks to alarm button
    And user clicks on the new alarm button
    And the user sets a time
    Then the user verifies that the alarm has been added
    And the user verifies that the alarm is active


