package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_24 {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
        System.out.println(min_slider.getLocation());
        System.out.println(min_slider.getSize());

        Actions act= new Actions(driver);
        act.dragAndDropBy(min_slider,100,0).perform();
        System.out.println(min_slider.getLocation());
        System.out.println(min_slider.getSize());

        WebElement max_Slider= driver.findElement(By.xpath("//span[2]"));
        act.dragAndDropBy(max_Slider,-100,0).perform();

        Thread.sleep(1000);
        driver.close();

    }
}
