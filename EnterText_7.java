package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText_7 {
    public static void main(String[] args)
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/");
        WebElement user_name =driver.findElement(By.id("Email"));
        //user_name.clear();
        //user_name.sendKeys("admin@gmail.com");
        // capturing text from input box
        String val=user_name.getAttribute("value");
        //String val=user_name.getDomAttribute("value");
        String id=user_name.getDomAttribute("id");
        //if inner text present in the web element, and we want to print that then we can try .getText()
        //System.out.println(user_name.getText());
        WebElement msg=driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        System.out.println(val);
        System.out.println(id);
        System.out.println(msg.getText());
        driver.quit();






    }
}
