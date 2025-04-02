package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePicker_22 {
     public static void main(String args[])
     {
       WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.redbus.in/");
       driver.manage().window().maximize();

       String year="2025";
       String month="May";
       String date="25";

       driver.findElement(By.xpath("//span[@class='dateText']")).click();

       while(true) {
           String monthYear = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
           String[] arr = monthYear.split("\\s");
           String mon = arr[0];
           String yr = arr[1];

           System.out.println(mon);
           System.out.println(yr);
          if(mon.equals(month) && yr.equals(year))
               break;
           else
               driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
       }

       //Date Selection --Unable to inspect the date here . but the code is below
       List<WebElement> allDate= driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']"));
       for(WebElement dt:allDate)
       {
          String ele=dt.getText();
          if(ele.equals(date))
          {
              dt.click();
              break;
          }
       }
       driver.close();

}
}
