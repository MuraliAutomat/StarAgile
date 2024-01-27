package devOps_SeleGrid_Docker_Jenkins_GitHub;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting_Docker {
	WebDriver driver;

	@Parameters({"bname"})
	@Test
	public void crossBrowserTest(String bname) throws MalformedURLException, URISyntaxException, InterruptedException{
		if(bname.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(), options);
			System.out.println("Established connectivity with Browser Chrome");
		}
		if(bname.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(), options);
			System.out.println("Established connectivity with Browser Firefox");
		}
		if(bname.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(), options);
			System.out.println("Established connectivity with Browser Edge");
		}
		Thread.sleep(5000);
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		System.out.println("!! Application Parallel Execution !!");
	}
}
