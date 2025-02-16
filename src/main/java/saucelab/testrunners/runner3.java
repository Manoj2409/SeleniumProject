package saucelab.testrunners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import saucelab.utilities.SauceFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class runner3 extends SauceFunctions {
    WebDriver driver=null;

    @BeforeTest
    public void setup(){
        driver=launchBrowser();
    }

    @Test(priority = 1,description = "add and remove functionality")
    public void add_and_remove_functionality() throws InterruptedException {
        launchPage(driver);
        loginPage(driver);
        selectingItems(driver);
        unselectItem(driver);
        cartPage(driver);
        checkoutDetailsPage(driver);
        finishDetailsPage(driver);
        confirmationPage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}

