package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasics {

    /*
    Locator in Selenium are :

     basic locators :TagName ,name ,Classname.LinkText , PartialLinkText

    The above-mentioned locator can be used to locate webElement in the web page

    Important: In order to use locators , they must be present and be unique  in the dom structure
               ---  if it is not unique wu will save as driver.findElements
               checking if is unique->click something on dom->ctrl+F-->down you can write what tag you are
               looking at.It give you information how many do you have,so 1of3,1of5,and when is 1 of 1->it
               is unique


     */

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/ntutu/OneDrive/Desktop/Batch19/B19FirstHTML.html");
        driver.manage().window().minimize();

             //LOCATOR   By. tagName

        driver.findElement(By.tagName("h1")); //method to find ELEMENT BY using the tagName

        WebElement text=driver.findElement(By.tagName("h1")); // we store tagName in WebElement
       //WebElement is interface who  is going to store all data that coming from webpage

      //  System.out.println(text); //hashcode
     //now,WebElement has own methods   text.getText

        String actualText= text.getText();

        String expectedText="I love coding";//comes from you PO  BA,your company

     if (actualText.equals(expectedText)){
      System.out.println("pass");

     }else{
         System.out.println("fail");
      }

             //LOCATOR BY.linkText


    //WebElement element= driver.findElement(By.linkText(" ");on Dom we find where is Click here for help
    // and double click on that,copy =>means we pick up everything and past in  By.linkText("Click here for help")

        WebElement clickHereLink=driver.findElement(By.linkText("Click here for help"));

      clickHereLink.click(); //so it going to show what happend when we click on that link

       // By.partialLinkText() will specify only one part,exmp. Click here

    }



}
