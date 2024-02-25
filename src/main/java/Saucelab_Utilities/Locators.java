package Saucelab_Utilities;

import org.openqa.selenium.By;

public interface Locators {


    By user_name =By.xpath("//input[@id='user-name']");
    By pass_word=By.xpath("//input[@id='password']");
    By login_button=By.xpath("//*[@id='login-button']");
}
