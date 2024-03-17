package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TaskPHP {

    /*

        Fill all the fields
        do the math
        Provide the answer into the field
        Click Submit afterwards
        quit your browser at the end

         */
    @Test
    public void FillInFields(){

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://phptravels.com/demo");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//for dynamically waiting for the
                                             //webpage to be load,it's wait for 10s,so if something is de ,late
                               //it is wait 10s,if there is nothing to wait,than it is not going to wait and waset

        WebElement name= driver.findElement(By.name("first_name"));
        name.sendKeys("Mico");

       WebElement lastName=driver.findElement(By.name("last_name"));
       lastName.sendKeys("Micic");
       //driver.findElement(By.name("last_name")).sendKeys("Micic"); if do not need to storage ,you can do like
       //this

        WebElement businessName = driver.findElement(By.name("business_name"));
        businessName.sendKeys("PRDo");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("test@tast");

        WebElement num1=driver.findElement(By.id("numb1")); //ovaj je bita to store,because you need to do something
        String number1=num1.getText();
        WebElement num2=driver.findElement(By.id("numb2"));
        String number2=num2.getText();
        //we need to do sum of number1 and number2,so we need to convert String to Int
        Integer answer= Integer.parseInt(number1) + Integer.parseInt(number2); //do math
        String realAnswer=String.valueOf(answer);       //and convert Int to String

        WebElement answerInPutField=driver.findElement(By.xpath("//input[@id='number']"));
        answerInPutField.sendKeys(realAnswer);


       // WebElement submit = driver.findElement(By.xpath("//button[@id='demo']"));nece da clic

      //  WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
       // submitBtn.click();

    }



}
