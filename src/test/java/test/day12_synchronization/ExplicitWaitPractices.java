package test.day12_synchronization;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;

public class ExplicitWaitPractices {

    /*
    TC#40 : Dynamically Loaded Page Elements 7
        1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        2. Wait until title is “Dynamic Title”
        3. Assert : Message “Done” is displayed.
        4. Assert : Image is displayed.
        Note: Follow POM
     */
    @Test
    public void tc40_dynamic_title_test(){
        String url = "http://practice.cybertekschool.com/dynamic_loading/7";
        Driver.getDriver().get(url);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);







    }

}
