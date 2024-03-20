package org.example.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "path/to/your/app.apk");

        // Appium server URL
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        // Initialize AppiumDriver
        driver = new AndroidDriver(url, capabilities);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
