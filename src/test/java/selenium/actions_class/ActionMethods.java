package selenium.actions_class;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;
import selenium.utils.DriverHelper;

public class ActionMethods {

    WebDriver driver;

    @BeforeMethod
    public void initialize() {

        driver = DriverHelper.getDriver();

    }

    @Test
    public void conTextClick() {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement conTextMenu = driver.findElement(By.linkText("Context Menu"));
        conTextMenu.click();

        WebElement hotSpot = driver.findElement(By.cssSelector("#hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform(); // right click with  mouse  ...mora da ima perform() uuveeek




    }

    @Test
    public void contextClick2() throws InterruptedException {
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickMe = driver.findElement(By.xpath("//span[.='right click me']"));

        // right click with actions on the web
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickMe).perform();
        Thread.sleep(2000);

        //click on delete which is a webElement
        WebElement delete = driver.findElement(By.xpath("//span[.='Delete']"));
        delete.click();
        Thread.sleep(2000);

        //getting text from JS alert
        String alertText = BrowserUtils.alertGetText(driver);
        System.out.println(alertText);

        //accepting alert
        BrowserUtils.acceptAlert(driver);

    }

    @Test
    public void doubleClick() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickBtn).build().perform();
        Thread.sleep(2000);
        System.out.println("BrowserUtils.alertGetText(driver) = " + BrowserUtils.alertGetText(driver));
        BrowserUtils.acceptAlert(driver);

    }

        @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}