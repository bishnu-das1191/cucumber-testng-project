package stepDefs;

import driver.manager.CreateDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.DashboardPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginStepDef {

    private LoginPage loginPage = new LoginPage(CreateDriver.getInstance().getDriver());
    private DashboardPage dashboardPage = new DashboardPage(CreateDriver.getInstance().getDriver());

    WebDriver driver;

    public LoginStepDef() {
        System.out.println(CreateDriver.getInstance().getDriver());
        driver = CreateDriver.getInstance().getDriver();
    }


    @Given("user visits the portal")
    public void user_visits_the_portal() {
        System.out.println("In login Step");
        dashboardPage = new DashboardPage(driver);

    }

    @When("user inputs invalid {string} and {string}")
    public void user_inputs_invalid_and(String username, String password) {
        loginPage.doLogin(username,password);
    }

    @When("user inputs valid {string} and {string}")
    public void user_inputs_valid_and(String username, String password) {
        dashboardPage = loginPage.doValidLogin(username,password);
        Assert.assertEquals(dashboardPage.getPageTitle().trim(),"Swag Labs");
    }

    @Then("User can see error message")
    public void user_can_see_error_message() {
        loginPage.errorTitle();
    }

}
