package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features/Tags.feature",  
		glue= {"runner"},
		plugin = {"pretty", "html:target/cucumber-report.html"},
		monochrome = false,
		tags = "@mustrun"
		)
public class TestRunnerWith_SingleTag extends AbstractTestNGCucumberTests {
}