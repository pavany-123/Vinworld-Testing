package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class refresh {

	@Test
	public void demo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Best of Action Toys']"));
		
		
		//Typecasting
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//refresh
		js.executeScript("history.go(0)");
		Thread.sleep(5000);
		
		
		//get title
		System.out.println(js.executeScript("return document.title"));
		
		//get URL
		System.out.println(js.executeScript("return document.URL"));
		
	}
	
}
