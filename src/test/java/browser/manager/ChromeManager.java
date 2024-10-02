package browser.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeManager implements BrowserManager {
    @Override
    public WebDriver getDriver() {
        return new ChromeDriver();
    }
}
