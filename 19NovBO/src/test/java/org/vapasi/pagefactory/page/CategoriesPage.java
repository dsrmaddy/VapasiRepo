package org.vapasi.pagefactory.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

    @FindBy(css = "a[href='/t/bags']")
    private WebElement bagsCategory;

    @FindBy(css = "span[title='Ruby on Rails Tote']")
    private WebElement rubyOnRailsTote;

    public CategoriesPage(WebDriver driver) {
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver, 5), this);
    }

    public void selectBags() {
        bagsCategory.click();
    }

    public void selectFirstBag() {
        rubyOnRailsTote.click();
    }
}
