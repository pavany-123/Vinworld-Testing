package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Group {
	
	@BeforeMethod(alwaysRun = true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void createcustomer() {
		Reporter.log("create",true);
	}
	
	@Test(groups = "deletecustomer")
	public void deletecustomer() {
		Reporter.log("delete",true);
	}

}
