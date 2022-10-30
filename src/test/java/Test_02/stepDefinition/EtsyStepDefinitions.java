package Test_02.stepDefinition;

import Test_02.page.EtsyWoodenSpoon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class EtsyStepDefinitions {

    EtsyWoodenSpoon page = new EtsyWoodenSpoon();

    @Given("user is on {string}")
    public void user_is_on(String string) {
        System.out.println("User on "+string);
    }
    @Then("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchInput) {
page.searchBox.sendKeys(searchInput);
    }
    @Then("user clicks search button")
    public void user_clicks_search_button() {
page.button.click();
    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
        Assert.assertEquals("Failed",expectedTitle, Driver.getDriver().getTitle());
    }
}
