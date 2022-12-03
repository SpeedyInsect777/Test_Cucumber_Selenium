package Test_01.stepDefinitions;

import Test_01.page.Etsy_page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {

    Etsy_page page = new Etsy_page();

    @Before
    public void setup() {

        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));


    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Driver.getDriver().quit();
    }
}
