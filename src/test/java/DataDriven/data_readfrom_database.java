package DataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class data_readfrom_database {
	
	@Test
	public void demo() throws SQLException {
		//step1 :- Register to the database
		
		Driver driverrf=new Driver();
		
		//Driver driverrf=new Driver();
		//DriverManager.deregisterDriver(driverrf);
		
		//Step2 :- Connect to Database
		Connection con = DriverManager.getConnection("mysql://localhost:3306/seleniumtesting", "root","root");
		
		//Step3 :- Create Sql Query statement
		Statement statement = con.createStatement();
		String query="select * from logindetails";
		
		//step4 :- excecute query
		ResultSet result = statement.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
		}
		
		//Step 5 :- close the connection of database
		con.close();
	}

}
