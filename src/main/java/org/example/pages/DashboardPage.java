package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private By productList = By.xpath("//div[@class='inventory_item_name ']");

    public int verifyTheProductSize(){
        return driver.findElements(productList).size();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }
}
