package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickActions_23 {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act= new Actions(driver);
        act.contextClick(button).perform();
        //or we can write build().perform();  here perform() calls internally build();
        //act.contextClick(button).build().perform();




        Thread.sleep(1000);
        driver.close();
    }
}
