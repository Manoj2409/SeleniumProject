package Saucelab_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commonfunctions implements Locators {
    public void launchBrowser(String browser){
        WebDriver driver=null;
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
            driver= new FirefoxDriver();
        }
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
            driver= new FirefoxDriver();
        }


    }
}
