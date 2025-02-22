package saucelab.testrunners.loginpage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import saucelab.utilities.SauceFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginpage extends SauceFunctions {
    WebDriver driver=null;
    @BeforeTest
    public void setup(){
        driver=launchBrowser();
    }

    @Test(priority = 1 ,description = "Login functionality" , groups = {"smoke","regression"})
    public void loginUser() throws InterruptedException {
        launchPage(driver);
        loginPage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}