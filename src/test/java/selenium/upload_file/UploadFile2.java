package selenium.upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;

import java.time.Duration;

public class UploadFile2 {
    WebDriver driver; //da ne bi bio lokalan vec global to be avelable to evry test in this class
    @BeforeMethod
    public void initializeDriver(){
        driver=new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }
    @Test
    public void uploadFile2() throws InterruptedException {
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Nena");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Dabic");

        WebElement gender = driver.findElement(By.id("sex-1"));
        gender.click();

        WebElement yearOfExperience= driver.findElement(By.id("exp-6"));
        yearOfExperience.click();

        Thread.sleep(3000);

        WebElement dataPicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
        dataPicker.sendKeys("12/12/2023", Keys.ARROW_DOWN);

       // WebElement automation = driver.findElement(By.cssSelector("profession-1"));
       // automation.click();??????????????????

       Thread.sleep(4000);
        WebElement contains = driver.findElement(By.cssSelector("#continents"));
        BrowserUtils.selectBy(contains,"North America","visibleText");

        WebElement seleniumCommands = driver.findElement(By.cssSelector("#selenium_commands"));
        BrowserUtils.selectBy(seleniumCommands,"WebElement Commands","visibleText");



        WebElement uploadBtn = driver.findElement(By.cssSelector("#photo"));
        uploadBtn.sendKeys("C:\\Users\\ntutu\\IdeaProjects\\B19-Selenium\\src\\test\\resources\\testData\\tom and jerry.jpeg");


    }
  @Test
   public void validateTitle(){
    //  String actualTitle = BrowserUtils.getTitle(driver);
    //  System.out.println(actualTitle); probali da vidimo sta cemo dobiti kao titile na konzoli ,ali nije bilo nista

      //posto nije moglo,ovde radimo validaciju url
      String actualURL=driver.getCurrentUrl();
      String expectedUrl="https://www.techlistic.com/p/selenium-practice-form.html";
      Assert.assertEquals(actualURL,expectedUrl);



        WebElement header1=driver.findElement(By.xpath("//h3[.='Demo Automation Practice Form']"));
        WebElement header2=driver.findElement(By.xpath("//h2[.='AUTOMATION PRACTICE FORM']"));

        Assert.assertEquals(BrowserUtils.getText(header1),"Demo Automation Practice Form");
        Assert.assertEquals(BrowserUtils.getText(header2),"AUTOMATION PRACTICE FORM");




  }




//   }


   @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
     driver.quit();

    }




}
