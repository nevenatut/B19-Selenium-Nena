package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice_1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
       driver.navigate().to("https://www.lambdatest.com/selenium-playground/ajax-form-submit-demo");
       driver.manage().window().maximize();

      WebElement inPutName= driver.findElement(By.xpath("//input[@id='title']"));
      inPutName.sendKeys("kkjj llll");

        WebElement inputMessage = driver.findElement(By.xpath("//textarea[@name='description']"));
        inputMessage.sendKeys("hi");


          // WebElement submitButton = driver.findElement(By.xpath("//div[@id='submit-control']"));//nije radilo
         //even it was unique,becauce it is long line and you never know if it pointed at submit,that's why
        //we take another
        WebElement submitButton= driver.findElement(By.id("submit-control"));
        System.out.println(submitButton.getText());

        WebElement submissionMessage=driver.findElement(By.id("submit-control"));
        System.out.println(submissionMessage.getText());




    }

}
