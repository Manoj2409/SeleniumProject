package Saucelab_Package;

import Saucelab_Utilities.functions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemo extends functions {
    WebDriver driver=null;
    @Test(description = "Login functionality")
    public void login() throws InterruptedException {
        driver=launchBrowser();
        launchPage(driver);
        loginPage(driver);
        Thread.sleep(1000);
        driver.quit();
    }

    @Test(description = "Add to cart functionality")
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

    @Test(description = "add and remove functionality")
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
}
