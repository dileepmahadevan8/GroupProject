package org.example;

import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProjectPageTest {
    WebDriver driver = FactoryBrowser.SetupBrowser("chrome", "https://www.twitter.com/");

    @Test(priority = 1)
    public void LoginVerification() throws InterruptedException {
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        //UI-1 invalid credentials
        login.loginWebsite("RishiKesh977439","lkjhghjk");
        //UI-2 valid credentials
        login.loginWebsiteagain("RishiKesh977439", "Twitterlog436@");


    }

    @Test(priority = 2)
    public void SearchInfo() throws InterruptedException {
        SearchPage s1 = PageFactory.initElements(driver, SearchPage.class);
        //UI-3 search a person
        s1.ExplorePage();
    }

    @Test(priority = 3)
    public void Follow() throws InterruptedException {
        FollowPage s1 = PageFactory.initElements(driver, FollowPage.class);
        //UI-4 follow the selected person
        s1.FollowMethod();

    }
    @Test(priority = 4)
    public void TweetOpen() throws InterruptedException {
        TweetPage p1 = PageFactory.initElements(driver, TweetPage.class);
        //UI-5 select the tweet and like it
        p1.TweetMethod();

    }
    @Test(priority = 5)
    public void CommentTheTweet() throws InterruptedException {
        CommentPage p2 = PageFactory.initElements(driver, CommentPage.class);
        //UI-6 comment the tweet
        p2.TweetVerification();

    }

    @Test(priority = 6)
    public void ProfileTweet() throws InterruptedException {
        ProfilePage p2 = PageFactory.initElements(driver, ProfilePage.class);
        //UI-7 open profile and see the list of liked tweets
        p2.ProfileMethod();

    }
    @Test(priority = 7)
    public void Notification() throws InterruptedException {
        NotificationPage p2 = PageFactory.initElements(driver, NotificationPage.class);
        //UI-8 show the notifications
        p2.Notify();

    }
    @Test(priority = 8)
    public void Logout() throws InterruptedException {
        LogoutPage p2 = PageFactory.initElements(driver, LogoutPage.class);
        //UI-9 logout from the website
        p2.FinalPage();
    }
}

