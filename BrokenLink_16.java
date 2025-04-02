package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLink_16 {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        //how to find brokenlink
        //Broken link is something which does not have any target page
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        int broken_link =0;
        for(WebElement link:allLinks)
        {
            String url=link.getAttribute("href");
            if(url==null || url.isEmpty())
            {
                System.out.println("URL is Empty");
                continue;

            }
            //Here we are converting string formatted url to actual url

            URL linkUrl= new URL(url);

            try {
                HttpURLConnection con=(HttpURLConnection)linkUrl.openConnection();
                if(con.getResponseCode()>400)
                {
                    System.out.println(con.getResponseCode()+url+ " Is Broken link");
                    broken_link++;

                }

                else {
                    System.out.println(con.getResponseCode()+url+"Is not Broken Link");
                }
            } catch (Exception e) {

            }


        }
        System.out.println("Total no. of broken Links are : "+broken_link);

        Thread.sleep(5000);
        driver.close();
    }
}
