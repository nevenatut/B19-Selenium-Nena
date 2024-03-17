package selenium.com.luma.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.utils.BrowserUtils;
import selenium.utils.ConfigReader;
import selenium.utils.DriverHelper;

public class LumaBase {


    WebDriver driver;

    @BeforeMethod
    public void initializeDriver(){
        driver= DriverHelper.getDriver();
         driver.get("https://magento.softwaretestingboard.com/");


    }
    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException {
        Thread.sleep(3000);
        if (!result.isSuccess()){
            BrowserUtils.takeScreenshot(driver);
        }
        driver.quit();
    }


}
