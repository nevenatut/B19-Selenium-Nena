package selenium.xpath_relationships;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class XpathRelationShipHomework {

    /*

    Homework for today, finish up until tomorrow's class
navigate to LambdaTest,
click on Table Pagination
Click on Show All Rows option from the dropdown
Store your data in the Map
Structure should be as follows: 'Roland.LLoyd=r.lloyd@randatmail.com'


     */

    @Test
    public void homeWork(){

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement table = driver.findElement(By.xpath("//a[contains(text(),'Table Pagination')]"));
        table.click();

        WebElement maxRows = driver.findElement(By.id("maxRows"));

        Select select=new Select(maxRows);
        select.selectByVisibleText("Show ALL Rows");

        List<WebElement> names = driver.findElements(By.xpath("//tr/td[2]"));
        List<WebElement> lastNames = driver.findElements(By.xpath("//tr/td[3]"));
        List<WebElement> emails= driver.findElements(By.xpath("//tr/td[4]"));

       Map<String,String> personalInformation=new HashMap<>();


        for (int i = 0; i < names.size(); i++) {

            String name=names.get(i).getText();
            String lastName=lastNames.get(i).getText();
            String email=emails.get(i).getText();

            personalInformation.put(name.concat(".").concat(lastName),email);


        }

        System.out.println(personalInformation);

    }





}
