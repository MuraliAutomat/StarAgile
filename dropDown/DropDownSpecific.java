package dropDown;
//3. Write a WebDriver script to handle a drop-down and select an option based on specific criteria.

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownSpecific {

	@Test
	public void dropDownSpecific() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tssouthernpower.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Closing home page default notification
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		//Menu
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		//Selecting "Board Of Directors" option from drop-down
		driver.findElement(By.xpath("//a[text()='Board Of Directors']")).click();

	}

}


