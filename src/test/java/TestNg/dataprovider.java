package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	@DataProvider
	public Object[][] getdata() {
		Object[][] a=new Object[3][2];
		a[0][0]="paava";
		a[0][1]="paavsdfsda";
		
		a[1][0]="212121212";
		a[1][1]="1212121212";
		
		a[2][0]="paa2323@@##va";
		a[2][1]="paavsdfsds2323@@###$sda";
		return a;
	}
	
	@Test(dataProvider = "getdata")
	public void test1(String user, String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}

}
