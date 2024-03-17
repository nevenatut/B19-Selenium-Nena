package selenium.select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;

import java.time.Duration;
import java.util.List;

public class SelectPractice {
 @Test
    public void selectTask(){


     WebDriver driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/");

     driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     List<WebElement> allElements = driver.findElements(By.xpath("//a"));
     for (int i = 0; i < allElements.size(); i++) {

         if(allElements.get(i).getText().equals("Dropdown")){
             allElements.get(i).click();
             break;
         }

     }
     String actualtitle = driver.getTitle();
     String expected = "The Internet";


     WebElement header= driver.findElement(By.tagName("h3"));

     String actualHeader=header.getText();
     String expectedHeader="Dropdown List";

     //Assert.assertEquals("");
     WebElement dropdown = driver.findElement(By.id("dropdown"));

     Select select=new Select(dropdown);
    List<WebElement> selectOption=select.getOptions();

    for (WebElement eachElementFromListOfWebelement : selectOption){

        if (eachElementFromListOfWebelement.getText().equals("Option2")){
            eachElementFromListOfWebelement.click();
        }





    }
      //Thread.sleep(3000);

 }




}
