package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class NinjaTest {


    @Test
    public void createUser(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nena");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dada");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@test");
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("77397646");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("3472!");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("3472");

        List<WebElement> subscribe = driver.findElements(By.xpath("//input[@name='newsletter']"));

      for(WebElement element: subscribe){

          if(element.getText().equals("no")){
              element.click();

          }

      }




    }





    }



