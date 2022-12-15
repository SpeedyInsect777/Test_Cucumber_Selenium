package Test_01.stepDefinitions;

import Test_01.page.Practice6Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Wait;

public class Practice6Steps {

    Practice6Page page6 = new Practice6Page();

    @Given("user must be able to click on {string}")
    public void user_must_be_able_to_click_on(String string) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Wait.wait(2);
        page6.menuList.stream().filter(x -> x.getText().contains(string)).findAny().ifPresent(WebElement::click);


    }

    @Then("user must pass {string},{string},{string},{string},{string},{string}")
    public void user_must_pass(String string1, String string2, String string3, String string4, String string5, String string6) {
        Wait.wait(1);
        page6.firstName.sendKeys(string1);
        Wait.wait(1);
        page6.lastName.sendKeys(string2);
        Wait.wait(1);
        page6.userName.sendKeys(string3);
        Wait.wait(1);
        page6.email.sendKeys(string4);
        Wait.wait(1);
        page6.password.sendKeys(string5);
        Wait.wait(1);
        page6.phone.sendKeys(string6);
        Wait.wait(1);


    }

    @Then("user must select {string}")
    public void user_must_select(String string) {
        Wait.wait(1);
        page6.radioButton.get(1).isSelected();

        Wait.wait(1);
        page6.radioButton.get(1).click();
        Wait.wait(1);
    }

    @Then("user passes {string}")
    public void user_passes(String string) {

        page6.birthday.sendKeys(string);
        Wait.wait(1);
    }
}
