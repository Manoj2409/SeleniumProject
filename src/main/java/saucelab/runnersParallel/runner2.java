package saucelab.runnersParallel;



import saucelab.utilities.SauceFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class runner2 extends SauceFunctions {
    WebDriver driver=null;

    @Test(priority = 1 ,description = "Add to cart functionality")
    public void add_to_cart_functionality() throws InterruptedException {
        driver = launchBrowser();
        launchPage(driver);
        loginPage(driver);
        selectingItems(driver);
        cartPage(driver);
        checkoutDetailsPage(driver);
        finishDetailsPage(driver);
        confirmationPage(driver);
        driver.quit();
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(0);
    }

}

