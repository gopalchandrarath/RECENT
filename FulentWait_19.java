package org.example;

import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FulentWait_19 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenmium");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.RETURN);

        //fluentWait declaration
        Wait<WebDriver> myWait= new FluentWait <WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        //Uses of FluentWait

        WebElement foo= myWait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("//h3[contains(text(),'Selenium')]"));
        }
        });
        foo.click();


    }
}
