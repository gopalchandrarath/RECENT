package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopUpNotification_17 {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions option= new ChromeOptions();
        option.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(option);

        // for more details see this link
        // https://stackoverflow.com/questions/38684175/how-to-click-allow-on-show-notifications-popup-using-selenium-webdriver
        // need to check on permission based websites for more validations
        driver.get("https://www.browserstack.com/docs/automate/selenium/handle-permission-pop-ups");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//img[@class='fw-modal-container__header-close-icon']")).click();
        Thread.sleep(5000);
        driver.close();
    }
    }
