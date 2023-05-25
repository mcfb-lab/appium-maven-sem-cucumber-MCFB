package org.example.qazandodozero2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLogin {

    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "mirelacarlaferre_9w0fze");
        caps.setCapability("browserstack.key", "mdWTYVZZsoknDFu4KiQx");

        // Set URL of the application under test
        caps.setCapability("app", "bs://7c2c5cf8cbc8e588bf45960b96967751b89dc3a4");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
        ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testeLogin() {
        ScreenLogin.logar();
    }
}