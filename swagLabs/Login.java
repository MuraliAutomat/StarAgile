package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
@Test
	public void loginTest() throws InterruptedException
	{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'])[6]']")).click();
	driver.close();

	}

}
