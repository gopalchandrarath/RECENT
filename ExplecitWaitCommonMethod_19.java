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

public class ExplecitWaitCommonMethod_19 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenmium");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);


       By eleLocator=By.xpath("//h3[contains(text(),'Selenium')]");
        WebElement ele1=waitForElementPresent(driver,eleLocator,7);
        ele1.click();
        //waitForElementPresent(driver,eleLocator,10).click();

        Thread.sleep(5000);
        driver.close();
    }

    public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeouts)
    {
       WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(timeouts));
       mywait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
}
