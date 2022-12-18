package Test_02.StepDefinitions;

import Test_02.page.TC_03_ScenarioOutline_Page;
import io.cucumber.java.en.Given;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Wait;

public class TC03_ScenarioOutline_Step {

    TC_03_ScenarioOutline_Page page = new TC_03_ScenarioOutline_Page();

    @Given("user inputs {string},{string},{string}")
    public void user_inputs(String firstName, String lastName, String inputText) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));

        Wait.wait(3);
        page.inputFirstname.sendKeys(firstName);
        Wait.wait(1);
        page.inputLastname.sendKeys(lastName);
        Wait.wait(1);
        page.textarea.sendKeys(inputText);
        Wait.wait(5);

    }
}
