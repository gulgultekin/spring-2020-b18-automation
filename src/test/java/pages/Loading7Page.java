package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loading7Page {


    public Loading7Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy()
    public WebElement doneMessage;

    @FindBy()
    public WebElement spongeBobImage;

}
