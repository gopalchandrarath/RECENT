package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_20 {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/ecosystem/");
        driver.manage().window().maximize();

        //1) How Many rows in a table
        int rows= driver.findElements(By.xpath("(//table[@class='table'])[1]/tbody/tr")).size();
        System.out.println("Number of rows in a table: "+rows);

        //2) How many columns in a table
        int columns= driver.findElements(By.xpath("(//table[@class='table'])[1]/thead/tr/th")).size();
        System.out.println("Number of columns : "+columns);

        //(//table[@class='table'])[1]/tbody/tr  --Absolute xpath
        //(//table[@class='table'])[1]//tr  --Relative Xpath

        //3) Retrieve specific row column data
        String text=driver.findElement(By.xpath("(//table[@class='table'])[1]/tbody/tr[2]/th")).getText();
        System.out.println("Text of the specific row and column is : "+text);

        //Retrieve all the data from the table
        //here th is there for 2nd and 3rd value . for 1st element its td .so need to give
        //that way . but mentioned format is the way for handle - Retrieve all the data from the table
        //if all the tag names are same
        for(int r=0;r<=rows;r++)
        {
            for (int c=0;c<=columns;c++)
            {
                String text1=driver.findElement(By.xpath("(//table[@class='table'])["+r+"]/tbody/tr["+c+"]/th")).getText();
                System.out.print(text1);
            }
            System.out.println();
        }

        //4) Print the language date and author of Rselenium

        for(int r=1;r<=rows;r++) {
            String text2 = driver.findElement(By.xpath("(//table[@class='table'])[" + r + "]/tbody/tr[1]/th")).getText();
            if (text2.equals("Rselenium"))
            {
                String languageDate = driver.findElement(By.xpath("(//table[@class='table'])[" + r + "]/tbody/tr[1]/th")).getText();
                String author = driver.findElement(By.xpath("(//table[@class='table'])[" + r + "]/tbody/tr[1]/th")).getText();
                System.out.println(languageDate+" "+author);
            }
        }




        Thread.sleep(5000);
        driver.close();
    }
}
