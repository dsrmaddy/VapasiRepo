package org.vapasi.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.vapasi.pagefactory.page.CategoriesPage;
import org.vapasi.pagefactory.page.LoginPage;
import org.vapasi.pagefactory.page.ProductPage;
import org.vapasi.pagefactory.page.CartPage;
import org.vapasi.pagefactory.page.CheckoutPage;

import java.util.concurrent.TimeUnit;

public class FactoryModelAppTest extends BaseTest{


    @Test
    public void addCart()
    {
        System.out.println("inside addCart");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterLoginPage();
        loginPage.giveDetailsAndLogin("xyz@gmail.com", "123456");

        CategoriesPage catPage = new CategoriesPage(driver);
        catPage.selectBags();
        catPage.selectFirstBag();

        ProductPage prodPage = new ProductPage(driver);
        prodPage.addToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.checkoutAction();
        //System.out.println("total cart value is :"+totalValue);
        //Assert.assertEquals("$16.79", totalValue);
        //cartPage.emptyCart();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.saveAndContinueAction();

    }
}
