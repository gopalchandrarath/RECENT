import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement_Displayed_4 {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        // Is displayed , is enabled
        WebElement ele=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Is Element Displayed Status :"+ele.isDisplayed());
        System.out.println("Is Element Selected Status :"+ele.isSelected());//R&D -false
        System.out.println("Is Element Enabled status :"+ele.isEnabled());

        //is selected

        WebElement Excellent= driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        WebElement Good= driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
        Excellent.click();
        System.out.println(Excellent.isSelected());//true
        System.out.println(Excellent.isDisplayed());//true-R&D
        System.out.println(Excellent.isEnabled());//true-R&D
        System.out.println(Good.isSelected());//false
        Good.click();
        //Good.clear();
        System.out.println("-----------");

        System.out.println(Excellent.isSelected());//false
        System.out.println(Excellent.isDisplayed());//true-R&D
        System.out.println(Excellent.isEnabled());//true-R&D
        System.out.println(Good.isSelected());//true



        driver.quit();


    }


}
