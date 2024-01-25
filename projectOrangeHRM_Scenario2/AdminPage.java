package projectOrangeHRM_Scenario2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {                   // Admin Page class

	private WebDriver driver;             // Encapsulation

	AdminPage(WebDriver d){              //Constructor (driver initialization)
		driver =d;
	}
	//elements location
	//By menuList = By.xpath("//*[@class='oxd-main-menu']");
	By menuList = By.xpath("//div[@class='oxd-sidepanel-body']");

	//elements identification methods
	public void menuListOptions () {
		List<WebElement> list = driver.findElements(menuList);

		for(WebElement menulist : list) {
			System.out.println(menulist.getText());

			if(menulist.getText().contains("Admin")) {
				menulist.click();
			}
		}
	}

	//elements location
	By admin = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");
	By usernameTextBox = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By searchButton = By.xpath("//button[@type='submit']");
	By totalRecords = By.xpath("//span[@class='oxd-text oxd-text--span']");
	By resetButton = By.xpath("(//button[@type='button'])[4]");

	//elements identification methods
	public void searchByUserName(String uname) {
		driver.findElement(admin).click();
		driver.findElement(usernameTextBox).sendKeys(uname);
		driver.findElement(searchButton).click();
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(totalRecords));
		System.out.println("Total Records by UserName: "+driver.findElement(totalRecords).getText());
		driver.findElement(resetButton).click();
		System.out.println("Total Records by UserName after Refresh: "+driver.findElement(totalRecords).getText());
	}

	//elements location
	By userRoleButton = By.xpath("(//div[@class='oxd-select-text--after'])[1]");
	By roleList = By.xpath("//div[@role='listbox']");

	//elements identification methods
	public void searchByUserRole(String rName) {
		driver.findElement(userRoleButton).click();
		List<WebElement> rolelist = driver.findElements(roleList);
		for(WebElement list : rolelist) {
			//System.out.println(list.getText());
			if(list.getText().contains(rName)) {
				list.click();
			}
		}
		driver.findElement(searchButton).click();
		System.out.println("Total Records by UserRole: "+driver.findElement(totalRecords).getText());
		driver.findElement(resetButton).click();
		System.out.println("Total Records by UserRole after Refresh: "+driver.findElement(totalRecords).getText());
	}

	//elements location
	By statusButton = By.xpath("(//div[@class='oxd-select-text--after'])[2]");
	By statusList = By.xpath("//div[@role='listbox']");

	//elements identification methods
	public void searchByUserStatus(String sName){
		driver.findElement(statusButton).click();
		List<WebElement> statuslist = driver.findElements(statusList);
		for(WebElement list : statuslist) {
			//System.out.println(list.getText());
			if(list.getText().contains(sName)) {
				list.click();
			}
		}
		driver.findElement(searchButton).click();
		System.out.println("Total Records by UserStatus(enabled): "+driver.findElement(totalRecords).getText());
		driver.findElement(resetButton).click();
		System.out.println("Total Records by UserStatus(enabled) after Refresh: "+driver.findElement(totalRecords).getText());
	}
}

