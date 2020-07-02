package test.day10_jsexecutor_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionsTests {

    @Test
    public void hover_over_test1() throws InterruptedException{
        Driver.getDriver().get("https://www.amazon.com");

        //1- Create the instance of Actions class
        //2- Pass the current driver instance
        Actions actions = new Actions(Driver.getDriver());

        //3- Locate the web element to hover over
        WebElement languageOptions = Driver.getDriver().findElement(By.id("icp-nav-flyout"));

        Thread.sleep(3000);

        //4- Using actions, hover over to the Language options
        actions.moveToElement(languageOptions).perform();
        //actions.perform();

    }

    @Test
    public void tc15_hover_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //We need to locate images and texts

        WebElement img1 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));


        //We need to create instance of Actions
        //Use the instance to do hovering

    }



}
