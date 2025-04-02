package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocation_27 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //get location -method1
        System.out.println("X and Y axis are : "+ele.getLocation());
        System.out.println("X axis is : "+ele.getLocation().getX());
        System.out.println("Y axis is : "+ele.getLocation().getY());
        //get location -method 2
        System.out.println("X axis is : "+ele.getRect().getX());
        System.out.println("Y axis is : "+ele.getRect().getY());
        //get Height and width - method 1
        System.out.println("size is : "+ele.getSize());
        System.out.println("Height is : "+ele.getSize().getHeight());
        System.out.println("Width is : "+ele.getSize().getWidth());
        System.out.println("class is : "+ele.getSize().getClass());
        //get Height and width - method 2
        System.out.println("Height is : "+ele.getRect().getHeight());
        System.out.println("Width is : "+ele.getRect().getWidth());




        driver.close();
    }
}
