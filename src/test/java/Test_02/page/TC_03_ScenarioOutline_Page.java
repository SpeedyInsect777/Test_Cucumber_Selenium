package Test_02.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC_03_ScenarioOutline_Page {
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement inputFirstname;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement inputLastname;

    @FindBy(xpath = "//textarea")
    public WebElement textarea;

    public TC_03_ScenarioOutline_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
