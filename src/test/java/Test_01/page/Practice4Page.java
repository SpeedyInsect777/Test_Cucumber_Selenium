package Test_01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Practice4Page {

public Practice4Page() {
    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(id="searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;





}