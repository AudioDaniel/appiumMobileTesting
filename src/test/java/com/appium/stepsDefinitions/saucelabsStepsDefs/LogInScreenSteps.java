package com.appium.stepsDefinitions.saucelabsStepsDefs;

import com.appium.pages.saucelabsScreens.LogInScreen;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;

import java.util.List;
import java.util.Map;

public class LogInScreenSteps {
    @And("^I enter my credentials$")
    public void enterCredentials(DataTable dt){
        List<Map<String, String>> rows = dt.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            String field = columns.get("field");
            String text = columns.get("user1");
            LogInScreen.enterCredentialsXpath(field,text);
        }
        LogInScreen.clickLogin();
    }
}
