package projectOrangeHRM_Scenario2;

import org.testng.annotations.Test;

public class AdminTest extends BaseOrangeHrm {
	/*TestCase1: Create testcase to get all 12 options from left side menu, 
	and print the count which should be 12 from that list click on Admin then Admin page get open.*/
  @Test(priority=1)
  public void getMenuOptions() {
	  logintest.verifyLoginFunction();
	  adminpage.menuListOptions();
  }
  
  /*TestCase2: Create test case for search For Existing Employee searchByUserName() : here send username Admin to username text box 
   and click on search button and display total record found and refresh page.*/
  @Test(priority=2)
  public void verifySearchByUserName() {
	  adminpage.searchByUserName("Admin");
  }
  
  /*TestCase3: Create test case for search For Existing Employee searchByUserRole() : here automate dropdown and select Role Admin 
   and click on search button and display total record found and refresh page. */
   @Test(priority=3)
   public void verifySearchByUserRole() {
		  adminpage.searchByUserRole("Admin");
	  }
   
  /*TestCase4: Create test case for search For Existing Employee searchByUserStatus() : here automate dropdown 
    and select status Enabled or Disabled then click on search button and display total record found.*/
   @Test(priority=4)
   public void verifySearchByUserStatus() {
	   adminpage.searchByUserStatus("Enabled");
   }
  
}
