package Saucelab_Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class functions implements Locators {
    propertyLoader propertyLoader=new propertyLoader();
    public WebDriver launchBrowser(){
        String browser=propertyLoader.propertyLoading("browser");
        return launchBrowser(browser);
    }

    public WebDriver launchBrowser(String browser){
        WebDriver driver=null;
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
            driver= new FirefoxDriver();
        }
        if(browser.equalsIgnoreCase("msedge")){
            System.setProperty("webdriver.gecko.driver","src/main/resources/msedgedriver");
            driver= new EdgeDriver();
        }
        return driver;
    }

    public void launchPage(WebDriver driver){
        driver.manage().window().maximize();
        driver.get(propertyLoader.propertyLoading("url"));//url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public void loginPage(WebDriver driver){
        locatorsWait(driver,user_name,10);
        WebElement login =driver.findElement(user_name);
        login.sendKeys(propertyLoader.propertyLoading("username"));
        WebElement password= driver.findElement(pass_word);
        password.sendKeys(propertyLoader.propertyLoading("password"));
        locatorsWait(driver,login_button,10);
        WebElement loginBtn=driver.findElement(login_button);
        loginBtn.click();
    }
    public void checkoutDetailsPage(WebDriver driver){
        locatorsWait(driver,first_name,10);
        WebElement firstName= driver.findElement(first_name);
        firstName.sendKeys(propertyLoader.propertyLoading("firstname"));
        WebElement lastName= driver.findElement(last_name);
        lastName.sendKeys(propertyLoader.propertyLoading("lastname"));
        WebElement postalCode= driver.findElement(postal_code);
        postalCode.sendKeys(propertyLoader.propertyLoading("pincode"));
        WebElement continueBtn=driver.findElement(continue_btn);
        continueBtn.click();
    }
    public void finishDetailsPage(WebDriver driver){
        locatorsWait(driver,finish_button,10);
        WebElement finish=driver.findElement(finish_button);
        finish.click();
    }
    public void confirmationPage(WebDriver driver){
        locatorsWait(driver,final_message,10);
        WebElement finalMessage=driver.findElement(final_message);
        String finalmsg=finalMessage.getText();
        System.out.println(finalmsg);
    }
    public void selectingItems(WebDriver driver){
        locatorsWait(driver, backpack,10);
        WebElement backPack=driver.findElement(backpack);
        backPack.click();
        WebElement fleeJacket=driver.findElement(flee_jacket);
        fleeJacket.click();
    }
    public void unselectItem(WebDriver driver) throws InterruptedException {
        WebElement removefleejacket= driver.findElement(remove_flee_jacket);
        removefleejacket.click();
        Thread.sleep(2000);
    }
    public void cartPage(WebDriver driver){
        WebElement cartIcn=driver.findElement(cart_icn);
        cartIcn.click();
        locatorsWait(driver,checkout_btn,10);
        WebElement checkoutBtn=driver.findElement(checkout_btn);
        checkoutBtn.click();
    }
    public void locatorsWait(WebDriver driver, By byElement, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }
}
