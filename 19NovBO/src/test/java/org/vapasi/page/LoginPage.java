package org.vapasi.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public void enterLoginPage(WebDriver driver) {
        driver.findElement(By.cssSelector("li#link-to-login")).click();
    }

    public void giveDetailsAndLogin(WebDriver driver) {
        String email = "input#spree_user_email"; //Css selector
        String pwd = "spree_user_password";//id
        String remMe = "input#spree_user_remember_me"; //cssSelector
        String loginButton = "input[value='Login']"; //cssSelector
        driver.findElement(By.cssSelector(email)).sendKeys("xyz@gmail.com");
        driver.findElement(By.id(pwd)).sendKeys("123456");
        driver.findElement(By.cssSelector(remMe)).click();
        driver.findElement(By.cssSelector(loginButton)).click();
    }
}
