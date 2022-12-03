package Test_01.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class JavaScriptPages {

    public JavaScriptPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@class='list-group-item']/a")
    public List <WebElement> menuList;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
public List <WebElement> jsButtons;

}
