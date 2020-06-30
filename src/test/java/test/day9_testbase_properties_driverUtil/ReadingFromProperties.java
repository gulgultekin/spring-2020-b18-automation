package test.day9_testbase_properties_driverUtil;

import org.testng.annotations.Test;

import java.util.Properties;

public class ReadingFromProperties {

    @Test
    public void reading_properties_file(){
        //Properties class object allows us
        // to read from configuration.properties
        Properties properties = new Properties();

        //We need to show where the file is stored.
        //We need the path of the file
        String path = "configuration.properties";
        ///Users/cybertekchicago-1/Desktop/seleniumprojectb18/configuration.properties

    }

}
