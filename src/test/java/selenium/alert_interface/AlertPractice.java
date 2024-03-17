package selenium.alert_interface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;

import java.time.Duration;

//public class AlertPractice {
  //  WebDriver driver;

 //   @BeforeMethod
   // public void initializeDriver() {
     //   driver = new ChromeDriver();
       // driver.get("https://sweetalert.js.org/");
    //    driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


  //  }
// @Test
  //  public void popUpText(){
      //click on preview
     // deal with popups,and get text from there and do the validation
     //click on another preview and do the same
   //  WebElement firstAlert= driver.findElement(By.xpath("//h5[contains(.,'Normal alert')]//following-sibling::button"));
 //    firstAlert.click();              //tesko da nadje ,jer imaju 2,pa trazis na gore da nadjes gde se razlikuju

   //  Alert alert=driver.switchTo().alert();
  //   String actualText= alert.getText();
  //   String expectedText="Oops, something went wrong";
   //  Assert.assertEquals(actualText,actualText);
   //  alert.accept();


  //   WebElement secondAlert= driver.findElement(By.xpath("//h5[contains(.,'SweetAlert')]//following-sibling::button"));
  //   secondAlert.click();

     //since we can do inspection on this pop,no needs to involved Alert

    // WebElement secondAlertMessage = driver.findElement(By.xpath("//div[@class='swal-modal']//div[contains(.,'Something went wrong!')]"));

   //  Assert.assertEquals(BrowserUtils.getText(secondAlertMessage),"Something went wrong","Faild");
   //  System.out.println("BrowserUtils.getText(secondAlertMessage) = " + BrowserUtils.getText(secondAlertMessage));
     //  da proverim sta printa kao text i vidis sta ej na konzoli
  //   WebElement okBtn = driver.findElement(By.xpath("//button[.='OK']"));
    // okBtn.click();
 //}



//}
public class AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void initializeDriver() {
        driver = new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("driver has been initialized");
    }

    @Test
    public void popUpTask() throws InterruptedException {

        WebElement firstAlert = driver.findElement(By.xpath("//h5[contains(.,'Normal alert')]//following-sibling::button"));
        firstAlert.click();
        Thread.sleep(3000);
        BrowserUtils.acceptAlert(driver);
        Alert alert = driver.switchTo().alert();

        //String actualText = alert.getText();
       // String expectedText = "Oops, something went wrong!";
       // Assert.assertEquals(actualText, expectedText, "Failed to validate JS Alert message");
       // alert.accept();
          // sa Brovers mozes   pa vezbas jer smo kreirali Alert methods

        WebElement secondAlert = driver.findElement(By.xpath("//h5[contains(.,'SweetAlert')]//following-sibling::button"));
        secondAlert.click();
        Thread.sleep(3000);
        WebElement secondAlertMessage = driver.findElement(By.xpath("//div[@class='swal-modal']//div[contains(.,'Something went wrong!')]"));
        Assert.assertEquals(BrowserUtils.getText(secondAlertMessage), "Something went wrong!", "Failed to validate regular alert message");

        WebElement okBtn = driver.findElement(By.xpath("//button[.='OK']"));
        okBtn.click();

    }



}