package projectOrangeHRM_Scenario2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {                   // Login Page class
	private WebDriver driver;            // Encapsulation

	LoginPage(WebDriver d){              //Constructor (driver initialization)
		driver =d;
	}

	// elements location
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginbutton = By.xpath("//button[@type='submit']");

	//elements identification methods & Validations
	public void loginFunction(String uname, String pword) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pword);
		driver.findElement(loginbutton).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Invalid Credentials");
		System.out.println("Login Status: Login Successful");

	}
	
	public void getApplicationTitle( ) {
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Invalid Application Title");
		System.out.println("Application Title: "+driver.getTitle());
	}

}
