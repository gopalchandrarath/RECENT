package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame_18 {
/*Normally frames are used for horizontally and vertically splitting of the screen and this is
part of the page .
but Iframes are  used to insert content from other sources
means Iframes having some content coming from different source
This are the ways we can write code to handle the frame
driver.switchTo().frame(name of the frame/Id of the frame)
driver.switchTo().frame(WebElement)
driver.switchTo().frame(0) //index
driver.switchTo().parentFrame(); //it will go to parent frame
driver.switchTo().defaultContent();// it will go to main page
sometimes we can see in webElement iframe,frame,form



 */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        Thread.sleep(5000);

        //Exact website is not there below are the way to handle iframe
        // 1st frame
        driver.switchTo().frame("globalSqa"); //name of the frame
        driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
        driver.switchTo().defaultContent();
        // 2nd frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_1']"))); //webElement oof the frame
        driver.findElement(By.xpath("(//button[@id='background_exit_dc'])[1]")).click();
        driver.switchTo().defaultContent();
        //3rd Frame
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']"))); //webElement oof the frame
        driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//div[@class='information closable']")).click();


        Thread.sleep(5000);
        driver.close();
    }
}
