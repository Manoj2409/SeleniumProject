package Saucelab_Utilities;

import org.openqa.selenium.By;

public interface Locators {
    //loginPage
    By user_name =By.xpath("//input[@id='user-name']");
    By pass_word=By.xpath("//input[@id='password']");
    By login_button=By.xpath("//*[@id='login-button']");
    //adding items
    By backpack =By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By flee_jacket=By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    By remove_flee_jacket=By.xpath("//*[@id='remove-sauce-labs-fleece-jacket']");
    //cart
    By cart_icn=By.xpath("//*[@id='shopping_cart_container']/a");
    By checkout_btn=By.xpath("//*[@id='checkout']");
    By first_name=By.xpath("//input[@id='first-name']");
    By last_name=By.xpath("//input[@id='last-name']");
    By postal_code=By.xpath("//input[@id='postal-code']");
    By continue_btn=By.xpath("//*[@id='continue']");
    By finish_button=By.xpath("//*[@id='finish']");
    By final_message=By.xpath("//*[@id='checkout_complete_container']/h2");

}
