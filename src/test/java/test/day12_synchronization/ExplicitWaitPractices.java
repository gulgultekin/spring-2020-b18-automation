package test.day12_synchronization;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Loading7Page;
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

        Loading7Page loading7Page = new Loading7Page();

        //creating the instance of WebDriverWait to use its methods
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        String expectedTitleToBe = "Dynamic title";

        //we are using the object to set up our EXPECTED CONDITION
        wait.until(ExpectedConditions.titleIs(expectedTitleToBe));

        //done message is displayed
        Assert.assertTrue(loading7Page.doneMessage.isDisplayed());

        //image is displayed
        Assert.assertTrue(loading7Page.spongeBobImage.isDisplayed());
        //BREAK UNTIL 3.05 PM EST




    }


    @Test
    public void tc41_dynamic_form_test(){

    }

}
