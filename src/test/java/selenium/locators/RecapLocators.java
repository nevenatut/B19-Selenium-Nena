package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class RecapLocators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();


        WebElement sliderLink = driver.findElement(By.linkText("Horizontal Slider"));
        sliderLink.click();

       // Thread.sleep(2000); it is not profesional to use,so do not tell that you use
        WebElement subHeader=driver.findElement(By.tagName("h4"));
        subHeader.getText().trim();//use trim da bi bio siguran
        String acutalSubHeader=subHeader.getText();
        String expectedSubHeader="Set the focus on the slider (by clicking on it) and use the arrow keys to move it right and left. Or click and drag the slider with your mouse. It will indicate the value of the slider to the right.";

        if(acutalSubHeader.equals(expectedSubHeader)){
            System.out.println("Pass");

            }else {
                System.out.println("Faild");
            }
      //  WebElement footerLink= driver.findElement(By.partialLinkText())

    }




}
