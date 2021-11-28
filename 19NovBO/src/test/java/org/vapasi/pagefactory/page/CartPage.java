package org.vapasi.pagefactory.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    //@FindBy(css = "td[class='lead']")
   // WebElement totalValueElement;

    @FindBy(id = "checkout-link")
    WebElement checkOutButton;

    @FindBy(css = "input.btn.btn-outline-secondary")
    WebElement emptyCartButton;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    public String getCartValue(WebDriver driver) {
//        return totalValueElement.getText();
//    }

    public void checkoutAction() {
        checkOutButton.click();
    }

    public void emptyCart() {
        emptyCartButton.click();
        System.out.println("emptied cart");
    }



}
