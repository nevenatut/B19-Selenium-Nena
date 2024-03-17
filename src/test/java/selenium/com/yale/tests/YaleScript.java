package selenium.com.yale.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.com.yale.pages.ContactUsPage;
import selenium.com.yale.pages.WebEditorsPage;
import selenium.com.yale.pages.YaleMainPage;
import selenium.utils.DriverHelper;

public class YaleScript extends YaleBase {

    /*
    kad sam uvela da je YaleScript extends YaleBase--> obrisala sam @BeforeMethod and @AfterMethod
     */
  //  WebDriver driver;

 //   @BeforeMethod
  //  public void initializeDrive(){

 //       driver= DriverHelper.getDriver();
 //       driver.get("https://www.yale.edu/");
 //   }


    //u @Test  kreiram method i tu kreiram object iz svih stranica koje mi trebaju ,a preko tih objekata
    // zovem methode koje sam kreirala in Class odakle su mi i objekti

    @Test
    public void TC_01(){
    YaleMainPage mainPage=new YaleMainPage(driver); //create Object to make connection with Class YaleMainPage
                             //and provide (driver),jer je u YaleMainPage costructor koji ti to trazi
    ContactUsPage contactUsPage=new ContactUsPage(driver);//novi objekat za drugi class
    WebEditorsPage webEditorsPage=new WebEditorsPage(driver);//sad i za treci


    mainPage.validateHeaders();           // call the methods that I create in mainpage
    mainPage.validateScrollAndClick(driver);

    contactUsPage.validateAddress();
    contactUsPage.validateTitleAndURL(driver);
    contactUsPage.scrollAndClickWebEditor(driver);

     webEditorsPage.fillInputsFields("Nena","test@test","www.google.com","da da");


     }

        //@AfterMethod
        // public void tearDown() throws InterruptedException {
       //   Thread.sleep(3000);
      //    driver.quit();
     // }
}
