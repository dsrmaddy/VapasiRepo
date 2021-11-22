package org.vapasi.pagefactory.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryModelCartPage {

    @FindBy(css = "td[class='lead']")
    WebElement totalValueElement;

    @FindBy(css = "input.btn.btn-outline-secondary")
    WebElement emptyCartButton;

    public FactoryModelCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getCartValue(WebDriver driver) {
        //String totalValue = driver.findElement(By.cssSelector("td[class='lead']")).getText();
        return totalValueElement.getText();
    }

    public void emptyCart(WebDriver driver) {
        //driver.findElement(By.cssSelector("input.btn.btn-outline-secondary")).click();
        emptyCartButton.click();
        System.out.println("emptied cart");
    }
}
