package Test_02.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

         plugin = {
                 "html:target/cucumber-report2.html",
                 "rerun:target/rerun.txt",
                 "me.jvt.cucumber.report.PrettyReports:target/cucumber"
         },
        features = "src/test/resources/Features2",
        glue = "Test_02/StepDefinitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {

}
