package org.vapasi.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    public void addToCart(WebDriver driver) {
        driver.findElement(By.cssSelector("button#add-to-cart-button")).click();
    }

}
