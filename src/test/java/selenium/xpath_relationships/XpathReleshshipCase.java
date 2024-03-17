package selenium.xpath_relationships;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class XpathReleshshipCase {
  @Test
          public void relationship() {


      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      WebElement slider1 = driver.findElement(By.xpath("//div[@id='slider1']//div//input"));

      slider1.sendKeys(Keys.ARROW_RIGHT);// svaki put po 1
      // slider1.sendKeys(Keys.ARROW_RIGHT);
      //slider1.sendKeys(Keys.ARROW_RIGHT);
      // slider1.sendKeys(Keys.ARROW_RIGHT);

      WebElement outputText = driver.findElement(By.xpath("//output[@id='range']"));
      while (!outputText.getText().equals("96")) {
          slider1.sendKeys(Keys.ARROW_RIGHT);
      }
  }

      @Test
              public void slideItAll(){


          WebDriver driver=new ChromeDriver();
          driver.navigate().to("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


          List<WebElement> allSlides = driver.findElements(By.xpath("//input[@class='sp__range']"));
          List<WebElement> allText= driver.findElements(By.xpath("//output"));

          for (int i = 0; i < allText.size(); i++) {

              while (!allText.get(i).getText().equals("99")){
                  allSlides.get(i).sendKeys(Keys.ARROW_RIGHT);
              }

          }

      }


}
