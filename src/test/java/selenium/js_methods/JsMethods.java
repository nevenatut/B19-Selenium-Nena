package selenium.js_methods;

import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.utils.DriverHelper;

public class JsMethods {

     WebDriver driver;

     @BeforeMethod
    public void initialize(){
         driver= DriverHelper.getDriver();
     }

    @Test
    public void getTitleWithJS(){
    driver.get("https://www.amazon.com/");
                                  //Casting our driver into JavascriptExecutor,so now js is acting as a  driver
        JavascriptExecutor js = (JavascriptExecutor) driver;

       String title= js.executeScript("return document.title").toString();
        System.out.println(title + " title from Amazon using JS Methods");



    }

@Test
    public void  clickWithJS(){
     driver.get("http://codefish.io");
    WebElement aboutUs=driver.findElement(By.xpath("//button[.='About us']"));
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].click()",aboutUs);




}
@Test
    public void scrollInToView(){
         driver.get("http://codefish.io");

         WebElement facebookLink=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/codefish.camp']"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
 js.executeScript("arguments[0].scrollIntoView(true)",facebookLink);

}
@Test    //scrolling with JS and Point class from Selenuim
    public void scrollWithPointJs(){
    driver.get("https://the-internet.herokuapp.com/");
    WebElement footerLink=driver.findElement(By.linkText("Elemental Selenium"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    Point point=footerLink.getLocation(); //gets location and store in point (Point interface)
    int x = point.getX();
    int y = point.getY();
  js.executeScript("window.scrollTo(" + x + "," + y + ")");

}


@Test
    public void testJSMethods(){
         driver.get("https://www.yale.edu/");
         WebElement contatUs=driver.findElement(By.partialLinkText("Contact"));
    JavascriptExecutor js= (JavascriptExecutor) driver;

    js.executeScript("arguments[0].scrollIntoView(true)",contatUs);

    js.executeScript("arguments[0].click()",contatUs);



       WebElement webEditorLink=driver.findElement(By.xpath("//a[@class='footer_legal_contact']"));

    Point point=webEditorLink.getLocation(); //gets location and store in point
    int xCoordinate = point.getX(); //gets horizontal axis from the edge of the screen to the WebElement
    int yCoordinate = point.getY();//      vertical  axis
    js.executeScript("window.scrollTo(" + xCoordinate + "," + yCoordinate + ")");


}



}

