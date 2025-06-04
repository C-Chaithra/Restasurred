package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	
	//@FindBy(xpath = "//a[text()='Log Out']")
	WebElement btn_logout;
	
	WebDriver driver;
	
	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, LoginPage_PF.class);
		PageFactory.initElements(driver, this);
	}
	
	
	public void checkLogoutIsDisplayed() {
		//btn_logout.getText();
		String pageTitle = driver.getTitle(); 
		 if (pageTitle.contains("Successfully"))
		  { System.out.println(pageTitle); } 
		 else {
		  System.out.println("Invalid Credentials");
		 }
		
	}
}