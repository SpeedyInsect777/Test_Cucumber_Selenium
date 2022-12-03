package Test_01.stepDefinitions;

import Test_01.page.JavaScriptPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.Wait;

import java.util.List;
import java.util.stream.Collectors;

public class JavaScriptAlertSteps {

    JavaScriptPages pages = new JavaScriptPages();


    @When("user on home page should be able to click on JavaScript Alert")
    public void user_on_home_page_should_be_able_to_click_on_java_script_alert() {

        List<WebElement> jsLink = pages.menuList.stream().filter(x -> x.getText().equalsIgnoreCase("JavaScript Alerts")).toList();
        jsLink.get(0).click();
        System.out.println(Driver.getDriver().getTitle());

    }

    @Then("user must click on all three alert buttons and verify if they work properly")
    public void user_must_click_on_all_three_alert_buttons_and_verify_if_they_work_properly() {

        pages.jsButtons.forEach(x -> System.out.println(x.getText()));
        List<WebElement> jsAlert = pages.jsButtons.stream().filter(x -> x.getText().equalsIgnoreCase("Click for JS Alert")).toList();
        jsAlert.get(0).click();
        Wait.wait(2);
        Alert alert = Driver.getDriver().switchTo().alert();
        Wait.wait(2);
        alert.accept();

        List<WebElement> jsConfirm = pages.jsButtons.stream().filter(x -> x.getText().equalsIgnoreCase("Click for JS Confirm")).toList();
        jsConfirm.get(0).click();
        Wait.wait(2);
        alert.accept();

        List<WebElement> jsPrompt = pages.jsButtons.stream().filter(x -> x.getText().equalsIgnoreCase("Click for JS Prompt")).toList();

        jsPrompt.get(0).click();
        Wait.wait(3);
alert.sendKeys("papa fluffy!");
        Wait.wait(3);
alert.accept();
        Wait.wait(3);

    }
}
