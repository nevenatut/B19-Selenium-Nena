package selenium.com.sause_lab.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.com.sause_lab.pages.LoginPage;

public class SauceLabTest extends SauceBase {

    @DataProvider(name = "dataForSauceLab")
    public Object[][] getData() {

        return new Object[][]{
                //username| password| error message
                {"test", "12345", "Epic sadface: Username and password do not match any user in this service"},  //each of these is treated as a separate test case
                {"!@##$", "!@#@#$@#", "Epic sadface: Username and password do not match any user in this service"}, //
                {"123234", "!@#@#", "Epic sadface: Username and password do not match any user in this service"}, //
                {"legitLogin", "   ", "Epic sadface: Username and password do not match any user in this service"} //
        };
    }

    //each of these is treated as a separate test case

    //   DataProvider - provided by TestNG

    @Test(dataProvider = "dataForSauceLab")
    public void testLoginFunctionality(String username, String password, String errorMessage) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunctionality(username, password);
        String actualErrorMsg = loginPage.errorMsg();
        //String expectedErrorMsg = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualErrorMsg, errorMessage);



    }

}

       /*

        @Test
    public void testLoginFunctionality() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunctionality(username:"test", password:"Qhjk");
        String actualErrorMsg = loginPage.errorMsg();
        String expectedErrorMsg = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualErrorMsg, errorMessage);

__________________________________________________________________________________________
    // loginPage.username.sendKeys();
 you can make WebElement in page Class to be public -> public   @FindBy(css = "#user-name")
                                                                 WebElement username;
 so you can call them like this and send them keys,
but it will be huge line of code if you have bunced of them that is way is better to use Data Provider

        */











