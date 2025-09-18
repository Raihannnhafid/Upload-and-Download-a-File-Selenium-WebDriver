package com.hadir;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.hadir.pages.LoginPage;
import com.hadir.utils.DriverUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
    private WebDriver driver;
    private LoginPage loginPage;
    @Before
    public void setup() {
        driver = DriverUtil.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magang.dikahadir.com/authentication/login");

        loginPage = new LoginPage(driver);
        loginPage.performLogin();
    }

    @After
    public void teardown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        DriverUtil.quitDriver();
    }
}
