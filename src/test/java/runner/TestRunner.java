package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@CucumberOptions(features = "src/test/resources/features",
                glue = {"stepDefs","hooks"},
                plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                monochrome = true) //tags = "@smoke"
public class TestRunner extends AbstractTestNGCucumberTests {

    // for parallel execution parallel=true
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios(){
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

}
