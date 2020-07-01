package test.office_hours;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderPractice {
    private static Properties properties;
    WebDriver driver;

    static {
        //        try with resources used to automatically close input stream
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    /**
     * To go into the method/class implementation click and hold control/command and make a click
     *
     * @param args
     */
    public static void main(String[] args) {
        String browser = properties.getProperty("browser");
        System.out.println(browser);
        // you will get null, if there is no such a property
        System.out.println(properties.getProperty("url"));
    }

    @Test
    public void loginTest() {
        String browser = getProperty("browser");
        String URL = getProperty("url");
        driver = WebDriverFactory.getDriver(browser);
        driver.get(URL);
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
