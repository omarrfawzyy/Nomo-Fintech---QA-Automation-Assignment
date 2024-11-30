package DriverManager;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {

    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;

    public static void setup() throws MalformedURLException
    {
        service = new AppiumServiceBuilder().withAppiumJS(new File("/Users/omarfawzy/node_modules/appium/build/lib/main.js"))
                .withIPAddress("192.168.100.42").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 7 Pro API 35");
        //options.setApp("src/main/resources/Android-MyDemoAppRN.1.3.0.build-244.apk");
        options.setApp("/Users/omarfawzy//Downloads/Android-MyDemoAppRN.1.3.0.build-244.apk");
        options.setAutomationName("UiAutomator2");

        driver = new AndroidDriver(new URL("http://localhost:4723"), options);

    }

    public static void tearDown()
    {
        driver.quit();
        service.stop();
    }
}
