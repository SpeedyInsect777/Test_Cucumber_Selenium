package Test_02.StepDefinitions;

import Test_02.page.TC01_checkbox_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Wait;
import java.util.List;
import java.util.Map;

public class TC01_checkbox_Step {

    TC01_checkbox_Page pageTC01 = new TC01_checkbox_Page();


    @Given("user goes input text passes List of provided text")
    public void user_goes_input_text_passes_List_of_provided_text(List<String> dataTable) {
        Wait.wait(1);
        pageTC01.inputText.sendKeys(dataTable.get(0));
        pageTC01.inputText.sendKeys(dataTable.get(1));
        pageTC01.inputText.sendKeys(dataTable.get(2));


    }

    @Then("user goes input text passes Map of provided text")
    public void user_goes_input_text_passes_Map_of_provided_text(Map<String,String> dataTable){
        Wait.wait(3);
        pageTC01.inputText.sendKeys("======");
        pageTC01.inputText.sendKeys(dataTable.get("user1"));
        pageTC01.inputText.sendKeys(dataTable.get("user2"));
        pageTC01.inputText.sendKeys(dataTable.get("user3"));
        Wait.wait(3);
    }
}
