package org.vapasi.pagefactory.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.vapasi.utilities.ScreenshotUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    ExtentHtmlReporter htmlReporter;
    /**
     * Rigorous Test :-)
     */
    @BeforeTest
    public void startReport(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        Date date = new Date();
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/"+dateFormat.format(date)+"SpreeReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host Name", "Spree");
        extent.setSystemInfo("Environment", "Automation Testing");
        extent.setSystemInfo("User Name", "Divya Anand");
        htmlReporter.config().setDocumentTitle("Spree Failed Reports");
        htmlReporter.config().setReportName("Spree Failed Report with Screenshots");
        htmlReporter.config().setTheme(Theme.STANDARD);
    }

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void takeScreenshotOnTestFailure(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE){
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
            String screenshotPath = ScreenshotUtil.takeScreenshot(driver, result.getName());
            logger.fail("Test Case Failed Snapshot is " + logger.addScreenCaptureFromBase64String(screenshotPath));
            //logger.fail("Test Case Failed Snapshot is " + MediaEntityBuilder.createScreenCaptureFromBase64String(screenshotPath).build());
        } else if(result.getStatus() == ITestResult.SKIP){
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }

        //driver.quit();
    }

    @AfterTest
    public void endReport(){
        extent.flush();
    }

    @AfterSuite
    public void teardown() {
        driver.quit();
    }
}
