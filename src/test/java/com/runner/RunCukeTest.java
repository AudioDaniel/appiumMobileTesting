package com.runner;

import com.appium.pages.baseAppium;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features"
        },
        //tags = "@clockApp",
        glue = {
                "com/appium/stepsDefinitions",
                "com/appium/stepsDefinitions/confluedentStepsDefs",
                "com/appium/stepsDefinitions/clockStepsDefs",
                "com/hooks"
        },
        plugin = {"json:test-reports/cucumber-report/cucumber.json", "rerun:test-reports/rerun/rerun.txt"},
        monochrome = true,
        stepNotifications = true
)

public class RunCukeTest {

}
