package steps_hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	
	
	@Before(value="@smoke", order=2)
	public void browserSetup() {
		WebDriver driver = new ChromeDriver();
		System.out.println("  I am inside browserSetup");
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.quit();
		
	}
	
	@Before(order=1)
	public void setup2() {
		System.out.println("   I am inside Before");
	}
	
	@After(order=1)
	public void teardown() {
		System.out.println("   I am inside teardown\n");
	}
	
	@After(order=2)
	public void teardown2() {
		System.out.println("  I am inside teardown2 \n");
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("  ---- I am inside beforeSteps");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("  ==== I am inside asfterSteps");
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
