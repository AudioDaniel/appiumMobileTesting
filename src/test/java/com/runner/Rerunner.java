package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "@test-reports/rerun/rerun.txt"
        },
        //tags = "@clockApp",
        glue = {
                "com/appium/stepsDefinitions",
                "com/appium/stepsDefinitions/confluedentStepsDefs",
                "com/appium/stepsDefinitions/clockStepsDefs",
                "com/hooks"
        },
        plugin = {
                "json:test-reports/cucumber-report/cucumber-rerun.json",
                "html:test-reports/cucumber-report/cucumber-rerun.html"
                },
        monochrome = true,
        stepNotifications = true
)

public class Rerunner {

}
