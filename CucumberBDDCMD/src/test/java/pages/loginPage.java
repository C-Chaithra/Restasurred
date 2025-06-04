package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	protected WebDriver driver;
	
	protected WebDriverWait wait;

	private By txt_username = By.id("username");

	private By txt_password = By.id("password");

	private By btn_login = By.id("submit");

	public loginPage(WebDriver driver) {

		this.driver = driver;

		if (!driver.getTitle().equals("Test Login | Practice Test Automation")) {

			throw new IllegalStateException("This is not Login Page. The Current page is " + driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {

		wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement username_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		username_ele.sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(By.id("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	public void clickLogin() {

		driver.findElement(By.id("submit")).click();
	}

	public void checkLogOutIsDisplayed() {
		
		 String pageTitle = driver.getTitle(); 
		 if (pageTitle.contains("Successfully"))
		  { System.out.println(pageTitle); } 
		 else {
		  System.out.println("Invalid Credentials"); }
		 
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 
	}

	public void loginValidUser(String username, String password) throws Exception {

		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		
		
		
	}

}