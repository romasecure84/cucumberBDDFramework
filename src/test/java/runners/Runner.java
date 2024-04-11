package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
            "pretty",//rengli yazdirmaq ucun
            "html:target/cucumber-reports.html",
            "json:target/json-report.cucumber-json",
            "junit:target/resources/features"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions","hook"},
        tags = "@ConfigReader or @Practice",
        dryRun = false
)

public class Runner {
}
