package com.appium.stepsDefinitions;

import com.appium.pages.baseAppium;
import com.appium.scripts.commons;
import com.appium.scripts.configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.util.Properties;

public class commonsSteps extends baseAppium {
    // PROPERTIES
    public static Properties keyProperties = null;

    @Given("^the user enter to application '(.*)'$")
    public void openAplication(String propertiesFile) throws MalformedURLException {
        try {

            keyProperties = configuration.KEY_PROPERTIES_FILE(propertiesFile);
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
