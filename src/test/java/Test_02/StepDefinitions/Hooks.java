package Test_02.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import utilities.Driver;


public class Hooks {

    @Before
    public void setUp() {

Driver.closeDriver();
    }

    @After
    public void tearDown() {

    }
}
