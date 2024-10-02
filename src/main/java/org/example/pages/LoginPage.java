package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;


    private By username = By.name("user-name");
    private By password = By.name("password");
    private By btnLogin = By.name("login-button");
    private By lvlTitle = By.className("title");
    private By lvlError = By.tagName("h3");


    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doLogin(String usernameText, String passwordText){
        driver.findElement(username).sendKeys(usernameText);;
        driver.findElement(password).sendKeys(passwordText);
        driver.findElement(btnLogin).click();
    }

    public DashboardPage doValidLogin(String usernameText, String passwordText){
        driver.findElement(username).sendKeys(usernameText);;
        driver.findElement(password).sendKeys(passwordText);
        driver.findElement(btnLogin).click();
        return new DashboardPage(driver);
    }
    public void errorTitle(){
        WebElement levErrorText = driver.findElement(lvlError);
        Assert.assertEquals(levErrorText.getText(),"Epic sadface: Username and password do not match any user in this service");
    }
    public void assertTitle(){
        WebElement levTitleText = driver.findElement(lvlTitle);
        Assert.assertEquals(levTitleText.getText(),"Products");
    }


}
