package com.spree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RubyProducts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://spree-vapasi-prod.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Type Ruby in Search box and click Search button
        String searchButton = "input[value=Search]"; //cssSelector
        driver.findElement(By.id("keywords")).sendKeys("Ruby");
        driver.findElement(By.cssSelector(searchButton)).click();

        //Find product size
        List<WebElement> products = driver.findElements(By.cssSelector("div[id='products'] a"));
        System.out.println(products.size());

        //print every product name
        for(int i=0; i<products.size(); i++) {
            System.out.println(products.get(i).getText());
        }
        driver.quit();
    }
}
