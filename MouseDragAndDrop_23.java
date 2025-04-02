package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop_23 {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        WebElement ele1=driver.findElement(By.id("box3"));
        WebElement ele2=driver.findElement(By.id("box6"));
        WebElement ele3=driver.findElement(By.id("box106"));
        WebElement ele4=driver.findElement(By.id("box107"));

        Actions act= new Actions(driver);
        act.dragAndDrop(ele1,ele3).perform();
        act.dragAndDrop(ele2,ele4).perform();


        Thread.sleep(1000);
        driver.close();
    }
}
