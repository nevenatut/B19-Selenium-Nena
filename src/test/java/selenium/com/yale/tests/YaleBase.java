package selenium.com.yale.tests;

import dev.failsafe.spi.ExecutionResult;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.utils.BrowserUtils;
import selenium.utils.ConfigReader;
import selenium.utils.DriverHelper;

public class YaleBase{

    WebDriver driver;

    @BeforeMethod
    public void initializeDriver(){
        driver= DriverHelper.getDriver();
      //  driver.get("https://www.yale.edu/"); we put url in configurator.properties i sad mozes ovako -->
        driver.get(ConfigReader.readProperty("yaleURL"));

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

//sluzi da YaleSkript extend from this class i onda nam ej tamo samo pregledno testiranje