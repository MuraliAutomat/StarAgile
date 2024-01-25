package codenBoxRegistration;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationFormValidation {          // rest all TestCases
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void registrationForm() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//FirstName missed -- TestCase 2
		driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys(" ");                //First Name missed
		driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys("Krishna");
		driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys("muraliwings11@gmail.com");
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='manual-web-automation-selenium']")).click();
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='october']")).click();
		driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-5']")).click();
		driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[text()='Your registration is completed. We will contact with you soon. Thank you !']")).getText());
		String actualUN = driver.findElement(By.xpath("//input[@id='nf-field-17']")).getText();
		String expectedUN ="Something";
		softassert.assertEquals(actualUN, expectedUN, "FirstName Mandatory");
		
		//LastName missed -- TestCase 3
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys("Murali");
		driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys(" ");              //Last Name missed
		driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys("muraliwings12@gmail.com");
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='manual-web-automation-selenium']")).click();
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='october']")).click();
		driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-5']")).click();
		driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[text()='Your registration is completed. We will contact with you soon. Thank you !']")).getText());
		String actualLN = driver.findElement(By.xpath("//input[@id='nf-field-18']")).getText();
		String expectedLN ="Something";
		softassert.assertEquals(actualLN, expectedLN, "LastName Mandatory");
		
		//Email-ID missed -- TestCase 4
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys(" ");             // Email-ID missed
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='manual-web-automation-selenium']")).click();
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='october']")).click();
		driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-5']")).click();
		driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[text()='Your registration is completed. We will contact with you soon. Thank you !']")).getText());
		String actualEID = driver.findElement(By.xpath("//input[@id='nf-field-18']")).getText();
		String expectedEID ="Something";
		softassert.assertEquals(actualEID, expectedEID, "Email ID Mandatory");
		
		//Course selection missed -- TestCase 5
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys("Naresh");
		driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys("Raja");
		driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys("muraliwings13@gmail.com");
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='manual-web-automation-selenium']"));     //Course not selected
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='october']")).click();
		driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-5']")).click();
		driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[text()='Your registration is completed. We will contact with you soon. Thank you !']")).getText());
		boolean actualCourse = driver.findElement(By.xpath("//option[@value='manual-web-automation-selenium']")).isSelected();
		boolean expectedCourse = true;
		softassert.assertEquals(actualCourse, expectedCourse, "Course selection Mandatory");
		
		//About us?(radio button)? missed -- TestCase 6
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys("Rakesh");
		driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys("muraliwings14@gmail.com");
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='manual-web-automation-selenium']")).click();
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='october']"));    //not mandatory
		driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-5']"));                   //Radio button not selected
		driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[text()='Your registration is completed. We will contact with you soon. Thank you !']")).getText());
		boolean actualRadio = driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-5']")).isSelected();
		softassert.assertTrue(actualRadio, "How do you know about us? is Mandatory");
		
		//Dummy
		driver.get("https://codenboxautomationlab.com/registration-form/");
		driver.findElement(By.xpath("//input[@id='nf-field-17']")).sendKeys("Nandini");
		driver.findElement(By.xpath("//input[@id='nf-field-18']")).sendKeys("Karna");
		driver.findElement(By.xpath("//input[@id='nf-field-19']")).sendKeys("muraliwings15@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='manual-web-automation-selenium']")).click();
		driver.findElement(By.xpath("(//div[@class='nf-field-element'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='october']"));    //not mandatory
		driver.findElement(By.xpath("//label[@id='nf-label-class-field-23-5']")).click();                   
		driver.findElement(By.xpath("//input[@id='nf-field-15']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Your registration is completed. We will contact with you soon. Thank you !']")).getText());

		driver.quit();
		softassert.assertAll();
	}
}
