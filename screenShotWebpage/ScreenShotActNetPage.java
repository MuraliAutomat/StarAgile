package screenShotWebpage;
//5. Write a WebDriver script to capture a screenshot of a web-page and save it to a specific location

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotActNetPage {
@Test
	public void screenShotActNetPage() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actcorp.in");

	TakesScreenshot screen = (TakesScreenshot)driver;
	File source = screen.getScreenshotAs(OutputType.FILE);
	File location = new File("./Screenshot/image.jpg");
	FileUtils.copyFile(source, location);
	System.out.println("ACT Net Webpage Screenshot captured succesfully.");
	
	driver.quit();
		
	}

}
