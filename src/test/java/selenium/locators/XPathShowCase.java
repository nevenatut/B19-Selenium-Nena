package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathShowCase {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://the-internet.herokuapp.com/");
         WebElement abTest=driver.findElement(By.xpath("//a[@href='/abtest']"));
         abTest.click();

     //   WebElement text1= driver.findElement(By.xpath("//p"));
      //  System.out.println(text1.getText());//jer bi bio # da smo stavili samo text 1 u sout

        WebElement text=driver.findElement(By.xpath("/html/body/div[2]/div/div/p"));//absolute
        System.out.println(text.getText());   //this is same as with //p

        WebElement footerLink = driver.findElement(By.xpath("/html/body/div[3]/div/div/a"));
        footerLink.click();

    }
}
