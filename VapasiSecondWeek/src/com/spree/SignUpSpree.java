package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpSpree {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spree-vapasi-prod.herokuapp.com/login");

        String email = "input#spree_user_email"; //Css selector
        String pwd = "input[placeholder = Password]"; //css selector
        String pwdConf = "spree_user_password_confirmation"; //id
        String signupButton = "input.btn.btn-success.btn-block"; //css

        driver.findElement(By.cssSelector(email)).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector(pwd)).sendKeys("12345678");
        driver.findElement(By.id(pwdConf)).sendKeys("12345678");
        driver.findElement(By.cssSelector(signupButton)).click();
    }
}
