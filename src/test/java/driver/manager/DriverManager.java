package driver.manager;

import browser.manager.BrowserManager;
import browser.manager.ChromeManager;
import browser.manager.FirefoxManager;

public class DriverManager {

    public static BrowserManager getBrowserManager(String browser){

        switch (browser.toLowerCase()){
            case "chrome" :
                return new ChromeManager();
            case "firefox" :
                return  new FirefoxManager();
            default:
                throw new IllegalArgumentException("No Matching Browser Found Issue");
        }
    }
}
