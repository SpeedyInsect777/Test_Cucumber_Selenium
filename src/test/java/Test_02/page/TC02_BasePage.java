package Test_02.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC02_BasePage {

    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button")
    public WebElement buttonLogin;

    @FindBy(xpath = "/html/body/div/nav/div[2]/a[1]/button")
    public WebElement buttonViewAllOrders;

    @FindBy(xpath = "/html/body/div/nav/div[2]/a[2]/button")
    public WebElement buttonViewAllProducts;

    @FindBy(xpath = "/html/body/div/nav/div[2]/a[3]/button")
    public WebElement buttonOrder;

    public TC02_BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
