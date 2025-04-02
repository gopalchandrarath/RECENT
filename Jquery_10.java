import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Jquery_10 {
    public static void main(String[] args)
    {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().window().maximize();
     driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
     driver.findElement(By.xpath("(//span[@class='comboTreeArrowBtnImg'])[1]")).click();
     //selectChoiceValue(driver, "choice 1");
     //selectChoiceValue(driver, "choice 1", "choice 6 2", "choice 3");
     selectChoiceValue(driver, "All");
     //String... is like string [] here . if we will put string [] it cant handle selectChoiceValue(driver, "choice 1", "choice 2", "choice 3")
     //but String... will handle selectChoiceValue(driver, "choice 1", "choice 2", "choice 3")


     //driver.close();
    }
    public static void selectChoiceValue(WebDriver driver, String... value)
    {
     List<WebElement> choiceList= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

     if(!value[0].equalsIgnoreCase("all"))
     {
      for(WebElement item:choiceList)
      {
          String text=item.getText();

          for(String val:value)
          {
              if(text.equalsIgnoreCase(val))
              {
                  item.click();
                  break;
              }
          }
      }

     }
     else {
        try
        {
            for(WebElement item:choiceList)
            {
                item.click();

            }
        }
        catch(Exception e)
        {

        }


     }








    }
}
