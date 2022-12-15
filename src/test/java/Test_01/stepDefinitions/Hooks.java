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
    public void setUp() {
Driver.getDriver().get(ConfigurationReader.getProperty("env"));


    }

    @After
    public void tearDown() {

        Driver.getDriver().quit();
    }
}
