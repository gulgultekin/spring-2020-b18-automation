package test.day6_testng_dropdowns;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestNGSeleniumPractice {



    @Test
    public void google_title_test(){
        //1- Go to: https://www.google.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        //2- Verify title : Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        //The line where we do assertion
        //If you use assertTrue,
        //  argument you are passing is supposed to be returning boolean
        Assert.assertTrue(actualTitle.equals(expectedTitle));

        //If you are using assertEquals,
        // you need to pass two arguments of the same type
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
