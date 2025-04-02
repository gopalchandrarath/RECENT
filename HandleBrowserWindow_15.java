package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindow_15 {

    public static void main(String[] args)throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


        //getWindowHandle
        String id=driver.getWindowHandle();
        System.out.println("Window Id is : "+id);
        Thread.sleep(5000);
        //getWindowHandles
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> allWindow=driver.getWindowHandles();
        /* First approach through Iterator
        Iterator<String> it=allWindow.iterator();
        String parentWindowId=it.next();
        String childWindowId=it.next();
        System.out.println("Parent Window Id : "+parentWindowId);
        System.out.println("Child Window Id : "+childWindowId); */

        //Second Approach through List/ArrayList collection

        List<String> eachWindowId= new ArrayList(allWindow);//converting set to list
        /*String ParentWindowId=eachWindowId.get(0);
        String ChildWindowId=eachWindowId.get(1);

        System.out.println("Parent_Window_Id : "+ParentWindowId);
        System.out.println("Child_Window_Id : "+ChildWindowId);

        driver.switchTo().window(ParentWindowId);
        System.out.println("Parent Window Title : "+driver.getTitle());
        driver.switchTo().window(ChildWindowId);
        System.out.println("Child Window Title : "+driver.getTitle());

        for(String windoId:eachWindowId)
        {
          String title= driver.switchTo().window(windoId).getTitle();
          System.out.println(title);
OrangeHRM
Human Resources Management Software | OrangeHRM
        } */

//If Specific browser window want to close
        for(String windowId:eachWindowId)
        {
            String title=driver.switchTo().window(windowId).getTitle();
            if(title.equals("Human Resources Management Software | OrangeHRM"))
            //if(title.equals("OrangeHRM"))
            {
                driver.close();
            }
        }


        Thread.sleep(5000);
        //driver.close(); // close single browser window which driver is pining
        //driver.quit();  //closes all browser window opened

    }
}
