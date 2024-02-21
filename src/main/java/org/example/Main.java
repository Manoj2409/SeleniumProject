package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        Thread.sleep(1000);
        driver.quit();
    }
}