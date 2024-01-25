package indianRailways;
//1. Write a WebDriver script to navigate to a website and click on a specific link. 
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IndianRailways {
	
	@Test
	public void navigateRailwaysSpecificLink() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://indianrailways.gov.in/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//a[@title='Zonal Railways']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Southern Railway']")).click();
		//System.out.println(driver.findElement(By.xpath("//b[text()='Southern Railway']")).getText());
		
	}
}
