package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("on Test starts",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("on Test success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("on Test failue",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("on Test skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);
	}
	
	

}
