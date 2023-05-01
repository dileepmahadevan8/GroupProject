package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
    @FindBy(linkText = "Home")
    WebElement Home;
    @FindBy(linkText = "Profile")
    WebElement Profile;
    @FindBy(linkText = "Likes")
    WebElement Likes;

    public void ProfileMethod() throws InterruptedException{
        Home.click();
        Thread.sleep(4000);
        Home.click();
        Thread.sleep(4000);
        Profile.click();
        Thread.sleep(2000);
        Likes.click();
        Thread.sleep(2000);
    }

}
