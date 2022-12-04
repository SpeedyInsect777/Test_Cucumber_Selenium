package Test_01.stepDefinitions;

import Test_01.page.Practice1Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.Wait;

import java.util.List;

public class Practice1Steps {

    Practice1Page pages = new Practice1Page();


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
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        List<WebElement> jsConfirm = pages.jsButtons.stream().filter(x -> x.getText().equalsIgnoreCase("Click for JS Confirm")).toList();
        jsConfirm.get(0).click();
        alert.accept();
        List<WebElement> jsPrompt = pages.jsButtons.stream().filter(x -> x.getText().equalsIgnoreCase("Click for JS Prompt")).toList();
        jsPrompt.get(0).click();
        alert.sendKeys("papa fluffy!");
        alert.accept();
        Driver.getDriver().navigate().back();
        List<WebElement> checkboxes = pages.menuList.stream().filter(x -> x.getText().contains("Checkboxes")).toList();
        checkboxes.get(0).click();
        pages.checkbox.get(0).click();
        Driver.getDriver().navigate().back();
        List<WebElement> dragDrop = pages.menuList.stream().filter(x -> x.getText().contains("Drag and Drop")).toList();
        dragDrop.get(0).click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pages.dragDrop.get(0)).clickAndHold().pause(1000).moveToElement(pages.dragDrop.get(1)).pause(1000).release().perform();
        Driver.getDriver().navigate().back();
        List<WebElement> dragDropCircle = pages.menuList.stream().filter(x -> x.getText().contains("Drag and Drop Circles")).toList();
        dragDropCircle.get(0).click();
        actions.dragAndDrop(pages.circleDrag, pages.circleDrop).perform();
        Driver.getDriver().navigate().back();
        Wait.wait(1);
        List<WebElement> dropdown = pages.menuList.stream().filter(x -> x.getText().contains("Dropdown")).toList();
        dropdown.get(0).click();
        Select selectOption = new Select(pages.dropDown);
        Wait.wait(1);
        selectOption.selectByIndex(1);
        Select selectYear = new Select(pages.year);
        Wait.wait(1);
        selectYear.selectByValue("1988");
        Select selectMonth = new Select(pages.month);
        Wait.wait(1);
        selectMonth.selectByIndex(4);
        Select selectDay = new Select(pages.day);
        Wait.wait(1);
        selectDay.selectByIndex(23);
        Select selectState = new Select(pages.state);
        Wait.wait(1);
        selectState.selectByValue("OH");
        Select selectLanguages = new Select(pages.languages);
        Wait.wait(1);
        selectLanguages.isMultiple();
        selectLanguages.selectByValue("java");
        selectLanguages.selectByValue("python");
        pages.dropdownMenuLink.click();
        List<WebElement> googleItem = pages.dropdownItems.stream().filter(x -> x.getText().contains("Google")).toList();
        googleItem.get(0).click();
        Wait.wait(1);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        

    }
}
