package test.day12_synchronization;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class ForgotPasswordTests {

    /*
    1. Go to https://qa2.vytrack.com
    2. Click to “Forgot your password?” link
    3. Verify title changed to expected
        Expected: “Forgot Password”
    4. Verify url is as expected:
        Expected: “https://qa2.vytrack.com/user/reset-request”
       Note: Follow Page Object Model design pattern
     */
    @Test
    public void tc35_title_url_verification(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        LoginPage loginPage = new LoginPage();

        loginPage.forgotPasswordLink.click();

        //Verifying the title is as expected
        String expectedTitle = "Forgot Password";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        //Verifying the URL is as expected
        String expectedUrl = "https://qa2.vytrack.com/user/reset-request";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);


    }


}
