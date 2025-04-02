package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DatePickerSecond_22 {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dummy-tickets.com/");
        driver.manage().window().maximize();
        String year = "2025";
        String month = "Jul";
        String date = "29";
        driver.findElement(By.xpath("(//input[@class='departure required mb-2 hasDatepicker'])[1]")).click();
        //driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).click();
        WebElement ele = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select sel = new Select(ele);
        sel.selectByVisibleText(month);
        /* below comment line need to check logic is ok and works fine without change year
        String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

        while (true)
            if (yr.equalsIgnoreCase(year)) {
                break;
            } else
                driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
*/

//driver.findElement(By.xpath("//a[contains(text(),'23')]")).click();


 List<WebElement> allDate=driver.findElements(By.xpath("//a[@class='ui-state-default']"));

        for(WebElement dt:allDate)
        {
            String selectDt=dt.getText();



            if(selectDt.equalsIgnoreCase(date))
            {
                dt.click();
            }
            }

Thread.sleep(1000);
        driver.close();
    }
}
