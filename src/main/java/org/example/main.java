package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class main extends utilities {

    WebDriver driver=null;

    @BeforeTest
    public void initializeBrowser() {
        driver=browserLoader(propertyLoader("browser"));
    }
    //@Test
    public void test() throws InterruptedException {
        /*WebDriver driver;
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        driver= new FirefoxDriver();*/
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(1000);
        WebElement a=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        a.click();
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

        WebElement RadioMenu=driver.findElement(By.xpath("//*[text()='Radio Button']"));
        RadioMenu.click();
        //label[@class="custom-control-label" and @for="yesRadio"]
        WebElement Radiobtn=driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='yesRadio']"));
        Radiobtn.click();
        //You have selected
        WebElement RadioYesCheck=driver.findElement(By.xpath("//*[text()='You have selected ']"));
        System.out.println(RadioYesCheck.getText());



        //nester frames and modals
        //Alerts, Frame & Windows
        //menu and sub sub item and date picker

        //Try to integrate with testng like a each scenario with proper assertion so that the next day you can handle only scenarios and jenkins


        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Thread.sleep(1000);
        WebElement a=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        a.click();
        Thread.sleep(1000);
    }

}
//*[@id='app']//h5
//*[@id="app"]/div/div/div[2]/div/div[1]/div/div[3]
// //*[@id="app"]//h5 with a for loop contains text (Elements)
// //*[@id="item-0"]/span with a for loop contains text (Text Box)