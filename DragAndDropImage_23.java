package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropImage_23 {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
        WebElement ele1=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        WebElement ele2=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
        WebElement ele3=driver.findElement(By.id("trash"));

        Actions act=new Actions(driver);
        act.dragAndDrop(ele1,ele3).perform();
        act.dragAndDrop(ele2,ele3).perform();



        Thread.sleep(1000);
        driver.close();
    }
}
