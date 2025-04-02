import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_1_2_3 {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
        driver.manage().window().maximize();
        String url =driver.getCurrentUrl();
        String Title=driver.getTitle();
        String pgSrc= driver.getPageSource();
        System.out.println("This is the current URL : "+url);
        System.out.println("This is the Title : "+Title);
        //System.out.println("This is the Page Source :"+pgSrc);
        driver.close();


        //driver.close();
        //driver.quit();
    }
}
