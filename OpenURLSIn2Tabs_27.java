package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLSIn2Tabs_27 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //selenium 4 onwards this feature available
        //driver.switchTo().newWindow(WindowType.TAB);
        // to open 2 browser window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.opencart.com/");

        //driver.close();
    }
}
