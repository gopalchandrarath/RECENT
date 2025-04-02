package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions_24 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");

        WebElement ele=driver.findElement(By.xpath("(//a[contains(text(),'Women')])[1]"));

        Actions act= new Actions(driver);
        Action process=act.moveToElement(ele).build();
        process.perform();

        //Actions is a class and Action is an interface


        Thread.sleep(1000);
        driver.close();

    }
}
