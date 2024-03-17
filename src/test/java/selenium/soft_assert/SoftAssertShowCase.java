package selenium.soft_assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



//comes from Test Ng ...and it is optional for using in work
public class SoftAssertShowCase {

    // example will be used in softAssert
    public int sum(int x, int y){
        return x + y;
    }

    @Test
    public void hardAssertTest(){
        Assert.assertEquals(sum(1,2), 2);// Hard Assert
        System.out.println("Code is working fine");

        Assert.assertEquals(sum(2,2), 4); //Hard Assert
        System.out.println("Code is working fine as expected");
    }

    @Test
    public void softAssertTest(){  //iako ima failer nastavlja dalje da run(stop execution,sto nije slucaj
        //sa Hard assert,on se zaustavi greska
        SoftAssert softAssert = new SoftAssert(); // created object

        softAssert.assertEquals(sum(1,2), 3); // Positive scenario
        System.out.println("Code is working fine");


        softAssert.assertEquals(sum(1,2), 6); // negative scenario
        System.out.println("Code is working fine, it supposed to be fail, but it will continue");

        softAssert.assertEquals(sum(5,5), 11);// negative scenario
        System.out.println("Code is working fine, it supposed to be fail, but it will continue");

        softAssert.assertAll("All failures are above"); // must have it so that you know where it failed during the test execution

        //you must have this ,so you can know where you faild...you can always put message to help yoy,
        //but just at the end

    }



}
