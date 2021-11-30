package org.vapasi.pagefactory.test;

import com.aventstack.extentreports.Status;
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

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterLoginPage();
        loginPage.giveDetailsAndLogin("xyz@gmail.com", "123456");

        CategoriesPage catPage = new CategoriesPage(driver);
        catPage.selectBags();
        catPage.selectFirstBag();

        ProductPage prodPage = new ProductPage(driver);
        prodPage.addToCart();

        Assert.assertTrue(false);
        //To generate the log when the test case is failed
        logger.log(Status.FAIL, "Test Case (addCart) Status is failed");

        //CartPage cartPage = new CartPage(driver);
        //cartPage.checkoutAction();

        //String totalValue = cartPage.getCartValue();
        //System.out.println("total cart value is :"+totalValue);
        //Assert.assertEquals("$16.79", totalValue);
        //cartPage.emptyCart();

        /* CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.saveAndContinueAction();
        Assert.assertTrue(true); */
    }
}
