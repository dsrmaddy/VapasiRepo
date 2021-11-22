package org.vapasi.pagefactory.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FactoryModelCategoriesPage {

    public void selectBags(WebDriver driver) {
        driver.findElement(By.cssSelector("a[href='/t/bags']")).click();
    }

    public void selectFirstBag(WebDriver driver) {
        driver.findElement(By.cssSelector("span[title='Ruby on Rails Tote']")).click();
    }
}
