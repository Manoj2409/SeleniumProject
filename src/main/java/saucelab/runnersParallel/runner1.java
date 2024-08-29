package saucelab.runnersParallel;



import saucelab.utilities.SauceFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class runner1 extends SauceFunctions {
    WebDriver driver=null;
    @Test(priority = 1 ,description = "Login functionality")
    public void login() throws InterruptedException {
        driver=launchBrowser();
        launchPage(driver);
        loginPage(driver);
        driver.quit();
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(0);
    }

}

