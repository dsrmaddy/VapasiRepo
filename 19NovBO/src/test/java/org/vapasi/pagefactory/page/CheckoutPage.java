package org.vapasi.pagefactory.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CheckoutPage {
    @FindBy(css = "input.btn.btn-lg.btn-success")
    private WebElement saveAndContButton;

    @FindBy(css = "input#card_number")
    private WebElement cardNoTextBox;

    @FindBy(css = "input#card_expiry")
    private WebElement expiryTextBox;

    @FindBy(css = "input#card_code")
    private WebElement codeTextBox;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver,5), this);
    }

    public void saveAndContinueAction() {
        saveAndContButton.click();
    }
}
