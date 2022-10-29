package myTest.pages;

import myTest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestPage{

    @FindBy(xpath = "//li[@class='list-group-item'][1]/a")
    public WebElement myElement;

    public TestPage(){

PageFactory.initElements(Driver.getDriver(),this);


    }
}