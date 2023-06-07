package com.appium.stepsDefinitions.clockStepsDefs;

import com.appium.pages.clockScreens.alarmScreen;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class alarmScreenSteps {
    @When("^user clicks on the new alarm button$")
    public static void clickToAlarmButton() {
        alarmScreen.clickToAddAlarm();
    }

    @When("^the user sets a time$")
    public static void setTime() {
        alarmScreen.setTime();
    }

    @When("^the user verifies that the alarm has been added$")
    public static void verifyAlarmIsAdded() {
        Assert.assertTrue("The alarm is not added", alarmScreen.verifyAlarmIsAdded());
    }

    @When("^the user verifies that the alarm is active$")
    public static void verifyAlarmIsActivated() {
        Assert.assertTrue("The alarm is not activate.", alarmScreen.verifyAlarmIsActivated());
    }
}
