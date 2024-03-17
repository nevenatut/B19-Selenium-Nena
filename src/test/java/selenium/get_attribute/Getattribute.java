package selenium.get_attribute;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Getattribute {

    @Test
    public void TC_5(){

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.w3.org/TR/2019/NOTE-wai-aria-practices-1.1-20190814/examples/checkbox/checkbox-1/checkbox-1.html");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//div[@role='checkbox']"));

        for(WebElement checkbox : allCheckBoxes){
            if ( checkbox.getAttribute("aria-checked").equals("False")){
                checkbox.click();
            }


        }

    }



}
