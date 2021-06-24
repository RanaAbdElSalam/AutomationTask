package Tests;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Pages.RegistrationPage;

public class RegistrationTest {


	RegistrationPage registrationObject;
	
@Test
	public void createAccountTest() throws InterruptedException, IOException {
			
			
		registrationObject = new RegistrationPage();
		String title = registrationObject.createAccountMethod();
		
		assertEquals(title, "MY ACCOUNT");
		
	}


	
}
