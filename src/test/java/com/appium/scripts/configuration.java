package com.appium.scripts;

import java.util.Properties;

public class configuration {
    ///////////////////////////////////////////////////////////////////////////////
    // FILES
    ///////////////////////////////////////////////////////////////////////////////
    public static final String PROPERTIES_FILE_PATH = "src/test/resources/properties/keys/";
    public static final String KEY_PROPERTIES_FILE_PATH = PROPERTIES_FILE_PATH + "keys%s.properties";
    public static final String USER_INFO_PROPERTIES_FILE_PATH = PROPERTIES_FILE_PATH + "userInfo%s.properties";

    ///////////////////////////////////////////////////////////////////////////////
    // PROPERTIES OBJECT
    ///////////////////////////////////////////////////////////////////////////////
    public static final Properties KEY_PROPERTIES_FILE(String appName) {
        return commons.getProperties(
                String.format(KEY_PROPERTIES_FILE_PATH, appName));
    }
    public static final Properties USER_INFO_PROPERTIES_FILE(String appName) {
        return commons.getProperties(
                String.format(USER_INFO_PROPERTIES_FILE_PATH, appName));
    }

}
