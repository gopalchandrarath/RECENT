package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_23 {

     public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/hovers");
        driver.manage().window().maximize();
         WebElement img=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
         WebElement profile=driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[1]"));
         Actions act= new Actions(driver);
         act.moveToElement(img).moveToElement(profile).click().perform();




         Thread.sleep(1000);
        driver.close();
    }
}
