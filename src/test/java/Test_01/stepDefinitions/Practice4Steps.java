package Test_01.stepDefinitions;

import Test_01.page.Practice4Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;
import utilities.Wait;

import java.util.List;

public class Practice4Steps {



    Practice4Page page4 = new Practice4Page();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
       page4.searchBox.sendKeys(string);
        page4.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        Assert.assertEquals("Passed",Driver.getDriver().getTitle(),string+" - Wikipedia");
    }

}
