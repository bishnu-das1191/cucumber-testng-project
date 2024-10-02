package driver.manager;

import org.openqa.selenium.WebDriver;

public class CreateDriver {

    private static CreateDriver INSTANCE;

//    public WebDriver driver;
    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    //private constructor bcz of Singleton Design Pattern
    private CreateDriver(){}

    public static synchronized CreateDriver getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CreateDriver();
        }
        return INSTANCE;
    }

    public void setDriver(String browser){
        System.out.println(browser);

        driver.set(DriverManager.getBrowserManager(browser).getDriver());
        System.out.println("Hi");
    }

    public WebDriver getDriver(){
        //return driver;
        return driver.get();
    }
}
