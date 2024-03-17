package selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String readProperty(String key) {
                           //this is JAva ,not Selenium..ne moramo da pamtimo ,samo ozemo da prepisemo

         //get file location
        File file = new File("configuration.properties"); //mora da se ima ovaj file ako hocemo da radimo sanjim
                                      //a ovaj file smo creeirali na  Project level

         //Reads file
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }
}