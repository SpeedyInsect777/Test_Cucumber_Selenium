package Test_01.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Wait;

public class Hooks {


    @Before
    public void setup() {


        Driver.closeDriver();
    }

    @After
    public void tearDown() {

        Driver.getDriver().quit();
    }
}
