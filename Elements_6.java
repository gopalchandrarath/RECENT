package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class Elements_6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        WebElement SearchBox= driver.findElement(By.xpath("//input[@type='text']"));
        SearchBox.sendKeys("Apple");
        //WebElement footersingle=driver.findElement(By.xpath("//div[@class='footer-upper']/div/ul/li/a"));
        //footersingle.click();
        List <WebElement> footerall= driver.findElements(By.xpath("//div[@class='footer-upper']/div/ul/li/a"));// or "//div[@class='footer-upper']//a"
        for(WebElement f:footerall)
        {
           // f.sendKeys(Keys.ENTER);
            System.out.println(f.getText());

        }
        System.out.println(footerall.size());

        //returning single web element and here we can mention list of web element under find elements method
        List<WebElement> Check =driver.findElements(By.xpath("//input[@type='text']"));
        System.out.println(Check.size());

        //for wrong xpath in find elements it will not give error . it will give 0 element
        List<WebElement> Check2 =driver.findElements(By.xpath("//input[@type='textttt']"));
        System.out.println(Check2.size());

        /* for wrong xpath in find element it will  give error
        WebElement SearchBox2= driver.findElement(By.xpath("//input[@type='texttt']"));
        System.out.println(SearchBox2.getSize()); */
        driver.quit();
    }
}
