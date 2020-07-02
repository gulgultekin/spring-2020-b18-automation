package test.day10_jsexecutor_upload_actions;

import org.testng.annotations.Test;
import utilities.Driver;

public class ActionsTests {

    @Test
    public void hover_over_test1(){
        Driver.getDriver().get("https://www.amazon.com");

        //1- Create the instance of Actions class
        //2- Pass the current driver instance
        //3- Locate the web element to hover over
        //4- Using actions, hover over to the Language options
    }

}
