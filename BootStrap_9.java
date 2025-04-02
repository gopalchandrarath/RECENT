import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootStrap_9 {
    public static void main (String[] args) throws InterruptedException
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        //div[@class='drp1']//div[@class="class='"]
        driver.findElement(By.xpath("//div[@class='drp1']")).click();
        List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        System.out.println(products.size());
        for(WebElement p:products)
        {
            if(p.getText().equals("Deposits"))
            {
                p.click();
                break;
            }
        }
        driver.findElement(By.xpath("//div[@class='drp2']/div[@class='dropdown']")).click();

        List <WebElement> opt=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));

        for(WebElement p:opt)
        {
           if( p.getText().equals("Fixed Deposit"))
           {
               p.click();
           }
        }
        System.out.println(opt.size());
        Thread.sleep(6000);
        driver.close();
    }

}
