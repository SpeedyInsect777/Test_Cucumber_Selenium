package myTest.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Hooks {

    @Given("This is Given")
    public void user_enters_home_page() {
        System.out.println("Hook's @Given is running");
    }

    @Then("This is Then")
    public void user_should_see_searchbox() {
        System.out.println("Hook's @Then is running");

    }
}

