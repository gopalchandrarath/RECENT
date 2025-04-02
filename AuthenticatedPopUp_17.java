package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp_17 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //for authenticated popup we need to pass username and password in url itself.
        // here username is admin and password also admin
        //https://admin:admin@url
        // the syntax is https://admin:admin@the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");




        Thread.sleep(5000);
        driver.close();

    }
}
