package pomHonda;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestHonda {          // Test class

	public static void main(String[] args) {        //main method included

		WebDriver driver = new ChromeDriver();
		LoginPageHonda loginpage = new LoginPageHonda(driver);   //page class object creation

		//Honda MyGarage URL
		driver.get("https://login.honda.com/mygarage/s/login/?app=0sp4y000000sXu0&RelayState=https%3A%2F%2Fmygarage.honda.com%2Fs%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//Sending test data
		loginpage.enterUsername("muraliwings8@gmail.com");
		loginpage.enterPassword("Test123@123");
		loginpage.clickLoginbutton();
		loginpage.getHomepageText();

		driver.quit();

	}

}
