package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FollowPage {

    @FindBy(xpath = "//div[@data-testid='UserAvatar-Container-msdhoni']//div[@class='css-1dbjc4n r-172uzmj r-1pi2tsx r-1ny4l3l r-13qz1uu']")
    WebElement person;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/div/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/span/span")
    WebElement follow;


    public void FollowMethod() throws InterruptedException{
//        person.click();
//        Thread.sleep(2000);
        follow.click();
        Thread.sleep(2000);


    }
}
