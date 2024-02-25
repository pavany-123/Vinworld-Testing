package DataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test0 {
	
	@Test
	public void demo() throws SQLException {
		//step1 :- Register to the database
		Driver driverrf=new Driver();
		DriverManager.deregisterDriver(driverrf);
		
		//Step2 :- Connect to Database
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seleniumtesting", "root","root");
				
				//Step3 :- Create Sql Query statement
				Statement statement = con.createStatement();
				String query="select * from logindetails";
				
				//step4 :- excecute query
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/login/");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				ResultSet result = statement.executeQuery(query);
				while(result.next()) {
					System.out.println(result.getString(1));
					System.out.println(result.getString(2));
					driver.findElement(By.id("email")).sendKeys(result.getString(1));
					driver.findElement(By.id("pass")).sendKeys(result.getString(2));
				}
				
				
				
				
				
				
				
				//Step 5 :- close the connection of database
				con.close();
	}

}
