package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask {
    public static void main(String[] args) {
     /*
     Manually click on Input Form Submit link
     Fill out all the imput fields
     Skip Country dropdown
     Click on submit button

      */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");

        driver.findElement(By.xpath("//input[@id='name']"));

        WebElement firstName=driver.findElement(By.xpath("//input[@id='name']"));
        firstName.sendKeys("nevena");


      WebElement putEmail=driver.findElement(By.xpath("//input[@id='inputEmail4']"));
       putEmail.sendKeys("test@test");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("123");


        WebElement company= driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("Mico");

       WebElement website=driver.findElement(By.xpath("//input[@id='websitename']"));
       website.sendKeys("Chicago");

       //WebElement submit=driver.findElement(By.xpath("(//button[conta"));


    }
}
