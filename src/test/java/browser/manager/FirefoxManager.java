package browser.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxManager implements BrowserManager {

    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
