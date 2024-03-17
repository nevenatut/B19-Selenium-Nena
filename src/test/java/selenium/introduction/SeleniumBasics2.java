package selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("file:///C:/Users/ntutu/OneDrive/Desktop/Batch19/B19FirstHTML.html");//copy adress(url sa
                                                     //web gde radiomo,ovo je iz foldera sto smo mi pravili u html

        driver.manage().window().maximize();

      // when you run  --> it will bring you  your web that you put in get()



        System.out.println("driver.getPageSource() = " + driver.getPageSource());//stavi .soutv idaje ti
                                                                                //nas pagesoure je HTML,gde si kreirala web

                                                         //na konzoli ce ti se sve pojaviti sto si radila u html

        String pageSource = driver.getPageSource(); //if dont know return type,samo posle ()stavis kursor i
                                                    //alt+ enter,enter enteri da ti String ili sta vec
                                                //I store here,save my page source
        System.out.println("page source " + pageSource);

        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back(); //posle youtube,ide opet na moju staranu
        driver.navigate().forward();// pa,onda opet hocu na youtube
        driver.navigate().refresh();

        Thread Tread;
        Thread.sleep(2000); //this is not from Selenium it is from java,this means that proces will be
                                 // stoped for 2 sec(you can put what you want),jer kad radis sa navigate,
        //proces salta to,back,forward sta god trazis,ali ako hoces da malo uspori izmedju menjanja sa navigacije
        //na navigaciju sledecu,trazis da ti uspori sa Thread.sleep






        driver.quit();     // will close all browsers that were opend with selenium
        // driver.close(); will shut down one where driver is looking at




    }
}
