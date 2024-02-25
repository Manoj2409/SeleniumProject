package org.example;


import Utilities.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//elementsIcn=

public class simple extends utilities {

    static WebDriver driver=null;
    @BeforeTest
    public void beforeTest(){
        //browser configuration
        driver=browserLoader(propertyLoader("browser"));
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/");
        Thread.sleep(1000);
        WebElement elements=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        //elements.wait();
        elements.click();
        Thread.sleep(1000);
        WebElement textbox = driver.findElement(By.xpath("//*[@id='item-0']/span"));
        textbox.click();
        String textBox= textbox.getText();
        System.out.println(textBox);
        WebElement txtBox=driver.findElement(By.xpath("//*[@id='userName']"));
        txtBox.sendKeys("John Wick");

        WebElement email=driver.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("parabellum@gmail.com");

        WebElement currAddress=driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currAddress.sendKeys("Chicago");

        WebElement permAddress=driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        permAddress.sendKeys("Chicago");

        WebElement submit =driver.findElement(By.xpath("//*[@id='submit']"));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        submit.click();
        Thread.sleep(2000);

        // to select the radio button
        // //*[@id="item-2"]/span


    }
    @Test(priority = 2)
    public void secondCase() throws InterruptedException {

        WebElement RadioMenu=driver.findElement(By.xpath("//*[text()='Radio Button']"));
        RadioMenu.click();
        //label[@class="custom-control-label" and @for="yesRadio"]
        WebElement Radiobtn=driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='yesRadio']"));
        Radiobtn.click();
        //You have selected
        WebElement RadioYesCheck=driver.findElement(By.xpath("//*[text()='You have selected ']"));
        System.out.println(RadioYesCheck.getText());

        Thread.sleep(2000);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
//*[@id='app']//h5
//*[@id="app"]/div/div/div[2]/div/div[1]/div/div[3]
// //*[@id="app"]//h5 with a for loop contains text (Elements)
// //*[@id="item-0"]/span with a for loop contains text (Text Box)


/*
How to create a framework:

1. A class to store the xpath & it needs to have page in the comments
2. A class to store the common functions
3. A property file to change the config of browsers

 */