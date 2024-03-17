package selenium.xpath_relationships;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class XpathReleship {

    /*

    Declare your test annotation
    Create your driver instance
    Navigate to codFish web App
    VValidate texts with assertion ,consider using
    is
     */


    @Test
    public void codeFish() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.navigate().to("https://codefish.io/");

        List<WebElement> allText = driver.findElements(By.xpath("//div[@class='gradient-block']//p"));
        for (int i = 0; i < allText.size(); i++) {
            Assert.assertTrue(allText.get(i).isDisplayed(), "Text is not display");
            System.out.println(allText.get(i).getText());

        }

    }

    @Test
    public void TC_02() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.navigate().to("https://www.lambdatest.com/selenium-playground/table-pagination-demo");
        driver.findElement(By.xpath("//a[contains(.,'Table Pagination')]")).click();

        WebElement maxRows = driver.findElement(By.id("maxRows"));

        Select select = new Select(maxRows);
        select.selectByVisibleText("Show all Rows");
        List<WebElement> firstNames = driver.findElements(By.xpath("//tr//td[2]"));
        List<WebElement> emails = driver.findElements(By.xpath("//tr//td[4]"));

        Map<String, String> data = new HashMap<>();

        for (int i = 0; i < data.size(); i++) {

            data.put(firstNames.get(i).getText(), emails.get(i).getText());

        }


    }

    @Test
    public void TC_03() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.navigate().to("https://www.lambdatest.com/selenium-playground/table-pagination-demo");
        driver.findElement(By.xpath("//a[contains(.,'Table Pagination')]")).click();
        WebElement maxRows = driver.findElement(By.id("maxRows"));
        Select select = new Select(maxRows);
        select.selectByVisibleText("Show all Rows");
        List<WebElement> lastNames = driver.findElements(By.xpath("//tr//td[3]"));
        List<WebElement> number = driver.findElements(By.xpath("//tr//td[5]"));


        Map<String, Integer> map= new HashMap<>();


      //  for (int i = 0; i < lastNames.size(); i++) {

        //    String name=firstNames;



        }
        //System.out.println(map);

    }




/*
map
key :first name and list name....value: email     Ronald.Lloyd=r.lloyd@randatmail.com
print all

 Homework for today, finish up until tomorrow's class
navigate to LambdaTest,
click on Table Pagination
Click on Show All Rows option from the dropdown
Store your data in the Map
Structure should be as follows: 'Roland.LLoyd=r.lloyd@randatmail.com'

 */


