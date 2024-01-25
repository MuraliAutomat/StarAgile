package projectOrangeHRM_Scenario2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class BaseOrangeHrm {
	public static WebDriver driver;
	public static LoginPage loginpage;
	AdminPage adminpage;
	LoginTest logintest;

	@BeforeTest
	public void browserSetup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginpage = new LoginPage(driver);
		adminpage = new AdminPage(driver);
		logintest = new LoginTest();
	}
}
