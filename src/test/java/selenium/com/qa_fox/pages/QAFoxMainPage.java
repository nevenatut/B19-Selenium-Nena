package selenium.com.qa_fox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.utils.BrowserUtils;


    /*
Navigate to main page of QA Fox
1. Click on my account from mainPage
2. Click on register link from mainPage
3. On register age, fill in all required input fields (parametrize your data, no need to use
    dataProvider)
4. Click 'yes' radio button
5. Check checkBox for privacy
6. Click Continue button

 */

public class QAFoxMainPage {

    public QAFoxMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[.='Desktops']")
    WebElement desktopTab;

    @FindBy(xpath = "//a[.='Show AllDesktops']")
    WebElement showAllDesktops;

    @FindBy(xpath = "//a[.='Register']")
    WebElement registerLink;

    @FindBy(xpath = "//span[.='My Account']")
    WebElement myAccount;


    public void clickOnShowAllDesktops(WebDriver driver) throws InterruptedException {
        BrowserUtils.moveTo(driver, desktopTab);
        Thread.sleep(2000);
        BrowserUtils.clickWithJS(driver, showAllDesktops);
    }

    public void clickOnRegister(WebDriver driver){
        BrowserUtils.clickWithJS(driver, myAccount);
        BrowserUtils.clickWithJS(driver, registerLink);
    }
}