package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleLinks_16 {

    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //driver.findElement(By.linkText("Today's Deals")).click();
        //driver.findElement(By.partialLinkText("Today's Dea")).click();
        List <WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        /*for(WebElement link:allLinks)
        {
           String text=link.getText();
           System.out.println(text);

        }*/
        for(int i=0;i<allLinks.size();i++)
        {
            String text=allLinks.get(i).getText();
            System.out.println(text);
            //System.out.println(allLinks.get(i).getDomAttribute("href"));
            System.out.println(allLinks.get(i).getAttribute("href"));
        }



        Thread.sleep(5000);
        driver.close();

    }
}
