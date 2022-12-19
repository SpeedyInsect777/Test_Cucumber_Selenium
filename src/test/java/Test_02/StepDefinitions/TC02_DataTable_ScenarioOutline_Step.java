package Test_02.StepDefinitions;

import Test_02.page.TC02_BasePage;
import Test_02.page.TC02_DataTable_ScenarioOutline_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Wait;

public class TC02_DataTable_ScenarioOutline_Step {
    TC02_BasePage basePage = new TC02_BasePage();
    TC02_DataTable_ScenarioOutline_Page page = new TC02_DataTable_ScenarioOutline_Page();
    String expectedResult ="Mike Tyson";

    @Given("user is already logged in to the page")
    public void user_is_already_logged_in_to_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env3"));
        basePage.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
        basePage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        basePage.buttonLogin.click();
    }

    @When("user is on order page")
    public void user_is_on_order_page() {
        basePage.buttonOrder.click();
    }

    @When("user enters Product {string}")
    public void user_enters_Product(String product) {
        Select select = new Select(page.selectProduct);
        select.selectByValue(product);
    }

    @When("user enters Quantity {string}")
    public void user_enters_Quantity(String quantity) {
        page.inputQuantity.clear();

        page.inputQuantity.sendKeys(quantity);

    }

    @When("user enters CustomerName {string}")
    public void user_enters_CustomerName(String customerName) {
        page.inputName.sendKeys(customerName);
    }

    @When("user enters Street {string}")
    public void user_enters_Street(String street) {

        page.inputStreet.sendKeys(street);
    }

    @When("user enters City {string}")
    public void user_enters_City(String city) {

        page.inputCity.sendKeys(city);
    }

    @When("user enters State {string}")
    public void user_enters_State(String state) {

        page.inputState.sendKeys(state);
    }

    @When("user enters Zipcode {string}")
    public void user_enters_Zipcode(String zipcode) {
        page.inputZip.sendKeys(zipcode);
        page.inputCard.click();
    }

    @When("user enters CardNumber {string}")
    public void user_enters_CardNumber(String cardNumber) {
        page.inputCard2.sendKeys(cardNumber);
    }

    @When("user enters ExpDate {string}")
    public void user_enters_ExpDate(String expDate) {
        page.inputCardExp.sendKeys(expDate);

        page.buttonProcessOrder.click();

    }

    @Then("user should see new order in the table on view all order page")
    public void user_should_see_new_order_in_the_table_on_view_all_order_page() {
        basePage.buttonViewAllOrders.click();
    //   Assert.assertEquals( page.expectedResult.getText(),expectedResult);

    }
}
