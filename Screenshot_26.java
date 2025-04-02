package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static org.example.SelectBy3Methods_8.driver;

public class Screenshot_26 {

    public static void main(String args[]) throws IOException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
        // ChromeDriver driver= new ChromeDriver();
       driver.get("https://www.selenium.dev/");
       /*
       //1)Full page screenshot
       TakesScreenshot ts= (TakesScreenshot)driver;
        File src= ts.getScreenshotAs(OutputType.FILE);
        //File trg=new File(".\\TestScreenShot\\home.png");
        File trg=new File(".\\Screenshots\\home_1.png");
        FileUtils.copyFile(src,trg);
        */

        //2)To capture section/portion and specific element(LOGO) of a page - available selenium 4 onwards

        WebElement ele= driver.findElement(By.xpath("//h2[contains(text(),'Support the Selenium Project')]"));
        File src_1=ele.getScreenshotAs(OutputType.FILE);
        File trg_1= new File(".//Screenshots\\ele.png");
        FileUtils.copyFile(src_1,trg_1);





        driver.close();


    }
}
