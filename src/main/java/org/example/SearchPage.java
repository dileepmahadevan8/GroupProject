package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(xpath = "//a[@aria-label='Search and explore']")
    WebElement explore;
    @FindBy(xpath = "//input[@placeholder='Search Twitter']")
    WebElement entertext;

    @FindBy(xpath = "//div[@data-testid='UserAvatar-Container-msdhoni']//div[@class='css-1dbjc4n r-172uzmj r-1pi2tsx r-1ny4l3l r-13qz1uu']")
    WebElement person;


    public void ExplorePage() throws InterruptedException{
        explore.click();
        Thread.sleep(2000);
        entertext.sendKeys("dhoni");
        Thread.sleep(2000);
        person.click();
        Thread.sleep(4000);


    }
}
