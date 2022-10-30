package Test_02.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumberReport.html",
        features = "src/test/resources/Features/Test_02.feature",
        glue = "Test_02/stepDefinition",
        dryRun = false,
        tags = "@wip"
)
        public class CukesRunner {

}
