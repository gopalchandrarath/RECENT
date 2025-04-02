package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted_11 {

    public static void main(String args[])
    {
       WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       driver.get("https://practice.expandtesting.com/dropdown");
       driver.manage().window().maximize();
       //actually site is closed
       WebElement country = driver.findElement(By.id("country"));
       Select sc= new Select(country);
       List<WebElement> allOptions =sc.getOptions();

       ArrayList originalList=new ArrayList();
       ArrayList tempList= new ArrayList();

       for(WebElement options:allOptions)
       {

           originalList.add(options.getText());
           tempList.add(options.getText());

       }
       System.out.println("Original List: "+originalList);
       System.out.println("Temp List: "+tempList);

       Collections.sort(tempList);

        System.out.println("Original List after sort: "+originalList);
        System.out.println("Temp List after sort: "+tempList);

        if(originalList.equals(tempList))
        {
            System.out.println("List is Sorted" );
        }
        else
        {
            System.out.println("List is Unsorted");
        }

        driver.close();
    }
}
