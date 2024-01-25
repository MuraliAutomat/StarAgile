package projectOrangeHRM_Scenario1;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ITestListenerClass extends OrangeHrmLog implements ITestListener {

	@Override 
	public void onTestFailure(ITestResult result) {
		
		//captureScreenshot(driver, result.getTestName()+"Failed.jpg");
		captureScreenshot(result.getMethod().getMethodName()+"Failed.jpg");
		
		
		
 }

}

