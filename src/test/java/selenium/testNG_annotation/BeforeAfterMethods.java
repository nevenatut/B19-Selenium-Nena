package selenium.testNG_annotation;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethods {


    @BeforeMethod  // runs as many time as you have different @Test

    public void initialize(){
        System.out.println("I am from before method");

    }
    @Test
     public void myTest(){
    System.out.println("I am from test annotation");



}

    @Test
    public void myTest2() {
        System.out.println("I am from test 2 ");

    }

    @Test
    public void myTest3() {
        System.out.println("I am from test annotation number3");

    }
        @AfterMethod
        public void tearDown () {

            System.out.println("I am from After method");
        }




}



/*
savaki test ce uzimati za sebe before i after
I am from before method
I am from test annotation
I am from After method
I am from before method
I am from test 2
I am from After method
 */