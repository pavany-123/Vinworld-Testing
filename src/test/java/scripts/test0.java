package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test0 {
	
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		Reporter.log("Hello java", true);
	}

}
