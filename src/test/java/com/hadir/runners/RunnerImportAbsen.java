package com.hadir.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
    "src/test/resources/features/importabsens/PositifImportAbsen.feature",
    "src/test/resources/features/importabsens/NegatifImportAbsen.feature",
    "src/test/resources/features/importabsens/DownloadImportAbsen.feature",
}, glue = {
    "com.hadir",
    "com.hadir.definitions.importabsens"
}, plugin = {
    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    "json:target/cucumber-reporting/reports.json",
    "json:target/cucumber.json",
    "pretty",
    "html:target/cucumber-reporting/reports.html"
})

public class RunnerImportAbsen extends AbstractTestNGCucumberTests {
    
}
