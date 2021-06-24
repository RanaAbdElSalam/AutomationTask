package Pages;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends Page_Base {


	
	public String createAccountMethod() throws InterruptedException, IOException {
		

		WebDriver driver = webDriver();
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);		
		driver.get("http://automationpractice.com/index.php");
	
		WebElement signInSection = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
		clickButton(signInSection);
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);		
		WebElement emailField = driver.findElement(By.id("email_create"));
		setTextElementText(emailField , "rana.1995@hotmail.com");
		
		WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
		clickButton(createAccountButton);
		
		WebDriverWait wait = new WebDriverWait(driver, 60); 
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"customer_firstname\\\"]")));
		
		WebElement firstNameField = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		setTextElementText(firstNameField , "Rana");
	
		WebElement lastNameField = driver.findElement(By.id("customer_lastname"));
		setTextElementText(lastNameField , "Omar");
		
		WebElement passwordField = driver.findElement(By.id("passwd"));
		setTextElementText(passwordField , "12345678");

		scrollToBottom();
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);		
	
		
//		WebElement addressFNField = driver.findElement(By.id("firstname"));
//		setTextElementText(addressFNField , "Rana");
//		
//		WebElement addressLNField = driver.findElement(By.id("lastname"));
//		setTextElementText(addressLNField , "Omar");
		
		WebElement addressField = driver.findElement(By.id("address1"));
		setTextElementText(addressField , "Address Test");
	
		WebElement addressCityField = driver.findElement(By.id("city"));
		setTextElementText(addressCityField , "California");
	
		WebElement stateDropdown = driver.findElement(By.id("id_state"));
		selectlist("California" , stateDropdown );
		
		WebElement postalCodeField = driver.findElement(By.id("postcode"));
		setTextElementText(addressCityField , "11111");
		
		WebElement countryDropdown = driver.findElement(By.id("id_country"));
		selectlist("21" , countryDropdown );
	
		WebElement mobileField = driver.findElement(By.id("phone_mobile"));
		setTextElementText(mobileField , "123456789");
		
//		WebElement address2Field = driver.findElement(By.id("alias"));
//		setTextElementText(address2Field , "Address Test 2");
		
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);		
	
		WebElement registerButton = driver.findElement(By.id("submitAccount"));
		clickButton(registerButton);
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);		

		String myAccTitle = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1")).getText();
		System.out.println(myAccTitle);
		
		
		return myAccTitle;

	}
	
}

