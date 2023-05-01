package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TweetPage {
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/div/div/section/div/div/div[1]/div/div/article/div/div/div[2]/div[2]/div[2]/div/span")
    WebElement tweet;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[7]/div[1]/div[3]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
    WebElement like;

    public void TweetMethod() throws InterruptedException {
        tweet.click();
        Thread.sleep(2000);
        like.click();
        Thread.sleep(2000);

    }
}
