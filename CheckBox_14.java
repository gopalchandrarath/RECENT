package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox_14 {
    public static void main(String[] args) throws InterruptedException
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        /* 1)to select single checkbox
        WebElement singleCheckBox=driver.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'Sunday')]"));
        singleCheckBox.click(); */

        // 2)To select multiple checkbox
        //below 2 line of code will select 1st match element
        //WebElement multipleCheckBox=driver.findElement(By.xpath("//label[@class='form-check-label' and contains(text(),'day')]"));
       // multipleCheckBox.click();

       List<WebElement> multipleCheckBox=driver.findElements(By.xpath("//label[@class='form-check-label' and contains(text(),'day')]"));
       System.out.println(multipleCheckBox.size());

       /*for(WebElement option:multipleCheckBox)
       {
           option.click();
       } */

       /* for(int i=0;i<multipleCheckBox.size();i++)
        {
            multipleCheckBox.get(i).click();

        } */


        /* 3) To select checkBoxes as choice
         here need to select saturday and sunday

        for(WebElement option:multipleCheckBox)
        {
            //String value=option.getAttribute("id");
            String value=option.getText();

            if(value.equals("Saturday") || value.equals("Sunday"))
            {
               option.click();
            }


        } */

        /* 4) To Select last 3 checkboxes
        Total no. of checkBoxes-no. of check boxes you want to select = starting index of checkbox
  for(int i=multipleCheckBox.size()-3;i<multipleCheckBox.size();i++)

  {
      multipleCheckBox.get(i).click();
  }
          */
// 5) To Select first 2 checkboxes

        for(int i=0;i<multipleCheckBox.size();i++)
        {
           if(i<2)
           {
               multipleCheckBox.get(i).click();
           }

        }
        Thread.sleep(5000);
        driver.close();


    }
}
