package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.HashMap;

public class WordFileDownload_30 {
    public static void main(String args[]) throws InterruptedException {
        String location= System.getProperty("user.dir")+"\\Downloads\\";
        //All the browsers are working fine. download in project need to check
        //for Chrome browser
        /*HashMap preferences= new HashMap();
        preferences.put("download.default_directory",location);

        ChromeOptions options= new ChromeOptions();
        options.setExperimentalOption("prefs",preferences);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);



        //For Edge browser

        HashMap preferences= new HashMap();
        preferences.put("download.default_directory",location);

        EdgeOptions options= new EdgeOptions();
        options.setExperimentalOption("prefs",preferences);

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(options);


        driver.get("https://www.filesampleshub.com/format/document/docx");
        driver.manage().window().maximize();


        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[1]//a[1]")).click();



        FirefoxProfile profile= new FirefoxProfile();
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/msword");//this is mime type need to check
        //mime type is present for Firefox site in this below link
        //https://developer.mozilla.org/en-US/docs/Web/HTTP/Guides/MIME_types/Common_types
        profile.setPreference("browser.download.folderList",2);//0->desktop to download,1-Download,2-Desired Location
        // in case of 0 and 1 no need to mention location . but in 2 need to write below code
        profile.setPreference("browser.download.dir",location);

        FirefoxOptions option= new FirefoxOptions();
        WebDriver driver= new FirefoxDriver(option);
        driver.get("https://www.filesampleshub.com/format/document/docx");
        driver.manage().window().maximize();


        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[1]//a[1]")).click();



        //driver.close();


         */

    }
}
