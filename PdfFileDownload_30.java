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

public class PdfFileDownload_30 {

    public static void main(String args[]) throws InterruptedException {
        String location = System.getProperty("user.dir") + "\\Downloads\\";

        /* chrome

        HashMap preferences = new HashMap();
        //if pdf is opening as view mode then use below code 17 line. this is 16 line
        preferences.put("plugins.always_open_pdf_externally",true);
        preferences.put("download.default_directory", location);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        */

        //Edge
        HashMap preferences= new HashMap();
        preferences.put("plugins.always_open_pdf_externally",true);
        preferences.put("download.default_directory",location);

        EdgeOptions options= new EdgeOptions();
        options.setExperimentalOption("prefs",preferences);

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(options);

        /*FireFox
        //firefox need to check  and this is the line of code

        FirefoxProfile profile= new FirefoxProfile();
        profile.setPreference("pdfjs.disabled",true);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/pdf");

        profile.setPreference("browser.download.folderList",2);//0->desktop to download,1-Download,2-Desired Location
        // in case of 0 and 1 no need to mention location . but in 2 need to write below code
        profile.setPreference("browser.download.dir",location);

        FirefoxOptions option= new FirefoxOptions();
        WebDriver driver= new FirefoxDriver(option);


         */
        driver.get("https://www.filesampleshub.com/format/document/pdf");
        driver.findElement(By.xpath("(//a[contains(text(),'Download sample pdf file')])[1]")).click();

    }
}
