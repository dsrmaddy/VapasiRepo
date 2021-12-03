package org.vapasi.pagefactory.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
   /* @FindBy(css = "input.btn.btn-lg.btn-success")
    private WebElement saveAndContButton;

    @FindBy(css = "input#card_number")
    private WebElement cardNoTextBox;

    @FindBy(css = "input#card_expiry")
    private WebElement expiryTextBox;

    @FindBy(css = "input#card_code")
    private WebElement codeTextBox;

    public void saveAndContinueAction() {
        saveAndContButton.click();
    }
    */

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver,5), this);
    }
    @FindBy(id = "order_bill_address_attributes_firstname")
    private WebElement billAddrFirstName;

    @FindBy(id = "order_bill_address_attributes_lastname")
    private WebElement billAddrLastName;

    @FindBy(id = "order_bill_address_attributes_address1")
    private WebElement billAddrFirstLine;

    @FindBy(id = "order_bill_address_attributes_city")
    private WebElement billAddrCity;

    @FindBy(id = "order_bill_address_attributes_state_id")
    private WebElement billAddrState;

    @FindBy(id = "order_bill_address_attributes_phone")
    private WebElement billAddrPhoneNumber;

    @FindBy(id = "order_bill_address_attributes_zipcode")
    private WebElement billAddrZipCode;

    @FindBy(id="save_user_address")
    private WebElement saveMyAddrCheckBox;

    @FindBy(name = "commit")
    private WebElement saveAndContButton;

    @FindBy(id = "order_shipments_attributes_0_selected_shipping_rate_id_1392")
    private WebElement twoDayShippingMethod;

    @FindBy(id = "order_payments_attributes__payment_method_id_3")
    private WebElement selectPaymentoptionCheck;

    public void fillBillingAddress(String firstName, String lastName, String address, String city, String state, String zipCode, String phone) {

        billAddrFirstName.sendKeys(firstName);
        billAddrLastName.sendKeys(lastName);
        billAddrFirstLine.sendKeys(address);
        billAddrCity.sendKeys(city);

        Select chooseState = new Select(billAddrState);
        chooseState.selectByVisibleText(state);

        billAddrZipCode.sendKeys(zipCode);
        billAddrPhoneNumber.sendKeys(phone);
        saveMyAddrCheckBox.click();
        saveAndContButton.click();
    }

    public void fillShipping() {
        saveAndContButton.click();
    }

    public void fillPayment() {
        selectPaymentoptionCheck.click();
        saveAndContButton.click();

    }
}
