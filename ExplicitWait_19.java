package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait_19 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        //without implicitWait , ExplicitWait is not working here.
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenmium");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);


        WebElement ele = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Selenium')]")));
        //the above line of code will return boolean value . if ture it will return webElement
        //if false iot will return exception
        //Explicit wait is element specific

        ele.click();


        //Thread.sleep(5000);
        driver.close();

    }
}
