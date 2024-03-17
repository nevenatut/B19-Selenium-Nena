package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;

import java.time.Duration;
import java.util.List;

public class TestDairy {

    @Test

    public void fillInDairy(){

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           /*
           click on selenium,using if condition
           click on Java
           unclick on Rest api
           slick on Test Diary....get text and validate
           go back
           Click on Test Dairy Selenium Learning...get text selenium,validate
           go back
           choose  Yellow Shirt    Red Skirt
           fill out Name,email,message ....send
           validate successfully message

            */
        WebElement seleniumCheckBox = driver.findElement(By.cssSelector("#seleniumbox"));

       // if(!seleniumCheckBox.isSelected()){
            seleniumCheckBox.click();
       // }                                this is ok,but we can do all in one=====>

        WebElement selectJava = driver.findElement(By.cssSelector("#java1"));

        WebElement restApiCheckbox=driver.findElement(By.cssSelector("#restapibox"));

        if(!seleniumCheckBox.isSelected() && ! selectJava.isSelected() && restApiCheckbox.isSelected()){
            seleniumCheckBox.click();
            selectJava.click();
            restApiCheckbox.click();

        }

        List<WebElement> hyperLinks = driver.findElements(By.xpath("//div[@id='header']//a[contains(text(),'Test Diary')]"));
        //from parent to child that we need ,but it gives us 1 of 2,both we need,so you can you use loop to take
        //one by one or hyperLinks.get() and with index o it gives you the first one
        hyperLinks.get(0).click();
        WebElement testDiaryHeader = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(BrowserUtils.getText(testDiaryHeader), "Test Diary");
        driver.navigate().back();
        // handling StaleElementReferenceException
        hyperLinks = driver.findElements(By.xpath("//div[@id='header']//a[contains(text(),'Test Diary')]"));
        hyperLinks.get(1).click();

        WebElement seleniumHeader = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(BrowserUtils.getText(seleniumHeader), "Selenium");
        driver.navigate().back();



        WebElement inputName = driver.findElement(By.name("your-name"));
        inputName.sendKeys("Nena");

        WebElement inputEmail = driver.findElement(By.name("your-email"));
        inputEmail.sendKeys("test@test.com");

        WebElement inputSubject = driver.findElement(By.name("your-subject"));
        inputSubject.sendKeys("Subject of my message");

        WebElement inputMessage = driver.findElement(By.name("your-message"));
        inputMessage.sendKeys("My Message goes here please read and reply!");

        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        submitBtn.click();

        //WebElement successMessage = driver.findElement(By.xpath("//input[@type='submit']//..//following-sibling::div"));
        //Assert.assertEquals(BrowserUtils.getText(successMessage), "Your message was sent successfully. Thanks.");




    }






}
