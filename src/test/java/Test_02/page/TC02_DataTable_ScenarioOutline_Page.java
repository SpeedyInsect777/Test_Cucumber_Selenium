package Test_02.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


    public class TC02_DataTable_ScenarioOutline_Page  {
            @FindBy(xpath = "//select")
            public WebElement selectProduct;

            @FindBy(xpath = "//input[@name='quantity']")
            public WebElement inputQuantity;

            @FindBy(xpath = "//input[@value='100']")
            public WebElement input;

            @FindBy(xpath = "//input[@value='8']")
            public WebElement input2;

            @FindBy(xpath = "//input[@name='name']")
            public WebElement inputName;

            @FindBy(xpath = "//input[@name='street']")
            public WebElement inputStreet;

            @FindBy(xpath = "//input[@name='city']")
            public WebElement inputCity;

            @FindBy(xpath = "//input[@name='state']")
            public WebElement inputState;

            @FindBy(xpath = "//input[@name='zip']")
            public WebElement inputZip;

            @FindBy(xpath = "//input[@value='American Express']")
            public WebElement inputCard;

            @FindBy(xpath = "//input[@name='cardNo']")
            public WebElement inputCard2;

            @FindBy(xpath = "//input[@name='cardExp']")
            public WebElement inputCardExp;

            @FindBy(xpath = "//button[@type='submit']")
            public WebElement buttonProcessOrder;

            @FindBy(xpath = "//div[@class='table-container']/table/tbody/tr/td")
            public WebElement expectedResult;

            public TC02_DataTable_ScenarioOutline_Page() {
                PageFactory.initElements(Driver.getDriver(), this);
            }
        }

