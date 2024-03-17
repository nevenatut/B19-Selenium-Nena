package selenium.upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.utils.BrowserUtils;

import java.time.Duration;

public class UploadFile {


    @Test
    public void TC_6() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("C:\\Users\\ntutu\\IdeaProjects\\B19-Selenium\\src\\test\\resources\\testData\\tom and jerry.jpeg");
        //we provide the location where we save,ods u file na tom i jerry i desni klik pa na Properties da
        //prekopiras lokaciju "C:\\Users\\ntutu\\OneDrive\\Desktop\\Batch19\\tom and jerry.jpeg,ali
        //sam posle uvela sliku u svoj framework,resources sam stavila iz main u test i to pod new directory kad
        //kliknes,kopirsas sliku,onda tu kliknes na copy path reference i stavis gore

        Thread.sleep(3000);
        WebElement fileSubmitBtn = driver.findElement(By.id("file-submit"));
        fileSubmitBtn.click();

        WebElement successMessage = driver.findElement(By.tagName("h3"));
        String actualSuccessMessage = BrowserUtils.getText(successMessage);
        String expectedSuccessMessage = "File Uploaded!"  ;

        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Failed to validate success message for file upload");

        WebElement fileNameText = driver.findElement(By.cssSelector("div[id='uploaded-files']"));

        String actualFileName = BrowserUtils.getText(fileNameText);
        String expectedFileName = "tom and jerry.jpeg";

        Assert.assertEquals(actualFileName, expectedFileName, "Failed to validate file name text after upload");




    }










    }




