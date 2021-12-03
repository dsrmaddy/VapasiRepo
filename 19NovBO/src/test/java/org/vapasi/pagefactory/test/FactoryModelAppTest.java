package org.vapasi.pagefactory.test;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
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
        logger = extent.createTest("addCart");

        //Login to Spree site
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterLoginPage();
        loginPage.giveDetailsAndLogin("xyz@gmail.com", "123456");

        //driver.findElement(By.cssSelector("a.cart-info")).click();
        //Select Bag category and the first product in list
        CategoriesPage catPage = new CategoriesPage(driver);
        catPage.selectBags();
        catPage.selectFirstBag();

        //Go to product page and add one quantity to Cart
        ProductPage prodPage = new ProductPage(driver);
        prodPage.addToCart();

        //To generate the log when the test case is failed
        Assert.assertTrue(false);
        //logger.log(Status.FAIL, "Test Case (addCart) Status is failed");

        //Go to Cart page and validate if value is correct
        CartPage cartPage = new CartPage(driver);
        String totalValue = cartPage.getCartValue();
        Assert.assertEquals("$93.15", totalValue);
        cartPage.checkoutAction();
        //cartPage.emptyCart();

        //Go to Checkout page and give address, shipping, payment details
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillBillingAddress("X", "YZ", "Anchorage", "Anchorage", "Alaska", "856712", "1234567890");
        checkoutPage.fillShipping();
        checkoutPage.fillPayment();
    }
}
