package projectOrangeHRM_Scenario2;

import org.testng.annotations.Test;

//Login TestCase
public class LoginTest extends BaseOrangeHrm {
	@Test(priority=1)
	public  void verifyLoginFunction() {
		loginpage.loginFunction("Admin", "admin123");
	}
	@Test(priority=2)
	public void verifyAppTitle() {
		loginpage.getApplicationTitle( );
	}
}
