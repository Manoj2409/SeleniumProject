package saucelab.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SauceFunctions extends functions {
    public void launchPage(WebDriver driver){
        driver.manage().window().maximize();
        driver.get(configPropertyLoader("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public void loginPage(WebDriver driver) throws InterruptedException {

        locatorsWait(driver,pagePropertyLoader("user_name"),10);
        WebElement login =driver.findElement(pagePropertyLoader("user_name"));
        login.sendKeys(pageTextLoader("username"));


        WebElement password= driver.findElement(pagePropertyLoader("pass_word"));
        password.sendKeys(pageTextLoader("password"));
        locatorsWait(driver,pagePropertyLoader("login_button"),10);

        Thread.sleep(2000);

        WebElement loginBtn=driver.findElement(pagePropertyLoader("login_button"));
        loginBtn.click();

        Thread.sleep(2000);


    }
    public void checkoutDetailsPage(WebDriver driver) throws InterruptedException {
        locatorsWait(driver,pagePropertyLoader("first_name"),10);
        WebElement firstName= driver.findElement(pagePropertyLoader("first_name"));
        firstName.sendKeys(pageTextLoader("firstname"));
        WebElement lastName= driver.findElement(pagePropertyLoader("last_name"));
        lastName.sendKeys(pageTextLoader("lastname"));
        WebElement postalCode= driver.findElement(pagePropertyLoader("postal_code"));
        postalCode.sendKeys(pageTextLoader("pincode"));
        WebElement continueBtn=driver.findElement(pagePropertyLoader("continue_btn"));
        Thread.sleep(3000);
        continueBtn.click();
    }
    public void finishDetailsPage(WebDriver driver) throws InterruptedException {
        locatorsWait(driver,pagePropertyLoader("finish_button"),10);
        WebElement finish=driver.findElement(pagePropertyLoader("finish_button"));
        Thread.sleep(3000);
        finish.click();
    }
    public void confirmationPage(WebDriver driver) throws InterruptedException {
        locatorsWait(driver,pagePropertyLoader("final_message"),10);
        WebElement finalMessage=driver.findElement(pagePropertyLoader("final_message"));
        String finalMessageText=finalMessage.getText();
        Thread.sleep(4000);
        System.out.println(finalMessageText);
    }
    public void selectingItems(WebDriver driver) throws InterruptedException {
        locatorsWait(driver, pagePropertyLoader("back_pack"),10);
        WebElement backPack=driver.findElement(pagePropertyLoader("back_pack"));
        backPack.click();

        WebElement fleeJacket=driver.findElement(pagePropertyLoader("flee_jacket"));
        fleeJacket.click();

        Thread.sleep(3000);
    }
    public void unselectItem(WebDriver driver) throws InterruptedException {
        WebElement removefleejacket= driver.findElement(pagePropertyLoader("remove_flee_jacket"));
        removefleejacket.click();
        Thread.sleep(3000);
    }
    public void cartPage(WebDriver driver) throws InterruptedException {
        WebElement cartIcn=driver.findElement(pagePropertyLoader("cart_icn"));
        cartIcn.click();
        locatorsWait(driver,pagePropertyLoader("checkout_btn"),10);
        WebElement checkoutBtn=driver.findElement(pagePropertyLoader("checkout_btn"));
        Thread.sleep(3000);
        checkoutBtn.click();
    }
}
