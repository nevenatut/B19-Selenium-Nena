package selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();//like most izmedju  intel and Chrome
                                            //WebDriver je Interface i odatle mi  kupimo,ako imamo drugi braoser
                                            // njega pisemo FireFoxDriver()

        driver.get("https://www.google.com/"); //wait to element to be laoaded

       driver.getTitle();// it returns String String,so we storage in String===>

       String actuallyTitle= driver.getTitle();
       String expectedTitle="Google" ;

          //Validation
       if(actuallyTitle.equals(expectedTitle)){

           System.out.println("Pass");
       }else {

           System.out.println("Failed");
       }

        driver.navigate().to("http://www.ebay.com/");//do same as driver.get ,this method
                                    // except this method does not for element from web page to be loaded

         driver.getCurrentUrl(); //url is  web address http://bla bla,so it get you that

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); //driver.getCurrentUrl().soutv
                                                                                  //izbaci ti sve ovo

        // when you run ,on consola showing pass and  driver.getCurrentUrl()= http ://ww.ebay.com/


    }





}
