package selenium.com.yale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import selenium.utils.BrowserUtils;

public class ContactUsPage {

    /*
     Task:  continue this project on ContactUsPage, validate address
          - validate title and url
          - scroll to Contact Web Editor and click on him
     */

public ContactUsPage(WebDriver driver){
    PageFactory.initElements(driver,this);

}
@FindBy(xpath = "//p[contains(.,'Yale University')]")
    WebElement address;

@FindBy(xpath = "//a[.='Contact Web Editor']")
WebElement webEditorialLink;

public void validateAddress(){

    System.out.println(BrowserUtils.getText(address));
    Assert.assertTrue(address.isDisplayed());

}
         //validate Title and url
public void validateTitleAndURL(WebDriver driver){

    // validate URL from Contact us page
    String expectedURl="https://www.yale.edu/contact-us";
    String actualURL=driver.getCurrentUrl();
    Assert.assertEquals(expectedURl,actualURL);

     // validate Title from contact us page
    String expectedTitle="Contact Us | Yale University";
    String actualTitle =BrowserUtils.getTitle(driver); //ili driver.getTitle()
    Assert.assertEquals(expectedTitle,actualTitle);
}

   public void scrollAndClickWebEditor(WebDriver driver){
    BrowserUtils.scrollIntoViewJS(driver,webEditorialLink);
    webEditorialLink.click();
   }


}
