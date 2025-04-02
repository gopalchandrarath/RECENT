package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick_23 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Double-click me')]"));
        Actions act = new Actions(driver);
        act.doubleClick(ele).perform();

        Thread.sleep(1000);
        driver.close();
    }
}
