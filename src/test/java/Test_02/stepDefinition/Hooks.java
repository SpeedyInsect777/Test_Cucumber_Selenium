package Test_02.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
    @BeforeStep
    public void beforeStep(){
        System.out.println("Before Step");
    }
    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
        Driver.getDriver().manage().window().fullscreen();

    }
    @AfterStep
    public void afterStep(){
        System.out.println("After step");
    }
    @After

    public void teardown(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Driver.getDriver().close();
    }
}
