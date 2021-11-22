package org.vapasi.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.vapasi.pagefactory.*;
import org.vapasi.pagefactory.page.FactoryModelCategoriesPage;
import org.vapasi.pagefactory.page.FactoryModelLoginPage;
import org.vapasi.pagefactory.page.FactoryModelProductPage;
import org.vapasi.pom.page.CategoriesPage;
import org.vapasi.pagefactory.page.FactoryModelCartPage;
import org.vapasi.pom.page.LoginPage;
import org.vapasi.pom.page.ProductPage;

import java.util.concurrent.TimeUnit;

public class FactoryModelAppTest {
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

        FactoryModelLoginPage loginPage = new FactoryModelLoginPage(driver);
        loginPage.enterLoginPage();
        loginPage.giveDetailsAndLogin("xyz@gmail.com", "123456");

        FactoryModelCategoriesPage catPage = new FactoryModelCategoriesPage();
        catPage.selectBags(driver);
        catPage.selectFirstBag(driver);

        FactoryModelProductPage prodPage = new FactoryModelProductPage();
        prodPage.addToCart(driver);

        FactoryModelCartPage cartPage = new FactoryModelCartPage(driver);
        String totalValue = cartPage.getCartValue(driver);
        System.out.println("total cart value is :"+totalValue);
        Assert.assertEquals("$16.79", totalValue);
        cartPage.emptyCart(driver);
    }
}
