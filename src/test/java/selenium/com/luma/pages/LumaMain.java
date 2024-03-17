package selenium.com.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

   // another way to find and treat WebElement
   // return WebElement-> method od WebEle. mozes da koristis kad testiras
public class LumaMain {
      WebDriver driver;
    public LumaMain (WebDriver driver){
        this.driver=driver;
    }
    //find not with @Find we are using By => By giveName= By.xpath(" ");
                                                       // By.isve ostale mogucnosti
    private By gear= By.xpath("//span[.='Gear']");

    private By bags= By.xpath("//a[.='Bags']");

    public WebElement clickOnBags(){          //kreiramo method koji nam vraca Web El.
        return driver.findElement(bags);

    }

    public WebElement hoverOverGear(){
        return driver.findElement(gear);

    }


}
