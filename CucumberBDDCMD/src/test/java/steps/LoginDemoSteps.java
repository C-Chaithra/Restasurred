package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

<<<<<<< HEAD
	/*
	 * WebDriver driver = null; WebDriverWait wait = null;
	 * 
	 * @Given("browser is open") public void browser_is_open() { // Write code here
	 * that turns the phrase above into concrete actions driver = new
	 * ChromeDriver();
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	 * 
	 * driver.manage().window().maximize(); }
	 * 
	 * @And(value = "user is on login page") public void user_is_on_login_page() {
	 * driver.navigate().to(
	 * "https://practicetestautomation.com/practice-test-login/"); }
	 * 
	 * @When("^user enters (.*) and (.*)$") public void
	 * user_enters_username_and_password(String username, String password) throws
	 * InterruptedException {
	 * 
	 * wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 * 
	 * WebElement username_ele =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	 * username_ele.sendKeys(username);
	 * driver.findElement(By.id("password")).sendKeys(password);
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40)); }
	 * 
	 * @And("user clicks on login") public void user_clicks_on_login() {
	 * driver.findElement(By.id("submit")).click();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40)); }
	 * 
	 * @Then("user is navigated to the home page") public void
	 * user_is_navigated_to_the_home_page() throws InterruptedException {
	 * 
	 * String pageTitle = driver.getTitle(); if (pageTitle.contains("Successfully"))
	 * { System.out.println(pageTitle); } else {
	 * System.out.println(driver.findElement(By.id("error")).getText()); }
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 * 
	 * if (driver != null) { driver.quit(); // Closes WebDriver gracefully }
	 * Thread.sleep(500); // half-second delay (avoid if using parallel tests)
	 * driver.quit(); }
	 */
=======
	WebDriver driver = null;
	WebDriverWait wait = null;

	@Given("browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		driver.manage().window().maximize();
	}

	@And(value = "user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement username_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username_ele.sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {

		String pageTitle = driver.getTitle();
		if (pageTitle.contains("Successfully")) {
			System.out.println(pageTitle);
		} else {
			System.out.println(driver.findElement(By.id("error")).getText());
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		if (driver != null) {
			driver.quit(); // Closes WebDriver gracefully
		}
		Thread.sleep(500); // half-second delay (avoid if using parallel tests)
		driver.quit();
	}

>>>>>>> ee5ece9663f8db09bca54143762ccf9435d2f69f
}
