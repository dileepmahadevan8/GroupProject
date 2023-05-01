package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-172uzmj r-1pi2tsx r-1ny4l3l r-13qz1uu']")
    WebElement validuser;
    @FindBy(xpath = "//span[normalize-space()='Log out @RishiKesh977439']")
    WebElement logout;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div/span")
    WebElement flogout;

    public void FinalPage() throws InterruptedException{
        validuser.click();
        Thread.sleep(2000);
        logout.click();
        Thread.sleep(2000);
        flogout.click();
        Thread.sleep(4500);
    }

}
