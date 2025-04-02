package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Cookies_29 {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        /*Cookies are small text files that websites store on your computer or device to remember information
         about your visit, making it easier to revisit the site and personalize your experience.
        below are the methods available
        driver.manage().getCookies();//Return the list of all cookies
        driver.manage().addCookies(arg0);//Create and add the cookie
        driver.manage().deleteCookie(arg0);//Delete Specific cookie
        driver.manage().deleteCookieNamed(arg0);// Delete specific cookie according to name
        driver.manage().deleteAllCookies();//Delete all cookies
         */

        //how to capture cookies from browser
        Set <Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies.size());
        //how to print cookies from browser
        for(Cookie cookie:cookies)
        {
            System.out.println(cookie.getName()+" : "+cookie.getValue());
        }
        //how to add cookie to the browser

        Cookie cookie=new Cookie("O2GCR","Pass123");
        driver.manage().addCookie(cookie);
        Set <Cookie> cookies2=driver.manage().getCookies();
        System.out.println(cookies2.size());
        //how to print cookies from browser
        for(Cookie cookie2:cookies2)
        {
            System.out.println(cookie2.getName()+" : "+cookie2.getValue());
        }

        //how to delete specific cookie from browser
        //driver.manage().deleteCookie(cookie);
        driver.manage().deleteCookieNamed("O2GCR");
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());
        //How to delete all the cookies from browser
        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());



      driver.close();
    }
}
