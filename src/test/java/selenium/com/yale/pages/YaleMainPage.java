package selenium.com.yale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import selenium.utils.BrowserUtils;

import java.util.List;

public class YaleMainPage {

    public YaleMainPage(WebDriver driver){    //we need constructor to bring us driver to this  Class
        PageFactory.initElements(driver,this); //i zato ga pravimo (ime costructora je uvek isto kao i ime
        // ime of Class

     //PageFactory is special class in Selenium with one static method initElements (for initialize elements)
    }
/*
we need constructor to bring us driver to this  Class i zato ga pravimo (ime costructora je uvek isto
 kao i  ime of Class,tako da kad god pravimo Object from this Class,we need to provide driver as a parametre
       YaleMainPage yalemainpage=new YaleMainPage(driver);

 PageFactory is special class in Selenium with one static method initElements (for initialize elements)

 This means that when ever I talk to this class ,I have to provide the driver,because I put that in
 constructor parameter


 @FindBy ce prakticno da initialize WebElement (

 */
    @FindBy(xpath = "//a[@class='main_nav_link']")
    List<WebElement> allHeader;    // posto su webElements pod ovim xpath,pakujemo u listu

    @FindBy(xpath = "//a[.='Contact Us']")  //location for Contact us on bottom of Yale page
    WebElement contactUsLink;

     //imam lokacije od potrebnih WebElemenata i sa njim sad hocu da nesto radim ---->
    //I need to do loop for my List<WebElement>==>create METHOD to that
    public void validateHeaders(){
        for (int i = 0; i < 6; i++) {  // 6 because I need 6 header to
            Assert.assertTrue(allHeader.get(i).isDisplayed());
            System.out.println(BrowserUtils.getText(allHeader.get(i)));

        }
    }
      //method da scroll i clik na gde nam treba
   public void validateScrollAndClick(WebDriver driver){
                               //U method stavimo WebDriver,znamo da ce nam trebati kad budemo koristili
                  // za  BrowserUtils.scrollToElement();,ali to nije isti driver kao ovaj u constructoru

      BrowserUtils.scrollToElement(driver,contactUsLink);
       contactUsLink.click();
   }

@AfterMethod
    public void treatDown() throws InterruptedException {
        Thread.sleep(3000);


}






}
