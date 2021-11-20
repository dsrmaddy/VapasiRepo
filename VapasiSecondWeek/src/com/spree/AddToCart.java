package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Following is for login

        driver.get("http://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();

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

        //For Searching in Categories
        WebElement dropDown = driver.findElement(By.cssSelector(drpDown));
        Select selectElement = new Select(dropDown);
        selectElement.selectByVisibleText("Categories");
        driver.findElement(By.cssSelector(searchButton)).click();
        Thread.sleep(2000);

        //For adding to cart
        String bagLink = "span[title='Ruby on Rails Bag']";

        driver.findElement(By.cssSelector(bagLink)).click();
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("2");
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(5000);

        //Getting total value from Cart
        //System.out.println(driver.findElement(By.cssSelector("span.amount")).getText());
        System.out.println(driver.findElement(By.cssSelector("td[class='lead']")).getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
