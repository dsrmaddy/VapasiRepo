package org.vapasi.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String name) {
        System.out.println("inside take screenshot method");
        String base64StringScreenshot="";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        Date date = new Date();
        String fileName = name + dateFormat.format(date)+".png";
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String screenshotPath = System.getProperty("user.dir")+"/test-output/"+ fileName;
        File destFile = new File(screenshotPath);
        try {
            FileUtils.copyFile(source, destFile);
            byte[] fileContent = FileUtils.readFileToByteArray(source);
            base64StringScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //return screenshotPath;
            return base64StringScreenshot;
        }
    }
}
