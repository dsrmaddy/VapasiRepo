package org.vapasi.pom.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    public String getCartValue(WebDriver driver) {
        String totalValue = driver.findElement(By.cssSelector("td[class='lead']")).getText();
        return totalValue;
    }

    public void emptyCart(WebDriver driver) {
        driver.findElement(By.cssSelector("input.btn.btn-outline-secondary")).click();
        System.out.println("emptied cart");
    }
}
