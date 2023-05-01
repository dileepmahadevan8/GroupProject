package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentPage {
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[7]/div[1]/div[3]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
    WebElement like;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/span[1]")
    WebElement reply;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
    WebElement comment;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-13qz1uu']//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
    WebElement commentaddress;


    public void TweetVerification() throws InterruptedException{
        comment.click();
        Thread.sleep(2000);
        commentaddress.sendKeys("Done");
        Thread.sleep(2000);
        reply.click();
        Thread.sleep(6000);
    }


}
