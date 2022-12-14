package Test_01.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // plugin ="html:target/cucumber-report2.html" ,
        features = "src/test/resources/Features",
        glue = "Test_01/stepDefinitions",
        dryRun = false,
       tags = "@wip"

)
public class Runner {

}
