package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenALinkInANewTab_27 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");


        //CTRL+ENTER
        //this is the process but bits not working need to check
        String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        /*WebElement link=driver.findElement(By.linkText("Register"));
        link.sendKeys(tab);*/
        driver.findElement(By.linkText("Register")).sendKeys(tab);
        driver.close();

    }
}
