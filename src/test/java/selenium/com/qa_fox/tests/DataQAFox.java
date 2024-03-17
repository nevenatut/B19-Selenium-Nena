package selenium.com.qa_fox.tests;

import org.testng.annotations.DataProvider;

public class DataQAFox {
    @DataProvider(name="dataQa")
    public Object[][]getData(){

        return new Object[][]{
                {"Kobe","abby","test@test","655677","password"},  //ovo su mi vrednosi za parametred
                {"Tom","Brian","email@test","323626","password1"},
                {"Barbie","Kenic","test2@test","66789","password2"}


        };


    }



}
