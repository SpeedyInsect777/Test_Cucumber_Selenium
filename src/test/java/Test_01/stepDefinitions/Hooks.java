package Test_01.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {


    @Before
    public void setup() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


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
