package myTest.Test_001;

import myTest.utilities.Driver;
import org.junit.Test;

public class Main {
    @Test
    public void setup(){
        Driver.getDriver().get("https://www.google.com/");
    }
}
