package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class utilities extends propertyLoad {
    static WebDriver driver=null;
    public WebDriver browserLoader(String browserName){
        if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
            driver=new FirefoxDriver();
        }
        if(browserName.equals("msedge")){
            System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver");
            driver= new EdgeDriver();
        }
        return driver;
    }

    public void waitUntilVisible(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath()));
    }


}
