package Test_01.stepDefinitions;

import Test_01.page.Practice2Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.Wait;

import java.util.List;

public class Practice2Steps {

Practice2Page page2 = new Practice2Page();

    @When("user on home page should be able to click on links")
    public void user_on_home_page_should_be_able_to_click_on_links() {

 List<WebElement> checkbox2 = page2.menuList.stream().filter(x->x.getText().contains("Checkboxes")).toList();
checkbox2.get(0).click();
        Wait.wait(1);
        System.out.println(page2.checkBoxes.get(0).isSelected());
        page2.checkBoxes.get(0).click();
        System.out.println(page2.checkBoxes.get(0).isSelected());
        Driver.getDriver().navigate().back();
        Wait.wait(2);

      List<WebElement> radioButtons = page2.menuList.stream().filter(x->x.getText().contains("Radio Buttons")).toList();

      radioButtons.get(0).click();

      Wait.wait(1);

      page2.radioButtons.stream().forEach(x-> System.out.println(x.getText()));
Driver.getDriver().navigate().back();
    }
    @Then("user must click links and verify if they work properly")
    public void user_must_click_links_and_verify_if_they_work_properly() {

List<WebElement> newTab = page2.menuList.stream().filter(x->x.getText().contains("Multiple Windows")).toList();

Wait.wait(1);

newTab.get(0).click();

String mainWindow = Driver.getDriver().getWindowHandle();



page2.clickLinks.get(0).click();
        String secondWindow = Driver.getDriver().getWindowHandle();

Wait.wait(5);

Driver.getDriver().switchTo().window(mainWindow);
        Wait.wait(5);
        Driver.getDriver().navigate().back();
        Wait.wait(4);
        Driver.getDriver().switchTo().window(secondWindow);
        Wait.wait(3);


    }
}
