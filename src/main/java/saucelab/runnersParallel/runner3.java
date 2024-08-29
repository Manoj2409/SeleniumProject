package saucelab.runnersParallel;




import saucelab.utilities.SauceFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class runner3 extends SauceFunctions {
    WebDriver driver=null;

    @Test(priority = 1,description = "add and remove functionality")
    public void add_and_remove_functionality() throws InterruptedException {
        driver = launchBrowser();
        launchPage(driver);
        loginPage(driver);
        selectingItems(driver);
        unselectItem(driver);
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

