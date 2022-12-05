package Test_01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.WeakHashMap;

public class Practice3Page {

    @FindBy(xpath = "//li[@class='list-group-item']/a")
    public List<WebElement> menuList;

    public Practice3Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='example']/button")
    public WebElement addElementButton;

}
