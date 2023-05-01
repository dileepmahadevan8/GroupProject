package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@name='text']")
    WebElement uname;
    @FindBy(xpath = "//a[@aria-label='Search and explore']")
    WebElement explore;
    @FindBy(name = "password")
    WebElement pass;
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M10.59 12L')]")
    WebElement closelogin;
    @FindBy(xpath = "//span[contains(text(),'Log in')]")
    WebElement login1;
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div")
    WebElement login;





    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void loginWebsite(String username, String password) throws InterruptedException {
        login1.click();
        Thread.sleep(6500);
        uname.sendKeys(username);
        Thread.sleep(4500);
        nextButton.click();
        Thread.sleep(4500);
        pass.sendKeys(password);
        Thread.sleep(4500);
        login.click();
        Thread.sleep(4500);
        closelogin.click();
        Thread.sleep(2000);

    }
    public void loginWebsiteagain(String username, String password) throws InterruptedException {
        login1.click();
        Thread.sleep(6500);
        uname.sendKeys(username);
        Thread.sleep(4500);
        nextButton.click();
        Thread.sleep(4500);
        pass.sendKeys(password);
        Thread.sleep(4500);
        login.click();
        Thread.sleep(8000);




    }


}