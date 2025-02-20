package saucelab.testrunners;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import saucelab.utilities.SauceFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class runner1 extends SauceFunctions {
    WebDriver driver=null;
    @BeforeTest
    public void setup(){
        driver=launchBrowser();
    }

    @Test(priority = 1 ,description = "Login functionality")
    public void login() throws InterruptedException {
        launchPage(driver);
        loginPage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}