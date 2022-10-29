package myTest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/Features/MyTest.feature",
        glue = "myTest/step_definitions",
        dryRun = false,
        tags = "@wip")

public class CukesRunner {

}
