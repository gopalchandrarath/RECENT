package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown_GoogleSearch_12 {

    public static void main (String args[]) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]")).sendKeys("Java tutorial");
        //div[@role='option']//div[1]//span
        //div[@role='option']//div[@role='presentation']/span
        List<WebElement> allOptions=driver.findElements(By.xpath("//div[@role='option']//div[@role='presentation']/span"));
        System.out.println("Size of Auto suggestion is: "+allOptions.size());

        for(WebElement option:allOptions)
        {

            //if(option.getText().equals("java tutorial pdf"))
            if(option.getText().contains("schools   "))

            {
                option.click();
                break;
            }
        }
        Thread.sleep(5000);
        driver.close();
    }
}
