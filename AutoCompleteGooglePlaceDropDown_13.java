package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutoCompleteGooglePlaceDropDown_13 {
    public static void main(String args[])throws InterruptedException
    {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            WebElement searchBox=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
            searchBox.clear();
            searchBox.sendKeys("selenium");
  // Exact Website is not working need to validate with proper website


        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        //System.out.println(searchBox.isEnabled());
        //searchBox.sendKeys(Keys.ENTER);
            String text;
           do {
               searchBox.sendKeys(Keys.ARROW_DOWN);
               text=searchBox.getText();
               //text=searchBox.getAttribute("value");
               System.out.println(searchBox.isEnabled());
               System.out.println(text);

               //if loop is not working need to check
               if(text.equals(" webdriver"))
               {

                   searchBox.sendKeys(Keys.ENTER);
                   break;
               }
           }while(!text.isEmpty());



            Thread.sleep(3000);
            driver.close();

    }
}
