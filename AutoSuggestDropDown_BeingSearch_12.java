package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown_BeingSearch_12 {

    public static void main (String args[]) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bing.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
        List<WebElement> allOptions=driver.findElements(By.xpath("//li[@class='sa_sg  sa_blue_hv   ']//span"));
        System.out.println("Size of Auto suggestion is: "+allOptions.size());

        for(WebElement option:allOptions)
        {
            //String aa= "selenium Tutorial";
           // String dd=aa.toLowerCase();
            //if(option.getText().equals(dd))
            if(option.getText().contains("downl"))
            {
                option.click();
                break;
            }
        }
        Thread.sleep(5000);
        driver.close();
    }
}
