package selenium.alert_interface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;

import java.time.Duration;

public class AlertInterface {

    WebDriver driver; //da ne bi bio lokalan vec global

    @BeforeMethod
    public void initializeDriver() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Test                         //JS java script
    public void handleJSAlert() throws InterruptedException {

        WebElement firstAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        firstAlert.click(); //kad smo kliknuli,pojavio se popup koji se resava alertom
        Thread.sleep(3000);
           // How you deal with popups
        Alert alert=driver.switchTo().alert(); //alert is interface who is going to switch our driver there
                                               //on pops i do what needs( alert has onw methods-accept,getText..
        alert.accept(); //ce na pritisnuti ok i onda mozemo da nastavimo sa inspect

    //sad nam se pojavila recenica You successfully clicked an alert i lociramo je i radimo validaciju:

        WebElement successMsg=driver.findElement(By.cssSelector("#result"));
        Assert.assertEquals(BrowserUtils.getText(successMsg),"You successfully clicked an alert");



        WebElement secondAlert=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        secondAlert.click(); //kad smo kliknuli,izaso nam popup
        System.out.println("alert.getText() = " + alert.getText());//,pa sa njega uzimamo text
        alert.dismiss();                                           // i clic na cansel


        WebElement thirdElement=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        thirdElement.click();   //click i imamo popup gde treba da sendKyes i click
        BrowserUtils.sendKeysToAlert(driver,"test data "); //napisali na popup
        alert.accept();  //means click


    }

    @AfterMethod

    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }

}

