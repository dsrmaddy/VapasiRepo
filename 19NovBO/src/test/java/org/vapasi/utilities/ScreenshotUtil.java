package org.vapasi.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    WebDriver driver;

    public void takeScreenshot() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
        Date date = new Date();
        String fileName = dateFormat.format(date)+".png";
        String filePath = "./screenshots/";
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath+fileName);
        try {
            FileHandler.copy(source, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
