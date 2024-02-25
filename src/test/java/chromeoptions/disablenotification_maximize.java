package chromeoptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class disablenotification_maximize {
	@Test
	public void demo() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		//maximized
		options.addArguments("start-maximized");
		
		//print chrome vesrion
		options.addArguments("--version");
		System.out.println(options);
		
		//disables notifications
		options.addArguments("--disable-notifications");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
