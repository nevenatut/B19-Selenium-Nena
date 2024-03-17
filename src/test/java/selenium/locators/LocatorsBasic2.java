package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasic2 {
    public static void main(String[] args) {

        //LOCATORS    By.id


        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/ntutu/OneDrive/Desktop/Batch19/Inputforms.html");
        driver.manage().window().minimize();

        driver.findElement(By.id("fname"));
        WebElement firstName= driver.findElement(By.id("fname"));
        firstName.sendKeys("Bruce"); //now shoud be sent Bruce in web site and see there


      //  firstName.sendKeys("Bruce" );
        WebElement lastName=driver.findElement(By.name("lname"));
        lastName.sendKeys("Lee");//we can use here sendKey because we have on dom on this line input
        //or do like this
        driver.findElement(By.name("lname")).sendKeys("Lee");// you can do like this,but you can not
                                        //store since sendKeys has void return type


        WebElement bdata= driver.findElement(By.id("bdate"));
        bdata.sendKeys("01/04/2022");



        WebElement emailUser = driver.findElement(By.id("email"));
        emailUser.sendKeys("nevena.dabic@yahoo.com");

        WebElement quantity = driver.findElement(By.id("quantity"));
        quantity.sendKeys("8");

        WebElement title = driver.findElement(By.id("Dr."));
        title.click();//because you do not where to sand just to click

        WebElement stateName =  driver.findElement(By.id("state"));
        stateName.sendKeys("Illinois");

        WebElement textArea = driver.findElement(By.tagName("textarea"));
        textArea.sendKeys("Hello");



       WebElement partialLinkText = driver.findElement(By.partialLinkText("click"));
        partialLinkText.click();

       WebElement clickHere = driver.findElement(By.linkText("click here"));
       clickHere.click();

    }
}
