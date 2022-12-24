package Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

         plugin = {
                 "html:target/cucumber-report2.html",
                 "rerun:target/rerun.txt",
                 "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                 "pretty"

         },
        features = "src/test/resources/Features",
        glue = "Test",
        dryRun = false,
        tags = "@wip",
        publish=true 
)

public class CukesRunner {


   


}
