package projectOrangeHRM_Scenario1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrmLog {
	public static WebDriver driver;
	SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    //Common wait
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority=1, testName="loginTest", dataProvider="loginData", dataProviderClass=ExcelDataReader.class)
	public void loginTest(String uname, String pword) {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		softassert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login Unsuccessful");
		System.out.println("Login Attempted");
		softassert.assertAll();
	}

	@Test(priority=2, testName="logoutTest", dependsOnMethods="loginTest")
	public void logoutTest() {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	public void captureScreenshot(Object fileName) {
		TakesScreenshot capture = (TakesScreenshot) driver;
		File source = capture.getScreenshotAs(OutputType.FILE);
		File location = new File("./Screenshot/"+ fileName);
		try {
			FileUtils.copyFile(source, location);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot captured for Failed Test.");   
	}
}


