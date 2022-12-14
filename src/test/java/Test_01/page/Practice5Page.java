package Test_01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Practice5Page {

    public Practice5Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='gLFyf']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@class='gNO89b']")
    public WebElement searchButton;


}
