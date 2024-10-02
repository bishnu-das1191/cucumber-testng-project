package stepDefs;

import driver.manager.CreateDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class DashboardStepDef {

    WebDriver driver;
    private DashboardPage dashboardPage;
    public DashboardStepDef() {
        driver = CreateDriver.getInstance().getDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().window().maximize();
    }

    @Given("user is on product list page")
    public void user_is_on_product_list_page() {
        System.out.println("In Dashboard Step ");
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        dashboardPage = new DashboardPage(driver);
    }

    @Then("user verifies the product count is six")
    public void user_verifies_product_count() throws InterruptedException {
        Assert.assertEquals(dashboardPage.verifyTheProductSize(),6);
        Thread.sleep(3000);
        System.out.println("All Done");
    }


}
