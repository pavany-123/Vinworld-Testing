package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class customwait {
	@Test
	public void demo1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		
		//custom wait
		while(true) {
			try {
				driver.findElement(By.id("nav-search-submit-button")).click();
				break;
			}
			catch(Exception e) {
				System.out.println("element not found");
			}
			
		}
		
		
		//syntax for Version 3
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Syntax for Version 4
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
