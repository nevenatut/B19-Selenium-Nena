package selenium.com.yale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebEditorsPage {

//kada smo click na Contact us,ovde nas dovelo

    /*
    task : validate the url ,fill in the input fields( title and send keys on name, email, website url)
    but do not submit

     */

@FindBy(name = "submitted[name]")
WebElement name;

@FindBy(name = "submitted[email]")
WebElement email;

@FindBy(name = "submitted[website_url]")
WebElement websiteUrl;

@FindBy(name = "submitted[comments]")
WebElement textArea;
    public WebEditorsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void validateUrlAndTitle(WebDriver driver){
         //Validating URL
        String expectedUrl="https://www.yale.edu/contact-us/contact-web-edito";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //Validating Title
        String expectedTitle="Contact Web Editor | Yale University";
        String actualTitle=driver.getTitle();
    }

 //  public void fillInputsFields(WebDriver driver){  // ali ako smo hteli da sendKeys uz pomoc BrowserUtils moramo da stavimo
                                    //WebDriver driver kao parameter
   //     name.sendKeys("Nena");
    //   email.sendKeys("test@test");
    //    websiteUrl.sendKeys("ovo je web");
   //     textArea.sendKeys("this is my message");
  // }   sve ovo moze da se napise krace

//I parametrize this method so I put
              //**method with providing test data
    public void fillInputsFields(String name,String email,String websiteUrl,String textArea){
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.websiteUrl.sendKeys(websiteUrl);
        this.textArea.sendKeys(textArea);

      /*
        this.name je ustvari WebElement name (this. nas upucuje na WebElement)
        njemu saljemo keys,a u zagradi name koje se odnosi sa String name,tj,na parametar

       */
    }






}