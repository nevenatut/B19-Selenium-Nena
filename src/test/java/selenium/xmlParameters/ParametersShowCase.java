package selenium.xmlParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersShowCase {

    /*
    !!!!since you have parameters from  xml-> you CAN NOT RUN FROM HERE,YOU
       HAVE TO RUN FROM parameters.xml

       - svaki test uvodi svoje parametre

     */
    @Parameters({"firstName", "lastName"})

    @Test
    public void testParameters(String firstName, String lastName){

        System.out.println(firstName + " " + lastName);

    }

    @Parameters({"address","city"})
    @Test
    public void test2(String address, String city){

        System.out.println(address +" " + city);
    }
}
