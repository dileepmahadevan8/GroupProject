package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationPage {
    @FindBy(linkText = "Home")
    WebElement Home;
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[1]/div[2]/nav/a[3]")
    WebElement notes;

    public void Notify() throws InterruptedException {
        Home.click();
        Thread.sleep(2000);
        notes.click();
        Thread.sleep(2000);

    }
}
