package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoardActionsMultipleKeys_25 {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        driver.manage().window().maximize();
        WebElement ele1=driver.findElement(By.xpath("//textarea[@name='text1']"));
        WebElement ele2=driver.findElement(By.xpath("//textarea[@name='text2']"));
        ele1.sendKeys("Welcome to selenium java");
        Actions act=new Actions(driver);
        //control+A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //CTRL+C
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //TAB to shift 2nd box
        act.sendKeys(Keys.TAB);
        act.perform();

        //CTRL +V
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //compare the text
        if(ele1.getAttribute("value").equals(ele2.getAttribute("value")))
        {
            System.out.println("Text Copied");
        }
        else
        {
            System.out.println("Text not Copied");
        }


        System.out.println(ele1.getAttribute("value"));







        Thread.sleep(1000);
        driver.close();

    }
}
