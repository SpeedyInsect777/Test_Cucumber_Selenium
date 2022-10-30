package Test_02.page;

import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyWoodenSpoon {

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement button;

    public EtsyWoodenSpoon() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
