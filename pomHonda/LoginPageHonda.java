package pomHonda;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageHonda {         // Page class              

	WebDriver driver;
	
	LoginPageHonda(WebDriver d){   //constructor (driver initialization)
		driver = d;
	}
	
	// elements location
	By username = By.xpath("//input[@id='input-12']");
	By password = By.xpath("//input[@id='input-13']");
	By loginbutton = By.xpath("//button[@title='Log in']");
	By homepage = By.xpath("//h1[text()='Welcome, Murali!']");
	
	//elements identification methods
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pword) {
		driver.findElement(password).sendKeys(pword);
	}
	
	public void clickLoginbutton() {
		driver.findElement(loginbutton).click();
	}
	
	public void getHomepageText() {
		System.out.println("Honda HomePage: "+driver.findElement(homepage).getText());
	}
	
}
