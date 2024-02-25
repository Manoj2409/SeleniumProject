package Saucelab_Package;

import Saucelab_Utilities.commonfunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SauceDemo extends commonfunctions {
    WebDriver driver=null;
    @Test(description = "Login functionality")
    public void login() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        WebElement login =driver.findElement(user_name);
        login.sendKeys("standard_user");
        WebElement password= driver.findElement(pass_word);
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement loginBtn=driver.findElement(login_button);
        loginBtn.click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test(description = "Add to cart functionality")
    public void add_to_cart_functionality() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        WebElement login =driver.findElement(By.xpath("//input[@id='user-name']"));
        login.sendKeys("standard_user");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement loginBtn=driver.findElement(By.xpath("//*[@id='login-button']"));
        loginBtn.click();
        Thread.sleep(1000);
        WebElement backPack=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        backPack.click();

        WebElement fleeJacket=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        fleeJacket.click();

        WebElement cartIcn=driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a"));
        cartIcn.click();

        Thread.sleep(1000);
        WebElement checkoutBtn=driver.findElement(By.xpath("//*[@id='checkout']"));
        checkoutBtn.click();

        Thread.sleep(1000);
        WebElement firstName= driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Manoj");

        WebElement lastName= driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Thiyagarajan");


        WebElement postalCode= driver.findElement(By.xpath("//input[@id='postal-code']"));
        postalCode.sendKeys("600011");

        //*[@id="continue"]
        WebElement continueBtn=driver.findElement(By.xpath("//*[@id='continue']"));
        continueBtn.click();

        WebElement finish=driver.findElement(By.xpath("//*[@id='finish']"));
        finish.click();
        Thread.sleep(1000);

        WebElement finalMessage=driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
        String finalmsg=finalMessage.getText();
        System.out.println(finalmsg);
        driver.quit();
    }



}
