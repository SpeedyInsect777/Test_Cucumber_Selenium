package Test_01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Practice2Page {

    public Practice2Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='list-group-item']/a")
    public List<WebElement> menuList;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> radioButtons;

    @FindBy(xpath = "//a[@target='_blank']")
    public List<WebElement> clickLinks;


}
