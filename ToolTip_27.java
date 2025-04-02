package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_27 {

    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);
        //toolTip is present Title of the webElement
        WebElement toolTip=driver.findElement(By.xpath("//input[@id='age']"));
        String msg=toolTip.getAttribute("title");
        System.out.println(msg);

        driver.close();



    }



}
