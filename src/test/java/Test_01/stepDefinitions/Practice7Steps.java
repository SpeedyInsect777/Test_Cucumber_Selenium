package Test_01.stepDefinitions;

import Test_01.page.Practice7Page;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import utilities.Wait;

public class Practice7Steps {

    Practice7Page page7 = new Practice7Page();

    @Given("user should be able to click on {string} and test radio buttons")
    public void user_should_be_able_to_click_on_and_test_radio_buttons(String string) {
        Wait.wait(2);
        page7.menuList.stream().filter(x->x.getText().contains(string)).findFirst().ifPresent(WebElement::click);
      //  Wait.wait(2);
      //  page7.radioButton.forEach(x-> System.out.println(x.getText()));
        Wait.wait(2);
 // page7.radioButton.stream().filter(x -> x.getText().contains("Basketball")).findFirst().get().click();
page7.radioButton.get(5).click();
        Wait.wait(2);
        boolean selected = page7.radioButton.get(5).isSelected();
        System.out.println(selected);
        Wait.wait(2);
    }
}
