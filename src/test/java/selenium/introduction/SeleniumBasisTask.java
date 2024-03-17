package selenium.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class SeleniumBasisTask {

    /*
    Create Driver objet,navigate to CodeFish
    Webpage ,get its title ,validate with if condition
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://codefish.com/");
        driver.getTitle();

        String actuallyTitle = driver.getTitle();
        String expectedTitle = "Codefish"; //tacno napisi dta se pojavljuje gore kao title

        if (actuallyTitle.equals(expectedTitle)) {

            System.out.println("pass");
        } else {
            System.out.println("not valid");
        }
        String pageSource = driver.getPageSource();

    }
}