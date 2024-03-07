package saucelab.runners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import saucelab.utilities.SauceFunctions;

public class sauceLabRunner2 extends SauceFunctions {
    WebDriver driver=null;
    @Test(description = "Regression - Login functionality")
    public void login() throws InterruptedException {
        driver=launchBrowser();
        launchPage(driver);
        loginPage(driver);
        driver.quit();
    }
}
