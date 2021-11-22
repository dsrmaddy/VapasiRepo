package org.vapasi.pom.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.vapasi.pom.page.CartPage;
import org.vapasi.pom.page.CategoriesPage;
import org.vapasi.pom.page.LoginPage;
import org.vapasi.pom.page.ProductPage;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    WebDriver driver;
    /**
     * Rigorous Test :-)
     */
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void addCart()
    {
        System.out.println("inside addCart");

        LoginPage loginPage = new LoginPage();
        loginPage.enterLoginPage(driver);
        loginPage.giveDetailsAndLogin(driver);

        CategoriesPage catPage = new CategoriesPage();
        catPage.selectBags(driver);
        catPage.selectFirstBag(driver);

        ProductPage prodPage = new ProductPage();
        prodPage.addToCart(driver);

        CartPage cartPage = new CartPage();
        String totalValue = cartPage.getCartValue(driver);
        System.out.println("total cart value is :"+totalValue);
        Assert.assertEquals("$16.79", totalValue);

        cartPage.emptyCart(driver);
    }
}
