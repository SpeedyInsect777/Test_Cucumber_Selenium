package Test_01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Practice1Page {

    public Practice1Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='list-group-item']/a")
    public List<WebElement> menuList;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public List<WebElement> jsButtons;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkbox;

    @FindBy(xpath = "//div[@class='column']")
    public List<WebElement> dragDrop;

    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement circleDrag;

    @FindBy(xpath = "//div[@id='droptarget']")
    public WebElement circleDrop;

    @FindBy(xpath = "//select[@id='dropdown']")
    public WebElement dropDown;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "day")
    public WebElement day;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(xpath = "//select[@name='Languages']")
    public WebElement languages;

    @FindBy(id = "dropdownMenuLink")
    public WebElement dropdownMenuLink;

    @FindBy(xpath = "//a[@class='dropdown-item']")
   public List<WebElement> dropdownItems;



}
