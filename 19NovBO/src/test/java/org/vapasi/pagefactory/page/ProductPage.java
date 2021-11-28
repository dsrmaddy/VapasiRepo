package org.vapasi.pagefactory.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ProductPage {

    @FindBy(css = "button#add-to-cart-button")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver, 5), this);
    }

    public void addToCart() {
        addToCartButton.click();
    }
}
