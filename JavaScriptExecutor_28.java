package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutor_28 {

    public static void main(String args[]) throws  IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        /* Syntax
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(Script,args);

        //we can do flash, Drawing boarder and take screenshot,getting title of the page, click action
        //generate alert, Refreshing the page, scrolling down the page, scrolling up the page, zoom page

        //Drawing boarder and take screenshot
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement ele= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavaScriptUtil_28.drawBoarder(ele,driver);

        TakesScreenshot ts= (TakesScreenshot) driver;
        File src= ts.getScreenshotAs(OutputType.FILE);
        File trg= new File(".\\Screenshots\\logo_123.png");
        FileUtils.copyFile(src,trg);


        //get Title of the page

        String title=JavaScriptUtil_28.getTitleByJS(driver);
        System.out.println(title);


        //click action
        WebElement ele= driver.findElement(By.linkText("Register"));
        JavaScriptUtil_28.clickElementByJS(ele,driver);


        JavaScriptUtil_28.generateAlert(driver,"ABC Automation");
        //driver.switchTo().alert().accept();

        //refresh the browser
        JavaScriptUtil_28.refreshBrowserByJS(driver);

        //page Down
        JavaScriptUtil_28.scrollPageDown(driver);
        Thread.sleep(3000);
        //page Up
        JavaScriptUtil_28.scrollPageUp(driver);

         JavaScriptUtil_28.zoomPageByJS(driver);

        //flash this is the below code . its not working need to check
        WebElement ele= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavaScriptUtil_28.flash(ele,driver);
        */

      driver.close();
    }
}
