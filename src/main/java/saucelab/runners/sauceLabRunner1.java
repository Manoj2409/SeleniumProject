package saucelab.runners;

import saucelab.utilities.SauceFunctions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class sauceLabRunner1 extends SauceFunctions {
    WebDriver driver=null;
    @Test(priority = 1 ,description = "Login functionality")
    public void login() throws InterruptedException {
        driver=launchBrowser();
        launchPage(driver);
        loginPage(driver);
        driver.quit();
    }

    @Test(priority = 2 ,description = "Add to cart functionality")
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

    @Test(priority = 3,description = "add and remove functionality")
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
