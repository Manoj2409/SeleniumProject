package saucelab.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class functions extends propertyLoader{

    propertyLoader propertyLoader=new propertyLoader();
    public WebDriver launchBrowser(){
        String browser=propertyLoader.configPropertyLoader("browser");
        return launchBrowser(browser);
    }

    public WebDriver launchBrowser(String Browser){
        WebDriver driver=null;
        if(Browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
            driver= new FirefoxDriver();
        }
        else if(Browser.equalsIgnoreCase("msedge")){
            System.setProperty("webdriver.msedge.driver","src/main/resources/msedgedriver");
            driver= new EdgeDriver();
        }
        else {
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
            driver= new ChromeDriver();
        }
        return driver;
    }
    public void locatorsWait(WebDriver driver, By byElement, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }

}
