package selenium.select_class;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SelectShowCase {
    @Test
    public void practiceSelect() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//


        driver.findElement(By.xpath("//a[contains(text(),'Select Dropdown List')]")).click();

        WebElement dropdownElement = driver.findElement(By.id("select-demo"));//on je i ovde isao sa xpath
        //here I storage everything what we have under select,so now I need to bring from one class(supported
        // by Selenium,blaa blaa:

        Select select = new Select(dropdownElement);   //he asking for constructor,so particular we give
        //dropdownElement to Select class to work with them
        //select.selectByValue("Saturday"); //Saturday

        select.selectByIndex(6);//start from 0,ali gledas sta sve ima ,jer ovde na 0 Please select

        select.selectByValue("Saturday");

        //select.getOptions(); uzimamo sve opcije i provucemo kroz loop
        List<WebElement> options = select.getOptions();


        for (int i = 0; i < options.size(); i++) {

            System.out.println(options.get(i).getText());


        }
    }
}