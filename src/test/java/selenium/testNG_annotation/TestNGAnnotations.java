package selenium.testNG_annotation;

import org.testng.annotations.*;

public class TestNGAnnotations {

    /*
    testNg stands for Test Next Generation

     */
     // All testNG annotation are below

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
        // po potrebi ga koristimo,ussualy we set Crome driver properties
        //it runs before all tests specified in the folder
        //exempe : deleting cooking  (clear browsing data na web starnici

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
         // when we do database connection
        //run only 1 time
    }

    @BeforeClass
    public void  beforeClass(){
        System.out.println("BeforeClass Annotation");
        //aslo use for common set up before our testing
        //This will engage before test methods in the current class

    }
     @BeforeMethod
    public void beforeMethods(){
         System.out.println("");

     }
    @Test
    public void test(){
        System.out.println("Test Annotation");

    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
   @AfterMethod
    public void afterMethod(){
       System.out.println("AfterMethod annotation");
       //we are closing our web..
   }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass Annotation" );

    }
    @AfterTest
     public void afterTest(){
        System.out.println("afterTest");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

}
//BeforeMethods and AfterMethods runs as many as you have Tests ,others just once