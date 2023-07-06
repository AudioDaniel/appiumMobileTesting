package com.appium.pages.elements.saucelabsElements;

import com.appium.stepsDefinitions.mobilePageObject;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AboutElements extends mobilePageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"about screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
    public WebElement versionText;

}
