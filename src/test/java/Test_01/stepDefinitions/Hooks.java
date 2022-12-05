package Test_01.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Wait;

public class Hooks {


    @BeforeClass
    public void beforeClass()
    {
        System.out.println("@BeforeClass running...");
    }

    @Before
    public void setup() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("@AfterClass running...");
    }
    @After
    public void tearDown() {

        Driver.getDriver().quit();
    }
}
