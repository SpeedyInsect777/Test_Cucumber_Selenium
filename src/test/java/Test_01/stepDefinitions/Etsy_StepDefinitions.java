package Test_01.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class Etsy_StepDefinitions {

    String actualTitle;
    String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

    @When("as user i go to {string}")
    public void as_user_i_go_to(String string) {

        System.out.println(string + " @When-Method inside Step Definition running");
        actualTitle = Driver.getDriver().getTitle();
    }

    @Then("as a user i should see title as its expected")
    public void as_a_user_i_should_see_title_as_its_expected() {

        Assert.assertEquals("Error", actualTitle, expectedTitle);


    }
}
