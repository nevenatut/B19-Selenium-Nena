package selenium.seleniumRecap;

public class SeleniumRecap {

/*  1.What is Selenium



    Advantage:

    --Free to use
    --It supports multiple browsers( Chrome, MS Edge,Safari ,FireFox...)
    --It is supported ba many programming language

    Disadvantage:
    --can not automate  CAPTCHA ( MAKE research about how to bypass this,normally this is tuns off during testing by developers),
    PICTURE, VIDEO ,
    BUILT IN APPLICATION, MOBILE APP.
    --no customer support
    --limited to automate just web app.(website)
    --It does not have built report system ( We have to use TestNg ,Cucumber report , Spark Report..)


    2.What type of testing can you perform with Selenium?

     -- Smoke test                           --Regression                --Functional test(positive/negative)
    3.What kind of testing you are not able to preform with Selenium?

     --Performance Testing
     --Manual Testing
     --Non-Functional Testing (load,stress t)

    4.What is the locators types?What is a locator?

    Locator is way to locate web element in dom (document obj model).  Locators are basically address of web
    element

    Locators are as follows:
     -ID
     -LinkText
     -ClassName




     5.How do you handel dynamic element?

     We can use multiple ways of locating Web Elements , but as of now ,we alredy have unique elements found and
     there are pretty stable.Hoever, back in days when we were starting, we used to face challenges while locating
     web elements.There I can say thah we used  parent/ child relationship ,folow sibilong

     6.What is diferente between   driver.get and driver.navigete ().to()
      NavigeteTo-- does not waiting for Web Element to be loading oan web page
                --has owen methods   refresh, back, forward

      driver.get() --does wait a serto of time to load
                    --no method

       7. driver.close  closes only current window where driver is located
          driver.quit  closes

      8.What is XPath?
       Basically it is a way of locating webelements in web page.It is a set of chars that is passed as
       an adress /location of a web page

        8.1 What types of XPath do you know?

        Absolute Xpath -starts form the beginning of html do desire location --ne korissti niko

        Relative - It goes directly

        8.2 And Which one you use ?
        Relative -since it is reliable and focuses on parent/child.

     9.How do you handels dropdowns? How do you handel static Dropdowns?
      First,when I inspect dom,I check if dropdowen:s tag name is 'selest' ,if it is then I have implemented
      re-usable method that handel drop owen .It is
      if is tag name is not select sendKeys or use Action class metl;  gfali

      9.1 Secect Methods
      Select select=new Select(element);
      selecting option from dropdown
      visibleText
      value
      index

       other methods with in same class:
       getOptions --sve opcije ti daje
       getFirstSelectedOption koja je po difolt

    10.What kimd of Exception have you faced while doing
                   (Exception su Classes from Selenium)
     NoSuchElementException
     StaleElementReferenceException
     NullPointerExp
     ElementNotInteractibleException --ako kliknes na nesto sto nije klikbl  ili visiable
     TimeOutExcepention
      NoSuchFrameException
      UnHandelAlertExeptition

   11.How do you handel alerts?(Popups/Js Alerts)

    We have couple types of alerts.

    One is JS Alert  obicno na vrhu negde
        ---we can use some methods from alert interFace-znaci da nema object da pravis nego
        Alert alert = driver.swithchTo.alert();
        alert.accept();


    Second one is html Alert --treated like normally,find dthe location

    OS Alerts (operativ system)--nismo radili i necemo se susretetati
     usually popsup from your laptop
     It is alert
     we can use Robot class

  12.How do you handel iFrames?  html in html

  We can switch to that specific iFrame ,eather with id or name or find xpat h for iframe

  note: if you directly go inside iframe and locate one specific element and  iwhen you run
    you will have nonsuchelgnore ement execption   if you made mistake you will make  you wil have non such

      12.1 how to switch the driver
         driver.switchTo.frame("id or name or xpath')
         it would run little bit slower
         compare with it will go fast
       12.2  how do you handel nested  iframe
       keep switchig until disier
       driver().switchTo()
       To bring basc driver.svithTo,defaultCaontate()-skroz back
         driver().parent jedan korak nazad

     13. Keyboard and mouse action   ->
     We can use Action class
     this class help us to manipulate with
      Action action = new Action(driver)     driver uzimamo
      action.
           moveByOffSet (x,y) --move based on
           DoubleClick()
           sendKeys
           contextClick --right clik on web element
           clickAndHold
           release
           DRagAndDrop
           moveToElement --- hover over
           scrollByElement -- scrolls the page based on numeber
        !!! perform   --must have if

       KeyBoard action
          sendKeys ("text" keys.ENTER)


     14.What is diferen between   WebElement and WebElements
     return single WebElement   kao ne mas ga pokaze NoSuchElementEx
     return List od WebElements                 varti empty list

     15.Can you tell me some methods from driver and Webelement
      driver .get()
      drive.navigate()to()
     driver.mange.wait.timeout.impliciteWait(DurationofSecond())
     driver.manage.window.max min
     driver.getTitle
     driver.getCurrentUrl
     driver.getpageSource            html structure you will have on console
     driver.switchToWindow/frame/alert
     driver.find
     quite
     close
     getWindowHandel/s                return String or Set<String> unique set of ID


     Webelement

     getText
     sendKey
     click
     clear
     isDisplayed    boolean,check is Webelement is displayed
     isEnable
     getAttribute
     getCSSValue
     isEnable

     16.How do you handle multiple windows? imamo super metode in utile koji vrte sa loop
     Get uniquoe id of window with

     Set<String> ids = driver.getWindowHandels
     String id = driver.getWindowHandle

     We ca
     17.How do you scroll the page?
     I can use acction class, I can use Point class Ili je interface or JS method

      18.How do you uplaod file?

       just sendkey into filed by provideng location of file

     19.Difference SoftAssert and Hardasse

     Skip failer while our -softAsser ima metod kojij se korisri na kraju i on nam pomaze da vidimo gde
     failer  .Kreiramo Object SoftAssert class

     hard stane tamo gde je failer i nema vise execution...simple useeds static methods
     Assert.assertEqual("actualedata,expecteddata","message"
     20.Singlton designe

     It is a way for centralizing our driver by encaptulazion.Means that I use one drive acros the framework.
     Driver is initiated only

     21.Tell  me some TestNG

     @BeforMethod
     @Test
     @Parameters
     @Dataprovide
     @AfterSuite
     @
     22.WaitTimes
     Sometimes they call Synchronization Issues
     InpliciteWaits imali smo uvek general wait for
          we can specifide wait time sec
     ExpliciteWay -specific time of wait condition
     this need driver and webElement

     WebDriverWait= new WebDriverWait(Duration.Ofsecond(10)); -->Time out exeception u svakom slucaj

     wait.until(Ex
      FluentWAit  cesce prroverava da li sve sto teraba da radi   slicno je ,periodic way


































 */



}
