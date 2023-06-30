package com.appium.stepsDefinitions;

import com.appium.pages.baseAppium;
import com.appium.scripts.Configuration;
import io.cucumber.java.en.Given;

import java.net.MalformedURLException;
import java.util.Properties;

public class commonsSteps extends baseAppium {
    // PROPERTIES
    public static Properties keyProperties = null;

    @Given("^the user enter to application '(.*)'$")
    public void openAplication(String propertiesFile) throws MalformedURLException {
        try {

            keyProperties = Configuration.KEY_PROPERTIES_FILE(propertiesFile);
            if (getDriver() == null){
                if(baseAppium.getDriver() == null){
                    init(propertiesFile);
                }
            }
        } catch (Exception e) {
            System.out.println("Error connecting to Appium Service. Error: " + e.getMessage());
        }
    }
}
