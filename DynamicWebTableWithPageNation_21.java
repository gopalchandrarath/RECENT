package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicWebTableWithPageNation_21 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/ecosystem/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/index.php?route=account/login");
        //this website is not working so here the line of code format is there
        //but not exact webElement

        //login process
        WebElement userName=driver.findElement(By.id(""));
        userName.clear();
        userName.sendKeys("demo");

        WebElement passWord=driver.findElement(By.id(""));
        passWord.clear();
        passWord.sendKeys("demo");

        WebElement submit=driver.findElement(By.xpath(""));
        submit.click();

        //sales and order menu need to click

        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();

        //1)to find total no. of pages in table need to inspect the text present in button
        //of the page, there its mentioned total page

        String text=driver.findElement(By.xpath("")).getText();
        System.out.println(text);//showing 1 to 20 of 8511 (426 pages)
        // here we want 426 so
        //text.indexOf("(")
        //text.indexOf("pages")
        int total_pages=Integer.valueOf(text.substring(text.indexOf("("))+1,text.indexOf("pages")-1);
        //here we are adding 1 due to index start from 0 and -1 due to space
        System.out.println(total_pages);
        //2)How many rows exist present in each page
        for(int p=1;p<=total_pages;p++)
        {
            WebElement active_page=driver.findElement(By.xpath("//ul[@class='pageNation']//li//span"));
            //under class pageNation active elements are span tag other are anchor a tag
            System.out.println(active_page.getText());
            active_page.click();

            //here we are getting total no. of rows in that active page

            int rows=driver.findElements((By.xpath(""))).size();
            System.out.println(rows);
            // here we want to click on text page so next page will be active and tag
            // will span and loop will continue



            //3) Read all the rows and column from each page

            for(int r=1;r<rows;r++)
            {
                String cloumn1=driver.findElement(By.xpath("tr/td[1]")).getText();
                String cloumn2=driver.findElement(By.xpath("tr/td[2]")).getText();
                String cloumn3=driver.findElement(By.xpath("tr/td[3]")).getText();

                //if we want to print specific data
                if(cloumn3.equals("Pending")) {
                    System.out.println(cloumn1 + " " + cloumn2 + " " + cloumn3);
                }

                String pageNo=Integer.toString(p+1);
            driver.findElement(By.xpath("text()='"+pageNo+"')")).click();


    }
        }






        Thread.sleep(5000);
        driver.close();
    }
}
