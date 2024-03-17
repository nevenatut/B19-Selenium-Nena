package selenium.data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderShowCase {

// This dataProvider can be also provided in differente class
    //   @DataProvider(name="myData")
    // public Object[][]getData(){    Object[][] -->Class Object because it covers all data types
    //   return new Object[][]{
    //         {"Ibragim", "Aider"},
    //       {"John","Gamba"},
    //     {"Thomas","Shelby"}

    // APACHE POI -->WE WILL BE ABLE TO IMPLEMENT THIS METHOD TO READ DATA FROM EXCEL SHEET,JSON ON ect

    //};
    //}

 /*
    Frameworks - TDD - basically testNG framework
                 DDD - Data Driven Development (if you have a lot of Test Data,you will have this
                                                framework)
     */

                                    // jer smo kreirali u class,pa uzmemo odatle
    @Test(dataProvider = "myData", dataProviderClass = DataProviderSeparated.class)
    public void testDataProvider(String name1, String name2) {

        System.out.println(name1 + " " + name2);


    }
}