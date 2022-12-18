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


        page.inputFirstname.sendKeys(firstName);

        page.inputLastname.sendKeys(lastName);

        page.textarea.sendKeys(inputText);


    }
}
