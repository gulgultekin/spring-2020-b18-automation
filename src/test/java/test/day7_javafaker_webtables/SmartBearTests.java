package test.day7_javafaker_webtables;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SmartBearTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    //3. Enter username: “Tester”
    //4. Enter password: “test”
    //5. Click to Login button
    //6. Print out count of all the links on landing page
    //7. Print out each link text on this page

}
