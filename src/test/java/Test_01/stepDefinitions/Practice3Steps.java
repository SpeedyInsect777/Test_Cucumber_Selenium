package Test_01.stepDefinitions;

import Test_01.page.Practice3Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.Wait;

public class Practice3Steps {

    Practice3Page page = new Practice3Page();

    @Given("user must click {string} and verify title with {string}")
    public void user_must_click_and_verify_title_with(String string, String string2) {

        Wait.wait(2);

        page.menuList.stream().findFirst().filter(x->x.getText().contains("A/B Testing")).ifPresent(WebElement::click);

        Wait.wait(2);

        Driver.getDriver().navigate().back();

        Wait.wait(2);

page.menuList.stream().findFirst().filter(x->x.getText().contains("Add/Remove Elements")).ifPresent(WebElement::click);

        Wait.wait(2);

        page.addElementButton.click();

        Wait.wait(2);
    }
    @Given("user must click on {string}")
    public void user_must_click_on(String string) {



    }
    @Given("user performs {string}")
    public void user_performs(String string) {



    }
    @Then("user returns back to home page")
    public void user_returns_back_to_home_page() {



    }
}
