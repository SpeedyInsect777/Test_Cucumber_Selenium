package Test_01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Practice7Page {


    public Practice7Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='radio']/input")
    public List<WebElement> radioButton;

    @FindBy(xpath = "//li[@class='list-group-item']/a")
    public List<WebElement> menuList;

    @FindBy(id = "red")
    public WebElement redRadio;
}
