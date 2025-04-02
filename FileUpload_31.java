package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload_31 {
    public static void main (String args[]) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/upload");
        driver.manage().window().maximize();
        // if in webElement  type = file then we can use send keys option to upload the file else
        //we can use robot class methods to upload file

       /* driver.findElement(By.xpath("//input[@type='file']"))
                //.sendKeys("\\Users\\radhamohanrath\\Downloads\\basic-text.pdf"); this is for window
                .sendKeys("/Users/radhamohanrath/Downloads/basic-text.pdf"); */

        //using robot class method
        //driver.findElement(By.xpath("//input[@type='file']")).click();
        // here click action is not working so we are using javaScript executor
        Thread.sleep(3000);
        WebElement ele= driver.findElement(By.xpath("//input[@type='file']"));
       JavascriptExecutor js= (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();",ele);//click action
        //the click is not happening need to check and this is the code to proceed
        //once the popup open , need to paste the location and press enter
        // in robot class we need to do
        //1) COPY THE PATH 2)CTRL+V 3)ENTER

        Robot rb= new Robot();
        rb.delay(3000);
        //below 2 line doing CTRL+C
        StringSelection ss= new StringSelection("/Users/radhamohanrath/Downloads/basic-text.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        //CTRL+V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(3000);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(3000);

        //ENTER
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        driver.close();
    }




}
