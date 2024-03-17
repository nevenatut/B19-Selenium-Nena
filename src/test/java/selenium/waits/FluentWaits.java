package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;
import selenium.utils.DriverHelper;

import java.time.Duration;

public class FluentWaits {



    @Test
    public void testFluentWait(){


        WebDriver driver= DriverHelper.getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement element1 = driver.findElement(By.xpath("//button[.='Remove']"));
        element1.click();

     Wait<WebDriver> fluentWit=new FluentWait<>(driver).pollingEvery(Duration.ofSeconds(1)).withMessage("text on page").withTimeout(Duration.ofSeconds(10));

     WebElement goneText=fluentWit.until(mydriver ->driver.findElement(By.xpath("//p[@id='message']")));
        System.out.println(BrowserUtils.getText(goneText));
    }

    @Test
    public void fluenttest2(){

        WebDriver driver= DriverHelper.getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement enableBt = driver.findElement(By.xpath("//button[.='Enable']"));
        enableBt.click();

        Wait<WebDriver> fluentWait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(ElementClickInterceptedException.class);

        WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
        fluentWait.until(ExpectedConditions.elementToBeClickable(input)).sendKeys("test test");

    }
}
