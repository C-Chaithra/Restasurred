package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features/BackgroundDemo.feature", 
		glue= {"steps_Background"},
		plugin = {"pretty", "html:target/BackgroundReports/HtmlReports.html"},
		monochrome = true
		)
public class TestRunnerForBackgroundDemo extends AbstractTestNGCucumberTests {
}