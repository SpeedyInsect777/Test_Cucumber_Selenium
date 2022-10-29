package myTest.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Test_step_definition {
    @Before
    public void setup(){
        System.out.println("Step Definition's Before method running...");
    }
    @After
    public void tearDown(){
        System.out.println("Step Definition's After method is running...");

    }
}
