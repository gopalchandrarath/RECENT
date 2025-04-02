package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIframe_18 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
        WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(firstFrame);
        WebElement innerFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerFrame);
        //here default content method is not required .here frame inside another frame is present
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");


        //https://www.youtube.com/watch?v=a9JNyo3OdkM&t=1499s
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe

        Thread.sleep(5000);
        driver.close();
    }
}
