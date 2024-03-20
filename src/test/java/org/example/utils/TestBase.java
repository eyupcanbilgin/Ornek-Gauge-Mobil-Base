package org.example.utils;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;

public class TestBase {

    protected static AppiumDriver driver;

    @BeforeScenario
    public void setUp() throws MalformedURLException {
        // WebDriverFactory sınıfından AppiumDriver'ı başlat
        WebDriverFactory.setUp();
        driver = WebDriverFactory.getDriver();
    }

    @AfterScenario
    public void tearDown() {
        // WebDriverFactory sınıfından AppiumDriver'ı sonlandır
        WebDriverFactory.tearDown();
    }
}
