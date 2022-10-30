package Test_01.page;

import Test_01.stepDefinitions.Etsy_StepDefinitions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Etsy_page {

 //   @FindBy()
    public WebElement titleElement;

   public Etsy_page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

}
