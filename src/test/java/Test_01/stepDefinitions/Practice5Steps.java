package Test_01.stepDefinitions;

import Test_01.page.Practice5Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;
import utilities.Wait;

public class Practice5Steps {

    Practice5Page page5 = new Practice5Page ();

    @Given("User goes to google page")
    public void user_goes_to_google_page() {
        Driver.getDriver().get("https://www.google.com/");


    }

    @Given("user must search {string}")
    public void user_must_search(String string) {
        Wait.wait(2);
        page5.searchBox.sendKeys(string);
        Wait.wait(2);
        page5.searchButton.click();
    }
    @Then("user must see {string}")
    public void user_must_see(String string) {
        Assert.assertEquals(Driver.getDriver().getTitle(),string);
    }
}
