package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsAndPopups_17 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
        //Alert we can not inspect it comes from different browser
       /* 1)Alert window with ok button
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        driver.switchTo().alert().accept(); */

        /*2)Alert window with ok and cancel button
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().accept(); */

        //3) sending text message to  alert input box
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Alert alt =driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.sendKeys("Welcome");
        Thread.sleep(5000);
        alt.accept();


        Thread.sleep(5000);
        driver.close();

        
    }
}
