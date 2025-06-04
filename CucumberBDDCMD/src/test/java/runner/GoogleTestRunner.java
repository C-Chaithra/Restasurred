package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/GoogleSearch.feature", // Path to your .feature files
    glue = {"steps.GoogleSearchSteps.java"},                         // Package containing step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class GoogleTestRunner extends AbstractTestNGCucumberTests {
}
