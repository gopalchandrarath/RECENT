import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GenericMethod_9 {

    public static void main (String[] args) throws InterruptedException
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        //div[@class='drp1']//div[@class="class='"]
        driver.findElement(By.xpath("//div[@class='drp1']")).click();
        List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        System.out.println(products.size());//Deposits
        selectByOptions(products,"Deposits");

        driver.findElement(By.xpath("//div[@class='drp2']/div[@class='dropdown']")).click();

        List <WebElement> opt=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
        //Fixed Deposit

        selectByOptions(opt,"Fixed Deposit");
        System.out.println(opt.size());
        Thread.sleep(6000);
        driver.close();
    }

    public static void selectByOptions(List <WebElement> products, String value){

        for(WebElement p:products)
        {
            if(p.getText().equals(value))
            {
                p.click();
                break;
            }
        }


    }


}
