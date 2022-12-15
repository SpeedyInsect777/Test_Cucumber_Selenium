package Test_01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Practice6Page {


    public Practice6Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='list-group-item']/a")
    public List<WebElement> menuList;
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@name='birthday']")
    public WebElement birthday;
    @FindBy(xpath = "//div[@class='radio']")
    public List<WebElement> radioButton;

}
