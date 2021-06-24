package Tests;

import org.testng.annotations.Test;

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
import Pages.AddingToCartPage;
import Pages.RegistrationPage;


public class AddingToCartTest {
	
	AddingToCartPage addingToCartObject;
	
	@Test
	public void addingToCartTest() throws InterruptedException, IOException {
		
		
		addingToCartObject = new AddingToCartPage();
		String[] pricesList = addingToCartObject.addingToCartMethod();
		
		String itemPrice = pricesList[0];
		String totalProductsPrice = pricesList[1];
		
		assertEquals(totalProductsPrice, itemPrice);
		
	}

	
	
	

}
