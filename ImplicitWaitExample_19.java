package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample_19 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenmium");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//h3[contains(text(),'Selenium')]")).click();



        Thread.sleep(5000);
        driver.close();
    }
}
