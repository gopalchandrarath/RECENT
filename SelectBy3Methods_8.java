package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class SelectBy3Methods_8  {
static WebDriver driver;
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        //div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select
        //(//select)[1]
        //select
        WebElement country=driver.findElement(By.xpath("//select"));
        Select sle=new Select(country);
        sle.selectByVisibleText("Australia");
        sle.selectByIndex(1);
        sle.selectByValue("KHM");
        //selecting options from drop down without using methods
        List <WebElement> opt=sle.getOptions();
        for(WebElement options:opt)
        {
            if (options.getText().equals("China"))
            {
                options.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.quit();
        */

        // for multiple dropdown we will create a generic method

        driver.get("https://www.orangehrm.com/en/book-a-free-demo");
        WebElement drop1=driver.findElement(By.id("Form_getForm_Country"));
        selectTheDropdown(drop1,"Albania");
        //Select sel1=new Select(drop1);
        //sel1.selectByIndex(3);
        //sel1.selectByVisibleText("Albania  ");
        WebElement drop2=driver.findElement(By.id("Form_getForm_NoOfEmployees"));
       // Select sel2=new Select(drop2);
        //sel2.selectByIndex(5);
       // sel2.selectByVisibleText("11 - 50  ");11 - 50
        selectTheDropdown(drop2,"11 - 50");



        }

    public static void selectTheDropdown(WebElement ele1,String value1) {
        Select sel = new Select(ele1);
        List<WebElement> ele = sel.getOptions();
        for (WebElement str : ele) {
            if (str.getText().equals(value1)) {
                str.click();
                break;
            }
        }

        //driver.close();


    }}



