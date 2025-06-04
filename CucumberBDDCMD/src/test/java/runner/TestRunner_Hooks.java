package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features/HooksDemo.feature", 
		glue= {"steps_hooks"},
		plugin = {"pretty", "html:target/HooksReports/HtmlReports.html"},
		monochrome = true
		)
public class TestRunner_Hooks extends AbstractTestNGCucumberTests {
}