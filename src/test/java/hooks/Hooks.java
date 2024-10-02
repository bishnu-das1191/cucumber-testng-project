package hooks;

import driver.manager.CreateDriver;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {

    private WebDriver driver;

    @Before()
    public void setup(Scenario scenario){
        System.out.println("In before setup");
        //driver = new ChromeDriver();
        //WebDriverManager.setDriver(driver);
        String browser = "chrome";
        CreateDriver.getInstance().setDriver(browser);
        driver = CreateDriver.getInstance().getDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @After()
    public void tearDown(Scenario scenario){
        System.out.println("In teardown");
        if (driver != null){
            driver.quit();
        }
    }

    @BeforeStep()
    public void actionBeforeEachStep(){}

    @AfterStep()
    public void actionAfterEachStep(){}

}
