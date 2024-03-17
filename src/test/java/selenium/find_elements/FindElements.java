package selenium.find_elements;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindElements {

    //we do not use main method any more ,instand

    @Test(priority = 3)
     public void TC_01(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElements(By.xpath("//a"));

        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

        // allLinks.get(0);//daje samo prvo a i to kao webElement,pa da bi dao # ako sout,zato-->
        // allLinks.get(0).getText();
        // allLinks.get(0).click();//since this is WebElement who was on List,I can put . after and pick up elements method
        // System.out.println("allLinks.get(0).getText()"); //daje nam samo prvi link(prvo a)


       // for (int i = 1; i < allLinks.size(); i++) {// fori i enter da dobijes konstrukciju za loop
         //   if(allLinks.get(i))
          //  allLinks.get(i).click();
          //  driver.navigate().back(); //da se vrati nazad i ponovo obrne krug


        List<String> lessThan10= new ArrayList<>();

        for(int i=0 ; i< allLinks.size(); i++){

            if(allLinks.get(i).getText().length()<10);

        }

        System.out.println(lessThan10);



    }
   @Test (priority = 1)
    public void TC_2(){

       System.out.println("test 2");
   }
   @Test  (priority = 2)
    public void TC_3(){

       System.out.println("test 3");
   }



      /*
      get all text from list of links
      store the ones that their length  is less than 10
       */
        //    List<WebElement> allLinks=driver.findElements(By.xpath())

        //  }

    }


