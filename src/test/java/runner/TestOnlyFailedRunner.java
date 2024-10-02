package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed.txt",
        glue = {"stepDefs","hooks"},// tags = "@smoke"
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        monochrome = true)
public class TestOnlyFailedRunner extends AbstractTestNGCucumberTests {
}
