package org.vapasi.pagefactory.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    @FindBy(css = "li#link-to-login")
    WebElement linkToLogin;

    @FindBy(css = "input#spree_user_email")
    WebElement email;

    @FindBy(id = "spree_user_password")
    WebElement password;

    @FindBy(css = "input#spree_user_remember_me")
    WebElement remMe;

    @FindBy(css = "input[value='Login']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, 5);
    }

    public void enterLoginPage() {
        linkToLogin.click();
    }

    public void giveDetailsAndLogin(String emailId, String pwd) {
        email.sendKeys(emailId);
        password.sendKeys(pwd);
        remMe.click();
        loginButton.click();
    }
}
