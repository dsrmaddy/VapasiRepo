package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginSpree {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spree-vapasi-prod.herokuapp.com/login");

        String email = "input#spree_user_email"; //Css selector
        String pwd = "spree_user_password";//id
        String remMe = "input#spree_user_remember_me"; //cssSelector
        String loginButton = "input[value='Login']"; //cssSelector
        String drpDown = "select#taxon"; //cssSelector
        String searchTextBox = "input#keywords"; //cssSelector
        String searchButton = "input[value=Search]"; //cssSelector

        driver.findElement(By.cssSelector(email)).sendKeys("xyz@gmail.com");
        driver.findElement(By.id(pwd)).sendKeys("123456");
        driver.findElement(By.cssSelector(remMe)).click();
        driver.findElement(By.cssSelector(loginButton)).click();
        Thread.sleep(2000);

        WebElement dropDown = driver.findElement(By.cssSelector(drpDown));
        Select selectElement = new Select(dropDown);
        selectElement.selectByVisibleText("Categories");
        driver.findElement(By.cssSelector(searchTextBox)).sendKeys("Bags");
        driver.findElement(By.cssSelector(searchButton)).click();

        Thread.sleep(2000);
        driver.quit();
    }

}
